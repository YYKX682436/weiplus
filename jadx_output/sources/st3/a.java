package st3;

/* loaded from: classes10.dex */
public final class a implements ct0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ st3.b f412519a;

    public a(st3.b bVar) {
        this.f412519a = bVar;
    }

    @Override // ct0.a
    public java.lang.String b() {
        return ((java.lang.String) r26.n0.f0(this.f412519a.f412522f, new java.lang.String[]{"."}, false, 0, 6, null).get(0)) + "_thumb.jpg";
    }

    @Override // ct0.a
    public int c() {
        if (!st3.t.f412601e) {
            return 2;
        }
        java.lang.Object b17 = bm5.o1.f22719a.b(bm5.h0.RepairerConfig_Media_CaptureSoft_Int, 0);
        if (!kotlin.jvm.internal.o.b(b17, 0)) {
            return kotlin.jvm.internal.o.b(b17, 1) ? 1 : 2;
        }
        di3.f0 f0Var = di3.w.f232770d;
        if (f0Var == null || !st3.t.f412601e) {
            return 2;
        }
        return f0Var.f232700a;
    }

    @Override // ct0.a
    public java.lang.String getFilePath() {
        return this.f412519a.f412522f;
    }
}
