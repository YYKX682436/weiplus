package fr2;

/* loaded from: classes2.dex */
public final class p extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f265736d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f265737e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f265738f;

    /* renamed from: g, reason: collision with root package name */
    public final dk2.of f265739g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f265740h;

    /* renamed from: i, reason: collision with root package name */
    public final yl2.g1 f265741i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f265742m;

    /* renamed from: n, reason: collision with root package name */
    public final xq2.b f265743n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f265744o;

    /* renamed from: p, reason: collision with root package name */
    public long f265745p;

    /* renamed from: q, reason: collision with root package name */
    public long f265746q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.FinderObject f265747r;

    /* renamed from: s, reason: collision with root package name */
    public kotlinx.coroutines.r2 f265748s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f265749t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f265750u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(androidx.appcompat.app.AppCompatActivity act) {
        super(act);
        java.lang.String str;
        kotlin.jvm.internal.o.g(act, "act");
        this.f265736d = new java.util.ArrayList();
        java.lang.String str2 = "";
        this.f265740h = "";
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
        this.f265741i = new yl2.g1((com.tencent.mm.ui.MMFragmentActivity) activity, 7, 0L, 4, null);
        this.f265742m = true;
        androidx.lifecycle.c1 a17 = pf5.u.f353936a.e(c61.l7.class).a(xq2.b.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        this.f265743n = (xq2.b) a17;
        this.f265745p = 3600000L;
        this.f265749t = jz5.h.b(new fr2.a(this));
        this.f265750u = jz5.h.b(new fr2.b(this));
        dk2.of a18 = dk2.of.f233859j.a(getContext().getIntent());
        this.f265739g = a18;
        if (a18 != null && (str = a18.f233861a) != null) {
            str2 = str;
        }
        this.f265740h = str2;
    }

    public static final void O6(fr2.p pVar, com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        pVar.getClass();
        com.tencent.mars.xlog.Log.i("FinderLivePlayTogetherBottomBarUIC", "jumpLiveRoom: feedId=".concat(pm0.v.u(finderObject.getId())));
        android.content.Intent intent = new android.content.Intent();
        android.app.Activity context = pVar.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        pVar.f265736d.add(java.lang.Long.valueOf(finderObject.getId()));
        r45.wk0 wk0Var = new r45.wk0();
        if (V6 == null || (str = V6.getString(1)) == null) {
            str = "";
        }
        wk0Var.set(0, str);
        if (V6 == null || (str2 = V6.getString(2)) == null) {
            str2 = "";
        }
        wk0Var.set(1, str2);
        wk0Var.set(2, java.lang.Boolean.FALSE);
        wk0Var.set(3, -1);
        wk0Var.set(4, -1);
        wk0Var.set(5, 1);
        r45.y74 y74Var = new r45.y74();
        java.lang.String nickname = finderObject.getNickname();
        if (nickname == null) {
            nickname = "";
        }
        y74Var.set(2, nickname);
        y74Var.set(1, java.lang.Integer.valueOf(V6 != null ? V6.getInteger(5) : 0));
        wk0Var.set(6, y74Var);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("page_position", 2);
        intent.putExtra("key_chnl_extra", jSONObject.toString());
        com.tencent.mm.plugin.finder.model.BaseFinderFeed p17 = cu2.u.f222441a.p(com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, 0));
        ml2.x1 x1Var = ml2.x1.A;
        android.app.Activity context2 = pVar.getContext();
        kotlin.jvm.internal.o.g(context2, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        if (nyVar2 == null || (str3 = java.lang.Integer.valueOf(nyVar2.f135380n).toString()) == null) {
            str3 = "";
        }
        com.tencent.mars.xlog.Log.i("FinderLiveSquareReportUtils", "report21053 pos: 0 actionType: 19 commentscene: " + str3 + " chnlExtra: ");
        ae2.in inVar = ae2.in.f3688a;
        ((ml2.j0) ((zy2.zb) i95.n0.c(zy2.zb.class))).qj(p17, 0L, x1Var, str3, "", ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.V0).getValue()).r()).intValue() == 1 ? p17.getFeedObject().getFeedObject().getSessionBuffer() : "");
        ((vd2.f1) ((ss5.e0) i95.n0.c(ss5.e0.class))).Ni(pVar.getActivity(), intent, kz5.c0.d(finderObject), 0, wk0Var, null);
    }

    public static final void P6(fr2.p pVar, int i17) {
        pVar.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        jSONObject.put("entrance_type", 7);
        jSONObject.put("entrance_id", pVar.f265741i.f463010c);
        mm2.g1 g1Var = (mm2.g1) dk2.ef.f233372a.i(mm2.g1.class);
        if (g1Var != null) {
            java.lang.Integer num = g1Var.f329082w;
            java.lang.Long l17 = g1Var.f329083x;
            java.lang.String str = g1Var.f329084y;
            if (num != null && l17 != null && str != null) {
                long longValue = l17.longValue();
                jSONObject.put("strategy_id", num.intValue());
                jSONObject.put("guide_live_id", longValue);
                jSONObject.put("guide_finderusername", str);
            }
        }
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.c1 c1Var = ml2.c1.f327325e;
        zy2.zb.j5(zbVar, 36L, jSONObject.toString(), null, 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Q6(fr2.p r21, boolean r22, kotlin.coroutines.Continuation r23) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fr2.p.Q6(fr2.p, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void R6(android.view.View view, android.view.View view2, boolean z17) {
        if (view == null) {
            return;
        }
        view.animate().cancel();
        jz5.g gVar = this.f265750u;
        jz5.g gVar2 = this.f265749t;
        int intValue = z17 ? ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue() : ((java.lang.Number) ((jz5.n) gVar2).getValue()).intValue();
        int intValue2 = z17 ? ((java.lang.Number) ((jz5.n) gVar2).getValue()).intValue() : ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue();
        if (z17 && view2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/ui/special/uic/FinderLivePlayTogetherBottomBarUIC", "animBtnLayout", "(Landroid/view/View;Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/nearby/ui/special/uic/FinderLivePlayTogetherBottomBarUIC", "animBtnLayout", "(Landroid/view/View;Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        view.animate().withEndAction(new fr2.c(z17, view2)).setUpdateListener(new fr2.d(view, intValue, intValue2)).setDuration(300L).start();
    }

    public final void S6() {
        com.tencent.mars.xlog.Log.i("FinderLivePlayTogetherBottomBarUIC", "cancelPreload: preloadJob=" + this.f265748s);
        kotlinx.coroutines.r2 r2Var = this.f265748s;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f265748s = null;
    }

    public final void T6() {
        if (!this.f265744o || this.f265745p <= 0) {
            com.tencent.mars.xlog.Log.i("FinderLivePlayTogetherBottomBarUIC", "checkPreload: disable preload, needPreload=" + this.f265744o + ", preloadIntervalMs=" + this.f265745p);
            return;
        }
        if (this.f265748s != null) {
            com.tencent.mars.xlog.Log.i("FinderLivePlayTogetherBottomBarUIC", "checkPreload: has started loop");
        } else {
            com.tencent.mars.xlog.Log.i("FinderLivePlayTogetherBottomBarUIC", "checkPreload: start check");
            this.f265748s = kotlinx.coroutines.l.d(getLifecycleScope(), null, null, new fr2.e(this, null), 3, null);
        }
    }

    public final void U6(boolean z17) {
        if (this.f265742m == z17) {
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderLivePlayTogetherBottomBarUIC", "onScrollToTop: oldIsTop=" + this.f265742m + ", isTop=" + z17);
        this.f265742m = z17;
        R6(findViewById(com.tencent.mm.R.id.s1p), findViewById(com.tencent.mm.R.id.s1q), z17);
        R6(findViewById(com.tencent.mm.R.id.s0u), findViewById(com.tencent.mm.R.id.s0v), z17);
    }

    public final void V6(boolean z17) {
        com.tencent.mars.xlog.Log.i("FinderLivePlayTogetherBottomBarUIC", "setNeedPreload: current=" + this.f265744o + ", newNeedPreload=" + z17);
        if (this.f265744o == z17) {
            return;
        }
        this.f265744o = z17;
        if (z17) {
            T6();
        } else {
            S6();
        }
    }

    public final void W6() {
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.s0h);
        if (findViewById != null && findViewById.getVisibility() == 0) {
            return;
        }
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.s0h);
        if (findViewById2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/ui/special/uic/FinderLivePlayTogetherBottomBarUIC", "showBottomBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/nearby/ui/special/uic/FinderLivePlayTogetherBottomBarUIC", "showBottomBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.s1p);
        if (findViewById3 != null) {
            ym5.a1.h(findViewById3, new fr2.k(this));
            findViewById3.setOnClickListener(new fr2.m(this));
        }
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.s0u);
        if (findViewById4 != null) {
            ae2.in inVar = ae2.in.f3688a;
            int i17 = (((java.lang.Number) ae2.in.G5.r()).intValue() == 1 || !com.tencent.mm.ui.bk.A()) ? 0 : 8;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById4, arrayList2.toArray(), "com/tencent/mm/plugin/finder/nearby/ui/special/uic/FinderLivePlayTogetherBottomBarUIC", "showBottomBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/nearby/ui/special/uic/FinderLivePlayTogetherBottomBarUIC", "showBottomBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ym5.a1.h(findViewById4, new fr2.n(this));
            findViewById4.setOnClickListener(new fr2.o(this));
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.s1q);
        d92.f fVar = d92.f.f227470a;
        if (textView != null) {
            fVar.l(textView, 15.0f, true);
        }
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.s0v);
        if (textView2 != null) {
            fVar.l(textView2, 15.0f, true);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        getMainScope();
        java.util.ArrayList objectList = this.f265736d;
        xq2.b bVar = this.f265743n;
        bVar.getClass();
        java.lang.String themeId = this.f265740h;
        kotlin.jvm.internal.o.g(themeId, "themeId");
        kotlin.jvm.internal.o.g(objectList, "objectList");
        com.tencent.mars.xlog.Log.i("LiveThemePreloadCacheVM", "storeRandomEnterRoomReadObjects: themeId=" + themeId + ", size=" + objectList.size());
        bVar.f456042m.put(themeId, objectList);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        S6();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        T6();
    }
}
