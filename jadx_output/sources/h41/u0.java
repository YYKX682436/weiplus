package h41;

/* loaded from: classes11.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h41.y0 f278870d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(h41.y0 y0Var) {
        super(0);
        this.f278870d = y0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        h41.y0 y0Var = this.f278870d;
        if (y0Var.f278901j) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OVCSelectContactUI", "notifyDismissEvent: already released");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.OVCSelectContactUI", "notifyDismissEvent");
            com.tencent.wechat.aff.ovc.l lVar = y0Var.f278894a;
            if (lVar != null) {
                lVar.H();
            }
        }
        return jz5.f0.f302826a;
    }
}
