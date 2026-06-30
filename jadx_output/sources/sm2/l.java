package sm2;

/* loaded from: classes3.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409545d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(sm2.o4 o4Var) {
        super(2);
        this.f409545d = o4Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        r45.g84 g84Var = (r45.g84) obj;
        r45.g84 g84Var2 = (r45.g84) obj2;
        sm2.o4 o4Var = this.f409545d;
        com.tencent.mm.plugin.finder.live.plugin.nd0 nd0Var = o4Var.f409620k;
        if (nd0Var != null) {
            pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.hc0(nd0Var, g84Var));
        }
        com.tencent.mm.plugin.finder.live.plugin.wh whVar = o4Var.f409606b0;
        if (whVar != null) {
            pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.sh(whVar, g84Var2));
        }
        return jz5.f0.f302826a;
    }
}
