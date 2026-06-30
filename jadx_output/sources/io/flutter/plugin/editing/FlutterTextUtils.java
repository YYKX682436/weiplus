package io.flutter.plugin.editing;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes15.dex */
public class FlutterTextUtils {
    public static final int CANCEL_TAG = 917631;
    public static final int CARRIAGE_RETURN = 13;
    public static final int COMBINING_ENCLOSING_KEYCAP = 8419;
    public static final int LINE_FEED = 10;
    public static final int ZERO_WIDTH_JOINER = 8205;
    private final io.flutter.embedding.engine.FlutterJNI flutterJNI;

    public FlutterTextUtils(io.flutter.embedding.engine.FlutterJNI flutterJNI) {
        this.flutterJNI = flutterJNI;
    }

    public int getOffsetAfter(java.lang.CharSequence charSequence, int i17) {
        int charCount;
        int length = charSequence.length();
        int i18 = length - 1;
        if (i17 >= i18) {
            return length;
        }
        int codePointAt = java.lang.Character.codePointAt(charSequence, i17);
        int charCount2 = java.lang.Character.charCount(codePointAt);
        int i19 = i17 + charCount2;
        int i27 = 0;
        if (i19 == 0) {
            return 0;
        }
        if (codePointAt == 10) {
            if (java.lang.Character.codePointAt(charSequence, i19) == 13) {
                charCount2++;
            }
            return i17 + charCount2;
        }
        if (isRegionalIndicatorSymbol(codePointAt)) {
            if (i19 >= i18 || !isRegionalIndicatorSymbol(java.lang.Character.codePointAt(charSequence, i19))) {
                return i19;
            }
            int i28 = i17;
            while (i28 > 0 && isRegionalIndicatorSymbol(java.lang.Character.codePointBefore(charSequence, i17))) {
                i28 -= java.lang.Character.charCount(java.lang.Character.codePointBefore(charSequence, i17));
                i27++;
            }
            if (i27 % 2 == 0) {
                charCount2 += 2;
            }
            return i17 + charCount2;
        }
        if (isKeycapBase(codePointAt)) {
            charCount2 += java.lang.Character.charCount(codePointAt);
        }
        if (codePointAt == 8419) {
            int codePointBefore = java.lang.Character.codePointBefore(charSequence, i19);
            int charCount3 = i19 + java.lang.Character.charCount(codePointBefore);
            if (charCount3 < length && isVariationSelector(codePointBefore)) {
                int codePointAt2 = java.lang.Character.codePointAt(charSequence, charCount3);
                if (isKeycapBase(codePointAt2)) {
                    charCount2 += java.lang.Character.charCount(codePointBefore) + java.lang.Character.charCount(codePointAt2);
                }
            } else if (isKeycapBase(codePointBefore)) {
                charCount2 += java.lang.Character.charCount(codePointBefore);
            }
            return i17 + charCount2;
        }
        if (isEmoji(codePointAt)) {
            boolean z17 = false;
            int i29 = 0;
            do {
                if (z17) {
                    charCount2 += java.lang.Character.charCount(codePointAt) + i29 + 1;
                    z17 = false;
                }
                if (isEmojiModifier(codePointAt)) {
                    break;
                }
                if (i19 < length) {
                    codePointAt = java.lang.Character.codePointAt(charSequence, i19);
                    i19 += java.lang.Character.charCount(codePointAt);
                    if (codePointAt != 8419) {
                        if (!isEmojiModifier(codePointAt)) {
                            if (!isVariationSelector(codePointAt)) {
                                if (codePointAt == 8205) {
                                    codePointAt = java.lang.Character.codePointAt(charSequence, i19);
                                    i19 += java.lang.Character.charCount(codePointAt);
                                    if (i19 >= length || !isVariationSelector(codePointAt)) {
                                        i29 = 0;
                                    } else {
                                        codePointAt = java.lang.Character.codePointAt(charSequence, i19);
                                        int charCount4 = java.lang.Character.charCount(codePointAt);
                                        i19 += java.lang.Character.charCount(codePointAt);
                                        i29 = charCount4;
                                    }
                                    z17 = true;
                                    if (i19 < length || !z17) {
                                        break;
                                        break;
                                    }
                                }
                            } else {
                                charCount = java.lang.Character.charCount(codePointAt);
                            }
                        } else {
                            charCount = java.lang.Character.charCount(codePointAt);
                        }
                        charCount2 += charCount + 0;
                        break;
                    }
                    int codePointBefore2 = java.lang.Character.codePointBefore(charSequence, i19);
                    int charCount5 = i19 + java.lang.Character.charCount(codePointBefore2);
                    if (charCount5 < length && isVariationSelector(codePointBefore2)) {
                        int codePointAt3 = java.lang.Character.codePointAt(charSequence, charCount5);
                        if (isKeycapBase(codePointAt3)) {
                            charCount2 += java.lang.Character.charCount(codePointBefore2) + java.lang.Character.charCount(codePointAt3);
                        }
                    } else if (isKeycapBase(codePointBefore2)) {
                        charCount2 += java.lang.Character.charCount(codePointBefore2);
                    }
                    return i17 + charCount2;
                }
                i29 = 0;
                if (i19 < length) {
                    break;
                }
            } while (isEmoji(codePointAt));
        }
        return i17 + charCount2;
    }

