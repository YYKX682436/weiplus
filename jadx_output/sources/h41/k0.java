package h41;

/* loaded from: classes11.dex */
public final class k0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h41.o0 f278822d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(h41.o0 o0Var) {
        super(2);
        this.f278822d = o0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String username = (java.lang.String) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        kotlin.jvm.internal.o.g(username, "username");
        h41.o0 o0Var = this.f278822d;
        o0Var.getClass();
        if (o0Var.f278845k) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OVCMsgUI", "notifyConfirmSendEvent: already released");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.OVCMsgUI", "notifyConfirmSendEvent: username=" + username + ", success=" + booleanValue);
            com.tencent.wechat.aff.ovc.h hVar = o0Var.f278837a;
            if (hVar != null) {
                hVar.K1(username, booleanValue);
            }
        }
        return jz5.f0.f302826a;
    }
}
