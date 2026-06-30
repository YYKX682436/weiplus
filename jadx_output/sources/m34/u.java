package m34;

/* loaded from: classes4.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sight.decode.ui.VideoPlayView f323376d;

    public u(com.tencent.mm.plugin.sight.decode.ui.VideoPlayView videoPlayView) {
        this.f323376d = videoPlayView;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        com.tencent.mm.plugin.sight.decode.ui.VideoPlayView videoPlayView = this.f323376d;
        if (videoPlayView.getContext() instanceof com.tencent.mm.ui.MMActivity) {
            ((com.tencent.mm.ui.MMActivity) videoPlayView.getContext()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            com.tencent.mm.pluginsdk.ui.tools.f4 f4Var = videoPlayView.f162513m;
            if (f4Var instanceof com.tencent.mm.pluginsdk.ui.tools.VideoSightView) {
                ((com.tencent.mm.pluginsdk.ui.tools.VideoSightView) f4Var).setDrawableWidth(displayMetrics.widthPixels);
            }
        }
        ((android.view.View) videoPlayView.f162513m).requestLayout();
        ((android.view.View) videoPlayView.f162513m).postInvalidate();
    }
}
