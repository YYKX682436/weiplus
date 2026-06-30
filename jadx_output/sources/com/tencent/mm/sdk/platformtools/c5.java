package com.tencent.mm.sdk.platformtools;

/* loaded from: classes14.dex */
public class c5 {
    public static java.lang.String a(java.lang.String str) {
        return com.tencent.mm.sdk.platformtools.t8.K0(str) ? "" : str.startsWith("+") ? str : "+".concat(str);
    }

    public static java.lang.String b(java.lang.String str, java.lang.String str2) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return "";
        }
        return str + "（+" + str2 + "）";
    }

    public static java.lang.String c(java.lang.String str) {
        int length;
        int i17;
        java.lang.String replace = h(str).replace("+", "");
        int i18 = 0;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(null)) {
            com.tencent.mm.sdk.platformtools.e5[] values = com.tencent.mm.sdk.platformtools.e5.values();
            int length2 = values.length;
            while (i18 < length2) {
                com.tencent.mm.sdk.platformtools.e5 e5Var = values[i18];
                if (replace.startsWith(e5Var.f192652e) && (length = replace.length() - e5Var.f192652e.length()) >= e5Var.f192653f && length <= e5Var.f192654g) {
                    throw null;
                }
                i18++;
            }
            return null;
        }
        com.tencent.mm.sdk.platformtools.e5[] values2 = com.tencent.mm.sdk.platformtools.e5.values();
        int length3 = values2.length;
        while (i18 < length3) {
            com.tencent.mm.sdk.platformtools.e5 e5Var2 = values2[i18];
            if (replace.startsWith(e5Var2.f192652e)) {
                int length4 = replace.length();
                java.lang.String str2 = e5Var2.f192652e;
                int length5 = length4 - str2.length();
                if (length5 >= e5Var2.f192653f && length5 <= (i17 = e5Var2.f192654g)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.PhoneFormater", "[extractCountryCode] countrycode:%s country isocode: %s country.minlen:%d country.maxlen:%d", str2, e5Var2.f192651d, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i17));
                    return str2;
                }
            }
            i18++;
        }
        return null;
    }

    public static java.lang.String e(java.lang.String str) {
        java.lang.String str2;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || !com.tencent.mm.sdk.platformtools.t8.Q0(str).booleanValue()) {
            return str;
        }
        com.tencent.mm.sdk.platformtools.c5 c5Var = new com.tencent.mm.sdk.platformtools.c5();
        if (str.startsWith("+")) {
            str = str.replace("+", "");
            str2 = c(str);
            if (str2 != null) {
                str = str.substring(str2.length());
            }
        } else {
            str2 = "86";
        }
        return c5Var.f(str2, str);
    }

    public static java.lang.String g(java.lang.String str) {
        return com.tencent.mm.sdk.platformtools.t8.K0(str) ? "" : str.replace("+", "");
    }

    public static java.lang.String h(java.lang.String str) {
        return com.tencent.mm.sdk.platformtools.t8.K0(str) ? "" : str.replaceAll("[\\.\\-\\ ]", "").trim();
    }

    public final java.lang.String d(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.util.regex.Matcher matcher = java.util.regex.Pattern.compile(str).matcher(str3);
        return matcher.find() ? matcher.replaceAll(str2) : str3;
    }

    public java.lang.String f(java.lang.String str, java.lang.String str2) {
        java.util.List<com.tencent.mm.sdk.platformtools.f5> list;
        com.tencent.mm.sdk.platformtools.e5[] e5VarArr;
        int i17;
        com.tencent.mm.sdk.platformtools.e5 e5Var;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && !com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mm.sdk.platformtools.e5[] values = com.tencent.mm.sdk.platformtools.e5.values();
            int length = values.length;
            int i18 = 0;
            while (i18 < length) {
                com.tencent.mm.sdk.platformtools.e5 e5Var2 = values[i18];
                if (e5Var2.f192652e != null && str.trim().toLowerCase().equals(e5Var2.f192652e.trim().toLowerCase()) && (list = e5Var2.f192655h) != null) {
                    java.lang.String h17 = h(str2);
                    if (h17 != null && h17.length() > e5Var2.f192653f) {
                        return h17;
                    }
                    for (com.tencent.mm.sdk.platformtools.f5 f5Var : list) {
                        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(f5Var.f192670a);
                        int i19 = e5Var2.f192654g;
                        java.lang.String str3 = f5Var.f192671b;
                        java.lang.String str4 = f5Var.f192672c;
                        if (!K0) {
                            e5VarArr = values;
                            i17 = length;
                            e5Var = e5Var2;
                            if (java.util.regex.Pattern.compile(f5Var.f192670a).matcher(h17).lookingAt()) {
                                java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                                stringBuffer.append(h17);
                                int length2 = h17.length();
                                while (stringBuffer.toString().length() < i19) {
                                    stringBuffer.append(h17.charAt(length2 - 1));
                                }
                                java.lang.String d17 = d(str4, str3, stringBuffer.toString());
                                int i27 = 0;
                                for (int i28 = 0; i28 < d17.length(); i28++) {
                                    char charAt = d17.charAt(i28);
                                    if (i27 >= length2) {
                                        d17 = d17.substring(0, i28);
                                    }
                                    if (charAt != ' ' && charAt != '-' && charAt != 12290) {
                                        i27++;
                                    }
                                }
                                return d17;
                            }
                        } else {
                            if (list.size() <= 1) {
                                java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer();
                                stringBuffer2.append(h17);
                                int length3 = h17.length();
                                while (stringBuffer2.toString().length() < i19) {
                                    stringBuffer2.append("0");
                                }
                                java.lang.String d18 = d(str4, str3, stringBuffer2.toString());
                                int i29 = 0;
                                for (int i37 = 0; i37 < d18.length(); i37++) {
                                    char charAt2 = d18.charAt(i37);
                                    if (i29 >= length3) {
                                        d18 = d18.substring(0, i37);
                                    }
                                    if (charAt2 != ' ' && charAt2 != '-' && charAt2 != 12290) {
                                        i29++;
                                    }
                                }
                                return d18;
                            }
                            java.lang.StringBuffer stringBuffer3 = new java.lang.StringBuffer();
                            stringBuffer3.append(h17);
                            int length4 = h17.length();
                            java.util.regex.Pattern compile = java.util.regex.Pattern.compile(str4);
                            e5VarArr = values;
                            i17 = length;
                            java.lang.String str5 = "1";
                            int i38 = 0;
                            while (i38 < i19 && !compile.matcher(str5).find()) {
                                str5 = str5 + "1";
                                i38++;
                                e5Var2 = e5Var2;
                            }
                            e5Var = e5Var2;
                            if (length4 <= i38 + 1) {
                                while (stringBuffer3.toString().length() < i19) {
                                    stringBuffer3.append("0");
                                }
                                java.lang.String d19 = d(str4, str3, stringBuffer3.toString());
                                int i39 = 0;
                                for (int i47 = 0; i47 < d19.length(); i47++) {
                                    char charAt3 = d19.charAt(i47);
                                    if (i39 >= length4) {
                                        d19 = d19.substring(0, i47);
                                    }
                                    if (charAt3 != ' ' && charAt3 != '-' && charAt3 != 12290) {
                                        i39++;
                                    }
                                }
                                return d19;
                            }
                        }
                        values = e5VarArr;
                        length = i17;
                        e5Var2 = e5Var;
                    }
                }
                i18++;
                values = values;
                length = length;
            }
        }
        return str2;
    }
}
