package hd4;

/* loaded from: classes4.dex */
public abstract class g extends com.tencent.mm.plugin.sns.ui.widget.l {
    public final d94.a A;
    public final w64.l B;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f280573o;

    /* renamed from: p, reason: collision with root package name */
    public final u74.d f280574p;

    /* renamed from: q, reason: collision with root package name */
    public final i64.b1 f280575q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.listener.i f280576r;

    /* renamed from: s, reason: collision with root package name */
    public final int f280577s;

    /* renamed from: t, reason: collision with root package name */
    public d94.g f280578t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.FrameLayout f280579u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f280580v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f280581w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f280582x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AdGestureFrameLayout f280583y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f280584z;

    public g(java.lang.String str, androidx.lifecycle.y yVar, android.view.View view, u74.d dVar, i64.b1 b1Var, com.tencent.mm.plugin.sns.ui.listener.i iVar, int i17) {
        super(str, yVar, view);
        this.f280573o = view;
        this.f280574p = dVar;
        this.f280575q = b1Var;
        this.f280576r = iVar;
        this.f280577s = i17;
        this.f280580v = jz5.h.b(hd4.a.f280564d);
        this.f280581w = jz5.h.b(hd4.c.f280566d);
        this.f280582x = jz5.h.b(new hd4.f(this));
        this.A = new hd4.b(this);
        this.B = new hd4.e(this);
    }

    public static final android.graphics.Rect y(hd4.g gVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getAnimDisplayRect", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
        gVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAnimDisplayRect", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
        android.graphics.Rect rect = (android.graphics.Rect) ((jz5.n) gVar.f280580v).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAnimDisplayRect", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getAnimDisplayRect", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
        return rect;
    }

    public static final android.graphics.Point z(hd4.g gVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getCoordOffset", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
        gVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCoordOffset", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
        android.graphics.Point point = (android.graphics.Point) ((jz5.n) gVar.f280581w).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCoordOffset", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getCoordOffset", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
        return point;
    }

