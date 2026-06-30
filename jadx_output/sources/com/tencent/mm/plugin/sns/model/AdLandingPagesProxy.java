package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class AdLandingPagesProxy extends k55.b {

    /* renamed from: r, reason: collision with root package name */
    public static com.tencent.mm.plugin.sns.model.AdLandingPagesProxy f164033r;

    /* renamed from: s, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f164034s = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f164035f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f164036g;

    /* renamed from: h, reason: collision with root package name */
    public final k55.k f164037h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.FollowUserEventListener f164038i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.modelbase.u0 f164039m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f164040n;

    /* renamed from: o, reason: collision with root package name */
    public za4.f f164041o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.Map f164042p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.Map f164043q;

    /* loaded from: classes10.dex */
    public class BulletCommentEventListener extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.OnFinderCnyPostDanmakuCallbackEvent> {

        /* renamed from: d, reason: collision with root package name */
        public final long f164044d;

        /* renamed from: e, reason: collision with root package name */
        public long f164045e;

        /* renamed from: f, reason: collision with root package name */
        public final long f164046f;

        /* renamed from: g, reason: collision with root package name */
        public final java.lang.String f164047g;

        /* renamed from: h, reason: collision with root package name */
        public volatile boolean f164048h;

        /* renamed from: i, reason: collision with root package name */
        public final java.lang.Runnable f164049i;

        public BulletCommentEventListener(long j17, long j18, java.lang.String str, int i17) {
            super(com.tencent.mm.app.a0.f53288d);
            this.f164048h = false;
            this.f164049i = new com.tencent.mm.plugin.sns.model.p(this);
            this.f164044d = j17;
            this.f164045e = j18;
            this.f164046f = i17;
            this.f164047g = str;
            this.__eventId = 343169663;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public synchronized void alive() {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("alive", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$BulletCommentEventListener");
            super.alive();
            com.tencent.mars.xlog.Log.i("AdLandingPagesProxy.BulletCommentEvent", "BulletEventListener alive, info=" + this);
            ((ku5.t0) ku5.t0.f312615d).E(this.f164049i, this.f164046f);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("alive", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$BulletCommentEventListener");
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.OnFinderCnyPostDanmakuCallbackEvent onFinderCnyPostDanmakuCallbackEvent) {
            java.lang.String str;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$BulletCommentEventListener");
            com.tencent.mm.autogen.events.OnFinderCnyPostDanmakuCallbackEvent onFinderCnyPostDanmakuCallbackEvent2 = onFinderCnyPostDanmakuCallbackEvent;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$BulletCommentEventListener");
            boolean z17 = false;
            if (onFinderCnyPostDanmakuCallbackEvent2 != null) {
                am.pm pmVar = onFinderCnyPostDanmakuCallbackEvent2.f54570g;
                long j17 = pmVar.f7634d;
                java.lang.String str2 = pmVar.f7633c;
                int i17 = pmVar.f7631a;
                int i18 = pmVar.f7632b;
                if (i17 != 100) {
                    com.tencent.mars.xlog.Log.w("AdLandingPagesProxy.BulletCommentEvent", "eventType!=100, eventType=" + i17);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$BulletCommentEventListener");
                } else {
                    boolean z18 = i18 == 1;
                    hashCode();
                    com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.this.hashCode();
                    if (this.f164045e == j17 && (str = this.f164047g) != null && str.equals(str2)) {
                        com.tencent.mars.xlog.Log.w("AdLandingPagesProxy.BulletCommentEvent", "receive bullet event, make BulletEventListener dead, info=" + this);
                        try {
                        } catch (java.lang.Exception e17) {
                            com.tencent.mars.xlog.Log.e("AdLandingPagesProxy.BulletCommentEvent", "BulletEventListener dead exp=" + e17);
                        }
                        if (this.f164048h) {
                            com.tencent.mars.xlog.Log.e("AdLandingPagesProxy.BulletCommentEvent", "receive bullet event, dead before");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$BulletCommentEventListener");
                            z17 = true;
                        } else {
                            this.f164048h = true;
                            dead();
                            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.this.CLIENT_CALL("onBulletCommentEvent", java.lang.Long.valueOf(this.f164044d), java.lang.Long.valueOf(j17), str2, java.lang.Boolean.valueOf(z18));
                            this.f164045e = -1L;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$BulletCommentEventListener");
                            z17 = true;
                        }
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$BulletCommentEventListener");
                return z17;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$BulletCommentEventListener");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$BulletCommentEventListener");
            return z17;
        }

        public java.lang.String toString() {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$BulletCommentEventListener");
            java.lang.String str = "{callbackId=" + this.f164044d + ", finderFeedId=" + this.f164045e + ", delayBeforeDead=" + this.f164046f + ", comment=" + this.f164047g + ", listener.hash=" + hashCode() + "}";
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$BulletCommentEventListener");
            return str;
        }
    }

    /* loaded from: classes4.dex */
    public class FollowUserEventListener extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FollowUserEvent> {

        /* renamed from: d, reason: collision with root package name */
        public final long f164051d;

        /* renamed from: e, reason: collision with root package name */
        public final java.lang.String f164052e;

        public FollowUserEventListener(long j17, java.lang.String str) {
            super(com.tencent.mm.app.a0.f53288d);
            this.f164051d = j17;
            this.f164052e = str;
            this.__eventId = 398763182;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.FollowUserEvent followUserEvent) {
            am.zd zdVar;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$FollowUserEventListener");
            com.tencent.mm.autogen.events.FollowUserEvent followUserEvent2 = followUserEvent;
            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy adLandingPagesProxy = com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.this;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$FollowUserEventListener");
            if (followUserEvent2 == null || (zdVar = followUserEvent2.f54346g) == null) {
                com.tencent.mars.xlog.Log.w("AdLandingPagesProxy", "FollowUserEventListener, event.data==null");
            } else {
                com.tencent.mars.xlog.Log.i("AdLandingPagesProxy", "FollowUserEventListener, result=" + zdVar.f8553c + ", opType=" + zdVar.f8552b + ", opScene=" + zdVar.f8554d + ", finderUserName=" + zdVar.f8551a);
                if (zdVar.f8552b == 1 && zdVar.f8554d == 102 && this.f164052e.equals(zdVar.f8551a)) {
                    java.lang.String str = "";
                    try {
                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                        jSONObject.put("followType", 2);
                        jSONObject.put("followRet", zdVar.f8553c);
                        str = jSONObject.toString();
                        com.tencent.mm.plugin.sns.model.AdLandingPagesProxy adLandingPagesProxy2 = com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.f164033r;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
                        com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.FollowUserEventListener followUserEventListener = adLandingPagesProxy.f164038i;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
                        if (followUserEventListener != null) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
                            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.FollowUserEventListener followUserEventListener2 = adLandingPagesProxy.f164038i;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
                            followUserEventListener2.dead();
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
                            adLandingPagesProxy.f164038i = null;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
                        }
                    } catch (java.lang.Throwable th6) {
                        com.tencent.mars.xlog.Log.e("AdLandingPagesProxy", "FollowUserEventListener, exp is " + th6.toString());
                    }
                    adLandingPagesProxy.CLIENT_CALL("onGetBtnAdFinderContact", java.lang.Long.valueOf(this.f164051d), str);
                } else {
                    com.tencent.mars.xlog.Log.w("AdLandingPagesProxy", "FollowUserEventListener, event from other");
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$FollowUserEventListener");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy$FollowUserEventListener");
            return true;
        }
    }

    public AdLandingPagesProxy(k55.k kVar) {
        super(kVar);
        this.f164035f = new java.util.HashMap();
        this.f164036g = new java.util.HashMap();
        this.f164039m = new com.tencent.mm.plugin.sns.model.c(this);
        this.f164040n = new java.util.concurrent.ConcurrentHashMap();
        this.f164041o = new com.tencent.mm.plugin.sns.model.e(this);
        this.f164042p = new java.util.HashMap();
        this.f164043q = new java.util.HashMap();
        this.f164037h = kVar;
    }

    public static /* synthetic */ java.util.Map e(com.tencent.mm.plugin.sns.model.AdLandingPagesProxy adLandingPagesProxy) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.util.Map map = adLandingPagesProxy.f164036g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return map;
    }

    public static /* synthetic */ com.tencent.mm.modelbase.u0 g(com.tencent.mm.plugin.sns.model.AdLandingPagesProxy adLandingPagesProxy) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mm.modelbase.u0 u0Var = adLandingPagesProxy.f164039m;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return u0Var;
    }

    public static com.tencent.mm.plugin.sns.model.AdLandingPagesProxy getInstance() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInstance", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        if (f164033r == null) {
            k55.k kVar = new k55.k(com.tencent.mm.sdk.platformtools.x2.f193071a);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            f164033r = new com.tencent.mm.plugin.sns.model.AdLandingPagesProxy(kVar);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        }
        com.tencent.mm.plugin.sns.model.AdLandingPagesProxy adLandingPagesProxy = f164033r;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInstance", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return adLandingPagesProxy;
    }

    public void addAdFinderContract(s34.y yVar, int i17, com.tencent.mm.plugin.sns.model.t tVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addAdFinderContract", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((java.util.HashMap) this.f164035f).put(java.lang.Long.valueOf(currentTimeMillis), tVar);
        REMOTE_CALL("doAddAdFinderContractMM", java.lang.Long.valueOf(currentTimeMillis), yVar.f402829a, yVar.f402830b, yVar.f402832d, yVar.f402831c, yVar.f402833e, yVar.f402834f, yVar.f402835g, java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addAdFinderContract", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void addCallback(java.lang.String str, com.tencent.mm.plugin.sns.model.n nVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addCallback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        long queryIdByAppid = queryIdByAppid(str);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f164040n;
        java.util.ArrayList arrayList = (java.util.ArrayList) concurrentHashMap.get(java.lang.Long.valueOf(queryIdByAppid));
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
            arrayList.add(nVar);
        } else if (!arrayList.contains(nVar)) {
            arrayList.add(nVar);
        }
        concurrentHashMap.put(java.lang.Long.valueOf(queryIdByAppid), arrayList);
        REMOTE_CALL("addCallbackMM", new java.lang.Object[0]);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addCallback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    public void addCallbackMM() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addCallbackMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        za4.k g17 = za4.k.g();
        za4.f fVar = this.f164041o;
        g17.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        if (fVar != null) {
            g17.f471137d = fVar;
        }
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        com.tencent.mm.plugin.downloader.model.r0.i().a(g17.f471141h);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addCallback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addCallbackMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void addReportInfo(java.lang.String str, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.j3 j3Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addReportInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        REMOTE_CALL("addReportInfoMM", str, j3Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addReportInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    public void addReportInfoMM(java.lang.String str, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.j3 j3Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addReportInfoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        za4.k.g().e(str, j3Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addReportInfoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.l
    public void clearCallback() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clearCallback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        REMOTE_CALL("clearCallbackMM", new java.lang.Object[0]);
        synchronized (this.f164042p) {
            try {
                ((java.util.HashMap) this.f164042p).clear();
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clearCallback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
                throw th6;
            }
        }
        ((java.util.HashMap) this.f164035f).clear();
        this.f164040n.clear();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clearCallback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    public void clearCallbackMM() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clearCallbackMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mars.xlog.Log.i("AdLandingPagesProxy", "clearCallbackMM, hashCode=" + hashCode());
        ((java.util.HashMap) this.f164036g).clear();
        this.f164041o = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeOnSceneEnd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        gm0.j1.i();
        com.tencent.mm.modelbase.r1 r1Var = gm0.j1.n().f273288b;
        com.tencent.mm.modelbase.u0 u0Var = this.f164039m;
        r1Var.q(1337, u0Var);
        gm0.j1.i();
        gm0.j1.n().f273288b.q(1210, u0Var);
        gm0.j1.i();
        gm0.j1.n().f273288b.q(2874, u0Var);
        gm0.j1.i();
        gm0.j1.n().f273288b.q(2721, u0Var);
        gm0.j1.i();
        gm0.j1.n().f273288b.q(1802, u0Var);
        gm0.j1.i();
        gm0.j1.n().f273288b.q(2605, u0Var);
        gm0.j1.i();
        gm0.j1.n().f273288b.q(2883, u0Var);
        gm0.j1.i();
        gm0.j1.n().f273288b.q(4353, u0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeOnSceneEnd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clearCallbackMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void confirmDialPhoneNum(android.app.Activity activity, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("confirmDialPhoneNum", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        if (str == null || str.length() <= 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("confirmDialPhoneNum", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return;
        }
        android.content.Intent intent = new android.content.Intent(com.tencent.mm.sdk.platformtools.x2.f193071a, (java.lang.Class<?>) com.tencent.mm.plugin.sns.ui.SnsTransparentUI.class);
        intent.putExtra("phoneNum", str);
        intent.putExtra("op", 4);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/sns/model/AdLandingPagesProxy", "confirmDialPhoneNum", "(Landroid/app/Activity;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity, "com/tencent/mm/plugin/sns/model/AdLandingPagesProxy", "confirmDialPhoneNum", "(Landroid/app/Activity;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("confirmDialPhoneNum", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void connect(java.lang.Runnable runnable) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("connect", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        this.f164037h.a(runnable);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("connect", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public int contactGetTypeTextFromUserName(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("contactGetTypeTextFromUserName", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.Object REMOTE_CALL = REMOTE_CALL("contactGetTypeTextFromUserNameMM", str);
        int intValue = REMOTE_CALL == null ? 0 : ((java.lang.Integer) REMOTE_CALL).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("contactGetTypeTextFromUserName", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return intValue;
    }

    @k55.m
    public int contactGetTypeTextFromUserNameMM(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("contactGetTypeTextFromUserNameMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        int C = c01.e2.C(str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("contactGetTypeTextFromUserNameMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return C;
    }

    public void deleteDeferredDeepLink(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("deleteDeferredDeepLink", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        REMOTE_CALL("deleteDeferredDeepLinkMM", str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteDeferredDeepLink", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    public void deleteDeferredDeepLinkMM(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("deleteDeferredDeepLinkMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        j().edit().remove(str).commit();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteDeferredDeepLinkMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void doAdChannelScene(java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.mm.plugin.sns.model.t tVar, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAdChannelScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((java.util.HashMap) this.f164035f).put(java.lang.Long.valueOf(currentTimeMillis), tVar);
        REMOTE_CALL("doAdChannelSceneMM", java.lang.Long.valueOf(currentTimeMillis), str, str2, str3, java.lang.Boolean.valueOf(z17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAdChannelScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    public void doAdChannelSceneMM(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAdChannelSceneMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        ib4.b bVar = new ib4.b(str, str2, str3, z17);
        ((java.util.HashMap) this.f164036g).put(bVar, java.lang.Long.valueOf(j17));
        gm0.j1.i();
        gm0.j1.n().f273288b.g(bVar);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(1210, this.f164039m);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAdChannelSceneMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void doAdNativeAntiAbuseScene(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4, com.tencent.mm.plugin.sns.model.t tVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAdNativeAntiAbuseScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((java.util.HashMap) this.f164035f).put(java.lang.Long.valueOf(currentTimeMillis), tVar);
        REMOTE_CALL("doAdNativeAntiAbuseSceneMM", java.lang.Long.valueOf(currentTimeMillis), str, str2, str3, java.lang.Integer.valueOf(i17), str4);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAdNativeAntiAbuseScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    public void doAdNativeAntiAbuseSceneMM(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAdNativeAntiAbuseSceneMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        ib4.a aVar = new ib4.a(str, str2, str3, i17, str4, "", 0L);
        ((java.util.HashMap) this.f164036g).put(aVar, java.lang.Long.valueOf(j17));
        gm0.j1.d().a(4679, this.f164039m);
        gm0.j1.d().g(aVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAdNativeAntiAbuseSceneMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void doAdUpdateQrUrlScene(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, com.tencent.mm.plugin.sns.model.t tVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAdUpdateQrUrlScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        long incrementAndGet = f164034s.incrementAndGet();
        ((java.util.HashMap) this.f164035f).put(java.lang.Long.valueOf(incrementAndGet), tVar);
        REMOTE_CALL("doAdUpdateQrUrlSceneMM", java.lang.Long.valueOf(incrementAndGet), str, str2, str3, str4, str5, str6);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAdUpdateQrUrlScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    public void doAdUpdateQrUrlSceneMM(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAdUpdateQrUrlSceneMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        ib4.m mVar = new ib4.m(str, str2, str3, str4, str5, str6);
        ((java.util.HashMap) this.f164036g).put(mVar, java.lang.Long.valueOf(j17));
        gm0.j1.d().a(com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_IN_FAILED, this.f164039m);
        gm0.j1.d().g(mVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAdUpdateQrUrlSceneMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    public void doAddAdFinderContractMM(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAddAdFinderContractMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doFollowFinder", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mars.xlog.Log.i("AdLandingPagesProxy", "doFollowFinder, userName=" + str);
        if (this.f164038i == null) {
            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.FollowUserEventListener followUserEventListener = new com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.FollowUserEventListener(j17, str);
            this.f164038i = followUserEventListener;
            followUserEventListener.alive();
        }
        try {
            ((com.tencent.mm.plugin.finder.service.s1) ((zy2.e6) i95.n0.c(zy2.e6.class))).Ni(str, 1, 0L, false, 102, 0);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdLandingPagesProxy", "doFollowFinder exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doFollowFinder", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAddAdFinderContractMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void doAddBrandScene(java.lang.String str, int i17, com.tencent.mm.plugin.sns.model.t tVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAddBrandScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((java.util.HashMap) this.f164035f).put(java.lang.Long.valueOf(currentTimeMillis), tVar);
        REMOTE_CALL("doAddBrandSceneSceneMM", java.lang.Long.valueOf(currentTimeMillis), str, java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAddBrandScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    public void doAddBrandSceneSceneMM(long j17, java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAddBrandSceneSceneMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mm.modelbase.m1 a17 = com.tencent.mm.plugin.sns.model.y.a(str, this.f164039m, i17);
        boolean z17 = a17 instanceof ab0.s;
        java.util.Map map = this.f164036g;
        if (z17) {
            ((java.util.HashMap) map).put(a17, java.lang.Long.valueOf(j17));
            gm0.j1.d().g(a17);
        } else if (a17 instanceof ns.l) {
            ((java.util.HashMap) map).put(a17, java.lang.Long.valueOf(j17));
            gm0.j1.d().g(a17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAddBrandSceneSceneMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void doCgiReportCanvasBrowseInfo(int i17, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doCgiReportCanvasBrowseInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        REMOTE_CALL("doCgiReportCanvasBrowseInfoMM", java.lang.Integer.valueOf(i17), str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doCgiReportCanvasBrowseInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    public void doCgiReportCanvasBrowseInfoMM(int i17, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doCgiReportCanvasBrowseInfoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        r45.e44 e44Var = new r45.e44();
        e44Var.f373007d = i17;
        e44Var.f373009f = (int) (java.lang.System.currentTimeMillis() / 1000);
        e44Var.f373010g = 1;
        e44Var.f373008e = new com.tencent.mm.protobuf.g(str.getBytes());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e44Var);
        i64.n0 n0Var = new i64.n0(arrayList);
        gm0.j1.i();
        gm0.j1.n().f273288b.g(n0Var);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(1802, this.f164039m);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doCgiReportCanvasBrowseInfoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void doDynamicUpdateScene(java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.mm.plugin.sns.model.t tVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doDynamicUpdateScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((java.util.HashMap) this.f164035f).put(java.lang.Long.valueOf(currentTimeMillis), tVar);
        REMOTE_CALL("doDynamicUpdateSceneMM", java.lang.Long.valueOf(currentTimeMillis), str, str2, str3);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doDynamicUpdateScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    public void doDynamicUpdateSceneMM(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doDynamicUpdateSceneMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        ib4.l lVar = new ib4.l(str, str2, str3);
        ((java.util.HashMap) this.f164036g).put(lVar, java.lang.Long.valueOf(j17));
        gm0.j1.i();
        gm0.j1.n().f273288b.g(lVar);
        gm0.j1.i();
        com.tencent.mm.modelbase.r1 r1Var = gm0.j1.n().f273288b;
        com.tencent.mm.modelbase.u0 u0Var = this.f164039m;
        r1Var.a(1337, u0Var);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(2721, u0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doDynamicUpdateSceneMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public int doFav(android.content.Intent intent, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doFav", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.Object REMOTE_CALL = REMOTE_CALL("doFavMM", intent, java.lang.Integer.valueOf(i17));
        int intValue = REMOTE_CALL == null ? 0 : ((java.lang.Integer) REMOTE_CALL).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doFav", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return intValue;
    }

    public int doFavAdlanding(long j17, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i18, java.lang.String str7, java.lang.String str8) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doFavAdlanding", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.Object REMOTE_CALL = REMOTE_CALL("doFavAdlandingMM", java.lang.Long.valueOf(j17), str, java.lang.Integer.valueOf(i17), str2, str3, str4, str5, str6, java.lang.Integer.valueOf(i18), str7, str8);
        int intValue = REMOTE_CALL == null ? 0 : ((java.lang.Integer) REMOTE_CALL).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doFavAdlanding", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return intValue;
    }

    @k55.m
    public int doFavAdlandingMM(long j17, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i18, java.lang.String str7, java.lang.String str8) {
        java.util.LinkedList linkedList;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doFavAdlandingMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
        if (((i17 != 1 && i17 != 2 && i17 != 3 && i17 != 4 && i17 != 9 && i17 != 10 && i17 != 11) || com.tencent.mm.sdk.platformtools.t8.K0(str)) && ((i17 != 5 && i17 != 6) || j17 == -2147483648L)) {
        }
        o72.c5 c5Var = (o72.c5) i95.n0.c(o72.c5.class);
        java.lang.String str9 = str6.hashCode() + "";
        java.lang.String r17 = c01.z1.r();
        ((com.tencent.mm.pluginsdk.model.b2) c5Var).getClass();
        boolean z17 = com.tencent.mm.pluginsdk.model.a2.f188779a;
        java.lang.String format = java.lang.String.format("%s#%s", str9, "");
        r45.bq0 bq0Var = new r45.bq0();
        r45.jq0 jq0Var = new r45.jq0();
        jq0Var.e(r17);
        jq0Var.g(2);
        jq0Var.c(java.lang.System.currentTimeMillis());
        jq0Var.d(str9 + "");
        jq0Var.i(format);
        r45.gp0 gp0Var = new r45.gp0();
        gp0Var.g0(format);
        gp0Var.z0(true);
        gp0Var.h0(5);
        gp0Var.O0(str4);
        gp0Var.m0(str5);
        gp0Var.Z(str6);
        gp0Var.x0(true);
        bq0Var.f370964f.add(gp0Var);
        r45.tq0 tq0Var = new r45.tq0();
        tq0Var.o(str7);
        tq0Var.i(str2);
        bq0Var.r(tq0Var);
        bq0Var.o(jq0Var);
        am.c4 c4Var = doFavoriteEvent.f54090g;
        c4Var.f6315a = bq0Var;
        c4Var.f6319e = str4;
        c4Var.f6317c = 5;
        c4Var.f6322h = c01.n2.a(str3);
        c4Var.f6318d = str4;
        c4Var.f6319e = str5;
        r45.bq0 bq0Var2 = c4Var.f6315a;
        if (bq0Var2 != null && (linkedList = bq0Var2.f370964f) != null && linkedList.size() > 0 && bq0Var2.f370964f.get(0) != null) {
            ((r45.gp0) bq0Var2.f370964f.get(0)).Z(str6);
            ((r45.gp0) bq0Var2.f370964f.get(0)).O0(str4);
            ((r45.gp0) bq0Var2.f370964f.get(0)).m0(str5);
            ((r45.gp0) bq0Var2.f370964f.get(0)).H0(str8);
        }
        if (bq0Var2 != null) {
            bq0Var2.p(str4);
            bq0Var2.e(str5);
        }
        c4Var.f6327m = i18;
        doFavoriteEvent.e();
        int i19 = c4Var.f6326l;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doFavAdlandingMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return i19;
    }

    @k55.m
    public int doFavMM(android.content.Intent intent, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doFavMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
        ((com.tencent.mm.pluginsdk.model.b2) ((o72.c5) i95.n0.c(o72.c5.class))).getClass();
        com.tencent.mm.pluginsdk.model.a2.l(doFavoriteEvent, intent);
        am.c4 c4Var = doFavoriteEvent.f54090g;
        c4Var.f6327m = i17;
        doFavoriteEvent.e();
        int i18 = c4Var.f6326l;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doFavMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return i18;
    }

    public void doFavOfficialItemScene(java.lang.String str, com.tencent.mm.plugin.sns.model.t tVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doFavOfficialItemScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("AdLandingPagesProxy", "doFavOfficialItemScene with empty itemBuff, interrupted!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doFavOfficialItemScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((java.util.HashMap) this.f164035f).put(java.lang.Long.valueOf(currentTimeMillis), tVar);
        REMOTE_CALL("doFavOfficialItemSceneMM", java.lang.Long.valueOf(currentTimeMillis), str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doFavOfficialItemScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    public void doFavOfficialItemSceneMM(long j17, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doFavOfficialItemSceneMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        ib4.k kVar = new ib4.k(str);
        ((java.util.HashMap) this.f164036g).put(kVar, java.lang.Long.valueOf(j17));
        gm0.j1.i();
        gm0.j1.n().f273288b.g(kVar);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(2874, this.f164039m);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doFavOfficialItemSceneMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void doGetHbCoverState(java.lang.String str, com.tencent.mm.plugin.sns.model.t tVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doGetHbCoverState", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((java.util.HashMap) this.f164035f).put(java.lang.Long.valueOf(currentTimeMillis), tVar);
        REMOTE_CALL("doGetHbCoverStateMM", java.lang.Long.valueOf(currentTimeMillis), str);
        com.tencent.mars.xlog.Log.i("AdLandingPagesProxy", "doGetHbCoverState, hbCoverId=" + str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doGetHbCoverState", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    public void doGetHbCoverStateMM(long j17, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doGetHbCoverStateMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        ib4.d dVar = new ib4.d(str);
        ((java.util.HashMap) this.f164036g).put(dVar, java.lang.Long.valueOf(j17));
        gm0.j1.i();
        gm0.j1.n().f273288b.g(dVar);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(2944, this.f164039m);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doGetHbCoverStateMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void doGetSmartPhoneScene(long j17, int i17, java.lang.String str, java.lang.String str2, int i18, java.lang.String str3, com.tencent.mm.plugin.sns.model.t tVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doGetSmartPhoneScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((java.util.HashMap) this.f164035f).put(java.lang.Long.valueOf(currentTimeMillis), tVar);
        REMOTE_CALL("doGetSmartPhoneSceneMM", java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), str, str2, java.lang.Integer.valueOf(i18), str3);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doGetSmartPhoneScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    public void doGetSmartPhoneSceneMM(long j17, long j18, int i17, java.lang.String str, java.lang.String str2, int i18, java.lang.String str3) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doGetSmartPhoneSceneMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        ib4.e eVar = new ib4.e(j18, i17, str, str2, i18, str3);
        ((java.util.HashMap) this.f164036g).put(eVar, java.lang.Long.valueOf(j17));
        gm0.j1.i();
        gm0.j1.n().f273288b.g(eVar);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(2605, this.f164039m);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doGetSmartPhoneSceneMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void doJumpToFinderFeedsDetailUI(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doJumpToFinderFeedsDetailUI", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        try {
            REMOTE_CALL("doJumpToFinderFeedsDetailUIMM", str, str2, str3, str4, str5, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("AdLandingPagesProxy", "doJumpToFinderFeedsDetailUI remote call has an exception!");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doJumpToFinderFeedsDetailUI", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    public void doJumpToFinderFeedsDetailUIMM(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i17, int i18) {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doJumpToFinderFeedsDetailUIMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        try {
            com.tencent.mm.plugin.sns.storage.SnsInfo b17 = com.tencent.mm.plugin.sns.model.l4.Fj().b1(str5);
            if (b17 == null) {
                z17 = false;
            } else {
                z17 = (i17 == 16 ? b17.getAtAdInfo() : b17.getAdInfo()).preloadFinderFeed;
            }
            l44.s4.f(com.tencent.mm.sdk.platformtools.x2.f193071a, str4, str, str2, str3, ca4.m0.D0(str5), z17, i18);
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("AdLandingPagesProxy", "doJumpToFinderFeedsDetailUI call has an exception");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doJumpToFinderFeedsDetailUIMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public boolean doJumpToFinderProfileUI(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        android.content.Context context2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doJumpToFinderProfileUI", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        if (context == null) {
            try {
                com.tencent.mars.xlog.Log.i("AdLandingPagesProxy", "doJumpToFinderProfileUI, context==null");
                context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("AdLandingPagesProxy", "doJumpToFinderProfileUI, exp=" + th6.toString());
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doJumpToFinderProfileUI", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
                return false;
            }
        } else {
            context2 = context;
        }
        android.content.Intent intent = new android.content.Intent(context2, (java.lang.Class<?>) com.tencent.mm.plugin.sns.ui.SnsAdProxyUI.class);
        intent.putExtra("action_type", 4);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.String str4 = "";
        intent.putExtra("finderUsername", str == null ? "" : str);
        intent.putExtra("uxInfo", str2 == null ? "" : str2);
        if (str3 != null) {
            str4 = str3;
        }
        intent.putExtra("snsIdStr", str4);
        intent.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, i17);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/plugin/sns/model/AdLandingPagesProxy", "doJumpToFinderProfileUI", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context2, "com/tencent/mm/plugin/sns/model/AdLandingPagesProxy", "doJumpToFinderProfileUI", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doJumpToFinderProfileUI", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return true;
    }

    public void doPreloadAdCanvas(long j17, java.lang.String str, java.lang.String str2, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doPreloadAdCanvas", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        REMOTE_CALL("doPreloadAdCanvasMM", java.lang.Long.valueOf(j17), str, str2, java.lang.Boolean.valueOf(z17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPreloadAdCanvas", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    public void doPreloadAdCanvasMM(long j17, java.lang.String str, java.lang.String str2, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doPreloadAdCanvasMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doPreloadAdCanvas", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
        za4.o0.c(j17, z17, str, str2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPreloadAdCanvas", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageResPreloader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPreloadAdCanvasMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void doPreloadTextStatusResource(f54.c0 c0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doPreloadTextStatusResource", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        REMOTE_CALL("doPreloadTextStatusResourceMM", c0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPreloadTextStatusResource", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    public void doPreloadTextStatusResourceMM(f54.c0 c0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doPreloadTextStatusResourceMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        try {
            c0Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getEmoticonUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingPageJumpTextStatusBtnInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEmoticonUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingPageJumpTextStatusBtnInfo");
            java.lang.String str = c0Var.G1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getImageUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingPageJumpTextStatusBtnInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getImageUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingPageJumpTextStatusBtnInfo");
            java.lang.String str2 = c0Var.f259702z1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVideoUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingPageJumpTextStatusBtnInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoUrl", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingPageJumpTextStatusBtnInfo");
            w64.t.e(str, str2, c0Var.A1);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdLandingPagesProxy", "doPreloadTextStatusMM, exp is " + th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doPreloadTextStatusResourceMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    public void doSearchContactMM(long j17, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doSearchContactMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mars.xlog.Log.i("AdLandingPagesProxy", "doSearchContactMM, userName=" + str);
        ((k90.l) ((l90.k) i95.n0.c(l90.k.class))).getClass();
        tg3.r1 r1Var = new tg3.r1(str, 1);
        ((java.util.HashMap) this.f164036g).put(r1Var, java.lang.Long.valueOf(j17));
        gm0.j1.d().a(106, this.f164039m);
        gm0.j1.d().g(r1Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doSearchContactMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void doSearchDynamicUpdateScene(java.lang.String str, com.tencent.mm.plugin.sns.model.t tVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doSearchDynamicUpdateScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((java.util.HashMap) this.f164035f).put(java.lang.Long.valueOf(currentTimeMillis), tVar);
        REMOTE_CALL("doSearchDynamicUpdateSceneMM", java.lang.Long.valueOf(currentTimeMillis), str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doSearchDynamicUpdateScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    public void doSearchDynamicUpdateSceneMM(long j17, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doSearchDynamicUpdateSceneMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        ib4.l lVar = new ib4.l(str);
        ((java.util.HashMap) this.f164036g).put(lVar, java.lang.Long.valueOf(j17));
        gm0.j1.i();
        gm0.j1.n().f273288b.g(lVar);
        gm0.j1.i();
        com.tencent.mm.modelbase.r1 r1Var = gm0.j1.n().f273288b;
        com.tencent.mm.modelbase.u0 u0Var = this.f164039m;
        r1Var.a(1337, u0Var);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(2721, u0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doSearchDynamicUpdateSceneMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void doTransimt(android.app.Activity activity, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doTransimt", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        android.content.Intent intent = new android.content.Intent(com.tencent.mm.sdk.platformtools.x2.f193071a, (java.lang.Class<?>) com.tencent.mm.plugin.sns.ui.SnsTransparentUI.class);
        intent.putExtra("adlandingXml", str);
        intent.putExtra("shareTitle", str2);
        intent.putExtra("shareThumbUrl", str3);
        intent.putExtra("shareDesc", str4);
        intent.putExtra("shareUrl", str5);
        intent.putExtra("statExtStr", str6);
        intent.putExtra("uxInfo", str7);
        intent.putExtra("canvasId", str8);
        intent.putExtra("op", 2);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/sns/model/AdLandingPagesProxy", "doTransimt", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity, "com/tencent/mm/plugin/sns/model/AdLandingPagesProxy", "doTransimt", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doTransimt", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    public void doTransimtMM(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doTransimtMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doTransimtMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void doUpdateUxInfoScene(java.lang.String str, int i17, com.tencent.mm.plugin.sns.model.t tVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doUpdateUxInfoScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((java.util.HashMap) this.f164035f).put(java.lang.Long.valueOf(currentTimeMillis), tVar);
        REMOTE_CALL("doUpdateUxInfoSceneMM", java.lang.Long.valueOf(currentTimeMillis), str, java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doUpdateUxInfoScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    public void doUpdateUxInfoSceneMM(long j17, java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doUpdateUxInfoSceneMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        ib4.n nVar = new ib4.n(str, i17);
        ((java.util.HashMap) this.f164036g).put(nVar, java.lang.Long.valueOf(j17));
        gm0.j1.i();
        gm0.j1.n().f273288b.g(nVar);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(2883, this.f164039m);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doUpdateUxInfoSceneMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void downloadLandingPageVideo(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, boolean z17, int i18, boolean z18, dn.n nVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("downloadLandingPageVideo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        if (com.tencent.mm.sdk.platformtools.t8.N0(str, str2, str3)) {
            if (nVar != null) {
                nVar.g(str, -1, null);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadLandingPageVideo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return;
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.A(nd1.j0.CTRL_INDEX, 20);
        android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("sns_ad_download_resource_preferences", 0);
        boolean z19 = sharedPreferences.getBoolean(str, false);
        com.tencent.mars.xlog.Log.i("AdLandingPagesProxy", "downloadLandingPageVideo, mediaId is %s, finish is %s, isPreload=%s", str, java.lang.Boolean.valueOf(z19), java.lang.String.valueOf(z17));
        if (com.tencent.mm.vfs.w6.j(str3)) {
            com.tencent.mars.xlog.Log.i("AdLandingPagesProxy", "downloadLandingPageVideo, %s is already download, and finished is %s", str, java.lang.Boolean.valueOf(z19));
            if (z19) {
                g0Var.A(nd1.j0.CTRL_INDEX, 21);
                nVar.g(str, 0, null);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadLandingPageVideo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
                return;
            }
            g0Var.A(nd1.j0.CTRL_INDEX, 22);
        } else if (z19) {
            com.tencent.mars.xlog.Log.i("AdLandingPagesProxy", "downloadLandingPageVideo, %s last download file was deleted, and finished is %s", str, java.lang.Boolean.valueOf(z19));
            g0Var.A(nd1.j0.CTRL_INDEX, 23);
            sharedPreferences.edit().putBoolean(str, false).commit();
        } else {
            g0Var.A(nd1.j0.CTRL_INDEX, 24);
        }
        java.util.Map map = this.f164043q;
        if (z17 && ((java.util.HashMap) map).containsKey(str)) {
            com.tencent.mars.xlog.Log.i("AdLandingPagesProxy", "downloadLandingPageVideo, %s, %s is already in downloading, preload=true", str2, str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadLandingPageVideo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        } else {
            if (nVar != null) {
                ((java.util.HashMap) map).put(str, nVar);
            }
            REMOTE_CALL("downloadLandingPageVideoMM", str, str2, str3, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(z18));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadLandingPageVideo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        }
    }

    @k55.m
    public void downloadLandingPageVideoMM(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, boolean z17, int i18, boolean z18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("downloadLandingPageVideoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mars.xlog.Log.i("AdLandingPagesProxy", "add online video task [%s] url[%s] path[%s]", str, str2, str3);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(nd1.j0.CTRL_INDEX, 25);
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.sns.model.i(this, str, str2, str3, i17, z17, i18, z18));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadLandingPageVideoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void downloadLandingPagesCDNFile(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, fe0.o3 o3Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("downloadLandingPagesCDNFile", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str2) || com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            if (o3Var != null) {
                o3Var.a();
            }
            return;
        }
        if (o3Var != null) {
            synchronized (this.f164042p) {
                try {
                    if (!((java.util.HashMap) this.f164042p).containsKey(str2)) {
                        ((java.util.HashMap) this.f164042p).put(str2, new java.util.ArrayList());
                    }
                    java.util.List list = (java.util.List) ((java.util.HashMap) this.f164042p).get(str2);
                    if (list != null) {
                        list.add(o3Var);
                    }
                } finally {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadLandingPagesCDNFile", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
                }
            }
        }
        REMOTE_CALL("downloadLandingPagesCDNFileMM", str, str2, str3, java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadLandingPagesCDNFile", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    public void downloadLandingPagesCDNFileMM(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("downloadLandingPagesCDNFileMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        if (i17 == 0) {
            downloadLandingPagesImageMMImpl(str, str2, str3);
        } else if (i17 == 1) {
            downloadLandingPagesSightMMImpl(str, str2, str3);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadLandingPagesCDNFileMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void downloadLandingPagesImageMMImpl(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("downloadLandingPagesImageMMImpl", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mars.xlog.Log.i("AdLandingPagesProxy", "downloadLandingPagesImageMMImpl, mediaId=" + str2);
        r45.jj4 h17 = m21.y.h(str2, 2, str3, str3, 1, 1, "");
        ca4.s0 s0Var = new ca4.s0(h17);
        s0Var.d(3);
        s0Var.e(h17.f377855d);
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.sns.model.f(this, h17, s0Var, str, str2));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadLandingPagesImageMMImpl", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void downloadLandingPagesSightMMImpl(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("downloadLandingPagesSightMMImpl", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mars.xlog.Log.i("AdLandingPagesProxy", "downloadLandingPagesSightMMImpl, mediaId=" + str2);
        r45.jj4 h17 = m21.y.h(str2, 6, str3, str3, 1, 1, "");
        h17.N = true;
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.sns.model.g(this, h17, str, str2));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadLandingPagesSightMMImpl", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void downloadPagFile(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("downloadPagFile", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        REMOTE_CALL("downloadPagFileMM", str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadPagFile", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    public boolean downloadPagFileMM(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("downloadPagFileMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        try {
            com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.l0.a(str);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdLandingPagesProxy", "downloadPagFileMM exp=" + android.util.Log.getStackTraceString(th6));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadPagFileMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return false;
    }

    @k55.l
    public void failed(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.FAILED, "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f164040n;
        java.util.Iterator it = ((java.util.ArrayList) concurrentHashMap.get(java.lang.Long.valueOf(j17))).iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.sns.model.n nVar = (com.tencent.mm.plugin.sns.model.n) it.next();
            if (nVar != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.FAILED, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$MyDownloadCallback");
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.s4 s4Var = ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z3) nVar).f165864a;
                int i17 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.V(s4Var.f165485r).V1;
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.U(s4Var.f165485r).l(8);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.FAILED, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$MyDownloadCallback");
            }
        }
        concurrentHashMap.remove(java.lang.Long.valueOf(j17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.FAILED, "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void favEditTag() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("favEditTag", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        REMOTE_CALL("favEditTagMM", new java.lang.Object[0]);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("favEditTag", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    public void favEditTagMM() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("favEditTagMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mm.autogen.events.FavoriteOperationEvent favoriteOperationEvent = new com.tencent.mm.autogen.events.FavoriteOperationEvent();
        favoriteOperationEvent.f54243g.f8528a = 35;
        favoriteOperationEvent.e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("favEditTagMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void fetchQRCodeInfo(int i17, java.lang.String str, com.tencent.mm.plugin.sns.model.t tVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fetchQRCodeInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((java.util.HashMap) this.f164035f).put(java.lang.Long.valueOf(currentTimeMillis), tVar);
        REMOTE_CALL("fetchQRCodeInfoMM", java.lang.Long.valueOf(currentTimeMillis), java.lang.Integer.valueOf(i17), str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fetchQRCodeInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    public void fetchQRCodeInfoMM(long j17, int i17, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fetchQRCodeInfoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.sns.model.k(this, i17, str, j17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fetchQRCodeInfoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void geoLocation(java.lang.String str, com.tencent.mm.plugin.sns.model.t tVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("geoLocation", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            ((java.util.HashMap) this.f164035f).put(java.lang.Long.valueOf(currentTimeMillis), tVar);
            REMOTE_CALL("geoLocationMM", java.lang.Long.valueOf(currentTimeMillis), str);
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("AdLandingPagesProxy", "geoLocation catch one exception");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("geoLocation", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    public void geoLocationMM(long j17, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("geoLocationMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        try {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("makeRequester", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoServerRequester");
            r54.f fVar = null;
            if (j17 <= 0) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeRequester", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoServerRequester");
            } else {
                try {
                    fVar = new r54.f(this, "onGeoLocation", j17);
                } catch (java.lang.Throwable unused) {
                    com.tencent.mars.xlog.Log.e("GeoServerRequester", "there is something wrong in makeRequester");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeRequester", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoServerRequester");
            }
            if (fVar != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("request", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoServerRequester");
                try {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("requestGeo", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoServerRequester");
                    boolean equalsIgnoreCase = "GCJ02".equalsIgnoreCase(str);
                    i11.e eVar = fVar.f392741g;
                    if (equalsIgnoreCase) {
                        ((i11.h) eVar).j(fVar, false);
                    } else {
                        ((i11.h) eVar).k(fVar, false);
                    }
                    com.tencent.mm.plugin.report.service.b1.f(12, 10);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("requestGeo", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoServerRequester");
                } catch (java.lang.Throwable unused2) {
                    com.tencent.mars.xlog.Log.e("GeoServerRequester", "there is something wrong in request");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("request", "com.tencent.mm.plugin.sns.ad.landingpage.helper.geo.GeoServerRequester");
            }
        } catch (java.lang.Throwable unused3) {
            com.tencent.mars.xlog.Log.e("AdLandingPagesProxy", "geoLocationMM catch one exception");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("geoLocationMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public java.lang.String getAccSnsPath() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAccSnsPath", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.String str = (java.lang.String) REMOTE_CALL("getAccSnsPathMM", new java.lang.Object[0]);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAccSnsPath", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return str;
    }

    @k55.m
    public java.lang.String getAccSnsPathMM() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAccSnsPathMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.String Di = com.tencent.mm.plugin.sns.model.l4.Di();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAccSnsPathMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return Di;
    }

    public void getAdFinderContact(java.lang.String str, com.tencent.mm.plugin.sns.model.t tVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdFinderContact", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((java.util.HashMap) this.f164035f).put(java.lang.Long.valueOf(currentTimeMillis), tVar);
        REMOTE_CALL("getAdFinderContactMM", java.lang.Long.valueOf(currentTimeMillis), str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdFinderContact", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    public void getAdFinderContactMM(long j17, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdFinderContactMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        ((com.tencent.mm.plugin.finder.service.s1) ((zy2.e6) i95.n0.c(zy2.e6.class))).Ui(str, new com.tencent.mm.plugin.sns.model.a(this, j17), 4);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdFinderContactMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public java.lang.String getAdValue(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdValue", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        if (android.text.TextUtils.isEmpty(str2)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdValue", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return "";
        }
        try {
            java.lang.Object REMOTE_CALL = REMOTE_CALL("getAdValueMM", str, str2);
            if (REMOTE_CALL instanceof java.lang.String) {
                java.lang.String str3 = (java.lang.String) REMOTE_CALL;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdValue", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
                return str3;
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdLandingPagesProxy", "getAdValue exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdValue", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return "";
    }

    @k55.m
    public java.lang.String getAdValueMM(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdValueMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        try {
            java.lang.String d17 = p34.o.d(str, str2);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdValueMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return d17;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdLandingPagesProxy", "getAdValueMM exp=" + th6.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdValueMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return "";
        }
    }

    public int getAdVoteIndex(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdVoteIndex", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        int intValue = ((java.lang.Integer) REMOTE_CALL("getAdVoteIndexMM", str, str2, str3)).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdVoteIndex", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return intValue;
    }

    @k55.m
    public int getAdVoteIndexMM(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdVoteIndexMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        int c17 = com.tencent.mm.plugin.sns.storage.w2.c(str, str2, str3);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdVoteIndexMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return c17;
    }

    public java.lang.String getAdVoteInfo(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdVoteInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.String str4 = (java.lang.String) REMOTE_CALL("getAdVoteInfoMM", str, str2, str3);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdVoteInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return str4;
    }

    @k55.m
    public java.lang.String getAdVoteInfoMM(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdVoteInfoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.String d17 = com.tencent.mm.plugin.sns.storage.w2.d(str, str2, str3);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdVoteInfoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return d17;
    }

    public java.lang.String getAdWuid() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdWuid", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.Object REMOTE_CALL = REMOTE_CALL("getAdWuidMM", new java.lang.Object[0]);
        java.lang.String str = REMOTE_CALL == null ? "" : (java.lang.String) REMOTE_CALL;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdWuid", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return str;
    }

    @k55.m
    public java.lang.String getAdWuidMM() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdWuidMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.String c17 = n74.w0.c();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdWuidMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return c17;
    }

    public android.graphics.Bitmap getAvatarByUserName(java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAvatarByUserName", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.Object REMOTE_CALL = REMOTE_CALL("getAvatarByUserNameMM", str, java.lang.Boolean.valueOf(z17));
        if (!(REMOTE_CALL instanceof android.graphics.Bitmap)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAvatarByUserName", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return null;
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) REMOTE_CALL;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAvatarByUserName", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return bitmap;
    }

    @k55.m
    public android.graphics.Bitmap getAvatarByUserNameMM(java.lang.String str, boolean z17) {
        java.lang.String str2;
        u45.f a17;
        android.graphics.Bitmap Ai;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAvatarByUserNameMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        try {
            str2 = str + "-1.0";
            a17 = u45.e.a();
            Ai = a17 != null ? ((va3.m0) u45.e.a()).Ai(str2) : null;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdLandingPagesProxy", "getAvatarByUserNameMM name=" + str + ", exp=" + android.util.Log.getStackTraceString(th6));
        }
        if (Ai != null && !Ai.isRecycled()) {
            com.tencent.mars.xlog.Log.i("AdLandingPagesProxy", "getAvatarByUserNameMM, useCache, name=" + str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAvatarByUserNameMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return Ai;
        }
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).getClass();
        com.tencent.mm.pluginsdk.ui.j1 c17 = com.tencent.mm.pluginsdk.ui.u.c();
        if (c17 != null) {
            Ai = c17.loadBitmap(str);
        } else {
            com.tencent.mars.xlog.Log.i("AdLandingPagesProxy", "getAvatarByUserNameMM, loader==null");
        }
        if (Ai != null) {
            android.graphics.Bitmap s07 = com.tencent.mm.sdk.platformtools.x.s0(Ai, false, Ai.getWidth() * 1.0f);
            if (a17 != null) {
                ((va3.m0) a17).Bi(str2, s07);
            }
            if (s07 != null && !s07.isRecycled()) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAvatarByUserNameMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
                return s07;
            }
        } else {
            com.tencent.mars.xlog.Log.i("AdLandingPagesProxy", "getAvatarByUserNameMM, loader return null");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAvatarByUserNameMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return null;
    }

    public void getBtnPersonalWxUserName(java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.sns.model.t tVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBtnPersonalWxUserName", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((java.util.HashMap) this.f164035f).put(java.lang.Long.valueOf(currentTimeMillis), tVar);
        REMOTE_CALL("getBtnPersonalWxUserNameMM", java.lang.Long.valueOf(currentTimeMillis), str, str2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBtnPersonalWxUserName", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    public void getBtnPersonalWxUserNameMM(long j17, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBtnPersonalWxUserNameMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        ib4.c cVar = new ib4.c(str, str2);
        gm0.j1.i();
        gm0.j1.n().f273288b.g(cVar);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(4353, new com.tencent.mm.plugin.sns.model.d(this, j17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBtnPersonalWxUserNameMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public java.lang.Object getCfg(int i17, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCfg", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.Object REMOTE_CALL = REMOTE_CALL("getCfgMM", java.lang.Integer.valueOf(i17), obj);
        if (REMOTE_CALL != null) {
            obj = REMOTE_CALL;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCfg", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return obj;
    }

    @k55.m
    public java.lang.Object getCfgMM(int i17, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCfgMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        gm0.j1.i();
        java.lang.Object l17 = gm0.j1.u().c().l(i17, obj);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCfgMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return l17;
    }

    public java.lang.String getDisplayName(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDisplayName", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.Object REMOTE_CALL = REMOTE_CALL("getDisplayNameMM", str);
        java.lang.String str2 = REMOTE_CALL == null ? "" : (java.lang.String) REMOTE_CALL;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDisplayName", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return str2;
    }

    @k55.m
    public java.lang.String getDisplayNameMM(java.lang.String str) {
        java.lang.String str2 = "";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDisplayNameMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        try {
            gm0.j1.i();
            com.tencent.mm.storage.k4 Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
            com.tencent.mm.storage.z3 f07 = Bi == null ? null : Bi.f0(str);
            if (f07 != null) {
                str2 = f07.g2();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDisplayNameMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return str2;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdLandingPagesProxy", "getDisplayNameMM, exp=" + th6.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDisplayNameMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return "";
        }
    }

    public void getOpenSdkAppInfo(java.lang.String str, com.tencent.mm.plugin.sns.model.t tVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOpenSdkAppInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mars.xlog.Log.i("AdLandingPagesProxy", "getOpenSdkAppInfo, appId=" + str);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((java.util.HashMap) this.f164035f).put(java.lang.Long.valueOf(currentTimeMillis), tVar);
        REMOTE_CALL("getOpenSdkAppInfoMM", str, java.lang.Long.valueOf(currentTimeMillis));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOpenSdkAppInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    public void getOpenSdkAppInfoMM(java.lang.String str, long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOpenSdkAppInfoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.sns.model.m(this, str, j17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOpenSdkAppInfoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public java.lang.String getPhoneNumber() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPhoneNumber", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.Object REMOTE_CALL = REMOTE_CALL("getPhoneNumberMM", new java.lang.Object[0]);
        if (!(REMOTE_CALL instanceof java.lang.String)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPhoneNumber", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return "";
        }
        java.lang.String str = (java.lang.String) REMOTE_CALL;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPhoneNumber", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return str;
    }

    @k55.m
    public java.lang.String getPhoneNumberMM() {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPhoneNumberMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        try {
            str = (java.lang.String) gm0.j1.u().c().l(6, null);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdLandingPagesProxy", "getPhoneNumberMM exp=" + android.util.Log.getStackTraceString(th6));
            str = "";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPhoneNumberMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return str;
    }

    public k55.k getRemoteServiceProxy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRemoteServiceProxy", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRemoteServiceProxy", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return this.f164037h;
    }

    public java.lang.String getSelfNickName() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSelfNickName", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.Object REMOTE_CALL = REMOTE_CALL("getSelfNickNameMM", new java.lang.Object[0]);
        java.lang.String str = REMOTE_CALL == null ? "" : (java.lang.String) REMOTE_CALL;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSelfNickName", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return str;
    }

    @k55.m
    public java.lang.String getSelfNickNameMM() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSelfNickNameMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        try {
            java.lang.String l17 = c01.z1.l();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSelfNickNameMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return l17;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdLandingPagesProxy", "getSelfNickNameMM, exp=" + th6.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSelfNickNameMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return "";
        }
    }

    public java.lang.String getSelfUserName() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSelfUserName", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.Object REMOTE_CALL = REMOTE_CALL("getSelfUserNameMM", new java.lang.Object[0]);
        java.lang.String str = REMOTE_CALL == null ? "" : (java.lang.String) REMOTE_CALL;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSelfUserName", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return str;
    }

    @k55.m
    public java.lang.String getSelfUserNameMM() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSelfUserNameMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        try {
            java.lang.String r17 = c01.z1.r();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSelfUserNameMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return r17;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdLandingPagesProxy", "getSelfUserNameMM, exp=" + th6.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSelfUserNameMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return "";
        }
    }

    public java.lang.String getSnsAdCanvasExtXml(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsAdCanvasExtXml", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.String str2 = (java.lang.String) REMOTE_CALL("getSnsAdCanvasExtXmlMM", str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsAdCanvasExtXml", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return str2;
    }

    @k55.m
    public java.lang.String getSnsAdCanvasExtXmlMM(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsAdCanvasExtXmlMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mm.plugin.sns.storage.SnsInfo b17 = com.tencent.mm.plugin.sns.model.l4.Fj().b1(str);
        if (b17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsAdCanvasExtXmlMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return "";
        }
        java.lang.String str2 = b17.getAdInfo().adCanvasExtXml;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsAdCanvasExtXmlMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return str2;
    }

    public int getSnsAdType(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsAdType", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.Object REMOTE_CALL = REMOTE_CALL("getSnsAdTypeMM", str);
        if (!(REMOTE_CALL instanceof java.lang.Number)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsAdType", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return 0;
        }
        int intValue = ((java.lang.Number) REMOTE_CALL).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsAdType", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return intValue;
    }

    @k55.m
    public int getSnsAdTypeMM(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsAdTypeMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mm.plugin.sns.storage.SnsInfo b17 = com.tencent.mm.plugin.sns.model.l4.Fj().b1(str);
        if (b17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsAdTypeMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return 0;
        }
        int adType = b17.getAdType();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsAdTypeMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return adType;
    }

    public java.lang.String getSnsAid(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsAid", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.String str2 = (java.lang.String) REMOTE_CALL("getSnsAidMM", str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsAid", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return str2;
    }

    @k55.m
    public java.lang.String getSnsAidMM(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsAidMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mm.plugin.sns.storage.SnsInfo b17 = com.tencent.mm.plugin.sns.model.l4.Fj().b1(str);
        if (b17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsAidMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return "";
        }
        java.lang.String aid = b17.getAid();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsAidMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return aid;
    }

    public com.tencent.mm.plugin.sns.storage.SnsInfo getSnsInfo(java.lang.String str) {
        android.os.Bundle bundle;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        android.os.Bundle bundle2 = null;
        try {
            bundle = (android.os.Bundle) REMOTE_CALL("getSnsInfoMM", str);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("AdLandingPagesProxy", e17, "", new java.lang.Object[0]);
        }
        if (bundle == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return null;
        }
        bundle2 = bundle;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = new com.tencent.mm.plugin.sns.storage.SnsInfo();
        snsInfo.readFromBundle(bundle2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return snsInfo;
    }

    @k55.m
    public android.os.Bundle getSnsInfoMM(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsInfoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mm.plugin.sns.storage.SnsInfo b17 = com.tencent.mm.plugin.sns.model.l4.Fj().b1(str);
        if (b17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsInfoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return null;
        }
        android.os.Bundle writeToBundle = b17.writeToBundle();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsInfoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return writeToBundle;
    }

    public java.lang.String getSnsStatExtBySnsId(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsStatExtBySnsId", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.String str = (java.lang.String) REMOTE_CALL("getSnsStatExtBySnsIdMM", java.lang.Long.valueOf(j17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsStatExtBySnsId", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return str;
    }

    @k55.m
    public java.lang.String getSnsStatExtBySnsIdMM(long j17) {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsStatExtBySnsIdMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsStatExtBySnsId", "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil");
        com.tencent.mm.plugin.sns.storage.AdSnsInfo y07 = com.tencent.mm.plugin.sns.model.l4.Vi().y0(j17);
        if (y07 != null) {
            str = i64.q0.d(y07.getTimeLine());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsStatExtBySnsId", "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsStatExtBySnsId", "com.tencent.mm.plugin.sns.ad.model.SnsAdExtUtil");
            str = "";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsStatExtBySnsIdMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return str;
    }

    public java.lang.String getSnsTraceid(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsTraceid", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.String str2 = (java.lang.String) REMOTE_CALL("getSnsTraceidMM", str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsTraceid", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return str2;
    }

    @k55.m
    public java.lang.String getSnsTraceidMM(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsTraceidMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mm.plugin.sns.storage.SnsInfo b17 = com.tencent.mm.plugin.sns.model.l4.Fj().b1(str);
        if (b17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsTraceidMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return "";
        }
        java.lang.String traceid = b17.getTraceid();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsTraceidMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return traceid;
    }

    public java.lang.String getSnsUxInfo(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsUxInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.String str2 = (java.lang.String) REMOTE_CALL("getSnsUxInfoMM", str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsUxInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return str2;
    }

    @k55.m
    public java.lang.String getSnsUxInfoMM(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsUxInfoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mm.plugin.sns.storage.SnsInfo b17 = com.tencent.mm.plugin.sns.model.l4.Fj().b1(str);
        if (b17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsUxInfoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return "";
        }
        java.lang.String uxinfo = b17.getUxinfo();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsUxInfoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return uxinfo;
    }

    public int getSyncServerTimeSecond() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSyncServerTimeSecond", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.Object REMOTE_CALL = REMOTE_CALL("getSyncServerTimeSecondMM", new java.lang.Object[0]);
        if (REMOTE_CALL instanceof java.lang.Integer) {
            int intValue = ((java.lang.Integer) REMOTE_CALL).intValue();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSyncServerTimeSecond", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return intValue;
        }
        int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() / 1000);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSyncServerTimeSecond", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return currentTimeMillis;
    }

    @k55.m
    public int getSyncServerTimeSecondMM() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSyncServerTimeSecondMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        try {
            int e17 = c01.id.e();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSyncServerTimeSecondMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return e17;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdLandingPagesProxy", "getSyncServerTimeSecondMM, exp=" + th6.toString());
            int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() / 1000);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSyncServerTimeSecondMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return currentTimeMillis;
        }
    }

    public int getTaskProgress(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTaskProgress", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.Object REMOTE_CALL = REMOTE_CALL("getTaskProgressMM", str);
        int intValue = REMOTE_CALL == null ? -1 : ((java.lang.Integer) REMOTE_CALL).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTaskProgress", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return intValue;
    }

    @k55.m
    public int getTaskProgressMM(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTaskProgressMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        int i17 = za4.k.g().i(str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTaskProgressMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return i17;
    }

    public long getTwistAdCard(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.tencent.mm.plugin.sns.model.t tVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTwistAdCard", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((java.util.HashMap) this.f164035f).put(java.lang.Long.valueOf(currentTimeMillis), tVar);
        REMOTE_CALL("getTwistAdCardMM", java.lang.Long.valueOf(currentTimeMillis), str, str2, java.lang.Integer.valueOf(i17), str3, str4, str5);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTwistAdCard", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return currentTimeMillis;
    }

    @k55.m
    public void getTwistAdCardMM(long j17, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTwistAdCardMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        ib4.f fVar = new ib4.f(str, str2, i17, str3, str4, str5);
        ((java.util.HashMap) this.f164036g).put(fVar, java.lang.Long.valueOf(j17));
        gm0.j1.i();
        gm0.j1.n().f273288b.g(fVar);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(4729, this.f164039m);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTwistAdCardMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void getTwistAdCardStatus(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i18, com.tencent.mm.plugin.sns.model.t tVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTwistAdCardStatus", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((java.util.HashMap) this.f164035f).put(java.lang.Long.valueOf(currentTimeMillis), tVar);
        REMOTE_CALL("getTwistAdCardStatusMM", java.lang.Long.valueOf(currentTimeMillis), str, java.lang.Integer.valueOf(i17), str2, str3, str4, java.lang.Integer.valueOf(i18));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTwistAdCardStatus", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    public void getTwistAdCardStatusMM(long j17, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTwistAdCardStatusMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        ib4.g gVar = new ib4.g(str, i17, str2, str3, str4, i18);
        ((java.util.HashMap) this.f164036g).put(gVar, java.lang.Long.valueOf(j17));
        gm0.j1.i();
        gm0.j1.n().f273288b.g(gVar);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(4689, this.f164039m);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTwistAdCardStatusMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public java.lang.String getUin() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUin", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.Object REMOTE_CALL = REMOTE_CALL("getUinMM", new java.lang.Object[0]);
        java.lang.String str = REMOTE_CALL == null ? "" : (java.lang.String) REMOTE_CALL;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUin", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return str;
    }

    @k55.m
    public java.lang.String getUinMM() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUinMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.String j17 = gm0.j1.b().j();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUinMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return j17;
    }

    public boolean installApp(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, java.lang.String str5) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("installApp", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.Object REMOTE_CALL = REMOTE_CALL("installAppMM", str, str2, str3, str4, java.lang.Integer.valueOf(i17), str5);
        boolean booleanValue = REMOTE_CALL == null ? false : ((java.lang.Boolean) REMOTE_CALL).booleanValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("installApp", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return booleanValue;
    }

    @k55.m
    public boolean installAppMM(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, java.lang.String str5) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("installAppMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        boolean j17 = za4.k.g().j(com.tencent.mm.sdk.platformtools.x2.f193071a, str, str2, new com.tencent.mm.plugin.sns.model.o(this, str, str2, false, 1, i17), str5);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("installAppMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return j17;
    }

    @k55.l
    public boolean isApkExist(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isApkExist", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.Object REMOTE_CALL = REMOTE_CALL("isApkExistMM", str);
        boolean booleanValue = REMOTE_CALL == null ? false : ((java.lang.Boolean) REMOTE_CALL).booleanValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isApkExist", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return booleanValue;
    }

    @k55.m
    public boolean isApkExistMM(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isApkExistMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        boolean k17 = za4.k.g().k(str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isApkExistMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return k17;
    }

    public int isAutoAdDownload() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAutoAdDownload", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.Object REMOTE_CALL = REMOTE_CALL("isAutoAdDownloadMM", new java.lang.Object[0]);
        int intValue = REMOTE_CALL != null ? ((java.lang.Integer) REMOTE_CALL).intValue() : 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAutoAdDownload", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return intValue;
    }

    @k55.m
    public int isAutoAdDownloadMM() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAutoAdDownloadMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mm.plugin.sns.model.i1 hj6 = com.tencent.mm.plugin.sns.model.l4.hj();
        hj6.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAutoAdDownload", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        int v17 = hj6.v(null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAutoAdDownload", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAutoAdDownloadMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return v17;
    }

    public boolean isBrandAdded(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isBrandAdded", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.Object REMOTE_CALL = REMOTE_CALL("selectBrandAdd", str);
        if (!(REMOTE_CALL instanceof java.lang.Boolean)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isBrandAdded", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return false;
        }
        boolean booleanValue = ((java.lang.Boolean) REMOTE_CALL).booleanValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isBrandAdded", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return booleanValue;
    }

    public boolean isConnected() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isConnected", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        k55.k kVar = this.f164037h;
        boolean c17 = kVar == null ? false : kVar.c();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isConnected", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return c17;
    }

    public boolean isDownloading(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isDownloading", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.Object REMOTE_CALL = REMOTE_CALL("isDownloadingMM", str);
        boolean booleanValue = REMOTE_CALL == null ? false : ((java.lang.Boolean) REMOTE_CALL).booleanValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDownloading", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return booleanValue;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0031, code lost:
    
        if (r6.f96963f == 1) goto L8;
     */
    @k55.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean isDownloadingMM(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.String r0 = "isDownloadingMM"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            za4.k r2 = za4.k.g()
            r2.getClass()
            java.lang.String r2 = "isDownloading"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            java.lang.Class<vz.v1> r4 = vz.v1.class
            i95.m r4 = i95.n0.c(r4)
            vz.v1 r4 = (vz.v1) r4
            uz.v1 r4 = (uz.v1) r4
            r4.getClass()
            com.tencent.mm.plugin.downloader.model.r0 r4 = com.tencent.mm.plugin.downloader.model.r0.i()
            com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo r6 = r4.q(r6)
            if (r6 == 0) goto L34
            int r6 = r6.f96963f
            r4 = 1
            if (r6 != r4) goto L34
            goto L35
        L34:
            r4 = 0
        L35:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.isDownloadingMM(java.lang.String):boolean");
    }

    public boolean isFreeSimCard() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isFreeSimCard", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.Object REMOTE_CALL = REMOTE_CALL("isFreeSimCardMM", new java.lang.Object[0]);
        if (!(REMOTE_CALL instanceof java.lang.Boolean)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFreeSimCard", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return false;
        }
        boolean booleanValue = ((java.lang.Boolean) REMOTE_CALL).booleanValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFreeSimCard", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return booleanValue;
    }

    @k55.m
    public boolean isFreeSimCardMM() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isFreeSimCardMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        int Bi = ((lh3.n) ((kh3.f) i95.n0.c(kh3.f.class))).Bi();
        boolean z17 = Bi == 3 || Bi == 4 || Bi == 5;
        com.tencent.mars.xlog.Log.i("AdLandingPagesProxy", "isFreeSimCard, simType=" + Bi + ", isFree=" + z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFreeSimCardMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return z17;
    }

    public java.lang.String isFriend(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isFriend", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.Object REMOTE_CALL = REMOTE_CALL("isFriendMM", str);
        if (!(REMOTE_CALL instanceof java.lang.String)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFriend", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return "";
        }
        java.lang.String str2 = (java.lang.String) REMOTE_CALL;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFriend", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return str2;
    }

    @k55.m
    public java.lang.String isFriendMM(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isFriendMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        try {
            java.lang.String Di = ((m73.q) ((n73.e) i95.n0.c(n73.e.class))).Di(str, 2);
            com.tencent.mars.xlog.Log.i("AdLandingPagesProxy", "isFriendMM, hashName=" + str + ", userName=" + Di);
            if (!android.text.TextUtils.isEmpty(Di)) {
                str = Di;
            }
            if (!android.text.TextUtils.isEmpty(str)) {
                gm0.j1.i();
                com.tencent.mm.storage.k4 Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
                if (Bi != null) {
                    boolean h17 = Bi.h(str);
                    com.tencent.mars.xlog.Log.i("AdLandingPagesProxy", "userName=" + str + ", isFriend=" + h17);
                    if (h17) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFriendMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
                        return str;
                    }
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdLandingPagesProxy", "isFriendMM exp=" + android.util.Log.getStackTraceString(th6));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFriendMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return "";
    }

    public boolean isPaused(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isPaused", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.Object REMOTE_CALL = REMOTE_CALL("isPausedMM", str);
        boolean booleanValue = REMOTE_CALL == null ? false : ((java.lang.Boolean) REMOTE_CALL).booleanValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPaused", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return booleanValue;
    }

    @k55.m
    public boolean isPausedMM(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isPausedMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        za4.k.g().getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isPaused", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo q17 = com.tencent.mm.plugin.downloader.model.r0.i().q(str);
        boolean z17 = q17 != null && q17.f96963f == 2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPaused", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPausedMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return z17;
    }

    public boolean isPkgInstalled(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isPkgInstalled", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.Object REMOTE_CALL = REMOTE_CALL("isPkgInstalledMM", str);
        boolean booleanValue = REMOTE_CALL == null ? false : ((java.lang.Boolean) REMOTE_CALL).booleanValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPkgInstalled", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return booleanValue;
    }

    @k55.m
    public boolean isPkgInstalledMM(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isPkgInstalledMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        boolean m17 = za4.k.g().m(com.tencent.mm.sdk.platformtools.x2.f193071a, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isPkgInstalledMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return m17;
    }

    public boolean isRecExpAd(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isRecExpAd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.Object REMOTE_CALL = REMOTE_CALL("isRecExpAdMM", str);
        boolean booleanValue = REMOTE_CALL == null ? false : ((java.lang.Boolean) REMOTE_CALL).booleanValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isRecExpAd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return booleanValue;
    }

    @k55.m
    public boolean isRecExpAdMM(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isRecExpAdMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mm.plugin.sns.storage.SnsInfo b17 = com.tencent.mm.plugin.sns.model.l4.Fj().b1(str);
        if (b17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isRecExpAdMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return false;
        }
        boolean isRecExpAd = b17.isRecExpAd();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isRecExpAdMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return isRecExpAd;
    }

    public boolean isVideoDataAvailable(java.lang.String str, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isVideoDataAvailable", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.Object REMOTE_CALL = REMOTE_CALL("isVideoDataAvailableMM", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        boolean booleanValue = REMOTE_CALL == null ? false : ((java.lang.Boolean) REMOTE_CALL).booleanValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isVideoDataAvailable", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return booleanValue;
    }

    @k55.m
    public boolean isVideoDataAvailableMM(java.lang.String str, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isVideoDataAvailableMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        boolean o17 = t21.o2.Di().o(str, i17, i18);
        com.tencent.mars.xlog.Log.i("AdLandingPagesProxy", "is video data avaiable %s %d %d %s", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(o17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isVideoDataAvailableMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return o17;
    }

    public boolean isWeAppAppendClickTime(java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isWeAppAppendClickTime", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        boolean z17 = false;
        try {
            java.lang.Object REMOTE_CALL = REMOTE_CALL("isWeAppAppendClickTimeMM", str, java.lang.Integer.valueOf(i17));
            if (REMOTE_CALL instanceof java.lang.Boolean) {
                if (((java.lang.Boolean) REMOTE_CALL).booleanValue()) {
                    z17 = true;
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isWeAppAppendClickTime", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return z17;
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("AdLandingPagesProxy", "isWeAppAppendClickTime remote call has an exception!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isWeAppAppendClickTime", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return false;
        }
    }

    @k55.m
    public boolean isWeAppAppendClickTimeMM(java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isWeAppAppendClickTimeMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        boolean z17 = false;
        try {
            com.tencent.mm.plugin.sns.storage.SnsInfo b17 = com.tencent.mm.plugin.sns.model.l4.Fj().b1(str);
            if (b17 != null) {
                z17 = (i17 == 16 ? b17.getAtAdInfo() : b17.getAdInfo()).addClickTimeToWeAppPath;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isWeAppAppendClickTimeMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return z17;
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("AdLandingPagesProxy", "isWeAppAppendClickTimeMM call has an exception");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isWeAppAppendClickTimeMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return false;
        }
    }

    public final android.content.SharedPreferences j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSP", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.f193072b + "_comm_preferences", 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSP", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return sharedPreferences;
    }

    public void jumpToTextStatus(f54.c0 c0Var, w64.o oVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("jumpToTextStatus", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        REMOTE_CALL("jumpToTextStatusMM", c0Var, oVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpToTextStatus", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    public void jumpToTextStatusMM(f54.c0 c0Var, w64.o oVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("jumpToTextStatusMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        try {
            w64.t.b(com.tencent.mm.sdk.platformtools.x2.f193071a, c0Var, oVar);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdLandingPagesProxy", "jumpToTextStatusMM, exp is " + th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpToTextStatusMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void launchBackApp(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("launchBackApp", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        REMOTE_CALL("launchBackAppMM", str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("launchBackApp", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    public void launchBackAppMM(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("launchBackAppMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        ((kt.s0) ((lt.r0) i95.n0.c(lt.r0.class))).Ai("nativeOpenAdCanvas", "", str, 0, "");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("launchBackAppMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void notifyFinderCnyEggCardResult(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notifyFinderCnyEggCardResult", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mars.xlog.Log.i("AdLandingPagesProxy", "notifyFinderCnyEggCardResult, pageId=" + str + ", cardId=" + str2);
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyFinderCnyEggCardResult", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        } else {
            REMOTE_CALL("notifyFinderCnyEggCardResultMM", str, str2);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyFinderCnyEggCardResult", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        }
    }

    @k55.m
    public void notifyFinderCnyEggCardResultMM(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notifyFinderCnyEggCardResultMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mars.xlog.Log.i("AdLandingPagesProxy", "notifyFinderCnyEggCardResultMM, pageId=" + str + ", cardId=" + str2);
        com.tencent.mm.autogen.events.FinderCnyEggCardEvent finderCnyEggCardEvent = new com.tencent.mm.autogen.events.FinderCnyEggCardEvent();
        am.pa paVar = finderCnyEggCardEvent.f54259g;
        paVar.getClass();
        paVar.getClass();
        paVar.getClass();
        finderCnyEggCardEvent.e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyFinderCnyEggCardResultMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void notifyFinderVideoPlayStateToChange(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notifyFinderVideoPlayStateToChange", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mars.xlog.Log.i("AdLandingPagesProxy", "notifyFinderVideoPlayStateToChange tools, shouldPlay=" + z17);
        REMOTE_CALL("notifyFinderVideoPlayStateToChangeMM", java.lang.Boolean.valueOf(z17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyFinderVideoPlayStateToChange", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    public void notifyFinderVideoPlayStateToChangeMM(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notifyFinderVideoPlayStateToChangeMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        try {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Qk(z17, 0, false);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdLandingPagesProxy", "notifyFinderVideoPlayStateToChangeMM, shouldPlay=" + z17 + ", exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyFinderVideoPlayStateToChangeMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.l
    public void onAdChannelEnd(long j17, int i17, int i18, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAdChannelEnd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mm.plugin.sns.model.t tVar = (com.tencent.mm.plugin.sns.model.t) ((java.util.HashMap) this.f164035f).remove(java.lang.Long.valueOf(j17));
        if (tVar != null) {
            tVar.b(i17, i18, obj);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAdChannelEnd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void onAdLandingPageClick(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAdLandingPageClick", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.System.currentTimeMillis();
        REMOTE_CALL("onAdLandingPageClickMM", str, str2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAdLandingPageClick", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    public void onAdLandingPageClickMM(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAdLandingPageClickMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        ib4.i iVar = new ib4.i(str, str2);
        gm0.j1.i();
        gm0.j1.n().f273288b.g(iVar);
        com.tencent.mars.xlog.Log.i("AdLandingPagesProxy", "NetSceneAdLadingPageClick, adChannelCgiReport, main, channel=" + str + ", content=" + str2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAdLandingPageClickMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.l
    public void onAdNativeAntiAbuse(long j17, int i17, int i18, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAdNativeAntiAbuse", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mm.plugin.sns.model.t tVar = (com.tencent.mm.plugin.sns.model.t) ((java.util.HashMap) this.f164035f).remove(java.lang.Long.valueOf(j17));
        if (tVar != null) {
            tVar.b(i17, i18, obj);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAdNativeAntiAbuse", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.l
    public void onAdUpdateQrUrlEnd(long j17, int i17, int i18, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAdUpdateQrUrlEnd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mm.plugin.sns.model.t tVar = (com.tencent.mm.plugin.sns.model.t) ((java.util.HashMap) this.f164035f).remove(java.lang.Long.valueOf(j17));
        if (tVar != null) {
            tVar.b(i17, i18, obj);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAdUpdateQrUrlEnd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.l
    public void onAddBrandSceneEnd(long j17, int i17, int i18, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAddBrandSceneEnd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mm.plugin.sns.model.t tVar = (com.tencent.mm.plugin.sns.model.t) ((java.util.HashMap) this.f164035f).remove(java.lang.Long.valueOf(j17));
        if (tVar != null) {
            tVar.b(i17, i18, obj);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAddBrandSceneEnd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.l
    public void onBulletCommentEvent(long j17, long j18, java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBulletCommentEvent", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mars.xlog.Log.i("AdLandingPagesProxy.BulletCommentEvent", "onBulletCommentEvent, feedId=" + j18 + ", isSucc=" + z17 + ", comment=" + str + ", id=" + j17 + ", proxy.hash=" + hashCode());
        com.tencent.mm.plugin.sns.model.t tVar = (com.tencent.mm.plugin.sns.model.t) ((java.util.HashMap) this.f164035f).remove(java.lang.Long.valueOf(j17));
        if (tVar != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("finderFeedId", j18);
                jSONObject.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_COMMENT, str);
                jSONObject.put("isSuccess", z17);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("AdLandingPagesProxy", "onBulletCommentEvent, exp=" + e17);
            }
            tVar.a(jSONObject);
        } else {
            com.tencent.mars.xlog.Log.e("AdLandingPagesProxy.BulletCommentEvent", "onBulletCommentEvent, callback==null");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBulletCommentEvent", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @Override // k55.b, k55.e
    public void onCallback(java.lang.String str, android.os.Bundle bundle, boolean z17) {
        java.lang.reflect.Method method;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        try {
            java.lang.reflect.Method[] methods = getClass().getMethods();
            int length = methods.length;
            int i17 = 0;
            while (true) {
                if (i17 >= length) {
                    method = null;
                    break;
                }
                method = methods[i17];
                if (method.getName().equalsIgnoreCase(str)) {
                    break;
                } else {
                    i17++;
                }
            }
            if (method != null) {
                if (method.isAnnotationPresent(z17 ? k55.l.class : k55.m.class)) {
                    java.lang.Object invoke = method.invoke(this, getArgs(bundle));
                    if (method.getReturnType() != java.lang.Void.TYPE) {
                        if (invoke instanceof android.os.Parcelable) {
                            bundle.putParcelable("result_key", (android.os.Parcelable) invoke);
                        } else {
                            bundle.putSerializable("result_key", (java.io.Serializable) invoke);
                        }
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("AdLandingPagesProxy", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.l
    public void onCdnVideoDataAvailable(java.lang.String str, long j17, long j18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCdnVideoDataAvailable", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mars.xlog.Log.i("AdLandingPagesProxy", "cdn video data available %s %d %d", str, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
        java.util.Map map = this.f164043q;
        if (((java.util.HashMap) map).containsKey(str)) {
            ((dn.n) ((java.util.HashMap) map).get(str)).onDataAvailable(str, j17, j18);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCdnVideoDataAvailable", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.l
    public void onCdnVideoFinish(java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCdnVideoFinish", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mars.xlog.Log.i("AdLandingPagesProxy", "cdn video finish %s, %d", str, java.lang.Integer.valueOf(i17));
        if (i17 == 0) {
            com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("sns_ad_download_resource_preferences", 0).edit().putBoolean(str, true).commit();
        }
        java.util.Map map = this.f164043q;
        if (((java.util.HashMap) map).containsKey(str)) {
            ((dn.n) ((java.util.HashMap) map).remove(str)).g(str, i17, null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCdnVideoFinish", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.l
    public void onCdnVideoMoovReady(java.lang.String str, long j17, long j18, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCdnVideoMoovReady", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mars.xlog.Log.i("AdLandingPagesProxy", "cdn video moov ready %s %d %d", str, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
        java.util.Map map = this.f164043q;
        if (((java.util.HashMap) map).containsKey(str)) {
            com.tencent.mars.cdn.CdnManager.VideoInfo videoInfo = new com.tencent.mars.cdn.CdnManager.VideoInfo();
            videoInfo.svrFlag = str2;
            ((dn.n) ((java.util.HashMap) map).get(str)).onMoovReady(str, j17, j18, videoInfo);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCdnVideoMoovReady", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.l
    public void onCdnVideoProgress(java.lang.String str, long j17, long j18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCdnVideoProgress", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mars.xlog.Log.i("AdLandingPagesProxy", "cdn video progress %s %d %d", str, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
        java.util.Map map = this.f164043q;
        if (((java.util.HashMap) map).containsKey(str)) {
            ((dn.n) ((java.util.HashMap) map).get(str)).f(str, j17, j18);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCdnVideoProgress", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.l
    public void onDynamicUpdateEnd(long j17, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDynamicUpdateEnd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mm.plugin.sns.model.t tVar = (com.tencent.mm.plugin.sns.model.t) ((java.util.HashMap) this.f164035f).remove(java.lang.Long.valueOf(j17));
        if (tVar != null && !com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            tVar.a(str);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDynamicUpdateEnd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.l
    public void onFavOfficialItemEnd(long j17, java.lang.String str, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFavOfficialItemEnd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mm.plugin.sns.model.t tVar = (com.tencent.mm.plugin.sns.model.t) ((java.util.HashMap) this.f164035f).remove(java.lang.Long.valueOf(j17));
        if (i17 == 0 && i18 == 0) {
            com.tencent.mars.xlog.Log.i("AdLandingPagesProxy", "FavOfficialItem succeed, item_buff[%s]", str);
        } else {
            com.tencent.mars.xlog.Log.e("AdLandingPagesProxy", "FavOfficialItem fail, errrType[%d], errCode[%d], item_buff[%s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        }
        if (tVar != null) {
            tVar.b(i17, i18, null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFavOfficialItemEnd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.l
    public void onFetchQRCodeInfo(long j17, int i17, int i18, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFetchQRCodeInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mm.plugin.sns.model.t tVar = (com.tencent.mm.plugin.sns.model.t) ((java.util.HashMap) this.f164035f).remove(java.lang.Long.valueOf(j17));
        if (tVar != null) {
            tVar.b(i17, i18, obj);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFetchQRCodeInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.l
    public void onGeoLocation(long j17, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGeoLocation", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        try {
            com.tencent.mm.plugin.sns.model.t tVar = (com.tencent.mm.plugin.sns.model.t) ((java.util.HashMap) this.f164035f).remove(java.lang.Long.valueOf(j17));
            if (tVar != null) {
                tVar.a(obj);
            }
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("AdLandingPagesProxy", "onGeoLocation catch one exception");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGeoLocation", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.l
    public void onGetAdCanvasXmlFromNet(long j17, boolean z17, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGetAdCanvasXmlFromNet", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mm.plugin.sns.model.t tVar = (com.tencent.mm.plugin.sns.model.t) ((java.util.HashMap) this.f164035f).remove(java.lang.Long.valueOf(j17));
        if (tVar != null) {
            tVar.a(str);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGetAdCanvasXmlFromNet", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.l
    public void onGetBtnAdFinderContact(long j17, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGetBtnAdFinderContact", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mm.plugin.sns.model.t tVar = (com.tencent.mm.plugin.sns.model.t) ((java.util.HashMap) this.f164035f).remove(java.lang.Long.valueOf(j17));
        if (tVar != null) {
            tVar.a(str);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGetBtnAdFinderContact", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.l
    public void onGetBtnPersonalWxUserName(long j17, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGetBtnPersonalWxUserName", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mm.plugin.sns.model.t tVar = (com.tencent.mm.plugin.sns.model.t) ((java.util.HashMap) this.f164035f).get(java.lang.Long.valueOf(j17));
        if (tVar != null) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put(dm.i4.COL_USERNAME, str);
                jSONObject.put("aliasname", str2);
                tVar.a(jSONObject.toString());
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("AdLandingPagesProxy", "onGetBtnPersonalWxUserName, exp=" + e17.toString());
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGetBtnPersonalWxUserName", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.l
    public void onGetHbCoverStateScene(long j17, int i17, int i18, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGetHbCoverStateScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mm.plugin.sns.model.t tVar = (com.tencent.mm.plugin.sns.model.t) ((java.util.HashMap) this.f164035f).remove(java.lang.Long.valueOf(j17));
        if (tVar != null) {
            tVar.b(i17, i18, obj);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGetHbCoverStateScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.l
    public void onGetOpenSdkAppInfo(java.lang.String str, long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGetOpenSdkAppInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mm.plugin.sns.model.t tVar = (com.tencent.mm.plugin.sns.model.t) ((java.util.HashMap) this.f164035f).remove(java.lang.Long.valueOf(j17));
        if (tVar != null) {
            com.tencent.mars.xlog.Log.i("AdLandingPagesProxy", "onGetOpenSdkAppInfo");
            tVar.a(str);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGetOpenSdkAppInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.l
    public void onGetSmartPhoneScene(long j17, int i17, int i18, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGetSmartPhoneScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mm.plugin.sns.model.t tVar = (com.tencent.mm.plugin.sns.model.t) ((java.util.HashMap) this.f164035f).remove(java.lang.Long.valueOf(j17));
        if (tVar != null) {
            tVar.b(i17, i18, obj);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGetSmartPhoneScene", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void onHalfScreenAnimationChange(boolean z17, boolean z18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onHalfScreenAnimationChange", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mars.xlog.Log.i("AdLandingPagesProxy", "onHalfScreenAnimationChange tools, isOpen=" + z17 + ", isAnimBegin=" + z18);
        REMOTE_CALL("onHalfScreenAnimationChangeMM", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onHalfScreenAnimationChange", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    public void onHalfScreenAnimationChangeMM(boolean z17, boolean z18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onHalfScreenAnimationChangeMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        n54.i.b(z17, z18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onHalfScreenAnimationChangeMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void onHalfScreenHeightChange(float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onHalfScreenHeightChange", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        REMOTE_CALL("onHalfScreenHeightChangeMM", java.lang.Float.valueOf(f17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onHalfScreenHeightChange", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    public void onHalfScreenHeightChangeMM(float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onHalfScreenHeightChangeMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        n54.i.c(f17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onHalfScreenHeightChangeMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.l
    public void onImgDownloadCallback(java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onImgDownloadCallback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mars.xlog.Log.i("AdLandingPagesProxy", "onImgDownloadCallback, id=" + str + ", isOk=" + z17);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onImgDownloadCallback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return;
        }
        synchronized (this.f164042p) {
            try {
                java.util.List list = (java.util.List) ((java.util.HashMap) this.f164042p).remove(str);
                if (list == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onImgDownloadCallback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
                    return;
                }
                for (int i17 = 0; i17 < list.size(); i17++) {
                    fe0.o3 o3Var = (fe0.o3) list.get(i17);
                    if (o3Var != null) {
                        if (z17) {
                            o3Var.b();
                        } else {
                            o3Var.a();
                        }
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onImgDownloadCallback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onImgDownloadCallback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
                throw th6;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x024f  */
    @k55.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onRspCallbackCommon(long r25, int r27, int r28, java.lang.Object r29) {
        /*
            Method dump skipped, instructions count: 857
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.onRspCallbackCommon(long, int, int, java.lang.Object):void");
    }

    @k55.l
    public void onSearchContact(long j17, int i17, int i18, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSearchContact", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mm.plugin.sns.model.t tVar = (com.tencent.mm.plugin.sns.model.t) ((java.util.HashMap) this.f164035f).remove(java.lang.Long.valueOf(j17));
        if (tVar != null) {
            tVar.b(i17, i18, obj);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSearchContact", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.l
    public void onSendAppointmentReq(long j17, int i17, int i18, int i19, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSendAppointmentReq", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mm.plugin.sns.model.t tVar = (com.tencent.mm.plugin.sns.model.t) ((java.util.HashMap) this.f164035f).remove(java.lang.Long.valueOf(j17));
        if (tVar != null) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("status", str);
                jSONObject.put("opType", i19);
                tVar.b(i17, i18, jSONObject.toString());
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("AdLandingPagesProxy", "onSendAppointmentReq, exp=" + e17.toString());
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSendAppointmentReq", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.l
    public void onSightDownloadCallback(java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSightDownloadCallback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mars.xlog.Log.i("AdLandingPagesProxy", "onSightDownloadCallback, id=" + str + ", isOk=" + z17);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSightDownloadCallback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return;
        }
        synchronized (this.f164042p) {
            try {
                java.util.List list = (java.util.List) ((java.util.HashMap) this.f164042p).remove(str);
                if (list == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSightDownloadCallback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
                    return;
                }
                for (int i17 = 0; i17 < list.size(); i17++) {
                    fe0.o3 o3Var = (fe0.o3) list.get(i17);
                    if (o3Var != null) {
                        if (z17) {
                            o3Var.b();
                        } else {
                            o3Var.a();
                        }
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSightDownloadCallback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSightDownloadCallback", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
                throw th6;
            }
        }
    }

    @k55.l
    public void onUpdateUxInfo(long j17, int i17, int i18, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUpdateUxInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mm.plugin.sns.model.t tVar = (com.tencent.mm.plugin.sns.model.t) ((java.util.HashMap) this.f164035f).remove(java.lang.Long.valueOf(j17));
        if (tVar != null) {
            tVar.b(i17, i18, obj);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUpdateUxInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public java.lang.String openForAd(long j17, int i17, int i18, int i19, int i27, java.lang.String str, java.lang.String str2, za4.a aVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("openForAd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.Object REMOTE_CALL = REMOTE_CALL("openForAdMM", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), str, str2, aVar);
        if (!(REMOTE_CALL instanceof java.lang.String)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openForAd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return "";
        }
        java.lang.String str3 = (java.lang.String) REMOTE_CALL;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openForAd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return str3;
    }

    @k55.m
    public java.lang.String openForAdMM(long j17, int i17, int i18, int i19, int i27, java.lang.String str, java.lang.String str2, za4.a aVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("openForAdMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.String c17 = za4.s1.b().c(j17, i17, i18, i19, i27, str, str2, aVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openForAdMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return c17;
    }

    public boolean pauseTask(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pauseTask", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.Object REMOTE_CALL = REMOTE_CALL("pauseTaskMM", str);
        boolean booleanValue = REMOTE_CALL == null ? false : ((java.lang.Boolean) REMOTE_CALL).booleanValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pauseTask", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return booleanValue;
    }

    @k55.m
    public boolean pauseTaskMM(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pauseTaskMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        boolean n17 = za4.k.g().n(str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pauseTaskMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return n17;
    }

    @k55.l
    public void paused(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("paused", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.util.Iterator it = ((java.util.ArrayList) this.f164040n.get(java.lang.Long.valueOf(j17))).iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.sns.model.n nVar = (com.tencent.mm.plugin.sns.model.n) it.next();
            if (nVar != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("paused", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$MyDownloadCallback");
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.s4 s4Var = ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z3) nVar).f165864a;
                int i17 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.V(s4Var.f165485r).V1;
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.U(s4Var.f165485r).l(7);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("paused", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$MyDownloadCallback");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("paused", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void playTimelineBackAnimation(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("playTimelineBackAnimation", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((java.util.HashMap) this.f164035f).put(java.lang.Long.valueOf(currentTimeMillis), null);
        REMOTE_CALL("playTimelineBackAnimationMM", java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(j17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("playTimelineBackAnimation", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    public void playTimelineBackAnimationMM(long j17, long j18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("playTimelineBackAnimationMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mm.autogen.events.TimelinePlayBackAnimEvent timelinePlayBackAnimEvent = new com.tencent.mm.autogen.events.TimelinePlayBackAnimEvent();
        timelinePlayBackAnimEvent.f54891g.f8328a = j18;
        timelinePlayBackAnimEvent.e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("playTimelineBackAnimationMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void playTimelineClickAnimation(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("playTimelineClickAnimation", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((java.util.HashMap) this.f164035f).put(java.lang.Long.valueOf(currentTimeMillis), null);
        REMOTE_CALL("playTimelineClickAnimationMM", java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(j17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("playTimelineClickAnimation", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    public void playTimelineClickAnimationMM(long j17, long j18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("playTimelineClickAnimationMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mm.autogen.events.TimelinePlayClickAnimEvent timelinePlayClickAnimEvent = new com.tencent.mm.autogen.events.TimelinePlayClickAnimEvent();
        timelinePlayClickAnimEvent.f54892g.f8408a = j18;
        timelinePlayClickAnimEvent.e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("playTimelineClickAnimationMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void postBulletComment(long j17, java.lang.String str, com.tencent.mm.plugin.sns.model.t tVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("postBulletComment", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mars.xlog.Log.i("AdLandingPagesProxy.BulletCommentEvent", "postBulletComment, feedId=" + j17 + ", comment=" + str + ", proxy.hash=" + hashCode());
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((java.util.HashMap) this.f164035f).put(java.lang.Long.valueOf(currentTimeMillis), tVar);
        REMOTE_CALL("postBulletCommentMM", java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(j17), str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("postBulletComment", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    public void postBulletCommentMM(long j17, long j18, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("postBulletCommentMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mars.xlog.Log.i("AdLandingPagesProxy.BulletCommentEvent", "postBulletCommentMM, feedId=" + j18 + ", comment=" + str + ", id=" + j17 + ", proxy.hash=" + hashCode());
        new com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.BulletCommentEventListener(j17, j18, str, 15000).alive();
        com.tencent.mm.autogen.events.FinderCnyPostDanmakuEvent finderCnyPostDanmakuEvent = new com.tencent.mm.autogen.events.FinderCnyPostDanmakuEvent();
        am.qa qaVar = finderCnyPostDanmakuEvent.f54260g;
        qaVar.f7700a = 100;
        qaVar.f7702c = j18;
        qaVar.f7701b = str;
        finderCnyPostDanmakuEvent.e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("postBulletCommentMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void prefetchH5Url(java.lang.String str, java.lang.String[] strArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("prefetchH5Url", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        try {
            REMOTE_CALL("prefetchH5UrlMM", str, strArr);
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("AdLandingPagesProxy", "prefetchH5Url remote call has an exception!");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("prefetchH5Url", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    public void prefetchH5UrlMM(java.lang.String str, java.lang.String[] strArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("prefetchH5UrlMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        if (!android.text.TextUtils.isEmpty(str) && !a84.b0.d(strArr)) {
            try {
                e44.a aVar = e44.a.f249366b;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("instance", "com.tencent.mm.plugin.sns.ad.h5.H5PrefetchManager");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("instance", "com.tencent.mm.plugin.sns.ad.h5.H5PrefetchManager");
                e44.a.f249366b.a(str, strArr);
            } catch (java.lang.Throwable unused) {
                com.tencent.mars.xlog.Log.e("AdLandingPagesProxy", "prefetchH5UrlMM call has an exception!");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("prefetchH5UrlMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void preloadFinderFeeds(java.lang.String str, int i17, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("preloadFinderFeeds", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        try {
            REMOTE_CALL("preloadFinderFeedsMM", str, java.lang.Integer.valueOf(i17), str2);
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("AdLandingPagesProxy", "preloadFinderFeeds remote call has an exception!");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preloadFinderFeeds", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    public void preloadFinderFeedsMM(java.lang.String str, int i17, java.lang.String str2) {
        com.tencent.mm.plugin.sns.storage.SnsInfo b17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("preloadFinderFeedsMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        try {
            b17 = com.tencent.mm.plugin.sns.model.l4.Fj().b1(str);
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("AdLandingPagesProxy", "preloadFinderFeeds call has an exception!");
        }
        if (b17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preloadFinderFeedsMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return;
        }
        com.tencent.mm.plugin.sns.storage.ADInfo atAdInfo = i17 == 16 ? b17.getAtAdInfo() : b17.getAdInfo();
        if (atAdInfo != null && atAdInfo.preloadFinderFeed) {
            l44.a5.h(str2);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preloadFinderFeedsMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.l
    public void progress(long j17, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("progress", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.util.Iterator it = ((java.util.ArrayList) this.f164040n.get(java.lang.Long.valueOf(j17))).iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.sns.model.n nVar = (com.tencent.mm.plugin.sns.model.n) it.next();
            if (nVar != null) {
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z3 z3Var = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z3) nVar;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("progress", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$MyDownloadCallback");
                if (i17 % 20 == 0) {
                    int i18 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.V(z3Var.f165864a.f165485r).V1;
                }
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.s4 U = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.U(z3Var.f165864a.f165485r);
                k75.j jVar = U.f304847e;
                if (jVar != null) {
                    jVar.sendMessage(android.os.Message.obtain(U.f304847e, 1, i17, 0));
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("progress", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$MyDownloadCallback");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("progress", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void publishEggCanvasEvent(int i17, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("publishEggCanvasEvent", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mars.xlog.Log.i("AdLandingPagesProxy", "publishEggCanvasEvent, eventType=" + i17 + ", pageId=" + str);
        REMOTE_CALL("publishEggCanvasEventMM", java.lang.Integer.valueOf(i17), str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("publishEggCanvasEvent", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    public void publishEggCanvasEventMM(int i17, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("publishEggCanvasEventMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mars.xlog.Log.i("AdLandingPagesProxy", "publishEggCanvasEventMM, eventType=" + i17 + ", pageId=" + str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("publishEventMM", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.SnsAdEggCanvasEventHelper");
        com.tencent.mm.autogen.events.SnsAdEggCanvasEvent snsAdEggCanvasEvent = new com.tencent.mm.autogen.events.SnsAdEggCanvasEvent();
        am.xu xuVar = snsAdEggCanvasEvent.f54789g;
        xuVar.f8401a = i17;
        if (str == null) {
            str = "";
        }
        xuVar.f8402b = str;
        snsAdEggCanvasEvent.e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("publishEventMM", "com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.SnsAdEggCanvasEventHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("publishEggCanvasEventMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public long queryIdByAppid(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("queryIdByAppid", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.Object REMOTE_CALL = REMOTE_CALL("queryIdByAppidMM", str);
        long longValue = REMOTE_CALL == null ? -1L : ((java.lang.Long) REMOTE_CALL).longValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("queryIdByAppid", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return longValue;
    }

    @k55.m
    public long queryIdByAppidMM(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("queryIdByAppidMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        long o17 = za4.k.g().o(str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("queryIdByAppidMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return o17;
    }

    public long[] queryVideoMoov(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("queryVideoMoov", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mars.xlog.Log.i("AdLandingPagesProxy", "mediaId %s, path %s, url %s", str, str2, str3);
        if (com.tencent.mm.sdk.platformtools.t8.N0(str, str2, str3)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("queryVideoMoov", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return null;
        }
        long[] jArr = (long[]) REMOTE_CALL("queryVideoMoovMM", str, str2, str3);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("queryVideoMoov", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return jArr;
    }

    @k55.m
    public long[] queryVideoMoovMM(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("queryVideoMoovMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mars.cdn.CdnManager.C2CDownloadRequest c2CDownloadRequest = new com.tencent.mars.cdn.CdnManager.C2CDownloadRequest();
        c2CDownloadRequest.fileKey = str;
        c2CDownloadRequest.fileType = 100;
        c2CDownloadRequest.url = str3;
        c2CDownloadRequest.setSavePath(str2);
        long[] jArr = new long[2];
        if (((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).queryVideoMoovInfo(c2CDownloadRequest, jArr)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("queryVideoMoovMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return jArr;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("queryVideoMoovMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return null;
    }

    public void reportOpenAppInfo(int i17, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportOpenAppInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        REMOTE_CALL("reportOpenAppInfoMM", java.lang.Integer.valueOf(i17), str, str2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportOpenAppInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    public void reportOpenAppInfoMM(int i17, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportOpenAppInfoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        za4.k g17 = za4.k.g();
        g17.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportOpenAppInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        g17.t(i17, str, str2, "", "");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportOpenAppInfo", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdDownloadApkMgr");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportOpenAppInfoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void requestAdCanvasXmlFromNet(long j17, int i17, int i18, int i19, java.lang.String str, java.lang.String str2, za4.a aVar, com.tencent.mm.plugin.sns.model.t tVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("requestAdCanvasXmlFromNet", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((java.util.HashMap) this.f164035f).put(java.lang.Long.valueOf(currentTimeMillis), tVar);
        REMOTE_CALL("requestAdCanvasXmlFromNetMM", java.lang.Long.valueOf(currentTimeMillis), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, str2, aVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("requestAdCanvasXmlFromNet", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    public void requestAdCanvasXmlFromNetMM(long j17, long j18, int i17, int i18, int i19, java.lang.String str, java.lang.String str2, za4.a aVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("requestAdCanvasXmlFromNetMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        try {
            za4.s1.f(j18, i17, i18, i19, str, str2, aVar, new com.tencent.mm.plugin.sns.model.b(this, j18, j17), null);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdLandingPagesProxy", "doRequestDynamicCanvasXml, exp is " + th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("requestAdCanvasXmlFromNetMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void requestVideoData(java.lang.String str, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("requestVideoData", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(nd1.j0.CTRL_INDEX, 32);
        REMOTE_CALL("requestVideoDataMM", str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("requestVideoData", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    public void requestVideoDataMM(java.lang.String str, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("requestVideoDataMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(nd1.j0.CTRL_INDEX, 33);
        t21.o2.Di().p(str, i17, i18, 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("requestVideoDataMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public boolean resumeTask(java.lang.String str, java.lang.String str2, boolean z17, com.tencent.mm.plugin.sns.model.n nVar, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.j3 j3Var, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resumeTask", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.lang.Object REMOTE_CALL = REMOTE_CALL("resumeTaskMM", str, str2, java.lang.Boolean.valueOf(z17), j3Var, java.lang.Integer.valueOf(i17));
        boolean booleanValue = REMOTE_CALL == null ? false : ((java.lang.Boolean) REMOTE_CALL).booleanValue();
        if (booleanValue) {
            long queryIdByAppid = queryIdByAppid(str);
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f164040n;
            java.util.ArrayList arrayList = (java.util.ArrayList) concurrentHashMap.get(java.lang.Long.valueOf(queryIdByAppid));
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                arrayList.add(nVar);
            } else if (!arrayList.contains(nVar)) {
                arrayList.add(nVar);
            }
            concurrentHashMap.put(java.lang.Long.valueOf(queryIdByAppid), arrayList);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resumeTask", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return booleanValue;
    }

    @k55.m
    public boolean resumeTaskMM(java.lang.String str, java.lang.String str2, boolean z17, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.j3 j3Var, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resumeTaskMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        boolean v17 = za4.k.g().v(str, this.f164041o, str2, z17, new com.tencent.mm.plugin.sns.model.o(this, str, str2, z17, 2, i17), j3Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resumeTaskMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return v17;
    }

    @k55.l
    public void resumed(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resumed", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.util.Iterator it = ((java.util.ArrayList) this.f164040n.get(java.lang.Long.valueOf(j17))).iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.sns.model.n nVar = (com.tencent.mm.plugin.sns.model.n) it.next();
            if (nVar != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resumed", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$MyDownloadCallback");
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.s4 s4Var = ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z3) nVar).f165864a;
                int i17 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.V(s4Var.f165485r).V1;
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.U(s4Var.f165485r).l(13);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resumed", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$MyDownloadCallback");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resumed", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void saveAdVoteInfo(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, java.lang.String str4) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("saveAdVoteInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        REMOTE_CALL("saveAdVoteInfoMM", str, str2, str3, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str4);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("saveAdVoteInfo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    public void saveAdVoteInfoMM(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, java.lang.String str4) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("saveAdVoteInfoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mm.plugin.sns.storage.w2.l(str, str2, str3, i17, i18, str4);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("saveAdVoteInfoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    public boolean selectBrandAdd(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("selectBrandAdd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mm.storage.k4 Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        boolean z17 = false;
        if (Bi == null || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("selectBrandAdd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return false;
        }
        com.tencent.mm.storage.z3 n17 = Bi.n(str, true);
        if (n17 != null && n17.r2()) {
            z17 = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("selectBrandAdd", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return z17;
    }

    public void sendAppointmentReq(java.lang.String str, long j17, int i17, java.lang.String str2, com.tencent.mm.plugin.sns.model.t tVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("sendAppointmentReq", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((java.util.HashMap) this.f164035f).put(java.lang.Long.valueOf(currentTimeMillis), tVar);
        REMOTE_CALL("sendAppointmentReqMM", java.lang.Long.valueOf(currentTimeMillis), str, java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), str2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("sendAppointmentReq", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    public void sendAppointmentReqMM(long j17, java.lang.String str, long j18, int i17, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("sendAppointmentReqMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        k64.o oVar = new k64.o(str, j18, i17, str2);
        ((java.util.HashMap) this.f164036g).put(oVar, java.lang.Long.valueOf(j17));
        gm0.j1.i();
        gm0.j1.n().f273288b.g(oVar);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(5159, this.f164039m);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("sendAppointmentReqMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void setAdValue(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAdValue", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        if (android.text.TextUtils.isEmpty(str2)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAdValue", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return;
        }
        try {
            REMOTE_CALL("setAdValueMM", str, str2, str3);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdLandingPagesProxy", "setAdValue exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAdValue", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    public java.lang.String setAdValueMM(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAdValueMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        try {
            p34.o.h(str, str2, str3);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdLandingPagesProxy", "setAdValueMM exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAdValueMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return "";
    }

    public void setHalfScreenLandingPageShow(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setHalfScreenLandingPageShow", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mars.xlog.Log.i("AdLandingPagesProxy", "setHalfScreenLandingPageShow tools, isShow=" + z17);
        REMOTE_CALL("setHalfScreenLandingPageShowMM", java.lang.Boolean.valueOf(z17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setHalfScreenLandingPageShow", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    public void setHalfScreenLandingPageShowMM(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setHalfScreenLandingPageShowMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        n54.i.d(z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setHalfScreenLandingPageShowMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.l
    public void start(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("start", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.util.Iterator it = ((java.util.ArrayList) this.f164040n.get(java.lang.Long.valueOf(j17))).iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.sns.model.n nVar = (com.tencent.mm.plugin.sns.model.n) it.next();
            if (nVar != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("start", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$MyDownloadCallback");
                int i17 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.V(((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z3) nVar).f165864a.f165485r).V1;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("start", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$MyDownloadCallback");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("start", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public long startDownload(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, boolean z17, com.tencent.mm.plugin.sns.model.n nVar, boolean z18, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.j3 j3Var, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startDownload", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mars.xlog.Log.i("AdLandingPagesProxy", "startDownload, appId=" + str + ", pkg=" + str3 + ", aid=" + j3Var.f165278d + ", fileName=" + str6 + ", isGameApp=" + z18 + ", url=" + str5 + ", uxinfo=" + j3Var.f165280f);
        java.lang.Object REMOTE_CALL = REMOTE_CALL("startDownloadMM", str, str2, str3, str4, str5, str6, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), j3Var, java.lang.Integer.valueOf(i17));
        long longValue = REMOTE_CALL == null ? -1L : ((java.lang.Long) REMOTE_CALL).longValue();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f164040n;
        java.util.ArrayList arrayList = (java.util.ArrayList) concurrentHashMap.get(java.lang.Long.valueOf(longValue));
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
            arrayList.add(nVar);
        } else if (!arrayList.contains(nVar)) {
            arrayList.add(nVar);
        }
        concurrentHashMap.put(java.lang.Long.valueOf(longValue), arrayList);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startDownload", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return longValue;
    }

    @k55.m
    public long startDownloadMM(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, boolean z17, boolean z18, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.j3 j3Var, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startDownloadMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        long w17 = za4.k.g().w(str, str2, str3, str4, str5, str6, z17, new com.tencent.mm.plugin.sns.model.o(this, str, str3, z17, 2, i17), this.f164041o, z18, j3Var);
        com.tencent.mars.xlog.Log.i("AdLandingPagesProxy", "startDownloadMM, id %d", java.lang.Long.valueOf(w17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startDownloadMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        return w17;
    }

    public void stopDownloadLandingPageVideo(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopDownloadLandingPageVideo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.util.Map map = this.f164043q;
        if (((java.util.HashMap) map).containsKey(str)) {
            ((java.util.HashMap) map).remove(str);
            com.tencent.mars.xlog.Log.i("AdLandingPagesProxy", "stop download video %s", str);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(nd1.j0.CTRL_INDEX, 34);
            com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("sns_ad_download_resource_preferences", 0).edit().putBoolean(str, false).commit();
        }
        REMOTE_CALL("stopDownloadLandingPageVideoMM", str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopDownloadLandingPageVideo", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    public void stopDownloadLandingPageVideoMM(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopDownloadLandingPageVideoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mm.plugin.sns.model.l4.Cj().w(str, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopDownloadLandingPageVideoMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void stopTask(java.lang.String str, com.tencent.mm.plugin.sns.model.n nVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopTask", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        long queryIdByAppid = queryIdByAppid(str);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f164040n;
        java.util.ArrayList arrayList = (java.util.ArrayList) concurrentHashMap.get(java.lang.Long.valueOf(queryIdByAppid));
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
            arrayList.add(nVar);
        } else if (!arrayList.contains(nVar)) {
            arrayList.add(nVar);
        }
        concurrentHashMap.put(java.lang.Long.valueOf(queryIdByAppid), arrayList);
        REMOTE_CALL("stopTaskMM", str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopTask", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    public void stopTaskMM(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopTaskMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        za4.k.g().x(str, this.f164041o);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopTaskMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.l
    public void stopped(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopped", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.util.Iterator it = ((java.util.ArrayList) this.f164040n.get(java.lang.Long.valueOf(j17))).iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.sns.model.n nVar = (com.tencent.mm.plugin.sns.model.n) it.next();
            if (nVar != null) {
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z3 z3Var = (com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z3) nVar;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopped", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$MyDownloadCallback");
                int i17 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.V(z3Var.f165864a.f165485r).V1;
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.U(z3Var.f165864a.f165485r).l(14);
                ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.y3(z3Var));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopped", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$MyDownloadCallback");
            }
        }
        this.f164040n.remove(java.lang.Long.valueOf(j17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopped", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.l
    public void succeed(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.SUCCEED, "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f164040n;
        java.util.Iterator it = ((java.util.ArrayList) concurrentHashMap.get(java.lang.Long.valueOf(j17))).iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.sns.model.n nVar = (com.tencent.mm.plugin.sns.model.n) it.next();
            if (nVar != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.SUCCEED, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$MyDownloadCallback");
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.s4 s4Var = ((com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z3) nVar).f165864a;
                int i17 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.V(s4Var.f165485r).V1;
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u4.U(s4Var.f165485r).l(9);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.SUCCEED, "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageDownloadApkBtnComp$BtnStateMachine$MyDownloadCallback");
            }
        }
        concurrentHashMap.remove(java.lang.Long.valueOf(j17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.SUCCEED, "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void updateContact(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateContact", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        REMOTE_CALL("updateContactMM", str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateContact", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    public void updateContactMM(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateContactMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        com.tencent.mm.storage.k4 Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        if (Bi == null || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateContactMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
            return;
        }
        com.tencent.mm.storage.z3 n17 = Bi.n(str, true);
        n17.N2();
        n17.X1(str);
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.sns.model.l(this, n17, Bi));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateContactMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    public void writeDeferredDeepLink(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("writeDeferredDeepLink", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        REMOTE_CALL("writeDeferredDeepLinkMM", str, str2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("writeDeferredDeepLink", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }

    @k55.m
    public void writeDeferredDeepLinkMM(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("writeDeferredDeepLinkMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
        j().edit().putString(str, str2).commit();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("writeDeferredDeepLinkMM", "com.tencent.mm.plugin.sns.model.AdLandingPagesProxy");
    }
}
