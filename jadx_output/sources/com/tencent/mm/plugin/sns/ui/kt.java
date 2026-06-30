package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class kt implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsUIAction f169649d;

    public kt(com.tencent.mm.plugin.sns.ui.SnsUIAction snsUIAction) {
        this.f169649d = snsUIAction;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUIAction$1");
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        com.tencent.mm.plugin.sns.ui.SnsUIAction.a(this.f169649d).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        com.tencent.mm.plugin.sns.model.l4.Hj().V2(displayMetrics.widthPixels, displayMetrics.heightPixels);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsUIAction$1");
    }
}
