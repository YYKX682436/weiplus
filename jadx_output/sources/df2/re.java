package df2;

/* loaded from: classes3.dex */
public final class re extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.te f231245d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public re(df2.te teVar) {
        super(0);
        this.f231245d = teVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.k5 k5Var;
        df2.te teVar = this.f231245d;
        ((mm2.c1) teVar.business(mm2.c1.class)).A2 = false;
        com.tencent.mm.plugin.finder.live.view.ub ubVar = teVar.f291099e;
        if (ubVar != null && (k5Var = (com.tencent.mm.plugin.finder.live.plugin.k5) ubVar.getPlugin(com.tencent.mm.plugin.finder.live.plugin.k5.class)) != null) {
            com.tencent.mm.plugin.finder.live.view.ub ubVar2 = teVar.f291099e;
            k5Var.u1(ubVar2 instanceof qo0.c ? (qo0.c) ubVar2 : null);
        }
        return jz5.f0.f302826a;
    }
}
