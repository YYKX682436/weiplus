package ww1;

/* loaded from: classes15.dex */
public class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ww1.l1 f450359d;

    public y0(ww1.l1 l1Var) {
        this.f450359d = l1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        ww1.l1 l1Var = this.f450359d;
        if (l1Var.f450233d != null && l1Var.f450236g && l1Var.f450234e == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.F2fRcvVoiceListener", "this play may error");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(699L, 1L, 1L, false);
        }
    }
}
