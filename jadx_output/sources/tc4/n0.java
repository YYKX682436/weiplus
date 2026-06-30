package tc4;

/* loaded from: classes4.dex */
public final class n0 extends tc4.v0 implements xd4.d {
    public static final /* synthetic */ int N1 = 0;
    public final jz5.g A1;
    public final jz5.g B1;
    public final java.util.HashMap C1;
    public final jz5.g D1;
    public final jz5.g E1;
    public boolean F1;
    public boolean G1;
    public long H1;
    public long I1;
    public long J1;
    public long K1;
    public zy2.g5 L1;
    public kotlinx.coroutines.r2 M1;

    /* renamed from: y1, reason: collision with root package name */
    public android.view.View f417412y1;

    /* renamed from: z1, reason: collision with root package name */
    public android.view.View f417413z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.A1 = jz5.h.b(new tc4.k0(this));
        this.B1 = jz5.h.b(new tc4.f0(this));
        this.C1 = new java.util.HashMap();
        this.D1 = jz5.h.b(new tc4.l0(this));
        this.E1 = jz5.h.b(new tc4.e0(this));
        this.H1 = c01.id.c();
    }

    public static final /* synthetic */ android.view.View T(tc4.n0 n0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getFinderMediaLayout$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        android.view.View view = n0Var.f417413z1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getFinderMediaLayout$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        return view;
    }

    public static final /* synthetic */ android.view.View U(tc4.n0 n0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMemberWaterMark", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        android.view.View memberWaterMark = n0Var.getMemberWaterMark();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMemberWaterMark", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        return memberWaterMark;
    }

    public static final /* synthetic */ zy2.g5 V(tc4.n0 n0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getPlayerView$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        zy2.g5 g5Var = n0Var.L1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getPlayerView$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        return g5Var;
    }

    public static final /* synthetic */ java.lang.String W(tc4.n0 n0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getPublishId", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        java.lang.String publishId = n0Var.getPublishId();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getPublishId", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        return publishId;
    }

    public static final /* synthetic */ android.widget.ImageView X(tc4.n0 n0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getThumbImg", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        android.widget.ImageView thumbImg = n0Var.getThumbImg();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getThumbImg", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        return thumbImg;
    }

    public static final /* synthetic */ android.widget.FrameLayout Y(tc4.n0 n0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getVideoPlayerContainer", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        android.widget.FrameLayout videoPlayerContainer = n0Var.getVideoPlayerContainer();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getVideoPlayerContainer", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        return videoPlayerContainer;
    }

    public static final /* synthetic */ void Z(tc4.n0 n0Var, long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setPlayTimeMs$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        n0Var.J1 = j17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setPlayTimeMs$p", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
    }

    public static final void a0(tc4.n0 n0Var) {
        android.view.View loadingView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$showLoading", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        n0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showLoading", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        android.widget.FrameLayout videoPlayerContainer = n0Var.getVideoPlayerContainer();
        if (kotlin.jvm.internal.o.a(videoPlayerContainer != null ? java.lang.Float.valueOf(videoPlayerContainer.getAlpha()) : null, 1.0f) && (loadingView = n0Var.getLoadingView()) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(loadingView, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/improve/item/FinderMediaImproveTimelineItem", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            loadingView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(loadingView, "com/tencent/mm/plugin/sns/ui/improve/item/FinderMediaImproveTimelineItem", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showLoading", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$showLoading", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
    }

    private final r45.iv2 getFinderMedia() {
        xc4.p n17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFinderMedia", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        zc4.b data = getData();
        if (data == null || (n17 = data.n()) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFinderMedia", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            return null;
        }
        r45.kv2 kv2Var = n17.h1().ContentObj.f369844o;
        if (com.tencent.mm.sdk.platformtools.t8.L0(kv2Var.getList(7))) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFinderMedia", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            return null;
        }
        r45.iv2 iv2Var = (r45.iv2) kv2Var.getList(7).get(0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFinderMedia", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        return iv2Var;
    }

    private final android.view.View getLoadingView() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLoadingView", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        android.view.View view = (android.view.View) ((jz5.n) this.E1).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLoadingView", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        return view;
    }

    private final android.view.View getMemberWaterMark() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMemberWaterMark", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        android.view.View view = (android.view.View) ((jz5.n) this.B1).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMemberWaterMark", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        return view;
    }

    private final java.lang.String getPublishId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPublishId", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        java.lang.String stringExtra = ((android.app.Activity) context).getIntent().getStringExtra("new_feed_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPublishId", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        return stringExtra;
    }

    private final android.widget.ImageView getThumbImg() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getThumbImg", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) this.A1).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getThumbImg", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        return imageView;
    }

    private final android.widget.FrameLayout getVideoPlayerContainer() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVideoPlayerContainer", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ((jz5.n) this.D1).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoPlayerContainer", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        return frameLayout;
    }

    @Override // tc4.d2
    public java.lang.Object E(kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loadCustomItemInfo", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        java.lang.Object g17 = kotlinx.coroutines.l.g(kotlinx.coroutines.internal.b0.f310484a, new tc4.d0(this, null), continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadCustomItemInfo", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        return g17;
    }

    @Override // tc4.v0
    public android.view.View Q(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPositionView", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        android.view.View view = this.f417413z1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPositionView", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        return view;
    }

    public final void b0(android.view.ViewGroup.LayoutParams layoutParams) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calculateParamSize", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        r45.iv2 finderMedia = getFinderMedia();
        if (finderMedia == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calculateParamSize", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            return;
        }
        android.util.Pair k17 = m21.y.k((int) finderMedia.getFloat(3), (int) finderMedia.getFloat(4), getContext(), false);
        java.lang.Object first = k17.first;
        kotlin.jvm.internal.o.f(first, "first");
        layoutParams.width = ((java.lang.Number) first).intValue();
        java.lang.Object second = k17.second;
        kotlin.jvm.internal.o.f(second, "second");
        layoutParams.height = ((java.lang.Number) second).intValue();
        x("MicroMsg.Improve.FinderMediaTimelineItem", "calculateParamSize width:" + layoutParams.width + " height:" + layoutParams.height);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calculateParamSize", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
    }

    @Override // xd4.d
    public void c(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder, int i17) {
        xc4.p n17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.tav.core.AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        zc4.b data = getData();
        if (data == null || (n17 = data.n()) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.tav.core.AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            return;
        }
        ((c61.s9) ((c50.b1) i95.n0.c(c50.b1.class))).getClass();
        boolean z17 = false;
        if (!(((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f128008we).getValue()).r()).intValue() == 1)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.tav.core.AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            return;
        }
        r45.kv2 kv2Var = n17.h1().ContentObj.f369844o;
        if ((kv2Var.getInteger(25) & 4) > 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.tav.core.AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            return;
        }
        kotlinx.coroutines.r2 r2Var = this.M1;
        if (r2Var != null && r2Var.a()) {
            z17 = true;
        }
        if (z17) {
            x("MicroMsg.Improve.FinderMediaTimelineItem", "play 1#1");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.tav.core.AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            return;
        }
        xd4.o0.d().j();
        xd4.g.a().d(this);
        this.M1 = kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new tc4.j0(this, kv2Var, null), 3, null);
        x("MicroMsg.Improve.FinderMediaTimelineItem", "play 4");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.tav.core.AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
    }

    public final void c0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dismissLoading", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        android.view.View loadingView = getLoadingView();
        if (loadingView != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(loadingView, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/improve/item/FinderMediaImproveTimelineItem", "dismissLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            loadingView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(loadingView, "com/tencent/mm/plugin/sns/ui/improve/item/FinderMediaImproveTimelineItem", "dismissLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dismissLoading", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
    }

    public final void d0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopPlay", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        x("MicroMsg.Improve.FinderMediaTimelineItem", "stopPlay " + this.L1);
        if (this.K1 != 0) {
            this.J1 += c01.id.c() - this.K1;
        }
        kotlinx.coroutines.r2 r2Var = this.M1;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        java.lang.Object obj = this.L1;
        java.lang.Object obj2 = obj instanceof zy2.p7 ? (zy2.p7) obj : null;
        if (obj2 != null) {
            ((com.tencent.mm.plugin.finder.video.FinderAutoSeekTPProxy) obj2).p0("errorToStop");
        }
        java.lang.Object obj3 = this.L1;
        android.view.View view = obj3 instanceof android.view.View ? (android.view.View) obj3 : null;
        if (view != null) {
            android.view.ViewParent parent = view.getParent();
            x("MicroMsg.Improve.FinderMediaTimelineItem", "stopPlay removeView " + this.L1);
            android.widget.FrameLayout videoPlayerContainer = getVideoPlayerContainer();
            if (videoPlayerContainer != null) {
                videoPlayerContainer.removeView(view);
            }
            if (kotlin.jvm.internal.o.b(parent, getVideoPlayerContainer()) || parent == null) {
                zy2.g5 g5Var = this.L1;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("asyncReleasePlayer", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
                pm0.v.O("MicroMsg.Improve.FinderMediaTimelineItem", new tc4.b0(g5Var, this));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("asyncReleasePlayer", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            }
        }
        zy2.g5 g5Var2 = this.L1;
        zy2.p7 p7Var = g5Var2 instanceof zy2.p7 ? (zy2.p7) g5Var2 : null;
        if (p7Var != null) {
            ((com.tencent.mm.plugin.finder.video.FinderFluentVideoView) p7Var).q0();
        }
        this.L1 = null;
        kotlinx.coroutines.r2 r2Var2 = this.M1;
        if (r2Var2 != null) {
            kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
        }
        this.G1 = false;
        this.K1 = 0L;
        c0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopPlay", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
    }

    @Override // xd4.d
    public void e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        x("MicroMsg.Improve.FinderMediaTimelineItem", "onUIPause " + this.L1);
        java.lang.Object obj = this.L1;
        android.view.View view = obj instanceof android.view.View ? (android.view.View) obj : null;
        if (kotlin.jvm.internal.o.b(view != null ? view.getParent() : null, getVideoPlayerContainer())) {
            zy2.g5 g5Var = this.L1;
            zy2.p7 p7Var = g5Var instanceof zy2.p7 ? (zy2.p7) g5Var : null;
            boolean z17 = false;
            if (p7Var != null && ((com.tencent.mm.plugin.finder.video.FinderFluentVideoView) p7Var).isFluentView) {
                z17 = true;
            }
            if (!z17) {
                d0();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
                return;
            }
        }
        x("MicroMsg.Improve.FinderMediaTimelineItem", "onUIPause " + this.L1 + " return for detach.");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
    }

    @Override // xd4.d
    public android.graphics.Rect getDisplayRect() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        android.widget.FrameLayout videoPlayerContainer = getVideoPlayerContainer();
        if (videoPlayerContainer == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            return null;
        }
        int[] iArr = new int[2];
        videoPlayerContainer.getLocationOnScreen(iArr);
        int i17 = iArr[0];
        int i18 = iArr[1];
        android.graphics.Rect rect = new android.graphics.Rect(i17, i18, videoPlayerContainer.getMeasuredWidth() + i17, videoPlayerContainer.getMeasuredHeight() + i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        return rect;
    }

    @Override // tc4.x1
    public int getViewType() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewType", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        return 18;
    }

    @Override // tc4.v0, uc4.f1, tc4.s0
    public java.lang.Object h(in5.s0 s0Var, zc4.b bVar, int i17, boolean z17, kotlin.coroutines.Continuation continuation) {
        uc4.g gVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        java.util.Iterator it = uc4.f1.J(this).iterator();
        while (true) {
            if (!it.hasNext()) {
                gVar = null;
                break;
            }
            gVar = (uc4.g) it.next();
            if (gVar instanceof uc4.g0) {
                break;
            }
        }
        if (gVar == null) {
            java.util.ArrayList<uc4.g> clickInstanceList = getClickInstanceList();
            android.content.Context context = getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            uc4.g0 g0Var = new uc4.g0(context, new tc4.g0(this));
            uc4.g.l(g0Var, this.f417413z1, false, true, false, 10, null);
            clickInstanceList.add(g0Var);
        }
        java.lang.Object h17 = super.h(s0Var, bVar, i17, z17, continuation);
        if (h17 == pz5.a.f359186d) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            return h17;
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        return f0Var;
    }

    @Override // tc4.x1
    public jz5.l k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildCustomView", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.crp, (android.view.ViewGroup) this, false);
        this.f417412y1 = inflate;
        this.f417413z1 = inflate != null ? inflate.findViewById(com.tencent.mm.R.id.n8j) : null;
        android.view.View view = this.f417412y1;
        android.view.View findViewById = view != null ? view.findViewById(com.tencent.mm.R.id.cks) : null;
        if (findViewById != null) {
            findViewById.setTag("KEY_INTENT_COVER_CONTAINER_TAG");
        }
        if (pc4.d.f353410a.x()) {
            android.view.View view2 = this.f417413z1;
            android.widget.ImageView imageView = view2 != null ? (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.n8n) : null;
            float b17 = i65.a.b(getContext(), 2);
            if (imageView != null) {
                imageView.setOutlineProvider(new zl5.a(true, true, b17));
            }
            if (imageView != null) {
                imageView.setClipToOutline(true);
            }
        }
        android.util.Pair j17 = m21.y.j(getContext());
        java.lang.Object first = j17.first;
        kotlin.jvm.internal.o.f(first, "first");
        int intValue = ((java.lang.Number) first).intValue();
        java.lang.Object second = j17.second;
        kotlin.jvm.internal.o.f(second, "second");
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams = new androidx.constraintlayout.widget.ConstraintLayout.LayoutParams(intValue, ((java.lang.Number) second).intValue());
        b0(layoutParams);
        android.view.View view3 = this.f417412y1;
        kotlin.jvm.internal.o.d(view3);
        jz5.l lVar = new jz5.l(view3, layoutParams);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildCustomView", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        return lVar;
    }

    @Override // tc4.x1, tc4.s0
    public java.lang.String name() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        return "FinderImproveMediaTimelineItem";
    }

    @Override // tc4.i2
    public void o() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("customLayoutMeasureForReuse", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        super.o();
        android.view.View view = this.f417412y1;
        android.view.ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
        if (layoutParams == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("customLayoutMeasureForReuse", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
            return;
        }
        b0(layoutParams);
        android.view.View view2 = this.f417412y1;
        if (view2 != null) {
            view2.setLayoutParams(layoutParams);
        }
        android.widget.ImageView thumbImg = getThumbImg();
        if (thumbImg != null) {
            thumbImg.setImageResource(com.tencent.mm.R.color.f478492d);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("customLayoutMeasureForReuse", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
    }

    @Override // xd4.d
    public void pause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pause", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        x("MicroMsg.Improve.FinderMediaTimelineItem", "pause " + this.L1);
        d0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pause", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
    }

    @Override // xd4.d
    public void stop() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stop", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
        x("MicroMsg.Improve.FinderMediaTimelineItem", "stop " + this.L1);
        d0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stop", "com.tencent.mm.plugin.sns.ui.improve.item.FinderMediaImproveTimelineItem");
    }
}
