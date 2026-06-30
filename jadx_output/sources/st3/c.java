package st3;

/* loaded from: classes10.dex */
public final class c implements ct0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ st3.e f412523a;

    public c(st3.e eVar) {
        this.f412523a = eVar;
    }

    @Override // ct0.a
    public java.lang.String b() {
        java.lang.String thumbPath = this.f412523a.f412525d.C;
        kotlin.jvm.internal.o.f(thumbPath, "thumbPath");
        return thumbPath;
    }

    @Override // ct0.a
    public int c() {
        if (com.tencent.mm.sdk.platformtools.o4.L().getBoolean("mediacodec_create_error", false)) {
            return 1;
        }
        if (!st3.t.f412601e) {
            return this.f412523a.f412525d.f155672g;
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
        java.lang.String inputVideoPath = this.f412523a.f412525d.A;
        kotlin.jvm.internal.o.f(inputVideoPath, "inputVideoPath");
        return inputVideoPath;
    }
}
