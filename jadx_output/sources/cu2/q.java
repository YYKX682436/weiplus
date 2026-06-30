package cu2;

/* loaded from: classes2.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f222434d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f222435e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f222436f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.tencent.mm.ui.widget.dialog.u3 u3Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, yz5.l lVar) {
        super(1);
        this.f222434d = u3Var;
        this.f222435e = baseFinderFeed;
        this.f222436f = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.modelbase.f it = (com.tencent.mm.modelbase.f) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f222434d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f222435e;
        if (baseFinderFeed.F0()) {
            cu2.u.f222441a.d(baseFinderFeed, true);
        }
        yz5.l lVar = this.f222436f;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.TRUE);
        }
        return jz5.f0.f302826a;
    }
}
