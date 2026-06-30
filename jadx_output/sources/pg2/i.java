package pg2;

/* loaded from: classes3.dex */
public final class i implements com.tencent.rtmp.ITXLivePlayListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ug5.v f354118d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pg2.j0 f354119e;

    public i(ug5.v vVar, pg2.j0 j0Var) {
        this.f354118d = vVar;
        this.f354119e = j0Var;
    }

    @Override // com.tencent.rtmp.ITXLivePlayListener
    public void onNetStatus(android.os.Bundle bundle) {
    }

    @Override // com.tencent.rtmp.ITXLivePlayListener
    public void onPlayEvent(int i17, android.os.Bundle bundle) {
        if (i17 == 2003) {
            com.tencent.mars.xlog.Log.i("FinderLiveSurfaceViewService", "rcv PLAY_EVT_RCV_FIRST_I_FRAME");
            return;
        }
        ug5.v vVar = this.f354118d;
        if (i17 != 2009) {
            if (i17 != 2033) {
                return;
            }
            com.tencent.mars.xlog.Log.i("FinderLiveSurfaceViewService", "rcv PLAY_EVT_RENDER_FIRST_FRAME_ON_VIEW");
            vVar.f427658a.f427595i.put("key_first_frame_render", java.lang.Boolean.TRUE);
            java.lang.Object obj = vVar.f427658a.f427595i.get("key_enter_anim_complete");
            java.lang.Boolean bool = obj instanceof java.lang.Boolean ? (java.lang.Boolean) obj : null;
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            com.tencent.mm.live.core.view.LiveVideoViewCompatCover liveVideoViewCompatCover = (com.tencent.mm.live.core.view.LiveVideoViewCompatCover) vVar.f427660c;
            this.f354119e.getClass();
            com.tencent.mars.xlog.Log.i("FinderLiveSurfaceViewService", "handleStaticCoverImage animEnd=" + booleanValue + " firstFrameRender=true");
            if (!booleanValue || liveVideoViewCompatCover == null) {
                return;
            }
            liveVideoViewCompatCover.a();
            return;
        }
        int i18 = bundle != null ? bundle.getInt("EVT_PARAM1") : 0;
        int i19 = bundle != null ? bundle.getInt("EVT_PARAM2") : 0;
        vVar.f427658a.f427595i.put("key_video_w", java.lang.Integer.valueOf(i18));
        vVar.f427658a.f427595i.put("key_video_h", java.lang.Integer.valueOf(i19));
        com.tencent.mars.xlog.Log.i("FinderLiveSurfaceViewService", "rcv PLAY_EVT_CHANGE_RESOLUTION videoWidth=" + i18 + " videoHeight=" + i19 + " videoRatioWH=" + ((i18 * 1.0f) / i19));
        com.tencent.mm.live.core.view.LiveVideoViewCompatCover liveVideoViewCompatCover2 = (com.tencent.mm.live.core.view.LiveVideoViewCompatCover) vVar.f427660c;
        if (liveVideoViewCompatCover2 != null) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
            int intValue = java.lang.Integer.valueOf(i19).intValue();
            int intValue2 = valueOf.intValue();
            int i27 = com.tencent.mm.ui.bl.b(liveVideoViewCompatCover2.getContext()).x;
            int i28 = com.tencent.mm.ui.bl.b(liveVideoViewCompatCover2.getContext()).y;
            if (intValue <= 0 || intValue2 <= 0) {
                com.tencent.mm.live.core.view.LiveVideoView liveVideoView = liveVideoViewCompatCover2.f68624e;
                if (liveVideoView == null) {
                    kotlin.jvm.internal.o.o("liveVideoView");
                    throw null;
                }
                liveVideoView.setAlpha(0.0f);
                com.tencent.mars.xlog.Log.e("LiveVideoViewCompatCover", "adjustLayout size = 0");
                return;
            }
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
            ((com.tencent.mm.feature.finder.live.t6) ((s40.b1) i95.n0.c(s40.b1.class))).getClass();
            android.graphics.Rect b17 = qg2.d.f362793a.b(intValue2, intValue, false);
            layoutParams.topMargin = b17.top;
            layoutParams.width = i27;
            int height = b17.height();
            layoutParams.height = height;
            com.tencent.mm.live.core.view.LiveVideoView liveVideoView2 = liveVideoViewCompatCover2.f68624e;
            if (liveVideoView2 == null) {
                kotlin.jvm.internal.o.o("liveVideoView");
                throw null;
            }
            int i29 = layoutParams.width;
            android.view.SurfaceView surfaceView = liveVideoView2.f68622g;
            com.tencent.mm.live.core.view.FinderLiveSurfaceView finderLiveSurfaceView = surfaceView instanceof com.tencent.mm.live.core.view.FinderLiveSurfaceView ? (com.tencent.mm.live.core.view.FinderLiveSurfaceView) surfaceView : null;
            if (finderLiveSurfaceView != null) {
                finderLiveSurfaceView.a(i29, height);
            }
            com.tencent.mm.live.core.view.LiveVideoView liveVideoView3 = liveVideoViewCompatCover2.f68624e;
            if (liveVideoView3 == null) {
                kotlin.jvm.internal.o.o("liveVideoView");
                throw null;
            }
            liveVideoView3.setLayoutParams(layoutParams);
            com.tencent.mars.xlog.Log.i("LiveVideoViewCompatCover", "adjustLayout top=" + b17.top + " left=" + b17.left + " width=" + b17.width() + " height=" + b17.height() + " screenWidth=" + i27 + " screenHeight=" + i28);
        }
    }
}
