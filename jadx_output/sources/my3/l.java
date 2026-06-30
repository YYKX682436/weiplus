package my3;

/* loaded from: classes13.dex */
public final class l implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f332812d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ my3.q f332813e;

    public l(boolean z17, my3.q qVar) {
        this.f332812d = z17;
        this.f332813e = qVar;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        fy3.f fVar;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        boolean z17 = false;
        if (bundle != null && bundle.getBoolean("result", false)) {
            z17 = true;
        }
        java.lang.String deviceName = bundle != null ? bundle.getString("device_name") : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosServiceImpl", "connect watch " + z17);
        if (!this.f332812d || (fVar = this.f332813e.f332833s) == null) {
            return;
        }
        kotlin.jvm.internal.o.g(deviceName, "deviceName");
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchLoginUI", "onChannelConnectResult connected:" + z17);
        com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI rtosWatchLoginUI = ((oy3.t) fVar).f350044a;
        if (z17) {
            rtosWatchLoginUI.D.sendEmptyMessage(1005);
            rtosWatchLoginUI.D.postUI(new oy3.q(rtosWatchLoginUI, deviceName));
            return;
        }
        rtosWatchLoginUI.f158607y = 2;
        android.os.Message message = new android.os.Message();
        message.what = 1004;
        message.arg1 = rtosWatchLoginUI.f158607y;
        rtosWatchLoginUI.D.sendMessage(message);
    }
}
