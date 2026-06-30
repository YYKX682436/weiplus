package y36;

/* loaded from: classes16.dex */
public abstract class c {
    public static final int a(x36.e0 segment, int i17) {
        int i18;
        kotlin.jvm.internal.o.g(segment, "$this$segment");
        int i19 = i17 + 1;
        int length = segment.f451669i.length;
        int[] binarySearch = segment.f451670m;
        kotlin.jvm.internal.o.g(binarySearch, "$this$binarySearch");
        int i27 = length - 1;
        int i28 = 0;
        while (true) {
            if (i28 <= i27) {
                i18 = (i28 + i27) >>> 1;
                int i29 = binarySearch[i18];
                if (i29 >= i19) {
                    if (i29 <= i19) {
                        break;
                    }
                    i27 = i18 - 1;
                } else {
                    i28 = i18 + 1;
                }
            } else {
                i18 = (-i28) - 1;
                break;
            }
        }
        return i18 >= 0 ? i18 : ~i18;
    }
}
