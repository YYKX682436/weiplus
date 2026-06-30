package sr5;

/* loaded from: classes13.dex */
public abstract class d {
    public static boolean a(java.lang.String str) {
        char charAt;
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        int indexOf = str.indexOf("\r\n\r\n");
        if (indexOf < 0) {
            or5.b.a("HttpDns not finish header recv", new java.lang.Object[0]);
            return false;
        }
        java.lang.String substring = str.substring(indexOf + 4);
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String[] split = str.split(com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE);
        for (int i17 = 1; i17 < split.length; i17++) {
            java.lang.String str2 = split[i17];
            int length = str2.length();
            int i18 = 0;
            while (i18 < str2.length() && java.lang.Character.isWhitespace(str2.charAt(i18))) {
                i18++;
            }
            int i19 = i18;
            while (i19 < length && (charAt = str2.charAt(i19)) != ':' && !java.lang.Character.isWhitespace(charAt)) {
                i19++;
            }
            int i27 = i19;
            while (i27 < length) {
                char charAt2 = str2.charAt(i27);
                i27++;
                if (charAt2 == ':') {
                    break;
                }
            }
            while (i27 < str2.length() && java.lang.Character.isWhitespace(str2.charAt(i27))) {
                i27++;
            }
            int length2 = str2.length();
            while (length2 > i27) {
                int i28 = length2 - 1;
                if (!java.lang.Character.isWhitespace(str2.charAt(i28))) {
                    break;
                }
                length2 = i28;
            }
            java.lang.String substring2 = str2.substring(i18, i19);
            if (i27 <= length2) {
                java.lang.String substring3 = str2.substring(i27, length2);
                java.lang.String lowerCase = substring2.toLowerCase();
                java.lang.String str3 = (java.lang.String) hashMap.get(lowerCase);
                if (str3 != null) {
                    substring3 = str3 + "," + substring3;
                }
                hashMap.put(lowerCase, substring3);
            }
        }
        java.lang.String str4 = (java.lang.String) hashMap.get("Content-Length".toLowerCase());
        or5.b.a("HttpDns Content-Length len:%s, recved body:%d", str4, java.lang.Integer.valueOf(substring.length()));
        if (str4 != null) {
            try {
                if (substring.length() == java.lang.Integer.parseInt(str4)) {
                    return true;
                }
            } catch (java.lang.Exception e17) {
                or5.b.b("exception: %s", e17);
            }
        }
        return false;
    }
}
