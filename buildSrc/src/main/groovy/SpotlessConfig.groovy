/*
 * Copyright (c) 2019 Connexta, LLC
 *
 * Released under the GNU Lesser General Public License version 3; see
 * https://www.gnu.org/licenses/lgpl-3.0.html
 */
/* Default Package */
class SpotlessConfig {

    static Closure getMarkdown(File license) {
        return {
            target "**/*.md", "**/.gitignore"
            targetExclude "**/README.md"

            licenseHeaderFile(license, "# License Delimiter")
            trimTrailingWhitespace()
            indentWithSpaces(4)
            endWithNewline()
        }
    }

    static Closure getYaml(File license) {
        return {
            target "**/*.yaml"

            licenseHeaderFile(license, "# License Delimiter")
            trimTrailingWhitespace()
            indentWithSpaces(4)
            endWithNewline()
        }
    }

    static Closure getJava(File license) {
        return {
            licenseHeaderFile(license)
            googleJavaFormat()
            removeUnusedImports()
            trimTrailingWhitespace()
        }
    }

    static Closure getGroovy(File license) {
        return {
            target "**/*.gradle", "**/*.groovy"

            licenseHeaderFile(license, "/\\* Build Script \\*/|/\\* Default Package \\*/|/\\* License Delimiter \\*/")
            trimTrailingWhitespace()
            indentWithSpaces(4)
            endWithNewline()
        }
    }
}
