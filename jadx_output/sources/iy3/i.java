package iy3;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Liy3/i;", "Lcom/tencent/mm/ipcinvoker/j;", "Landroid/os/Bundle;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "feature-exdevice_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes13.dex */
public final class i implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.lang.Integer valueOf = bundle != null ? java.lang.Integer.valueOf(bundle.getInt(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.ERROR_CODE)) : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.IPCASyncInvokeTask_RtosClose", "invoke RtosClose " + valueOf);
        if ((valueOf == null || valueOf.intValue() != 11) && ((valueOf == null || valueOf.intValue() != 9) && (valueOf == null || valueOf.intValue() != 13))) {
            my3.u uVar = my3.c0.f332784k;
            my3.c0 a17 = uVar.a();
            if (a17.f332789d) {
                com.tencent.wechat.rtos.WeChatApi weChatApi = a17.f332787b;
                if (weChatApi != null) {
                    weChatApi.cancelLogin();
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchService", "sleep 1s for sending cancel login");
                java.lang.Thread.sleep(1000L);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchService", "already close");
            }
            uVar.a().a();
        }
        if (rVar != null) {
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCVoid());
        }
    }
}
