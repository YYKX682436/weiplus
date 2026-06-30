package fe2;

/* loaded from: classes3.dex */
public final class q extends com.tencent.mm.plugin.finder.live.plugin.l {
    public final int A;
    public int B;
    public boolean C;
    public final androidx.lifecycle.k0 D;
    public final androidx.lifecycle.k0 E;
    public final fe2.n F;
    public final fe2.p G;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f261525p;

    /* renamed from: q, reason: collision with root package name */
    public final qo0.c f261526q;

    /* renamed from: r, reason: collision with root package name */
    public final android.view.ViewGroup f261527r;

    /* renamed from: s, reason: collision with root package name */
    public final com.google.android.material.tabs.TabLayout f261528s;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.box.viewpager.FinderLiveBoxViewPager f261529t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.plugin.mg f261530u;

    /* renamed from: v, reason: collision with root package name */
    public final he2.h f261531v;

    /* renamed from: w, reason: collision with root package name */
    public he2.f f261532w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f261533x;

    /* renamed from: y, reason: collision with root package name */
    public int f261534y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f261535z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.tencent.mm.ui.MMActivity context, android.view.ViewGroup root, qo0.c statusMonitor, android.view.ViewGroup viewGroup) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f261525p = context;
        this.f261526q = statusMonitor;
        this.f261527r = viewGroup;
        this.f261528s = (com.google.android.material.tabs.TabLayout) root.findViewById(com.tencent.mm.R.id.nv8);
        this.f261529t = (com.tencent.mm.plugin.finder.live.box.viewpager.FinderLiveBoxViewPager) root.findViewById(com.tencent.mm.R.id.c8a);
        this.f261531v = new he2.h(context, S0(), statusMonitor, this);
        this.f261533x = true;
        this.f261534y = i65.a.b(context, 240);
        this.A = (int) com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479667c4);
        this.B = 2;
        this.D = new fe2.j(this);
        this.E = new fe2.l(this);
        K0(8);
        this.F = new fe2.n();
        this.G = new fe2.p(this);
    }

    public final void A1() {
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData;
        if (this.C) {
            return;
        }
        this.C = true;
        df2.a9 a9Var = (df2.a9) U0(df2.a9.class);
        if (a9Var == null || (liveMutableData = a9Var.A) == null) {
            return;
        }
        liveMutableData.observe(this, new fe2.k(this));
    }

    public final void B1() {
        he2.h hVar = this.f261531v;
        java.util.Iterator it = hVar.f280898e.iterator();
        boolean z17 = false;
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            } else if (((ee2.a) it.next()).f251583g instanceof com.tencent.mm.plugin.finder.live.plugin.vk0) {
                break;
            } else {
                i17++;
            }
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        int intValue = valueOf.intValue();
        if (intValue >= 0 && intValue < hVar.f280898e.size()) {
            z17 = true;
        }
        if (!z17) {
            valueOf = null;
        }
        if (valueOf != null) {
            this.B = valueOf.intValue();
        }
    }

    public final void C1() {
        oa.i k17 = this.f261528s.k(this.B);
        java.lang.Object obj = k17 != null ? k17.f343778a : null;
        he2.e eVar = obj instanceof he2.e ? (he2.e) obj : null;
        if (eVar != null) {
            android.widget.ImageView imageView = eVar.f280890d;
            if (imageView != null && imageView.getVisibility() == 0) {
                return;
            }
            eVar.c(true);
            r45.t12 t12Var = new r45.t12();
            t12Var.set(3, 100002);
            t12Var.set(2, this.f261525p.getString(com.tencent.mm.R.string.mox));
            t12Var.set(15, java.lang.Boolean.TRUE);
            t12Var.set(16, 1);
            ((mm2.x4) P0(mm2.x4.class)).f329534o.add(new dk2.mf(t12Var));
        }
    }

    public final void D1() {
        java.lang.String str;
        java.lang.String str2;
        df2.nw nwVar = df2.xw.f231808w;
        df2.xw xwVar = (df2.xw) U0(df2.xw.class);
        if (xwVar != null) {
            str = xwVar.f231810n;
            if (str == null) {
                str = "";
            }
        } else {
            str = null;
        }
        nwVar.a(6, kz5.b1.e(new jz5.l("sessionid", java.lang.String.valueOf(str))));
        int i17 = this.B;
        com.google.android.material.tabs.TabLayout tabLayout = this.f261528s;
        oa.i k17 = tabLayout.k(i17);
        if (k17 != null && !k17.a()) {
            k17.b();
        }
        oa.i k18 = tabLayout.k(this.B);
        java.lang.Object obj = k18 != null ? k18.f343778a : null;
        he2.e eVar = obj instanceof he2.e ? (he2.e) obj : null;
        if (eVar != null) {
            eVar.c(false);
        }
        com.tencent.mm.plugin.finder.live.box.viewpager.FinderLiveBoxViewPager finderLiveBoxViewPager = this.f261529t;
        int currentItem = finderLiveBoxViewPager.getCurrentItem();
        int i18 = this.B;
        if (currentItem != i18) {
            finderLiveBoxViewPager.setCurrentItem(i18);
        }
        df2.xw xwVar2 = (df2.xw) U0(df2.xw.class);
        if (xwVar2 != null && (str2 = xwVar2.f231810n) != null) {
            qo2.e d76 = xwVar2.d7();
            d76.getClass();
            java.lang.String concat = "[updateMsgRead] sessionId = ".concat(str2);
            java.lang.String str3 = d76.f365580b;
            com.tencent.mars.xlog.Log.i(str3, concat);
            try {
                so0.c cVar = new so0.c();
                cVar.f410211h = java.lang.Boolean.TRUE;
                com.tencent.wcdb.core.Table table = d76.f365582d;
                if (table == null) {
                    kotlin.jvm.internal.o.o("msgTable");
                    throw null;
                }
                com.tencent.wcdb.orm.Field field = so0.a.f410191j;
                table.updateObject((com.tencent.wcdb.core.Table) cVar, (com.tencent.wcdb.orm.Field<com.tencent.wcdb.core.Table>) field, so0.a.f410185d.eq(str2).and(field.eq(false)));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.i(str3, "[updateMsgRead] e:" + e17.getMessage());
            }
        }
        mm2.e0 e0Var = (mm2.e0) P0(mm2.e0.class);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("LiveBoxSlice enterShopMsgBox: ");
        r45.qm1 qm1Var = (r45.qm1) e0Var.f328970m.getValue();
        sb6.append(qm1Var != null ? qm1Var.getString(1) : null);
        java.lang.String str4 = sb6.toString();
        kotlin.jvm.internal.o.g(str4, "str");
        com.tencent.mars.xlog.Log.i("Finder.LiveBoxSlice", "mainFlowLog ".concat(str4));
        r45.qm1 qm1Var2 = (r45.qm1) e0Var.f328970m.getValue();
        if (!(qm1Var2 != null && qm1Var2.getInteger(0) == 2)) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("LiveBoxSlice stopPollingMsg: ");
            r45.qm1 qm1Var3 = (r45.qm1) e0Var.f328970m.getValue();
            sb7.append(qm1Var3 != null ? qm1Var3.getString(1) : null);
            java.lang.String str5 = sb7.toString();
            kotlin.jvm.internal.o.g(str5, "str");
            com.tencent.mars.xlog.Log.i("Finder.LiveBoxSlice", "mainFlowLog ".concat(str5));
            lm2.h0 h0Var = e0Var.f328976s;
            if (h0Var != null) {
                com.tencent.mars.xlog.Log.i("Finder.BoxDataStore", "stopPollingMsg");
                km2.m0 m0Var = h0Var.f319400g;
                if (m0Var != null) {
                    kotlinx.coroutines.r2 r2Var = m0Var.f309146d;
                    if (r2Var != null) {
                        kotlinx.coroutines.p2.a(r2Var, null, 1, null);
                    }
                    m0Var.f309146d = null;
                }
            }
            r45.qm1 qm1Var4 = new r45.qm1();
            qm1Var4.set(0, 2);
            qm1Var4.set(1, "shopbox-" + ((mm2.e1) e0Var.business(mm2.e1.class)).f328988r.getLong(0));
            e0Var.f328970m.setValue(qm1Var4);
            e0Var.f328971n = 0L;
        }
        qo0.b bVar = qo0.b.f365375k5;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("isShow", true);
        this.f261526q.statusChange(bVar, bundle);
    }

    public final void E1(int i17) {
        com.tencent.mars.xlog.Log.i("FinderLiveViewPagerComm", "switchTabLayoutAndViewPager " + i17);
        oa.i k17 = this.f261528s.k(i17);
        if (k17 != null && !k17.a()) {
            k17.b();
        }
        com.tencent.mm.plugin.finder.live.box.viewpager.FinderLiveBoxViewPager finderLiveBoxViewPager = this.f261529t;
        if (finderLiveBoxViewPager.getCurrentItem() != i17) {
            finderLiveBoxViewPager.setCurrentItem(i17);
        }
        if (i17 != 1) {
            mm2.e0 e0Var = (mm2.e0) P0(mm2.e0.class);
            com.tencent.mars.xlog.Log.i("Finder.LiveBoxSlice", "redDotFlowLog ".concat("resumeRedDotPolling"));
            lm2.h0 h0Var = e0Var.f328976s;
            if (h0Var == null) {
                return;
            }
            h0Var.f319399f = true;
            return;
        }
        mm2.e0 e0Var2 = (mm2.e0) P0(mm2.e0.class);
        com.tencent.mars.xlog.Log.i("Finder.LiveBoxSlice", "redDotFlowLog ".concat("pauseRedDotPolling"));
        lm2.h0 h0Var2 = e0Var2.f328976s;
        if (h0Var2 != null) {
            h0Var2.f319399f = false;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveViewPagerComm", "redDotFlowLog ".concat("dismiss reddot"));
        lm2.h0 h0Var3 = ((mm2.e0) P0(mm2.e0.class)).f328976s;
        androidx.lifecycle.j0 j0Var = h0Var3 != null ? h0Var3.f319398e : null;
        if (j0Var != null) {
            mm2.y yVar = mm2.y.f329547d;
            java.lang.Object value = j0Var.getValue();
            if (value != null) {
                yVar.invoke(value);
                j0Var.setValue(value);
            }
        }
    }

    public final void F1() {
        E1(0);
        com.tencent.mm.plugin.finder.live.plugin.tb tbVar = (com.tencent.mm.plugin.finder.live.plugin.tb) X0(com.tencent.mm.plugin.finder.live.plugin.tb.class);
        if (tbVar == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveViewPagerComm", "mainFlowLog ".concat("status FINDER_LIVE_SWITCH_BOX false"));
        qo0.b bVar = qo0.b.f365375k5;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("isShow", false);
        this.f261526q.statusChange(bVar, bundle);
        tbVar.w1();
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    public final void G1(java.lang.String src) {
        kotlin.jvm.internal.o.g(src, "src");
        com.tencent.mars.xlog.Log.i("FinderLiveViewPagerComm", src.concat(" switchToPublicForDanmaku"));
        r45.qm1 qm1Var = (r45.qm1) ((mm2.e0) P0(mm2.e0.class)).f328970m.getValue();
        boolean z17 = false;
        if (qm1Var != null) {
            int integer = qm1Var.getInteger(0);
            int i17 = qs5.v.f366472a;
            if (integer == 1) {
                z17 = true;
            }
        }
        if (z17) {
            android.view.ViewGroup viewGroup = this.f365323d;
            db5.t7.m(viewGroup.getContext(), viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.d7z));
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", 6);
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.r0.hj((ml2.r0) c17, ml2.b4.V1, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
        }
        w1("switchToPublicForDanmaku");
    }

    public final void H1(android.os.Bundle bundle) {
        this.f261531v.a(bundle);
        u1();
        he2.f fVar = this.f261532w;
        if (fVar != null) {
            fVar.a();
        }
        he2.f fVar2 = this.f261532w;
        if (fVar2 != null) {
            fVar2.notifyDataSetChanged();
        }
        I1();
        B1();
    }

    public final void I1() {
        boolean z17;
        java.lang.CharSequence charSequence;
        com.google.android.material.tabs.TabLayout tabLayout = this.f261528s;
        int selectedTabPosition = tabLayout.getSelectedTabPosition();
        tabLayout.n();
        java.util.Iterator it = this.f261531v.f280898e.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                x1(null);
                return;
            }
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            ee2.a aVar = (ee2.a) next;
            oa.i l17 = tabLayout.l();
            boolean z18 = true;
            java.lang.Integer num = 1;
            java.lang.Integer num2 = num.intValue() == 0 ? num : null;
            he2.e eVar = new he2.e(l17, num2 != null ? num2.intValue() : 2, new fe2.o(aVar, this));
            java.lang.String title = aVar.f251581e;
            kotlin.jvm.internal.o.g(title, "title");
            android.widget.TextView textView = eVar.f280889c;
            if (textView == null) {
                z17 = false;
            } else if ((eVar.f280888b == 0 && kotlin.jvm.internal.o.b(title, textView.getContext().getString(com.tencent.mm.R.string.dg7))) || kotlin.jvm.internal.o.b(title, textView.getContext().getString(com.tencent.mm.R.string.f491539dg4)) || kotlin.jvm.internal.o.b(title, textView.getContext().getString(com.tencent.mm.R.string.mol))) {
                z17 = false;
                textView.setText(title);
            } else {
                android.content.Context context = textView.getContext();
                java.lang.Object[] objArr = new java.lang.Object[1];
                int i19 = j65.f.f297943g <= 1.0f ? 6 : 2;
                android.content.Context context2 = textView.getContext();
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                int b17 = i65.a.b(context2, (i19 * 15) + 1);
                android.content.Context context3 = textView.getContext();
                kotlin.jvm.internal.o.f(context3, "getContext(...)");
                int b18 = i65.a.b(context3, ((i19 + 1) * 15) + 1);
                android.text.StaticLayout staticLayout = new android.text.StaticLayout(title, 0, title.length(), textView.getPaint(), b17, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
                if (new android.text.StaticLayout(title, 0, title.length(), textView.getPaint(), b18, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount() <= 1) {
                    z17 = false;
                    charSequence = title;
                } else {
                    z17 = false;
                    int lineEnd = staticLayout.getLineEnd(0);
                    le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                    android.content.Context context4 = textView.getContext();
                    java.lang.String substring = title.toString().substring(0, lineEnd);
                    kotlin.jvm.internal.o.f(substring, "substring(...)");
                    java.lang.String concat = substring.concat("...");
                    ((ke0.e) xVar).getClass();
                    charSequence = com.tencent.mm.pluginsdk.ui.span.c0.i(context4, concat);
                }
                objArr[z17 ? 1 : 0] = charSequence;
                textView.setText(context.getString(com.tencent.mm.R.string.dg_, objArr));
            }
            eVar.f280888b = i17;
            if (i17 != selectedTabPosition) {
                z18 = z17;
            }
            tabLayout.d(eVar.f280887a, z18);
            i17 = i18;
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void K0(int i17) {
        if (!((mm2.j2) P0(mm2.j2.class)).O6(x0())) {
            super.K0(i17);
            return;
        }
        super.K0(8);
        this.f113327i = i17;
        com.tencent.mars.xlog.Log.i("FinderLiveViewPagerComm", "danmaku intercept visible:" + i17);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        int ordinal = status.ordinal();
        com.tencent.mm.plugin.finder.assist.o0 o0Var = com.tencent.mm.plugin.finder.assist.o0.f102420a;
        if (ordinal == 41) {
            if (!o0Var.a(S0())) {
                df2.xw xwVar = (df2.xw) U0(df2.xw.class);
                if (!(xwVar != null && xwVar.e7())) {
                    return;
                }
            }
            boolean z17 = bundle != null ? bundle.getBoolean("PARAM_IS_ENTERING_COMMENT") : false;
            x1(java.lang.Boolean.valueOf(z17));
            boolean z18 = !z17;
            this.f261533x = z18;
            com.tencent.mm.plugin.finder.live.box.viewpager.FinderLiveBoxViewPager finderLiveBoxViewPager = this.f261529t;
            finderLiveBoxViewPager.setCanScroll(z18);
            finderLiveBoxViewPager.setEventTransferOnCantScroll(z17 ? new fe2.m(this) : null);
            return;
        }
        androidx.lifecycle.k0 k0Var = this.D;
        fe2.n nVar = this.F;
        com.google.android.material.tabs.TabLayout tabLayout = this.f261528s;
        qo0.c cVar = this.f261526q;
        if (ordinal == 246) {
            K0(0);
            t1(bundle);
            z1();
            I1();
            tabLayout.setTabIndicatorFullWidth(false);
            tabLayout.a(nVar);
            qo0.b bVar = qo0.b.f365375k5;
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putBoolean("isShow", false);
            cVar.statusChange(bVar, bundle2);
            F1();
            A1();
            oa.i k17 = tabLayout.k(tabLayout.getSelectedTabPosition());
            if (k17 != null) {
                oa.i iVar = k17.a() ^ true ? k17 : null;
                if (iVar != null) {
                    iVar.b();
                }
            }
            ((mm2.e0) P0(mm2.e0.class)).f328970m.removeObserver(k0Var);
            ((mm2.e0) P0(mm2.e0.class)).f328970m.observe(this, k0Var);
            if (bundle != null ? bundle.getBoolean("PARAM_FINDER_LIVE_SHOW_REDDOT_ON_BOX_TAB_INIT", false) : false) {
                C1();
                return;
            }
            return;
        }
        if (ordinal != 243) {
            if (ordinal == 244 && o0Var.a(S0())) {
                H1(bundle);
                return;
            }
            return;
        }
        K0(0);
        t1(bundle);
        z1();
        I1();
        tabLayout.setTabIndicatorFullWidth(false);
        tabLayout.a(nVar);
        java.lang.String str = "status FINDER_LIVE_SWITCH_BOX " + ((mm2.e0) P0(mm2.e0.class)).P6();
        kotlin.jvm.internal.o.g(str, "str");
        com.tencent.mars.xlog.Log.i("FinderLiveViewPagerComm", "mainFlowLog ".concat(str));
        qo0.b bVar2 = qo0.b.f365375k5;
        android.os.Bundle bundle3 = new android.os.Bundle();
        bundle3.putBoolean("isShow", ((mm2.e0) P0(mm2.e0.class)).P6());
        cVar.statusChange(bVar2, bundle3);
        this.f261535z = true;
        if (!((mm2.e0) P0(mm2.e0.class)).P6()) {
            com.tencent.mars.xlog.Log.i("FinderLiveViewPagerComm", "liveDataLog ".concat("curBoxObserver manually switchToPublic"));
            F1();
        } else if (((mm2.j2) P0(mm2.j2.class)).O6(x0())) {
            G1("initData");
        } else {
            mm2.g0 g0Var = (mm2.g0) P0(mm2.g0.class);
            if (((mm2.c1) g0Var.business(mm2.c1.class)).e8() && ((mm2.g0) g0Var.business(mm2.g0.class)).O6()) {
                com.tencent.mars.xlog.Log.i("FinderLiveViewPagerComm", "change to public for charge live");
                w1("initData");
            }
        }
        ((mm2.e0) P0(mm2.e0.class)).f328970m.removeObserver(k0Var);
        ((mm2.e0) P0(mm2.e0.class)).f328970m.observe(this, k0Var);
        lm2.h0 h0Var = ((mm2.e0) P0(mm2.e0.class)).f328976s;
        androidx.lifecycle.j0 j0Var = h0Var != null ? h0Var.f319398e : null;
        if (j0Var != null) {
            j0Var.observe(this, this.E);
        }
        A1();
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        super.O0();
        K0(8);
        this.f261533x = true;
        ge2.a.f270956b = "";
        this.f261528s.n();
        this.f261531v.f280898e.clear();
        he2.f fVar = this.f261532w;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
        this.C = false;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f328801f2 != 1;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return x0() || this.f261533x;
    }

    public final void t1(android.os.Bundle bundle) {
        android.view.View view;
        com.tencent.mm.plugin.finder.live.plugin.mg mgVar = this.f261530u;
        if (mgVar == null) {
            return;
        }
        kotlin.jvm.internal.o.d(mgVar);
        he2.h hVar = this.f261531v;
        hVar.getClass();
        java.util.ArrayList arrayList = hVar.f280898e;
        arrayList.clear();
        java.lang.String string = hVar.f280894a.getResources().getString(com.tencent.mm.R.string.dg7);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        arrayList.add(0, new ee2.a("", string, 0L, mgVar));
        hVar.a(bundle);
        B1();
        com.tencent.mars.xlog.Log.i("FinderLiveViewPagerComm", "adjustLayout");
        android.view.ViewGroup viewGroup = this.f365323d;
        android.view.ViewParent parent = viewGroup.getParent();
        kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup.LayoutParams layoutParams = ((android.widget.LinearLayout) ((android.view.ViewGroup) parent).findViewById(com.tencent.mm.R.id.f39)).getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.addRule(2, viewGroup.getId());
        }
        boolean z17 = pm0.v.z(((mm2.c1) P0(mm2.c1.class)).f328807g2, 8);
        com.tencent.mm.plugin.finder.live.plugin.mg mgVar2 = this.f261530u;
        if (mgVar2 != null) {
            mgVar2.K0(0);
        }
        com.tencent.mm.plugin.finder.live.box.viewpager.FinderLiveBoxViewPager finderLiveBoxViewPager = this.f261529t;
        if (!z17) {
            if (x0()) {
                android.view.ViewGroup.LayoutParams layoutParams3 = finderLiveBoxViewPager.getLayoutParams();
                if (layoutParams3 != null) {
                    int b17 = i65.a.b(this.f261525p, 50);
                    com.tencent.mm.plugin.finder.live.plugin.mg mgVar3 = this.f261530u;
                    int i17 = b17 + (mgVar3 != null ? mgVar3.f113502J : this.f261534y);
                    com.tencent.mars.xlog.Log.i("FinderLiveViewPagerComm", "adjustLayout commentHeight: " + i17);
                    layoutParams3.height = i17;
                    this.f261534y = i17;
                    com.tencent.mm.plugin.finder.live.plugin.me meVar = com.tencent.mm.plugin.finder.live.plugin.mg.f113495p0;
                    android.content.Context context = viewGroup.getContext();
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    layoutParams3.width = meVar.a(context);
                    android.view.ViewGroup.LayoutParams layoutParams4 = this.f261528s.getLayoutParams();
                    if (layoutParams4 != null) {
                        layoutParams4.width = layoutParams3.width;
                    }
                }
                zl2.r4.f473950a.e(this, true);
            }
            android.view.ViewGroup viewGroup2 = this.f261527r;
            if (viewGroup2 != null) {
                view = viewGroup2.findViewById(x0() ? com.tencent.mm.R.id.f484856fq4 : com.tencent.mm.R.id.tp9);
            } else {
                view = null;
            }
            android.view.ViewGroup.LayoutParams layoutParams5 = viewGroup.getLayoutParams();
            android.widget.RelativeLayout.LayoutParams layoutParams6 = layoutParams5 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams5 : null;
            if (layoutParams6 != null) {
                layoutParams6.removeRule(2);
                layoutParams6.addRule(2, view != null ? view.getId() : 0);
                layoutParams6.bottomMargin = 0;
            }
            u1();
        }
        finderLiveBoxViewPager.setOnSingleTouListener(fe2.i.f261517d);
    }

    public final void u1() {
        int i17 = com.tencent.mm.ui.bl.b(this.f365323d.getContext()).x;
        int size = this.f261531v.f280898e.size();
        com.tencent.mm.plugin.finder.live.box.viewpager.FinderLiveBoxViewPager finderLiveBoxViewPager = this.f261529t;
        if (size == 1) {
            android.view.ViewGroup.LayoutParams layoutParams = finderLiveBoxViewPager.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = -2;
                this.f261534y = -2;
                layoutParams.width = i17;
            }
        } else {
            android.view.ViewGroup.LayoutParams layoutParams2 = finderLiveBoxViewPager.getLayoutParams();
            if (layoutParams2 != null) {
                int b17 = i65.a.b(this.f261525p, 50);
                com.tencent.mm.plugin.finder.live.plugin.mg mgVar = this.f261530u;
                int i18 = b17 + (mgVar != null ? mgVar.f113502J : this.f261534y);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("adjustLayout commentHeight: ");
                sb6.append(i18);
                sb6.append(" , commentPlugin?.getMaxHeight():");
                com.tencent.mm.plugin.finder.live.plugin.mg mgVar2 = this.f261530u;
                sb6.append(mgVar2 != null ? java.lang.Integer.valueOf(mgVar2.f113502J) : null);
                sb6.append(", contentMaxHeight：");
                sb6.append(this.f261534y);
                com.tencent.mars.xlog.Log.i("FinderLiveViewPagerComm", sb6.toString());
                layoutParams2.height = i18;
                this.f261534y = i18;
                layoutParams2.width = i17;
            }
        }
        finderLiveBoxViewPager.setMaxHeight(this.f261534y);
        finderLiveBoxViewPager.requestLayout();
        he2.f fVar = this.f261532w;
        if (fVar == null) {
            return;
        }
        fVar.f280892e = this.f261534y;
    }

    public final void v1(java.lang.String boxId) {
        java.lang.String string;
        if (!this.f261535z) {
            ge2.a.f270955a.a(true);
        }
        this.f261535z = false;
        if (!(boxId == null || boxId.length() == 0)) {
            mm2.e0 e0Var = (mm2.e0) P0(mm2.e0.class);
            kotlin.jvm.internal.o.g(boxId, "boxId");
            r45.qm1 qm1Var = new r45.qm1();
            int i17 = qs5.v.f366472a;
            qm1Var.set(0, 1);
            qm1Var.set(1, boxId);
            e0Var.N6(qm1Var);
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("event_type", 1);
                jSONObject.put("group_box_number", boxId);
                ((ml2.r0) i95.n0.c(ml2.r0.class)).wj(jSONObject);
                return;
            } catch (java.lang.Throwable unused) {
                return;
            }
        }
        r45.qm1 qm1Var2 = (r45.qm1) ((mm2.e0) P0(mm2.e0.class)).f328970m.getValue();
        if (qm1Var2 != null && (string = qm1Var2.getString(1)) != null) {
            if (string.length() > 0) {
                long j17 = ((mm2.e0) P0(mm2.e0.class)).f328971n;
                long j18 = 0;
                if (j17 != 0) {
                    try {
                        j18 = c01.id.c() - j17;
                    } catch (java.lang.Throwable unused2) {
                    }
                }
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("event_type", 2);
                jSONObject2.put("group_box_number", string);
                jSONObject2.put("box_stay_time", j18);
                ((ml2.r0) i95.n0.c(ml2.r0.class)).wj(jSONObject2);
            }
        }
        ((mm2.e0) P0(mm2.e0.class)).O6();
    }

    public final void w1(java.lang.String source) {
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(S0(), "<this>");
        ae2.b2 b2Var = ae2.b2.f3461a;
        boolean z17 = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.b2.f3486t).getValue()).r()).intValue() == 1;
        com.tencent.mars.xlog.Log.i("Finder.BoxCommon", "local enable:" + z17);
        if (!z17 || !((mm2.e0) P0(mm2.e0.class)).P6()) {
            com.tencent.mars.xlog.Log.i("FinderLiveViewPagerComm", source.concat(" changeToPublic"));
        } else {
            com.tencent.mars.xlog.Log.i("FinderLiveViewPagerComm", source.concat(" changeToPublic in box!"));
            v1("");
        }
    }

    public final boolean x1(java.lang.Boolean bool) {
        com.google.android.material.tabs.TabLayout tabLayout = this.f261528s;
        int visibility = tabLayout.getVisibility();
        if (bool != null ? bool.booleanValue() : pm0.v.z(((mm2.c1) P0(mm2.c1.class)).f328807g2, 8)) {
            tabLayout.setVisibility(8);
        } else if (this.f261531v.f280898e.size() <= 1) {
            tabLayout.setVisibility(8);
        } else {
            tabLayout.setVisibility(0);
        }
        if (visibility != tabLayout.getVisibility()) {
            com.tencent.mm.plugin.finder.live.plugin.l.b1(this, null, "FinderLiveViewPagerComm", false, 4, null);
        }
        return tabLayout.getVisibility() == 0;
    }

    public final java.lang.Integer y1() {
        com.google.android.material.tabs.TabLayout tabLayout = this.f261528s;
        if (!(tabLayout.getVisibility() == 0)) {
            tabLayout = null;
        }
        if (tabLayout == null) {
            return null;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(tabLayout.getHeight());
        if (valueOf.intValue() > 0) {
            return valueOf;
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void z0() {
        super.z0();
    }

    public final void z1() {
        he2.f fVar = new he2.f(this.f261531v.f280898e, this.f261534y);
        this.f261532w = fVar;
        fVar.a();
        he2.f fVar2 = this.f261532w;
        com.tencent.mm.plugin.finder.live.box.viewpager.FinderLiveBoxViewPager finderLiveBoxViewPager = this.f261529t;
        finderLiveBoxViewPager.setAdapter(fVar2);
        fe2.p pVar = this.G;
        finderLiveBoxViewPager.removeOnPageChangeListener(pVar);
        finderLiveBoxViewPager.addOnPageChangeListener(pVar);
    }
}
