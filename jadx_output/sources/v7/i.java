package v7;

/* loaded from: classes7.dex */
public class i implements v7.c {
    public java.lang.String a(java.lang.String str) {
        int lastIndexOf = str.lastIndexOf(46);
        java.lang.String substring = (lastIndexOf == -1 || lastIndexOf <= str.lastIndexOf(47) || (lastIndexOf + 2) + 4 <= str.length()) ? "" : str.substring(lastIndexOf + 1, str.length());
        try {
            byte[] digest = java.security.MessageDigest.getInstance("MD5").digest(str.getBytes());
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            for (byte b17 : digest) {
                stringBuffer.append(java.lang.String.format("%02x", java.lang.Byte.valueOf(b17)));
            }
            java.lang.String stringBuffer2 = stringBuffer.toString();
            if (android.text.TextUtils.isEmpty(substring)) {
                return stringBuffer2;
            }
            return stringBuffer2 + "." + substring;
        } catch (java.security.NoSuchAlgorithmException e17) {
            throw new java.lang.IllegalStateException(e17);
        }
    }
}
