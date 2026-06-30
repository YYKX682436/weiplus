package ib2;

/* loaded from: classes9.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ib2.w f290144d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.ev2 f290145e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ib2.w wVar, r45.ev2 ev2Var) {
        super(1);
        this.f290144d = wVar;
        this.f290145e = ev2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String username = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(username, "username");
        ib2.w wVar = this.f290144d;
        r45.ev2 ev2Var = this.f290145e;
        ib2.m mVar = new ib2.m(wVar, ev2Var, username);
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        ot0.q qVar = new ot0.q();
        qVar.f348666i = 120;
        qVar.f348654f = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.giz);
        qVar.f348674k = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492409gj0);
        zy2.g gVar = new zy2.g();
        kotlin.jvm.internal.o.g(ev2Var, "<set-?>");
        gVar.f477383b = ev2Var;
        qVar.f(gVar);
        fc5.d dVar = new fc5.d();
        dVar.k(ot0.q.u(qVar, null, null));
        n13.a0 a0Var = (n13.a0) i95.n0.c(n13.a0.class);
        android.app.Activity context = wVar.getContext();
        n13.t tVar = new n13.t();
        tVar.f334133a = mVar;
        ((dk5.y) a0Var).wi(context, dVar, username, tVar);
        java.util.Map P6 = wVar.P6(username);
        if (P6 != null) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Bj("quick_forward_avatar", "view_clk", P6, 1, false);
        }
        return jz5.f0.f302826a;
    }
}
