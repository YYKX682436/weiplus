package x0;

/* loaded from: classes14.dex */
public abstract class t {
    public static final int a(long j17) {
        int i17;
        if ((io.flutter.embedding.android.KeyboardMap.kValueMask & j17) == 0) {
            i17 = 32;
            j17 >>= 32;
        } else {
            i17 = 0;
        }
        if ((65535 & j17) == 0) {
            i17 += 16;
            j17 >>= 16;
        }
        if ((255 & j17) == 0) {
            i17 += 8;
            j17 >>= 8;
        }
        if ((15 & j17) == 0) {
            i17 += 4;
            j17 >>= 4;
        }
        if ((1 & j17) != 0) {
            return i17;
        }
        if ((2 & j17) != 0) {
            return i17 + 1;
        }
        if ((4 & j17) != 0) {
            return i17 + 2;
        }
        if ((j17 & 8) != 0) {
            return i17 + 3;
        }
        return -1;
    }

    public static final int b(int[] iArr, int i17) {
        kotlin.jvm.internal.o.g(iArr, "<this>");
        int length = iArr.length - 1;
        int i18 = 0;
        while (i18 <= length) {
            int i19 = (i18 + length) >>> 1;
            int i27 = iArr[i19];
            if (i17 > i27) {
                i18 = i19 + 1;
            } else {
                if (i17 >= i27) {
                    return i19;
                }
                length = i19 - 1;
            }
        }
        return -(i18 + 1);
    }
}
