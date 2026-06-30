package nr2;

/* loaded from: classes9.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nr2.j0 f339186d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.ev2 f339187e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(nr2.j0 j0Var, r45.ev2 ev2Var) {
        super(1);
        this.f339186d = j0Var;
        this.f339187e = ev2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String userName = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(userName, "userName");
        nr2.j0 j0Var = this.f339186d;
        r45.ev2 ev2Var = this.f339187e;
        nr2.e0 e0Var = new nr2.e0(j0Var, ev2Var, userName);
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        ot0.q qVar = new ot0.q();
        qVar.f348666i = 119;
        qVar.f348654f = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.giz);
        qVar.f348674k = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492409gj0);
        zy2.g gVar = new zy2.g();
        kotlin.jvm.internal.o.g(ev2Var, "<set-?>");
        gVar.f477383b = ev2Var;
        qVar.f(gVar);
        fc5.d dVar = new fc5.d();
        dVar.k(ot0.q.u(qVar, null, null));
        n13.a0 a0Var = (n13.a0) i95.n0.c(n13.a0.class);
        android.app.Activity context = j0Var.getContext();
        n13.t tVar = new n13.t();
        tVar.f334133a = e0Var;
        ((dk5.y) a0Var).wi(context, dVar, userName, tVar);
        return jz5.f0.f302826a;
    }
}
