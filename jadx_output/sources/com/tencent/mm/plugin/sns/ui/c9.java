package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class c9 implements m34.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView f168114d;

    public c9(com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView sightVideoFullScreenView) {
        this.f168114d = sightVideoFullScreenView;
    }

    @Override // m34.e
    public void a(int i17) {
        com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView sightVideoFullScreenView = this.f168114d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSeekTo", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$7");
        try {
            com.tencent.mars.xlog.Log.i("SightVideoFullScreenView", "onSeek time " + i17);
            int i18 = com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView.f166649x0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
            boolean z17 = sightVideoFullScreenView.G;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
            if (z17) {
                sightVideoFullScreenView.m();
            } else {
                sightVideoFullScreenView.y();
            }
            com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView.b(sightVideoFullScreenView).s(i17 * 1000, true);
            com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView.d(sightVideoFullScreenView, true);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
            java.lang.Runnable runnable = sightVideoFullScreenView.f166661p0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
            com.tencent.mm.sdk.platformtools.u3.l(runnable);
            android.view.View e17 = com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView.e(sightVideoFullScreenView);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(e17, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SightVideoFullScreenView$7", "onSeekTo", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            e17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(e17, "com/tencent/mm/plugin/sns/ui/SightVideoFullScreenView$7", "onSeekTo", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SightVideoFullScreenView", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSeekTo", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$7");
    }

    @Override // m34.e
    public void b() {
        com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView sightVideoFullScreenView = this.f168114d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSeekPre", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$7");
        try {
            if (com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView.b(sightVideoFullScreenView) != null) {
                com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView.b(sightVideoFullScreenView).r();
            }
            com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView.g(sightVideoFullScreenView, true);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SightVideoFullScreenView", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSeekPre", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$7");
    }

    @Override // m34.e
    public void d(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSeeking", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$7");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSeeking", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView$7");
    }
}
