package df2;

/* loaded from: classes3.dex */
public final class se extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.te f231333d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public se(df2.te teVar) {
        super(0);
        this.f231333d = teVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.c4 c4Var;
        xt2.d dVar;
        df2.te teVar = this.f231333d;
        ((mm2.c1) teVar.business(mm2.c1.class)).A2 = false;
        com.tencent.mm.plugin.finder.live.view.ub ubVar = teVar.f291099e;
        if (ubVar != null && (c4Var = (com.tencent.mm.plugin.finder.live.plugin.c4) ubVar.getPlugin(com.tencent.mm.plugin.finder.live.plugin.c4.class)) != null && (dVar = c4Var.f112105y) != null) {
            dVar.r();
        }
        return jz5.f0.f302826a;
    }
}
