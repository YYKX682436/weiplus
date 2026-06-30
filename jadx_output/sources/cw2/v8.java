package cw2;

/* loaded from: classes2.dex */
public final class v8 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderVideoLayout f224072d;

    public v8(com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout) {
        this.f224072d = finderVideoLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/video/FinderVideoLayout$retryBtn$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = this.f224072d;
        com.tencent.mars.xlog.Log.i(finderVideoLayout.getFTPPTag(), "retry video, position:" + finderVideoLayout.getPlayAdapterPosition());
        cw2.h8 playInfo = finderVideoLayout.getPlayInfo();
        boolean z17 = false;
        if (playInfo != null && playInfo.f223751g) {
            z17 = true;
        }
        if (z17) {
            finderVideoLayout.Q = true;
            cw2.da videoView = finderVideoLayout.getVideoView();
            if (videoView != null) {
                videoView.stop();
            }
            com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout2 = this.f224072d;
            cw2.v9.n(finderVideoLayout2, finderVideoLayout2.getPlayAdapterPosition(), null, null, 6, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/video/FinderVideoLayout$retryBtn$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
