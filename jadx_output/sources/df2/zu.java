package df2;

/* loaded from: classes3.dex */
public final class zu extends if2.b implements mf2.q {

    /* renamed from: m, reason: collision with root package name */
    public boolean f232000m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f232001n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zu(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v20, types: [android.view.View] */
    @Override // mf2.q
    public void D3(java.lang.Object panelObject) {
        boolean z17;
        com.tencent.mm.plugin.finder.live.widget.FinderLiveViewBottomSheetPanel finderLiveViewBottomSheetPanel;
        com.tencent.mm.plugin.finder.live.widget.FinderLiveViewBottomSheetPanel finderLiveViewBottomSheetPanel2;
        kotlin.jvm.internal.o.g(panelObject, "panelObject");
        com.tencent.mm.plugin.finder.live.widget.g gVar = panelObject instanceof com.tencent.mm.plugin.finder.live.widget.g ? (com.tencent.mm.plugin.finder.live.widget.g) panelObject : null;
        com.tencent.mm.plugin.finder.live.widget.io ioVar = panelObject instanceof com.tencent.mm.plugin.finder.live.widget.io ? (com.tencent.mm.plugin.finder.live.widget.io) panelObject : null;
        com.tencent.mm.plugin.finder.live.widget.FinderLiveViewBottomSheetPanel finderLiveViewBottomSheetPanel3 = panelObject instanceof com.tencent.mm.plugin.finder.live.widget.FinderLiveViewBottomSheetPanel ? (com.tencent.mm.plugin.finder.live.widget.FinderLiveViewBottomSheetPanel) panelObject : null;
        if (O6().getResources().getConfiguration().orientation != 2) {
            return;
        }
        if (gVar != null) {
            z17 = gVar.f118384g.f444853t;
        } else if (ioVar != null) {
            z17 = ioVar.I;
        } else if (finderLiveViewBottomSheetPanel3 == null) {
            return;
        } else {
            z17 = !finderLiveViewBottomSheetPanel3.getUseCenterLandScapeStyle();
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("LiveVideoAdjustForPanelController", "Panel opened with newLandscapeStyle=true in landscape mode, adjust video layout");
            android.util.DisplayMetrics displayMetrics = O6().getResources().getDisplayMetrics();
            int i17 = displayMetrics.widthPixels;
            int i18 = displayMetrics.heightPixels;
            if (gVar != null) {
                finderLiveViewBottomSheetPanel2 = gVar.f118384g.f444837d;
            } else {
                if (ioVar == null) {
                    if (finderLiveViewBottomSheetPanel3 != null) {
                        finderLiveViewBottomSheetPanel = finderLiveViewBottomSheetPanel3;
                        finderLiveViewBottomSheetPanel.getViewTreeObserver().addOnGlobalLayoutListener(new df2.wu(finderLiveViewBottomSheetPanel, this, i17, i18, gVar, ioVar, finderLiveViewBottomSheetPanel3, panelObject));
                    }
                    return;
                }
                finderLiveViewBottomSheetPanel2 = ioVar.f212027f;
            }
            finderLiveViewBottomSheetPanel = finderLiveViewBottomSheetPanel2;
            finderLiveViewBottomSheetPanel.getViewTreeObserver().addOnGlobalLayoutListener(new df2.wu(finderLiveViewBottomSheetPanel, this, i17, i18, gVar, ioVar, finderLiveViewBottomSheetPanel3, panelObject));
        }
    }

    @Override // mf2.q
    public void L1(java.lang.Object panelObject, int i17) {
        kotlin.jvm.internal.o.g(panelObject, "panelObject");
    }

    @Override // mf2.q
    public void P3(java.lang.Object panelObject) {
        jz5.f0 f0Var;
        android.view.Window b17;
        kotlin.jvm.internal.o.g(panelObject, "panelObject");
        if (!this.f232000m) {
            com.tencent.mars.xlog.Log.i("LiveVideoAdjustForPanelController", "onPanelClose, no need to reset video layout");
            return;
        }
        com.tencent.mars.xlog.Log.i("LiveVideoAdjustForPanelController", "onPanelClose, reset video layout");
        com.tencent.mm.live.core.view.LiveVideoView Z6 = Z6();
        if (Z6 == null) {
            return;
        }
        if (panelObject instanceof com.tencent.mm.plugin.finder.live.widget.g) {
            com.tencent.mm.ui.widget.dialog.y1 y1Var = ((com.tencent.mm.plugin.finder.live.widget.g) panelObject).f118384g.f444836c;
            if (y1Var != null && (b17 = y1Var.b()) != null) {
                b17.setDimAmount(0.5f);
            }
        } else if (panelObject instanceof com.tencent.mm.plugin.finder.live.widget.io) {
            android.view.Window b18 = ((com.tencent.mm.plugin.finder.live.widget.io) panelObject).b();
            if (b18 != null) {
                b18.setDimAmount(0.5f);
            }
        } else if (panelObject instanceof com.tencent.mm.plugin.finder.live.widget.FinderLiveViewBottomSheetPanel) {
            android.view.View view = this.f232001n;
            if (view != null) {
                view.setBackgroundColor(b3.l.getColor(O6(), com.tencent.mm.R.color.f479319w5));
                com.tencent.mars.xlog.Log.i("LiveVideoAdjustForPanelController", "resetVideoLayout: FinderLiveViewBottomSheetPanel parent background restored to live_half_black_bg");
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.i("LiveVideoAdjustForPanelController", "resetVideoLayout: FinderLiveViewBottomSheetPanel no parent view to restore");
            }
        }
        Z6.animate().scaleX(1.0f).scaleY(1.0f).translationX(0.0f).setDuration(240L).setInterpolator(new android.view.animation.DecelerateInterpolator()).withStartAction(df2.xu.f231805d).withEndAction(new df2.yu(Z6, this)).start();
    }

    public final com.tencent.mm.live.core.view.LiveVideoView Z6() {
        com.tencent.mm.plugin.finder.live.plugin.ob0 ob0Var = (com.tencent.mm.plugin.finder.live.plugin.ob0) R6(com.tencent.mm.plugin.finder.live.plugin.ob0.class);
        com.tencent.rtmp.ui.TXCloudVideoView C1 = ob0Var != null ? ob0Var.C1() : null;
        if (C1 instanceof com.tencent.mm.live.core.view.LiveVideoView) {
            return (com.tencent.mm.live.core.view.LiveVideoView) C1;
        }
        return null;
    }

    @Override // mf2.q
    public void q4(java.lang.Object panelObject, float f17) {
        kotlin.jvm.internal.o.g(panelObject, "panelObject");
    }
}
