package kz0;

/* loaded from: classes5.dex */
public final class c1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ty0.b1 f313670d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f313671e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(ty0.b1 b1Var, n0.v2 v2Var) {
        super(2);
        this.f313670d = b1Var;
        this.f313671e = v2Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        boolean booleanValue2 = ((java.lang.Boolean) obj2).booleanValue();
        int i17 = kz0.k1.f313767a;
        if (((java.lang.Boolean) this.f313671e.getValue()).booleanValue()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsTemplateUIPage", "TemplateUIPage: no need to mute music");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsTemplateUIPage", "TemplateUIPage: muteMusic " + booleanValue);
            ty0.b1 b1Var = this.f313670d;
            if (booleanValue2) {
                b1Var.f422798h.invoke(java.lang.Boolean.valueOf(booleanValue), b1Var.f422795e.getValue());
            } else {
                b1Var.f422797g.invoke(java.lang.Boolean.valueOf(booleanValue), b1Var.f422795e.getValue());
            }
        }
        return jz5.f0.f302826a;
    }
}
