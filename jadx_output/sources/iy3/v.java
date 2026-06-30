package iy3;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Liy3/v;", "Lcom/tencent/mm/ipcinvoker/k0;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "feature-exdevice_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes13.dex */
public final class v implements com.tencent.mm.ipcinvoker.k0 {
    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        my3.c0 a17 = my3.c0.f332784k.a();
        a17.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchService", "try notify unbind");
        com.tencent.wechat.rtos.WeChatApi weChatApi = a17.f332787b;
        if (weChatApi != null) {
            weChatApi.notifyUnbindWechat();
        }
        return new com.tencent.mm.ipcinvoker.type.IPCVoid();
    }
}
