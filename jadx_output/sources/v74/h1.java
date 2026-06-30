package v74;

/* loaded from: classes4.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public final v74.t f433801a;

    /* renamed from: b, reason: collision with root package name */
    public final v74.z0 f433802b;

    /* renamed from: c, reason: collision with root package name */
    public final v74.v0 f433803c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.RoundedCornerFrameLayout f433804d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.ViewGroup f433805e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f433806f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f433807g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.a f433808h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.l f433809i;

    /* renamed from: j, reason: collision with root package name */
    public yz5.a f433810j;

    /* renamed from: k, reason: collision with root package name */
    public final int f433811k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f433812l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f433813m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f433814n;

    /* renamed from: o, reason: collision with root package name */
    public v74.l f433815o;

    /* renamed from: p, reason: collision with root package name */
    public v74.s f433816p;

    /* renamed from: q, reason: collision with root package name */
    public int f433817q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f433818r;

    /* renamed from: s, reason: collision with root package name */
    public final yz5.p f433819s;

    /* renamed from: t, reason: collision with root package name */
    public android.animation.Animator f433820t;

    public h1(v74.t mLookbookContext, v74.z0 mVideoPlayManager, v74.v0 mAdLookbookStatistic) {
        kotlin.jvm.internal.o.g(mLookbookContext, "mLookbookContext");
        kotlin.jvm.internal.o.g(mVideoPlayManager, "mVideoPlayManager");
        kotlin.jvm.internal.o.g(mAdLookbookStatistic, "mAdLookbookStatistic");
        this.f433801a = mLookbookContext;
        this.f433802b = mVideoPlayManager;
        this.f433803c = mAdLookbookStatistic;
        this.f433811k = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 12);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSplashCardStub", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$LookbookContext");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSplashCardStub", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$LookbookContext");
        android.view.ViewStub viewStub = mLookbookContext.f433919h;
        if (viewStub != null && this.f433804d == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSplashCardStub", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$LookbookContext");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSplashCardStub", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$LookbookContext");
            android.view.View inflate = viewStub != null ? viewStub.inflate() : null;
            this.f433804d = inflate instanceof com.tencent.mm.ui.widget.RoundedCornerFrameLayout ? (com.tencent.mm.ui.widget.RoundedCornerFrameLayout) inflate : null;
        }
        com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout = this.f433804d;
        if (roundedCornerFrameLayout != null) {
            this.f433805e = (android.view.ViewGroup) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.oy7);
            this.f433806f = (android.widget.ImageView) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.cl6);
            android.widget.ImageView imageView = (android.widget.ImageView) roundedCornerFrameLayout.findViewById(com.tencent.mm.R.id.p0h);
            this.f433807g = imageView;
            if (imageView != null) {
                imageView.setImageDrawable(i65.a.i(roundedCornerFrameLayout.getContext(), com.tencent.mm.R.raw.shortvideo_play_btn));
            }
            roundedCornerFrameLayout.setOnClickListener(new v74.c1(this));
            roundedCornerFrameLayout.setRadius(i65.a.b(roundedCornerFrameLayout.getContext(), 8));
        }
        this.f433818r = new com.tencent.mm.sdk.platformtools.b4(new v74.e1(this), true);
        this.f433819s = new v74.d1(this);
    }

    public static final android.view.View a(v74.h1 h1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getFirstItemView", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
        h1Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFirstItemView", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
        com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView b17 = h1Var.f433801a.b();
        androidx.recyclerview.widget.k3 p07 = b17 != null ? b17.p0(0) : null;
        v74.b bVar = p07 instanceof v74.b ? (v74.b) p07 : null;
        android.view.View view = bVar != null ? bVar.itemView : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFirstItemView", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getFirstItemView", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
        return view;
    }

    public final boolean b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSplashCardVisible", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
        boolean z17 = false;
        com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout = this.f433804d;
        if (roundedCornerFrameLayout != null && roundedCornerFrameLayout.getVisibility() == 0) {
            z17 = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSplashCardVisible", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
        return z17;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r8 = this;
            java.lang.String r0 = "pauseVideo"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            v74.l r2 = r8.f433815o
            if (r2 != 0) goto L10
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        L10:
            java.lang.String r2 = "SplashCardLogic"
            java.lang.String r3 = "pausePlay"
            com.tencent.mars.xlog.Log.i(r2, r3)
            java.lang.String r2 = "getVideoViewInContainer"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookVideoManager$Companion"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            android.view.ViewGroup r4 = r8.f433805e
            boolean r5 = a84.y0.e(r4)
            r6 = 0
            r7 = 0
            if (r5 == 0) goto L3c
            if (r4 == 0) goto L30
            android.view.View r4 = r4.getChildAt(r6)
            goto L31
        L30:
            r4 = r7
        L31:
            boolean r5 = r4 instanceof com.tencent.mm.plugin.sns.ui.OnlineVideoView
            if (r5 == 0) goto L3c
            r7 = r4
            com.tencent.mm.plugin.sns.ui.OnlineVideoView r7 = (com.tencent.mm.plugin.sns.ui.OnlineVideoView) r7
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            goto L3f
        L3c:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
        L3f:
            if (r7 == 0) goto L44
            r7.F()
        L44:
            r8.g()
            android.widget.ImageView r2 = r8.f433807g
            if (r2 != 0) goto L4c
            goto L4f
        L4c:
            r2.setVisibility(r6)
        L4f:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v74.h1.c():void");
    }

    public final void d(v74.l lVar, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17, v74.s itemSize, boolean z17) {
        android.widget.ImageView imageView;
        android.app.Activity activity;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refresh", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
        kotlin.jvm.internal.o.g(itemSize, "itemSize");
        com.tencent.mars.xlog.Log.i("SplashCardLogic", "refresh, isRefresh=" + z17 + ", snsId=" + ca4.z0.y0(snsInfo) + ", hash=" + hashCode() + ", Info=" + lVar + ", itemSize=" + itemSize);
        if (lVar != null) {
            r45.jj4 a17 = lVar.a();
            float f17 = a17 != null ? a17.R : 0.0f;
            v74.v0 v0Var = this.f433803c;
            v0Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSplashCardExposure", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
            if (v0Var.f433938h == null) {
                com.tencent.mars.xlog.Log.i("AdLookbookStatistic.splashCard", "onSplashCardExposure, duration=" + f17);
                v74.u0 u0Var = new v74.u0();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDurationMs", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic$ItemData");
                u0Var.f433922a = (int) (1000 * f17);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDurationMs", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic$ItemData");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setExposureCount", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic$ItemData");
                u0Var.f433928g = 1;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setExposureCount", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic$ItemData");
                v0Var.f433938h = u0Var;
                com.tencent.mars.xlog.Log.i("AdLookbookStatistic.splashCard", "onSplashCardExposure, duration=" + f17);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSplashCardExposure", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
        }
        if (!z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refresh", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
            return;
        }
        this.f433816p = itemSize;
        this.f433814n = snsInfo;
        this.f433817q = i17;
        this.f433815o = lVar;
        this.f433813m = false;
        v74.t tVar = this.f433801a;
        tVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getActivity", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$LookbookContext");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getActivity", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$LookbookContext");
        if (lVar == null || snsInfo == null || (imageView = this.f433806f) == null || (activity = tVar.f433912a) == null) {
            e(false);
            g();
        } else {
            e(true);
            l44.c0.b(snsInfo, lVar.a());
            com.tencent.mm.plugin.sns.model.i1 hj6 = com.tencent.mm.plugin.sns.model.l4.hj();
            r45.jj4 a18 = lVar.a();
            int hashCode = activity.hashCode();
            com.tencent.mm.storage.s7 s7Var = com.tencent.mm.storage.s7.f195308l;
            s7Var.f195313b = snsInfo.getTimeLine().CreateTime;
            hj6.l0(a18, imageView, -1, hashCode, s7Var);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refresh", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0054, code lost:
    
        if (r4 != r10) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(boolean r12) {
        /*
            r11 = this;
            java.lang.String r0 = "resetUI"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "resetUI, isShow="
            r2.<init>(r3)
            r2.append(r12)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "SplashCardLogic"
            com.tencent.mars.xlog.Log.i(r3, r2)
            v74.s r2 = r11.f433816p
            if (r2 != 0) goto L24
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        L24:
            v74.t r3 = r11.f433801a
            r4 = 1065353216(0x3f800000, float:1.0)
            com.tencent.mm.ui.widget.RoundedCornerFrameLayout r5 = r11.f433804d
            r6 = 0
            if (r12 == 0) goto L99
            r12 = 0
            if (r5 == 0) goto L76
            r5.setAlpha(r4)
            r5.setVisibility(r12)
            android.view.ViewGroup$LayoutParams r4 = r5.getLayoutParams()
            int r4 = r4.width
            int r7 = r2.b()
            java.lang.String r8 = "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$ItemSize"
            java.lang.String r9 = "getSplashCardHeight"
            int r10 = r2.f433887b
            if (r4 != r7) goto L56
            android.view.ViewGroup$LayoutParams r4 = r5.getLayoutParams()
            int r4 = r4.height
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r8)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r8)
            if (r4 == r10) goto L6f
        L56:
            android.view.ViewGroup$LayoutParams r4 = r5.getLayoutParams()
            int r7 = r2.b()
            r4.width = r7
            android.view.ViewGroup$LayoutParams r4 = r5.getLayoutParams()
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r8)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r8)
            r4.height = r10
            r5.requestLayout()
        L6f:
            yz5.a r4 = r11.f433808h
            if (r4 == 0) goto L76
            r4.invoke()
        L76:
            com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView r3 = r3.b()
            if (r3 == 0) goto L95
            r3.setAlpha(r6)
            java.lang.String r4 = "getInitTranslationX"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r1)
            int r5 = r11.f433817q
            int r2 = r2.a()
            int r5 = r5 - r2
            int r2 = r11.f433811k
            int r5 = r5 - r2
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r1)
            float r2 = (float) r5
            r3.setTranslationX(r2)
        L95:
            r11.f(r12)
            goto Lb3
        L99:
            if (r5 == 0) goto La3
            r5.setAlpha(r6)
            r12 = 8
            r5.setVisibility(r12)
        La3:
            com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView r12 = r3.b()
            if (r12 == 0) goto Laf
            r12.setAlpha(r4)
            r12.setTranslationX(r6)
        Laf:
            r12 = 1
            r11.f(r12)
        Lb3:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v74.h1.e(boolean):void");
    }

    public final void f(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setRecyclerViewActive", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
        com.tencent.mars.xlog.Log.i("SplashCardLogic", "setRecyclerViewActive, isActive=" + z17);
        com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView b17 = this.f433801a.b();
        if (b17 != null) {
            b17.setActive(z17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRecyclerViewActive", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
    }

    public final void g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopVideoUpdateTimer", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
        com.tencent.mars.xlog.Log.i("SplashCardLogic", "stopVideoUpdateTimer");
        this.f433818r.d();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopVideoUpdateTimer", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
    }
}
