package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class am extends hx2.h {

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a f133784b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f133785c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC f133786d;

    public am(com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC finderHorizontalVideoDrawerUIC) {
        this.f133786d = finderHorizontalVideoDrawerUIC;
    }

    @Override // hx2.i
    public void b(gx2.q layout) {
        kotlin.jvm.internal.o.g(layout, "layout");
    }

    @Override // hx2.i
    public void c(gx2.q layout) {
        kotlin.jvm.internal.o.g(layout, "layout");
        com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC finderHorizontalVideoDrawerUIC = this.f133786d;
        finderHorizontalVideoDrawerUIC.f133589f = false;
        androidx.appcompat.app.AppCompatActivity activity = finderHorizontalVideoDrawerUIC.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((com.tencent.mm.plugin.finder.viewmodel.component.mn) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.mn.class)).T6().requestLayout();
        com.tencent.mars.xlog.Log.i("FinderHorizontalVideoDrawerUIC", "onDrawerExpand:");
    }

    @Override // hx2.i
    public void d(gx2.q layout) {
        kotlin.jvm.internal.o.g(layout, "layout");
    }

    @Override // hx2.i
    public void e(gx2.q layout) {
        kotlin.jvm.internal.o.g(layout, "layout");
        com.tencent.mars.xlog.Log.i("FinderHorizontalVideoDrawerUIC", "onDrawerPeek:");
        this.f133786d.f133589f = true;
        this.f133785c = false;
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar = this.f133784b;
        if (aVar != null) {
            aVar.c(false, false, 0);
        }
        this.f133784b = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // hx2.i
    public void g(gx2.q layout, float f17, java.lang.String source) {
        kotlin.jvm.internal.o.g(layout, "layout");
        kotlin.jvm.internal.o.g(source, "source");
        super.g(layout, f17, source);
        float borderExpand = ((f17 - layout.getBorderExpand()) * 1.0f) / ((layout.getBorderClose() - layout.getBorderExpand()) - layout.getF131934f());
        java.lang.Float valueOf = java.lang.Float.valueOf(0.0f);
        if (borderExpand < 0.0f) {
            borderExpand = 0.0f;
        }
        if (borderExpand > 1.0f) {
            borderExpand = 1.0f;
        }
        com.tencent.mars.xlog.Log.i("FinderHorizontalVideoDrawerUIC", "onTranslationChange: source=" + source + ", translation: " + f17 + ", percent: " + borderExpand + ", borderExpand=" + layout.getBorderExpand() + ", borderClose=" + layout.getBorderClose() + ", peekHeight=" + layout.getF131934f());
        boolean b17 = kotlin.jvm.internal.o.b(source, "onScroll");
        com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC finderHorizontalVideoDrawerUIC = this.f133786d;
        if (b17) {
            androidx.appcompat.app.AppCompatActivity activity = finderHorizontalVideoDrawerUIC.getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            ((com.tencent.mm.plugin.finder.viewmodel.component.mn) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.mn.class)).f135180e = 2;
        }
        if (!this.f133785c && borderExpand > 0.0f) {
            androidx.appcompat.app.AppCompatActivity activity2 = finderHorizontalVideoDrawerUIC.getActivity();
            kotlin.jvm.internal.o.g(activity2, "activity");
            in5.s0 R6 = ((com.tencent.mm.plugin.finder.viewmodel.component.mn) pf5.z.f353948a.a(activity2).a(com.tencent.mm.plugin.finder.viewmodel.component.mn.class)).R6();
            com.tencent.mm.plugin.finder.viewmodel.component.pm pmVar = null;
            pmVar = null;
            pmVar = null;
            if (R6 == null) {
                com.tencent.mars.xlog.Log.e("FinderHorizontalVideoDrawerUIC", "startVideoAnim: holder is null");
                finderHorizontalVideoDrawerUIC.W6();
            } else {
                finderHorizontalVideoDrawerUIC.f133592i = R6;
                com.tencent.mm.plugin.finder.view.FinderVideoBanner finderVideoBanner = (com.tencent.mm.plugin.finder.view.FinderVideoBanner) R6.p(com.tencent.mm.R.id.f484869fs3);
                cw2.da videoView = finderVideoBanner.getMediaView().getVideoView();
                finderVideoBanner.clearAnimation();
                if (videoView instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) {
                    mk4.b renderView = ((com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) videoView).getRenderView();
                    kotlin.jvm.internal.o.e(renderView, "null cannot be cast to non-null type android.view.View");
                    android.graphics.Rect rect = finderHorizontalVideoDrawerUIC.f133594n;
                    ((android.view.View) renderView).getGlobalVisibleRect(rect);
                    finderVideoBanner.getGlobalVisibleRect(new android.graphics.Rect());
                    if (rect.isEmpty()) {
                        com.tencent.mars.xlog.Log.e("FinderHorizontalVideoDrawerUIC", "startVideoAnim: is empty, sourceRect=" + rect);
                    } else {
                        com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout = (com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout) R6.p(com.tencent.mm.R.id.ghd);
                        if (finderFullSeekBarLayout != null) {
                            wu5.c hideSeekbarTask = finderFullSeekBarLayout.getHideSeekbarTask();
                            if (hideSeekbarTask != null) {
                                hideSeekbarTask.cancel(false);
                            }
                            cw2.ca.d(finderFullSeekBarLayout, "horizontalVideoAnimOpen", false, 2, null);
                            com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout.v(finderFullSeekBarLayout, false, 0L, true, 2, null);
                            finderFullSeekBarLayout.setPlayIconState(false);
                        }
                        finderHorizontalVideoDrawerUIC.V6(R6);
                        com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC.P6(finderHorizontalVideoDrawerUIC, R6);
                        finderHorizontalVideoDrawerUIC.U6(R6);
                        com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC.O6(finderHorizontalVideoDrawerUIC, R6);
                        if (!kotlin.jvm.internal.o.b(finderHorizontalVideoDrawerUIC.S6().getParent(), finderVideoBanner)) {
                            android.view.ViewParent parent = finderHorizontalVideoDrawerUIC.S6().getParent();
                            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                            if (viewGroup != null) {
                                viewGroup.removeView(finderHorizontalVideoDrawerUIC.S6());
                            }
                            finderVideoBanner.addView(finderHorizontalVideoDrawerUIC.S6(), -1, -1);
                        }
                        jz5.g gVar = finderHorizontalVideoDrawerUIC.f133596p;
                        ((android.view.View) ((jz5.n) gVar).getValue()).setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.om(finderHorizontalVideoDrawerUIC));
                        android.view.View view = (android.view.View) ((jz5.n) finderHorizontalVideoDrawerUIC.f133595o).getValue();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(0);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC", "startVideoAnim", "()Lcom/tencent/mm/view/drawer/RecyclerViewDrawerSquares$OnOpenDrawerListener;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC", "startVideoAnim", "()Lcom/tencent/mm/view/drawer/RecyclerViewDrawerSquares$OnOpenDrawerListener;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        finderHorizontalVideoDrawerUIC.S6().setVisibility(0);
                        finderHorizontalVideoDrawerUIC.S6().setAlpha(0.0f);
                        android.view.View view2 = (android.view.View) ((jz5.n) gVar).getValue();
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(valueOf);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC", "startVideoAnim", "()Lcom/tencent/mm/view/drawer/RecyclerViewDrawerSquares$OnOpenDrawerListener;", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                        yj0.a.f(view2, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC", "startVideoAnim", "()Lcom/tencent/mm/view/drawer/RecyclerViewDrawerSquares$OnOpenDrawerListener;", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        android.view.View R62 = finderHorizontalVideoDrawerUIC.R6();
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        arrayList3.add(valueOf);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(R62, arrayList3.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC", "startVideoAnim", "()Lcom/tencent/mm/view/drawer/RecyclerViewDrawerSquares$OnOpenDrawerListener;", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        R62.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
                        yj0.a.f(R62, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC", "startVideoAnim", "()Lcom/tencent/mm/view/drawer/RecyclerViewDrawerSquares$OnOpenDrawerListener;", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        android.view.View view3 = (android.view.View) ((jz5.n) gVar).getValue();
                        android.graphics.Rect rect2 = finderHorizontalVideoDrawerUIC.f133593m;
                        view3.getGlobalVisibleRect(rect2);
                        pmVar = new com.tencent.mm.plugin.finder.viewmodel.component.pm(R6, finderHorizontalVideoDrawerUIC, finderVideoBanner, rect.width() / 2.0f, rect.height() / 2.0f, (rect2.width() * 1.0f) / rect.width(), (rect2.height() * 1.0f) / rect.height(), rect2.centerX() - rect.centerX(), ((rect2.top + rect2.bottom) / 2.0f) - ((rect.top + rect.bottom) / 2.0f), finderVideoBanner.getTranslationX(), finderVideoBanner.getTranslationY());
                    }
                } else {
                    finderHorizontalVideoDrawerUIC.W6();
                    com.tencent.mars.xlog.Log.e("FinderHorizontalVideoDrawerUIC", "startVideoAnim: finderPlayView=" + videoView);
                }
            }
            this.f133784b = pmVar;
            if (pmVar != null) {
                this.f133785c = true;
            }
        }
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar = this.f133784b;
        if (aVar != null) {
            ((com.tencent.mm.plugin.finder.viewmodel.component.pm) aVar).a(borderExpand);
        }
    }
}
