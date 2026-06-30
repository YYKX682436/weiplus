package mx0;

/* loaded from: classes5.dex */
public final class j3 extends mx0.a {

    /* renamed from: g, reason: collision with root package name */
    public long f332065g;

    /* renamed from: h, reason: collision with root package name */
    public wu5.c f332066h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(android.widget.TextView recordTimeTv) {
        super(recordTimeTv);
        kotlin.jvm.internal.o.g(recordTimeTv, "recordTimeTv");
    }

    public final void b() {
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            setVisibility(8);
            wu5.c cVar = this.f332066h;
            if (cVar != null) {
                cVar.cancel(true);
            }
            this.f332066h = null;
            kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
    }

    public final void c(int i17) {
        int i18 = i17 / 1000;
        java.lang.String format = java.lang.String.format("%02d:%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i18 / 60), java.lang.Integer.valueOf(i18 % 60)}, 2));
        kotlin.jvm.internal.o.f(format, "format(...)");
        this.f331814d.post(new mx0.i3(this, format));
    }

    @Override // yt3.r2
    public void onDetach() {
        b();
    }
}
