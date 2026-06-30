package kz0;

/* loaded from: classes5.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ty0.b1 f313825d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.compose.widget.m7 f313826e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(ty0.b1 b1Var, com.tencent.mm.mj_template.sns.compose.widget.m7 m7Var) {
        super(2);
        this.f313825d = b1Var;
        this.f313826e = m7Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        n0.o oVar = (n0.o) obj;
        if ((((java.lang.Number) obj2).intValue() & 11) == 2) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f302826a;
            }
        }
        java.lang.Object obj3 = n0.e1.f333492a;
        ty0.z0.f((com.tencent.maas.model.MJMusicInfo) this.f313825d.f422792b.getValue(), ty0.a1.f422774j, new kz0.x(this.f313826e), oVar, 56);
        return jz5.f0.f302826a;
    }
}
