package f93;

/* loaded from: classes.dex */
public final class r0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f260447d;

    public r0(android.view.View view) {
        this.f260447d = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion$setThrottleOnClickListener$1$1");
        this.f260447d.setClickable(true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion$setThrottleOnClickListener$1$1");
    }
}
