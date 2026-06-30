package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class k5 implements m34.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView f169608d;

    public k5(com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView longVideoFullScreenView) {
        this.f169608d = longVideoFullScreenView;
    }

    @Override // m34.e
    public void a(int i17) {
        int i18 = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSeekTo", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView$4");
        try {
            com.tencent.mars.xlog.Log.i("LongVideoFullScreenView", "onSeek time " + i18);
            com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView longVideoFullScreenView = this.f169608d;
            int i19 = com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView.f166350p1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
            int i27 = longVideoFullScreenView.f166371x;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
            if (i18 >= i27) {
                com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView longVideoFullScreenView2 = this.f169608d;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2108", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                longVideoFullScreenView2.R++;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2108", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                com.tencent.mars.xlog.Log.i("LongVideoFullScreenView", "onLoopCompletion, onSeekTo time is 0");
                i18 = 0;
            }
            com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView longVideoFullScreenView3 = this.f169608d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2202", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
            longVideoFullScreenView3.F = i18;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2202", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
            com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView longVideoFullScreenView4 = this.f169608d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
            boolean z17 = longVideoFullScreenView4.f166373y;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
            if (z17) {
                this.f169608d.k();
            } else {
                this.f169608d.y();
            }
            com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView.d(this.f169608d).a(i18, true);
            com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView longVideoFullScreenView5 = this.f169608d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
            java.lang.Runnable runnable = longVideoFullScreenView5.f166358l1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
            com.tencent.mm.sdk.platformtools.u3.l(runnable);
            com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView longVideoFullScreenView6 = this.f169608d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
            android.view.View view = longVideoFullScreenView6.f166364q;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView$4", "onSeekTo", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView$4", "onSeekTo", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("LongVideoFullScreenView", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSeekTo", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView$4");
    }

    @Override // m34.e
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSeekPre", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView$4");
        try {
            com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView.a(this.f169608d, true);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("LongVideoFullScreenView", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSeekPre", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView$4");
    }

    @Override // m34.e
    public void d(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSeeking", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView$4");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSeeking", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView$4");
    }
}
