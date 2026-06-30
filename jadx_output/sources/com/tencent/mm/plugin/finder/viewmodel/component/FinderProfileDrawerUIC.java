package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class FinderProfileDrawerUIC extends com.tencent.mm.ui.component.UIComponent implements zy2.w9 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.vas.VASCommonFragment f133619d;

    /* renamed from: e, reason: collision with root package name */
    public int f133620e;

    /* renamed from: f, reason: collision with root package name */
    public gx2.q f133621f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.FrameLayout f133622g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f133623h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f133624i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f133625m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f133626n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f133627o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f133628p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f133629q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC$changeFeedListener$1 f133630r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC$changeFeedListener$1] */
    public FinderProfileDrawerUIC(final androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f133623h = true;
        this.f133624i = "";
        this.f133625m = true;
        this.f133629q = new java.util.concurrent.CopyOnWriteArrayList();
        this.f133630r = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderProfileChangeFeedEvent>(activity) { // from class: com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC$changeFeedListener$1
            {
                this.__eventId = 363516633;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderProfileChangeFeedEvent finderProfileChangeFeedEvent) {
                com.tencent.mm.autogen.events.FinderProfileChangeFeedEvent event = finderProfileChangeFeedEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.wc wcVar = event.f54317g;
                if (wcVar == null) {
                    return true;
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[changeFeedListener], ");
                sb6.append(wcVar.f8276a);
                sb6.append(", ");
                sb6.append(wcVar.f8277b);
                sb6.append(", ");
                com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC finderProfileDrawerUIC = this;
                sb6.append(finderProfileDrawerUIC.f133625m);
                sb6.append(", ");
                sb6.append(finderProfileDrawerUIC.f133624i);
                sb6.append(", ");
                sb6.append(finderProfileDrawerUIC);
                com.tencent.mars.xlog.Log.i("FinderProfileDrawerUIC", sb6.toString());
                if (!finderProfileDrawerUIC.f133625m) {
                    return true;
                }
                gx2.q qVar = finderProfileDrawerUIC.f133621f;
                if (qVar != null) {
                    com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout.b(qVar, false, null, false, null, 15, null);
                }
                finderProfileDrawerUIC.S6(wcVar.f8276a, 30, null);
                return true;
            }
        };
    }

    public final void O6(int i17) {
        gx2.q qVar = this.f133621f;
        if (qVar != null) {
            if (i17 <= 0 || qVar == null) {
                return;
            }
            qVar.setExpandHeight(i17);
            return;
        }
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getContext());
        frameLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        frameLayout.setId(com.tencent.mm.R.id.g3v);
        frameLayout.setBackgroundColor(frameLayout.getContext().getResources().getColor(com.tencent.mm.R.color.a9e));
        this.f133622g = frameLayout;
        float k17 = i17 > 0 ? i17 : (i65.a.k(getContext()) + com.tencent.mm.ui.bk.p(getContext())) * kx2.a.f313278a.a(getContext());
        gx2.a aVar = new gx2.a();
        aVar.f277337c = k17;
        aVar.f277338d = new hx2.g(getContext(), 0, 0, 0, false, false, 62, null);
        android.widget.FrameLayout frameLayout2 = this.f133622g;
        kotlin.jvm.internal.o.d(frameLayout2);
        aVar.f277339e = new hx2.c(frameLayout2);
        aVar.a(new com.tencent.mm.plugin.finder.viewmodel.component.av(this));
        aVar.f277340f = new hx2.b(getContext(), false, 2, null);
        gx2.q b17 = aVar.b(lk5.s.a(getActivity()));
        this.f133621f = b17;
        b17.setOnDrawerDetach(new com.tencent.mm.plugin.finder.viewmodel.component.bv(this));
        gx2.q qVar2 = this.f133621f;
        if (qVar2 == null) {
            return;
        }
        qVar2.setOnDrawerWillClose(new com.tencent.mm.plugin.finder.viewmodel.component.cv(this));
    }

    public final boolean P6() {
        gx2.q qVar = this.f133621f;
        if (qVar != null) {
            return qVar.isDrawerOpen;
        }
        return false;
    }

    public final void Q6(android.content.Intent intent, int i17) {
        com.tencent.mm.ui.vas.VASActivity vASActivity;
        android.content.Intent intent2;
        com.tencent.mm.ui.vas.VASActivity vASActivity2;
        android.content.Intent intent3;
        com.tencent.mm.ui.vas.VASActivity vASActivity3;
        android.content.Intent intent4;
        kotlin.jvm.internal.o.g(intent, "intent");
        java.lang.String stringExtra = intent.getStringExtra("finder_username");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f133624i = stringExtra;
        int hashCode = this.f133624i.hashCode() ^ java.lang.Long.hashCode(intent.getLongExtra("finder_read_feed_id", 0L));
        if (this.f133620e != hashCode) {
            O6(i17);
            intent.putExtra("key_is_auto_report", false);
            androidx.fragment.app.i2 beginTransaction = getActivity().getSupportFragmentManager().beginTransaction();
            kotlin.jvm.internal.o.f(beginTransaction, "beginTransaction(...)");
            android.widget.FrameLayout frameLayout = this.f133622g;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            com.tencent.mm.ui.vas.VASCommonFragment b17 = lk5.q0.b("com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI", intent, false, 4, null);
            this.f133619d = b17;
            b17.setMenuVisibility(false);
            com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment = this.f133619d;
            if (vASCommonFragment != null) {
                vASCommonFragment.q0(new com.tencent.mm.plugin.finder.viewmodel.component.fv(this));
            }
            gx2.q qVar = this.f133621f;
            if (qVar != null) {
                qVar.setContentReachTop(new com.tencent.mm.plugin.finder.viewmodel.component.gv(this));
            }
            com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment2 = this.f133619d;
            kotlin.jvm.internal.o.d(vASCommonFragment2);
            beginTransaction.k(com.tencent.mm.R.id.g3v, vASCommonFragment2, null);
            beginTransaction.f();
            this.f133620e = hashCode;
            return;
        }
        O6(0);
        int intExtra = intent.getIntExtra("key_click_avatar_type", 0);
        com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment3 = this.f133619d;
        if (vASCommonFragment3 != null && (vASActivity3 = vASCommonFragment3.f211121p) != null && (intent4 = vASActivity3.getIntent()) != null) {
            intent4.putExtra("key_click_avatar_type", intExtra);
        }
        boolean booleanExtra = intent.getBooleanExtra("key_if_living", false);
        com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment4 = this.f133619d;
        if (vASCommonFragment4 != null && (vASActivity2 = vASCommonFragment4.f211121p) != null && (intent3 = vASActivity2.getIntent()) != null) {
            intent3.putExtra("key_if_living", booleanExtra);
        }
        long longExtra = intent.getLongExtra("finder_from_feed_id", 0L);
        com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment5 = this.f133619d;
        if (vASCommonFragment5 != null && (vASActivity = vASCommonFragment5.f211121p) != null && (intent2 = vASActivity.getIntent()) != null) {
            intent2.putExtra("finder_from_feed_id", longExtra);
        }
        this.f133627o = true;
        gx2.q qVar2 = this.f133621f;
        if (qVar2 != null) {
            com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout.m(qVar2, false, 1, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean] */
    public final void R6(boolean z17) {
        com.tencent.mm.ui.vas.VASActivity vASActivity;
        com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment = this.f133619d;
        android.content.Intent intent = null;
        com.tencent.mm.ui.vas.VASActivity vASActivity2 = vASCommonFragment != null ? vASCommonFragment.f211121p : null;
        com.tencent.mars.xlog.Log.i("FinderProfileDrawerUIC", "reportPageEvent isExit:" + z17);
        if (vASActivity2 != null) {
            com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment2 = this.f133619d;
            if (vASCommonFragment2 != null && (vASActivity = vASCommonFragment2.f211121p) != null) {
                intent = vASActivity.getIntent();
            }
            long longExtra = intent != null ? intent.getLongExtra("finder_from_feed_id", 0L) : 0L;
            int intExtra = intent != null ? intent.getIntExtra("key_click_avatar_type", 0) : 0;
            int booleanExtra = intent != null ? intent.getBooleanExtra("key_if_living", false) : 0;
            com.tencent.mm.plugin.finder.viewmodel.component.ut utVar = (com.tencent.mm.plugin.finder.viewmodel.component.ut) pf5.z.f353948a.a(vASActivity2).a(com.tencent.mm.plugin.finder.viewmodel.component.ut.class);
            utVar.P6("source_feedid", pm0.v.u(longExtra));
            utVar.O6("click_avatar_type", intExtra);
            utVar.O6("if_living", booleanExtra);
            utVar.R6(z17);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.lang.Object] */
    public final void S6(long j17, int i17, so2.j5 j5Var) {
        so2.j5 j5Var2;
        so2.j5 j5Var3;
        if (i17 == 0) {
            com.tencent.mars.xlog.Log.i("FinderProfileDrawerUIC", "tryScrollToFeed feedId=" + j17 + ", maxFindPage=0, return");
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f133628p;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            this.f133628p = null;
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderProfileDrawerUIC", "tryScrollToFeed feedId=" + pm0.v.u(j17) + ", maxFindPage=" + i17);
        android.app.Activity context = getContext();
        com.tencent.mm.plugin.finder.feed.ui.FinderProfileTimeLineUI finderProfileTimeLineUI = context instanceof com.tencent.mm.plugin.finder.feed.ui.FinderProfileTimeLineUI ? (com.tencent.mm.plugin.finder.feed.ui.FinderProfileTimeLineUI) context : null;
        if (finderProfileTimeLineUI == null) {
            return;
        }
        com.tencent.mm.plugin.finder.feed.kr krVar = finderProfileTimeLineUI.f109506u;
        if (krVar == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader m17 = krVar.m();
        if (j5Var == null) {
            java.util.Iterator it = m17.getDataList().iterator();
            while (true) {
                if (!it.hasNext()) {
                    j5Var3 = 0;
                    break;
                } else {
                    j5Var3 = it.next();
                    if (((so2.j5) j5Var3).getItemId() == j17) {
                        break;
                    }
                }
            }
            j5Var2 = j5Var3;
        } else {
            j5Var2 = j5Var;
        }
        androidx.appcompat.app.AppCompatActivity context2 = getActivity();
        kotlin.jvm.internal.o.g(context2, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context2 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        if (V6 != null) {
            V6.getInteger(5);
        }
        if (j5Var2 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
            int i18 = ((c61.l7) i95.n0.c(c61.l7.class)).ek().I;
        }
        com.tencent.mm.plugin.finder.feed.xr xrVar = finderProfileTimeLineUI.f109511z;
        java.lang.Integer valueOf = xrVar != null ? java.lang.Integer.valueOf(xrVar.g(j17)) : null;
        if (valueOf == null || valueOf.intValue() != -1) {
            com.tencent.mm.ui.widget.dialog.u3 u3Var2 = this.f133628p;
            if (u3Var2 != null) {
                u3Var2.dismiss();
            }
            this.f133628p = null;
            return;
        }
        if (m17.getHasMore()) {
            if (this.f133628p == null) {
                this.f133628p = db5.e1.Q(getContext(), "", getString(com.tencent.mm.R.string.ggc), false, false, null);
            }
            m17.callOnNextFetch(new com.tencent.mm.plugin.finder.viewmodel.component.hv(this, j17, i17));
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.requestLoadMore$default(m17, false, 1, null);
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderProfileDrawerUIC", "tryScrollToFeed feedId=" + j17 + ", hasMore=false, return");
        com.tencent.mm.ui.widget.dialog.u3 u3Var3 = this.f133628p;
        if (u3Var3 != null) {
            u3Var3.dismiss();
        }
        this.f133628p = null;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        if (!P6()) {
            return super.onBackPressed();
        }
        gx2.q qVar = this.f133621f;
        if (qVar == null) {
            return true;
        }
        com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout.b(qVar, false, null, false, null, 15, null);
        return true;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        alive();
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.s0().r()).booleanValue()) {
            com.tencent.mm.plugin.finder.viewmodel.component.bh bhVar = com.tencent.mm.plugin.finder.viewmodel.component.bh.f133877a;
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            kotlinx.coroutines.l.d(v65.m.b(activity), null, null, new com.tencent.mm.plugin.finder.viewmodel.component.sg(activity, null), 3, null);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        dead();
        this.f133621f = null;
        this.f133619d = null;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        gx2.q qVar;
        com.tencent.mm.ui.vas.VASActivity vASActivity;
        android.content.Intent intent;
        com.tencent.mm.ui.vas.VASActivity vASActivity2;
        android.content.Intent intent2;
        super.onPause();
        boolean z17 = false;
        this.f133625m = false;
        com.tencent.mars.xlog.Log.i("FinderProfileDrawerUIC", "onPause isOpen:" + this.f133626n + " toOpen:" + this.f133627o);
        if (this.f133626n) {
            R6(true);
            return;
        }
        if (this.f133627o) {
            com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment = this.f133619d;
            int intExtra = (vASCommonFragment == null || (vASActivity2 = vASCommonFragment.f211121p) == null || (intent2 = vASActivity2.getIntent()) == null) ? 0 : intent2.getIntExtra("key_click_avatar_type", 0);
            com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment2 = this.f133619d;
            boolean booleanExtra = (vASCommonFragment2 == null || (vASActivity = vASCommonFragment2.f211121p) == null || (intent = vASActivity.getIntent()) == null) ? false : intent.getBooleanExtra("key_if_living", false);
            if (intExtra == 1 && booleanExtra) {
                z17 = true;
            }
            if (!z17 || (qVar = this.f133621f) == null) {
                return;
            }
            qVar.postDelayed(new com.tencent.mm.plugin.finder.viewmodel.component.dv(this), 1000L);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        this.f133625m = true;
        if (this.f133623h) {
            this.f133623h = false;
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderProfileDrawerUIC", "onResume isOpen:" + this.f133626n + " toOpen:" + this.f133627o);
        gx2.q qVar = this.f133621f;
        if (qVar != null) {
            com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout.o(qVar, 0, false, null, false, null, 31, null);
        }
        if (this.f133626n) {
            R6(false);
        }
    }
}
