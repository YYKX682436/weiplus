package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public abstract class k0 extends com.tencent.mm.live.view.BaseLivePluginLayout implements com.tencent.mm.plugin.finder.live.view.ub, r90.j, mk2.a, androidx.lifecycle.y {
    public static final com.tencent.mm.plugin.finder.live.view.f Companion;
    private static final java.lang.String TAG;
    private final long CLEAR_RECOVERY_SCREEN_DURATION;
    private final yg2.b activityScope;
    private com.tencent.mm.ui.widget.dialog.j0 alertDialog;
    private boolean audienPreloadCDNLiveConfig;
    public gk2.e buContext;
    private boolean checkMiniWin;
    private final android.view.ViewGroup commonTopContentRoot;
    private en2.a confettiBitmapManager;
    private int curNetworkQuality;
    private int curNetworkType;
    private java.lang.String currentAppId;
    public km2.m data;
    private final jz5.g emptyReuseFrameLayout$delegate;
    private com.tencent.mm.plugin.finder.live.view.g externalCallback;
    private boolean finishActivityNotReleaseLive;
    private boolean isManualClosed;
    private boolean isScreenClear;
    private int lastLiveMode;
    private int lastLiveState;
    private int lastLiveSubMode;
    private java.util.LinkedList<xh2.a> lastMicCoverData;
    private org.json.JSONObject lastMicData;
    private final java.util.ArrayList<km2.q> lastMicUserList;
    private int lastOrientation;
    private km2.q lastPkMicUser;
    private org.json.JSONArray lastRoomPkMicUserList;
    private xh2.d lastSEIMicCoverData;
    private boolean lastScreenShareMore;
    private int lastSeiMode;
    private boolean lastShouldShowMicTopic;
    private int lastUIState;
    private int lastVoiceMode;
    private final jz5.g lazyInitPluginMap$delegate;
    private androidx.lifecycle.b0 lifeCycleRegistry;
    private final com.tencent.mm.plugin.finder.live.widget.zn loadingTipWidget;
    private boolean miniWinPermission;
    private boolean onJumpHalfActivity;
    private final com.tencent.mm.plugin.finder.live.view.s onNetworkChange;
    private r90.k orientationEventListener;
    private android.animation.ValueAnimator pluginAlphaModifyAnim;
    private final android.widget.RelativeLayout previewRoot;
    private com.tencent.mm.plugin.finder.live.util.l2 requestLayoutCounter;
    private dk2.rc rotationHelper;
    private android.animation.ValueAnimator screenClearAnim;
    private android.animation.ValueAnimator screenRecoveryAnim;
    private yg2.c securityDataScope;
    private com.tencent.mm.plugin.finder.live.widget.yv statisticsWidget;
    private dk2.xf tempFinderLiveAssistant;
    private java.lang.String tempRoomLog;
    private final androidx.fragment.app.Fragment uicFragment;
    private yg2.b viewScope;
    private final jz5.g warnningCountWidget$delegate;

    static {
        com.tencent.mm.plugin.finder.live.view.f fVar = new com.tencent.mm.plugin.finder.live.view.f(null);
        Companion = fVar;
        TAG = "Finder.FinderBaseLivePluginLayout@" + fVar.hashCode();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(android.content.Context context, androidx.fragment.app.Fragment fragment, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.uicFragment = fragment;
        this.lazyInitPluginMap$delegate = jz5.h.b(com.tencent.mm.plugin.finder.live.view.o.f116550d);
        this.tempRoomLog = "";
        this.currentAppId = "";
        this.curNetworkQuality = 1;
        this.curNetworkType = -1;
        this.lastOrientation = -1;
        this.loadingTipWidget = new com.tencent.mm.plugin.finder.live.widget.zn(this);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.fh8);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.previewRoot = (android.widget.RelativeLayout) findViewById;
        this.commonTopContentRoot = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.c8f);
        this.warnningCountWidget$delegate = jz5.h.b(new com.tencent.mm.plugin.finder.live.view.j0(this));
        this.lifeCycleRegistry = new androidx.lifecycle.b0(this, true);
        this.activityScope = new yg2.b((com.tencent.mm.ui.MMActivity) context, "activityScope");
        this.viewScope = new yg2.b(this, "viewScope");
        this.securityDataScope = new yg2.c(this, "securityDataScope");
        this.lastMicUserList = new java.util.ArrayList<>();
        ae2.in inVar = ae2.in.f3688a;
        this.audienPreloadCDNLiveConfig = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3851q2).getValue()).r()).intValue() == 0;
        this.lastLiveState = -1;
        this.lastUIState = -1;
        this.rotationHelper = new dk2.rc(new java.lang.ref.WeakReference((com.tencent.mm.plugin.finder.ui.MMFinderUI) context));
        this.CLEAR_RECOVERY_SCREEN_DURATION = 300L;
        this.emptyReuseFrameLayout$delegate = jz5.h.b(new com.tencent.mm.plugin.finder.live.view.m(context));
        this.requestLayoutCounter = new com.tencent.mm.plugin.finder.live.util.l2();
        this.onNetworkChange = new com.tencent.mm.plugin.finder.live.view.s(this);
    }

    public static final void access$networkChange(com.tencent.mm.plugin.finder.live.view.k0 k0Var, int i17) {
        k0Var.getClass();
        ko0.c.f309821a.e("NetWorkChange");
        java.util.Iterator<T> it = k0Var.getPluginList().iterator();
        while (it.hasNext()) {
            ((qo0.a) it.next()).E0(i17);
        }
        co0.s u07 = dk2.ef.f233372a.u0();
        if (u07 != null) {
            boolean isLiveStarted = k0Var.isLiveStarted();
            boolean z17 = ((mm2.h7) k0Var.business(mm2.h7.class)).f329117i.size() > 0;
            int netType = com.tencent.mars.comm.NetStatusUtil.getNetType(com.tencent.mm.sdk.platformtools.x2.f193071a);
            com.tencent.mars.xlog.Log.i("MicroMsg.LiveCoreVisitor", "onNetworkChange status:" + i17 + ",isLiveStart:" + isLiveStarted + ",haveMultiStream:" + z17 + ", netType:" + netType);
            if (isLiveStarted) {
                hn0.r rVar = u07.R1;
                if (rVar.h() || netType == -1 || z17) {
                    return;
                }
                hn0.r.r(rVar, u07.T1, null, 2, null);
                hn0.i iVar = u07.A;
                if (iVar != null) {
                    hn0.i.a(iVar, 11, null, 2, null);
                }
            }
        }
    }

    public static final void access$onScreenClearEnd(com.tencent.mm.plugin.finder.live.view.k0 k0Var) {
        for (qo0.a aVar : k0Var.getPluginList()) {
            if (aVar instanceof com.tencent.mm.plugin.finder.live.plugin.l) {
                com.tencent.mm.plugin.finder.live.plugin.l lVar = (com.tencent.mm.plugin.finder.live.plugin.l) aVar;
                lVar.m0(true);
                if (lVar.r()) {
                    lVar.d1(true);
                }
            }
        }
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = k0Var.getData().f309131f;
        kotlin.jvm.internal.o.g(liveRoomControllerStore, "<this>");
        if2.z.f291153a.i(liveRoomControllerStore, new if2.g0(liveRoomControllerStore));
    }

    public static final void access$onScreenClearStart(com.tencent.mm.plugin.finder.live.view.k0 k0Var) {
        for (qo0.a aVar : k0Var.getPluginList()) {
            if (aVar instanceof com.tencent.mm.plugin.finder.live.plugin.l) {
                com.tencent.mm.plugin.finder.live.plugin.l lVar = (com.tencent.mm.plugin.finder.live.plugin.l) aVar;
                lVar.s(true);
                if (lVar.r()) {
                    lVar.e1(true);
                }
            }
        }
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = k0Var.getData().f309131f;
        kotlin.jvm.internal.o.g(liveRoomControllerStore, "<this>");
        if2.z.f291153a.i(liveRoomControllerStore, new if2.h0(liveRoomControllerStore));
    }

    public static final void access$onScreenRecoveryEnd(com.tencent.mm.plugin.finder.live.view.k0 k0Var) {
        for (qo0.a aVar : k0Var.getPluginList()) {
            if (aVar instanceof com.tencent.mm.plugin.finder.live.plugin.l) {
                com.tencent.mm.plugin.finder.live.plugin.l lVar = (com.tencent.mm.plugin.finder.live.plugin.l) aVar;
                lVar.m0(false);
                if (lVar.r()) {
                    lVar.d1(false);
                }
            }
        }
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = k0Var.getData().f309131f;
        kotlin.jvm.internal.o.g(liveRoomControllerStore, "<this>");
        if2.z.f291153a.i(liveRoomControllerStore, new if2.i0(liveRoomControllerStore));
    }

    public static final void access$onScreenRecoveryStart(com.tencent.mm.plugin.finder.live.view.k0 k0Var) {
        for (qo0.a aVar : k0Var.getPluginList()) {
            if (aVar instanceof com.tencent.mm.plugin.finder.live.plugin.l) {
                com.tencent.mm.plugin.finder.live.plugin.l lVar = (com.tencent.mm.plugin.finder.live.plugin.l) aVar;
                lVar.s(false);
                if (lVar.r()) {
                    lVar.e1(false);
                }
            }
        }
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = k0Var.getData().f309131f;
        kotlin.jvm.internal.o.g(liveRoomControllerStore, "<this>");
        if2.z.f291153a.i(liveRoomControllerStore, new if2.j0(liveRoomControllerStore));
    }

    public static final com.tencent.mm.plugin.finder.live.view.h access$seiHandleResult(com.tencent.mm.plugin.finder.live.view.k0 k0Var, int i17, int i18, int i19, int i27, org.json.JSONObject jSONObject, float f17, boolean z17, jz5.l lVar) {
        android.graphics.Rect rect;
        java.util.LinkedHashMap n17;
        k0Var.getClass();
        boolean z18 = (i18 == 0 && (i17 == 2 || i17 == 1 || i17 == 2 || i17 == 4)) || i18 == 2;
        fj2.r rVar = fj2.r.f263182a;
        if (z18) {
            java.util.LinkedList<xh2.a> h17 = rVar.h(jSONObject, ((mm2.o4) k0Var.business(mm2.o4.class)).a7(), new com.tencent.mm.plugin.finder.live.view.x(k0Var));
            k0Var.lastSEIMicCoverData = new xh2.d(h17, i27, f17);
            java.lang.String str = TAG;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSeiGrabModeHandle post micData, lastSEIMicCoverData: ");
            xh2.d dVar = k0Var.lastSEIMicCoverData;
            sb6.append(dVar != null ? dVar.f454540a : null);
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
            ((mm2.o4) k0Var.business(mm2.o4.class)).A.setValue(new xh2.c(h17, new android.graphics.Rect(), i27, i18, i19, i17, f17, z17, new java.util.LinkedList()));
            k0Var.lastMicCoverData = h17;
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            java.util.LinkedList<xh2.a> linkedList = k0Var.lastMicCoverData;
            if ((linkedList != null ? linkedList.size() : 0) > 0) {
                java.util.LinkedList<xh2.a> linkedList2 = k0Var.lastMicCoverData;
                if (linkedList2 != null) {
                    java.util.Iterator<T> it = linkedList2.iterator();
                    while (it.hasNext()) {
                        linkedHashMap.put(((xh2.a) it.next()).b(), new android.graphics.Rect());
                    }
                }
            } else {
                java.lang.String str2 = ((mm2.e1) k0Var.business(mm2.e1.class)).f328987q.f380301n;
                if (str2 == null) {
                    str2 = "";
                }
                linkedHashMap.put(str2, new android.graphics.Rect());
            }
            return new com.tencent.mm.plugin.finder.live.view.h(linkedHashMap, new android.graphics.Rect(), h17);
        }
        switch (i27) {
            case 0:
            case 1:
            case 7:
                java.util.LinkedList<xh2.a> g17 = rVar.g(jSONObject, ((mm2.o4) k0Var.business(mm2.o4.class)).a7(), new com.tencent.mm.plugin.finder.live.view.w(k0Var));
                android.graphics.Rect p17 = k0Var.p(g17.size() - 1, i27, lVar);
                if (p17.width() == 0 || p17.height() == 0) {
                    com.tencent.mars.xlog.Log.e(TAG, "onSeiNormalModeHandle playerViewRect size = 0");
                    return null;
                }
                java.util.LinkedList f18 = rVar.f(jSONObject);
                k0Var.lastSEIMicCoverData = new xh2.d(g17, i27, f17);
                com.tencent.mars.xlog.Log.i(TAG, "onSeiNormalModeHandle mode: " + i27 + " videoRate: " + f17 + " playerViewRect: " + p17);
                if (i27 != 0) {
                    if (!(f17 == 0.0f)) {
                        int i28 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).x;
                        int i29 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).y;
                        if (lVar != null) {
                            i28 = ((java.lang.Number) lVar.f302833d).intValue();
                        }
                        if (lVar != null) {
                            i29 = ((java.lang.Number) lVar.f302834e).intValue();
                        }
                        android.graphics.Point point = new android.graphics.Point(i28, i29);
                        java.util.LinkedHashMap c17 = rVar.c(k0Var.getBuContext(), point, g17, f17, k0Var.getSEIRenderMode());
                        g17 = rVar.a(point, g17, c17);
                        ((mm2.o4) k0Var.business(mm2.o4.class)).A.setValue(new xh2.c(g17, p17, i27, i18, i19, 0, f17, z17, f18));
                        k0Var.lastMicCoverData = g17;
                        n17 = c17;
                        rect = p17;
                        return new com.tencent.mm.plugin.finder.live.view.h(n17, rect, g17);
                    }
                }
                rect = p17;
                ((mm2.o4) k0Var.business(mm2.o4.class)).A.setValue(new xh2.c(g17, rect, i27, i18, i19, 0, f17, z17, f18));
                k0Var.lastMicCoverData = g17;
                n17 = k0Var.n(g17, rect);
                return new com.tencent.mm.plugin.finder.live.view.h(n17, rect, g17);
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 8:
                java.util.LinkedList<xh2.a> e17 = rVar.e(jSONObject, ((mm2.o4) k0Var.business(mm2.o4.class)).a7(), new com.tencent.mm.plugin.finder.live.view.v(k0Var));
                android.graphics.Rect p18 = k0Var.p(e17.size() - 1, i27, lVar);
                if (p18.width() == 0 || p18.height() == 0) {
                    com.tencent.mars.xlog.Log.e(TAG, "onSeiGrabModeHandle playerViewRect size = 0");
                    return null;
                }
                java.util.LinkedList f19 = rVar.f(jSONObject);
                k0Var.lastSEIMicCoverData = new xh2.d(e17, i27, f17);
                java.lang.String str3 = TAG;
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onSeiGrabModeHandle post micData, lastSEIMicCoverData: ");
                xh2.d dVar2 = k0Var.lastSEIMicCoverData;
                sb7.append(dVar2 != null ? dVar2.f454540a : null);
                sb7.append(" playerViewRect: ");
                sb7.append(p18);
                com.tencent.mars.xlog.Log.i(str3, sb7.toString());
                ((mm2.o4) k0Var.business(mm2.o4.class)).A.setValue(new xh2.c(e17, p18, i27, i18, i19, 0, f17, z17, f19));
                k0Var.lastMicCoverData = e17;
                return new com.tencent.mm.plugin.finder.live.view.h(k0Var.n(e17, p18), p18, e17);
            default:
                return null;
        }
    }

    public static final void access$showStatistics(com.tencent.mm.plugin.finder.live.view.k0 k0Var) {
        kn0.e eVar = ((mm2.k2) k0Var.business(mm2.k2.class)).f329193f;
        if (!zl2.q4.f473933a.E() || eVar == null) {
            return;
        }
        ((mm2.k2) k0Var.business(mm2.k2.class)).getClass();
        if (!mm2.k2.f329192h) {
            k0Var.hideStatistics();
            return;
        }
        com.tencent.mm.plugin.finder.live.view.e0 e0Var = new com.tencent.mm.plugin.finder.live.view.e0(k0Var, eVar);
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.finder.report.o1(e0Var));
    }

    public static final void access$updateMicSeatUserPos(com.tencent.mm.plugin.finder.live.view.k0 k0Var, java.util.LinkedList linkedList) {
        java.lang.Object obj;
        k0Var.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(((mm2.o4) k0Var.business(mm2.o4.class)).a7());
        arrayList.addAll(((mm2.o4) k0Var.business(mm2.o4.class)).Z6());
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            xh2.a aVar = (xh2.a) it.next();
            java.util.Iterator it6 = arrayList.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it6.next();
                    if (kotlin.jvm.internal.o.b(((km2.q) obj).f309170a, aVar.b())) {
                        break;
                    }
                }
            }
            km2.q qVar = (km2.q) obj;
            if (qVar != null) {
                qVar.f309192w = aVar.f454521b.f454553e;
            }
        }
    }

    public static /* synthetic */ void dispatchValueAnimator$default(com.tencent.mm.plugin.finder.live.view.k0 k0Var, float f17, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dispatchValueAnimator");
        }
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        k0Var.m(f17, z17);
    }

    public static /* synthetic */ boolean fillBlurBg$default(com.tencent.mm.plugin.finder.live.view.k0 k0Var, java.lang.String str, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillBlurBg");
        }
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        return k0Var.fillBlurBg(str, z17);
    }

    public static /* synthetic */ android.graphics.Rect getFocusedViewRect$default(com.tencent.mm.plugin.finder.live.view.k0 k0Var, jz5.l lVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFocusedViewRect");
        }
        if ((i17 & 1) != 0) {
            lVar = null;
        }
        return k0Var.o(lVar);
    }

    private final java.util.HashMap<java.lang.String, yz5.a> getLazyInitPluginMap() {
        return (java.util.HashMap) this.lazyInitPluginMap$delegate.getValue();
    }

    public static /* synthetic */ android.graphics.Rect getPlayerViewRect$default(com.tencent.mm.plugin.finder.live.view.k0 k0Var, int i17, int i18, jz5.l lVar, int i19, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPlayerViewRect");
        }
        if ((i19 & 4) != 0) {
            lVar = null;
        }
        return k0Var.p(i17, i18, lVar);
    }

    private final fj2.l getSEIRenderMode() {
        return isScreenShareMode() ? zl2.r4.f473950a.x1() ? fj2.l.f263180f : fj2.l.f263179e : fj2.l.f263178d;
    }

    public static /* synthetic */ android.graphics.Rect getTrtcPlayerViewRect$default(com.tencent.mm.plugin.finder.live.view.k0 k0Var, int i17, int i18, jz5.l lVar, int i19, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTrtcPlayerViewRect");
        }
        if ((i19 & 4) != 0) {
            lVar = null;
        }
        return k0Var.q(i17, i18, lVar);
    }

    public static /* synthetic */ void hideLoadingLayer$default(com.tencent.mm.plugin.finder.live.view.k0 k0Var, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: hideLoadingLayer");
        }
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        k0Var.hideLoadingLayer(z17);
    }

    public static /* synthetic */ boolean notifySEIMicUserChange$default(com.tencent.mm.plugin.finder.live.view.k0 k0Var, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, org.json.JSONObject jSONObject3, boolean z17, jz5.l lVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: notifySEIMicUserChange");
        }
        if ((i17 & 8) != 0) {
            z17 = false;
        }
        boolean z18 = z17;
        if ((i17 & 16) != 0) {
            lVar = null;
        }
        return k0Var.notifySEIMicUserChange(jSONObject, jSONObject2, jSONObject3, z18, lVar);
    }

    public static /* synthetic */ void reset$default(com.tencent.mm.plugin.finder.live.view.k0 k0Var, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reset");
        }
        if ((i17 & 2) != 0) {
            z18 = false;
        }
        k0Var.reset(z17, z18);
    }

    public static /* synthetic */ void showProgressWithBlurBg$default(com.tencent.mm.plugin.finder.live.view.k0 k0Var, java.lang.String str, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showProgressWithBlurBg");
        }
        if ((i17 & 1) != 0) {
            str = "";
        }
        k0Var.showProgressWithBlurBg(str);
    }

    public static /* synthetic */ void showTipWithBlurBg$default(com.tencent.mm.plugin.finder.live.view.k0 k0Var, java.lang.String str, java.lang.String str2, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showTipWithBlurBg");
        }
        if ((i17 & 1) != 0) {
            str = "";
        }
        k0Var.showTipWithBlurBg(str, str2);
    }

    public static /* synthetic */ void showTipWithBlurBgAction$default(com.tencent.mm.plugin.finder.live.view.k0 k0Var, java.lang.String str, java.lang.String str2, java.lang.String str3, yz5.a aVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showTipWithBlurBgAction");
        }
        if ((i17 & 8) != 0) {
            aVar = null;
        }
        k0Var.showTipWithBlurBgAction(str, str2, str3, aVar);
    }

    public static /* synthetic */ void showVerificationLayerInfo$default(com.tencent.mm.plugin.finder.live.view.k0 k0Var, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, boolean z18, yz5.l lVar, java.util.List list, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo, java.lang.String str4, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showVerificationLayerInfo");
        }
        k0Var.showVerificationLayerInfo(str, (i17 & 2) != 0 ? null : str2, (i17 & 4) != 0 ? null : str3, (i17 & 8) != 0 ? false : z17, (i17 & 16) != 0 ? true : z18, (i17 & 32) != 0 ? null : lVar, (i17 & 64) != 0 ? null : list, (i17 & 128) != 0 ? null : finderJumpInfo, (i17 & 256) == 0 ? str4 : null);
    }

    public void activate(km2.m config, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(config, "config");
        this.checkMiniWin = false;
    }

    public final void applyLiveScene(int i17) {
        com.tencent.mars.xlog.Log.i(TAG, "applyLiveScene liveScene:" + i17);
        mm2.c1 c1Var = (mm2.c1) business(mm2.c1.class);
        if (i17 != c1Var.f328801f2) {
            com.tencent.mars.xlog.Log.i(c1Var.f328800f, "liveMode " + i17);
        }
        c1Var.f328801f2 = i17;
        for (qo0.a aVar : getPluginList()) {
            if (aVar instanceof com.tencent.mm.plugin.finder.live.plugin.l) {
                aVar.K0(((com.tencent.mm.plugin.finder.live.plugin.l) aVar).f113327i);
            }
        }
    }

    public void applyState(int i17, boolean z17, int i18, boolean z18, android.os.Bundle bundle) {
        java.util.Iterator<T> it = getPluginList().iterator();
        while (it.hasNext()) {
            ((qo0.a) it.next()).s0(i17, i18, bundle);
        }
    }

    public void bindData(km2.m data) {
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i(TAG, "bind view:" + hashCode() + "  liveId:" + data.f309129d.f68537e);
        setData(data);
        setBuContext(data.f309130e);
        ((mm2.l2) business(mm2.l2.class)).f329218f = new java.lang.ref.WeakReference(this);
        d();
        mm2.c1 c1Var = (mm2.c1) business(mm2.c1.class);
        c1Var.getClass();
        c1Var.N3 = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3870s1).getValue()).r()).intValue() == 1;
        c1Var.O3 = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3880t1).getValue()).r()).intValue() == 1;
        ((on2.z2) business(on2.z2.class)).f7();
        com.tencent.mm.plugin.finder.live.widget.zn znVar = this.loadingTipWidget;
        gk2.e liveData = getBuContext();
        znVar.getClass();
        kotlin.jvm.internal.o.g(liveData, "liveData");
        znVar.f120599s = liveData;
    }

    public <T extends androidx.lifecycle.c1> T business(java.lang.Class<T> bu6) {
        kotlin.jvm.internal.o.g(bu6, "bu");
        return (T) getBuContext().a(bu6);
    }

    public void callbackSEIData(int i17, r45.fa4 fa4Var) {
    }

    public final boolean changeScreenToLandscape() {
        com.tencent.mm.plugin.finder.ui.MMFinderUI mMFinderUI;
        df2.ug ugVar;
        android.content.res.Resources resources;
        android.content.res.Configuration configuration;
        if (!((mm2.c1) business(mm2.c1.class)).L9()) {
            return false;
        }
        dk2.rc rcVar = this.rotationHelper;
        java.lang.ref.WeakReference weakReference = rcVar.f234032a;
        com.tencent.mm.plugin.finder.ui.MMFinderUI mMFinderUI2 = (com.tencent.mm.plugin.finder.ui.MMFinderUI) weakReference.get();
        java.lang.Integer valueOf = (mMFinderUI2 == null || (resources = mMFinderUI2.getResources()) == null || (configuration = resources.getConfiguration()) == null) ? null : java.lang.Integer.valueOf(configuration.orientation);
        if (valueOf == null || valueOf.intValue() != 1 || (mMFinderUI = (com.tencent.mm.plugin.finder.ui.MMFinderUI) weakReference.get()) == null) {
            return false;
        }
        boolean Ui = ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(mMFinderUI);
        java.lang.String str = rcVar.f234033b;
        if (!Ui) {
            com.tencent.mars.xlog.Log.i(str, "changeScreenToLandscape requestPermission");
            rcVar.f234035d = kotlinx.coroutines.l.d(mMFinderUI.getUICScope(), null, null, new dk2.oc(rcVar, mMFinderUI, null), 3, null);
            return false;
        }
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        if (k0Var != null && (ugVar = (df2.ug) k0Var.getController(df2.ug.class)) != null) {
            ugVar.c7("changeScreenToLandscape");
        }
        mMFinderUI.b7(true);
        mMFinderUI.setRequestedOrientation(0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("changeScreenToLandscape curOrientation:");
        sb6.append(valueOf);
        sb6.append(",requestOrientation:");
        com.tencent.mm.plugin.finder.ui.MMFinderUI mMFinderUI3 = (com.tencent.mm.plugin.finder.ui.MMFinderUI) weakReference.get();
        sb6.append(mMFinderUI3 != null ? java.lang.Integer.valueOf(mMFinderUI3.getRequestedOrientation()) : null);
        sb6.append(",change:true");
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        com.tencent.mars.xlog.Log.i(str, "disableAutoRotation");
        rcVar.f234034c = false;
        return true;
    }

    public final boolean changeScreenToPortrait() {
        if (((mm2.c1) business(mm2.c1.class)).L9()) {
            return this.rotationHelper.b();
        }
        return false;
    }

    public final yg2.c checkActiveAndGet() {
        if (!kotlinx.coroutines.z0.h(this.securityDataScope)) {
            yg2.c cVar = this.securityDataScope;
            this.securityDataScope = new yg2.c(cVar.f462317d, cVar.f462318e);
        }
        return this.securityDataScope;
    }

    public boolean checkFinishWhenDiffTask(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        if (!(getContext() instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI) || kotlin.jvm.internal.o.b(getContext().getClass(), activity.getClass())) {
            return false;
        }
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.MMFinderUI");
        com.tencent.mm.plugin.finder.ui.MMFinderUI mMFinderUI = (com.tencent.mm.plugin.finder.ui.MMFinderUI) context;
        com.tencent.mars.xlog.Log.i(TAG, "checkFinishWhenDiffTask activity: " + activity + " context: " + mMFinderUI + ", context.state: " + mMFinderUI.mo133getLifecycle().b());
        if (mMFinderUI.mo133getLifecycle().b() != androidx.lifecycle.n.DESTROYED) {
            if (isLiveStarted()) {
                this.finishActivityNotReleaseLive = true;
            }
            mMFinderUI.finish();
        }
        return true;
    }

    public final void checkPauseStateWhenLiveStart() {
        r45.jy1 jy1Var = ((mm2.c1) business(mm2.c1.class)).W4;
        java.lang.String str = TAG;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkPauseStateWhenLiveStart FinderLiveLayerShowInfo:");
        sb6.append(jy1Var != null ? java.lang.Integer.valueOf(jy1Var.getInteger(0)) : null);
        sb6.append(", ");
        sb6.append(jy1Var != null ? java.lang.Integer.valueOf(jy1Var.getInteger(2)) : null);
        sb6.append('!');
        com.tencent.mars.xlog.Log.e(str, sb6.toString());
        if (jy1Var != null) {
            updateLayerShowInfo(jy1Var, true);
            ((mm2.c1) business(mm2.c1.class)).W4 = null;
        }
    }

    public final void clearMicData() {
        this.lastRoomPkMicUserList = null;
        this.lastPkMicUser = null;
        this.lastMicUserList.clear();
        setCurrentMicData(new org.json.JSONObject());
        setAnchorSEIMsg(new org.json.JSONObject());
    }

    public final void d() {
        if (this.lifeCycleRegistry.f11605c == androidx.lifecycle.n.DESTROYED) {
            this.lifeCycleRegistry = new androidx.lifecycle.b0(this, true);
            this.viewScope = new yg2.b(this, "viewScope");
        }
        this.lifeCycleRegistry.i(androidx.lifecycle.n.RESUMED);
    }

    public final void disableRatation() {
        com.tencent.mars.xlog.Log.i(TAG, "disableOritation");
        r90.k kVar = this.orientationEventListener;
        if (kVar != null) {
            kVar.disable();
        }
        r90.k kVar2 = this.orientationEventListener;
        if (kVar2 != null) {
            ((di3.d) kVar2).f232689g = null;
        }
        this.orientationEventListener = null;
    }

    public final void enableAutoRotation() {
        if (((mm2.c1) business(mm2.c1.class)).L9()) {
            dk2.rc rcVar = this.rotationHelper;
            com.tencent.mars.xlog.Log.i(rcVar.f234033b, "enableAutoRotation");
            rcVar.f234034c = true;
        }
    }

    public final void enableRotation() {
        com.tencent.mars.xlog.Log.i(TAG, "enableOritation");
        if (((mm2.c1) business(mm2.c1.class)).L9()) {
            if (this.orientationEventListener == null) {
                r90.m mVar = (r90.m) i95.n0.c(r90.m.class);
                android.content.Context context = getContext();
                ((q90.k) mVar).getClass();
                this.orientationEventListener = new di3.d(context, 2);
            }
            r90.k kVar = this.orientationEventListener;
            if (kVar != null) {
                ((di3.d) kVar).f232689g = this;
            }
            if (kVar != null) {
                ((di3.d) kVar).enable();
            }
        }
    }

    public final boolean fillBlurBg(java.lang.String str, boolean z17) {
        return this.loadingTipWidget.b(str, z17);
    }

    public void finish() {
        if (getContext() instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI) {
            this.isManualClosed = true;
            android.content.Context context = getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.MMFinderUI");
            ((com.tencent.mm.plugin.finder.ui.MMFinderUI) context).finish();
        }
    }

    public final void forceScreenToLandscape() {
        if (changeScreenToLandscape()) {
            disableRatation();
            ((mm2.c1) business(mm2.c1.class)).K8(true);
            ((mm2.c1) business(mm2.c1.class)).O1 = false;
        }
    }

    public final void forceScreenToPortrait() {
        disableRatation();
        if (changeScreenToPortrait()) {
            ((mm2.c1) business(mm2.c1.class)).K8(true);
            ((mm2.c1) business(mm2.c1.class)).O1 = false;
        }
    }

    public android.view.View genRootViewByStub(int i17, android.view.View root) {
        kotlin.jvm.internal.o.g(root, "root");
        android.view.View inflate = ((android.view.ViewStub) root.findViewById(i17)).inflate();
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return inflate;
    }

    public final yg2.b getActivityScope() {
        return this.activityScope;
    }

    public final org.json.JSONObject getAnchorSEIMsg() {
        return ((mm2.y2) business(mm2.y2.class)).f329572y;
    }

    public final boolean getAudienPreloadCDNLiveConfig() {
        return this.audienPreloadCDNLiveConfig;
    }

    public final java.lang.String getBgInfo() {
        com.tencent.mm.plugin.finder.live.widget.zn znVar = this.loadingTipWidget;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("blurBgView:");
        android.widget.ImageView imageView = znVar.f120584d;
        sb6.append(imageView.getElevation());
        sb6.append('-');
        sb6.append(imageView.getVisibility() == 0);
        sb6.append(";loading:");
        android.view.ViewGroup viewGroup = znVar.f120600t;
        sb6.append(viewGroup.getElevation());
        sb6.append('-');
        sb6.append(viewGroup.getVisibility() == 0);
        sb6.append(",root:");
        android.view.ViewGroup viewGroup2 = znVar.f120581a;
        sb6.append(viewGroup2.getAlpha());
        sb6.append("-root:");
        sb6.append(viewGroup2.getVisibility() == 0);
        return sb6.toString();
    }

    public final gk2.e getBuContext() {
        gk2.e eVar = this.buContext;
        if (eVar != null) {
            return eVar;
        }
        kotlin.jvm.internal.o.o("buContext");
        throw null;
    }

    public final boolean getCheckMiniWin() {
        return this.checkMiniWin;
    }

    public final android.view.ViewGroup getCommonTopContentRoot() {
        return this.commonTopContentRoot;
    }

    public final en2.a getConfettiBitmapManager() {
        return this.confettiBitmapManager;
    }

    @Override // com.tencent.mm.plugin.finder.live.view.ub
    public <T extends com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController> T getController(java.lang.Class<T> modelClass) {
        kotlin.jvm.internal.o.g(modelClass, "modelClass");
        return (T) getData().f309131f.controller(modelClass);
    }

    public final int getCurNetworkQuality() {
        return this.curNetworkQuality;
    }

    public final int getCurNetworkType() {
        return this.curNetworkType;
    }

    public final java.lang.String getCurrentAppId() {
        return this.currentAppId;
    }

    public final org.json.JSONObject getCurrentMicData() {
        return ((mm2.y2) business(mm2.y2.class)).f329571x;
    }

    public final km2.m getData() {
        km2.m mVar = this.data;
        if (mVar != null) {
            return mVar;
        }
        kotlin.jvm.internal.o.o(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
        throw null;
    }

    public final android.widget.FrameLayout getEmptyReuseFrameLayout() {
        return (android.widget.FrameLayout) this.emptyReuseFrameLayout$delegate.getValue();
    }

    public final com.tencent.mm.plugin.finder.live.view.g getExternalCallback() {
        return this.externalCallback;
    }

    public final dk2.xf getFinderLiveAssistant() {
        return dk2.ef.f233372a.j(this);
    }

    public final boolean getFinishActivityNotReleaseLive() {
        return this.finishActivityNotReleaseLive;
    }

    public final org.json.JSONObject getFullSEIData() {
        return ((mm2.y2) business(mm2.y2.class)).f329573z;
    }

    public final int getLastLiveState() {
        return this.lastLiveState;
    }

    public final org.json.JSONObject getLastMicData() {
        return this.lastMicData;
    }

    public final java.util.ArrayList<km2.q> getLastMicUserList() {
        return this.lastMicUserList;
    }

    public final int getLastOrientation() {
        return this.lastOrientation;
    }

    public final km2.q getLastPkMicUser() {
        return this.lastPkMicUser;
    }

    public final org.json.JSONArray getLastRoomPkMicUserList() {
        return this.lastRoomPkMicUserList;
    }

    public final int getLastUIState() {
        return this.lastUIState;
    }

    public final androidx.lifecycle.b0 getLifeCycleRegistry() {
        return this.lifeCycleRegistry;
    }

    @Override // androidx.lifecycle.y
    /* renamed from: getLifecycle */
    public androidx.lifecycle.o mo133getLifecycle() {
        return this.lifeCycleRegistry;
    }

    @Override // com.tencent.mm.live.view.BaseLivePluginLayout, qo0.c
    public abstract /* synthetic */ int getLiveRole();

    @Override // com.tencent.mm.plugin.finder.live.view.ub
    public qo0.c getLiveStatus() {
        return this;
    }

    public final com.tencent.mm.plugin.finder.live.widget.zn getLoadingTipWidget() {
        return this.loadingTipWidget;
    }

    public final boolean getMiniWinPermission() {
        return this.miniWinPermission;
    }

    public final boolean getOnJumpHalfActivity() {
        return this.onJumpHalfActivity;
    }

    public final r90.k getOrientationEventListener() {
        return this.orientationEventListener;
    }

    @Override // com.tencent.mm.plugin.finder.live.view.ub
    public <T extends com.tencent.mm.plugin.finder.live.plugin.l> T getPlugin(java.lang.Class<T> modelClass) {
        yz5.a aVar;
        T t17;
        kotlin.jvm.internal.o.g(modelClass, "modelClass");
        synchronized (getPluginList()) {
            for (qo0.a aVar2 : getPluginList()) {
                if (modelClass.isInstance(aVar2)) {
                    return (T) aVar2;
                }
            }
            java.lang.String str = "Finder.Live:" + modelClass.getCanonicalName();
            if (!getLazyInitPluginMap().containsKey(str) || (aVar = getLazyInitPluginMap().get(str)) == null || (t17 = (T) aVar.invoke()) == null) {
                return null;
            }
            getLazyInitPluginMap().remove(str);
            if (modelClass.isInstance(t17)) {
                getPluginList().add(t17);
                com.tencent.mars.xlog.Log.i(TAG, "lazy init plugin with key:" + str);
            } else {
                com.tencent.mars.xlog.Log.e(TAG, "lazy init plugin with key:" + str + " create error!");
            }
            return t17;
        }
    }

    public final java.util.List<qo0.a> getPlugins() {
        return getPluginList();
    }

    public final android.widget.RelativeLayout getPreviewRoot() {
        return this.previewRoot;
    }

    public final yg2.c getSecurityDataScope() {
        return this.securityDataScope;
    }

    public final com.tencent.mm.plugin.finder.live.widget.yv getStatisticsWidget() {
        return this.statisticsWidget;
    }

    public abstract tn0.w0 getTRTCLiveCore();

    public final dk2.xf getTempFinderLiveAssistant() {
        return this.tempFinderLiveAssistant;
    }

    public final java.lang.String getTempRoomLog() {
        return this.tempRoomLog;
    }

    public final androidx.fragment.app.Fragment getUicFragment() {
        return this.uicFragment;
    }

    public final int getVideoSpaceHeight() {
        df2.nv nvVar = (df2.nv) getData().f309131f.controller(df2.nv.class);
        if (nvVar != null) {
            return nvVar.f230890q;
        }
        return 0;
    }

    public final yg2.b getViewScope() {
        return this.viewScope;
    }

    public final com.tencent.mm.plugin.finder.live.widget.k40 getWarnningCountWidget() {
        return (com.tencent.mm.plugin.finder.live.widget.k40) this.warnningCountWidget$delegate.getValue();
    }

    public final void goGetLuckMoney(android.app.Activity activity, java.lang.String str, boolean z17) {
        kotlin.jvm.internal.o.g(activity, "activity");
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode() || !z17) {
            com.tencent.mars.xlog.Log.w(TAG, "goGetLuckMoney redPacketId:" + str + " enableGetLuckMoney:" + z17 + " return for isTeenMode");
            return;
        }
        com.tencent.mars.xlog.Log.i(TAG, "goGetLuckMoney redPacketId:" + str);
        if (str != null) {
            if (!zl2.r4.f473950a.w1()) {
                mm2.n0 n0Var = (mm2.n0) business(mm2.n0.class);
                r1 = ((n0Var == null || !n0Var.f329273r) ? 0 : 1) != 0 ? 16 : 2;
            }
            int i17 = r1;
            dk2.xf finderLiveAssistant = getFinderLiveAssistant();
            if (finderLiveAssistant != null) {
                long j17 = ((mm2.e1) business(mm2.e1.class)).f328988r.getLong(0);
                long j18 = ((mm2.e1) business(mm2.e1.class)).f328983m;
                java.lang.String nonceId = ((mm2.e1) business(mm2.e1.class)).f328992v;
                byte[] bArr = ((mm2.e1) business(mm2.e1.class)).f328985o;
                java.util.List c17 = kz5.b0.c(str);
                com.tencent.mm.plugin.finder.live.view.rb rbVar = new com.tencent.mm.plugin.finder.live.view.rb(new java.lang.ref.WeakReference(this), new java.lang.ref.WeakReference(activity));
                dk2.r4 r4Var = (dk2.r4) finderLiveAssistant;
                kotlin.jvm.internal.o.g(nonceId, "nonceId");
                pq5.g l17 = new ek2.c1(j17, j18, nonceId, bArr, i17, c17).l();
                l17.K(new dk2.l2(rbVar));
                if (r4Var.M() == null || !(r4Var.M() instanceof com.tencent.mm.ui.MMActivity)) {
                    return;
                }
                android.content.Context M = r4Var.M();
                kotlin.jvm.internal.o.e(M, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                l17.f((com.tencent.mm.ui.MMActivity) M);
            }
        }
    }

    public final void handleRecvLuckyMoneyErr(int i17) {
        pm0.v.X(new com.tencent.mm.plugin.finder.live.view.n(i17, this));
    }

    public void hideLoadingLayer(boolean z17) {
        com.tencent.mm.plugin.finder.live.widget.zn znVar = this.loadingTipWidget;
        znVar.f120585e.removeCallbacks(znVar.f120601u);
        gk2.e eVar = znVar.f120599s;
        znVar.b(eVar != null ? ((mm2.c1) eVar.a(mm2.c1.class)).f328852o : null, false);
        if (znVar.f120583c == null) {
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
            znVar.f120583c = ofFloat;
            if (ofFloat != null) {
                ofFloat.addUpdateListener(new com.tencent.mm.plugin.finder.live.widget.rn(znVar));
                ofFloat.addListener(new com.tencent.mm.plugin.finder.live.widget.sn(znVar));
            }
        }
        if (z17) {
            android.animation.ValueAnimator valueAnimator = znVar.f120583c;
            if (valueAnimator != null) {
                valueAnimator.start();
                return;
            }
            return;
        }
        znVar.c();
        com.tencent.mm.plugin.finder.live.widget.zn.d(znVar, false, 1, null);
        znVar.f120584d.setElevation(znVar.f120581a.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a3y));
        znVar.f120587g.setVisibility(8);
        znVar.f120589i.setVisibility(8);
        znVar.f120590j.setVisibility(8);
        android.widget.TextView textView = znVar.f120591k;
        if (textView != null) {
            textView.setVisibility(8);
        }
        android.widget.TextView textView2 = znVar.f120592l;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        znVar.e(false);
        android.widget.ImageView imageView = znVar.f120593m;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        android.widget.LinearLayout linearLayout = znVar.f120594n;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        android.widget.TextView textView3 = znVar.f120596p;
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        android.view.ViewGroup viewGroup = znVar.f120600t;
        viewGroup.setVisibility(8);
        viewGroup.setBackgroundColor(android.graphics.Color.parseColor("#99000000"));
        viewGroup.setClickable(false);
    }

    public final void hideProgress() {
        this.loadingTipWidget.c();
    }

    public final void hideStatistics() {
        com.tencent.mm.plugin.finder.live.widget.yv yvVar = this.statisticsWidget;
        if (yvVar != null) {
            yvVar.f120474a.setVisibility(8);
            yvVar.f120475b.setVisibility(8);
        }
    }

    public void initLogic(com.tencent.mm.live.api.LiveConfig config, boolean z17) {
        kotlin.jvm.internal.o.g(config, "config");
    }

    public final boolean isDestroyed() {
        if (getContext() == null || !(getContext() instanceof android.app.Activity)) {
            return false;
        }
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        return ((android.app.Activity) context).isDestroyed();
    }

    public final boolean isInLinkMic() {
        org.json.JSONArray jSONArray = this.lastRoomPkMicUserList;
        int length = jSONArray != null ? jSONArray.length() : 0;
        int size = ((mm2.o4) business(mm2.o4.class)).f329327v.size();
        boolean z17 = ((mm2.o4) business(mm2.o4.class)).f329324s.size() > 0;
        com.tencent.mars.xlog.Log.i(TAG, "isInLinkMic size roomPkUserList: " + length + " audienceListSize: " + size + " curLinkMicUser: " + z17);
        return length > 0 || size > 0 || z17;
    }

    public final boolean isLiveFinished() {
        return ((mm2.c1) business(mm2.c1.class)).U7();
    }

    public final boolean isLiveStarted() {
        return ((mm2.c1) business(mm2.c1.class)).a8();
    }

    public final boolean isManualClosed() {
        return this.isManualClosed;
    }

    public final boolean isScreenClear() {
        return this.isScreenClear;
    }

    public boolean isScreenShareMode() {
        kn0.p pVar;
        tn0.w0 tRTCLiveCore = getTRTCLiveCore();
        return (tRTCLiveCore == null || (pVar = tRTCLiveCore.D) == null || !pVar.f309589i) ? false : true;
    }

    public boolean isSwipeBack() {
        jz2.x0 x0Var = jz2.x0.f302754a;
        kotlin.jvm.internal.o.f(getContext(), "getContext(...)");
        if (!i95.n0.h(c50.d1.class)) {
            return false;
        }
        android.support.v4.media.f.a(i95.n0.c(c50.d1.class));
        throw null;
    }

    public void keyboardChange(boolean z17, int i17) {
        for (qo0.a aVar : getPluginList()) {
            if (aVar.w0() == 0) {
                aVar.y0(z17, i17);
            }
        }
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = getData().f309131f;
        kotlin.jvm.internal.o.g(liveRoomControllerStore, "<this>");
        if2.z.f291153a.i(liveRoomControllerStore, new if2.f(liveRoomControllerStore, z17, i17));
    }

    public final void m(float f17, boolean z17) {
        for (qo0.a aVar : getPluginList()) {
            if (aVar instanceof com.tencent.mm.plugin.finder.live.plugin.l) {
                com.tencent.mm.plugin.finder.live.plugin.l lVar = (com.tencent.mm.plugin.finder.live.plugin.l) aVar;
                if (lVar.r()) {
                    lVar.f1(f17);
                }
            }
        }
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = getData().f309131f;
        kotlin.jvm.internal.o.g(liveRoomControllerStore, "<this>");
        if2.z.f291153a.i(liveRoomControllerStore, new if2.f0(liveRoomControllerStore, z17, f17));
    }

    @Override // com.tencent.mm.live.view.BaseLivePluginLayout
    public void mount() {
        super.mount();
        d();
        gm0.j1.n().a(this.onNetworkChange);
        no0.k.f338729a = this;
        mk2.h hVar = mk2.h.f327133a;
        mk2.h.f327140h = new java.lang.ref.WeakReference(this);
        if2.z zVar = if2.z.f291153a;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = getData().f309131f;
        kotlin.jvm.internal.o.g(liveRoomControllerStore, "<this>");
        zVar.i(liveRoomControllerStore, new if2.q(liveRoomControllerStore, this));
        com.tencent.mm.plugin.finder.live.widget.zn znVar = this.loadingTipWidget;
        android.widget.ImageView imageView = znVar.f120584d;
        com.tencent.mm.plugin.finder.live.widget.FinderLiveCustomBgImageView finderLiveCustomBgImageView = imageView instanceof com.tencent.mm.plugin.finder.live.widget.FinderLiveCustomBgImageView ? (com.tencent.mm.plugin.finder.live.widget.FinderLiveCustomBgImageView) imageView : null;
        if (finderLiveCustomBgImageView != null) {
            finderLiveCustomBgImageView.setOnDrawableChangedListener((com.tencent.mm.plugin.finder.live.widget.on) ((jz5.n) znVar.f120602v).getValue());
        }
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar2 = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        if (((pl2.x) zVar2.a((androidx.appcompat.app.AppCompatActivity) context).a(pl2.x.class)).f356683f) {
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore2 = getData().f309131f;
            kotlin.jvm.internal.o.g(liveRoomControllerStore2, "<this>");
            zVar.i(liveRoomControllerStore2, new if2.e0(liveRoomControllerStore2));
        }
    }

    public final java.util.LinkedHashMap n(java.util.LinkedList linkedList, android.graphics.Rect rect) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        int width = rect.width();
        int height = rect.height();
        int i17 = rect.top;
        if ((linkedList != null ? linkedList.size() : 0) <= 0) {
            java.lang.String str = ((mm2.e1) business(mm2.e1.class)).f328987q.f380301n;
            if (str == null) {
                str = "";
            }
            linkedHashMap.put(str, new android.graphics.Rect(0, 0, width, height));
        } else if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                xh2.a aVar = (xh2.a) it.next();
                xh2.i iVar = aVar.f454521b;
                float f17 = iVar.f282609a;
                float f18 = iVar.f282610b;
                float f19 = width;
                float f27 = i17;
                float f28 = height;
                linkedHashMap.put(aVar.b(), new android.graphics.Rect(a06.d.b(f17 * f19), a06.d.b((f18 * f28) + f27), a06.d.b((f17 + iVar.f282611c) * f19), a06.d.b(f27 + ((f18 + iVar.f282612d) * f28))));
            }
        }
        com.tencent.mars.xlog.Log.i(TAG, "genMicRectMap rectMap:" + linkedHashMap);
        return linkedHashMap;
    }

    public final boolean needMiniWindow() {
        return ((mm2.c1) business(mm2.c1.class)).O1;
    }

    public final boolean needRemoveActivity() {
        return ((mm2.c1) business(mm2.c1.class)).P1;
    }

    public final void notify2ChangeCommentHeight(android.view.View view, java.lang.String tag) {
        kotlin.jvm.internal.o.g(tag, "tag");
        if (isLandscape()) {
            return;
        }
        if (view != null) {
            view.post(new com.tencent.mm.plugin.finder.live.view.p(view, tag, this));
        } else {
            post(new com.tencent.mm.plugin.finder.live.view.q(tag, this));
        }
    }

    public final void notifyFullSeiDataChange(java.lang.String userId, org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.o.g(userId, "userId");
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = getData().f309131f;
        kotlin.jvm.internal.o.g(liveRoomControllerStore, "<this>");
        if2.z.f291153a.i(liveRoomControllerStore, new mf2.j(liveRoomControllerStore, userId, jSONObject));
    }

    public boolean notifySEIMicUserChange(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, org.json.JSONObject jSONObject3, boolean z17, jz5.l lVar) {
        org.json.JSONObject jSONObject4;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = getData().f309131f;
        kotlin.jvm.internal.o.g(liveRoomControllerStore, "<this>");
        if2.z.f291153a.i(liveRoomControllerStore, new mf2.l(liveRoomControllerStore, jSONObject, jSONObject2, jSONObject3));
        if (jSONObject2 == null) {
            com.tencent.mars.xlog.Log.i(TAG, "notifyRoomPKMicUserChange: micData is null!");
            return false;
        }
        org.json.JSONArray optJSONArray = jSONObject2.optJSONArray("list");
        java.lang.String str = ((mm2.e1) business(mm2.e1.class)).f328987q.f380301n;
        if (str == null) {
            str = "";
        }
        boolean b17 = fj2.r.f263182a.b(str, jSONObject2, this.lastSEIMicCoverData);
        boolean z18 = this.lastScreenShareMore != isScreenShareMode();
        int optInt = jSONObject3 != null ? jSONObject3.optInt("as") : 0;
        boolean z19 = this.lastVoiceMode != optInt;
        java.lang.String optString = jSONObject != null ? jSONObject.optString("lm") : null;
        java.lang.String str2 = optString != null ? optString : "";
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            jSONObject4 = new org.json.JSONObject();
        } else {
            try {
                jSONObject4 = new org.json.JSONObject(str2);
            } catch (org.json.JSONException unused) {
                jSONObject4 = new org.json.JSONObject();
            }
        }
        int optInt2 = jSONObject4.optInt("lm");
        int optInt3 = jSONObject4.optInt("lsm");
        boolean z27 = optInt2 != this.lastLiveMode;
        boolean z28 = optInt3 != this.lastLiveSubMode;
        boolean z29 = pm0.v.z(jSONObject3 != null ? jSONObject3.optInt("userStatus") : 0, 8);
        boolean z37 = this.lastShouldShowMicTopic != z29;
        int i17 = optInt;
        com.tencent.mars.xlog.Log.i(TAG, "notifyRoomPKMicUserChange diffLiveMode: " + z27 + " diffLiveSubMode: " + z28 + " diffScreenShareMode: " + z18 + " diffVoiceModeChange: " + z19 + " diffSeiDataChange: " + b17 + " diffShouldShowMicTopic: " + z37 + " forceUpdate:" + z17 + ", micData: " + jSONObject2 + " lastMicData:" + this.lastMicData);
        if (!b17 && !z17 && !z18 && !z19 && !z27 && !z28 && !z37) {
            return false;
        }
        if (!(str.length() > 0)) {
            return false;
        }
        pm0.v.X(new com.tencent.mm.plugin.finder.live.view.r(this, jSONObject2, optInt2, optInt3, optJSONArray, i17, z29, lVar, z19, z17));
        return true;
    }

    public final android.graphics.Rect o(jz5.l lVar) {
        android.view.View l17;
        int intValue = lVar != null ? ((java.lang.Number) lVar.f302833d).intValue() : com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).x;
        int intValue2 = lVar != null ? ((java.lang.Number) lVar.f302834e).intValue() : com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).y;
        android.view.ViewGroup.LayoutParams layoutParams = this.previewRoot.getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.height = intValue2;
            layoutParams2.topMargin = 0;
            layoutParams2.width = intValue;
        }
        zi2.w wVar = (zi2.w) getPlugin(zi2.w.class);
        if (wVar != null) {
            wVar.I1(intValue, intValue2);
        }
        zi2.w wVar2 = (zi2.w) getPlugin(zi2.w.class);
        android.view.ViewGroup.LayoutParams layoutParams3 = (wVar2 == null || (l17 = wVar2.x1().l()) == null) ? null : l17.getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutParams4 = layoutParams3 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams3 : null;
        if (layoutParams4 != null) {
            layoutParams4.setMargins(0, 0, 0, 0);
        }
        android.view.ViewGroup viewGroup = this.commonTopContentRoot;
        java.lang.Object layoutParams5 = viewGroup != null ? viewGroup.getLayoutParams() : null;
        android.widget.RelativeLayout.LayoutParams layoutParams6 = layoutParams5 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams5 : null;
        if (layoutParams6 != null) {
            layoutParams6.height = intValue2;
            layoutParams6.topMargin = 0;
            layoutParams6.width = intValue;
        }
        com.tencent.mars.xlog.Log.i(TAG, "getFocusedViewRect width: " + intValue + " height: " + intValue2);
        return new android.graphics.Rect(0, 0, intValue, intValue2);
    }

    public void onAcceptBattleTimeout() {
    }

    public void onAcceptLiveMic(no0.a info) {
        kotlin.jvm.internal.o.g(info, "info");
    }

    public void onAcceptLiveMicSizeCheck(no0.a info) {
        kotlin.jvm.internal.o.g(info, "info");
        java.lang.String str = TAG;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAcceptLiveMicSizeCheck: self: ");
        sb6.append(((mm2.c1) business(mm2.c1.class)).m8());
        sb6.append(" userId: ");
        java.lang.String str2 = info.f338702c;
        sb6.append(str2);
        sb6.append(" audienceSize: ");
        sb6.append(((mm2.o4) business(mm2.o4.class)).f329327v.size());
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        if (com.tencent.mm.sdk.platformtools.t8.D0(((mm2.c1) business(mm2.c1.class)).m8(), str2) && ((mm2.o4) business(mm2.o4.class)).f329327v.size() == 0) {
            int C0 = zl2.r4.C0(zl2.r4.f473950a, 0, 0, 3, null);
            int i17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).x;
            int width = (int) (getWidth() / 1.2244898f);
            android.view.ViewGroup.LayoutParams layoutParams = this.previewRoot.getLayoutParams();
            android.widget.RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.height = width;
                layoutParams2.topMargin = C0;
                layoutParams2.width = i17;
            }
            android.view.ViewGroup viewGroup = this.commonTopContentRoot;
            java.lang.Object layoutParams3 = viewGroup != null ? viewGroup.getLayoutParams() : null;
            android.widget.RelativeLayout.LayoutParams layoutParams4 = layoutParams3 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams3 : null;
            if (layoutParams4 != null) {
                layoutParams4.height = width;
                layoutParams4.topMargin = C0;
                layoutParams4.width = i17;
            }
        }
    }

    @Override // mk2.a
    public void onAcceptMicTimeout(java.lang.String str) {
    }

    @Override // com.tencent.mm.live.view.BaseLivePluginLayout
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.tencent.mars.xlog.Log.i(TAG, "onActivityResult,requestCode:" + i17 + ",resultCode:" + i18);
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = getData().f309131f;
        kotlin.jvm.internal.o.g(liveRoomControllerStore, "<this>");
        if2.z.f291153a.i(liveRoomControllerStore, new if2.g(liveRoomControllerStore, i17, i18, intent));
    }

    @Override // no0.g
    public void onAnchorCallInterruption(boolean z17) {
        dk2.jf jfVar = dk2.jf.f233665a;
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveSysMsgCallback", "notify anchor call interruption change: " + z17);
        java.util.Iterator it = dk2.jf.f233672h.entrySet().iterator();
        while (it.hasNext()) {
            ((yz5.l) ((java.util.Map.Entry) it.next()).getValue()).invoke(java.lang.Boolean.valueOf(z17));
        }
    }

    @Override // no0.g
    public void onAnchorConnectionChange(boolean z17) {
        dk2.jf jfVar = dk2.jf.f233665a;
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveSysMsgCallback", "notify anchor connection change");
        java.util.Iterator it = dk2.jf.f233671g.entrySet().iterator();
        while (it.hasNext()) {
            ((yz5.l) ((java.util.Map.Entry) it.next()).getValue()).invoke(java.lang.Boolean.valueOf(z17));
        }
    }

    @Override // mk2.a
    public void onApplyBattleTimeout() {
    }

    public void onApplyLiveMic(no0.b info) {
        kotlin.jvm.internal.o.g(info, "info");
    }

    public void onApplyMicTimeout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.tencent.mm.plugin.finder.live.util.l2 l2Var = this.requestLayoutCounter;
        if (l2Var != null) {
            l2Var.getClass();
        }
    }

    @Override // com.tencent.mm.live.view.BaseLivePluginLayout
    public boolean onBackPress() {
        boolean z17;
        boolean onBackPress = super.onBackPress();
        if (onBackPress) {
            return onBackPress;
        }
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = getData().f309131f;
        kotlin.jvm.internal.o.g(liveRoomControllerStore, "<this>");
        synchronized (liveRoomControllerStore) {
            java.util.Iterator<T> it = liveRoomControllerStore.getControllers().iterator();
            do {
                z17 = false;
                if (!it.hasNext()) {
                    return false;
                }
                java.lang.Object obj = (com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController) it.next();
                if2.e eVar = obj instanceof if2.e ? (if2.e) obj : null;
                if (eVar != null) {
                    z17 = eVar.onBackPress();
                }
            } while (!z17);
            return true;
        }
    }

    public void onBanLiveComment(no0.c info) {
        kotlin.jvm.internal.o.g(info, "info");
    }

    public void onCloseApplyLiveMic(no0.d info) {
        kotlin.jvm.internal.o.g(info, "info");
    }

    public void onCloseLive(no0.e info) {
        kotlin.jvm.internal.o.g(info, "info");
        throw null;
    }

    public void onCloseLiveMic(no0.f info) {
        kotlin.jvm.internal.o.g(info, "info");
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        for (qo0.a aVar : getPluginList()) {
            com.tencent.mm.plugin.finder.live.plugin.l lVar = aVar instanceof com.tencent.mm.plugin.finder.live.plugin.l ? (com.tencent.mm.plugin.finder.live.plugin.l) aVar : null;
            if (lVar != null) {
                lVar.g1(newConfig);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.tencent.mm.plugin.finder.live.util.l2 l2Var = this.requestLayoutCounter;
        if (l2Var != null) {
            l2Var.getClass();
        }
    }

    public final void onLandscapeAction(int i17, int i18, android.os.Bundle bundle, java.lang.Object obj) {
        if (!isLandscape()) {
            forceScreenToLandscape();
            return;
        }
        ((mm2.c1) business(mm2.c1.class)).K8(false);
        ((mm2.c1) business(mm2.c1.class)).O1 = true;
        int i19 = bundle != null && bundle.containsKey("ACTION_POST_LANDSCAPE_DELAY") ? bundle.getInt("ACTION_POST_LANDSCAPE_DELAY") : 0;
        com.tencent.mars.xlog.Log.i(TAG, "onLandscapeAction action:" + bundle + ", orientation:" + getContext().getResources().getConfiguration().orientation + ",delayMs:" + i19);
        for (qo0.a aVar : getPluginList()) {
            if (aVar instanceof com.tencent.mm.plugin.finder.live.plugin.l) {
                if (i19 > 0) {
                    ((com.tencent.mm.plugin.finder.live.plugin.l) aVar).j1(bundle, i19);
                } else {
                    ((com.tencent.mm.plugin.finder.live.plugin.l) aVar).i1(bundle);
                }
            }
        }
    }

    public abstract void onLiveEventCallback(int i17, android.os.Bundle bundle);

    public void onLiveMicSucc(no0.j info) {
        kotlin.jvm.internal.o.g(info, "info");
    }

    public void onNewIntent(android.content.Intent intent) {
        for (qo0.a aVar : getPluginList()) {
            com.tencent.mm.plugin.finder.live.plugin.l lVar = aVar instanceof com.tencent.mm.plugin.finder.live.plugin.l ? (com.tencent.mm.plugin.finder.live.plugin.l) aVar : null;
            if (lVar != null) {
                lVar.k1(intent);
            }
        }
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = getData().f309131f;
        kotlin.jvm.internal.o.g(liveRoomControllerStore, "<this>");
        if2.z.f291153a.i(liveRoomControllerStore, new if2.h(liveRoomControllerStore, intent));
    }

    public void onOnlineLiveList(no0.n info) {
        kotlin.jvm.internal.o.g(info, "info");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    @Override // r90.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onOrientationChange(int r15) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.view.k0.onOrientationChange(int):void");
    }

    @Override // no0.g
    public void onPkMicLiveRoomImgChanged(r45.xn1 contract) {
        kotlin.jvm.internal.o.g(contract, "contract");
        zi2.w wVar = (zi2.w) getPlugin(zi2.w.class);
        if (wVar != null) {
            if (!(wVar.w0() == 0)) {
                wVar = null;
            }
            if (wVar != null) {
                wVar.x1().u(contract);
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.view.ub
    public void onPluginAlphaModify(float f17, float f18) {
        android.animation.ValueAnimator valueAnimator = this.pluginAlphaModifyAnim;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.animation.ValueAnimator duration = android.animation.ValueAnimator.ofFloat(f17, f18).setDuration(this.CLEAR_RECOVERY_SCREEN_DURATION);
        duration.addListener(new com.tencent.mm.plugin.finder.live.view.t(f17, f18));
        duration.addUpdateListener(new com.tencent.mm.plugin.finder.live.view.u(this));
        duration.setInterpolator(new android.view.animation.DecelerateInterpolator());
        this.pluginAlphaModifyAnim = duration;
        duration.start();
    }

    public final void onPortraitAction(int i17, int i18, android.os.Bundle bundle, java.lang.Object obj) {
        if (isLandscape()) {
            forceScreenToPortrait();
            return;
        }
        ((mm2.c1) business(mm2.c1.class)).K8(false);
        ((mm2.c1) business(mm2.c1.class)).O1 = true;
        int i19 = bundle != null && bundle.containsKey("ACTION_POST_PORTRAIT_DELAY") ? bundle.getInt("ACTION_POST_PORTRAIT_DELAY") : 0;
        com.tencent.mars.xlog.Log.i(TAG, "onPortraitAction action:" + bundle + ", orientation:" + getContext().getResources().getConfiguration().orientation + ",delayMs:" + i19);
        for (qo0.a aVar : getPluginList()) {
            if (aVar instanceof com.tencent.mm.plugin.finder.live.plugin.l) {
                if (i19 > 0) {
                    ((com.tencent.mm.plugin.finder.live.plugin.l) aVar).B(bundle, obj, i19);
                } else {
                    ((com.tencent.mm.plugin.finder.live.plugin.l) aVar).l1(bundle, obj);
                }
            }
        }
        java.lang.String string = bundle != null ? bundle.getString("ACTION_POST_PORTRAIT", "") : null;
        if (string == null) {
            string = "";
        }
        android.os.Bundle bundle2 = obj instanceof android.os.Bundle ? (android.os.Bundle) obj : null;
        if (!kotlin.jvm.internal.o.b(string, "PORTRAIT_ACTION_PRODUCT_REPLAY_VIEW") || bundle2 == null) {
            return;
        }
        long j17 = bundle2.getLong("KEY_PROMOTE_ID", 0L);
        r45.y23 y23Var = new r45.y23();
        y23Var.parseFrom(bundle2.getByteArray("KEY_PROMOTE_ITEM"));
        int i27 = bundle2.getInt("KEY_PROMOTE_SOURCE", 0);
        java.lang.String string2 = bundle2.getString("KEY_PROMOTE_JUMP_ID", "");
        java.lang.String str = string2 == null ? "" : string2;
        zl2.r4 r4Var = zl2.r4.f473950a;
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        r4Var.h1(context, getBuContext(), j17, y23Var, i27, "", str);
    }

    @Override // mk2.a
    public void onRandomMatchTimeout() {
    }

    @Override // com.tencent.mm.plugin.finder.live.view.ub
    public void onScreenClear(boolean z17) {
        for (qo0.a aVar : getPluginList()) {
            if ((aVar instanceof com.tencent.mm.plugin.finder.live.plugin.l) && ((com.tencent.mm.plugin.finder.live.plugin.l) aVar).r()) {
                java.lang.String str = TAG;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(aVar.name());
                sb6.append(" screen switch, visibility:");
                sb6.append(aVar.f365323d.getVisibility());
                sb6.append(", cacheVisibility:");
                com.tencent.mm.plugin.finder.live.plugin.l lVar = (com.tencent.mm.plugin.finder.live.plugin.l) aVar;
                sb6.append(lVar.f113327i);
                sb6.append(", clear:");
                sb6.append(z17);
                com.tencent.mars.xlog.Log.i(str, sb6.toString());
                lVar.f113328m = z17 ? 8 : 65535;
            }
        }
        if (z17) {
            this.isScreenClear = true;
            if (this.screenClearAnim == null) {
                android.animation.ValueAnimator duration = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(this.CLEAR_RECOVERY_SCREEN_DURATION);
                duration.addListener(new com.tencent.mm.plugin.finder.live.view.i(this));
                duration.addUpdateListener(new com.tencent.mm.plugin.finder.live.view.j(this));
                duration.setInterpolator(new android.view.animation.DecelerateInterpolator());
                this.screenClearAnim = duration;
            }
            android.animation.ValueAnimator valueAnimator = this.screenClearAnim;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            android.animation.ValueAnimator valueAnimator2 = this.screenClearAnim;
            if (valueAnimator2 != null) {
                valueAnimator2.start();
                return;
            }
            return;
        }
        this.isScreenClear = false;
        if (this.screenRecoveryAnim == null) {
            android.animation.ValueAnimator duration2 = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(this.CLEAR_RECOVERY_SCREEN_DURATION);
            duration2.addListener(new com.tencent.mm.plugin.finder.live.view.k(this));
            duration2.addUpdateListener(new com.tencent.mm.plugin.finder.live.view.l(this));
            android.animation.ValueAnimator valueAnimator3 = this.screenRecoveryAnim;
            if (valueAnimator3 != null) {
                valueAnimator3.setInterpolator(new android.view.animation.AccelerateInterpolator());
            }
            this.screenRecoveryAnim = duration2;
        }
        android.animation.ValueAnimator valueAnimator4 = this.screenRecoveryAnim;
        if (valueAnimator4 != null) {
            valueAnimator4.cancel();
        }
        android.animation.ValueAnimator valueAnimator5 = this.screenRecoveryAnim;
        if (valueAnimator5 != null) {
            valueAnimator5.start();
        }
    }

    @Override // com.tencent.mm.live.view.BaseLivePluginLayout
    public boolean onSwipeBack() {
        if (super.onSwipeBack()) {
            return false;
        }
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = getData().f309131f;
        kotlin.jvm.internal.o.g(liveRoomControllerStore, "<this>");
        synchronized (liveRoomControllerStore) {
            for (java.lang.Object obj : liveRoomControllerStore.getControllers()) {
                if2.e eVar = obj instanceof if2.e ? (if2.e) obj : null;
                if (eVar != null ? eVar.onSwipeBack() : false) {
                    return true;
                }
            }
            return false;
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = getData().f309131f;
        kotlin.jvm.internal.o.g(liveRoomControllerStore, "<this>");
        if2.z.f291153a.i(liveRoomControllerStore, new if2.i(liveRoomControllerStore, z17));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
    
        if ((in0.q.f292769b2 != null) != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Rect p(int r10, int r11, jz5.l r12) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.view.k0.p(int, int, jz5.l):android.graphics.Rect");
    }

    @Override // com.tencent.mm.live.view.BaseLivePluginLayout
    public void pause() {
        super.pause();
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = getData().f309131f;
        kotlin.jvm.internal.o.g(liveRoomControllerStore, "<this>");
        if2.z.f291153a.i(liveRoomControllerStore, new if2.j(liveRoomControllerStore));
    }

    public final void processFinderLiveLayerShowInfo(r45.jy1 jy1Var) {
        boolean a86 = ((mm2.c1) business(mm2.c1.class)).a8();
        java.lang.String str = TAG;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("processFinderLiveLayerShowInfo FinderLiveLayerShowInfo:");
        sb6.append(jy1Var != null ? java.lang.Integer.valueOf(jy1Var.getInteger(0)) : null);
        sb6.append(", ");
        sb6.append(jy1Var != null ? java.lang.Integer.valueOf(jy1Var.getInteger(2)) : null);
        sb6.append(", liveStart:");
        sb6.append(a86);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        if (jy1Var != null) {
            if (a86) {
                updateLayerShowInfo(jy1Var, true);
            } else {
                ((mm2.c1) business(mm2.c1.class)).W4 = jy1Var;
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.view.ub
    public dk2.xf provideFinderLiveAssistant() {
        return getFinderLiveAssistant();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final android.graphics.Rect q(int i17, int i18, jz5.l lVar) {
        int i19;
        int i27;
        android.view.View l17;
        int b17;
        int i28 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).y;
        int i29 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).x;
        if (lVar != null) {
            i29 = ((java.lang.Number) lVar.f302833d).intValue();
        }
        int videoSpaceHeight = getVideoSpaceHeight();
        zl2.r4 r4Var = zl2.r4.f473950a;
        int C0 = zl2.r4.C0(r4Var, 0, 0, 3, null);
        java.lang.String str = TAG;
        com.tencent.mars.xlog.Log.i(str, "getTrtcPlayerViewRect mode: " + i18 + " seiListSize: " + i17 + " screenSize: " + lVar + " videoSpaceHeight: " + videoSpaceHeight);
        android.view.ViewGroup.LayoutParams layoutParams = this.previewRoot.getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            switch (i18) {
                case 1:
                case 7:
                    C0 = 0;
                    break;
                case 2:
                case 4:
                    b17 = a06.d.b(i29 / 1.0866141f);
                    i28 = b17;
                    break;
                case 3:
                    b17 = a06.d.b(i29 / 1.125f);
                    i28 = b17;
                    break;
                case 5:
                    b17 = a06.d.b(i29 / 1.0263158f);
                    i28 = b17;
                    break;
                case 6:
                default:
                    if (i17 != 0) {
                        if (i17 == 1) {
                            b17 = a06.d.b(i29 / 1.2244898f);
                        } else {
                            if (4 <= i17 && i17 < 6) {
                                java.util.List list = ((mm2.o4) business(mm2.o4.class)).f329324s;
                                kotlin.jvm.internal.o.f(list, "<get-anchorPkMicUserList>(...)");
                                if (pm0.v.F(list)) {
                                    b17 = a06.d.b(i29 / 1.5f);
                                }
                            }
                            if (i17 >= 6) {
                                java.util.List list2 = ((mm2.o4) business(mm2.o4.class)).f329324s;
                                kotlin.jvm.internal.o.f(list2, "<get-anchorPkMicUserList>(...)");
                                if (pm0.v.F(list2)) {
                                    b17 = a06.d.b(i29 / 1.0f);
                                }
                            }
                            b17 = a06.d.b(i29 / 1.0843374f);
                        }
                        i28 = b17;
                        break;
                    }
                    C0 = 0;
                    break;
                case 8:
                    b17 = a06.d.b(i29 / 1.2244898f);
                    i28 = b17;
                    break;
            }
            layoutParams2.height = i28;
            layoutParams2.topMargin = C0;
            layoutParams2.width = i29;
        }
        if (i18 == 7) {
            i27 = zl2.r4.C0(r4Var, 0, 0, 3, null);
            i19 = a06.d.b(i29 / 1.2244898f);
        } else {
            i19 = i28;
            i27 = C0;
        }
        android.view.ViewGroup viewGroup = this.commonTopContentRoot;
        android.view.ViewGroup.LayoutParams layoutParams3 = viewGroup != null ? viewGroup.getLayoutParams() : null;
        android.widget.RelativeLayout.LayoutParams layoutParams4 = layoutParams3 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams3 : null;
        if (layoutParams4 != null) {
            layoutParams4.height = i19;
            layoutParams4.topMargin = i27;
            layoutParams4.width = i29;
        }
        zi2.w wVar = (zi2.w) getPlugin(zi2.w.class);
        if (wVar != null) {
            wVar.I1(i29, i28);
        }
        zi2.w wVar2 = (zi2.w) getPlugin(zi2.w.class);
        java.lang.Object layoutParams5 = (wVar2 == null || (l17 = wVar2.x1().l()) == null) ? null : l17.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams5 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams5 : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.setMargins(0, C0, 0, 0);
        }
        com.tencent.mars.xlog.Log.i(str, "getTrtcPlayerViewRect topMargin:" + C0 + " width:" + i29 + " height:" + i28);
        int i37 = C0 + videoSpaceHeight;
        return new android.graphics.Rect(0, i37, i29, i28 + i37);
    }

    public void registerLazyInitPluginTask(java.lang.String key, yz5.a task) {
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(task, "task");
        if (getLazyInitPluginMap().containsKey(key)) {
            com.tencent.mars.xlog.Log.i(TAG, key.concat(" has been register!"));
        } else {
            getLazyInitPluginMap().put(key, task);
        }
    }

    public abstract void release();

    @Override // android.widget.RelativeLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        com.tencent.mm.plugin.finder.live.util.l2 l2Var = this.requestLayoutCounter;
        if (l2Var != null) {
            l2Var.getClass();
        }
    }

    public void reset(boolean z17, boolean z18) {
        if (z17) {
            return;
        }
        qo0.b bVar = qo0.b.f365327a3;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_FINDER_LIVE_UPDATE_BY_ROLE_CHANGE", z18);
        statusChange(bVar, bundle);
    }

    @Override // com.tencent.mm.live.view.BaseLivePluginLayout
    public void resume() {
        super.resume();
        this.checkMiniWin = false;
        ((mm2.c1) business(mm2.c1.class)).O1 = true;
        ((mm2.c1) business(mm2.c1.class)).P1 = false;
        ((mm2.c1) business(mm2.c1.class)).K8(false);
        ((mm2.c1) business(mm2.c1.class)).f328798e5 = false;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = getData().f309131f;
        kotlin.jvm.internal.o.g(liveRoomControllerStore, "<this>");
        if2.z.f291153a.i(liveRoomControllerStore, new if2.k(liveRoomControllerStore));
    }

    @Override // com.tencent.mm.plugin.finder.live.view.ub
    public android.view.ViewGroup rootView() {
        return getParent();
    }

    public final void setAnchorSEIMsg(org.json.JSONObject jSONObject) {
        ((mm2.y2) business(mm2.y2.class)).f329572y = jSONObject;
    }

    public final void setAudienPreloadCDNLiveConfig(boolean z17) {
        this.audienPreloadCDNLiveConfig = z17;
    }

    public final void setBuContext(gk2.e eVar) {
        kotlin.jvm.internal.o.g(eVar, "<set-?>");
        this.buContext = eVar;
    }

    public final void setCheckMiniWin(boolean z17) {
        this.checkMiniWin = z17;
    }

    public final void setConfettiBitmapManager(en2.a aVar) {
        this.confettiBitmapManager = aVar;
    }

    public final void setCurNetworkQuality(int i17) {
        this.curNetworkQuality = i17;
    }

    public final void setCurNetworkType(int i17) {
        this.curNetworkType = i17;
    }

    public final void setCurrentAppId(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.currentAppId = str;
    }

    public final void setCurrentMicData(org.json.JSONObject jSONObject) {
        ((mm2.y2) business(mm2.y2.class)).f329571x = jSONObject;
    }

    public final void setData(km2.m mVar) {
        kotlin.jvm.internal.o.g(mVar, "<set-?>");
        this.data = mVar;
    }

    public final void setExternalCallback(com.tencent.mm.plugin.finder.live.view.g gVar) {
        this.externalCallback = gVar;
    }

    public final void setFinishActivityNotReleaseLive(boolean z17) {
        this.finishActivityNotReleaseLive = z17;
    }

    public final void setFullSEIData(org.json.JSONObject jSONObject) {
        ((mm2.y2) business(mm2.y2.class)).f329573z = jSONObject;
    }

    public final void setLastLiveState(int i17) {
        this.lastLiveState = i17;
    }

    public final void setLastMicData(org.json.JSONObject jSONObject) {
        this.lastMicData = jSONObject;
    }

    public final void setLastOrientation(int i17) {
        this.lastOrientation = i17;
    }

    public final void setLastPkMicUser(km2.q qVar) {
        this.lastPkMicUser = qVar;
    }

    public final void setLastRoomPkMicUserList(org.json.JSONArray jSONArray) {
        this.lastRoomPkMicUserList = jSONArray;
    }

    public final void setLastUIState(int i17) {
        this.lastUIState = i17;
    }

    public final void setLifeCycleRegistry(androidx.lifecycle.b0 b0Var) {
        kotlin.jvm.internal.o.g(b0Var, "<set-?>");
        this.lifeCycleRegistry = b0Var;
    }

    public final void setManualClosed(boolean z17) {
        this.isManualClosed = z17;
    }

    public final void setMiniWinPermission(boolean z17) {
        this.miniWinPermission = z17;
    }

    public final void setOnJumpHalfActivity(boolean z17) {
        com.tencent.mars.xlog.Log.i(TAG, "minitest set onJumpHalfActivity " + z17);
        this.onJumpHalfActivity = z17;
    }

    public final void setOrientationEventListener(r90.k kVar) {
        this.orientationEventListener = kVar;
    }

    public final void setSecurityDataScope(yg2.c cVar) {
        kotlin.jvm.internal.o.g(cVar, "<set-?>");
        this.securityDataScope = cVar;
    }

    public final void setStatisticsWidget(com.tencent.mm.plugin.finder.live.widget.yv yvVar) {
        this.statisticsWidget = yvVar;
    }

    public final void setTempFinderLiveAssistant(dk2.xf xfVar) {
        this.tempFinderLiveAssistant = xfVar;
        java.lang.String a17 = xfVar != null ? dk2.yf.a(xfVar) : null;
        if (a17 == null) {
            a17 = "";
        }
        this.tempRoomLog = a17;
    }

    public final void setTempRoomLog(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.tempRoomLog = str;
    }

    public final void setViewScope(yg2.b bVar) {
        kotlin.jvm.internal.o.g(bVar, "<set-?>");
        this.viewScope = bVar;
    }

    public final boolean showAlertDialog(android.app.Activity activity, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.ui.widget.dialog.j0 j0Var = this.alertDialog;
        if (kotlin.jvm.internal.o.b(j0Var != null ? java.lang.Boolean.valueOf(j0Var.isShowing()) : null, java.lang.Boolean.TRUE) || isDestroyed() || str2 == null) {
            return false;
        }
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(activity);
        if (str == null || str.length() == 0) {
            u1Var.g(str2);
        } else {
            u1Var.u(str);
            u1Var.g(str2);
        }
        java.lang.String string = activity.getResources().getString(com.tencent.mm.R.string.d3z);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        if (str3 == null || str3.length() == 0) {
            str3 = string;
        }
        u1Var.a(false);
        u1Var.n(str3);
        u1Var.l(com.tencent.mm.plugin.finder.live.view.y.f116811a);
        u1Var.e(com.tencent.mm.plugin.finder.live.view.z.f116846d);
        u1Var.q(false);
        this.alertDialog = u1Var.f211998c;
        return true;
    }

    public final void showBlurBg() {
        android.animation.ValueAnimator valueAnimator;
        com.tencent.mm.plugin.finder.live.widget.zn znVar = this.loadingTipWidget;
        android.animation.ValueAnimator valueAnimator2 = znVar.f120583c;
        if ((valueAnimator2 != null && valueAnimator2.isRunning()) && (valueAnimator = znVar.f120583c) != null) {
            valueAnimator.end();
        }
        znVar.f120584d.setElevation(znVar.f120581a.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a3z));
        znVar.f120587g.setVisibility(8);
        znVar.f120589i.setVisibility(8);
        znVar.f120590j.setVisibility(8);
        android.widget.TextView textView = znVar.f120591k;
        if (textView != null) {
            textView.setVisibility(8);
        }
        android.widget.TextView textView2 = znVar.f120592l;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        znVar.e(false);
        android.widget.ImageView imageView = znVar.f120593m;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        android.widget.LinearLayout linearLayout = znVar.f120594n;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        android.widget.TextView textView3 = znVar.f120596p;
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        com.tencent.mm.plugin.finder.live.widget.zn.d(znVar, false, 1, null);
    }

    public void showBlurBgWithTimeCount(java.lang.String username, java.lang.String tip) {
        android.animation.ValueAnimator valueAnimator;
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(tip, "tip");
        com.tencent.mm.plugin.finder.live.widget.zn znVar = this.loadingTipWidget;
        znVar.getClass();
        android.animation.ValueAnimator valueAnimator2 = znVar.f120583c;
        if ((valueAnimator2 != null && valueAnimator2.isRunning()) && (valueAnimator = znVar.f120583c) != null) {
            valueAnimator.end();
        }
        znVar.f120600t.setVisibility(0);
        znVar.b(username, true);
        android.view.ViewGroup viewGroup = znVar.f120581a;
        float dimensionPixelSize = viewGroup.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a3z);
        android.widget.ImageView imageView = znVar.f120584d;
        imageView.setElevation(dimensionPixelSize);
        imageView.setForeground(viewGroup.getContext().getResources().getDrawable(com.tencent.mm.R.color.UN_BW_0_Alpha_0_3));
        android.view.View view = znVar.f120585e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoadingTipWidget", "showBlurBgWithTimeCount", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoadingTipWidget", "showBlurBgWithTimeCount", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        znVar.f120586f.setVisibility(8);
        android.widget.TextView textView = znVar.f120587g;
        textView.setVisibility(0);
        znVar.f120589i.setVisibility(8);
        znVar.f120590j.setVisibility(8);
        android.widget.TextView textView2 = znVar.f120591k;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        android.widget.TextView textView3 = znVar.f120592l;
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        znVar.e(false);
        android.widget.ImageView imageView2 = znVar.f120593m;
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
        android.widget.LinearLayout linearLayout = znVar.f120594n;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        android.widget.TextView textView4 = znVar.f120596p;
        if (textView4 != null) {
            textView4.setVisibility(8);
        }
        textView.setText(tip);
        znVar.f();
        viewGroup.requestLayout();
        if (zl2.r4.f473950a.w1()) {
            znVar.a();
        }
    }

    public final void showCenterCustomizeToast(java.lang.String msg, int i17) {
        kotlin.jvm.internal.o.g(msg, "msg");
        pm0.v.X(new com.tencent.mm.plugin.finder.live.view.b0(this, msg, i17));
    }

    public final void showDebugToast(java.lang.String content) {
        kotlin.jvm.internal.o.g(content, "content");
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
    }

    public final void showProgress() {
        com.tencent.mm.plugin.finder.live.widget.zn znVar = this.loadingTipWidget;
        znVar.f120600t.setVisibility(0);
        android.view.ViewGroup viewGroup = znVar.f120581a;
        znVar.f120584d.setElevation(viewGroup.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a3y));
        android.view.View view = znVar.f120585e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoadingTipWidget", "showProgress", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoadingTipWidget", "showProgress", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        znVar.f120586f.setVisibility(8);
        znVar.f120587g.setVisibility(8);
        znVar.f120589i.setVisibility(8);
        znVar.f120590j.setVisibility(8);
        android.widget.TextView textView = znVar.f120591k;
        if (textView != null) {
            textView.setVisibility(8);
        }
        android.widget.TextView textView2 = znVar.f120592l;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        znVar.e(false);
        android.widget.ImageView imageView = znVar.f120593m;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        android.widget.LinearLayout linearLayout = znVar.f120594n;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        android.widget.TextView textView3 = znVar.f120596p;
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        com.tencent.mm.plugin.finder.live.widget.zn.d(znVar, false, 1, null);
        viewGroup.requestLayout();
    }

    public final void showProgressWithBlurBg(java.lang.String str) {
        com.tencent.mm.plugin.finder.live.widget.zn znVar = this.loadingTipWidget;
        znVar.f120600t.setVisibility(0);
        android.view.ViewGroup viewGroup = znVar.f120581a;
        znVar.f120584d.setElevation(viewGroup.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a3z));
        android.view.View view = znVar.f120585e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoadingTipWidget", "showProgressWithBlurBg", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoadingTipWidget", "showProgressWithBlurBg", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        znVar.f120586f.setVisibility(8);
        znVar.f120587g.setVisibility(8);
        znVar.f120589i.setVisibility(8);
        znVar.f120590j.setVisibility(8);
        android.widget.TextView textView = znVar.f120591k;
        if (textView != null) {
            textView.setVisibility(8);
        }
        android.widget.TextView textView2 = znVar.f120592l;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        znVar.e(false);
        android.widget.ImageView imageView = znVar.f120593m;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        android.widget.LinearLayout linearLayout = znVar.f120594n;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        android.widget.TextView textView3 = znVar.f120596p;
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        com.tencent.mm.plugin.finder.live.widget.zn.d(znVar, false, 1, null);
        viewGroup.requestLayout();
    }

    public final void showProgressWithTips(java.lang.String tips) {
        kotlin.jvm.internal.o.g(tips, "tips");
        com.tencent.mm.plugin.finder.live.widget.zn znVar = this.loadingTipWidget;
        znVar.getClass();
        znVar.f120600t.setVisibility(0);
        android.view.ViewGroup viewGroup = znVar.f120581a;
        znVar.f120584d.setElevation(viewGroup.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a3y));
        android.view.View view = znVar.f120585e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoadingTipWidget", "showProgressWithTips", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoadingTipWidget", "showProgressWithTips", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView = znVar.f120586f;
        textView.setVisibility(0);
        textView.setText(tips);
        znVar.f120587g.setVisibility(8);
        znVar.f120589i.setVisibility(8);
        znVar.f120590j.setVisibility(8);
        android.widget.TextView textView2 = znVar.f120591k;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        android.widget.TextView textView3 = znVar.f120592l;
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        znVar.e(false);
        android.widget.ImageView imageView = znVar.f120593m;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        android.widget.LinearLayout linearLayout = znVar.f120594n;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        android.widget.TextView textView4 = znVar.f120596p;
        if (textView4 != null) {
            textView4.setVisibility(8);
        }
        com.tencent.mm.plugin.finder.live.widget.zn.d(znVar, false, 1, null);
        viewGroup.requestLayout();
    }

    public final void showTipWithBlurBg(java.lang.String str, java.lang.String tip) {
        android.animation.ValueAnimator valueAnimator;
        kotlin.jvm.internal.o.g(tip, "tip");
        com.tencent.mm.plugin.finder.live.widget.zn znVar = this.loadingTipWidget;
        znVar.getClass();
        android.animation.ValueAnimator valueAnimator2 = znVar.f120583c;
        if ((valueAnimator2 != null && valueAnimator2.isRunning()) && (valueAnimator = znVar.f120583c) != null) {
            valueAnimator.end();
        }
        znVar.f120600t.setVisibility(0);
        znVar.b(str, true);
        android.view.ViewGroup viewGroup = znVar.f120581a;
        znVar.f120584d.setElevation(viewGroup.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a3z));
        android.view.View view = znVar.f120585e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoadingTipWidget", "showTipWithBlurBg", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoadingTipWidget", "showTipWithBlurBg", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        znVar.f120586f.setVisibility(8);
        znVar.f120590j.setVisibility(8);
        android.widget.TextView textView = znVar.f120591k;
        if (textView != null) {
            textView.setVisibility(8);
        }
        android.widget.TextView textView2 = znVar.f120592l;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        znVar.e(false);
        android.widget.ImageView imageView = znVar.f120593m;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        android.widget.LinearLayout linearLayout = znVar.f120594n;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        android.widget.TextView textView3 = znVar.f120596p;
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        android.widget.TextView textView4 = znVar.f120587g;
        textView4.setVisibility(0);
        textView4.setText(tip);
        znVar.f120589i.setVisibility(8);
        com.tencent.mm.plugin.finder.live.widget.zn.d(znVar, false, 1, null);
        viewGroup.requestLayout();
    }

    public void showTipWithBlurBgAction(java.lang.String username, java.lang.String tip, java.lang.String actionTxt, yz5.a aVar) {
        gk2.e buContext;
        android.animation.ValueAnimator valueAnimator;
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(tip, "tip");
        kotlin.jvm.internal.o.g(actionTxt, "actionTxt");
        com.tencent.mm.plugin.finder.live.widget.zn znVar = this.loadingTipWidget;
        znVar.getClass();
        android.animation.ValueAnimator valueAnimator2 = znVar.f120583c;
        if ((valueAnimator2 != null && valueAnimator2.isRunning()) && (valueAnimator = znVar.f120583c) != null) {
            valueAnimator.end();
        }
        android.view.ViewGroup viewGroup = znVar.f120600t;
        viewGroup.setVisibility(0);
        znVar.b(username, true);
        android.view.ViewGroup viewGroup2 = znVar.f120581a;
        znVar.f120584d.setElevation(viewGroup2.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a3z));
        android.view.View view = znVar.f120585e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoadingTipWidget", "showTipWithBlurBgAction", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveLoadingTipWidget", "showTipWithBlurBgAction", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        znVar.f120586f.setVisibility(8);
        android.widget.TextView textView = znVar.f120587g;
        textView.setVisibility(0);
        textView.setText(tip);
        znVar.f120590j.setVisibility(8);
        android.widget.ImageView imageView = znVar.f120593m;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        android.widget.LinearLayout linearLayout = znVar.f120594n;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        android.widget.TextView textView2 = znVar.f120591k;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        android.widget.TextView textView3 = znVar.f120592l;
        if (textView3 != null) {
            textView3.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.un(aVar));
        }
        if (textView3 != null) {
            textView3.setVisibility(0);
        }
        if (textView3 != null) {
            textView3.setText(actionTxt);
        }
        znVar.e(true);
        znVar.f();
        znVar.f120589i.setVisibility(8);
        viewGroup.setClickable(false);
        viewGroup2.requestLayout();
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        if ((k0Var == null || (buContext = k0Var.getBuContext()) == null || !zl2.r4.f473950a.z1(buContext)) ? false : true) {
            viewGroup.setBackground(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v12 */
    public final void showVerificationLayerInfo(java.lang.String title, java.lang.String str, java.lang.String str2, boolean z17, boolean z18, yz5.l lVar, java.util.List<java.lang.String> list, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo, java.lang.String str3) {
        android.view.ViewGroup viewGroup;
        android.view.ViewGroup viewGroup2;
        ?? r47;
        android.animation.ValueAnimator valueAnimator;
        kotlin.jvm.internal.o.g(title, "title");
        com.tencent.mars.xlog.Log.i(TAG, "showVerificationLayerInfo title:" + title + ", desc:" + str + ", actionTxt:" + str2 + ", interceptTouchEvent:" + z17 + ", showBg:" + z18 + ", spamReasonList:" + list + ", appealPage:" + finderJumpInfo + ", iconUrl:" + str3);
        com.tencent.mm.plugin.finder.live.widget.zn znVar = this.loadingTipWidget;
        znVar.getClass();
        android.animation.ValueAnimator valueAnimator2 = znVar.f120583c;
        if ((valueAnimator2 != null && valueAnimator2.isRunning()) && (valueAnimator = znVar.f120583c) != null) {
            valueAnimator.end();
        }
        android.view.ViewGroup viewGroup3 = znVar.f120600t;
        viewGroup3.setVisibility(0);
        znVar.c();
        android.widget.ImageView imageView = znVar.f120584d;
        android.view.ViewGroup viewGroup4 = znVar.f120581a;
        if (z18) {
            znVar.b(null, true);
            imageView.setElevation(viewGroup4.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a3z));
        } else {
            imageView.setElevation(viewGroup4.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a3y));
        }
        boolean z19 = str3 == null || str3.length() == 0;
        android.widget.ImageView imageView2 = znVar.f120593m;
        if (z19) {
            if (imageView2 != null) {
                imageView2.setVisibility(4);
            }
            r47 = 0;
            viewGroup = viewGroup3;
            viewGroup2 = viewGroup4;
        } else {
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
            i95.m c17 = i95.n0.c(vd2.i5.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            viewGroup = viewGroup3;
            viewGroup2 = viewGroup4;
            r47 = 0;
            vd2.i5.l8((vd2.i5) c17, str3, znVar.f120593m, null, 4, null);
        }
        android.widget.TextView textView = znVar.f120587g;
        textView.setVisibility(r47);
        textView.setText(title);
        boolean z27 = (str == null || str.length() == 0) ? true : r47;
        android.widget.TextView textView2 = znVar.f120589i;
        if (z27) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(r47);
            textView2.setText(str);
        }
        com.tencent.mm.plugin.finder.live.widget.zn.d(znVar, r47, 1, null);
        boolean z28 = (list == null || list.isEmpty()) ? true : r47;
        android.widget.LinearLayout linearLayout = znVar.f120594n;
        if (!z28) {
            if (linearLayout != 0) {
                linearLayout.setVisibility(r47);
            }
            android.widget.LinearLayout linearLayout2 = znVar.f120595o;
            if (linearLayout2 != null) {
                linearLayout2.removeAllViews();
            }
            android.view.LayoutInflater from = android.view.LayoutInflater.from(viewGroup2.getContext());
            for (java.lang.String str4 : list) {
                android.view.View inflate = from.inflate(com.tencent.mm.R.layout.f488911ea1, linearLayout2, (boolean) r47);
                ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.toy)).setText(str4);
                if (linearLayout2 != null) {
                    linearLayout2.addView(inflate);
                }
            }
        } else if (linearLayout != 0) {
            linearLayout.setVisibility(8);
        }
        android.widget.TextView textView3 = znVar.f120596p;
        if (finderJumpInfo != null) {
            if (textView3 != 0) {
                textView3.setVisibility(r47);
            }
            if (textView3 != 0) {
                java.lang.String wording = finderJumpInfo.getWording();
                if (wording == null) {
                    wording = "";
                }
                textView3.setText(wording);
            }
            if (textView3 != 0) {
                textView3.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.tn(finderJumpInfo));
            }
        } else if (textView3 != 0) {
            textView3.setVisibility(8);
        }
        android.widget.TextView textView4 = znVar.f120592l;
        if (textView4 != null) {
            textView4.setVisibility(8);
        }
        znVar.e(r47);
        boolean z29 = (str2 == null || str2.length() == 0) ? true : r47;
        android.widget.TextView textView5 = znVar.f120591k;
        if (!z29) {
            if (textView5 != 0) {
                textView5.setVisibility(r47);
            }
            if (textView5 != 0) {
                textView5.setText(str2);
            }
        } else if (textView5 != 0) {
            textView5.setVisibility(8);
        }
        if (lVar != null && textView5 != 0) {
            textView5.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.vn(lVar));
        }
        if (z17) {
            viewGroup.setOnClickListener(com.tencent.mm.plugin.finder.live.widget.wn.f120222d);
        } else {
            viewGroup.setClickable(r47);
        }
        viewGroup2.requestLayout();
        if (zl2.r4.f473950a.w1()) {
            znVar.a();
        }
    }

    @Override // com.tencent.mm.live.view.BaseLivePluginLayout
    public void start() {
        super.start();
        ((mm2.c1) business(mm2.c1.class)).O1 = true;
        ((mm2.c1) business(mm2.c1.class)).P1 = false;
        ((mm2.c1) business(mm2.c1.class)).K8(false);
        ((mm2.c1) business(mm2.c1.class)).f328798e5 = false;
    }

    @Override // com.tencent.mm.live.view.BaseLivePluginLayout, qo0.c
    public void statusChange(qo0.b status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        pm0.v.X(new com.tencent.mm.plugin.finder.live.view.g0(this, status, bundle));
    }

    @Override // com.tencent.mm.live.view.BaseLivePluginLayout
    public void stop() {
        super.stop();
        pm0.v.K(null, com.tencent.mm.plugin.finder.live.view.h0.f116340d);
    }

    @Override // com.tencent.mm.live.view.BaseLivePluginLayout
    public void unMount() {
        if2.z zVar = if2.z.f291153a;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = getData().f309131f;
        kotlin.jvm.internal.o.g(liveRoomControllerStore, "<this>");
        zVar.i(liveRoomControllerStore, new if2.y(liveRoomControllerStore, this));
        super.unMount();
        this.lifeCycleRegistry.i(androidx.lifecycle.n.DESTROYED);
        no0.k.f338729a = null;
        gm0.j1.n().d(this.onNetworkChange);
        com.tencent.mars.xlog.Log.i(TAG, "unMount " + getBuContext());
        com.tencent.mm.ui.widget.dialog.j0 j0Var = this.alertDialog;
        if (j0Var != null) {
            j0Var.dismiss();
        }
        com.tencent.mm.plugin.finder.live.widget.zn znVar = this.loadingTipWidget;
        com.tencent.mm.sdk.platformtools.b4 b4Var = znVar.f120603w;
        if (b4Var != null) {
            b4Var.d();
        }
        android.view.ViewGroup viewGroup = znVar.f120600t;
        viewGroup.setVisibility(8);
        viewGroup.setBackgroundColor(android.graphics.Color.parseColor("#99000000"));
        android.widget.ImageView imageView = znVar.f120584d;
        com.tencent.mm.plugin.finder.live.widget.FinderLiveCustomBgImageView finderLiveCustomBgImageView = imageView instanceof com.tencent.mm.plugin.finder.live.widget.FinderLiveCustomBgImageView ? (com.tencent.mm.plugin.finder.live.widget.FinderLiveCustomBgImageView) imageView : null;
        if (finderLiveCustomBgImageView != null) {
            finderLiveCustomBgImageView.setOnDrawableChangedListener(null);
        }
        release();
        dk2.tb tbVar = dk2.ef.f233392k;
        tbVar.f234127h.post(new dk2.mb(false, tbVar));
        android.animation.ValueAnimator valueAnimator = this.pluginAlphaModifyAnim;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public <T extends com.tencent.mm.plugin.finder.live.plugin.l> void unregisterPlugin(java.lang.Class<T> modelClass) {
        kotlin.jvm.internal.o.g(modelClass, "modelClass");
        synchronized (getPluginList()) {
            java.util.concurrent.CopyOnWriteArrayList<qo0.a> pluginList = getPluginList();
            com.tencent.mm.plugin.finder.live.plugin.l lVar = null;
            if (!(!pluginList.isEmpty())) {
                pluginList = null;
            }
            if (pluginList != null) {
                java.util.Iterator<T> it = pluginList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    qo0.a aVar = (qo0.a) it.next();
                    if (modelClass.isInstance(aVar)) {
                        lVar = (com.tencent.mm.plugin.finder.live.plugin.l) aVar;
                        break;
                    }
                }
            }
            getPluginList().remove(lVar);
        }
    }

    public final void updateLayerShowInfo(r45.jy1 layerShowInfo, boolean z17) {
        kotlin.jvm.internal.o.g(layerShowInfo, "layerShowInfo");
        ((mm2.c1) business(mm2.c1.class)).W9(layerShowInfo, z17, new com.tencent.mm.plugin.finder.live.view.i0(this));
    }

    public final void updateVerificationButtonState(java.lang.CharSequence charSequence, boolean z17) {
        com.tencent.mm.plugin.finder.live.widget.zn znVar = this.loadingTipWidget;
        android.widget.TextView textView = znVar.f120592l;
        if (textView != null) {
            textView.setVisibility(8);
        }
        znVar.e(false);
        boolean z18 = charSequence == null || charSequence.length() == 0;
        android.widget.TextView textView2 = znVar.f120591k;
        if (z18) {
            if (textView2 == null) {
                return;
            }
            textView2.setVisibility(8);
            return;
        }
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        if (textView2 == null) {
            return;
        }
        textView2.setEnabled(z17);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void updateVerificationCountDownTip(java.lang.CharSequence r4) {
        /*
            r3 = this;
            com.tencent.mm.plugin.finder.live.widget.zn r0 = r3.loadingTipWidget
            r1 = 0
            if (r4 == 0) goto L11
            r0.getClass()
            int r2 = r4.length()
            if (r2 != 0) goto Lf
            goto L11
        Lf:
            r2 = r1
            goto L12
        L11:
            r2 = 1
        L12:
            android.widget.TextView r0 = r0.f120590j
            if (r2 == 0) goto L1c
            r4 = 8
            r0.setVisibility(r4)
            goto L22
        L1c:
            r0.setVisibility(r1)
            r0.setText(r4)
        L22:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.view.k0.updateVerificationCountDownTip(java.lang.CharSequence):void");
    }

    public void x() {
        finish();
    }
}
