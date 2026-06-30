package gx0;

/* loaded from: classes5.dex */
public final class j8 implements com.tencent.maas.moviecomposing.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f276575a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f276576b;

    public j8(kotlin.jvm.internal.f0 f0Var, gx0.w8 w8Var) {
        this.f276575a = f0Var;
        this.f276576b = w8Var;
    }

    @Override // com.tencent.maas.moviecomposing.m
    public final void a(int i17) {
        kotlin.jvm.internal.f0 f0Var = this.f276575a;
        int i18 = f0Var.f310116d;
        gx0.w8 w8Var = this.f276576b;
        if (i18 <= 0) {
            com.tencent.mars.xlog.Log.w("MovieComp.MainComposingUIC", "startExporting: totalFrameCount is " + f0Var.f310116d + ", Failed to calculate progress.");
            hx0.e eVar = w8Var.V;
            eVar.getClass();
            eVar.a(hx0.c.f285608h);
            w8Var.D7(new gx0.v8(w8Var, 100, null));
            return;
        }
        int i19 = (int) ((i17 / i18) * 100);
        com.tencent.mars.xlog.Log.i("MovieComp.MainComposingUIC", "startExporting: onProgress progress " + i19);
        hx0.e eVar2 = w8Var.V;
        eVar2.getClass();
        eVar2.a(hx0.c.f285608h);
        w8Var.D7(new gx0.v8(w8Var, i19, null));
    }
}
