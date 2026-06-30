package el1;

/* loaded from: classes8.dex */
public final class b {
    public b(kotlin.jvm.internal.i iVar) {
    }

    public final float a(androidx.recyclerview.widget.RecyclerView recyclerView, float f17, int i17, int i18, int i19, int i27) {
        float f18;
        float f19;
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        float f27 = i17;
        float f28 = 4;
        float f29 = 2;
        float a17 = ((f27 - (com.tencent.mm.plugin.appbrand.widget.recent.y.a(recyclerView.getContext()) * f28)) - (f29 * f17)) / 3.0f;
        if (a17 <= i65.a.f(recyclerView.getContext(), com.tencent.mm.R.dimen.f479646bl)) {
            f19 = i65.a.h(recyclerView.getContext(), com.tencent.mm.R.dimen.f479738dv);
            f18 = ((f27 - (f28 * com.tencent.mm.plugin.appbrand.widget.recent.y.a(recyclerView.getContext()))) - (f29 * f19)) / 3.0f;
        } else {
            f18 = a17;
            f19 = f17;
        }
        float f37 = f27 / 4.0f;
        float a18 = com.tencent.mm.plugin.appbrand.widget.recent.y.a(recyclerView.getContext());
        float f38 = (f37 - f19) - a18;
        float f39 = f18 - f38;
        float f47 = (f37 - f39) - a18;
        float f48 = f18 - f47;
        float f49 = (f37 - f48) - a18;
        float f57 = f18 - f49;
        while (recyclerView.getItemDecorationCount() > 0) {
            recyclerView.T0(0);
        }
        recyclerView.N(new el1.a(i19, i18, i27, f19, f38, f39, f47, f48, f49, f57, f19));
        return f19;
    }
}
