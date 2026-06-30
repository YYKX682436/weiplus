package rx2;

/* loaded from: classes10.dex */
public final class e extends androidx.recyclerview.widget.o1 {
    @Override // androidx.recyclerview.widget.o1, androidx.recyclerview.widget.g3
    public void e(android.view.View targetView, androidx.recyclerview.widget.h3 state, androidx.recyclerview.widget.e3 action) {
        kotlin.jvm.internal.o.g(targetView, "targetView");
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(action, "action");
        int h17 = h(targetView, m());
        int i17 = i(targetView, n());
        double d17 = i17;
        int l17 = l((int) java.lang.Math.sqrt((h17 * h17) + (d17 * d17)));
        if (l17 > 0) {
            action.b(-h17, -i17, l17, this.f12175h);
        }
    }

    @Override // androidx.recyclerview.widget.o1
    public int g(int i17, int i18, int i19, int i27, int i28) {
        return i27 - i18;
    }

    @Override // androidx.recyclerview.widget.o1
    public float j(android.util.DisplayMetrics displayMetrics) {
        kotlin.jvm.internal.o.g(displayMetrics, "displayMetrics");
        return 4000.0f / displayMetrics.widthPixels;
    }

    @Override // androidx.recyclerview.widget.o1
    public int k(int i17) {
        return l(i17);
    }
}
