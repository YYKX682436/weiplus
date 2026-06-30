package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes3.dex */
public class e9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView f168227d;

    public e9(com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView sightVideoFullScreenView) {
        this.f168227d = sightVideoFullScreenView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$9");
        android.view.View e17 = com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView.e(this.f168227d);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(e17, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SightVideoFullScreenView$9", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        e17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(e17, "com/tencent/mm/plugin/sns/ui/SightVideoFullScreenView$9", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$9");
    }
}
