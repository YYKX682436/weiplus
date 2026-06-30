package hn4;

/* loaded from: classes15.dex */
public class c0 extends fn4.h {
    public final android.view.View E;
    public com.tencent.mm.sdk.platformtools.b4 F;
    public hn4.b0 G;

    public c0(android.content.Context context) {
        super(context);
        this.E = this.f162472e.findViewById(com.tencent.mm.R.id.f485090gh5);
    }

    @Override // com.tencent.mm.plugin.websearch.widget.WebSearchVideoPlayerSeekBar, com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar
    public int getBarPointWidth() {
        return this.f162475h.getWidth();
    }

    @Override // com.tencent.mm.plugin.websearch.widget.WebSearchVideoPlayerSeekBar, com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489584d21;
    }

    @Override // com.tencent.mm.plugin.websearch.widget.WebSearchVideoPlayerSeekBar, com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar
    public void m() {
        super.m();
        hn4.b0 b0Var = this.G;
        if (b0Var != null) {
            int i17 = this.f162480p;
            int videoTotalTime = getVideoTotalTime();
            hn4.z zVar = ((hn4.k) b0Var).f282583a;
            int width = videoTotalTime > 0 ? (zVar.f264527y.getWidth() * i17) / videoTotalTime : 0;
            rm4.d dVar = ((com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI) zVar.getListVideoUIComponent()).H.f264479f;
            if (dVar != null && dVar.f397455d < ((com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI) zVar.getListVideoUIComponent()).f175126J.c()) {
                dVar.f397455d = ((com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI) zVar.getListVideoUIComponent()).f175126J.c();
            }
            if (((com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI) zVar.getListVideoUIComponent()).f175126J.d()) {
                int c17 = ((com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI) zVar.getListVideoUIComponent()).f175126J.c() / 1000;
                if (((wm4.p) i95.n0.c(wm4.p.class)).f447299f.containsKey(zVar.E.f390259h)) {
                    ((wm4.p) i95.n0.c(wm4.p.class)).f447299f.put(zVar.E.f390259h, java.lang.Integer.valueOf(c17));
                }
            }
            if (!(zVar.G.getVisibility() == 0)) {
                android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) zVar.f264526x.getLayoutParams();
                layoutParams.width = width;
                zVar.f264526x.setLayoutParams(layoutParams);
                zVar.f264526x.requestLayout();
                zVar.f264525w.setVisibility(0);
            }
            r45.xn6 xn6Var = zVar.E;
            int i18 = xn6Var.L & 256;
            fn4.b bVar = zVar.A;
            if (i18 <= 0) {
                bVar.g1(xn6Var, zVar, i17, videoTotalTime);
            }
            bVar.v6(zVar.E, zVar, i17, videoTotalTime);
        }
    }

    public void setFullScreenBtnClickListener(android.view.View.OnClickListener onClickListener) {
        this.E.setOnClickListener(onClickListener);
    }

    public void setOnUpdateProgressLenListener(hn4.b0 b0Var) {
        this.G = b0Var;
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        hn4.b0 b0Var;
        super.setVisibility(i17);
        if (i17 != 8 && i17 != 4) {
            if (i17 != 0 || (b0Var = this.G) == null) {
                return;
            }
            hn4.z zVar = ((hn4.k) b0Var).f282583a;
            zVar.f264525w.setVisibility(8);
            if (zVar.E.V != null) {
                android.view.View view = zVar.K;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer$10", "onControlBarVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer$10", "onControlBarVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) zVar.K.getLayoutParams();
                layoutParams.bottomMargin = i65.a.f(zVar.getContext(), com.tencent.mm.R.dimen.f479723df);
                zVar.K.setLayoutParams(layoutParams);
            }
            if (zVar.M.getVisibility() == 0) {
                android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) zVar.M.getLayoutParams();
                layoutParams2.bottomMargin = i65.a.f(zVar.getContext(), com.tencent.mm.R.dimen.f479723df);
                zVar.M.setLayoutParams(layoutParams2);
                return;
            }
            return;
        }
        hn4.b0 b0Var2 = this.G;
        if (b0Var2 != null) {
            hn4.z zVar2 = ((hn4.k) b0Var2).f282583a;
            if (zVar2.E.V != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryListVideoContainer", "longVideoInfo onControlBarGone");
                android.view.View view2 = zVar2.K;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer$10", "onControlBarGone", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer$10", "onControlBarGone", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (((com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI) zVar2.getListVideoUIComponent()).f175126J.f264576e && (((com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI) zVar2.getListVideoUIComponent()).f175126J.d() || ((com.tencent.mm.plugin.topstory.ui.video.TopStoryBaseVideoUI) zVar2.getListVideoUIComponent()).f175126J.f264577f)) {
                zVar2.f264525w.setVisibility(0);
            } else {
                zVar2.f264525w.setVisibility(8);
            }
            if (zVar2.M.getVisibility() == 0) {
                android.widget.RelativeLayout.LayoutParams layoutParams3 = (android.widget.RelativeLayout.LayoutParams) zVar2.M.getLayoutParams();
                layoutParams3.bottomMargin = i65.a.f(zVar2.getContext(), com.tencent.mm.R.dimen.f479738dv);
                zVar2.M.setLayoutParams(layoutParams3);
            }
        }
    }

    @Override // fn4.h
    public void w() {
        setVisibility(8);
    }

    @Override // fn4.h
    public void x() {
        setVisibility(0);
        this.f162476i.setVisibility(0);
        if (this.F == null) {
            this.F = new com.tencent.mm.sdk.platformtools.b4(new hn4.a0(this), false);
        }
        this.F.d();
        this.F.c(2000L, 2000L);
    }
}
