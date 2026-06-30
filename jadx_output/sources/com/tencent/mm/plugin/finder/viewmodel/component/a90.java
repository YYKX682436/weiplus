package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class a90 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f133747d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f133748e;

    /* renamed from: f, reason: collision with root package name */
    public int f133749f;

    /* renamed from: g, reason: collision with root package name */
    public int f133750g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.e90 f133751h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f133752i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f133753m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.v80 f133754n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f133755o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f133756p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a90(com.tencent.mm.plugin.finder.viewmodel.component.e90 e90Var, java.lang.ref.WeakReference weakReference, in5.s0 s0Var, com.tencent.mm.plugin.finder.viewmodel.component.v80 v80Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, android.widget.FrameLayout frameLayout, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f133751h = e90Var;
        this.f133752i = weakReference;
        this.f133753m = s0Var;
        this.f133754n = v80Var;
        this.f133755o = baseFinderFeed;
        this.f133756p = frameLayout;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.viewmodel.component.a90(this.f133751h, this.f133752i, this.f133753m, this.f133754n, this.f133755o, this.f133756p, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.viewmodel.component.a90) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int i17;
        com.tencent.mm.plugin.finder.viewmodel.component.e90 e90Var;
        boolean z17;
        java.lang.Object wi6;
        android.widget.FrameLayout frameLayout;
        java.lang.String str;
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar;
        android.content.Context context;
        pz5.a aVar2 = pz5.a.f359186d;
        int i18 = this.f133750g;
        com.tencent.mm.plugin.finder.viewmodel.component.v80 v80Var = this.f133754n;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f133755o;
        com.tencent.mm.plugin.finder.viewmodel.component.e90 e90Var2 = this.f133751h;
        if (i18 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            e90Var2.f134238n = new ku2.a(new java.lang.ref.WeakReference(this.f133752i.get()));
            android.widget.FrameLayout frameLayout2 = new android.widget.FrameLayout(e90Var2.getContext());
            frameLayout2.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
            if (e90Var2.f134234g == null) {
                in5.s0 s0Var = this.f133753m;
                android.content.Context context2 = s0Var.itemView.getContext();
                if (context2 != null) {
                    pf5.z zVar = pf5.z.f353948a;
                    if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    aVar = ((com.tencent.mm.plugin.finder.viewmodel.component.a4) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.a4.class)).U6(e90Var2.getFragment(), v80Var.f136223a, s0Var);
                } else {
                    com.tencent.mars.xlog.Log.w("Finder.FinderTingEntryUIC", "无法获取有效 Context");
                    aVar = null;
                }
                e90Var2.f134235h = new com.tencent.mm.plugin.finder.viewmodel.component.rc(aVar);
            }
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            java.lang.String P6 = e90Var2.P6(baseFinderFeed.getItemId());
            androidx.appcompat.app.AppCompatActivity context3 = e90Var2.getActivity();
            kotlin.jvm.internal.o.g(context3, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context3 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context3).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
            int i19 = baseFinderFeed.getEnhanceFromEventType() == 16 ? 1 : 0;
            if (i19 != 0) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[TeenagerRest] show teenager rest feed. feedid:");
                sb6.append(P6);
                sb6.append(", commentScene:");
                sb6.append(V6 != null ? new java.lang.Integer(V6.getInteger(5)) : null);
                com.tencent.mars.xlog.Log.i("Finder.FinderTingEntryUIC", sb6.toString());
                linkedHashMap.put(java.lang.String.valueOf(com.tencent.pigeon.finder.FinderFlutterParamKey.TING_ENTRY_TYPE.getRaw()), new java.lang.Integer(com.tencent.pigeon.finder.FinderTingEntryType.REST.getRaw()));
                java.lang.String valueOf = java.lang.String.valueOf(com.tencent.pigeon.finder.FinderFlutterParamKey.TING_ENTRY_TEENAGER_REST_WATCHED_MINUTES.getRaw());
                com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
                linkedHashMap.put(valueOf, ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127626bg).getValue()).r());
                linkedHashMap.put(java.lang.String.valueOf(com.tencent.pigeon.finder.FinderFlutterParamKey.FEED_ID.getRaw()), P6);
                linkedHashMap.put(java.lang.String.valueOf(com.tencent.pigeon.finder.FinderFlutterParamKey.COMMENT_SCENE.getRaw()), new java.lang.Integer(V6 != null ? V6.getInteger(5) : 0));
                java.lang.String valueOf2 = java.lang.String.valueOf(com.tencent.pigeon.finder.FinderFlutterParamKey.FINDER_CONTEXT_ID.getRaw());
                java.lang.Object string = V6 != null ? V6.getString(1) : null;
                if (string == null) {
                    string = new java.lang.Integer(0);
                }
                linkedHashMap.put(valueOf2, string);
                java.lang.String valueOf3 = java.lang.String.valueOf(com.tencent.pigeon.finder.FinderFlutterParamKey.FINDER_TAB_CONTEXT_ID.getRaw());
                java.lang.Object string2 = V6 != null ? V6.getString(2) : null;
                if (string2 == null) {
                    string2 = new java.lang.Integer(0);
                }
                linkedHashMap.put(valueOf3, string2);
            } else {
                linkedHashMap.put(java.lang.String.valueOf(com.tencent.pigeon.finder.FinderFlutterParamKey.TING_ENTRY_TYPE.getRaw()), new java.lang.Integer(com.tencent.pigeon.finder.FinderTingEntryType.SLEEP.getRaw()));
            }
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.service.x4.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            androidx.lifecycle.o mo133getLifecycle = e90Var2.getActivity().mo133getLifecycle();
            kotlin.jvm.internal.o.f(mo133getLifecycle, "getLifecycle(...)");
            ku2.a aVar3 = e90Var2.f134238n;
            kotlin.jvm.internal.o.e(aVar3, "null cannot be cast to non-null type io.flutter.embedding.engine.plugins.FlutterPlugin");
            java.util.List c18 = kz5.b0.c(aVar3);
            this.f133747d = frameLayout2;
            this.f133748e = P6;
            this.f133749f = i19;
            this.f133750g = 1;
            i17 = i19;
            e90Var = e90Var2;
            z17 = true;
            wi6 = ((com.tencent.mm.plugin.finder.service.x4) c17).wi(frameLayout2, mo133getLifecycle, "tingEntry", (r18 & 8) != 0 ? null : null, (r18 & 16) != 0 ? null : c18, (r18 & 32) != 0 ? null : linkedHashMap, this);
            if (wi6 == aVar2) {
                return aVar2;
            }
            frameLayout = frameLayout2;
            str = P6;
        } else {
            if (i18 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i27 = this.f133749f;
            str = (java.lang.String) this.f133748e;
            frameLayout = (android.widget.FrameLayout) this.f133747d;
            kotlin.ResultKt.throwOnFailure(obj);
            i17 = i27;
            e90Var = e90Var2;
            z17 = true;
            wi6 = obj;
        }
        com.tencent.mm.plugin.finder.viewmodel.component.e90 e90Var3 = e90Var;
        e90Var3.f134234g = (pi0.n1) wi6;
        android.widget.FrameLayout frameLayout3 = this.f133756p;
        frameLayout3.setVisibility(0);
        frameLayout3.removeAllViews();
        frameLayout3.addView(frameLayout);
        com.tencent.mm.plugin.finder.viewmodel.component.rc rcVar = e90Var3.f134235h;
        if (rcVar != null) {
            rcVar.b(z17);
        }
        com.tencent.mm.plugin.finder.viewmodel.component.rc rcVar2 = e90Var3.f134235h;
        if (rcVar2 != null) {
            rcVar2.c(0.0f);
        }
        com.tencent.mm.plugin.finder.viewmodel.component.rc rcVar3 = e90Var3.f134235h;
        if (rcVar3 != null) {
            rcVar3.b(false);
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderTingEntryUIC", "realPopupFlutterSurvey, feedId = " + str);
        com.tencent.mm.plugin.finder.report.d2.k(com.tencent.mm.plugin.finder.report.d2.f124994a, this.f133756p, "listen_page_thumbnail", "view_exp", true, e90Var3.Q6(baseFinderFeed), null, 32, null);
        if (i17 != 0 && !v80Var.f136225c && (context = frameLayout3.getContext()) != null) {
            hc2.v0.c(context, iy1.c.FinderBreakReminder, "page_in", false, kz5.b1.e(new jz5.l("feed_id", str)), 4, null);
        }
        com.tencent.mm.plugin.finder.viewmodel.component.v80 V62 = e90Var3.V6(baseFinderFeed);
        if (V62 != null) {
            V62.f136225c = false;
        }
        return jz5.f0.f302826a;
    }
}
