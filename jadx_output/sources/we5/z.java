package we5;

/* loaded from: classes9.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ we5.n0 f445408d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f445409e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(we5.n0 n0Var, com.tencent.mm.storage.f9 f9Var) {
        super(1);
        this.f445408d = n0Var;
        this.f445409e = f9Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ui.chatting.viewitems.ao it = (com.tencent.mm.ui.chatting.viewitems.ao) obj;
        kotlin.jvm.internal.o.g(it, "it");
        we5.n0 n0Var = this.f445408d;
        android.app.Activity g17 = n0Var.f204935s.g();
        rl5.r rVar = new rl5.r(g17, it.f203379b);
        it.f203385h = rVar;
        com.tencent.mm.storage.f9 f9Var = this.f445409e;
        rVar.L = new com.tencent.mm.ui.chatting.viewitems.rn(n0Var, it, f9Var);
        boolean k17 = ti3.i.k(f9Var);
        boolean isTeenMode = ((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode();
        rl5.r rVar2 = it.f203385h;
        rVar2.C = true;
        rVar2.Q = false;
        rVar2.f397355y = new com.tencent.mm.ui.chatting.viewitems.sn(n0Var, g17, it, isTeenMode, k17);
        rVar2.f397354x = new com.tencent.mm.ui.chatting.viewitems.tn(n0Var, it, g17, f9Var);
        return jz5.f0.f302826a;
    }
}
