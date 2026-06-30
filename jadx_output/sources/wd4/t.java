package wd4;

/* loaded from: classes.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f445026d;

    public t(android.view.View view) {
        this.f445026d = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.sheet.ContactItemHolder$setContactInfo$$inlined$setThrottleOnClickListener$1$1");
        this.f445026d.setClickable(true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.sheet.ContactItemHolder$setContactInfo$$inlined$setThrottleOnClickListener$1$1");
    }
}
