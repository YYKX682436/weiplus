package com.tencent.mm.ui.chatting.history;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/ui/chatting/history/MsgHistoryGalleryUI;", "Lcom/tencent/mm/ui/immersive/ImmersiveBaseActivity;", "Luc5/r;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class MsgHistoryGalleryUI extends com.tencent.mm.ui.immersive.ImmersiveBaseActivity implements uc5.r {

    /* renamed from: x1, reason: collision with root package name */
    public static final /* synthetic */ int f201697x1 = 0;
    public int D;
    public int E;
    public int F;
    public androidx.recyclerview.widget.p2 G;
    public ed5.n H;
    public ed5.t I;

    /* renamed from: J, reason: collision with root package name */
    public androidx.recyclerview.widget.w2 f201698J;
    public boolean K;
    public java.lang.String L;
    public int N;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;

    /* renamed from: y, reason: collision with root package name */
    public em.w1 f201708y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f201710z;

    /* renamed from: t, reason: collision with root package name */
    public final int f201702t = com.tencent.mm.R.color.f478489a;

    /* renamed from: u, reason: collision with root package name */
    public final int f201703u = com.tencent.mm.R.color.f478489a;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.List f201704v = kz5.c0.k(com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryActionBarView.class, com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGallerySearchBarView.class, com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryFilterBarView.class);

    /* renamed from: w, reason: collision with root package name */
    public final java.util.List f201705w = kz5.c0.k(com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryToolBarView.class);

    /* renamed from: x, reason: collision with root package name */
    public final java.util.List f201706x = kz5.c0.k(com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryTimelineOverlayView.class);
    public final jz5.g A = jz5.h.b(new tc5.c(this));
    public com.tencent.mm.ui.chatting.history.groups.g B = com.tencent.mm.ui.chatting.history.groups.q.f201782f;
    public int C = com.tencent.mm.R.dimen.f479644bj;
    public final int[] M = new int[3];
    public final jz5.g V = jz5.h.b(new tc5.t(this));
    public final jz5.g W = jz5.h.b(new tc5.i(this));
    public final jz5.g X = jz5.h.b(new tc5.u(this));
    public final jz5.g Y = jz5.h.b(new tc5.x(this));
    public final jz5.g Z = jz5.h.b(new tc5.d(this));

    /* renamed from: p0, reason: collision with root package name */
    public final jz5.g f201700p0 = jz5.h.b(new tc5.r(this));

    /* renamed from: x0, reason: collision with root package name */
    public final yz5.l f201707x0 = new tc5.f(this);

    /* renamed from: y0, reason: collision with root package name */
    public final tc5.w f201709y0 = new tc5.w(this);

    /* renamed from: l1, reason: collision with root package name */
    public final jz5.g f201699l1 = jz5.h.b(new tc5.b0(this));

    /* renamed from: p1, reason: collision with root package name */
    public final tc5.b f201701p1 = new tc5.b();

    public static final void h7(com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI msgHistoryGalleryUI) {
        if (msgHistoryGalleryUI.Q) {
            return;
        }
        msgHistoryGalleryUI.Q = true;
        msgHistoryGalleryUI.m7().postOnAnimation(new tc5.s(msgHistoryGalleryUI));
    }

    public final void A7() {
        int intValue;
        int i17;
        if (this.K) {
            return;
        }
        androidx.recyclerview.widget.f2 adapter = m7().getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        if (itemCount <= 0) {
            return;
        }
        com.tencent.mm.plugin.mvvmlist.MvvmList l76 = l7();
        if (l76 != null ? l76.f152062i : false) {
            boolean z17 = this.B.d() && !q7();
            if (!(z17 ? m7().canScrollVertically(-1) : m7().canScrollVertically(1))) {
                this.K = true;
                com.tencent.mm.plugin.mvvmlist.MvvmList l77 = l7();
                if (l77 != null) {
                    com.tencent.mm.plugin.mvvmlist.MvvmList.g(l77, null, 0, 3, null);
                    return;
                }
                return;
            }
            if (z17) {
                androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = m7().getLayoutManager();
                if (layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager) {
                    i17 = ((androidx.recyclerview.widget.LinearLayoutManager) layoutManager).w();
                } else {
                    if (!(layoutManager instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager)) {
                        return;
                    }
                    androidx.recyclerview.widget.StaggeredGridLayoutManager staggeredGridLayoutManager = (androidx.recyclerview.widget.StaggeredGridLayoutManager) layoutManager;
                    int i18 = staggeredGridLayoutManager.f11920d;
                    int[] iArr = new int[i18];
                    staggeredGridLayoutManager.u(iArr);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (int i19 = 0; i19 < i18; i19++) {
                        int i27 = iArr[i19];
                        if (i27 != -1) {
                            arrayList.add(java.lang.Integer.valueOf(i27));
                        }
                    }
                    java.lang.Integer num = (java.lang.Integer) kz5.n0.o0(arrayList);
                    i17 = num != null ? num.intValue() : -1;
                }
                if (i17 == -1) {
                    return;
                }
            } else {
                androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager2 = m7().getLayoutManager();
                if (layoutManager2 instanceof androidx.recyclerview.widget.LinearLayoutManager) {
                    intValue = ((androidx.recyclerview.widget.LinearLayoutManager) layoutManager2).y();
                } else {
                    if (!(layoutManager2 instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager)) {
                        return;
                    }
                    androidx.recyclerview.widget.StaggeredGridLayoutManager staggeredGridLayoutManager2 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) layoutManager2;
                    int[] iArr2 = new int[staggeredGridLayoutManager2.f11920d];
                    staggeredGridLayoutManager2.v(iArr2);
                    java.lang.Integer h07 = kz5.z.h0(iArr2);
                    intValue = h07 != null ? h07.intValue() : -1;
                }
                if (intValue == -1) {
                    return;
                } else {
                    i17 = (itemCount - intValue) - 1;
                }
            }
            if (i17 / itemCount < 0.2f) {
                this.K = true;
                com.tencent.mm.plugin.mvvmlist.MvvmList l78 = l7();
                if (l78 != null) {
                    com.tencent.mm.plugin.mvvmlist.MvvmList.g(l78, null, 0, 3, null);
                }
            }
        }
    }

    @Override // zc5.p
    public void E1() {
        ((wc5.w) ((jz5.n) this.W).getValue()).f444648e = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.ui.immersive.ImmersiveBaseActivity
    public android.view.View V6() {
        rj5.e eVar;
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.eke, (android.view.ViewGroup) null);
        em.w1 w1Var = new em.w1(inflate);
        this.f201708y = w1Var;
        if (w1Var.f254887b == null) {
            w1Var.f254887b = (com.tencent.mm.ui.scroll_view_widgets.ScrollViewWidgetWrapper) inflate.findViewById(com.tencent.mm.R.id.vpg);
        }
        com.tencent.mm.ui.scroll_view_widgets.ScrollViewWidgetWrapper scrollViewWidgetWrapper = w1Var.f254887b;
        em.w1 w1Var2 = this.f201708y;
        if (w1Var2 == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView a17 = w1Var2.a();
        kotlin.jvm.internal.o.f(a17, "getRecyclerView(...)");
        scrollViewWidgetWrapper.getClass();
        ym5.v6.b(scrollViewWidgetWrapper, a17);
        if (a17 instanceof android.widget.ScrollView) {
            rj5.k kVar = new rj5.k(scrollViewWidgetWrapper, (android.widget.ScrollView) a17);
            kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
            h0Var.f310123d = rj5.a.f396371d;
            kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
            android.widget.ScrollView scrollView = kVar.f396393d;
            f0Var.f310116d = scrollView.getScrollY();
            rj5.i iVar = new rj5.i(h0Var, kVar);
            android.view.ViewTreeObserver viewTreeObserver = scrollView.getViewTreeObserver();
            rj5.j jVar = new rj5.j(kVar, f0Var, h0Var, iVar, 80L);
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnScrollChangedListener(jVar);
            }
            scrollView.addOnAttachStateChangeListener(new rj5.h(kVar, jVar, iVar));
            eVar = kVar;
        } else {
            rj5.e eVar2 = new rj5.e(scrollViewWidgetWrapper, a17);
            eVar2.f396381d.i(new rj5.d(eVar2, new kotlin.jvm.internal.f0()));
            eVar = eVar2;
        }
        scrollViewWidgetWrapper.f209789e = eVar;
        float currentPosition = eVar.getCurrentPosition();
        java.util.Iterator it = scrollViewWidgetWrapper.f209788d.iterator();
        while (it.hasNext()) {
            com.tencent.mm.ui.scroll_view_widgets.ScrollViewWidgetBaseView scrollViewWidgetBaseView = (com.tencent.mm.ui.scroll_view_widgets.ScrollViewWidgetBaseView) it.next();
            scrollViewWidgetBaseView.setWidgetController(eVar);
            scrollViewWidgetBaseView.b(currentPosition);
            scrollViewWidgetBaseView.c(rj5.a.f396371d);
        }
        em.w1 w1Var3 = this.f201708y;
        if (w1Var3 == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        if (w1Var3.f254887b == null) {
            w1Var3.f254887b = (com.tencent.mm.ui.scroll_view_widgets.ScrollViewWidgetWrapper) w1Var3.f254886a.findViewById(com.tencent.mm.R.id.vpg);
        }
        com.tencent.mm.ui.scroll_view_widgets.ScrollViewWidgetWrapper scrollViewWidgetWrapper2 = w1Var3.f254887b;
        jz5.g gVar = this.f201699l1;
        com.tencent.mm.ui.scroll_view_widgets.widgets.ScrollViewWidgetQuickScrollBarView widget = (com.tencent.mm.ui.scroll_view_widgets.widgets.ScrollViewWidgetQuickScrollBarView) ((jz5.n) gVar).getValue();
        scrollViewWidgetWrapper2.getClass();
        kotlin.jvm.internal.o.g(widget, "widget");
        rj5.l lVar = scrollViewWidgetWrapper2.f209789e;
        if (lVar != null) {
            widget.setWidgetController(lVar);
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = scrollViewWidgetWrapper2.f209788d;
        if (!copyOnWriteArrayList.contains(widget)) {
            copyOnWriteArrayList.add(widget);
        }
        android.view.ViewParent parent = widget.getParent();
        if (parent instanceof android.widget.FrameLayout) {
            if (parent != scrollViewWidgetWrapper2) {
                ((android.widget.FrameLayout) parent).removeView(widget);
            }
        } else if (parent instanceof android.view.ViewGroup) {
            ((android.view.ViewGroup) parent).removeView(widget);
        }
        if (widget.getParent() == null) {
            scrollViewWidgetWrapper2.addView(widget);
        }
        rj5.l lVar2 = scrollViewWidgetWrapper2.f209789e;
        if (lVar2 != null) {
            widget.b(lVar2.getCurrentPosition());
            widget.c(rj5.a.f396371d);
        }
        ((rj5.c) ((com.tencent.mm.ui.scroll_view_widgets.widgets.ScrollViewWidgetQuickScrollBarView) ((jz5.n) gVar).getValue()).getWidgetController()).f396377b = this.f201701p1;
        android.view.View view = X6().f254624a;
        kotlin.jvm.internal.o.f(view, "getInflateRootView(...)");
        view.setBackgroundColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478489a, null));
        em.w1 w1Var4 = this.f201708y;
        if (w1Var4 == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView a18 = w1Var4.a();
        tc5.a aVar = new tc5.a(this);
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.a1.u(a18, aVar);
        android.view.View view2 = w1Var.f254886a;
        kotlin.jvm.internal.o.f(view2, "getInflateRootView(...)");
        return view2;
    }

    @Override // com.tencent.mm.ui.immersive.ImmersiveBaseActivity
    /* renamed from: Y6 */
    public boolean getF208938m() {
        return false;
    }

    @Override // com.tencent.mm.ui.immersive.ImmersiveBaseActivity
    /* renamed from: Z6, reason: from getter */
    public int getF208933e() {
        return this.f201703u;
    }

    @Override // com.tencent.mm.ui.immersive.ImmersiveBaseActivity
    /* renamed from: a7, reason: from getter */
    public java.util.List getF208935g() {
        return this.f201705w;
    }

    @Override // com.tencent.mm.ui.immersive.ImmersiveBaseActivity
    /* renamed from: b7, reason: from getter */
    public int getF201809t() {
        return this.f201702t;
    }

    @Override // com.tencent.mm.ui.immersive.ImmersiveBaseActivity
    /* renamed from: c7, reason: from getter */
    public java.util.List getF201810u() {
        return this.f201704v;
    }

    @Override // zc5.o
    public com.tencent.mm.ui.chatting.history.media.MsgHistoryGalleryMediaLoadGroup d3() {
        return (com.tencent.mm.ui.chatting.history.media.MsgHistoryGalleryMediaLoadGroup) ((jz5.n) this.Z).getValue();
    }

    @Override // com.tencent.mm.ui.immersive.ImmersiveBaseActivity
    /* renamed from: d7, reason: from getter */
    public java.util.List getF208936h() {
        return this.f201706x;
    }

    public com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGallerySearchBarView i7() {
        com.tencent.mm.ui.immersive.ImmersiveBaseChromeView W6 = W6(com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGallerySearchBarView.class);
        if (!(W6 instanceof com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGallerySearchBarView)) {
            W6 = null;
        }
        return (com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGallerySearchBarView) W6;
    }

    public java.lang.String j7() {
        java.lang.String str = this.f201710z;
        if (str != null) {
            return str;
        }
        kotlin.jvm.internal.o.o("talker");
        throw null;
    }

    public final com.tencent.mm.sdk.coroutines.LifecycleScope k7() {
        return (com.tencent.mm.sdk.coroutines.LifecycleScope) ((jz5.n) this.A).getValue();
    }

    public final com.tencent.mm.plugin.mvvmlist.MvvmList l7() {
        xm3.t0 b17 = xm3.u0.b(m7());
        if (b17 != null) {
            return b17.I;
        }
        return null;
    }

    public final com.tencent.mm.view.recyclerview.WxRecyclerView m7() {
        em.w1 w1Var = this.f201708y;
        if (w1Var == null) {
            kotlin.jvm.internal.o.o("binding");
            throw null;
        }
        com.tencent.mm.view.recyclerview.WxRecyclerView a17 = w1Var.a();
        kotlin.jvm.internal.o.f(a17, "getRecyclerView(...)");
        return a17;
    }

    public final wc5.y0 n7() {
        return (wc5.y0) ((jz5.n) this.V).getValue();
    }

    public final wc5.k1 o7() {
        return (wc5.k1) ((jz5.n) this.X).getValue();
    }

    @Override // com.tencent.mm.ui.immersive.ImmersiveBaseActivity, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.Object obj;
        java.lang.Object m521constructorimpl;
        super.onCreate(bundle);
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(this).a(wc5.q.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        wc5.q qVar = (wc5.q) a17;
        qVar.f444624f = android.os.SystemClock.uptimeMillis();
        androidx.activity.i onBackPressedDispatcher = getOnBackPressedDispatcher();
        kotlin.jvm.internal.o.f(onBackPressedDispatcher, "getOnBackPressedDispatcher(...)");
        onBackPressedDispatcher.b(new androidx.activity.j(new tc5.g(this), true));
        m7().i(this.f201709y0);
        m7().setOnFlingListener(new tc5.h(this));
        java.lang.String stringExtra = getIntent().getStringExtra("kTalker");
        if (stringExtra == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgHistoryGalleryUI", "talker is null, finishing activity");
            finish();
            return;
        }
        this.f201710z = stringExtra;
        qVar.f444623e = getIntent().getLongExtra("kMsgId", 0L);
        java.lang.String stringExtra2 = getIntent().getStringExtra("kDefaultType");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        java.util.Iterator it = com.tencent.mm.ui.chatting.history.groups.g.f201751e.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (kotlin.jvm.internal.o.b(((com.tencent.mm.ui.chatting.history.groups.g) obj).getClass().getName(), stringExtra2)) {
                    break;
                }
            }
        }
        com.tencent.mm.ui.chatting.history.groups.g gVar = (com.tencent.mm.ui.chatting.history.groups.g) obj;
        if (gVar == null) {
            gVar = com.tencent.mm.ui.chatting.history.groups.q.f201782f;
        }
        com.tencent.mm.ui.immersive.ImmersiveBaseChromeView W6 = W6(com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryActionBarView.class);
        if (!(W6 instanceof com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryActionBarView)) {
            W6 = null;
        }
        com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryActionBarView msgHistoryGalleryActionBarView = (com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryActionBarView) W6;
        if (msgHistoryGalleryActionBarView == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgHistoryGalleryUI", "actionBar is null, finishing activity");
            finish();
            return;
        }
        msgHistoryGalleryActionBarView.setOnFilterSelectedListener(this.f201707x0);
        msgHistoryGalleryActionBarView.setOnSelectModeChangeListener(o7().f444596i);
        msgHistoryGalleryActionBarView.setOnSelectAllClickListener(o7().f444597m);
        msgHistoryGalleryActionBarView.setDefaultType(gVar);
        wc5.y0 n76 = n7();
        com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGallerySearchBarView i76 = ((com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) n76.U6()).i7();
        if (i76 != null) {
            i76.setOnSearchTextChangedListener(new wc5.o0(n76));
            i76.setOnSearchFocusChangedListener(new wc5.p0(n76, i76));
        }
        wc5.y0 n77 = n7();
        com.tencent.mm.ui.immersive.ImmersiveBaseChromeView W62 = ((com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) n77.U6()).W6(com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryFilterBarView.class);
        if (!(W62 instanceof com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryFilterBarView)) {
            W62 = null;
        }
        com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryFilterBarView msgHistoryGalleryFilterBarView = (com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryFilterBarView) W62;
        jz5.f0 f0Var = jz5.f0.f302826a;
        boolean z17 = false;
        if (msgHistoryGalleryFilterBarView != null) {
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                java.util.ArrayList aj6 = ((c61.ec) ((qk.x7) i95.n0.c(qk.x7.class))).aj();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it6 = aj6.iterator();
                while (it6.hasNext()) {
                    java.lang.String str = (java.lang.String) ((android.util.Pair) it6.next()).first;
                    if (str == null || !(!r26.n0.N(str))) {
                        str = null;
                    }
                    if (str != null) {
                        arrayList.add(str);
                    }
                }
                msgHistoryGalleryFilterBarView.setSuggestWords(arrayList);
                m521constructorimpl = kotlin.Result.m521constructorimpl(f0Var);
            } catch (java.lang.Throwable th6) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
            }
            java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
            if (m524exceptionOrNullimpl != null) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MsgHistoryGallerySearchFilterUIC", m524exceptionOrNullimpl, "initFilterBarView: failed to load suggest words", new java.lang.Object[0]);
            }
            msgHistoryGalleryFilterBarView.setOnSuggestWordClickListener(new wc5.m0(n77));
            msgHistoryGalleryFilterBarView.setOnFilterSelectedListener(new wc5.n0(n77));
        }
        wc5.y0 n78 = n7();
        n78.getClass();
        c61.ec ecVar = (c61.ec) ((qk.x7) i95.n0.c(qk.x7.class));
        ecVar.Ui();
        ecVar.Di(9);
        boolean Ni = ecVar.Ni();
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGallerySearchFilterUIC", "initImageQuery: hasEntrance=" + Ni);
        if (Ni) {
            n78.f444662m = ecVar.Ri();
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGallerySearchFilterUIC", "initImageQuery: imageQueryEnabled=" + n78.f444662m);
            if (n78.f444662m) {
                try {
                    kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                    ecVar.wi(((com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) n78.U6()).j7());
                    kotlin.Result.m521constructorimpl(f0Var);
                } catch (java.lang.Throwable th7) {
                    kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
                    kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th7));
                }
                if (!n78.f444664o) {
                    aq.n nVar = aq.o.f12922c;
                    if (nVar != null && nVar.f12910e) {
                        z17 = true;
                    }
                    if (!z17) {
                        n78.f444664o = true;
                        n78.f444663n = v65.i.b(((com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) n78.U6()).k7(), null, new wc5.w0(n78, null), 1, null);
                    }
                }
                ((ku5.t0) ku5.t0.f312615d).q(new wc5.u0(n78));
            } else {
                ((ku5.t0) ku5.t0.f312615d).q(new wc5.s0(n78, ""));
            }
        } else {
            n78.f444662m = false;
            ((ku5.t0) ku5.t0.f312615d).q(new wc5.s0(n78, ""));
        }
        this.B = gVar;
        ((wc5.g0) pf5.z.f353948a.a(this).a(wc5.g0.class)).T6(gVar);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        this.T = true;
        m7().V0(this.f201709y0);
        androidx.recyclerview.widget.w2 w2Var = this.f201698J;
        if (w2Var != null) {
            m7().V0(w2Var);
        }
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.immersive.ImmersiveBaseActivity, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    public final com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryTimelineOverlayView p7() {
        com.tencent.mm.ui.immersive.ImmersiveBaseChromeView W6 = W6(com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryTimelineOverlayView.class);
        if (!(W6 instanceof com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryTimelineOverlayView)) {
            W6 = null;
        }
        return (com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryTimelineOverlayView) W6;
    }

    public boolean q7() {
        return n7().f444659g;
    }

    public boolean r7() {
        com.tencent.mm.ui.immersive.ImmersiveBaseChromeView W6 = W6(com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryActionBarView.class);
        if (!(W6 instanceof com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryActionBarView)) {
            W6 = null;
        }
        com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryActionBarView msgHistoryGalleryActionBarView = (com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryActionBarView) W6;
        if (msgHistoryGalleryActionBarView != null) {
            return msgHistoryGalleryActionBarView.isSelecting;
        }
        return false;
    }

    public final void s7(com.tencent.mm.ui.chatting.history.groups.g gVar) {
        com.tencent.mm.ui.immersive.ImmersiveBaseChromeView W6 = W6(com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGallerySearchBarView.class);
        if (!(W6 instanceof com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGallerySearchBarView)) {
            W6 = null;
        }
        com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGallerySearchBarView msgHistoryGallerySearchBarView = (com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGallerySearchBarView) W6;
        if (msgHistoryGallerySearchBarView == null) {
            return;
        }
        java.lang.String string = getContext().getResources().getString(kotlin.jvm.internal.o.b(gVar, com.tencent.mm.ui.chatting.history.groups.q.f201782f) ? com.tencent.mm.R.string.pcw : com.tencent.mm.R.string.pcv);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        msgHistoryGallerySearchBarView.setSearchHint(string);
        com.tencent.mm.ui.immersive.ImmersiveBaseChromeView W62 = W6(com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryToolBarView.class);
        com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryToolBarView msgHistoryGalleryToolBarView = (com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryToolBarView) (W62 instanceof com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryToolBarView ? W62 : null);
        if (msgHistoryGalleryToolBarView == null) {
            return;
        }
        ad5.l0[] a17 = gVar.a();
        msgHistoryGalleryToolBarView.b((ad5.l0[]) java.util.Arrays.copyOf(a17, a17.length), new tc5.j(this));
    }

    @Override // com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        set.add(com.tencent.mm.ui.chatting.history.components.MsgHistoryGalleryPreviewTransitionUIC.class);
        set.add(wc5.q.class);
        set.add(wc5.g0.class);
        set.add(wc5.y0.class);
        set.add(wc5.c0.class);
        set.add(wc5.w.class);
        set.add(wc5.k1.class);
        set.add(wc5.l1.class);
        set.add(wc5.k0.class);
    }

    public void t7(int i17, final int i18) {
        androidx.recyclerview.widget.p2 p2Var = this.G;
        if (p2Var != null) {
            m7().S0(p2Var);
        }
        this.G = null;
        int h17 = i65.a.h(getContext(), i17);
        this.D = h17;
        com.tencent.mm.view.recyclerview.WxRecyclerView m76 = m7();
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.y0.c(m76);
        com.tencent.mm.view.recyclerview.WxRecyclerView m77 = m7();
        final androidx.appcompat.app.AppCompatActivity context = getContext();
        androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = new androidx.recyclerview.widget.GridLayoutManager(i18, context) { // from class: com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI$newGridLayoutManagerWithTimelineFullSpan$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager
            public int G(androidx.recyclerview.widget.h3 state) {
                float f17;
                float f18;
                kotlin.jvm.internal.o.g(state, "state");
                com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI msgHistoryGalleryUI = this;
                if (msgHistoryGalleryUI.U) {
                    return 0;
                }
                int i19 = msgHistoryGalleryUI.F;
                if (i19 != 1 && i19 != 2) {
                    return getHeight();
                }
                int abs = java.lang.Math.abs(msgHistoryGalleryUI.E);
                int height = getHeight();
                if (height > 0) {
                    if (abs >= height * 3) {
                        f17 = height;
                        f18 = 2.5f;
                    } else if (abs >= height * 1) {
                        f17 = height;
                        f18 = 1.8f;
                    }
                    return (int) (f17 * f18);
                }
                return height;
            }
        };
        tc5.e eVar = new tc5.e(m7(), i18);
        eVar.f12225b = true;
        gridLayoutManager.B = eVar;
        gridLayoutManager.setItemPrefetchEnabled(true);
        gridLayoutManager.f11881u = 80;
        m77.setLayoutManager(gridLayoutManager);
        m7().setItemViewCacheSize(90);
        m7().setHasFixedSize(true);
        ed5.a aVar = new ed5.a(i18, h17, 0, 4, null);
        this.G = aVar;
        m7().N(aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x036c, code lost:
    
        r0 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02ff, code lost:
    
        if (r0 == null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x036a, code lost:
    
        if (r7 != 0) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x02c3, code lost:
    
        if ((r0 != null || r0.isEmpty()) == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x036f, code lost:
    
        r0 = new ym3.c(r2, r2, 200, null);
        r1 = new ym3.d(r0);
        r3.f(r0, r1);
        r0 = kz5.n0.S0(r1.f463149c);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x04eb  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u7(final com.tencent.mm.ui.chatting.history.groups.g r29) {
        /*
            Method dump skipped, instructions count: 1625
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI.u7(com.tencent.mm.ui.chatting.history.groups.g):void");
    }

    public final void v7(boolean z17) {
        int w17;
        long T1;
        com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryTimelineOverlayView p76 = p7();
        if (p76 == null) {
            return;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = m7().getLayoutManager();
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null || (w17 = linearLayoutManager.w()) == -1) {
            return;
        }
        androidx.recyclerview.widget.f2 adapter = m7().getAdapter();
        xm3.t0 t0Var = adapter instanceof xm3.t0 ? (xm3.t0) adapter : null;
        if (t0Var == null) {
            return;
        }
        java.lang.Object a07 = kz5.n0.a0(t0Var.getData(), w17);
        uc5.l0 l0Var = a07 instanceof uc5.l0 ? (uc5.l0) a07 : null;
        if (l0Var == null) {
            return;
        }
        if (l0Var instanceof uc5.k0) {
            T1 = ((uc5.k0) l0Var).f426520g;
        } else {
            if (!(l0Var instanceof uc5.h0)) {
                if (!(l0Var instanceof uc5.i0) && !(l0Var instanceof uc5.j0)) {
                    throw new jz5.j();
                }
                return;
            }
            T1 = ((uc5.h0) l0Var).f426494d.p().T1();
        }
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        if (1 <= T1 && T1 < 1000000000000L) {
            T1 *= 1000;
        }
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTimeInMillis(T1);
        java.lang.String string = context.getString(com.tencent.mm.R.string.pde, java.lang.Integer.valueOf(calendar.get(1)), java.lang.Integer.valueOf(calendar.get(2) + 1), java.lang.Integer.valueOf(calendar.get(5)));
        kotlin.jvm.internal.o.f(string, "getString(...)");
        if (z17 || !kotlin.jvm.internal.o.b(string, this.L)) {
            this.L = string;
            p76.setTimelineText(string);
        }
    }

    public final void w7(boolean z17) {
        jz5.l[] lVarArr = new jz5.l[4];
        lVarArr[0] = new jz5.l(com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryActionBarView.class, 0);
        lVarArr[1] = new jz5.l(com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGallerySearchBarView.class, java.lang.Integer.valueOf(r7() ^ true ? 0 : 8));
        lVarArr[2] = new jz5.l(com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryFilterBarView.class, java.lang.Integer.valueOf(r7() ? 8 : y7()));
        lVarArr[3] = new jz5.l(com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGalleryToolBarView.class, java.lang.Integer.valueOf(r7() ? 0 : 8));
        com.tencent.mm.ui.immersive.ImmersiveBaseActivity.g7(this, kz5.c1.k(lVarArr), z17, null, 4, null);
    }

    public void x7(boolean z17) {
        int u07;
        xm3.t0 b17 = xm3.u0.b(m7());
        if (b17 == null) {
            return;
        }
        int itemCount = b17.getItemCount();
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        int childCount = m7().getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = m7().getChildAt(i17);
            if (childAt != null && (u07 = m7().u0(childAt)) != -1 && u07 < itemCount) {
                int itemViewType = b17.getItemViewType(u07);
                if (!linkedHashSet.contains(java.lang.Integer.valueOf(itemViewType))) {
                    linkedHashSet.add(java.lang.Integer.valueOf(itemViewType));
                    in5.r w07 = b17.w0(itemViewType);
                    uc5.n nVar = w07 instanceof uc5.n ? (uc5.n) w07 : null;
                    if (nVar != null) {
                        nVar.f426533i = z17;
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int y7() {
        /*
            r6 = this;
            wc5.y0 r0 = r6.n7()
            uc5.r r1 = r0.U6()
            com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI r1 = (com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) r1
            com.tencent.mm.ui.chatting.history.chromes.MsgHistoryGallerySearchBarView r1 = r1.i7()
            r2 = 8
            if (r1 != 0) goto L13
            goto L46
        L13:
            boolean r3 = r1.hasFocus()
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L33
            java.lang.CharSequence r1 = r1.getSearchText()
            if (r1 == 0) goto L2e
            int r1 = r1.length()
            if (r1 <= 0) goto L29
            r1 = r4
            goto L2a
        L29:
            r1 = r5
        L2a:
            if (r1 != r4) goto L2e
            r1 = r4
            goto L2f
        L2e:
            r1 = r5
        L2f:
            if (r1 == 0) goto L32
            goto L33
        L32:
            r4 = r5
        L33:
            if (r4 == 0) goto L46
            uc5.r r0 = r0.U6()
            com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI r0 = (com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) r0
            com.tencent.mm.ui.chatting.history.groups.g r0 = r0.B
            com.tencent.mm.ui.chatting.history.groups.q r1 = com.tencent.mm.ui.chatting.history.groups.q.f201782f
            boolean r0 = kotlin.jvm.internal.o.b(r0, r1)
            if (r0 == 0) goto L46
            r2 = r5
        L46:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI.y7():int");
    }

    public void z7() {
        xm3.t0 b17;
        int u07;
        if (this.T || isFinishing() || (b17 = xm3.u0.b(m7())) == null) {
            return;
        }
        if (this.R) {
            this.S = true;
            return;
        }
        int height = m7().getHeight() / 2;
        int[] iArr = new int[m7().getChildCount()];
        int[] iArr2 = new int[m7().getChildCount()];
        int childCount = m7().getChildCount();
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            android.view.View childAt = m7().getChildAt(i18);
            if (childAt != null && (u07 = m7().u0(childAt)) != -1 && (((uc5.l0) kz5.n0.a0(b17.getData(), u07)) instanceof uc5.h0)) {
                int top = (childAt.getTop() + childAt.getBottom()) / 2;
                iArr[i17] = u07;
                iArr2[i17] = java.lang.Math.abs(top - height);
                i17++;
            }
        }
        if (i17 == 0) {
            return;
        }
        int i19 = i17 - 1;
        int i27 = 0;
        while (i27 < i19) {
            int i28 = i27 + 1;
            int i29 = i27;
            for (int i37 = i28; i37 < i17; i37++) {
                if (iArr2[i37] < iArr2[i29]) {
                    i29 = i37;
                }
            }
            if (i29 != i27) {
                int i38 = iArr[i27];
                iArr[i27] = iArr[i29];
                iArr[i29] = i38;
                int i39 = iArr2[i27];
                iArr2[i27] = iArr2[i29];
                iArr2[i29] = i39;
            }
            i27 = i28;
        }
        this.R = true;
        kz5.q qVar = new kz5.q(i17);
        for (int i47 = 0; i47 < i17; i47++) {
            qVar.addLast(java.lang.Integer.valueOf(iArr[i47]));
        }
        android.view.Choreographer.getInstance().postFrameCallback(new tc5.v(this, qVar));
    }
}
