package oy3;

/* loaded from: classes13.dex */
public final class t implements fy3.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI f350044a;

    public t(com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI rtosWatchLoginUI) {
        this.f350044a = rtosWatchLoginUI;
    }

    public void a(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchLoginUI", "onCheckResResult " + z17);
        com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI rtosWatchLoginUI = this.f350044a;
        if (!z17) {
            rtosWatchLoginUI.D.sendEmptyMessage(1002);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchLoginUI", "onSoResCheck success");
        rtosWatchLoginUI.D.removeMessages(1001);
        rtosWatchLoginUI.D.sendEmptyMessage(1003);
    }

    public void b(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchLoginUI", "onHandleScanError " + i17);
        com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI rtosWatchLoginUI = this.f350044a;
        rtosWatchLoginUI.f158607y = i17;
        android.os.Message message = new android.os.Message();
        message.what = 1004;
        message.arg1 = rtosWatchLoginUI.f158607y;
        rtosWatchLoginUI.D.sendMessage(message);
    }

    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchLoginUI", "onLoginSuccess");
        com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI rtosWatchLoginUI = this.f350044a;
        rtosWatchLoginUI.f158607y = 1;
        ky3.b bVar = rtosWatchLoginUI.f158606x;
        bVar.f313617d = 1;
        ((my3.q) ((fy3.e) i95.n0.c(fy3.e.class))).hj(bVar);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1904, 1);
        com.tencent.mm.sdk.platformtools.n3 n3Var = rtosWatchLoginUI.D;
        n3Var.postUI(new oy3.j(rtosWatchLoginUI));
        n3Var.postUI(new oy3.w(rtosWatchLoginUI));
        n3Var.postUIDelayed(new oy3.r(rtosWatchLoginUI), 2000L);
    }
}
