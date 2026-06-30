package um2;

/* loaded from: classes3.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f428708d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(um2.x5 x5Var) {
        super(2);
        this.f428708d = x5Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        r45.g84 g84Var = (r45.g84) obj;
        r45.g84 g84Var2 = (r45.g84) obj2;
        um2.x5 x5Var = this.f428708d;
        com.tencent.mm.plugin.finder.live.plugin.nd0 nd0Var = x5Var.f429062p;
        if (nd0Var != null) {
            pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.hc0(nd0Var, g84Var));
        }
        com.tencent.mm.plugin.finder.live.plugin.wh whVar = x5Var.X0;
        if (whVar != null) {
            pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.sh(whVar, g84Var2));
        }
        return jz5.f0.f302826a;
    }
}
