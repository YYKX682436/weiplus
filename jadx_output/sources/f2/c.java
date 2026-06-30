package f2;

/* loaded from: classes14.dex */
public abstract class c {
    public static final int a(f2.r fontWeight, int i17) {
        kotlin.jvm.internal.o.g(fontWeight, "fontWeight");
        boolean z17 = fontWeight.compareTo(f2.r.f258820g) >= 0;
        boolean z18 = i17 == 1;
        if (z18 && z17) {
            return 3;
        }
        if (z17) {
            return 1;
        }
        return z18 ? 2 : 0;
    }
}
