package x51;

/* loaded from: classes9.dex */
public abstract class k {
    public static java.lang.String a(java.lang.String str) {
        if (str == null || "".equals(str.trim())) {
            return str;
        }
        char[] charArray = str.toCharArray();
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (char c17 : charArray) {
            java.lang.String a17 = com.tencent.mm.platformtools.SpellMap.a(c17);
            if (a17 != null) {
                stringBuffer.append(a17);
            }
        }
        return stringBuffer.toString();
    }

    public static java.lang.String b(java.lang.String str) {
        java.lang.String a17;
        if (str == null || "".equals(str.trim())) {
            return str;
        }
        char[] charArray = str.toCharArray();
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        int length = charArray.length;
        for (int i17 = 0; i17 < length; i17++) {
            if (!java.lang.Character.isSpace(charArray[i17]) && (a17 = com.tencent.mm.platformtools.SpellMap.a(charArray[i17])) != null && a17.length() >= 1) {
                stringBuffer.append(a17.charAt(0));
            }
        }
        return stringBuffer.toString().toUpperCase();
    }
}
