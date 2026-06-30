package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class b7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f167893d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f167894e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.OfflineVideoView f167895f;

    public b7(com.tencent.mm.plugin.sns.ui.OfflineVideoView offlineVideoView, boolean z17, float f17) {
        this.f167895f = offlineVideoView;
        this.f167893d = z17;
        this.f167894e = f17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.OfflineVideoView$3");
        com.tencent.mm.plugin.sns.ui.OfflineVideoView offlineVideoView = this.f167895f;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(offlineVideoView.hashCode());
        boolean z17 = this.f167893d;
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(z17);
        float f17 = this.f167894e;
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVideoView", "%d switch video model isVideoPlay %b %f", valueOf, valueOf2, java.lang.Float.valueOf(f17));
        android.view.View view = (android.view.View) com.tencent.mm.plugin.sns.ui.OfflineVideoView.a(offlineVideoView);
        if (z17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(f17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/OfflineVideoView$3", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/OfflineVideoView$3", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/OfflineVideoView$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/OfflineVideoView$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.plugin.sns.ui.OfflineVideoView.b(offlineVideoView).setVisibility(0);
            com.tencent.mm.plugin.sns.ui.OfflineVideoView.b(offlineVideoView).setAlpha(f17);
            if (f17 >= 1.0d) {
                offlineVideoView.f166412g.setVisibility(8);
            } else if (f17 == 0.0d) {
                offlineVideoView.f166412g.setVisibility(0);
            }
        } else {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ui/OfflineVideoView$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/OfflineVideoView$3", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.plugin.sns.ui.OfflineVideoView.b(offlineVideoView).setVisibility(0);
            com.tencent.mm.plugin.sns.ui.OfflineVideoView.b(offlineVideoView).setAlpha(0.0f);
            offlineVideoView.f166412g.setVisibility(0);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.OfflineVideoView$3");
    }
}
