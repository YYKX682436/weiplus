package com.tencent.mm.plugin.finder.playlist;

/* loaded from: classes9.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.playlist.l0 f122453d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f122454e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.ev2 f122455f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.tencent.mm.plugin.finder.playlist.l0 l0Var, android.content.Context context, r45.ev2 ev2Var) {
        super(1);
        this.f122453d = l0Var;
        this.f122454e = context;
        this.f122455f = ev2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String username = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(username, "username");
        android.content.Context context = this.f122454e;
        r45.ev2 ev2Var = this.f122455f;
        com.tencent.mm.plugin.finder.playlist.l0 l0Var = this.f122453d;
        com.tencent.mm.plugin.finder.playlist.s sVar = new com.tencent.mm.plugin.finder.playlist.s(context, ev2Var, l0Var, username);
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        ot0.q qVar = new ot0.q();
        qVar.f348666i = l0Var.w() ? 119 : 120;
        qVar.f348654f = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.giz);
        qVar.f348674k = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492409gj0);
        zy2.g gVar = new zy2.g();
        kotlin.jvm.internal.o.g(ev2Var, "<set-?>");
        gVar.f477383b = ev2Var;
        qVar.f(gVar);
        fc5.d dVar = new fc5.d();
        dVar.k(ot0.q.u(qVar, null, null));
        n13.a0 a0Var = (n13.a0) i95.n0.c(n13.a0.class);
        n13.t tVar = new n13.t();
        tVar.f334133a = sVar;
        ((dk5.y) a0Var).wi(context, dVar, username, tVar);
        l0Var.x("quick_forward_avatar", true, username);
        return jz5.f0.f302826a;
    }
}
