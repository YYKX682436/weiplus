package h41;

/* loaded from: classes11.dex */
public final class q0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h41.t0 f278849d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(h41.t0 t0Var) {
        super(0);
        this.f278849d = t0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        h41.t0 t0Var = this.f278849d;
        if (t0Var.f278868j) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OVCPermissionRequestUI", "notifyDenyEvent: already released");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.OVCPermissionRequestUI", "notifyDenyEvent");
            com.tencent.wechat.aff.ovc.j jVar = t0Var.f278861a;
            if (jVar != null) {
                jVar.v1();
            }
        }
        return jz5.f0.f302826a;
    }
}
