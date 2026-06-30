package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes4.dex */
public final class ImproveObserverUIC extends com.tencent.mm.plugin.sns.ui.improve.component.j {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f168708d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f168709e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f168710f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f168711g;

    /* renamed from: h, reason: collision with root package name */
    public final o75.a f168712h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f168713i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f168714m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.improve.component.ImproveObserverUIC$removeFinderGuideLayoutListener$1 f168715n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.tencent.mm.plugin.sns.ui.improve.component.ImproveObserverUIC$removeFinderGuideLayoutListener$1] */
    public ImproveObserverUIC(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f168708d = jz5.h.b(new com.tencent.mm.plugin.sns.ui.improve.component.t1(activity));
        final androidx.lifecycle.y lifecycleOwner = getLifecycleOwner();
        this.f168709e = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsTranslateStartEvent>(lifecycleOwner) { // from class: com.tencent.mm.plugin.sns.ui.improve.component.ImproveObserverUIC$translateStartListener$1
            {
                this.__eventId = 1200144606;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsTranslateStartEvent snsTranslateStartEvent) {
                xc4.p n17;
                xc4.p n18;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveObserverUIC$translateStartListener$1");
                com.tencent.mm.autogen.events.SnsTranslateStartEvent event = snsTranslateStartEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveObserverUIC$translateStartListener$1");
                kotlin.jvm.internal.o.g(event, "event");
                java.util.Iterator it = com.tencent.mm.plugin.sns.ui.improve.component.ImproveObserverUIC.O6(com.tencent.mm.plugin.sns.ui.improve.component.ImproveObserverUIC.this).O6().iterator();
                while (it.hasNext()) {
                    tc4.s0 s0Var = (tc4.s0) it.next();
                    if (s0Var instanceof tc4.v3) {
                        tc4.k2 k2Var = (tc4.k2) ((tc4.v3) s0Var);
                        k2Var.getClass();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("tansStartCallback", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
                        am.fx fxVar = event.f54849g;
                        int i17 = fxVar.f6710a;
                        if (i17 == 1) {
                            java.lang.String str = fxVar.f6711b;
                            kotlin.jvm.internal.o.d(str);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("postDescTranslateStart", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
                            zc4.b data = k2Var.getData();
                            if (data == null || (n18 = data.n()) == null) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("postDescTranslateStart", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
                            } else if (kotlin.jvm.internal.o.b(n18.e1(), str)) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.Improve.Notify", "postDescTranslateStart, id:" + str + '-' + n18.a1());
                                com.tencent.mm.plugin.sns.model.s6.a(str, 2);
                                k2Var.getContentText().l();
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("postDescTranslateStart", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
                            } else {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("postDescTranslateStart", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
                            }
                        } else if (i17 == 2) {
                            java.lang.String str2 = fxVar.f6711b;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("commentTranslateStart", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
                            if (str2 == null) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("commentTranslateStart", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
                            } else {
                                zc4.b data2 = k2Var.getData();
                                if (data2 == null || (n17 = data2.n()) == null) {
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("commentTranslateStart", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
                                } else if (r26.n0.B(str2, n17.a1(), false)) {
                                    com.tencent.mm.plugin.sns.model.s6.a(str2, 2);
                                    int L = k2Var.L(str2);
                                    com.tencent.mars.xlog.Log.i("MicroMsg.Improve.Notify", "commentTranslateStart, id:" + str2 + " position:" + L);
                                    com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout commentView = k2Var.getCommentView();
                                    if (commentView != null) {
                                        commentView.l(L);
                                    }
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("commentTranslateStart", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
                                } else {
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("commentTranslateStart", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
                                }
                            }
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tansStartCallback", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveObserverUIC$translateStartListener$1");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveObserverUIC$translateStartListener$1");
                return false;
            }
        };
        final androidx.lifecycle.y lifecycleOwner2 = getLifecycleOwner();
        this.f168710f = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsTranslateFinishEvent>(lifecycleOwner2) { // from class: com.tencent.mm.plugin.sns.ui.improve.component.ImproveObserverUIC$translateFinishListener$1
            {
                this.__eventId = 2139223297;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsTranslateFinishEvent snsTranslateFinishEvent) {
                xc4.p n17;
                xc4.p n18;
                uc4.g gVar;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveObserverUIC$translateFinishListener$1");
                com.tencent.mm.autogen.events.SnsTranslateFinishEvent event = snsTranslateFinishEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveObserverUIC$translateFinishListener$1");
                kotlin.jvm.internal.o.g(event, "event");
                java.util.Iterator it = com.tencent.mm.plugin.sns.ui.improve.component.ImproveObserverUIC.O6(com.tencent.mm.plugin.sns.ui.improve.component.ImproveObserverUIC.this).O6().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveObserverUIC$translateFinishListener$1");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveObserverUIC$translateFinishListener$1");
                        return false;
                    }
                    tc4.s0 s0Var = (tc4.s0) it.next();
                    if (s0Var instanceof tc4.u3) {
                        tc4.k2 k2Var = (tc4.k2) ((tc4.u3) s0Var);
                        k2Var.getClass();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("tansFinishCallback", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
                        am.dx dxVar = event.f54847g;
                        java.lang.String str = dxVar.f6506b;
                        int i17 = dxVar.f6505a;
                        if (i17 == 1) {
                            kotlin.jvm.internal.o.d(str);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("postDescTranslateFinish", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
                            zc4.b data = k2Var.getData();
                            if (data == null || (n18 = data.n()) == null) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("postDescTranslateFinish", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
                            } else if (kotlin.jvm.internal.o.b(n18.e1(), str)) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.Improve.Notify", "postDescTranslateFinish, id:" + str + '-' + n18.a1());
                                com.tencent.mm.plugin.sns.model.s6.a(str, 2);
                                com.tencent.mm.plugin.sns.model.r6 f17 = com.tencent.mm.plugin.sns.model.s6.f(str);
                                if (!pc4.d.f353410a.b(false)) {
                                    java.util.Iterator it6 = uc4.f1.J(k2Var).iterator();
                                    while (true) {
                                        if (!it6.hasNext()) {
                                            gVar = null;
                                            break;
                                        }
                                        gVar = (uc4.g) it6.next();
                                        if (gVar instanceof uc4.z) {
                                            break;
                                        }
                                    }
                                    uc4.z zVar = (uc4.z) gVar;
                                    if (zVar != null) {
                                        zVar.k(k2Var.getContentText().getTranslateLayout(), false, true, false);
                                    }
                                }
                                k2Var.getContentText().i(n18.c1(), f17, 1, f17 != null ? f17.f164645b : null, f17 != null ? f17.f164646c : null, f17 != null ? f17.f164650g : false);
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("postDescTranslateFinish", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
                            } else {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("postDescTranslateFinish", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
                            }
                        } else if (i17 == 2) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("commentTranslateFinish", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
                            if (str == null) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("commentTranslateFinish", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
                            } else {
                                zc4.b data2 = k2Var.getData();
                                if (data2 == null || (n17 = data2.n()) == null) {
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("commentTranslateFinish", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
                                } else if (r26.n0.B(str, n17.a1(), false)) {
                                    com.tencent.mm.plugin.sns.model.s6.a(str, 2);
                                    int L = k2Var.L(str);
                                    com.tencent.mars.xlog.Log.i("MicroMsg.Improve.Notify", "commentTranslateFinish, id:" + str + " position:" + L);
                                    com.tencent.mm.plugin.sns.model.r6 f18 = com.tencent.mm.plugin.sns.model.s6.f(str);
                                    com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout commentView = k2Var.getCommentView();
                                    if (commentView != null) {
                                        commentView.e(L, f18, 2, f18 != null ? f18.f164645b : null, f18 != null ? f18.f164646c : null, f18 != null ? f18.f164650g : false);
                                    }
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("commentTranslateFinish", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
                                } else {
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("commentTranslateFinish", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
                                }
                            }
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tansFinishCallback", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
                    }
                }
            }
        };
        final androidx.lifecycle.y lifecycleOwner3 = getLifecycleOwner();
        this.f168711g = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsUnTranslateEvent>(lifecycleOwner3) { // from class: com.tencent.mm.plugin.sns.ui.improve.component.ImproveObserverUIC$unTranslateListener$1
            {
                this.__eventId = -868441523;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsUnTranslateEvent snsUnTranslateEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveObserverUIC$unTranslateListener$1");
                com.tencent.mm.autogen.events.SnsUnTranslateEvent event = snsUnTranslateEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveObserverUIC$unTranslateListener$1");
                kotlin.jvm.internal.o.g(event, "event");
                java.util.Iterator it = com.tencent.mm.plugin.sns.ui.improve.component.ImproveObserverUIC.O6(com.tencent.mm.plugin.sns.ui.improve.component.ImproveObserverUIC.this).O6().iterator();
                while (it.hasNext()) {
                    tc4.s0 s0Var = (tc4.s0) it.next();
                    if (s0Var instanceof tc4.w3) {
                        ((tc4.k2) ((tc4.w3) s0Var)).N(event);
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveObserverUIC$unTranslateListener$1");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveObserverUIC$unTranslateListener$1");
                return false;
            }
        };
        this.f168712h = new com.tencent.mm.plugin.sns.ui.improve.component.u1(this);
        final androidx.lifecycle.y lifecycleOwner4 = getLifecycleOwner();
        this.f168713i = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ChangeTranslateLanguageEvent>(lifecycleOwner4) { // from class: com.tencent.mm.plugin.sns.ui.improve.component.ImproveObserverUIC$changeTranslateListener$1
            {
                this.__eventId = -348375692;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ChangeTranslateLanguageEvent changeTranslateLanguageEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveObserverUIC$changeTranslateListener$1");
                com.tencent.mm.autogen.events.ChangeTranslateLanguageEvent event = changeTranslateLanguageEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveObserverUIC$changeTranslateListener$1");
                kotlin.jvm.internal.o.g(event, "event");
                java.util.Iterator it = com.tencent.mm.plugin.sns.ui.improve.component.ImproveObserverUIC.O6(com.tencent.mm.plugin.sns.ui.improve.component.ImproveObserverUIC.this).O6().iterator();
                while (it.hasNext()) {
                    tc4.s0 s0Var = (tc4.s0) it.next();
                    if (s0Var instanceof tc4.d) {
                        ((tc4.k2) ((tc4.d) s0Var)).M(event);
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveObserverUIC$changeTranslateListener$1");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveObserverUIC$changeTranslateListener$1");
                return false;
            }
        };
        final androidx.lifecycle.y lifecycleOwner5 = getLifecycleOwner();
        this.f168714m = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsReDownloadEvent>(lifecycleOwner5) { // from class: com.tencent.mm.plugin.sns.ui.improve.component.ImproveObserverUIC$reDownloadListener$1
            {
                this.__eventId = 871954711;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsReDownloadEvent snsReDownloadEvent) {
                xc4.p n17;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveObserverUIC$reDownloadListener$1");
                com.tencent.mm.autogen.events.SnsReDownloadEvent event = snsReDownloadEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveObserverUIC$reDownloadListener$1");
                kotlin.jvm.internal.o.g(event, "event");
                java.util.Iterator it = com.tencent.mm.plugin.sns.ui.improve.component.ImproveObserverUIC.O6(com.tencent.mm.plugin.sns.ui.improve.component.ImproveObserverUIC.this).O6().iterator();
                while (it.hasNext()) {
                    tc4.s0 s0Var = (tc4.s0) it.next();
                    if (s0Var instanceof tc4.k3) {
                        tc4.k2 k2Var = (tc4.k2) ((tc4.k3) s0Var);
                        k2Var.getClass();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reDownloadCallback", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
                        java.lang.String str = event.f54832g.f7580a;
                        zc4.b data = k2Var.getData();
                        java.lang.String a17 = (data == null || (n17 = data.n()) == null) ? null : n17.a1();
                        if (android.text.TextUtils.isEmpty(str) || !str.equals(a17)) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reDownloadCallback", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
                        } else {
                            k2Var.x("MicroMsg.Improve.Notify", "reDownload snsid:".concat(str));
                            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new tc4.j2(k2Var, null), 3, null);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reDownloadCallback", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
                        }
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveObserverUIC$reDownloadListener$1");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveObserverUIC$reDownloadListener$1");
                return false;
            }
        };
        final android.app.Activity context = getContext();
        this.f168715n = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsRemoveFinderEvent>(context) { // from class: com.tencent.mm.plugin.sns.ui.improve.component.ImproveObserverUIC$removeFinderGuideLayoutListener$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super((androidx.lifecycle.y) context);
                kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                this.__eventId = -1845215608;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsRemoveFinderEvent snsRemoveFinderEvent) {
                xc4.p n17;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveObserverUIC$removeFinderGuideLayoutListener$1");
                com.tencent.mm.autogen.events.SnsRemoveFinderEvent event = snsRemoveFinderEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveObserverUIC$removeFinderGuideLayoutListener$1");
                kotlin.jvm.internal.o.g(event, "event");
                java.util.Iterator it = com.tencent.mm.plugin.sns.ui.improve.component.ImproveObserverUIC.O6(com.tencent.mm.plugin.sns.ui.improve.component.ImproveObserverUIC.this).O6().iterator();
                while (it.hasNext()) {
                    tc4.s0 s0Var = (tc4.s0) it.next();
                    if (s0Var instanceof tc4.s3) {
                        tc4.k2 k2Var = (tc4.k2) ((tc4.s3) s0Var);
                        k2Var.getClass();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeFinderFooterCallback", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
                        zc4.b data = k2Var.getData();
                        if (kotlin.jvm.internal.o.b((data == null || (n17 = data.n()) == null) ? null : n17.W0(), event.f54833g.f7666a)) {
                            k2Var.getItemFooter().l();
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeFinderFooterCallback", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
                        } else {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeFinderFooterCallback", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemNotify");
                        }
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveObserverUIC$removeFinderGuideLayoutListener$1");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveObserverUIC$removeFinderGuideLayoutListener$1");
                return true;
            }
        };
    }

    public static final com.tencent.mm.plugin.sns.ui.improve.component.m O6(com.tencent.mm.plugin.sns.ui.improve.component.ImproveObserverUIC improveObserverUIC) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getAvoidLeakUIC", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveObserverUIC");
        improveObserverUIC.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAvoidLeakUIC", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveObserverUIC");
        com.tencent.mm.plugin.sns.ui.improve.component.m mVar = (com.tencent.mm.plugin.sns.ui.improve.component.m) ((jz5.n) improveObserverUIC.f168708d).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAvoidLeakUIC", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveObserverUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getAvoidLeakUIC", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveObserverUIC");
        return mVar;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveObserverUIC");
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.ObserverUIC", "ImproveObserverUIC onCreate");
        this.f168709e.alive();
        this.f168710f.alive();
        this.f168711g.alive();
        this.f168714m.alive();
        this.f168713i.alive();
        alive();
        n34.h3 h3Var = n34.h3.f334610d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("registerPostListener", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        ((java.util.LinkedHashMap) n34.h3.f334616m).clear();
        ((java.util.LinkedHashMap) n34.h3.f334615i).clear();
        ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).getClass();
        mv2.f0.f331561a.a(h3Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("registerPostListener", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        dm.e2.D2.observe(getLifecycleOwner(), this.f168712h);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveObserverUIC");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveObserverUIC");
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.ObserverUIC", "ImproveObserverUIC onDestroy");
        this.f168709e.dead();
        this.f168710f.dead();
        this.f168711g.dead();
        this.f168714m.dead();
        this.f168713i.dead();
        dead();
        n34.h3 h3Var = n34.h3.f334610d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("unregisterPostListener", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).getClass();
        mv2.f0.f331561a.t(h3Var);
        ((java.util.LinkedHashMap) n34.h3.f334616m).clear();
        ((java.util.LinkedHashMap) n34.h3.f334615i).clear();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unregisterPostListener", "com.tencent.mm.plugin.sns.SnsFinderPostManager");
        dm.e2.D2.removeObserver(this.f168712h);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveObserverUIC");
    }
}
