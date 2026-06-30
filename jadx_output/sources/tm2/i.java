package tm2;

/* loaded from: classes3.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tm2.s2 f420522d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(tm2.s2 s2Var) {
        super(2);
        this.f420522d = s2Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        r45.g84 g84Var = (r45.g84) obj;
        r45.g84 g84Var2 = (r45.g84) obj2;
        tm2.s2 s2Var = this.f420522d;
        com.tencent.mm.plugin.finder.live.plugin.nd0 nd0Var = s2Var.f420595k;
        if (nd0Var != null) {
            pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.hc0(nd0Var, g84Var));
        }
        com.tencent.mm.plugin.finder.live.plugin.wh whVar = s2Var.f420584d0;
        if (whVar != null) {
            pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.sh(whVar, g84Var2));
        }
        return jz5.f0.f302826a;
    }
}
