package gg1;

/* loaded from: classes7.dex */
public final class h0 extends gg1.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gg1.c1 f271564a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f271565b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f271566c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(gg1.c1 c1Var, int i17, int i18) {
        super(c1Var);
        this.f271564a = c1Var;
        this.f271565b = i17;
        this.f271566c = i18;
    }

    @Override // z91.a
    public void a(aa1.e eVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("play new fail");
        sb6.append(eVar != null ? java.lang.Integer.valueOf(eVar.f2487c) : "");
        com.tencent.mars.xlog.Log.e("MicroMsg.VideoCast.VideoCastController", sb6.toString());
        gg1.x xVar = new gg1.x(gg1.a.f271526m);
        xVar.f271655b = java.lang.Integer.valueOf(this.f271566c);
        gg1.c1.a(this.f271564a, xVar);
    }

    @Override // z91.a
    public void b(aa1.e response) {
        kotlin.jvm.internal.o.g(response, "response");
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoCast.VideoCastController", "play new success");
        gg1.c1 c1Var = this.f271564a;
        c1Var.f271539e.b().f452654h = c1Var.f271547m;
        gg1.k1 k1Var = c1Var.f271539e;
        k1Var.b().f452651e.f452663a = x91.j.Playing;
        k1Var.b().f();
        k1Var.b().g();
        int i17 = this.f271565b;
        if (i17 <= 0) {
            return;
        }
        c1Var.f271546l = new gg1.k0(c1Var, i17);
    }
}
