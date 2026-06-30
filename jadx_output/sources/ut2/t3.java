package ut2;

/* loaded from: classes3.dex */
public final class t3 extends androidx.recyclerview.widget.o1 {
    @Override // androidx.recyclerview.widget.o1
    public int g(int i17, int i18, int i19, int i27, int i28) {
        return (i19 + ((i27 - i19) / 2)) - (i17 + ((i18 - i17) / 2));
    }

    @Override // androidx.recyclerview.widget.o1
    public float j(android.util.DisplayMetrics displayMetrics) {
        kotlin.jvm.internal.o.g(displayMetrics, "displayMetrics");
        return 50.0f / displayMetrics.densityDpi;
    }
}
