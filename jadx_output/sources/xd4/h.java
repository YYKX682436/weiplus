package xd4;

/* loaded from: classes4.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public int f453642d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f453643e = -1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xd4.z f453644f;

    public h(xd4.z zVar) {
        this.f453644f = zVar;
    }

    public final void a(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("schedule", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$DelaySeekTask");
        this.f453642d = i17;
        if (android.os.SystemClock.uptimeMillis() - this.f453643e > 100) {
            run();
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getUiMainHandler$p", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
            xd4.z zVar = this.f453644f;
            com.tencent.mm.sdk.platformtools.n3 n3Var = zVar.f453729j;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getUiMainHandler$p", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
            n3Var.removeCallbacks(this);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getUiMainHandler$p", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
            com.tencent.mm.sdk.platformtools.n3 n3Var2 = zVar.f453729j;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getUiMainHandler$p", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
            n3Var2.postDelayed(this, 100L);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("schedule", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$DelaySeekTask");
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$DelaySeekTask");
        this.f453643e = android.os.SystemClock.uptimeMillis();
        com.tencent.mm.plugin.sns.ui.OnlineVideoView f17 = xd4.z.f(this.f453644f);
        if (f17 != null) {
            f17.M(this.f453642d, false);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar$DelaySeekTask");
    }
}
