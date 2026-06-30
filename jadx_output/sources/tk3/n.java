package tk3;

/* loaded from: classes8.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tk3.t f419932d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Boolean f419933e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Boolean f419934f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(tk3.t tVar, java.lang.Boolean bool, java.lang.Boolean bool2) {
        super(0);
        this.f419932d = tVar;
        this.f419933e = bool;
        this.f419934f = bool2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        tk3.d dVar;
        tk3.t tVar = this.f419932d;
        if (tVar.p() && (dVar = tVar.f419949d) != null) {
            java.lang.Boolean bool = this.f419933e;
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            java.lang.Boolean bool2 = this.f419934f;
            boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : false;
            if (dVar.f419913a != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskNewFloatBallContainer", "hide MultiTaskFloatBallView, transAnim:" + booleanValue + ", alphaAnim:" + booleanValue2);
                com.tencent.mm.plugin.multitask.ui.floatball.MultiTaskNewFloatBallView multiTaskNewFloatBallView = dVar.f419913a;
                if (multiTaskNewFloatBallView != null) {
                    multiTaskNewFloatBallView.p(booleanValue, booleanValue2, null);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
