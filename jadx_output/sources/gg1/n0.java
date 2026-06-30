package gg1;

/* loaded from: classes7.dex */
public final class n0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gg1.c1 f271611d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(gg1.c1 c1Var) {
        super(1);
        this.f271611d = c1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoCast.VideoCastController", "reconnect: isSuccess = " + booleanValue);
        if (booleanValue) {
            gg1.c1 c1Var = this.f271611d;
            c1Var.c(c1Var.f271543i, 5);
        }
        return jz5.f0.f302826a;
    }
}
