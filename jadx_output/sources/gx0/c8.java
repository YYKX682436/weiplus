package gx0;

/* loaded from: classes5.dex */
public final class c8 implements com.tencent.maas.moviecomposing.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f276285a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f276286b;

    public c8(kotlin.jvm.internal.f0 f0Var, gx0.w8 w8Var) {
        this.f276285a = f0Var;
        this.f276286b = w8Var;
    }

    @Override // com.tencent.maas.moviecomposing.m
    public final void a(int i17) {
        int i18 = (int) ((i17 / this.f276285a.f310116d) * 100);
        com.tencent.mars.xlog.Log.i("MovieComp.MainComposingUIC", "startExporting: onProgress progress " + i18);
        gx0.w8 w8Var = this.f276286b;
        hx0.e eVar = w8Var.V;
        eVar.getClass();
        eVar.a(hx0.c.f285608h);
        w8Var.D7(new gx0.v8(w8Var, i18, null));
    }
}
