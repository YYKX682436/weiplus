package f93;

/* loaded from: classes.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f260285d;

    public a(android.view.View view) {
        this.f260285d = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion$setThrottleOnClickListener$1$1");
        this.f260285d.setClickable(true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion$setThrottleOnClickListener$1$1");
    }
}
