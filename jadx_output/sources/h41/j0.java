package h41;

/* loaded from: classes11.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h41.o0 f278817d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(h41.o0 o0Var) {
        super(0);
        this.f278817d = o0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        h41.o0 o0Var = this.f278817d;
        if (o0Var.f278845k) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OVCMsgUI", "notifyDismissEvent: already released");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.OVCMsgUI", "notifyDismissEvent");
            com.tencent.wechat.aff.ovc.h hVar = o0Var.f278837a;
            if (hVar != null) {
                hVar.H();
            }
        }
        return jz5.f0.f302826a;
    }
}
