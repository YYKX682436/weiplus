package gg1;

/* loaded from: classes7.dex */
public final class i0 extends gg1.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gg1.c1 f271572a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f271573b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f271574c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(gg1.c1 c1Var, int i17, int i18) {
        super(c1Var);
        this.f271572a = c1Var;
        this.f271573b = i17;
        this.f271574c = i18;
    }

    @Override // z91.a
    public void a(aa1.e eVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("set AVTransportURI fail");
        sb6.append(eVar != null ? java.lang.Integer.valueOf(eVar.f2487c) : "");
        com.tencent.mars.xlog.Log.e("MicroMsg.VideoCast.VideoCastController", sb6.toString());
        gg1.x xVar = new gg1.x(gg1.a.f271526m);
        xVar.f271655b = java.lang.Integer.valueOf(this.f271574c);
        gg1.c1.a(this.f271572a, xVar);
    }

    @Override // z91.a
    public void b(aa1.e response) {
        kotlin.jvm.internal.o.g(response, "response");
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoCast.VideoCastController", "playNew: setAvTransUrl success");
        gg1.c1 c1Var = this.f271572a;
        c1Var.f271539e.b().f452651e.f452663a = x91.j.Transitioning;
        c1Var.f271539e.b().c(new gg1.h0(c1Var, this.f271573b, this.f271574c));
    }
}
