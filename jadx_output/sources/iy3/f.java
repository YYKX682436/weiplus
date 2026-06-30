package iy3;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Liy3/f;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "Landroid/os/Bundle;", "<init>", "()V", "feature-exdevice_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes13.dex */
public final class f implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.IPCASyncInvokeTask_GetLicenceInfo", "invoke GetLicenceInfo");
        my3.c0 a17 = my3.c0.f332784k.a();
        iy3.e eVar = new iy3.e(rVar);
        a17.getClass();
        if (!a17.f332789d) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Rtos.RtosWatchService", "getLicenceInfo but noe init");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchService", "getLicenceInfo");
        a17.f332792g = eVar;
        com.tencent.wechat.rtos.WeChatApi weChatApi = a17.f332787b;
        if (weChatApi != null) {
            weChatApi.requireLogin("");
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var = a17.f332788c;
        if (b4Var != null) {
            b4Var.c(com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
        }
    }
}
