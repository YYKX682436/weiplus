package iy3;

/* loaded from: classes11.dex */
public final class c implements my3.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f295919a;

    public c(com.tencent.mm.ipcinvoker.r rVar) {
        this.f295919a = rVar;
    }

    public void a(boolean z17, java.lang.String deviceName) {
        kotlin.jvm.internal.o.g(deviceName, "deviceName");
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.IPCASyncInvokeTask_ConnectWatch", "onChannelReady %b %s", java.lang.Boolean.valueOf(z17), deviceName);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("result", z17);
        bundle.putString("device_name", deviceName);
        com.tencent.mm.ipcinvoker.r rVar = this.f295919a;
        if (rVar != null) {
            rVar.a(bundle);
        }
    }
}
