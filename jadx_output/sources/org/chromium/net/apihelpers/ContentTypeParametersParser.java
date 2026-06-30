package org.chromium.net.apihelpers;

/* loaded from: classes13.dex */
final class ContentTypeParametersParser {
    private static final java.lang.String TOKEN_ALLOWED_SPECIAL_CHARS = "!#$%&'*+-.^_`|~";
    private int mCurrentPosition;
    private final java.lang.String mHeaderValue;

    /* loaded from: classes13.dex */
    public static class ContentTypeParametersParserException extends java.text.ParseException {
        public ContentTypeParametersParserException(java.lang.String str, int i17) {
            super(str, i17);
        }
    }

    public ContentTypeParametersParser(java.lang.String str) {
        this.mHeaderValue = str;
        int indexOf = str.indexOf(59);
        this.mCurrentPosition = indexOf != -1 ? indexOf + 1 : str.length();
    }

    private void advance() {
        if (!hasMore()) {
            throw new org.chromium.net.apihelpers.ContentTypeParametersParser.ContentTypeParametersParserException("End of header reached", this.mCurrentPosition);
        }
        this.mCurrentPosition++;
    }

    private char currentChar() {
        if (hasMore()) {
            return this.mHeaderValue.charAt(this.mCurrentPosition);
        }
        throw new org.chromium.net.apihelpers.ContentTypeParametersParser.ContentTypeParametersParserException("End of header reached", this.mCurrentPosition);
    }

    private java.lang.String getNextQuotedString() {
        int i17 = this.mCurrentPosition;
        if (currentChar() != '\"') {
            throw new org.chromium.net.apihelpers.ContentTypeParametersParser.ContentTypeParametersParserException("Not a quoted string: expected \" at " + this.mCurrentPosition + ": [" + this.mHeaderValue + "]", this.mCurrentPosition);
        }
        advance();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        while (true) {
            boolean z17 = false;
            while (hasMore()) {
                if (z17) {
                    if (!isQuotedPairChar(currentChar())) {
                        throw new org.chromium.net.apihelpers.ContentTypeParametersParser.ContentTypeParametersParserException("Invalid character at " + this.mCurrentPosition + ": [" + this.mHeaderValue + "]", this.mCurrentPosition);
                    }
                    sb6.append(currentChar());
                    advance();
                } else {
                    if (currentChar() == '\"') {
                        advance();
                        return sb6.toString();
                    }
                    if (currentChar() == '\\') {
                        advance();
                        z17 = true;
                    } else {
                        if (!isQdtextChar(currentChar())) {
                            throw new org.chromium.net.apihelpers.ContentTypeParametersParser.ContentTypeParametersParserException("Invalid character at " + this.mCurrentPosition + ": [" + this.mHeaderValue + "]", this.mCurrentPosition);
                        }
                        sb6.append(currentChar());
                        advance();
                    }
                }
            }
            throw new org.chromium.net.apihelpers.ContentTypeParametersParser.ContentTypeParametersParserException("Unterminated quoted string at " + i17 + ": [" + this.mHeaderValue + "]", i17);
        }
    }

    private java.lang.String getNextToken() {
        int i17 = this.mCurrentPosition;
        while (hasMore() && isTokenCharacter(currentChar())) {
            advance();
        }
        int i18 = this.mCurrentPosition;
        if (i17 != i18) {
            return this.mHeaderValue.substring(i17, i18);
        }
        throw new org.chromium.net.apihelpers.ContentTypeParametersParser.ContentTypeParametersParserException("Token not found at position " + i17 + ": [" + this.mHeaderValue + "]", i17);
    }

    private static boolean isAscii(char c17) {
        return c17 >= 0 && c17 <= 127;
    }

    private static boolean isQdtextChar(char c17) {
        return (c17 == '\\' || c17 == '\"' || !isQuotedPairChar(c17)) ? false : true;
    }

    private static boolean isQuotedPairChar(char c17) {
        return isWhitespace(c17) || ('!' <= c17 && c17 <= 255 && c17 != 127);
    }

    private static boolean isTokenCharacter(char c17) {
        return isAscii(c17) && (java.lang.Character.isLetterOrDigit(c17) || TOKEN_ALLOWED_SPECIAL_CHARS.indexOf(c17) != -1);
    }

    private static boolean isWhitespace(char c17) {
        return c17 == '\t' || c17 == ' ';
    }

    private void optionallySkipWhitespace() {
        while (hasMore() && isWhitespace(currentChar())) {
            advance();
        }
    }

    public java.util.Map.Entry<java.lang.String, java.lang.String> getNextParameter() {
        optionallySkipWhitespace();
        java.lang.String nextToken = getNextToken();
        if (currentChar() != '=') {
            throw new org.chromium.net.apihelpers.ContentTypeParametersParser.ContentTypeParametersParserException("Invalid parameter format: expected = at " + this.mCurrentPosition + ": [" + this.mHeaderValue + "]", this.mCurrentPosition);
        }
        advance();
        java.lang.String nextQuotedString = currentChar() == '\"' ? getNextQuotedString() : getNextToken();
        optionallySkipWhitespace();
        if (hasMore()) {
            if (currentChar() != ';') {
                throw new org.chromium.net.apihelpers.ContentTypeParametersParser.ContentTypeParametersParserException("Invalid parameter format: expected ; at " + this.mCurrentPosition + ": [" + this.mHeaderValue + "]", this.mCurrentPosition);
            }
            advance();
        }
        return new java.util.AbstractMap.SimpleEntry(nextToken, nextQuotedString);
    }

    public boolean hasMore() {
        return this.mCurrentPosition < this.mHeaderValue.length();
    }
}
