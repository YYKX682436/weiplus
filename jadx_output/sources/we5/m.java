package we5;

/* loaded from: classes9.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ we5.v f445355d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f445356e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(we5.v vVar, com.tencent.mm.storage.f9 f9Var) {
        super(1);
        this.f445355d = vVar;
        this.f445356e = f9Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ui.chatting.viewitems.ao it = (com.tencent.mm.ui.chatting.viewitems.ao) obj;
        kotlin.jvm.internal.o.g(it, "it");
        we5.v vVar = this.f445355d;
        android.app.Activity g17 = vVar.f204055s.g();
        rl5.r rVar = new rl5.r(g17, it.f203379b);
        it.f203385h = rVar;
        com.tencent.mm.storage.f9 f9Var = this.f445356e;
        rVar.L = new com.tencent.mm.ui.chatting.viewitems.kn(vVar, it, f9Var);
        boolean isTeenMode = ((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode();
        boolean k17 = ti3.i.k(f9Var);
        rl5.r rVar2 = it.f203385h;
        rVar2.C = true;
        rVar2.Q = false;
        rVar2.f397355y = new com.tencent.mm.ui.chatting.viewitems.ln(vVar, g17, it, isTeenMode, k17);
        rVar2.f397354x = new com.tencent.mm.ui.chatting.viewitems.mn(vVar, it, g17, f9Var);
        return jz5.f0.f302826a;
    }
}
