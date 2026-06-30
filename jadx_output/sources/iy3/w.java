package iy3;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Liy3/w;", "Lcom/tencent/mm/ipcinvoker/k0;", "Landroid/os/Bundle;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "feature-exdevice_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes13.dex */
public final class w implements com.tencent.mm.ipcinvoker.k0 {
    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.wechat.rtos.WeChatApi weChatApi;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.IPCSyncInvokeTask_OnGetTicketEvent", "invoke OnGetTicketEvent");
        int i17 = bundle != null ? bundle.getInt("error_type", 0) : 0;
        int i18 = bundle != null ? bundle.getInt(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.ERROR_CODE, 0) : 0;
        my3.c0 a17 = my3.c0.f332784k.a();
        a17.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchService", "onGetTicketEvent errorType:" + i17 + " errorCode:" + i18);
        if (i18 != 0 && (weChatApi = a17.f332787b) != null) {
            weChatApi.onGetOAuthTicket(i17, i18, "", r26.i0.m(""));
        }
        return new com.tencent.mm.ipcinvoker.type.IPCVoid();
    }
}
