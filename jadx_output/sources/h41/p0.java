package h41;

/* loaded from: classes11.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h41.t0 f278847d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(h41.t0 t0Var) {
        super(0);
        this.f278847d = t0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        h41.t0 t0Var = this.f278847d;
        if (t0Var.f278868j) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OVCPermissionRequestUI", "notifyAllowEvent: already released");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.OVCPermissionRequestUI", "notifyAllowEvent");
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_OVC_VOICE_ASSISTANT_SWITCH_INT_SYNC, 1);
            com.tencent.mars.xlog.Log.i("MicrMsg.OVCXLabEnable", "setVoiceAssistantPermission: granted=true, value=1");
            com.tencent.mars.xlog.Log.i("MicroMsg.OVCPermissionRequestUI", "permission switch saved as ON");
            com.tencent.wechat.aff.ovc.j jVar = t0Var.f278861a;
            if (jVar != null) {
                jVar.o0();
            }
        }
        return jz5.f0.f302826a;
    }
}
