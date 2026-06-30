package com.tencent.mm.plugin.finder.ui;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderShareFeedRelUI;", "Lcom/tencent/mm/plugin/finder/feed/ui/FinderLoaderFeedSupportSlideUI;", "Lcom/tencent/mm/plugin/finder/feed/model/FinderFeedShareRelativeListLoader;", "Lcom/tencent/mm/plugin/finder/feed/w8;", "Lcom/tencent/mm/plugin/finder/ui/qm;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes2.dex */
public class FinderShareFeedRelUI extends com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedSupportSlideUI<com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader, com.tencent.mm.plugin.finder.feed.w8, com.tencent.mm.plugin.finder.ui.qm> {

    /* renamed from: p2, reason: collision with root package name */
    public static zy2.i5 f128766p2;
    public boolean A1;
    public java.lang.String B1;
    public com.tencent.mm.plugin.finder.ui.qm D;
    public com.tencent.mm.plugin.finder.feed.w8 E;
    public java.lang.String E1;
    public com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader F;
    public r45.a34 F1;
    public com.tencent.mm.plugin.finder.model.BaseFinderFeed G;
    public java.lang.String G1;
    public java.lang.Integer H;
    public r45.nv2 H1;
    public boolean I;
    public java.lang.String I1;
    public java.lang.String J1;
    public long K1;
    public java.lang.String L1;
    public int P;
    public boolean Q1;
    public java.lang.String R1;
    public int S1;
    public com.tencent.mm.autogen.events.FeedContactChangeEvent T1;
    public com.tencent.mm.protocal.protobuf.FinderContact U1;
    public com.tencent.mm.protocal.protobuf.FinderObject V1;
    public com.tencent.mm.sdk.event.IListener W1;
    public com.tencent.mm.plugin.finder.feed.v9 X1;
    public com.tencent.mm.plugin.finder.model.BaseFinderFeed Y;
    public boolean Y1;
    public android.view.View Z;

    /* renamed from: a2, reason: collision with root package name */
    public boolean f128768a2;

    /* renamed from: e2, reason: collision with root package name */
    public zy2.i5 f128772e2;

    /* renamed from: f2, reason: collision with root package name */
    public boolean f128773f2;

    /* renamed from: g2, reason: collision with root package name */
    public boolean f128774g2;

    /* renamed from: h2, reason: collision with root package name */
    public boolean f128775h2;

    /* renamed from: i2, reason: collision with root package name */
    public int f128776i2;

    /* renamed from: j2, reason: collision with root package name */
    public boolean f128777j2;

    /* renamed from: k2, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.model.BaseFinderFeed f128778k2;

    /* renamed from: l1, reason: collision with root package name */
    public long f128779l1;

    /* renamed from: l2, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.storage.FinderItem f128780l2;

    /* renamed from: p0, reason: collision with root package name */
    public long f128784p0;

    /* renamed from: x0, reason: collision with root package name */
    public java.lang.String f128786x0;

    /* renamed from: z1, reason: collision with root package name */
    public long f128790z1;
    public final java.lang.String C = "Finder.FinderShareFeedRelUI";

