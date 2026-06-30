package et;

@j95.b
/* loaded from: classes8.dex */
public final class g extends i95.w implements ft.v3 {
    public jz5.l wi(android.content.Context context, float f17, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        float f18 = i17;
        float f19 = 4;
        float f27 = 2;
        float a17 = ((f18 - (com.tencent.mm.plugin.appbrand.widget.recent.y.a(context) * f19)) - (f27 * f17)) / 3.0f;
        if (a17 <= i65.a.f(context, com.tencent.mm.R.dimen.f479646bl)) {
            f17 = i65.a.h(context, com.tencent.mm.R.dimen.f479738dv);
            a17 = ((f18 - (f19 * com.tencent.mm.plugin.appbrand.widget.recent.y.a(context))) - (f27 * f17)) / 3.0f;
        }
        float a18 = ((f18 / 4.0f) - f17) - com.tencent.mm.plugin.appbrand.widget.recent.y.a(context);
        return new jz5.l(java.lang.Float.valueOf(f17), java.lang.Float.valueOf(a18 + (a17 - a18)));
    }
}
