package ni2;

/* loaded from: classes3.dex */
public final class s2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ni2.u2 f337467d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(ni2.u2 u2Var) {
        super(0);
        this.f337467d = u2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ni2.u2 u2Var = this.f337467d;
        if (!(!((om2.g) u2Var.f337478h.P0(om2.g.class)).f346311r.isEmpty()) || u2Var.f337481n == 8) {
            u2Var.y();
        } else {
            sf2.d3 d3Var = (sf2.d3) u2Var.f337478h.U0(sf2.d3.class);
            if (d3Var != null) {
                com.tencent.mm.plugin.finder.live.util.y.d(d3Var, null, null, new ni2.r2(d3Var, u2Var, null), 3, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
