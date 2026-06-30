package n34;

/* loaded from: classes4.dex */
public final class o3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public int f334694d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f334695e = -1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n34.v3 f334696f;

    public o3(n34.v3 v3Var) {
        this.f334696f = v3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper$DelaySeekTask");
        this.f334695e = android.os.SystemClock.uptimeMillis();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getOnlineView$p", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
        com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView = this.f334696f.f334754f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getOnlineView$p", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
        if (onlineVideoView != null) {
            onlineVideoView.M(this.f334694d, false);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper$DelaySeekTask");
    }
}
