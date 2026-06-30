package k35;

/* loaded from: classes15.dex */
public abstract class s {
    public static java.lang.CharSequence a(java.lang.CharSequence charSequence, android.text.format.Time time) {
        int i17;
        int i18;
        java.lang.String aMPMString;
        java.lang.String monthString;
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(charSequence);
        int length = charSequence.length();
        boolean z17 = false;
        int i19 = 0;
        while (i19 < length) {
            char charAt = spannableStringBuilder.charAt(i19);
            int i27 = 1;
            boolean z18 = true;
            if (charAt == '\'') {
                int i28 = i19 + 1;
                if (i28 >= length || spannableStringBuilder.charAt(i28) != '\'') {
                    spannableStringBuilder.delete(i19, i28);
                    int i29 = length - 1;
                    i27 = z17 ? 1 : 0;
                    int i37 = i19;
                    while (i37 < i29) {
                        if (spannableStringBuilder.charAt(i37) == '\'') {
                            int i38 = i37 + 1;
                            if (i38 >= i29 || spannableStringBuilder.charAt(i38) != '\'') {
                                spannableStringBuilder.delete(i37, i38);
                                break;
                            }
                            spannableStringBuilder.delete(i37, i38);
                            i29--;
                            i27++;
                            i37 = i38;
                        } else {
                            i37++;
                            i27++;
                        }
                    }
                } else {
                    spannableStringBuilder.delete(i19, i28);
                }
                length = spannableStringBuilder.length();
            } else {
                int i39 = 1;
                while (true) {
                    i17 = i19 + i39;
                    if (i17 >= length || spannableStringBuilder.charAt(i17) != charAt) {
                        break;
                    }
                    i39++;
                }
                if (charAt != 'A') {
                    if (charAt == 'E') {
                        i18 = i19;
                        aMPMString = android.text.format.DateUtils.getDayOfWeekString(time.weekDay + 1, i39 >= 4 ? 10 : 20);
                    } else if (charAt == 'a') {
                        i18 = i19;
                        aMPMString = android.text.format.DateUtils.getAMPMString(time.hour < 12 ? z17 ? 1 : 0 : 1);
                    } else if (charAt == 'd') {
                        i18 = i19;
                        aMPMString = b(time.monthDay, i39);
                    } else if (charAt == 'h') {
                        i18 = i19;
                        int i47 = time.hour;
                        if (i47 == 0) {
                            i47 = 12;
                        }
                        if (i47 > 12) {
                            i47 -= 12;
                        }
                        aMPMString = "" + i47;
                    } else if (charAt == 'k') {
                        i18 = i19;
                        aMPMString = b(time.hour, i39);
                    } else if (charAt == 'm') {
                        i18 = i19;
                        aMPMString = b(time.minute, i39);
                    } else if (charAt != 's') {
                        if (charAt == 'L' || charAt == 'M') {
                            i18 = i19;
                            int i48 = time.month;
                            monthString = i39 >= 4 ? android.text.format.DateUtils.getMonthString(i48, 10) : i39 == 3 ? android.text.format.DateUtils.getMonthString(i48, 20) : b(i48 + 1, i39);
                        } else if (charAt == 'y') {
                            i18 = i19;
                            int i49 = time.year;
                            monthString = i39 <= 2 ? b(i49 % 100, 2) : java.lang.String.format(java.util.Locale.getDefault(), "%d", java.lang.Integer.valueOf(i49));
                        } else if (charAt != 'z') {
                            aMPMString = null;
                            i18 = i19;
                        } else {
                            java.util.TimeZone timeZone = java.util.TimeZone.getDefault();
                            timeZone.inDaylightTime(new java.util.Date(time.toMillis(z17)));
                            if (i39 < 2) {
                                long rawOffset = (timeZone.getRawOffset() + time.gmtoff) / 1000;
                                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                                if (rawOffset < 0) {
                                    sb6.insert(z17 ? 1 : 0, "-");
                                    rawOffset = -rawOffset;
                                } else {
                                    sb6.insert(z17 ? 1 : 0, "+");
                                }
                                i18 = i19;
                                sb6.append(b((int) (rawOffset / 3600), 2));
                                sb6.append(b((int) ((rawOffset % 3600) / 60), 2));
                                aMPMString = sb6.toString();
                                z17 = false;
                            } else {
                                i18 = i19;
                                if (time.isDst != 0) {
                                    z17 = false;
                                } else {
                                    z17 = false;
                                    z18 = false;
                                }
                                monthString = timeZone.getDisplayName(z18, z17 ? 1 : 0);
                            }
                        }
                        aMPMString = monthString;
                    } else {
                        i18 = i19;
                        aMPMString = b(time.second, i39);
                    }
                } else {
                    i18 = i19;
                    aMPMString = android.text.format.DateUtils.getAMPMString(time.hour < 12 ? z17 ? 1 : 0 : 1);
                }
                i19 = i18;
                if (aMPMString != null) {
                    spannableStringBuilder.replace(i19, i17, (java.lang.CharSequence) aMPMString);
                    i27 = aMPMString.length();
                    length = spannableStringBuilder.length();
                } else {
                    i27 = i39;
                }
            }
            i19 += i27;
        }
        return charSequence instanceof android.text.Spanned ? new android.text.SpannedString(spannableStringBuilder) : spannableStringBuilder.toString();
    }

    public static java.lang.String b(int i17, int i18) {
        if (i18 != 2) {
            return java.lang.String.format(java.util.Locale.getDefault(), "%0" + i18 + "d", java.lang.Integer.valueOf(i17));
        }
        if (i17 < 10) {
            return "0" + i17;
        }
        return i17 + "";
    }
}
