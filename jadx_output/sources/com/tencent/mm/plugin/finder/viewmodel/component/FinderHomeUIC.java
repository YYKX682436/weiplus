package com.tencent.mm.plugin.finder.viewmodel.component;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0003\u001a\u00020\u0002R'\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0004j\b\u0012\u0004\u0012\u00020\u0002`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderHomeUIC;", "Lcom/tencent/mm/ui/component/UIComponent;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;", "getActiveFragment", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "fragments", "Ljava/util/ArrayList;", "V6", "()Ljava/util/ArrayList;", "Landroidx/appcompat/app/AppCompatActivity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderHomeUIC extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public boolean f133567d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f133568e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f133569f;
    private final java.util.ArrayList<com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment> fragments;

    /* renamed from: g, reason: collision with root package name */
    public boolean f133570g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f133571h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f133572i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f133573m;

    /* renamed from: n, reason: collision with root package name */
    public final ey2.t0 f133574n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f133575o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.viewmodel.component.el f133576p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f133577q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f133578r;

    /* renamed from: s, reason: collision with root package name */
    public final vr2.e f133579s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.extension.reddot.jb f133580t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f133581u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f133582v;

    /* renamed from: w, reason: collision with root package name */
    public final uh4.i0 f133583w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderHomeUIC(final androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        java.lang.Object m521constructorimpl;
        java.lang.Object m521constructorimpl2;
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f133572i = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.ol(this));
        g92.b bVar = g92.b.f269769e;
        r45.ls2 ls2Var = (r45.ls2) bVar.k2().d().getCustom(26);
        java.util.List list = ls2Var != null ? ls2Var.getList(1) : null;
        this.f133573m = list == null ? kz5.p0.f313996d : list;
        pf5.u uVar = pf5.u.f353936a;
        androidx.lifecycle.c1 a17 = uVar.e(c61.l7.class).a(ey2.t0.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        this.f133574n = (ey2.t0) a17;
        java.util.ArrayList<com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment> d17 = kz5.c0.d(new com.tencent.mm.plugin.finder.ui.fragment.FinderFollowTabFragment(), new com.tencent.mm.plugin.finder.ui.fragment.FinderFriendTabFragment(), new com.tencent.mm.plugin.finder.ui.fragment.FinderMachineTabFragment());
        r45.ls2 ls2Var2 = (r45.ls2) bVar.k2().d().getCustom(26);
        androidx.lifecycle.c1 a18 = uVar.e(c61.l7.class).a(ey2.t0.class);
        kotlin.jvm.internal.o.f(a18, "get(...)");
        int i17 = -1;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            i17 = T6();
            m521constructorimpl = kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(i17 == 35));
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Boolean bool = (java.lang.Boolean) (kotlin.Result.m527isFailureimpl(m521constructorimpl) ? null : m521constructorimpl);
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        try {
            i17 = T6();
            m521constructorimpl2 = kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(i17 == 39));
        } catch (java.lang.Throwable th7) {
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            m521constructorimpl2 = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th7));
        }
        java.lang.Boolean bool2 = (java.lang.Boolean) (kotlin.Result.m527isFailureimpl(m521constructorimpl2) ? null : m521constructorimpl2);
        boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        cq.k1.a();
        boolean W2 = com.tencent.mm.plugin.finder.storage.t70.f127590a.W2();
        cq.k1.a();
        boolean booleanValue3 = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Sg).getValue()).r()).booleanValue();
        boolean z17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_LBS_SAMECITY_SWITCH_CONFIG_INT_SYNC, 0) == 1;
        boolean z18 = W2 && z17 && !booleanValue3;
        boolean isTeenMode = ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode();
        boolean z19 = !isTeenMode && ((ey2.h1) ((xy2.k) uVar.e(zy2.b6.class).c(xy2.k.class))).O6();
        if (isTeenMode) {
            if (booleanValue || booleanValue2) {
                com.tencent.mars.xlog.Log.i("Finder.TlTabStateVM", "[forceResetLastTabType] toTabType=4");
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LAST_TAB_TYPE_INT_SYNC, 4);
            }
        } else if ((booleanValue || z18) && !z19) {
            d17.add(1, new com.tencent.mm.plugin.finder.ui.fragment.FinderLbsSameCityTabFragment());
        }
        if (z19) {
            com.tencent.mars.xlog.Log.i("Finder.HomeUIC", "add FinderNativeDramaTabFragment");
            d17.add(1, new com.tencent.mm.plugin.finder.ui.fragment.FinderNativeDramaTabFragment());
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("close_recommend=");
        sb6.append(ls2Var2 != null ? java.lang.Integer.valueOf(ls2Var2.getInteger(0)) : null);
        sb6.append(" tab_type_to_close=");
        sb6.append(ls2Var2 != null ? ls2Var2.getList(1) : null);
        sb6.append(" follow_tab_style=");
        sb6.append(ls2Var2 != null ? java.lang.Integer.valueOf(ls2Var2.getInteger(2)) : null);
        sb6.append(" enterType=");
        sb6.append(i17);
        sb6.append(" forceJumpSameCityTab=");
        sb6.append(booleanValue);
        sb6.append(" switchOn=");
        sb6.append(W2);
        sb6.append(" configSwitchOn=");
        sb6.append(z17);
        sb6.append(" teenMode=");
        sb6.append(isTeenMode);
        sb6.append(" notShowSameCity=");
        sb6.append(booleanValue3);
        com.tencent.mars.xlog.Log.i("Finder.HomeUIC", sb6.toString());
        pm0.v.b0(d17, new com.tencent.mm.plugin.finder.viewmodel.component.fl(this));
        this.fragments = d17;
        this.f133575o = new java.util.concurrent.CopyOnWriteArraySet();
        this.f133576p = new com.tencent.mm.plugin.finder.viewmodel.component.el(activity, this, d17);
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f133577q = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderTabSelectedEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC$eventListener$1
            {
                this.__eventId = -1371931232;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderTabSelectedEvent finderTabSelectedEvent) {
                com.tencent.mm.autogen.events.FinderTabSelectedEvent event = finderTabSelectedEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.id idVar = event.f54329g;
                if (idVar == null) {
                    return true;
                }
                int i18 = idVar.f6938a;
                android.os.Bundle bundle = new android.os.Bundle();
                if (idVar.f6939b) {
                    bundle.putInt("ForceScrollPosition", idVar.f6940c);
                }
                if (idVar.f6941d) {
                    bundle.putLong("KeepFeedAfterRefresh", idVar.f6942e);
                }
                if (idVar.f6943f) {
                    bundle.putInt("Source", idVar.f6944g);
                }
                com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.this.f7(i18, bundle);
                return true;
            }
        };
        this.f133578r = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderElderlyModeChangedEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC$elderlyModeChangedEventListener$1
            {
                this.__eventId = -1058520694;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderElderlyModeChangedEvent finderElderlyModeChangedEvent) {
                com.tencent.mm.autogen.events.FinderElderlyModeChangedEvent event = finderElderlyModeChangedEvent;
                kotlin.jvm.internal.o.g(event, "event");
                pm0.v.X(new com.tencent.mm.plugin.finder.viewmodel.component.dl(androidx.appcompat.app.AppCompatActivity.this, this));
                return false;
            }
        };
        this.f133579s = new vr2.e(this);
        this.f133582v = true;
        this.f133583w = new com.tencent.mm.plugin.finder.viewmodel.component.ml(this);
    }

    public static final void O6(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC finderHomeUIC) {
        boolean z17;
        java.lang.Object m521constructorimpl;
        androidx.fragment.app.i2 beginTransaction;
        androidx.fragment.app.Fragment findFragmentById;
        finderHomeUIC.getClass();
        cq.k1.a();
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (!((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Sg).getValue()).r()).booleanValue()) {
            com.tencent.mars.xlog.Log.e("Finder.HomeUIC", "[loadLbsSameCityButNotShow] not hit exp");
            return;
        }
        java.util.ArrayList<com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment> arrayList = finderHomeUIC.fragments;
        if (!(arrayList instanceof java.util.Collection) || !arrayList.isEmpty()) {
            java.util.Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                if (((com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment) it.next()) instanceof com.tencent.mm.plugin.finder.ui.fragment.FinderNativeDramaTabFragment) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        if (z17) {
            com.tencent.mars.xlog.Log.i("Finder.HomeUIC", "[loadLbsSameCityButNotShow] nativeDrama tab exist, skip");
            return;
        }
        androidx.fragment.app.FragmentManager supportFragmentManager = finderHomeUIC.getActivity().getSupportFragmentManager();
        kotlin.jvm.internal.o.f(supportFragmentManager, "getSupportFragmentManager(...)");
        if (supportFragmentManager.isStateSaved()) {
            com.tencent.mars.xlog.Log.w("Finder.HomeUIC", "[loadLbsSameCityButNotShow]: fragmentManager is save state");
            return;
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            beginTransaction = supportFragmentManager.beginTransaction();
            kotlin.jvm.internal.o.f(beginTransaction, "beginTransaction(...)");
            findFragmentById = supportFragmentManager.findFragmentById(com.tencent.mm.R.id.gd9);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (!(findFragmentById instanceof com.tencent.mm.plugin.finder.ui.fragment.FinderLbsSameCityTabFragment)) {
            com.tencent.mars.xlog.Log.w("Finder.HomeUIC", "[loadLbsSameCityButNotShow]: currentFragment=" + findFragmentById);
            return;
        }
        beginTransaction.m(findFragmentById, androidx.lifecycle.n.RESUMED);
        m521constructorimpl = kotlin.Result.m521constructorimpl(java.lang.Integer.valueOf(((androidx.fragment.app.a) beginTransaction).p(true)));
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Finder.HomeUIC", m524exceptionOrNullimpl, "[loadLbsSameCityButNotShow] error", new java.lang.Object[0]);
        }
    }

    public static final void P6(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC finderHomeUIC) {
        java.lang.Object obj;
        java.util.Iterator<T> it = finderHomeUIC.fragments.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment) obj).f129265p == 39) {
                    break;
                }
            }
        }
        if (((com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment) obj) == null) {
            com.tencent.mars.xlog.Log.e("Finder.HomeUIC", "[preloadNativeDramaTab] nativeDrama tab is not exist");
            return;
        }
        androidx.appcompat.app.AppCompatActivity activity = finderHomeUIC.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((com.tencent.mm.plugin.finder.viewmodel.component.u70) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.u70.class)).O6(39);
        com.tencent.mars.xlog.Log.i("Finder.HomeUIC", "[preloadNativeDramaTab] startPreload");
    }

    public static final void Q6(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC finderHomeUIC) {
        boolean z17;
        finderHomeUIC.getClass();
        cq.k1.a();
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        java.lang.Object r17 = ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Rg).getValue()).r();
        java.lang.Object obj = null;
        if (!((java.lang.Boolean) r17).booleanValue()) {
            r17 = null;
        }
        java.lang.Boolean bool = (java.lang.Boolean) r17;
        if (bool == null) {
            com.tencent.mars.xlog.Log.e("Finder.HomeUIC", "[preloadSameCityTab] not hit exp");
            return;
        }
        bool.booleanValue();
        java.util.ArrayList<com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment> arrayList = finderHomeUIC.fragments;
        if (!(arrayList instanceof java.util.Collection) || !arrayList.isEmpty()) {
            java.util.Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                if (((com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment) it.next()) instanceof com.tencent.mm.plugin.finder.ui.fragment.FinderNativeDramaTabFragment) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        if (z17) {
            com.tencent.mars.xlog.Log.i("Finder.HomeUIC", "[preloadSameCityTab] nativeDrama tab exist, skip");
            return;
        }
        java.util.Iterator<T> it6 = finderHomeUIC.fragments.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            java.lang.Object next = it6.next();
            if (((com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment) next).f129265p == 35) {
                obj = next;
                break;
            }
        }
        if (((com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment) obj) == null) {
            com.tencent.mars.xlog.Log.e("Finder.HomeUIC", "[preloadSameCityTab] sameCity tab is not exist");
            return;
        }
        androidx.appcompat.app.AppCompatActivity activity = finderHomeUIC.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((com.tencent.mm.plugin.finder.viewmodel.component.u70) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.u70.class)).O6(35);
        com.tencent.mars.xlog.Log.i("Finder.HomeUIC", "[preloadSameCityTab] startPreload");
    }

    public final void R6() {
        if (b7()) {
            return;
        }
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.viewmodel.component.ya0 ya0Var = (com.tencent.mm.plugin.finder.viewmodel.component.ya0) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ya0.class);
        ya0Var.f136546f = this.fragments;
        ya0Var.O6();
    }

    public final int S6() {
        if (this.f133581u) {
            return getActiveFragment().f129265p;
        }
        if (!(getIntent().getBooleanExtra("KEY_FINDER_JUMP_FOLLOW_TAB", false) || getIntent().getBooleanExtra("KEY_FINDER_JUMP_FRIEND_TAB", false) || getIntent().getBooleanExtra("KEY_FINDER_JUMP_HOT_TAB", false))) {
            return ((ey2.t0) pf5.u.f353936a.e(c61.l7.class).a(ey2.t0.class)).Q6();
        }
        boolean booleanExtra = getIntent().getBooleanExtra("KEY_FINDER_JUMP_FOLLOW_TAB", false);
        boolean booleanExtra2 = getIntent().getBooleanExtra("KEY_FINDER_JUMP_FRIEND_TAB", false);
        boolean booleanExtra3 = getIntent().getBooleanExtra("KEY_FINDER_JUMP_HOT_TAB", false);
        if (booleanExtra) {
            return 3;
        }
        if (booleanExtra2) {
            return 1;
        }
        return booleanExtra3 ? 4 : -1;
    }

    public final int T6() {
        if (getActivity().getIntent().getBooleanExtra("KEY_FINDER_JUMP_FOLLOW_TAB", false)) {
            com.tencent.mars.xlog.Log.i("Finder.HomeUIC", "getEnterTabType KEY_FINDER_JUMP_FOLLOW_TAB");
            return 3;
        }
        if (getActivity().getIntent().getBooleanExtra("KEY_FINDER_JUMP_FRIEND_TAB", false)) {
            com.tencent.mars.xlog.Log.i("Finder.HomeUIC", "getEnterTabType KEY_FINDER_JUMP_FRIEND_TAB");
            return 1;
        }
        if (!getActivity().getIntent().getBooleanExtra("KEY_FINDER_JUMP_HOT_TAB", false)) {
            return this.f133574n.Q6();
        }
        com.tencent.mars.xlog.Log.i("Finder.HomeUIC", "getEnterTabType KEY_FINDER_JUMP_HOT_TAB");
        return 4;
    }

    public final com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment U6(int i17) {
        java.util.Iterator<com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment> it = this.fragments.iterator();
        int i18 = 0;
        while (true) {
            if (!it.hasNext()) {
                i18 = -1;
                break;
            }
            if (it.next().f129265p == i17) {
                break;
            }
            i18++;
        }
        if (i18 >= 0) {
            return this.fragments.get(i18);
        }
        com.tencent.mars.xlog.Log.e("Finder.HomeUIC", "[getFragmentByTabType] type=" + i17 + " is invalid.");
        return null;
    }

    /* renamed from: V6, reason: from getter */
    public final java.util.ArrayList getFragments() {
        return this.fragments;
    }

    public final int W6(int i17) {
        java.util.Iterator<com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment> it = this.fragments.iterator();
        int i18 = 0;
        while (true) {
            if (!it.hasNext()) {
                i18 = -1;
                break;
            }
            if (it.next().f129265p == i17) {
                break;
            }
            i18++;
        }
        if (i18 >= 0) {
            return i18;
        }
        com.tencent.mars.xlog.Log.e("Finder.HomeUIC", "[getIndex] type=" + i17 + " is invalid.");
        r45.ls2 ls2Var = (r45.ls2) g92.b.f269769e.k2().d().getCustom(26);
        return (ls2Var == null || ls2Var.getInteger(0) != 1) ? 0 : 1;
    }

    public final vb2.o X6() {
        return (vb2.o) this.f133572i.getValue();
    }

    public final void Y6() {
        if (getActivity() instanceof com.tencent.mm.plugin.finder.ui.FinderHomeUI) {
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127858o7).getValue()).r()).intValue() == 1 && !this.f133571h) {
                this.f133571h = true;
                pm0.v.V(0L, new com.tencent.mm.plugin.finder.viewmodel.component.gl(this));
            }
        }
    }

    public final boolean Z6(int i17) {
        java.lang.String string;
        ni0.i iVar;
        byte[] bArr;
        if (i17 != 4) {
            return false;
        }
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        r45.tb4 a17 = cq.l1.a((cq.k) c17, hc2.d0.b(i17));
        if (a17 == null || (string = a17.getString(0)) == null) {
            return false;
        }
        c66.q qVar = c66.q.f39493a;
        java.util.List b17 = com.tencent.mm.sdk.platformtools.h2.b(new java.lang.String[]{string});
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = null;
        java.util.ArrayList b18 = ((java.util.ArrayList) b17).isEmpty() ? null : qVar.b(b17, (kk.l) ((jz5.n) c66.q.f39503k).getValue(), new c66.m(b17));
        if (b18 == null || (iVar = (ni0.i) kz5.n0.Z(b18)) == null || (bArr = iVar.f337232b) == null) {
            return false;
        }
        com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = new com.tencent.mm.protocal.protobuf.FinderObject();
        try {
            finderObject2.parseFrom(bArr);
            finderObject = finderObject2;
        } catch (java.lang.Exception e17) {
            com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
        }
        if (finderObject == null) {
            return false;
        }
        com.tencent.mm.plugin.finder.storage.FinderItem a18 = com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, hc2.d0.d(i17));
        if (!a18.isUrlValid()) {
            return false;
        }
        java.util.List list = this.f133574n.N6(i17).f257443c;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed p17 = cu2.u.f222441a.p(a18);
        p17.u1(true);
        list.add(0, p17);
        return true;
    }

    public final boolean a7() {
        com.tencent.mm.plugin.finder.model.BaseFinderFeed N6 = ((ey2.b1) pf5.u.f353936a.e(c61.l7.class).a(ey2.b1.class)).N6(0, hc2.d0.b(4));
        if (N6 == null || !N6.getFeedObject().isUrlValid()) {
            return false;
        }
        java.util.List list = this.f133574n.N6(4).f257443c;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed p17 = cu2.u.f222441a.p(N6.getFeedObject());
        p17.c2(true);
        list.add(0, p17);
        return true;
    }

    public final boolean b7() {
        com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment U6 = U6(this.f133574n.f257507m);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fragment=");
        sb6.append(U6 != null ? U6.getClass().getName() : null);
        com.tencent.mars.xlog.Log.i("Finder.HomeUIC", sb6.toString());
        return (U6 instanceof com.tencent.mm.plugin.finder.ui.fragment.FinderFollowTabFragment) && ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.y0().r()).intValue() == 1;
    }

    public final void c7() {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        int i17 = this.f133574n.f257507m;
        if (i17 == 1) {
            i95.m c17 = i95.n0.c(zy2.zb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ((ml2.j0) ((zy2.zb) i95.n0.c(zy2.zb.class))).getClass();
            java.lang.ref.WeakReference weakReference = ml2.j0.f327583i.f328287a0;
            recyclerView = weakReference != null ? (androidx.recyclerview.widget.RecyclerView) weakReference.get() : null;
            ml2.x1 x1Var = ml2.x1.f328201e;
            ml2.q1 q1Var = ml2.q1.f327812e;
            zy2.zb.Kh(zbVar, recyclerView, x1Var, "temp_9", ml2.y.f328240e, 0, 0L, 0, 112, null);
            return;
        }
        if (i17 != 3) {
            if (i17 != 4) {
                return;
            }
            i95.m c18 = i95.n0.c(zy2.zb.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            zy2.zb zbVar2 = (zy2.zb) c18;
            ((ml2.j0) ((zy2.zb) i95.n0.c(zy2.zb.class))).getClass();
            java.lang.ref.WeakReference weakReference2 = ml2.j0.f327583i.f328287a0;
            zy2.zb.Kh(zbVar2, weakReference2 != null ? (androidx.recyclerview.widget.RecyclerView) weakReference2.get() : null, ml2.x1.f328203g, "20", ml2.y.f328240e, 0, 0L, 0, 112, null);
            return;
        }
        i95.m c19 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c19, "getService(...)");
        zy2.zb zbVar3 = (zy2.zb) c19;
        ((ml2.j0) ((zy2.zb) i95.n0.c(zy2.zb.class))).getClass();
        java.lang.ref.WeakReference weakReference3 = ml2.j0.f327583i.f328287a0;
        recyclerView = weakReference3 != null ? (androidx.recyclerview.widget.RecyclerView) weakReference3.get() : null;
        ml2.x1 x1Var2 = ml2.x1.f328201e;
        ml2.q1 q1Var2 = ml2.q1.f327812e;
        zy2.zb.Kh(zbVar3, recyclerView, x1Var2, "temp_1", ml2.y.f328240e, 0, 0L, 0, 112, null);
    }

    public final void d7() {
        ey2.o0 N6 = ((ey2.t0) pf5.u.f353936a.e(c61.l7.class).a(ey2.t0.class)).N6(4);
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127636c7).getValue()).r()).intValue() == 1 && N6.f257452l) {
            N6.f257452l = false;
            com.tencent.mars.xlog.Log.i("Finder.HomeUIC", "[resetAppPushFlag] stateCache=" + N6.hashCode() + " reset isAtAppPush");
        }
    }

    public final void e7(int i17) {
        int W6 = W6(i17);
        boolean z17 = false;
        if (W6 >= 0 && W6 < this.fragments.size()) {
            z17 = true;
        }
        if (z17) {
            ey2.t0 t0Var = this.f133574n;
            t0Var.f257510p = (1 << W6) | t0Var.f257510p;
        }
    }

    public final void f7(int i17, android.os.Bundle bundle) {
        int W6 = W6(i17);
        boolean z17 = false;
        if (W6 >= 0 && W6 < this.fragments.size()) {
            z17 = true;
        }
        if (z17) {
            if (bundle != null) {
                this.fragments.get(W6).f129268s = bundle;
            }
            ey2.t0 t0Var = this.f133574n;
            t0Var.f257507m = i17;
            t0Var.f257508n = i17;
            X6().f434697b.setCurrentItem(W6);
            t0Var.f257509o = (1 << W6) | t0Var.f257509o;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setCurrentTabType type=");
        sb6.append(i17);
        sb6.append(",source=");
        sb6.append(bundle != null ? java.lang.Integer.valueOf(bundle.getInt("Source")) : null);
        sb6.append(",target index=");
        sb6.append(W6);
        com.tencent.mars.xlog.Log.i("Finder.HomeUIC", sb6.toString());
    }

    public final void g7(int i17, boolean z17, android.os.Bundle bundle) {
        int W6 = W6(i17);
        boolean z18 = false;
        if (W6 >= 0 && W6 < this.fragments.size()) {
            z18 = true;
        }
        if (z18) {
            if (bundle != null) {
                this.fragments.get(W6).f129268s = bundle;
            }
            ey2.t0 t0Var = this.f133574n;
            t0Var.f257507m = i17;
            t0Var.f257508n = i17;
            X6().f434697b.setCurrentItem(W6, z17);
            t0Var.f257509o |= 1 << W6;
        }
    }

    public final com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment getActiveFragment() {
        com.tencent.mm.plugin.finder.view.FinderViewPager viewPager = X6().f434697b;
        kotlin.jvm.internal.o.f(viewPager, "viewPager");
        com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment = this.fragments.get(viewPager.getCurrentItem());
        kotlin.jvm.internal.o.f(finderHomeTabFragment, "get(...)");
        return finderHomeTabFragment;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ak_;
    }

    public final void h7() {
        for (com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment fragment : this.fragments) {
            kotlin.jvm.internal.o.g(fragment, "fragment");
            pf5.z zVar = pf5.z.f353948a;
            com.tencent.mm.plugin.finder.viewmodel.component.t80 t80Var = (com.tencent.mm.plugin.finder.viewmodel.component.t80) zVar.b(fragment).e(com.tencent.mm.plugin.finder.viewmodel.component.t80.class);
            if (t80Var != null) {
                com.tencent.mm.plugin.finder.feed.ct ctVar = t80Var.f135995e;
                if (ctVar == null) {
                    kotlin.jvm.internal.o.o("viewCallback");
                    throw null;
                }
                com.tencent.mm.plugin.finder.feed.ct.i(ctVar, 150L, false, false, null, 12, null);
            }
            com.tencent.mm.plugin.finder.viewmodel.component.k90 k90Var = (com.tencent.mm.plugin.finder.viewmodel.component.k90) zVar.b(fragment).e(com.tencent.mm.plugin.finder.viewmodel.component.k90.class);
            if (k90Var != null) {
                com.tencent.mm.plugin.finder.feed.xa xaVar = k90Var.f134939f;
                if (xaVar == null) {
                    kotlin.jvm.internal.o.o("viewCallback");
                    throw null;
                }
                xaVar.f106180m.postDelayed(new com.tencent.mm.plugin.finder.feed.qa(xaVar, false), 150L);
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onBeforeFinish(android.content.Intent intent) {
        boolean z17;
        super.onBeforeFinish(intent);
        com.tencent.mm.plugin.finder.storage.aj0 aj0Var = com.tencent.mm.plugin.finder.storage.aj0.f126440a;
        com.tencent.mm.plugin.finder.storage.z70 z70Var = com.tencent.mm.plugin.finder.storage.z70.f128432a;
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        e42.c0 c0Var = e42.c0.clicfg_finder_dispose_red_dot_when_finish_activity;
        boolean z18 = false;
        if (((java.lang.Boolean) t70Var.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            z17 = false;
        }
        if (z17) {
            z18 = true;
        } else {
            kb2.b bVar = kb2.b.f306225a;
        }
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.z70.f(z70Var, t70Var, "退出视频号时兜底消红点时机提前到Finish Activity", c0Var, java.lang.Boolean.valueOf(z18), false, com.tencent.mm.plugin.finder.storage.ld0.f127131d, 8, null)).booleanValue()) {
            i95.m c17 = i95.n0.c(c61.l7.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.mm.plugin.finder.extension.reddot.x2 x2Var = (com.tencent.mm.plugin.finder.extension.reddot.x2) ((c61.l7) c17).nk();
            if (x2Var.f105976d) {
                x2Var.N("FinderEntrance");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x027e  */
    @Override // com.tencent.mm.ui.component.UIComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r37) {
        /*
            Method dump skipped, instructions count: 1499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        boolean z17;
        boolean z18;
        super.onCreateAfter(bundle);
        if (getIntent().getBooleanExtra("KEY_POST_DIRECTLY_FROM_SNS", false) || getIntent().getBooleanExtra("KEY_FROM_SHARE_REL", false)) {
            java.lang.String stringExtra = getIntent().getStringExtra("key_context_id");
            com.tencent.mm.plugin.finder.extension.reddot.ga.e(com.tencent.mm.plugin.finder.extension.reddot.ha.f105557a, stringExtra == null ? "" : stringExtra, 1, getIntent().getIntExtra("key_auto_trigger_type", 0), null, 8, null);
        }
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = this.f133580t;
        if (jbVar == null) {
            com.tencent.mm.plugin.finder.storage.aj0 aj0Var = com.tencent.mm.plugin.finder.storage.aj0.f126440a;
            com.tencent.mm.plugin.finder.storage.z70 z70Var = com.tencent.mm.plugin.finder.storage.z70.f128432a;
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            e42.c0 c0Var = e42.c0.clicfg_finder_red_dot_fix_finder_sync_ctrl_info_null;
            if (((java.lang.Boolean) t70Var.o0().r()).booleanValue()) {
                z17 = true;
            } else {
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                z17 = false;
            }
            if (z17) {
                z18 = true;
            } else {
                kb2.b bVar = kb2.b.f306225a;
                z18 = false;
            }
            if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.z70.f(z70Var, t70Var, "修复FinderSync透传ctrl_info为空的问题", c0Var, java.lang.Boolean.valueOf(z18), false, com.tencent.mm.plugin.finder.storage.fg0.f126775d, 8, null)).booleanValue()) {
                com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("FinderEntrance");
                jbVar = L0 != null ? L0.u1() : null;
            } else {
                jbVar = ((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("FinderEntrance");
            }
        }
        this.f133580t = jbVar;
        ((c61.l7) i95.n0.c(c61.l7.class)).nk().n(getIntent().getIntExtra("FROM_SCENE_KEY", 2), (getIntent().getFlags() & 1048576) > 0);
        java.lang.String stringExtra2 = getIntent().getStringExtra("KEY_TASK_ID");
        if (!(stringExtra2 == null || stringExtra2.length() == 0)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(23669, stringExtra2, "finder_home_ui_create_after", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), "", 1, 1);
        }
        ya2.t1 t1Var = new ya2.t1(null, null, null, null, null, 31, null);
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar2 = this.f133580t;
        java.lang.String str2 = jbVar2 != null ? jbVar2.field_tipsId : null;
        t1Var.f460538a = str2 != null ? str2 : "";
        if (jbVar2 != null && jbVar2.field_ctrInfo != null) {
            ya2.w1.a(t1Var.f460539b, jbVar2);
        }
        com.tencent.mm.plugin.finder.storage.t70 t70Var2 = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127764j3).getValue()).r()).intValue() == 1) {
            ic2.l0 l0Var = ((c61.l7) i95.n0.c(c61.l7.class)).P;
            android.app.Activity context = getContext();
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            l0Var.f(826260477, 7, nyVar != null ? nyVar.V6() : null, t1Var);
        } else {
            ic2.l0 l0Var2 = ((c61.l7) i95.n0.c(c61.l7.class)).P;
            android.app.Activity context2 = getContext();
            kotlin.jvm.internal.o.g(context2, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = context2 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            l0Var2.f(826259965, 7, nyVar2 != null ? nyVar2.V6() : null, t1Var);
        }
        if (kotlin.jvm.internal.o.b(getActivity().getIntent().getStringExtra("KEY_FROM_PATH"), "FinderEntrance")) {
            ey2.z1 z1Var = (ey2.z1) pf5.u.f353936a.e(c61.l7.class).a(ey2.z1.class);
            if (z1Var.f257595h) {
                com.tencent.mars.xlog.Log.i("Finder.RedDotSessionVM", "[clickFinderEntrance] isClickedFinderEntrance=" + z1Var.f257596i + ",inFinder=" + z1Var.f257597m + ",pendingRedDotSessionEx=" + z1Var.f257592e);
                if (z1Var.f257597m) {
                    z1Var.f257592e = null;
                }
                z1Var.f257596i = true;
                z1Var.f257597m = true;
                z1Var.V6(null);
                z1Var.T6(2);
                z1Var.S6(z1Var.P6(2));
                z1Var.N6().f257352k = java.lang.System.currentTimeMillis();
            }
        }
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar3 = this.f133580t;
        if (jbVar3 != null) {
            r45.xs2 xs2Var = jbVar3.N;
            if (xs2Var.getLong(3) != 0) {
                com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                long j17 = xs2Var.getLong(3);
                com.tencent.mm.protobuf.g byteString = xs2Var.getByteString(7);
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = o3Var.f125212h;
                if (byteString != null) {
                    concurrentHashMap.put(pm0.v.u(j17), byteString);
                } else {
                    concurrentHashMap.remove(pm0.v.u(j17));
                }
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        d7();
        ey2.t0 t0Var = this.f133574n;
        int i17 = t0Var.f257507m;
        if (i17 == 1) {
            i95.m c17 = i95.n0.c(zy2.zb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.x1 x1Var = ml2.x1.f328201e;
            ml2.q1 q1Var = ml2.q1.f327812e;
            zy2.zb.Kh(zbVar, null, x1Var, "temp_9", ml2.y.f328244i, 0, 0L, 0, 112, null);
        } else if (i17 == 3) {
            i95.m c18 = i95.n0.c(zy2.zb.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            zy2.zb zbVar2 = (zy2.zb) c18;
            ml2.x1 x1Var2 = ml2.x1.f328201e;
            ml2.q1 q1Var2 = ml2.q1.f327812e;
            zy2.zb.Kh(zbVar2, null, x1Var2, "temp_1", ml2.y.f328244i, 0, 0L, 0, 112, null);
        }
        if ((!this.f133569f || getActiveFragment().f129265p != 4) && !this.f133570g) {
            t0Var.W6(getActiveFragment().f129265p, ey2.p0.f257463d);
        }
        if (this.f133569f) {
            t0Var.N6(4).a(ey2.q0.f257471d);
        }
        this.f133577q.dead();
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.U3).getValue()).r()).booleanValue()) {
            this.f133578r.dead();
        }
        so2.h3.f410392d.m();
        ((ey2.r1) pf5.u.f353936a.e(c61.l7.class).a(ey2.r1.class)).f257490e.clear();
        ((c61.l7) i95.n0.c(c61.l7.class)).nk().p0();
        if (!com.tencent.mm.plugin.finder.report.y0.f125442a.a()) {
            com.tencent.mm.plugin.finder.report.y0.f125443b = false;
            com.tencent.mm.plugin.finder.report.y0.f125444c = true;
            com.tencent.mm.plugin.finder.report.y0.f125445d = 0;
            com.tencent.mm.plugin.finder.report.y0.f125446e = 0;
            com.tencent.mm.plugin.finder.report.y0.f125447f.clear();
            com.tencent.mm.plugin.finder.report.y0.f125448g.clear();
        }
        ((uh4.c0) i95.n0.c(uh4.c0.class)).tc(this.f133583w);
        pm0.v.K(null, com.tencent.mm.plugin.finder.viewmodel.component.kl.f134972d);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onFinished() {
        super.onFinished();
        boolean b17 = kotlin.jvm.internal.o.b(getActivity().getIntent().getStringExtra("KEY_FROM_PATH"), "FinderEntrance");
        pf5.u uVar = pf5.u.f353936a;
        if (b17) {
            ey2.z1 z1Var = (ey2.z1) uVar.e(c61.l7.class).a(ey2.z1.class);
            if (z1Var.f257595h) {
                z1Var.f257597m = false;
                ey2.d3 N6 = z1Var.N6();
                N6.f257342a.set(4, java.lang.Integer.valueOf((int) ((java.lang.System.currentTimeMillis() - N6.f257352k) / 1000)));
                z1Var.S6(z1Var.P6(3));
            }
        }
        ey2.h hVar = (ey2.h) uVar.e(c61.l7.class).a(ey2.h.class);
        if (hVar.f257383f != 0) {
            hVar.N6();
        }
        d7();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        super.onPause();
        ey2.t0 t0Var = this.f133574n;
        int i17 = t0Var.f257507m;
        if (i17 == 1) {
            i95.m c17 = i95.n0.c(zy2.zb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ((ml2.j0) ((zy2.zb) i95.n0.c(zy2.zb.class))).getClass();
            java.lang.ref.WeakReference weakReference = ml2.j0.f327583i.f328287a0;
            recyclerView = weakReference != null ? (androidx.recyclerview.widget.RecyclerView) weakReference.get() : null;
            ml2.x1 x1Var = ml2.x1.f328201e;
            ml2.q1 q1Var = ml2.q1.f327812e;
            zy2.zb.Kh(zbVar, recyclerView, x1Var, "temp_9", ml2.y.f328241f, 0, 0L, 0, 112, null);
        } else if (i17 == 3) {
            i95.m c18 = i95.n0.c(zy2.zb.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            zy2.zb zbVar2 = (zy2.zb) c18;
            ((ml2.j0) ((zy2.zb) i95.n0.c(zy2.zb.class))).getClass();
            java.lang.ref.WeakReference weakReference2 = ml2.j0.f327583i.f328287a0;
            recyclerView = weakReference2 != null ? (androidx.recyclerview.widget.RecyclerView) weakReference2.get() : null;
            ml2.x1 x1Var2 = ml2.x1.f328201e;
            ml2.q1 q1Var2 = ml2.q1.f327812e;
            zy2.zb.Kh(zbVar2, recyclerView, x1Var2, "temp_1", ml2.y.f328241f, 0, 0L, 0, 112, null);
        } else if (i17 == 4) {
            i95.m c19 = i95.n0.c(zy2.zb.class);
            kotlin.jvm.internal.o.f(c19, "getService(...)");
            zy2.zb zbVar3 = (zy2.zb) c19;
            ((ml2.j0) ((zy2.zb) i95.n0.c(zy2.zb.class))).getClass();
            java.lang.ref.WeakReference weakReference3 = ml2.j0.f327583i.f328287a0;
            zy2.zb.Kh(zbVar3, weakReference3 != null ? (androidx.recyclerview.widget.RecyclerView) weakReference3.get() : null, ml2.x1.f328203g, "20", ml2.y.f328241f, 0, 0L, 0, 112, null);
        }
        com.tencent.mm.plugin.finder.report.y0 y0Var = com.tencent.mm.plugin.finder.report.y0.f125442a;
        android.app.Activity context = getContext();
        int i18 = t0Var.f257507m;
        kotlin.jvm.internal.o.g(context, "context");
        if (y0Var.a()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.HomeActionReporter", "[onLeavePage] tabType:" + i18);
        com.tencent.mm.plugin.finder.report.y0.f125446e = i18;
        com.tencent.mm.plugin.finder.report.y0.f125443b = false;
        y0Var.h(i18, 2, false);
        y0Var.g(context, i18, new jz5.l(2, 1), true);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        boolean z17 = this.f133582v;
        ey2.t0 t0Var = this.f133574n;
        if (z17) {
            com.tencent.mm.plugin.finder.report.v1 v1Var = com.tencent.mm.plugin.finder.report.v1.f125393a;
            int i17 = t0Var.f257507m;
            com.tencent.mm.plugin.finder.view.FinderViewPager viewPager = X6().f434697b;
            kotlin.jvm.internal.o.f(viewPager, "viewPager");
            viewPager.post(new com.tencent.mm.plugin.finder.report.u1(i17));
            this.f133582v = false;
        }
        com.tencent.mars.comm.NetStatusUtil.isMobile(com.tencent.mm.sdk.platformtools.x2.f193071a);
        new android.content.IntentFilter().addAction(io.flutter.plugins.connectivity.patched.PatchedConnectivityBroadcastReceiver.CONNECTIVITY_ACTION);
        if (((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).Ai()) {
            com.tencent.mars.xlog.Log.i("Finder.HomeUIC", "onResume: isTeenModeAndViewNothing finish, isMultiTaskOpen = " + (getActivity() instanceof com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI));
            if (getActivity() instanceof com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI) {
                getActivity().finishAndRemoveTask();
            } else {
                getActivity().finish();
            }
        }
        if (((java.lang.Number) ae2.in.f3688a.u().r()).intValue() == 1) {
            X6().f434697b.post(new com.tencent.mm.plugin.finder.viewmodel.component.nl(this));
        } else {
            c7();
        }
        com.tencent.mm.plugin.finder.report.y0 y0Var = com.tencent.mm.plugin.finder.report.y0.f125442a;
        android.app.Activity context = getContext();
        int i18 = t0Var.f257507m;
        kotlin.jvm.internal.o.g(context, "context");
        if (!y0Var.a()) {
            com.tencent.mars.xlog.Log.i("Finder.HomeActionReporter", "[onEnterPage] tabType:" + i18);
            com.tencent.mm.plugin.finder.report.y0.f125445d = i18;
            com.tencent.mm.plugin.finder.report.y0.f125446e = i18;
            com.tencent.mm.plugin.finder.report.y0.f125443b = true;
            y0Var.h(i18, 1, false);
            y0Var.g(context, i18, new jz5.l(1, 0), false);
        }
        boolean z18 = this.f133567d && ((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).wi();
        if (z18 || this.f133568e) {
            com.tencent.mars.xlog.Log.i("Finder.HomeUIC", "onResume: autoFlingToRefresh, teenModeBack=" + z18 + ", elderlyModeBack=" + this.f133568e);
            h7();
        }
        this.f133567d = false;
        this.f133568e = false;
        pf5.e.launch$default(this, null, null, new com.tencent.mm.plugin.finder.viewmodel.component.ll(this, null), 3, null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStop() {
        super.onStop();
        if (getActivity().isFinishing()) {
            ((c61.l7) i95.n0.c(c61.l7.class)).nk().M0(getActivity());
        }
        if (getActiveFragment().mo133getLifecycle().b().a(androidx.lifecycle.n.CREATED)) {
            boolean z17 = this.f133569f;
            ey2.t0 t0Var = this.f133574n;
            if (!z17 || getActiveFragment().f129265p != 4) {
                t0Var.T6(getActiveFragment().f129265p);
                return;
            }
            ey2.o0 N6 = t0Var.N6(getActiveFragment().f129265p);
            N6.a(ey2.q0.f257475h);
            N6.f257449i = java.lang.System.currentTimeMillis();
        }
    }
}
