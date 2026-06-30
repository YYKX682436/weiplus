package gg1;

/* loaded from: classes7.dex */
public final class j0 extends gg1.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gg1.c1 f271577a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f271578b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f271579c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(gg1.c1 c1Var, int i17, int i18) {
        super(c1Var);
        this.f271577a = c1Var;
        this.f271578b = i17;
        this.f271579c = i18;
    }

    @Override // z91.a
    public void a(aa1.e eVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stop fail before play new");
        sb6.append(eVar != null ? java.lang.Integer.valueOf(eVar.f2487c) : "");
        com.tencent.mars.xlog.Log.e("MicroMsg.VideoCast.VideoCastController", sb6.toString());
    }

    @Override // z91.a
    public void b(aa1.e response) {
        kotlin.jvm.internal.o.g(response, "response");
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoCast.VideoCastController", "playNew: stop success");
        gg1.c1 c1Var = this.f271577a;
        c1Var.f271539e.b().f452651e.f452663a = x91.j.Stopped;
        c1Var.f271539e.b().d(c1Var.f271537c.f261899e, new gg1.i0(c1Var, this.f271578b, this.f271579c));
    }
}
