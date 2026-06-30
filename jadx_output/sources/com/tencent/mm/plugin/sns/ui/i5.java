package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class i5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView f168556d;

    public i5(com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView longVideoFullScreenView) {
        this.f168556d = longVideoFullScreenView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView longVideoFullScreenView = this.f168556d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView$2");
        try {
            com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView.d(longVideoFullScreenView).pause();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
            android.view.View view = longVideoFullScreenView.f166364q;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
            java.lang.Runnable runnable = longVideoFullScreenView.f166358l1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
            longVideoFullScreenView.h(runnable);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
            com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView.e(longVideoFullScreenView, false);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("LongVideoFullScreenView", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView$2");
    }
}
