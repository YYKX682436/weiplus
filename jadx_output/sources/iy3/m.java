package iy3;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Liy3/m;", "Lcom/tencent/mm/ipcinvoker/k0;", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "feature-exdevice_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes13.dex */
public final class m implements com.tencent.mm.ipcinvoker.k0 {
    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.wechat.rtos.WeChatApi weChatApi;
        gy3.a aVar;
        com.tencent.mm.ipcinvoker.type.IPCBoolean iPCBoolean = (com.tencent.mm.ipcinvoker.type.IPCBoolean) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.IPCSyncINvokeTask_OnForegroundChange", "invoke OnForegroundChange");
        my3.c0 a17 = my3.c0.f332784k.a();
        java.lang.Boolean valueOf = iPCBoolean != null ? java.lang.Boolean.valueOf(iPCBoolean.f68400d) : null;
        a17.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchService", "isForeground: " + valueOf);
        if (kotlin.jvm.internal.o.b(valueOf, java.lang.Boolean.TRUE) && (aVar = a17.f332786a) != null) {
            gy3.d dVar = (gy3.d) aVar;
            com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosBCChannel", "onForeground");
            dVar.f277562j.a();
            if (!dVar.f277561i && !dVar.f277560h && dVar.e()) {
                dVar.b();
            }
        }
        if (valueOf != null && (weChatApi = a17.f332787b) != null) {
            weChatApi.notifyForegroundChanged(valueOf.booleanValue());
        }
        return new com.tencent.mm.ipcinvoker.type.IPCVoid();
    }
}
