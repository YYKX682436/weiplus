package gg1;

/* loaded from: classes7.dex */
public final class f0 extends gg1.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gg1.c1 f271557a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f271558b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(gg1.c1 c1Var, yz5.l lVar) {
        super(c1Var);
        this.f271557a = c1Var;
        this.f271558b = lVar;
    }

    @Override // z91.a
    public void a(aa1.e eVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pause fail");
        sb6.append(eVar != null ? java.lang.Integer.valueOf(eVar.f2487c) : "");
        com.tencent.mars.xlog.Log.e("MicroMsg.VideoCast.VideoCastController", sb6.toString());
        this.f271558b.invoke(java.lang.Boolean.FALSE);
    }

    @Override // z91.a
    public void b(aa1.e response) {
        kotlin.jvm.internal.o.g(response, "response");
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoCast.VideoCastController", "pause success");
        this.f271557a.f271539e.b().f452651e.f452663a = x91.j.Paused;
        this.f271558b.invoke(java.lang.Boolean.TRUE);
    }
}
