package ev5;

/* loaded from: classes16.dex */
public abstract class a {
    public static java.lang.String a(int i17) {
        char[] cArr = new char[9];
        if (i17 < 0) {
            cArr[0] = '-';
            i17 = -i17;
        } else {
            cArr[0] = '+';
        }
        for (int i18 = 0; i18 < 8; i18++) {
            cArr[8 - i18] = java.lang.Character.forDigit(i17 & 15, 16);
            i17 >>= 4;
        }
        return new java.lang.String(cArr);
    }

    public static java.lang.String b(int i17) {
        char[] cArr = new char[4];
        for (int i18 = 0; i18 < 4; i18++) {
            cArr[3 - i18] = java.lang.Character.forDigit(i17 & 15, 16);
            i17 >>= 4;
        }
        return new java.lang.String(cArr);
    }

    public static java.lang.String c(int i17) {
        return i17 == ((char) i17) ? b(i17) : d(i17);
    }

    public static java.lang.String d(int i17) {
        char[] cArr = new char[8];
        for (int i18 = 0; i18 < 8; i18++) {
            cArr[7 - i18] = java.lang.Character.forDigit(i17 & 15, 16);
            i17 >>= 4;
        }
        return new java.lang.String(cArr);
    }

    public static java.lang.String e(long j17) {
        char[] cArr = new char[16];
        for (int i17 = 0; i17 < 16; i17++) {
            cArr[15 - i17] = java.lang.Character.forDigit(((int) j17) & 15, 16);
            j17 >>= 4;
        }
        return new java.lang.String(cArr);
    }
}
