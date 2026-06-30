package wd4;

/* loaded from: classes.dex */
public final class f2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f444902d;

    public f2(android.view.View view) {
        this.f444902d = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$adapter$2$1$onBindViewHolder$$inlined$setThrottleOnClickListener$1$1");
        this.f444902d.setClickable(true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.sheet.SnsGroupDialog$adapter$2$1$onBindViewHolder$$inlined$setThrottleOnClickListener$1$1");
    }
}
