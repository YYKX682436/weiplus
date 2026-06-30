package gx0;

/* loaded from: classes5.dex */
public final class i8 implements com.tencent.maas.moviecomposing.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f276531a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f276532b;

    public i8(kotlin.jvm.internal.f0 f0Var, gx0.w8 w8Var) {
        this.f276531a = f0Var;
        this.f276532b = w8Var;
    }

    @Override // com.tencent.maas.moviecomposing.n
    public final void a(int i17) {
        this.f276531a.f310116d = i17;
        com.tencent.mars.xlog.Log.i("MovieComp.MainComposingUIC", "startExporting: onStarted");
        hx0.e eVar = this.f276532b.V;
        eVar.getClass();
        eVar.a(hx0.c.f285607g);
    }
}
