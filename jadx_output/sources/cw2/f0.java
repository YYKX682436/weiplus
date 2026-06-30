package cw2;

/* loaded from: classes10.dex */
public final class f0 implements ct0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cw2.h0 f223686a;

    public f0(cw2.h0 h0Var) {
        this.f223686a = h0Var;
    }

    @Override // ct0.a
    public java.lang.String b() {
        return "";
    }

    @Override // ct0.a
    public int c() {
        if (com.tencent.mm.sdk.platformtools.o4.L().getBoolean("mediacodec_create_error", false)) {
            return 1;
        }
        if (!st3.t.f412601e) {
            return this.f223686a.f412525d.f155672g;
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
        dw3.c0 c0Var = dw3.c0.f244182a;
        java.lang.String Ri = t21.o2.Bi().Ri();
        kotlin.jvm.internal.o.f(Ri, "getSubVideoPath(...)");
        if (!com.tencent.mm.vfs.w6.j(Ri)) {
            java.lang.String Ri2 = t21.o2.Bi().Ri();
            kotlin.jvm.internal.o.f(Ri2, "getSubVideoPath(...)");
            com.tencent.mm.vfs.w6.u(Ri2);
        }
        return t21.o2.Bi().Ri() + '/' + java.lang.System.currentTimeMillis();
    }
}
