package w82;

/* loaded from: classes3.dex */
public class i1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f443888d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.widget.FavVideoView f443889e;

    public i1(com.tencent.mm.plugin.fav.ui.widget.FavVideoView favVideoView, boolean z17) {
        this.f443889e = favVideoView;
        this.f443888d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.fav.ui.widget.FavVideoView favVideoView = this.f443889e;
        java.lang.String str = favVideoView.f101566d;
        boolean z17 = this.f443888d;
        com.tencent.mars.xlog.Log.i(str, "VideoPlay: switch video model isVideoPlay %b ", java.lang.Boolean.valueOf(z17));
        android.view.View view = (android.view.View) favVideoView.f101569g;
        if (!z17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/widget/FavVideoView$5", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/widget/FavVideoView$5", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            favVideoView.f101568f.setVisibility(0);
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/fav/ui/widget/FavVideoView$5", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/widget/FavVideoView$5", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/fav/ui/widget/FavVideoView$5", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fav/ui/widget/FavVideoView$5", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        favVideoView.f101568f.setVisibility(8);
        favVideoView.f101574o.setVideoTotalTime(favVideoView.f101569g.getDuration() / 1000);
    }
}
