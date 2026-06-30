package com.tencent.mm.plugin.webview.ui.tools.media;

/* loaded from: classes3.dex */
public final class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f185757d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView f185758e;

    public e0(boolean z17, com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView mPVideoPlayFullScreenView) {
        this.f185757d = z17;
        this.f185758e = mPVideoPlayFullScreenView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17 = this.f185757d;
        com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView mPVideoPlayFullScreenView = this.f185758e;
        if (z17) {
            android.view.View view = mPVideoPlayFullScreenView.f185718q;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView$updatePlayBtn$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView$updatePlayBtn$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.widget.ProgressBar progressBar = mPVideoPlayFullScreenView.B;
            if (!(progressBar != null && progressBar.getVisibility() == 0)) {
                android.view.View view2 = mPVideoPlayFullScreenView.f185718q;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView$updatePlayBtn$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/webview/ui/tools/media/MPVideoPlayFullScreenView$updatePlayBtn$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBar redesignVideoPlayerSeekBar = mPVideoPlayFullScreenView.f185728z;
        if (redesignVideoPlayerSeekBar != null) {
            redesignVideoPlayerSeekBar.setIsPlay(mPVideoPlayFullScreenView.E);
        }
    }
}
