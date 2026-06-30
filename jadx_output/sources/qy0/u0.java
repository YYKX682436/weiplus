package qy0;

/* loaded from: classes5.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ty0.b1 f367651d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(ty0.b1 b1Var) {
        super(2);
        this.f367651d = b1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        boolean booleanValue2 = ((java.lang.Boolean) obj2).booleanValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTemplatePreviewPage", "TemplateUIPage: muteMusic " + booleanValue);
        ty0.b1 b1Var = this.f367651d;
        if (booleanValue2) {
            b1Var.f422798h.invoke(java.lang.Boolean.valueOf(booleanValue), b1Var.f422795e.getValue());
        } else {
            b1Var.f422797g.invoke(java.lang.Boolean.valueOf(booleanValue), b1Var.f422795e.getValue());
        }
        return jz5.f0.f302826a;
    }
}
