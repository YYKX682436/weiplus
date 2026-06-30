package sb;

/* loaded from: classes.dex */
public abstract class h {
    static {
        java.util.regex.Pattern.compile("^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");
    }

    public static java.lang.String a(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str2)) {
            return str;
        }
        if (android.util.Patterns.IP_ADDRESS.matcher(str).matches()) {
            return str + ":" + str2;
        }
        boolean contains = str.contains("::");
        boolean z17 = false;
        if ((!contains || str.indexOf("::") == str.lastIndexOf("::")) && ((!str.startsWith(":") || str.startsWith("::")) && (!str.endsWith(":") || str.endsWith("::")))) {
            java.lang.String[] split = str.split(":");
            if (contains) {
                java.util.ArrayList arrayList = new java.util.ArrayList(java.util.Arrays.asList(split));
                if (str.endsWith("::")) {
                    arrayList.add("");
                } else if (str.startsWith("::") && !arrayList.isEmpty()) {
                    arrayList.remove(0);
                }
                split = (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]);
            }
            if (split.length <= 8) {
                int i17 = 0;
                int i18 = 0;
                int i19 = 0;
                while (true) {
                    if (i17 < split.length) {
                        java.lang.String str3 = split[i17];
                        if (str3.length() == 0) {
                            i19++;
                            if (i19 > 1) {
                                break;
                            }
                        } else if (i17 == split.length - 1 && str3.contains(".")) {
                            if (!android.util.Patterns.IP_ADDRESS.matcher(str3).matches()) {
                                break;
                            }
                            i18 += 2;
                            i19 = 0;
                            i17++;
                        } else {
                            if (str3.length() > 4) {
                                break;
                            }
                            try {
                                int parseInt = java.lang.Integer.parseInt(str3, 16);
                                if (parseInt < 0 || parseInt > 65535) {
                                    break;
                                }
                                i19 = 0;
                            } catch (java.lang.NumberFormatException unused) {
                            }
                        }
                        i18++;
                        i17++;
                    } else if (i18 <= 8 && (i18 >= 8 || contains)) {
                        z17 = true;
                    }
                }
            }
        }
        if (!z17) {
            return str;
        }
        return "[" + str + "]:" + str2;
    }
}
