package rb2;

/* loaded from: classes2.dex */
public final class t extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f393759a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f393760b;

    public t(in5.s0 s0Var, so2.y0 y0Var) {
        this.f393759a = s0Var;
        this.f393760b = y0Var;
    }

    @Override // ym5.n0
    public long getExposedId(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        return this.f393760b.getItemId();
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            android.content.Context context = this.f393759a.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            ((com.tencent.mm.plugin.finder.report.o3) c17).Gk(context, this.f393760b.f410703d.field_feedId, (r18 & 4) != 0 ? false : false, (r18 & 8) != 0 ? false : true, 1, (r18 & 32) != 0 ? false : false);
        }
    }
}
