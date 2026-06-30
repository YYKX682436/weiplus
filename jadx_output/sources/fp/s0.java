package fp;

/* loaded from: classes13.dex */
public abstract class s0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.BitSet f265237a = new java.util.BitSet(256);

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f265238b;

    static {
        for (int i17 = 97; i17 <= 122; i17++) {
            f265237a.set(i17);
        }
        for (int i18 = 65; i18 <= 90; i18++) {
            f265237a.set(i18);
        }
        for (int i19 = 48; i19 <= 57; i19++) {
            f265237a.set(i19);
        }
        java.util.BitSet bitSet = f265237a;
        bitSet.set(45);
        bitSet.set(95);
        bitSet.set(46);
        bitSet.set(42);
        f265238b = (java.lang.String) java.security.AccessController.doPrivileged(new fp.u("file.encoding"));
    }

    public static java.lang.String a(java.lang.String str) {
        try {
            return b(str, f265238b);
        } catch (java.io.UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static java.lang.String b(java.lang.String str, java.lang.String str2) {
        int i17;
        char charAt;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(str.length());
        java.io.CharArrayWriter charArrayWriter = new java.io.CharArrayWriter();
        if (str2 == null) {
            throw new java.lang.NullPointerException("charsetName");
        }
        try {
            java.nio.charset.Charset forName = java.nio.charset.Charset.forName(str2);
            int i18 = 0;
            boolean z17 = false;
            while (i18 < str.length()) {
                char charAt2 = str.charAt(i18);
                java.util.BitSet bitSet = f265237a;
                if (bitSet.get(charAt2)) {
                    if (charAt2 == ' ') {
                        z17 = true;
                    }
                    stringBuffer.append(charAt2);
                    i18++;
                } else {
                    do {
                        charArrayWriter.write(charAt2);
                        if (charAt2 >= 55296 && charAt2 <= 56319 && (i17 = i18 + 1) < str.length() && (charAt = str.charAt(i17)) >= 56320 && charAt <= 57343) {
                            charArrayWriter.write(charAt);
                            i18 = i17;
                        }
                        i18++;
                        if (i18 >= str.length()) {
                            break;
                        }
                        charAt2 = str.charAt(i18);
                    } while (!bitSet.get(charAt2));
                    charArrayWriter.flush();
                    java.lang.String str3 = new java.lang.String(charArrayWriter.toCharArray());
                    byte[] bytes = str3.getBytes(forName);
                    if (bytes == null) {
                        bytes = str3.getBytes();
                    }
                    for (int i19 = 0; i19 < bytes.length; i19++) {
                        stringBuffer.append('%');
                        char forDigit = java.lang.Character.forDigit((bytes[i19] >> 4) & 15, 16);
                        if (java.lang.Character.isLetter(forDigit)) {
                            forDigit = (char) (forDigit - ' ');
                        }
                        stringBuffer.append(forDigit);
                        char forDigit2 = java.lang.Character.forDigit(bytes[i19] & 15, 16);
                        if (java.lang.Character.isLetter(forDigit2)) {
                            forDigit2 = (char) (forDigit2 - ' ');
                        }
                        stringBuffer.append(forDigit2);
                    }
                    charArrayWriter.reset();
                    z17 = true;
                }
            }
            return z17 ? stringBuffer.toString() : str;
        } catch (java.nio.charset.IllegalCharsetNameException unused) {
            throw new java.io.UnsupportedEncodingException(str2);
        } catch (java.nio.charset.UnsupportedCharsetException unused2) {
            throw new java.io.UnsupportedEncodingException(str2);
        }
    }
}