    /* renamed from: J, reason: collision with root package name */
    public final jz5.g f128767J = jz5.h.b(new com.tencent.mm.plugin.finder.ui.dk(this));
    public final jz5.g K = jz5.h.b(new com.tencent.mm.plugin.finder.ui.ck(this));
    public final jz5.g L = jz5.h.b(new com.tencent.mm.plugin.finder.ui.yi(this));
    public final jz5.g M = jz5.h.b(new com.tencent.mm.plugin.finder.ui.mk(this));
    public final jz5.g N = jz5.h.b(new com.tencent.mm.plugin.finder.ui.fk(this));
    public int Q = 2;
    public final int R = 2;
    public java.lang.String S = "";
    public final jz5.g T = jz5.h.b(new com.tencent.mm.plugin.finder.ui.vi(this));
    public final jz5.g U = jz5.h.b(new com.tencent.mm.plugin.finder.ui.dj(this));
    public final jz5.g V = jz5.h.b(new com.tencent.mm.plugin.finder.ui.wi(this));
    public final jz5.g W = jz5.h.b(new com.tencent.mm.plugin.finder.ui.xi(this));
    public final boolean X = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).el();

    /* renamed from: y0, reason: collision with root package name */
    public java.lang.String f128788y0 = "";

    /* renamed from: p1, reason: collision with root package name */
    public java.lang.String f128785p1 = "";

    /* renamed from: x1, reason: collision with root package name */
    public boolean f128787x1 = true;

    /* renamed from: y1, reason: collision with root package name */
    public java.lang.String f128789y1 = "";
    public java.lang.String C1 = "";
    public java.lang.String D1 = "";
    public java.lang.String M1 = "";
    public final java.util.concurrent.ConcurrentHashMap N1 = new java.util.concurrent.ConcurrentHashMap();
    public final jz5.g O1 = jz5.h.b(new com.tencent.mm.plugin.finder.ui.hk(this));
    public final jz5.g P1 = jz5.h.b(new com.tencent.mm.plugin.finder.ui.nk(this));
    public java.lang.String Z1 = "";

    /* renamed from: b2, reason: collision with root package name */
    public final jz5.g f128769b2 = jz5.h.b(com.tencent.mm.plugin.finder.ui.gk.f129306d);

    /* renamed from: c2, reason: collision with root package name */
    public final jz5.g f128770c2 = jz5.h.b(new com.tencent.mm.plugin.finder.ui.qi(this));

    /* renamed from: d2, reason: collision with root package name */
    public final jz5.g f128771d2 = jz5.h.b(new com.tencent.mm.plugin.finder.ui.ik(this));

    /* renamed from: m2, reason: collision with root package name */
    public int f128781m2 = -1;

    /* renamed from: n2, reason: collision with root package name */
    public final fc2.d f128782n2 = new com.tencent.mm.plugin.finder.ui.cj(this);

    /* renamed from: o2, reason: collision with root package name */
    public java.lang.String f128783o2 = "";

    private final void O7() {
        android.view.View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.o.f(decorView, "getDecorView(...)");
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1024 | 256);
        getWindow().setStatusBarColor(0);
        getController().W0(this, getResources().getColor(com.tencent.mm.R.color.a9e));
        com.tencent.mm.ui.r0.a(this, false);
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.w(new android.graphics.drawable.ColorDrawable(0));
            supportActionBar.o();
        }
        int h17 = com.tencent.mm.ui.bl.h(this);
        android.widget.FrameLayout frameLayout = B7().f434671g;
        frameLayout.setPadding(0, h17, 0, 0);
        com.tencent.mm.ui.a4.g(frameLayout, true);
        P7();
        if (this.P == 13) {
            ((android.widget.TextView) ((jz5.n) this.A).getValue()).setVisibility(0);
        }
    }

    public static final void v7(com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI finderShareFeedRelUI, int i17) {
        androidx.appcompat.app.AppCompatActivity context = finderShareFeedRelUI.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        finderShareFeedRelUI.f128783o2 = com.tencent.mm.plugin.finder.extension.reddot.ha.f105557a.l(i17, nyVar != null ? nyVar.V6() : null, finderShareFeedRelUI.f128783o2);
    }

    public static final void w7(com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI finderShareFeedRelUI) {
        com.tencent.mm.plugin.finder.feed.w8 w8Var = finderShareFeedRelUI.E;
        if (w8Var == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = w8Var.getRecyclerView();
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager = layoutManager instanceof com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager ? (com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) layoutManager : null;
        if (finderLinearLayoutManager == null) {
            return;
        }
        recyclerView.post(new com.tencent.mm.plugin.finder.ui.ui(finderShareFeedRelUI, finderLinearLayoutManager, recyclerView));
    }

    public static final com.tencent.mm.plugin.finder.model.BaseFinderFeed x7(com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI finderShareFeedRelUI, int i17) {
        if (i17 < 0) {
            finderShareFeedRelUI.getClass();
        } else if (i17 < finderShareFeedRelUI.E7().getSize()) {
            so2.j5 j5Var = (so2.j5) finderShareFeedRelUI.E7().get(i17);
            if (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var;
                if (baseFinderFeed.getFeedObject().getMediaType() != 10001) {
                    return baseFinderFeed;
                }
            }
        }
        return null;
    }

    public final void A7(boolean z17) {
        boolean z18 = !z17;
        this.S1 = z18 ? 2 : 1;
        updateOptionMenuText(1, F7(z18));
        updateOptionMenuStyle(1, z18 ? com.tencent.mm.ui.fb.FEED_UNFOLLOW : com.tencent.mm.ui.fb.FEED_FOLLOW);
    }

    public final vb2.m B7() {
        return (vb2.m) ((jz5.n) this.f128770c2).getValue();
    }

    public final com.tencent.mm.plugin.finder.feed.model.l0 C7() {
        return (com.tencent.mm.plugin.finder.feed.model.l0) ((jz5.n) this.T).getValue();
    }

    public final int D7() {
        return ((java.lang.Number) ((jz5.n) this.V).getValue()).intValue();
    }

    public final com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader E7() {
        com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader = this.F;
        if (finderFeedShareRelativeListLoader != null) {
            return finderFeedShareRelativeListLoader;
        }
        kotlin.jvm.internal.o.o(com.tencent.shadow.core.common.HostConstants.LOADER_APPID);
        throw null;
    }

    public final java.lang.String F7(boolean z17) {
        if (z17) {
            java.lang.String string = getContext().getString(com.tencent.mm.R.string.f491392cy2);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            return string;
        }
        java.lang.String string2 = getContext().getString(com.tencent.mm.R.string.cxd);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        return string2;
    }

    public final int G7() {
        return ((java.lang.Number) ((jz5.n) this.N).getValue()).intValue();
    }

    public final int H7() {
        return ((java.lang.Number) ((jz5.n) this.P1).getValue()).intValue();
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedSupportSlideUI
    /* renamed from: I7, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.plugin.finder.feed.w8 p7() {
        com.tencent.mm.plugin.finder.feed.w8 w8Var = this.E;
        if (w8Var != null) {
            return w8Var;
        }
        kotlin.jvm.internal.o.o("viewCallback");
        throw null;
    }

    public final void J7() {
        if (this.E == null || this.I) {
            return;
        }
        this.I = true;
        java.lang.Integer num = this.H;
        if (num != null) {
            int intValue = num.intValue();
            com.tencent.mars.xlog.Log.i(this.C, "handleFeedActionIfNeeded: feedActionType: " + intValue);
            com.tencent.mm.plugin.finder.feed.w8 w8Var = this.E;
            if (w8Var != null) {
                w8Var.getRecyclerView().post(new com.tencent.mm.plugin.finder.ui.ej(intValue, this));
            } else {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
        }
    }

    public final void K7(boolean z17) {
        B7().f434673i.setOnClickListener(new com.tencent.mm.plugin.finder.ui.xj(this, z17));
        if (z17) {
            com.tencent.mm.plugin.finder.extension.reddot.aa aaVar = com.tencent.mm.plugin.finder.extension.reddot.aa.f105353a;
            androidx.lifecycle.j0 j0Var = com.tencent.mm.plugin.finder.extension.reddot.aa.f105389s;
            androidx.appcompat.app.AppCompatActivity context = getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pm0.v.y(j0Var, context, new com.tencent.mm.plugin.finder.ui.yj(this));
        }
        android.widget.FrameLayout personalCenterContainer = B7().f434674j;
        kotlin.jvm.internal.o.f(personalCenterContainer, "personalCenterContainer");
        hc2.v0.e(personalCenterContainer, "person_center_head", 0, 0, false, true, null, new com.tencent.mm.plugin.finder.ui.zj(this), 46, null);
    }

    public final void L7() {
        B7().f434677m.setOnClickListener(new com.tencent.mm.plugin.finder.ui.ak(this));
        android.widget.LinearLayout searchButton = B7().f434677m;
        kotlin.jvm.internal.o.f(searchButton, "searchButton");
        hc2.v0.e(searchButton, "search_3tab", 0, 0, false, false, null, new com.tencent.mm.plugin.finder.ui.bk(this), 62, null);
    }

    public final boolean M7(com.tencent.mm.protocal.protobuf.FinderContact finderContact) {
        java.lang.String str;
        ya2.g gVar = ya2.h.f460484a;
        if (finderContact == null || (str = finderContact.getUsername()) == null) {
            str = "";
        }
        return ya2.g.h(gVar, str, null, false, false, 14, null);
    }

    public final void N7(long j17, boolean z17) {
        yz5.l lVar;
        ey2.q2 R6 = ((ey2.v2) pf5.u.f353936a.e(c61.l7.class).a(ey2.v2.class)).R6(j17, false, ey2.t2.f257519i);
        if (R6 != null) {
            zy2.c5 c5Var = new zy2.c5(pm0.v.u(j17), R6.f257481d, z17, R6.f257483f);
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.tencent.mm.plugin.finder.assist.d5.f102084a;
            java.lang.String token = this.M1;
            kotlin.jvm.internal.o.g(token, "token");
            com.tencent.mars.xlog.Log.i("FinderOpenFinderViewCallbackMgr", "token " + token + " feedId: " + c5Var.f477367a + " playbackTime: " + c5Var.f477368b + " isPause: " + c5Var.f477369c + " playbackRate: " + c5Var.f477370d);
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) com.tencent.mm.plugin.finder.assist.d5.f102084a.get(token);
            if (weakReference == null || (lVar = (yz5.l) weakReference.get()) == null) {
                return;
            }
            lVar.invoke(c5Var);
        }
    }

    public final void P7() {
        if (this.P == 13) {
            B7().f434669e.setVisibility(8);
            if (getMMTitle() != null) {
                ((android.widget.TextView) ((jz5.n) this.A).getValue()).setText(getMMTitle());
            }
        }
    }

    public final void Q7(com.tencent.mm.protocal.protobuf.FinderContact finderContact) {
        if (!this.Q1 || finderContact == null) {
            return;
        }
        java.lang.String username = finderContact.getUsername();
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        if (com.tencent.mm.sdk.platformtools.t8.D0(username, xy2.c.e(context)) || !((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).el()) {
            return;
        }
        boolean M7 = M7(finderContact);
        addTextOptionMenu(1, F7(M7), new com.tencent.mm.plugin.finder.ui.jk(this), null, M7 ? com.tencent.mm.ui.fb.FEED_UNFOLLOW : com.tencent.mm.ui.fb.FEED_FOLLOW);
        this.S1 = M7 ? 2 : 1;
    }

    public final void R7(boolean z17) {
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.mst);
        if (findViewById != null) {
            if (z17) {
                android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.mst);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderShareFeedRelUI", "showProgress", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/ui/FinderShareFeedRelUI", "showProgress", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.mst);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/ui/FinderShareFeedRelUI", "showProgress", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/ui/FinderShareFeedRelUI", "showProgress", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (((java.lang.Number) ae2.in.f3688a.u().r()).intValue() != 1 || this.f128775h2) {
                return;
            }
            findViewById.post(new com.tencent.mm.plugin.finder.ui.ri(this));
            this.f128775h2 = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        if (((r11 == null || (r11 = r11.getFeedObject()) == null || !r11.isMemberFeed()) ? false : true) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S7(boolean r11) {
        /*
            r10 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "showRetryTips ifShow:"
            r0.<init>(r1)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r10.C
            com.tencent.mars.xlog.Log.i(r1, r0)
            r0 = 2131318798(0x7f09580e, float:1.8256144E38)
            android.view.View r0 = r10.findViewById(r0)
            if (r0 == 0) goto Ldb
            r9 = 0
            if (r11 == 0) goto L97
            java.lang.String r11 = r10.R1
            r1 = 1
            if (r11 == 0) goto L2d
            int r11 = r11.length()
            if (r11 != 0) goto L2b
            goto L2d
        L2b:
            r11 = r9
            goto L2e
        L2d:
            r11 = r1
        L2e:
            if (r11 == 0) goto L44
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r11 = r10.Y
            if (r11 == 0) goto L41
            com.tencent.mm.plugin.finder.storage.FinderItem r11 = r11.getFeedObject()
            if (r11 == 0) goto L41
            boolean r11 = r11.isMemberFeed()
            if (r11 != r1) goto L41
            goto L42
        L41:
            r1 = r9
        L42:
            if (r1 == 0) goto L4c
        L44:
            com.tencent.mm.plugin.finder.ui.kk r11 = new com.tencent.mm.plugin.finder.ui.kk
            r11.<init>(r10)
            pm0.v.X(r11)
        L4c:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.lang.ThreadLocal r1 = zj0.c.f473285a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r11.add(r1)
            java.util.Collections.reverse(r11)
            java.lang.Object[] r2 = r11.toArray()
            java.lang.String r3 = "com/tencent/mm/plugin/finder/ui/FinderShareFeedRelUI"
            java.lang.String r4 = "showRetryTips"
            java.lang.String r5 = "(Z)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r1 = r0
            yj0.a.d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r11 = r11.get(r9)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r0.setVisibility(r11)
            java.lang.String r2 = "com/tencent/mm/plugin/finder/ui/FinderShareFeedRelUI"
            java.lang.String r3 = "showRetryTips"
            java.lang.String r4 = "(Z)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            r1 = r0
            yj0.a.f(r1, r2, r3, r4, r5, r6, r7)
            com.tencent.mm.plugin.finder.ui.lk r11 = new com.tencent.mm.plugin.finder.ui.lk
            r11.<init>(r10, r0)
            r0.setOnClickListener(r11)
            goto Ldb
        L97:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.lang.ThreadLocal r1 = zj0.c.f473285a
            r1 = 8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r11.add(r1)
            java.util.Collections.reverse(r11)
            java.lang.Object[] r2 = r11.toArray()
            java.lang.String r3 = "com/tencent/mm/plugin/finder/ui/FinderShareFeedRelUI"
            java.lang.String r4 = "showRetryTips"
            java.lang.String r5 = "(Z)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r1 = r0
            yj0.a.d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r11 = r11.get(r9)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r0.setVisibility(r11)
            java.lang.String r2 = "com/tencent/mm/plugin/finder/ui/FinderShareFeedRelUI"
            java.lang.String r3 = "showRetryTips"
            java.lang.String r4 = "(Z)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            r1 = r0
            yj0.a.f(r1, r2, r3, r4, r5, r6, r7)
        Ldb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI.S7(boolean):void");
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: W6 */
    public int getD() {
        jz5.g gVar = this.W;
        return ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue() != 0 ? ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue() : D7();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    public int Y6() {
        return 2;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(android.view.MotionEvent event) {
        qt2.h0 h0Var;
        kotlin.jvm.internal.o.g(event, "event");
        pf5.z zVar = pf5.z.f353948a;
        qt2.m mVar = (qt2.m) zVar.a(this).e(qt2.m.class);
        boolean z17 = false;
        if (mVar != null) {
            android.view.View view = mVar.f366588e;
            if (view != null && view.getVisibility() == 0) {
                int action = event.getAction();
                if (action == 0) {
                    mVar.f366602t = event.getY();
                } else if (action == 1) {
                    float y17 = event.getY() - mVar.f366602t;
                    android.view.View view2 = mVar.f366588e;
                    if (view2 != null && view2.getVisibility() == 0 && y17 > 0.0f && y17 > mVar.f366603u) {
                        qt2.j.P6(mVar, i65.a.b(mVar.getContext(), 80), 300L, 0.0f, 4, null);
                    }
                }
            }
        }
        qt2.f0 f0Var = (qt2.f0) zVar.a(this).e(qt2.f0.class);
        if (f0Var != null) {
            f0Var.b7(event);
        }
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.D1().r()).booleanValue() && (h0Var = (qt2.h0) zVar.a(this).e(qt2.h0.class)) != null) {
            h0Var.b7(event);
        }
        qt2.e eVar = (qt2.e) zVar.a(this).e(qt2.e.class);
        if (eVar != null) {
            android.view.View view3 = eVar.f366588e;
            if (view3 != null && view3.getVisibility() == 0) {
                z17 = true;
            }
            if (z17) {
                int action2 = event.getAction();
                if (action2 == 0) {
                    eVar.f366566x = event.getY();
                } else if (action2 == 1) {
                    float y18 = event.getY() - eVar.f366566x;
                    if (y18 > 0.0f && y18 > eVar.f366567y) {
                        eVar.Z6();
                    }
                }
            }
        }
        return super.dispatchTouchEvent(event);
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        java.lang.String str;
        com.tencent.mm.plugin.finder.ui.qm qmVar = this.D;
        if (qmVar != null && qmVar.f129753z1) {
            setResult(-1);
        }
        super.finish();
        zu2.a0 a0Var = (zu2.a0) pf5.z.f353948a.a(this).a(zu2.a0.class);
        if (a0Var.f475693e != null) {
            r45.j33 j33Var = new r45.j33();
            j33Var.set(0, java.lang.Integer.valueOf(a0Var.f475701p));
            zu2.q qVar = a0Var.f475694f;
            if (qVar != null) {
                str = qVar.f475738h.toString();
                kotlin.jvm.internal.o.f(str, "toString(...)");
            } else {
                str = "";
            }
            j33Var.set(1, str);
            com.tencent.mars.xlog.Log.i(a0Var.f475692d, "doCallback " + j33Var.getInteger(0) + ", " + j33Var.getString(1));
            zy2.i5 i5Var = zu2.p.f475730a;
            if (i5Var != null) {
                i5Var.a(j33Var);
            }
            zu2.p.f475730a = null;
        } else {
            zy2.i5 i5Var2 = zu2.p.f475730a;
            if (i5Var2 != null) {
                i5Var2.a(new r45.j33());
            }
        }
        zu2.p.f475730a = null;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489093b91;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedSupportSlideUI, com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        java.util.Set e17 = kz5.p1.e(com.tencent.mm.plugin.finder.viewmodel.component.th.class, com.tencent.mm.plugin.finder.viewmodel.component.pt.class, com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC.class, com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC.class, com.tencent.mm.plugin.finder.viewmodel.component.sx.class, zu2.a0.class, com.tencent.mm.plugin.finder.viewmodel.component.h80.class, com.tencent.mm.plugin.finder.viewmodel.component.f2.class, com.tencent.mm.plugin.finder.viewmodel.component.fy.class, ni3.n.class, cs2.k.class, hy2.m.class, com.tencent.mm.plugin.finder.viewmodel.component.gg.class, pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.h7.class)), com.tencent.mm.plugin.finder.viewmodel.component.hs.class, qt2.u.class, com.tencent.mm.plugin.finder.viewmodel.component.up.class, qt2.f0.class, qt2.h0.class, qt2.e.class, com.tencent.mm.plugin.finder.viewmodel.component.a4.class, com.tencent.mm.plugin.finder.viewmodel.component.u6.class, com.tencent.mm.plugin.finder.viewmodel.component.v6.class, com.tencent.mm.plugin.finder.viewmodel.component.pv.class, com.tencent.mm.plugin.finder.viewmodel.component.ye.class, com.tencent.mm.plugin.finder.viewmodel.component.di.class, zu2.b.class, pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.v9.class)), as2.g.class, dv2.e2.class);
        if (G7() == 15 || D7() == 25 || D7() == 38) {
            e17.add(com.tencent.mm.plugin.finder.viewmodel.component.nc.class);
        }
        return e17;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedSupportSlideUI, com.tencent.mm.ui.MMFragmentActivity
    /* renamed from: isHideStatusBar */
    public boolean getP() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedSupportSlideUI
    public com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader m7() {
        return E7();
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedSupportSlideUI
    public com.tencent.mm.plugin.finder.feed.dj n7() {
        com.tencent.mm.plugin.finder.ui.qm qmVar = this.D;
        if (qmVar != null) {
            return qmVar;
        }
        kotlin.jvm.internal.o.o("presenter");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedSupportSlideUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        B7().f434672h.setVisibility(8);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014e  */
    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedSupportSlideUI, com.tencent.mm.plugin.finder.ui.slideprofile.FinderHomeSlideProfileUI, com.tencent.mm.plugin.finder.ui.MMFinderFeedDetailUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 581
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public void onCreateBeforeSetContentView() {
        super.onCreateBeforeSetContentView();
        if (com.tencent.mm.ui.bk.C()) {
            setTheme(com.tencent.mm.R.style.f494380li);
        } else {
            setTheme(com.tencent.mm.R.style.f494381lj);
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedSupportSlideUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        android.util.ArrayMap arrayMap;
        org.json.JSONArray b17;
        fc2.c n17;
        fc2.c n18;
        fc2.c n19;
        fc2.c n110;
        com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI baseSearchWebViewUI;
        if (G7() != 0 && !this.Y1) {
            if (this.Q1) {
                i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) c17;
                long j17 = this.f128784p0;
                int G7 = G7();
                java.lang.String str = this.S;
                if (str == null) {
                    str = "";
                }
                java.lang.String str2 = str;
                androidx.appcompat.app.AppCompatActivity context = getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
                o3Var.Qj(j17, G7, 4L, str2, 0, (r33 & 32) != 0 ? 0 : 2, (r33 & 64) != 0 ? null : null, (r33 & 128) != 0 ? null : nyVar != null ? nyVar.V6().getString(1) : null, (r33 & 256) != 0 ? 0 : this.f128776i2, (r33 & 512) != 0 ? 0L : 0L, (r33 & 1024) != 0 ? null : null);
            } else {
                i95.m c18 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                com.tencent.mm.plugin.finder.report.o3 o3Var2 = (com.tencent.mm.plugin.finder.report.o3) c18;
                long j18 = this.f128784p0;
                int G72 = G7();
                java.lang.String str3 = this.S;
                if (str3 == null) {
                    str3 = "";
                }
                java.lang.String str4 = str3;
                androidx.appcompat.app.AppCompatActivity context2 = getContext();
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = context2 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
                o3Var2.Rj(j18, G72, str4, 0, (r27 & 16) != 0 ? 0 : 2, (r27 & 32) != 0 ? null : nyVar2 != null ? nyVar2.V6().getString(1) : null, (r27 & 64) != 0 ? 0 : this.f128776i2, (r27 & 128) != 0 ? 0L : 0L, (r27 & 256) != 0 ? null : null);
            }
            this.Y1 = true;
        }
        java.lang.String str5 = this.D1;
        if (!(str5 == null || str5.length() == 0)) {
            zg0.p3 p3Var = (zg0.p3) i95.n0.c(zg0.p3.class);
            java.lang.String keepAliveToken = this.D1;
            ((yg0.q4) p3Var).getClass();
            com.tencent.mm.plugin.webview.ui.tools.newjsapi.j8 j8Var = com.tencent.mm.plugin.webview.ui.tools.newjsapi.j8.f186285d;
            kotlin.jvm.internal.o.g(keepAliveToken, "keepAliveToken");
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) com.tencent.mm.plugin.webview.ui.tools.newjsapi.j8.f186286e.remove(keepAliveToken);
            if (weakReference != null && (baseSearchWebViewUI = (com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI) weakReference.get()) != null) {
                baseSearchWebViewUI.f184264v4 = 0;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenFinderView", "resetKeepAlice: ".concat(keepAliveToken));
        }
        C7().onDetach();
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
        androidx.appcompat.app.AppCompatActivity context3 = getContext();
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny e17 = iyVar.e(context3);
        if (e17 != null && (n110 = zy2.ra.n1(e17, 0, 1, null)) != null) {
            n110.d(C7());
        }
        ((com.tencent.mm.plugin.finder.feed.model.s3) ((zy2.h8) ((jz5.n) this.U).getValue())).onDetach();
        androidx.appcompat.app.AppCompatActivity context4 = getContext();
        kotlin.jvm.internal.o.f(context4, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny e18 = iyVar.e(context4);
        if (e18 != null && (n19 = zy2.ra.n1(e18, 0, 1, null)) != null) {
            com.tencent.mm.plugin.finder.feed.model.s3 s3Var = (com.tencent.mm.plugin.finder.feed.model.s3) ((zy2.h8) ((jz5.n) this.U).getValue());
            s3Var.getClass();
            n19.d(s3Var);
        }
        androidx.appcompat.app.AppCompatActivity context5 = getContext();
        kotlin.jvm.internal.o.f(context5, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny e19 = iyVar.e(context5);
        if (e19 != null && (n18 = zy2.ra.n1(e19, 0, 1, null)) != null) {
            n18.d(this.f128782n2);
        }
        com.tencent.mm.plugin.finder.report.v1 v1Var = com.tencent.mm.plugin.finder.report.v1.f125393a;
        int H7 = H7();
        com.tencent.mm.plugin.finder.viewmodel.component.ny e27 = iyVar.e(this);
        v1Var.x(H7, e27 != null ? e27.V6() : null);
        com.tencent.mm.sdk.event.IListener iListener = this.W1;
        if (iListener != null) {
            iListener.dead();
        }
        com.tencent.mm.plugin.finder.feed.v9 v9Var = this.X1;
        if (v9Var != null) {
            androidx.appcompat.app.AppCompatActivity context6 = getContext();
            kotlin.jvm.internal.o.f(context6, "getContext(...)");
            com.tencent.mm.plugin.finder.viewmodel.component.ny e28 = iyVar.e(context6);
            if (e28 != null && (n17 = zy2.ra.n1(e28, 0, 1, null)) != null) {
                n17.d(v9Var.f108812j);
            }
            v9Var.c();
        }
        this.X1 = null;
        if (getIntent().getBooleanExtra("is_report_feed", false)) {
            com.tencent.mm.autogen.events.FinderIpcResultEvent finderIpcResultEvent = new com.tencent.mm.autogen.events.FinderIpcResultEvent();
            am.kb kbVar = finderIpcResultEvent.f54280g;
            kbVar.getClass();
            com.tencent.mm.plugin.finder.report.s3 s3Var2 = com.tencent.mm.plugin.finder.report.s3.f125345a;
            synchronized (s3Var2) {
                int i17 = rl.b.f397143a;
                com.tencent.mars.xlog.Log.i("Finder.SearchFeedInfoCollector", "report", null);
                arrayMap = com.tencent.mm.plugin.finder.report.s3.f125346b;
                java.util.Collection values = arrayMap.values();
                kotlin.jvm.internal.o.f(values, "<get-values>(...)");
                b17 = s3Var2.b(values);
            }
            kbVar.f7137a = b17.toString();
            finderIpcResultEvent.e();
            synchronized (s3Var2) {
                com.tencent.mars.xlog.Log.i("Finder.SearchFeedInfoCollector", "clear", null);
                arrayMap.clear();
            }
        }
        for (java.util.Map.Entry entry : this.N1.entrySet()) {
            N7(((java.lang.Number) entry.getKey()).longValue(), ((java.lang.Boolean) entry.getValue()).booleanValue());
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.tencent.mm.plugin.finder.assist.d5.f102084a;
        kotlin.jvm.internal.m0.c(com.tencent.mm.plugin.finder.assist.d5.f102084a).remove(this.M1);
        this.N1.clear();
        if (this.f128784p0 != 0 && getD() == 184) {
            pf5.u uVar = pf5.u.f353936a;
            ey2.u2 Q6 = ((ey2.v2) uVar.e(c61.l7.class).a(ey2.v2.class)).Q6(this.f128784p0);
            if (Q6 != null) {
                com.tencent.mars.xlog.Log.i(this.C, "OnExitFinderFullscreenEvent isPause:" + Q6.f257550g + " playbackRate:" + Q6.f257549f + " playbackTime:" + (Q6.f257548e / 1000));
                com.tencent.mm.autogen.events.OnExitFinderFullscreenEvent onExitFinderFullscreenEvent = new com.tencent.mm.autogen.events.OnExitFinderFullscreenEvent();
                am.om omVar = onExitFinderFullscreenEvent.f54569g;
                omVar.f7558a = "didExit";
                omVar.f7560c = Q6.f257550g;
                omVar.f7561d = Q6.f257549f;
                omVar.f7559b = (((float) Q6.f257548e) * 1.0f) / ((float) 1000);
                if (!android.text.TextUtils.isEmpty(this.C1)) {
                    so2.i3 c19 = cu2.x.c(cu2.x.f222449a, this.C1, false, false, false, 14, null);
                    am.om omVar2 = onExitFinderFullscreenEvent.f54569g;
                    r45.n23 n23Var = new r45.n23();
                    n23Var.set(20, pm0.v.u(this.f128784p0));
                    n23Var.set(1, c19.field_mediaId);
                    n23Var.set(11, java.lang.Long.valueOf(c19.field_cacheSize));
                    n23Var.set(12, java.lang.Long.valueOf(c19.field_totalSize));
                    n23Var.set(13, java.lang.Integer.valueOf(c19.field_dynamicRangeType));
                    n23Var.set(14, java.lang.Integer.valueOf(c19.field_state));
                    n23Var.set(21, java.lang.Boolean.valueOf(c19.field_moovReady));
                    omVar2.f7562e = n23Var;
                }
                onExitFinderFullscreenEvent.e();
            }
            ((ey2.v2) uVar.e(c61.l7.class).a(ey2.v2.class)).f257558h.clear();
        }
        super.onDestroy();
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00dc, code lost:
    
        if (r4 == r10.C) goto L66;
     */
    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedSupportSlideUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPause() {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI.onPause():void");
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedSupportSlideUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        zu2.a0 a0Var = (zu2.a0) pf5.z.f353948a.a(this).a(zu2.a0.class);
        com.tencent.mm.plugin.finder.ui.qm qmVar = this.D;
        if (qmVar == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        a0Var.f475705t = qmVar;
        if (this.Q1) {
            com.tencent.mm.sdk.event.IListener iListener = this.W1;
            if (iListener != null) {
                iListener.dead();
            }
            boolean M7 = M7(this.U1);
            com.tencent.mars.xlog.Log.i(this.C, "isFollowed: " + M7 + " followStatus:" + this.S1);
            if (this.T1 != null) {
                int i17 = this.S1;
                if (i17 != 1) {
                    if (i17 == 2 && !M7) {
                        A7(true);
                    }
                } else if (M7) {
                    A7(false);
                }
                this.T1 = null;
            }
            if (this.S1 == 0) {
                Q7(this.U1);
            }
        }
        com.tencent.mm.plugin.finder.report.v1.f125393a.s(H7());
        int d17 = getD();
        if (d17 == 25 || d17 == 38) {
            p52.c cVar = p52.h.f352016a;
        } else if (d17 == 39) {
            p52.c cVar2 = p52.h.f352016a;
        }
        if (this.f128784p0 != 0 && getD() == 184) {
            new com.tencent.mm.autogen.events.OnEnterFinderFullscreenEvent().e();
        }
        if (((java.lang.Number) ae2.in.f3688a.u().r()).intValue() != 1) {
            i95.m c17 = i95.n0.c(zy2.zb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            com.tencent.mm.plugin.finder.feed.w8 w8Var = this.E;
            if (w8Var == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            zy2.zb.Kh(zbVar, w8Var.getRecyclerView(), ml2.x1.f328203g, java.lang.String.valueOf(getD()), ml2.y.f328240e, 0, 0L, 0, 112, null);
        }
        J7();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        com.tencent.mm.plugin.finder.feed.w8 w8Var = this.E;
        java.util.ArrayList arrayList = null;
        if (w8Var == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = w8Var.getRecyclerView();
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        r45.gl0 gl0Var = new r45.gl0();
        java.lang.String v17 = gm0.j1.u().c().v(com.tencent.mm.storage.u3.USERINFO_FINDER_SYNC_SHARE_STREAM_TRIGGER_CONFIG_STRING_SYNC, "");
        kotlin.jvm.internal.o.d(v17);
        if (v17.length() > 0) {
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                kotlin.Result.m521constructorimpl(gl0Var.parseFrom(com.tencent.mm.sdk.platformtools.t8.h(v17)));
            } catch (java.lang.Throwable th6) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[tryRecordShareStreamExposeItem] report_switch=");
        sb6.append(gl0Var.getInteger(0));
        sb6.append("\nreport_ts_interval=");
        sb6.append(gl0Var.getInteger(1));
        sb6.append("\nshare_stream_check_entrance_reddot=");
        sb6.append(gl0Var.getBoolean(25));
        sb6.append("\nexposeFeedSet=");
        java.util.HashSet hashSet = com.tencent.mm.plugin.finder.extension.reddot.sa.f105864b;
        if (hashSet != null) {
            arrayList = new java.util.ArrayList(kz5.d0.q(hashSet, 10));
            java.util.Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                arrayList.add(pm0.v.u(((java.lang.Number) it.next()).longValue()));
            }
        }
        sb6.append(arrayList);
        com.tencent.mars.xlog.Log.i("FinderShareStreamRedDotHelper", sb6.toString());
        if (gl0Var.getInteger(0) > 0 || gl0Var.getBoolean(25)) {
            ym5.a1.g(recyclerView, new com.tencent.mm.plugin.finder.extension.reddot.ra());
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        java.util.ArrayList arrayList;
        boolean z17;
        boolean z18;
        r45.vs2 vs2Var;
        r45.vs2 vs2Var2;
        super.onStop();
        com.tencent.mm.plugin.finder.extension.reddot.sa saVar = com.tencent.mm.plugin.finder.extension.reddot.sa.f105863a;
        zy2.fa nk6 = ((c61.l7) i95.n0.c(c61.l7.class)).nk();
        com.tencent.mm.plugin.finder.extension.reddot.jb L0 = nk6.L0("FinderEntrance");
        r45.gl0 gl0Var = new r45.gl0();
        java.lang.String v17 = gm0.j1.u().c().v(com.tencent.mm.storage.u3.USERINFO_FINDER_SYNC_SHARE_STREAM_TRIGGER_CONFIG_STRING_SYNC, "");
        kotlin.jvm.internal.o.d(v17);
        boolean z19 = true;
        if (v17.length() > 0) {
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                kotlin.Result.m521constructorimpl(gl0Var.parseFrom(com.tencent.mm.sdk.platformtools.t8.h(v17)));
            } catch (java.lang.Throwable th6) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[triggerShareEntrance] report_switch=");
        sb6.append(gl0Var.getInteger(0));
        sb6.append("\nreport_ts_interval=");
        sb6.append(gl0Var.getInteger(1));
        sb6.append("\nshare_stream_check_entrance_reddot=");
        sb6.append(gl0Var.getBoolean(25));
        sb6.append("\nexposeFeedSet=");
        java.util.HashSet hashSet = com.tencent.mm.plugin.finder.extension.reddot.sa.f105864b;
        if (hashSet != null) {
            arrayList = new java.util.ArrayList(kz5.d0.q(hashSet, 10));
            java.util.Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                arrayList.add(pm0.v.u(((java.lang.Number) it.next()).longValue()));
            }
        } else {
            arrayList = null;
        }
        sb6.append(arrayList);
        sb6.append("\nFinderEntrance feedId=$");
        sb6.append(pm0.v.u((L0 == null || (vs2Var2 = L0.field_ctrInfo) == null) ? 0L : vs2Var2.C));
        com.tencent.mars.xlog.Log.i("FinderShareStreamRedDotHelper", sb6.toString());
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        if (gl0Var.getBoolean(25)) {
            z17 = saVar.a(L0);
            if (z17) {
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("[revokeRedDot] feed:");
                sb8.append(pm0.v.u((L0 == null || (vs2Var = L0.field_ctrInfo) == null) ? 0L : vs2Var.C));
                sb8.append(" have expose,删除红点，并清除缓存feed内容!\t");
                sb7.append(sb8.toString());
                r45.tt2 tt2Var = new r45.tt2();
                java.util.LinkedList list = tt2Var.getList(0);
                r45.ut2 ut2Var = new r45.ut2();
                ut2Var.set(0, "FinderEntrance");
                ut2Var.set(1, 0);
                list.add(ut2Var);
                zy2.ia.P0(nk6, "FinderShareStreamRedDotHelper", tt2Var, null, 4, null);
                if (L0 != null) {
                    nk6.o0("FinderShareStreamRedDotHelper", L0);
                }
            }
        } else {
            z17 = false;
        }
        if (gl0Var.getInteger(0) > 0) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FINDER_SYNC_SCENE_FROM_SHARE_STREAM_TRIGGER_TIME_LONG_SYNC;
            long t17 = c17.t(u3Var, 0L);
            long j17 = (currentTimeMillis - t17) / 1000;
            sb7.append("curTime=" + currentTimeMillis + ",lastFetchTime=" + t17 + ",passTime=" + j17 + ",ts_interval=" + gl0Var.getInteger(1) + ';');
            boolean z27 = j17 > ((long) gl0Var.getInteger(1));
            if (z27) {
                sb7.append("请求间隔超过ts_interval，发起finderSync!\t");
            } else {
                z27 = z17 ? true : saVar.a(L0);
                if (z27) {
                    sb7.append("请求间隔没超过ts_interval，但是红点feed已读，发起finderSync!\t");
                }
            }
            if (z27) {
                ya2.u1.a(((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).P, 826259965, 26, null, null, 8, null);
                long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(currentTimeMillis2));
                sb7.append("trigger finder sync fetchTime=" + currentTimeMillis2 + ", scene=26!");
            } else {
                sb7.append("无需发起finderSync");
            }
        }
        if (sb7.length() > 0) {
            com.tencent.mars.xlog.Log.i("FinderShareStreamRedDotHelper", "triggerShareEntrance " + ((java.lang.Object) sb7));
        } else {
            if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
                z18 = true;
            } else {
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                z18 = false;
            }
            if (!z18 && !z65.c.a()) {
                kb2.b bVar = kb2.b.f306225a;
                z19 = false;
            }
            if (z19) {
                com.tencent.mars.xlog.Log.i("FinderShareStreamRedDotHelper", "triggerShareEntrance empty!");
            }
        }
        java.util.HashSet hashSet2 = com.tencent.mm.plugin.finder.extension.reddot.sa.f105864b;
        if (hashSet2 != null) {
            hashSet2.clear();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:219:0x0722, code lost:
    
        if (r1 != 23) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x0654, code lost:
    
        if ((r1 != null || r1.length() == 0) == false) goto L230;
     */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x071e  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0743  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x074f  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0806  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x08c2  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x08d2  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0928  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0965  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0975  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x098d  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0d61  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x08d5  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0808  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x086d A[LOOP:1: B:385:0x083a->B:395:0x086d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0877 A[EDGE_INSN: B:396:0x0877->B:397:0x0877 BREAK  A[LOOP:1: B:385:0x083a->B:395:0x086d], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0768  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0441  */
    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedSupportSlideUI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q7() {
        /*
            Method dump skipped, instructions count: 3442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI.q7():void");
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedSupportSlideUI
    public boolean r7() {
        com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC finderProfileDrawerUIC = (com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC) pf5.z.f353948a.a(this).e(com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC.class);
        return (finderProfileDrawerUIC != null && finderProfileDrawerUIC.onBackPressed()) || ((zu2.a0) pf5.z.f353948a.a(this).a(zu2.a0.class)).onBackPressed();
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedSupportSlideUI
    public boolean s7() {
        return super.s7() || y7() || z7();
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedSupportSlideUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity
    public void setMMTitle(java.lang.String str) {
        super.setMMTitle(str);
        P7();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderFeedDetailUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        if (getIntent().getBooleanExtra("key_enable_ringtone_bubble", false)) {
            set.remove(pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.j6.class)));
            set.remove(pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.z6.class)));
            set.remove(pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.i7.class)));
            set.remove(pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.b7.class)));
            set.remove(pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.i6.class)));
            set.remove(pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.d7.class)));
            set.remove(pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.b9.class)));
        }
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedSupportSlideUI
    public void u7() {
        super.u7();
        if (z7()) {
            B7().f434674j.setVisibility(0);
            B7().f434677m.setVisibility(0);
        } else if (y7()) {
            B7().f434674j.setVisibility(0);
            B7().f434677m.setVisibility(8);
        } else {
            B7().f434674j.setVisibility(8);
            B7().f434677m.setVisibility(8);
        }
    }

    public final boolean y7() {
        boolean Dk = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Dk();
        boolean isTeenMode = ((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode();
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        return (!((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Ke).getValue()).r()).booleanValue() || Dk || isTeenMode) ? false : true;
    }

    public final boolean z7() {
        com.tencent.mm.plugin.finder.ui.qm qmVar;
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (!((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f128024xc).getValue()).r()).booleanValue() || ((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode() || this.f128777j2 || (qmVar = this.D) == null) {
            return false;
        }
        if (qmVar.K == null) {
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = qmVar.f106570t;
            if (!((baseFeedLoader == null || baseFeedLoader.isEmpty()) ? false : true)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.feed.ui.FinderLoaderFeedSupportSlideUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity
    public void setMMTitle(java.lang.CharSequence charSequence) {
        super.setMMTitle(charSequence);
        P7();
    }
}
