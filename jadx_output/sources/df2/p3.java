package df2;

/* loaded from: classes3.dex */
public final class p3 extends if2.b implements mf2.q, mf2.c {

    /* renamed from: m, reason: collision with root package name */
    public rh0.d0 f231029m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f231030n;

    /* renamed from: o, reason: collision with root package name */
    public float f231031o;

    /* renamed from: p, reason: collision with root package name */
    public int f231032p;

    /* renamed from: q, reason: collision with root package name */
    public kotlinx.coroutines.r2 f231033q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f231030n = "";
    }

    public static final android.graphics.RectF[] Z6(df2.p3 p3Var, android.graphics.RectF[] rectFArr, int i17, int i18) {
        jz5.f0 f0Var;
        p3Var.getClass();
        android.graphics.Point b17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
        int i19 = b17.x;
        int i27 = b17.y;
        java.lang.System.nanoTime();
        boolean z17 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (!z17) {
            if (i27 >= i19) {
                i19 = i27;
            }
            i27 = i19;
        }
        float f17 = i27 / i18;
        com.tencent.mars.xlog.Log.i("FinderLiveRenderController", "scaleRate: " + f17);
        if (rectFArr != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(rectFArr.length);
            for (android.graphics.RectF rectF : rectFArr) {
                if (rectF != null) {
                    rectF.left *= f17;
                    rectF.top *= f17;
                    rectF.bottom *= f17;
                    rectF.right *= f17;
                    f0Var = jz5.f0.f302826a;
                } else {
                    f0Var = null;
                }
                arrayList.add(f0Var);
            }
        }
        return rectFArr;
    }

    @Override // mf2.q
    public void D3(java.lang.Object panelClass) {
        kotlin.jvm.internal.o.g(panelClass, "panelClass");
        if (b7(panelClass)) {
            com.tencent.mars.xlog.Log.i("FinderLiveRenderController", "onPanelOpen panelClass: " + panelClass);
            java.lang.String str = this.f231030n;
            com.tencent.mars.xlog.Log.i("FinderLiveRenderController", "tryInitXLab facePath: " + str + " xLabEffect: " + this.f231029m);
            if (this.f231029m == null) {
                if (str.length() > 0) {
                    i95.m c17 = i95.n0.c(rh0.f0.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    rh0.z zVar = rh0.z.f395614h;
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                    linkedHashMap.put("FaceAlignmentCombined", "1");
                    linkedHashMap.put("Face3DLandmark", "0");
                    rh0.d0 u86 = rh0.f0.u8((rh0.f0) c17, 1, zVar, linkedHashMap, false, 8, null);
                    this.f231029m = u86;
                    ((p05.l4) u86).d(str);
                }
            }
            this.f231033q = com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new df2.m3(panelClass, this, java.lang.System.currentTimeMillis(), null), 3, null);
        }
    }

    @Override // mf2.q
    public void L1(java.lang.Object panelClass, int i17) {
        kotlin.jvm.internal.o.g(panelClass, "panelClass");
        if (b7(panelClass)) {
            this.f231032p = i17;
            com.tencent.mars.xlog.Log.i("FinderLiveRenderController", "notifyPanelHeightChange panelClass: " + panelClass + " contentHeight: " + i17);
        }
    }

    @Override // mf2.c
    public void M2(xh2.b micInfoData) {
        kotlin.jvm.internal.o.g(micInfoData, "micInfoData");
        if (micInfoData.f454530i.size() > 1) {
            if (this.f231031o == 0.0f) {
                return;
            }
            c7();
        }
    }

    @Override // mf2.q
    public void P3(java.lang.Object panelClass) {
        com.tencent.mm.live.core.view.DebugCanvasView debugCanvasView;
        android.view.ViewPropertyAnimator translationY;
        android.view.ViewPropertyAnimator duration;
        kotlin.jvm.internal.o.g(panelClass, "panelClass");
        if (b7(panelClass)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPanelClose panelClass: ");
            sb6.append(panelClass);
            sb6.append(" captureJob: ");
            kotlinx.coroutines.r2 r2Var = this.f231033q;
            sb6.append(r2Var != null ? java.lang.Boolean.valueOf(((kotlinx.coroutines.a) r2Var).a()) : null);
            com.tencent.mars.xlog.Log.i("FinderLiveRenderController", sb6.toString());
            kotlinx.coroutines.r2 r2Var2 = this.f231033q;
            if (r2Var2 != null) {
                kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
            }
            android.view.View a76 = a7();
            if (a76 != null) {
                android.view.ViewPropertyAnimator animate = a76.animate();
                if (animate != null && (translationY = animate.translationY(0.0f)) != null && (duration = translationY.setDuration(240L)) != null) {
                    duration.start();
                }
                com.tencent.mm.live.core.view.LiveVideoView liveVideoView = a76 instanceof com.tencent.mm.live.core.view.LiveVideoView ? (com.tencent.mm.live.core.view.LiveVideoView) a76 : null;
                if (liveVideoView != null && (debugCanvasView = liveVideoView.getDebugCanvasView()) != null) {
                    debugCanvasView.setRectList(null);
                }
            }
            this.f231031o = 0.0f;
        }
    }

    public final android.view.View a7() {
        com.tencent.mm.plugin.finder.live.plugin.ob0 ob0Var = (com.tencent.mm.plugin.finder.live.plugin.ob0) R6(com.tencent.mm.plugin.finder.live.plugin.ob0.class);
        if (ob0Var != null) {
            return ob0Var.C1();
        }
        return null;
    }

    public final boolean b7(java.lang.Object obj) {
        java.util.LinkedList linkedList;
        ae2.in inVar = ae2.in.f3688a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.Y).getValue()).r()).intValue() != 1 || zl2.r4.f473950a.x1()) {
            return false;
        }
        tn0.w0 Q6 = Q6();
        if ((Q6 != null && Q6.X()) || ((mm2.c1) business(mm2.c1.class)).L9() || !((mm2.e1) business(mm2.e1.class)).d7()) {
            return false;
        }
        xh2.c cVar = (xh2.c) ((mm2.o4) business(mm2.o4.class)).A.getValue();
        if (((cVar == null || (linkedList = cVar.f454531a) == null) ? 0 : linkedList.size()) > 1) {
            return false;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.shopping.LivePanelHalfScreenListener) && !(obj instanceof com.tencent.mm.plugin.finder.live.wish.widget.x)) {
            if (obj instanceof com.tencent.mm.plugin.finder.live.widget.FinderLiveViewBottomSheetPanel) {
                int id6 = ((com.tencent.mm.plugin.finder.live.widget.FinderLiveViewBottomSheetPanel) obj).getId();
                if (id6 != com.tencent.mm.R.id.g2z && id6 != com.tencent.mm.R.id.fpu && id6 != com.tencent.mm.R.id.f1_ && id6 != com.tencent.mm.R.id.f9h) {
                    return false;
                }
            } else if (!(obj instanceof com.tencent.mm.plugin.finder.live.widget.io) && (!(obj instanceof pk2.f7) || !(((pk2.f7) obj).f355746r2 instanceof pk2.o9))) {
                return false;
            }
        }
        return true;
    }

    public final void c7() {
        com.tencent.mars.xlog.Log.i("FinderLiveRenderController", "resetTranslationY");
        android.view.View a76 = a7();
        if (a76 != null) {
            a76.setTranslationY(0.0f);
        }
        this.f231032p = 0;
        this.f231031o = 0.0f;
        kotlinx.coroutines.r2 r2Var = this.f231033q;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveDeactivate() {
        super.onLiveDeactivate();
        try {
            rh0.d0 d0Var = this.f231029m;
            if (d0Var != null) {
                ((p05.l4) d0Var).o();
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("FinderLiveRenderController", "onLiveDeactivate", th6);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStart(r45.hc1 hc1Var) {
        super.onLiveStart(hc1Var);
        ae2.in inVar = ae2.in.f3688a;
        boolean z17 = true;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.Y).getValue()).r()).intValue() != 1) {
            return;
        }
        com.tencent.mm.plugin.finder.live.util.y.d(this, kotlinx.coroutines.q1.f310570c, null, new df2.k3(this, null), 2, null);
        if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3932z).getValue()).r()).intValue() == 1) {
            android.graphics.Point b17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
            int i17 = b17.x;
            int i18 = b17.y;
            java.lang.System.nanoTime();
            if (!com.tencent.mm.ui.bk.y() && !com.tencent.mm.ui.bk.Q() && !com.tencent.mm.ui.bk.A()) {
                z17 = false;
            }
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (!z17) {
                if (i18 >= i17) {
                    i17 = i18;
                }
                i18 = i17;
            }
            float f17 = i18 * (((mm2.c1) business(mm2.c1.class)).f328879s2 / ((mm2.c1) business(mm2.c1.class)).f328885t2);
            com.tencent.mm.plugin.finder.live.plugin.ob0 ob0Var = (com.tencent.mm.plugin.finder.live.plugin.ob0) R6(com.tencent.mm.plugin.finder.live.plugin.ob0.class);
            com.tencent.rtmp.ui.TXCloudVideoView C1 = ob0Var != null ? ob0Var.C1() : null;
            com.tencent.mm.live.core.view.LiveVideoView liveVideoView = C1 instanceof com.tencent.mm.live.core.view.LiveVideoView ? (com.tencent.mm.live.core.view.LiveVideoView) C1 : null;
            if (liveVideoView != null) {
                liveVideoView.removeView(liveVideoView.debugCanvasView);
                com.tencent.mm.live.core.view.DebugCanvasView debugCanvasView = liveVideoView.debugCanvasView;
                android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
                layoutParams.gravity = 17;
                liveVideoView.addView(debugCanvasView, layoutParams);
                com.tencent.mm.live.core.view.DebugCanvasView debugCanvasView2 = liveVideoView.getDebugCanvasView();
                if (debugCanvasView2 != null) {
                    android.view.ViewGroup.LayoutParams layoutParams2 = debugCanvasView2.getLayoutParams();
                    android.widget.FrameLayout.LayoutParams layoutParams3 = layoutParams2 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams2 : null;
                    if (layoutParams3 == null) {
                        return;
                    }
                    layoutParams3.width = (int) f17;
                }
            }
        }
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        c7();
    }

    @Override // mf2.q
    public void q4(java.lang.Object panelObject, float f17) {
        kotlin.jvm.internal.o.g(panelObject, "panelObject");
        if (b7(panelObject)) {
            if (this.f231031o == 0.0f) {
                return;
            }
            com.tencent.mars.xlog.Log.i("FinderLiveRenderController", "onPanelAnimChange panelObject: " + panelObject + " rate: " + f17 + " animTranslationY: " + this.f231031o);
            android.view.View a76 = a7();
            if (a76 != null) {
                a76.setTranslationY(f17 * this.f231031o);
            }
        }
    }
}