    public int getOffsetBefore(java.lang.CharSequence charSequence, int i17) {
        int codePointBefore;
        int charCount;
        int charCount2;
        int i18 = 0;
        int i19 = 1;
        if (i17 <= 1 || (charCount2 = i17 - (charCount = java.lang.Character.charCount((codePointBefore = java.lang.Character.codePointBefore(charSequence, i17))))) == 0) {
            return 0;
        }
        if (codePointBefore == 10) {
            if (java.lang.Character.codePointBefore(charSequence, charCount2) == 13) {
                charCount++;
            }
            return i17 - charCount;
        }
        if (isRegionalIndicatorSymbol(codePointBefore)) {
            int codePointBefore2 = java.lang.Character.codePointBefore(charSequence, charCount2);
            int charCount3 = charCount2 - java.lang.Character.charCount(codePointBefore2);
            while (charCount3 > 0 && isRegionalIndicatorSymbol(codePointBefore2)) {
                codePointBefore2 = java.lang.Character.codePointBefore(charSequence, charCount3);
                charCount3 -= java.lang.Character.charCount(codePointBefore2);
                i19++;
            }
            if (i19 % 2 == 0) {
                charCount += 2;
            }
            return i17 - charCount;
        }
        if (codePointBefore == 8419) {
            int codePointBefore3 = java.lang.Character.codePointBefore(charSequence, charCount2);
            int charCount4 = charCount2 - java.lang.Character.charCount(codePointBefore3);
            if (charCount4 > 0 && isVariationSelector(codePointBefore3)) {
                int codePointBefore4 = java.lang.Character.codePointBefore(charSequence, charCount4);
                if (isKeycapBase(codePointBefore4)) {
                    charCount += java.lang.Character.charCount(codePointBefore3) + java.lang.Character.charCount(codePointBefore4);
                }
            } else if (isKeycapBase(codePointBefore3)) {
                charCount += java.lang.Character.charCount(codePointBefore3);
            }
            return i17 - charCount;
        }
        if (codePointBefore == 917631) {
            codePointBefore = java.lang.Character.codePointBefore(charSequence, charCount2);
            int charCount5 = java.lang.Character.charCount(codePointBefore);
            while (true) {
                charCount2 -= charCount5;
                if (charCount2 <= 0 || !isTagSpecChar(codePointBefore)) {
                    break;
                }
                charCount += java.lang.Character.charCount(codePointBefore);
                codePointBefore = java.lang.Character.codePointBefore(charSequence, charCount2);
                charCount5 = java.lang.Character.charCount(codePointBefore);
            }
            if (!isEmoji(codePointBefore)) {
                return i17 - 2;
            }
            charCount += java.lang.Character.charCount(codePointBefore);
        }
        if (isVariationSelector(codePointBefore)) {
            codePointBefore = java.lang.Character.codePointBefore(charSequence, charCount2);
            if (!isEmoji(codePointBefore)) {
                return i17 - charCount;
            }
            charCount += java.lang.Character.charCount(codePointBefore);
            charCount2 -= charCount;
        }
        if (isEmoji(codePointBefore)) {
            boolean z17 = false;
            int i27 = 0;
            while (true) {
                if (z17) {
                    charCount += java.lang.Character.charCount(codePointBefore) + i27 + 1;
                    z17 = false;
                }
                if (isEmojiModifier(codePointBefore)) {
                    int codePointBefore5 = java.lang.Character.codePointBefore(charSequence, charCount2);
                    int charCount6 = charCount2 - java.lang.Character.charCount(codePointBefore5);
                    if (charCount6 > 0 && isVariationSelector(codePointBefore5)) {
                        codePointBefore5 = java.lang.Character.codePointBefore(charSequence, charCount6);
                        if (!isEmoji(codePointBefore5)) {
                            return i17 - charCount;
                        }
                        i18 = java.lang.Character.charCount(codePointBefore5);
                        java.lang.Character.charCount(codePointBefore5);
                    }
                    if (isEmojiModifierBase(codePointBefore5)) {
                        charCount += i18 + java.lang.Character.charCount(codePointBefore5);
                    }
                } else {
                    if (charCount2 > 0) {
                        codePointBefore = java.lang.Character.codePointBefore(charSequence, charCount2);
                        charCount2 -= java.lang.Character.charCount(codePointBefore);
                        if (codePointBefore == 8205) {
                            codePointBefore = java.lang.Character.codePointBefore(charSequence, charCount2);
                            charCount2 -= java.lang.Character.charCount(codePointBefore);
                            if (charCount2 <= 0 || !isVariationSelector(codePointBefore)) {
                                i27 = 0;
                            } else {
                                codePointBefore = java.lang.Character.codePointBefore(charSequence, charCount2);
                                int charCount7 = java.lang.Character.charCount(codePointBefore);
                                charCount2 -= java.lang.Character.charCount(codePointBefore);
                                i27 = charCount7;
                            }
                            z17 = true;
                            if (charCount2 != 0 || !z17 || !isEmoji(codePointBefore)) {
                                break;
                                break;
                            }
                        }
                    }
                    i27 = 0;
                    if (charCount2 != 0) {
                        break;
                    }
                }
            }
        }
        return i17 - charCount;
    }

    public boolean isEmoji(int i17) {
        return this.flutterJNI.isCodePointEmoji(i17);
    }

    public boolean isEmojiModifier(int i17) {
        return this.flutterJNI.isCodePointEmojiModifier(i17);
    }

    public boolean isEmojiModifierBase(int i17) {
        return this.flutterJNI.isCodePointEmojiModifierBase(i17);
    }

    public boolean isKeycapBase(int i17) {
        return (48 <= i17 && i17 <= 57) || i17 == 35 || i17 == 42;
    }

    public boolean isRegionalIndicatorSymbol(int i17) {
        return this.flutterJNI.isCodePointRegionalIndicator(i17);
    }

    public boolean isTagSpecChar(int i17) {
        return 917536 <= i17 && i17 <= 917630;
    }

    public boolean isVariationSelector(int i17) {
        return this.flutterJNI.isCodePointVariantSelector(i17);
    }
}
