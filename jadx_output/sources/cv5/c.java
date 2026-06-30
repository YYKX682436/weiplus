package cv5;

/* loaded from: classes16.dex */
public abstract class c {
    public static int a(java.lang.Comparable[] comparableArr, java.lang.Comparable[] comparableArr2) {
        int length = comparableArr.length;
        int length2 = comparableArr2.length;
        if (length < length2) {
            return -1;
        }
        if (length > length2) {
            return 1;
        }
        for (int i17 = 0; i17 < length; i17++) {
            int compareTo = comparableArr[i17].compareTo(comparableArr2[i17]);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return 0;
    }

    public static int b(int[] iArr, int[] iArr2) {
        int length = iArr.length;
        int length2 = iArr2.length;
        if (length < length2) {
            return -1;
        }
        if (length > length2) {
            return 1;
        }
        for (int i17 = 0; i17 < length; i17++) {
            int c17 = c(iArr[i17], iArr2[i17]);
            if (c17 != 0) {
                return c17;
            }
        }
        return 0;
    }

    public static int c(int i17, int i18) {
        if (i17 == i18) {
            return 0;
        }
        return i17 < i18 ? -1 : 1;
    }

    public static int d(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int length2 = bArr2.length;
        if (length < length2) {
            return -1;
        }
        if (length > length2) {
            return 1;
        }
        for (int i17 = 0; i17 < length; i17++) {
            byte b17 = bArr[i17];
            byte b18 = bArr2[i17];
            int i18 = b17 == b18 ? 0 : (b17 & 255) < (b18 & 255) ? -1 : 1;
            if (i18 != 0) {
                return i18;
            }
        }
        return 0;
    }

    public static int e(short[] sArr, short[] sArr2) {
        int length = sArr.length;
        int length2 = sArr2.length;
        if (length < length2) {
            return -1;
        }
        if (length > length2) {
            return 1;
        }
        for (int i17 = 0; i17 < length; i17++) {
            short s17 = sArr[i17];
            short s18 = sArr2[i17];
            int i18 = s17 == s18 ? 0 : (s17 & 65535) < (s18 & 65535) ? -1 : 1;
            if (i18 != 0) {
                return i18;
            }
        }
        return 0;
    }

    public static int f(int i17, int i18) {
        if (i17 == i18) {
            return 0;
        }
        return (((long) i17) & io.flutter.embedding.android.KeyboardMap.kValueMask) < (((long) i18) & io.flutter.embedding.android.KeyboardMap.kValueMask) ? -1 : 1;
    }
}
