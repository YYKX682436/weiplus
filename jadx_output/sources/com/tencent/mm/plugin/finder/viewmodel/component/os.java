package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class os extends com.tencent.mm.plugin.finder.view.HorizontalLivePreviewLayout {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.pt f135483g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public os(com.tencent.mm.plugin.finder.viewmodel.component.pt ptVar, android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f135483g = ptVar;
        int dimension = (int) getResources().getDimension(com.tencent.mm.R.dimen.f479718db);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(dimension, dimension);
        layoutParams.topMargin = (int) getResources().getDimension(com.tencent.mm.R.dimen.f479688cn);
        layoutParams.setMarginStart((int) getResources().getDimension(com.tencent.mm.R.dimen.f479723df));
        layoutParams.gravity = 8388611;
        getIconLayout().setLayoutParams(layoutParams);
        getIconLayout().setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.ks(ptVar));
        getIconLayout();
        float f17 = dimension / 2.0f;
        getIconLayout().setPivotX(f17);
        getIconLayout().setPivotY(f17);
    }

    public static final void a(com.tencent.mm.plugin.finder.viewmodel.component.os osVar, in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, int i17) {
        osVar.getClass();
        com.tencent.mm.plugin.finder.viewmodel.component.js jsVar = com.tencent.mm.plugin.finder.viewmodel.component.js.f134890h;
        com.tencent.mm.plugin.finder.viewmodel.component.pt ptVar = osVar.f135483g;
        ptVar.f135624y = jsVar;
        ptVar.c7(s0Var, baseFinderFeed);
        androidx.recyclerview.widget.f2 f2Var = s0Var.f293122f;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = f2Var instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) f2Var : null;
        java.lang.Object w07 = wxRecyclerAdapter != null ? wxRecyclerAdapter.w0(s0Var.getItemViewType()) : null;
        com.tencent.mm.plugin.finder.convert.zf zfVar = w07 instanceof com.tencent.mm.plugin.finder.convert.zf ? (com.tencent.mm.plugin.finder.convert.zf) w07 : null;
        if (zfVar != null) {
            android.view.View itemView = s0Var.itemView;
            kotlin.jvm.internal.o.f(itemView, "itemView");
            com.tencent.mm.protocal.protobuf.FinderObject finderObj = baseFinderFeed.getFeedObject().getFeedObject();
            kotlin.jvm.internal.o.g(finderObj, "finderObj");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KEY_FEED_ENTER_CLICK_AREA", i17);
            intent.putExtra("KEY_ENTER_LIVE_ON_LANDSCAPE", true);
            zfVar.s0(s0Var, itemView, finderObj, null, intent);
        }
    }

    private final void setLandscapeLiveBullet(in5.s0 s0Var) {
        cg2.k kVar;
        androidx.recyclerview.widget.f2 f2Var = s0Var.f293122f;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = f2Var instanceof com.tencent.mm.view.recyclerview.WxRecyclerAdapter ? (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) f2Var : null;
        java.lang.Object w07 = wxRecyclerAdapter != null ? wxRecyclerAdapter.w0(s0Var.getItemViewType()) : null;
        com.tencent.mm.plugin.finder.convert.zf zfVar = w07 instanceof com.tencent.mm.plugin.finder.convert.zf ? (com.tencent.mm.plugin.finder.convert.zf) w07 : null;
        if (zfVar != null) {
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) s0Var.p(com.tencent.mm.R.id.uah);
            com.tencent.mm.plugin.finder.viewmodel.component.pt ptVar = this.f135483g;
            ptVar.I = frameLayout;
            if (frameLayout != null) {
                android.view.ViewParent parent = frameLayout.getParent();
                kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
                ptVar.F = viewGroup;
                ptVar.G = viewGroup.indexOfChild(ptVar.I);
                android.widget.FrameLayout frameLayout2 = ptVar.I;
                kotlin.jvm.internal.o.d(frameLayout2);
                ptVar.H = frameLayout2.getLayoutParams();
                uc2.b bVar = (uc2.b) zfVar.f104851e.a(s0Var, uc2.b.class);
                if (bVar != null) {
                    bg2.x0 x0Var = (bg2.x0) bVar;
                    if (x0Var.f20619n && (kVar = x0Var.f20616h) != null) {
                        kVar.setReuse(true);
                    }
                }
                android.view.ViewGroup viewGroup2 = ptVar.F;
                if (viewGroup2 != null) {
                    viewGroup2.removeView(frameLayout);
                }
                android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
                layoutParams.topMargin = getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479738dv);
                addView(frameLayout, 2, layoutParams);
                zfVar.R1(s0Var, frameLayout, false);
            }
        }
    }

    public final boolean b(in5.s0 focusHolder, com.tencent.mm.plugin.finder.model.BaseFinderFeed item) {
        java.lang.String valueOf;
        kotlin.jvm.internal.o.g(focusHolder, "focusHolder");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) focusHolder.p(com.tencent.mm.R.id.e_k);
        if (finderVideoLayout != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderVideoOrientationUIC addPreview: videoView = ");
            sb6.append(finderVideoLayout.getVideoView());
            sb6.append(", activity = ");
            com.tencent.mm.plugin.finder.viewmodel.component.pt ptVar = this.f135483g;
            sb6.append(ptVar.getActivity().getClass().getSimpleName());
            com.tencent.mars.xlog.Log.i("HorizontalLivePreviewLayout", sb6.toString());
            if (!(finderVideoLayout.getVideoView() instanceof cw2.u9)) {
                finderVideoLayout = null;
            }
            if (finderVideoLayout != null) {
                finderVideoLayout.getPlayInfo();
                ptVar.getClass();
                dw2.c0 v17 = finderVideoLayout.getVideoCore().v();
                if (v17 != null) {
                    dw2.c0.h(v17, "FinderHDRVideoOrientationUIC", true, false, 4, null);
                }
                cw2.da videoView = finderVideoLayout.getVideoView();
                kotlin.jvm.internal.o.d(videoView);
                ptVar.f135613n = videoView.getVideoView();
                focusHolder.o().post(new com.tencent.mm.plugin.finder.viewmodel.component.ns(focusHolder, ptVar));
                androidx.appcompat.app.AppCompatActivity activity = ptVar.getActivity();
                kotlin.jvm.internal.o.g(activity, "activity");
                qt2.b0 b0Var = (qt2.b0) pf5.z.f353948a.a(activity).e(qt2.b0.class);
                if (b0Var != null) {
                    b0Var.b7();
                }
                videoView.setPreview(true);
                videoView.setInterceptDetach(true);
                ptVar.P6(false);
                androidx.recyclerview.widget.RecyclerView o17 = focusHolder.o();
                com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView finderRecyclerView = o17 instanceof com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView ? (com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView) o17 : null;
                if (finderRecyclerView != null) {
                    finderRecyclerView.V0(finderRecyclerView.getScrollEventAdapter());
                }
                android.view.ViewParent parent = videoView.getVideoView().getParent();
                kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
                ptVar.f135610h = viewGroup;
                ptVar.f135611i = viewGroup.indexOfChild(videoView.getVideoView());
                ptVar.f135612m = new android.view.ViewGroup.LayoutParams(videoView.getVideoView().getWidth(), videoView.getVideoView().getHeight());
                android.view.ViewGroup viewGroup2 = ptVar.f135610h;
                if (viewGroup2 != null) {
                    viewGroup2.removeView(videoView.getVideoView());
                }
                android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
                layoutParams.gravity = 17;
                float videoRatio = ((cw2.u9) videoView).getVideoRatio();
                int i17 = ptVar.getActivity().getResources().getDisplayMetrics().widthPixels;
                int i18 = ptVar.getActivity().getResources().getDisplayMetrics().heightPixels;
                if (i17 < i18) {
                    i17 = i18;
                }
                int i19 = ptVar.getActivity().getResources().getDisplayMetrics().widthPixels;
                int i27 = ptVar.getActivity().getResources().getDisplayMetrics().heightPixels;
                if (i19 > i27) {
                    i19 = i27;
                }
                float f17 = i17;
                float f18 = i19;
                float f19 = (1.0f * f17) / f18;
                if ((videoRatio == 0.0f) || videoRatio >= f19) {
                    layoutParams.width = i17;
                    layoutParams.height = a06.d.b(f17 / videoRatio);
                } else {
                    layoutParams.width = a06.d.b(f18 * videoRatio);
                    layoutParams.height = i19;
                }
                addView(videoView.getVideoView(), 1, layoutParams);
                getLiveRecommendView().setVisibility(0);
                com.tencent.mm.plugin.finder.view.FinderFeedLiveRecommendView liveRecommendView = getLiveRecommendView();
                r45.nw1 liveInfo = item.getFeedObject().getLiveInfo();
                r45.nw1 liveInfo2 = item.getFeedObject().getLiveInfo();
                liveRecommendView.b(liveInfo, liveInfo2 != null ? liveInfo2.getInteger(2) : 2);
                getLiveRecommendView().setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.ls(this, focusHolder, item));
                getBgView().setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.ms(this, focusHolder, item));
                setLandscapeLiveBullet(focusHolder);
                ml2.t1 t1Var = ml2.t1.f327969n3;
                jz5.l[] lVarArr = new jz5.l[2];
                r45.nw1 liveInfo3 = item.getFeedObject().getLiveInfo();
                lVarArr[0] = new jz5.l("liveId", java.lang.String.valueOf(liveInfo3 != null ? java.lang.Long.valueOf(liveInfo3.getLong(0)) : null));
                if (ptVar.A) {
                    ml2.z2[] z2VarArr = ml2.z2.f328341d;
                    valueOf = java.lang.String.valueOf(1);
                } else {
                    ml2.z2[] z2VarArr2 = ml2.z2.f328341d;
                    valueOf = java.lang.String.valueOf(2);
                }
                lVarArr[1] = new jz5.l("mode_type", valueOf);
                ptVar.d7(focusHolder, item, t1Var, kz5.c1.l(lVarArr));
                return true;
            }
        }
        return false;
    }
}
