package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public class u2 extends androidx.recyclerview.widget.o1 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView f151960n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView musicMvLyricView, android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f151960n = musicMvLyricView;
    }

    @Override // androidx.recyclerview.widget.o1, androidx.recyclerview.widget.g3
    public void e(android.view.View targetView, androidx.recyclerview.widget.h3 state, androidx.recyclerview.widget.e3 action) {
        kotlin.jvm.internal.o.g(targetView, "targetView");
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(action, "action");
        com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView musicMvLyricView = this.f151960n;
        boolean z17 = musicMvLyricView.f151696v;
        android.view.animation.DecelerateInterpolator decelerateInterpolator = this.f12176i;
        if (z17) {
            com.tencent.mm.view.recyclerview.WxRecyclerView lyricRv = musicMvLyricView.getLyricRv();
            int height = lyricRv != null ? lyricRv.getHeight() : 0;
            int top = targetView.getTop();
            int bottom = targetView.getBottom();
            int b17 = i65.a.b(musicMvLyricView.getContext(), 75);
            if (top < b17) {
                int i17 = b17 - top;
                action.b(0, -i17, k(i17), decelerateInterpolator);
                com.tencent.mars.xlog.Log.i("MicroMsg.MusicMvCommentView", "11");
                return;
            } else {
                if (height - bottom < b17) {
                    int i18 = (height - b17) - bottom;
                    action.b(0, -i18, k(i18), decelerateInterpolator);
                    com.tencent.mars.xlog.Log.i("MicroMsg.MusicMvCommentView", "12");
                    if (musicMvLyricView.f151699y) {
                        return;
                    }
                    musicMvLyricView.postDelayed(new com.tencent.mm.plugin.mv.ui.view.t2(musicMvLyricView), 200L);
                    return;
                }
                return;
            }
        }
        if (!musicMvLyricView.f151698x) {
            int[] iArr = new int[2];
            com.tencent.mm.view.recyclerview.WxRecyclerView lyricRv2 = musicMvLyricView.getLyricRv();
            if (lyricRv2 != null) {
                lyricRv2.getLocationInWindow(iArr);
            }
            int height2 = (((int) (musicMvLyricView.getHeight() * 0.73f)) - iArr[1]) - targetView.getTop();
            int i19 = com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView.I;
            int i27 = height2 + com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView.I;
            action.b(0, -i27, k(i27), decelerateInterpolator);
            com.tencent.mars.xlog.Log.i("MicroMsg.MusicMvCommentView", "13");
            return;
        }
        int[] iArr2 = new int[2];
        com.tencent.mm.view.recyclerview.WxRecyclerView lyricRv3 = musicMvLyricView.getLyricRv();
        if (lyricRv3 != null) {
            lyricRv3.getLocationInWindow(iArr2);
        }
        int height3 = (((int) (musicMvLyricView.getHeight() * com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView.L)) - iArr2[1]) - targetView.getTop();
        int i28 = com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView.I;
        int i29 = height3 + com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView.I;
        action.b(0, -i29, k(i29), decelerateInterpolator);
        com.tencent.mars.xlog.Log.i("MicroMsg.MusicMvCommentView", "14");
        if (musicMvLyricView.f151699y) {
            return;
        }
        musicMvLyricView.g();
    }

    @Override // androidx.recyclerview.widget.o1
    public float j(android.util.DisplayMetrics displayMetrics) {
        kotlin.jvm.internal.o.g(displayMetrics, "displayMetrics");
        return 300.0f / displayMetrics.densityDpi;
    }
}
