package rp1;

/* loaded from: classes14.dex */
public class f1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.view.FloatBallView f398395d;

    public f1(com.tencent.mm.plugin.ball.view.FloatBallView floatBallView) {
        this.f398395d = floatBallView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.ball.view.FloatBallView floatBallView = this.f398395d;
        floatBallView.f93541m2 = true;
        android.os.Vibrator vibrator = floatBallView.f93534i;
        if (vibrator != null) {
            vibrator.vibrate(10L);
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArraySet) floatBallView.f93546p).iterator();
        while (it.hasNext()) {
            ((gp1.b0) it.next()).e();
        }
    }
}