    public final void A() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("disableGestureDraw", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
        com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AdGestureFrameLayout adGestureFrameLayout = this.f280583y;
        if (adGestureFrameLayout != null) {
            adGestureFrameLayout.setVisibility(8);
        }
        com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AdGestureFrameLayout adGestureFrameLayout2 = this.f280583y;
        if (adGestureFrameLayout2 != null) {
            adGestureFrameLayout2.a();
        }
        com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AdGestureFrameLayout adGestureFrameLayout3 = this.f280583y;
        if (adGestureFrameLayout3 != null) {
            adGestureFrameLayout3.setOnGestureListener(null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("disableGestureDraw", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
    }

    public final u74.d B() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getViewHolder", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewHolder", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
        return this.f280574p;
    }

    public final void C(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, long j17) {
        com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView snsAdBreakFrameVideoView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPlayProgress", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
        android.view.View view = this.f280573o;
        android.content.Context context = view != null ? view.getContext() : null;
        if (context == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPlayProgress", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
            return;
        }
        if (snsInfo == null || !snsInfo.isBreakFrameGestureAd()) {
            com.tencent.mars.xlog.Log.i(j(), "onPlayProgress, is not breakFrameGestureAd");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPlayProgress", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
            return;
        }
        com.tencent.mm.plugin.sns.storage.n nVar = snsInfo.getAdXml().adFullCardInfo;
        s34.l0 l0Var = nVar != null ? nVar.f166072g : null;
        if (l0Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPlayProgress", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
            return;
        }
        if (l0Var.f402699a <= j17 && j17 <= l0Var.f402700b) {
            com.tencent.mars.xlog.Log.i(j(), "onPlayProgress, milliseconds is " + j17 + ", enable");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableGestureDraw", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
            com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AdGestureFrameLayout adGestureFrameLayout = this.f280583y;
            if ((adGestureFrameLayout != null ? adGestureFrameLayout.getGestureListener() : null) == null) {
                com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AdGestureFrameLayout adGestureFrameLayout2 = this.f280583y;
                if (adGestureFrameLayout2 != null) {
                    adGestureFrameLayout2.a();
                }
                com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AdGestureFrameLayout adGestureFrameLayout3 = this.f280583y;
                if (adGestureFrameLayout3 != null) {
                    adGestureFrameLayout3.setVisibility(0);
                }
                com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AdGestureFrameLayout adGestureFrameLayout4 = this.f280583y;
                if (adGestureFrameLayout4 != null) {
                    adGestureFrameLayout4.setOnGestureListener(new hd4.d(this, snsInfo, l0Var, context));
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableGestureDraw", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
        } else {
            com.tencent.mars.xlog.Log.i(j(), "onPlayProgress, milliseconds is " + j17 + ", disable");
            A();
        }
        if (bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.ad.RepairerConfigAdGestureShowSamplePoints()) == 1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDebugView", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
            u74.d dVar = this.f280574p;
            if (dVar != null && (snsAdBreakFrameVideoView = dVar.f425156q) != null) {
                android.view.View view2 = dVar.f425165z;
                if (view2 == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDebugView", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
                } else {
                    float e17 = l44.n5.e(l0Var, view2.getHeight());
                    java.util.List d17 = l44.n5.d(l0Var, dVar.f425165z.getWidth(), dVar.f425165z.getHeight());
                    int[] iArr = new int[2];
                    dVar.f425165z.getLocationOnScreen(iArr);
                    int[] iArr2 = new int[2];
                    snsAdBreakFrameVideoView.getLocationOnScreen(iArr2);
                    float f17 = iArr[0] - iArr2[0];
                    float f18 = iArr[1] - iArr2[1];
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDebugInfo", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
                    s34.k0 k0Var = snsAdBreakFrameVideoView.gestureDebugInfo;
                    k0Var.f402688a = d17;
                    k0Var.f402690c = f17;
                    k0Var.f402691d = f18;
                    k0Var.f402689b = e17;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDebugInfo", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
                    snsAdBreakFrameVideoView.setWillNotDraw(false);
                    android.view.View debugOverlayView = snsAdBreakFrameVideoView.getDebugOverlayView();
                    if (debugOverlayView != null) {
                        debugOverlayView.bringToFront();
                    }
                    snsAdBreakFrameVideoView.postInvalidate();
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDebugView", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPlayProgress", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public void d(java.lang.Object obj, boolean z17) {
        android.widget.FrameLayout frameLayout;
        com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView snsAdBreakFrameVideoView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
        com.tencent.mm.plugin.sns.storage.SnsInfo model = (com.tencent.mm.plugin.sns.storage.SnsInfo) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
        kotlin.jvm.internal.o.g(model, "model");
        android.view.View view = this.f280573o;
        android.content.Context context = view != null ? view.getContext() : null;
        if (context == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
        } else {
            if (!this.f280584z) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMSnsAdGestureContainerStub", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
                android.view.ViewStub viewStub = (android.view.ViewStub) ((jz5.n) this.f280582x).getValue();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMSnsAdGestureContainerStub", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
                android.view.View h17 = a84.y0.h(viewStub);
                this.f280583y = h17 instanceof com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AdGestureFrameLayout ? (com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AdGestureFrameLayout) h17 : null;
                this.f280584z = true;
            }
            com.tencent.mars.xlog.Log.i(j(), "bindComponentModel, snsId is " + ca4.z0.t0(model.field_snsId) + ", isSame is " + z17);
            A();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTouchParticleAnimConfig", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
            java.lang.String j17 = j();
            try {
                com.tencent.mm.plugin.sns.storage.ADXml adXml = model.getAdXml();
                kotlin.jvm.internal.o.f(adXml, "getAdXml(...)");
                if (adXml.touchParticleAnimConfig != null) {
                    if (this.f280579u == null) {
                        android.widget.FrameLayout frameLayout2 = new android.widget.FrameLayout(context);
                        this.f280579u = frameLayout2;
                        u74.d dVar = this.f280574p;
                        if (dVar != null && (snsAdBreakFrameVideoView = dVar.f425156q) != null) {
                            snsAdBreakFrameVideoView.addView(frameLayout2, new android.widget.FrameLayout.LayoutParams(-1, -1));
                        }
                    }
                    if (this.f280578t == null && (frameLayout = this.f280579u) != null) {
                        this.f280578t = new d94.g(context, frameLayout, this.A, this.f280577s);
                    }
                    com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AdGestureFrameLayout adGestureFrameLayout = this.f280583y;
                    if (adGestureFrameLayout != null) {
                        adGestureFrameLayout.setTouchEventProxy(this.f280578t);
                    }
                } else {
                    com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AdGestureFrameLayout adGestureFrameLayout2 = this.f280583y;
                    if (adGestureFrameLayout2 != null) {
                        adGestureFrameLayout2.setTouchEventProxy(null);
                    }
                }
                d94.g gVar = this.f280578t;
                if (gVar != null) {
                    gVar.b(adXml.touchParticleAnimConfig);
                }
            } catch (java.lang.Throwable th6) {
                ca4.q.c(j17, th6);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTouchParticleAnimConfig", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public void v(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
        super.v((com.tencent.mm.plugin.sns.storage.SnsInfo) obj);
        com.tencent.mars.xlog.Log.i(j(), "resetComponentState");
        A();
        com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AdGestureFrameLayout adGestureFrameLayout = this.f280583y;
        if (adGestureFrameLayout != null) {
            adGestureFrameLayout.setTouchEventProxy(null);
        }
        d94.g gVar = this.f280578t;
        if (gVar != null) {
            gVar.b(null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
    }
}
