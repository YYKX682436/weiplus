package id2;

/* loaded from: classes3.dex */
public final class u3 extends com.tencent.mm.ui.component.UIComponent implements zy2.j8 {

    /* renamed from: p, reason: collision with root package name */
    public static r45.lk2 f290818p;

    /* renamed from: d, reason: collision with root package name */
    public fg2.o1 f290819d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f290820e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f290821f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f290822g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.pu f290823h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.l8 f290824i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.wt f290825m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.xt f290826n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f290827o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f290820e = new java.util.ArrayList();
        this.f290821f = jz5.h.b(new id2.r2(this));
        this.f290822g = new java.util.ArrayList();
    }

    public static final void O6(id2.u3 u3Var, android.content.Context context, long j17) {
        u3Var.getClass();
        az2.f a17 = az2.c.a(az2.f.f16125d, context, null, 0L, null, 14, null);
        a17.a();
        i95.m c17 = i95.n0.c(c61.yb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        c61.yb ybVar = (c61.yb) c17;
        android.app.Activity context2 = u3Var.getContext();
        kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        c61.yb.Gh(ybVar, (com.tencent.mm.ui.MMActivity) context2, j17, "", 0, 2, "", true, null, null, 0L, null, false, false, null, null, false, 0, null, new id2.a3(a17, u3Var, context), 245632, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object P6(id2.u3 r5, java.lang.String r6, kotlin.coroutines.Continuation r7) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: id2.u3.P6(id2.u3, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void Q6(id2.u3 u3Var, android.content.Context context, long j17, long j18, boolean z17, boolean z18, boolean z19, boolean z27, yz5.p pVar) {
        u3Var.getClass();
        com.tencent.mars.xlog.Log.i("FinderLivePersonalCente", "[setLongFeedGen] needDanmu = " + z17 + ", onlyMember = " + z18 + ",genHighlight = " + z19 + ", enableAutoGen = " + z27);
        r45.hx0 hx0Var = new r45.hx0();
        hx0Var.set(0, 0);
        r45.r02 r02Var = new r45.r02();
        r02Var.set(0, 1);
        r02Var.set(1, 0);
        r02Var.set(2, java.lang.Integer.valueOf(z17 ? 1 : 0));
        r02Var.set(3, java.lang.Integer.valueOf(z18 ? 1 : 0));
        r02Var.set(4, java.lang.Integer.valueOf(z19 ? 1 : 0));
        r02Var.set(5, 0);
        r02Var.set(6, java.lang.Integer.valueOf(z27 ? 1 : 0));
        hx0Var.set(1, com.tencent.mm.protobuf.g.b(r02Var.toByteArray()));
        u3Var.R6(context, j17, j18, hx0Var, pVar);
    }

    public final void R6(android.content.Context context, long j17, long j18, r45.hx0 hx0Var, yz5.p pVar) {
        ek2.r1 r1Var = new ek2.r1(j17, j18, 0, hx0Var);
        r1Var.t(getContext(), null, 0L);
        pm0.v.T(r1Var.l(), new id2.d2(context, pVar));
    }

    public final void S6(java.util.ArrayList arrayList, android.view.View view) {
        java.util.Iterator it = arrayList.iterator();
        boolean z17 = false;
        while (it.hasNext()) {
            if (((yk2.g) it.next()).f462791d.getVisibility() == 0) {
                z17 = true;
            }
        }
        if (z17) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLivePersonalCenterUIC", "checkLayoutVisibility", "(Ljava/util/ArrayList;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLivePersonalCenterUIC", "checkLayoutVisibility", "(Ljava/util/ArrayList;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLivePersonalCenterUIC", "checkLayoutVisibility", "(Ljava/util/ArrayList;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLivePersonalCenterUIC", "checkLayoutVisibility", "(Ljava/util/ArrayList;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4, types: [int, boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T6(r45.lk2 r32) {
        /*
            Method dump skipped, instructions count: 1176
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: id2.u3.T6(r45.lk2):void");
    }

    public void U6() {
        java.lang.String str;
        X6(2);
        ((ml2.j0) ((zy2.zb) i95.n0.c(zy2.zb.class))).getClass();
        ml2.y4 y4Var = ml2.j0.f327583i;
        ml2.y3 y3Var = ml2.y3.f328276n;
        y4Var.getClass();
        y4Var.f328291c0 = y3Var;
        ((ml2.j0) ((zy2.zb) i95.n0.c(zy2.zb.class))).getClass();
        y4Var.m(y3Var);
        jz5.g gVar = this.f290821f;
        ((im2.p4) ((zy2.m8) ((jz5.n) gVar).getValue())).f292497q.f463009b = 6;
        zy2.m8 m8Var = (zy2.m8) ((jz5.n) gVar).getValue();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("POST_BTN_CLICK_SCENE_KEY", 3);
        ((im2.p4) m8Var).R6(intent);
        com.tencent.mm.plugin.finder.assist.a4 a4Var = com.tencent.mm.plugin.finder.assist.a4.f102002a;
        android.app.Activity context = getContext();
        com.tencent.mm.plugin.finder.ui.MMFinderUI mMFinderUI = context instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI ? (com.tencent.mm.plugin.finder.ui.MMFinderUI) context : null;
        if (mMFinderUI == null || (str = java.lang.Integer.valueOf(mMFinderUI.getD()).toString()) == null) {
            str = "";
        }
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        a4Var.b(str, b52.b.b(), "person_page_start_live", "");
    }

    public final void V6(android.view.ViewGroup viewGroup) {
        android.view.View findViewById;
        android.view.View findViewById2;
        android.view.View findViewById3;
        android.widget.TextView textView;
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.f488957eb2, viewGroup, false);
        this.f290827o = inflate;
        if (inflate != null && (textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.t19)) != null) {
            com.tencent.mm.ui.fk.a(textView);
        }
        android.view.View view = this.f290827o;
        if (view != null && (findViewById3 = view.findViewById(com.tencent.mm.R.id.t18)) != null) {
            findViewById3.setOnClickListener(new id2.k2(this));
        }
        android.view.View view2 = this.f290827o;
        if (view2 != null && (findViewById2 = view2.findViewById(com.tencent.mm.R.id.t17)) != null) {
            findViewById2.setOnClickListener(new id2.l2(this));
        }
        android.view.View view3 = this.f290827o;
        if (view3 != null && (findViewById = view3.findViewById(com.tencent.mm.R.id.rhl)) != null) {
            findViewById.setOnClickListener(new id2.m2(this));
        }
        W6();
        android.view.View view4 = this.f290827o;
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = (int) getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479738dv);
        viewGroup.addView(view4, layoutParams);
    }

    public final void W6() {
        android.view.View findViewById;
        android.widget.TextView textView;
        android.widget.ImageView imageView;
        android.view.View view = this.f290827o;
        if (view == null || (findViewById = view.findViewById(com.tencent.mm.R.id.t1_)) == null) {
            return;
        }
        m92.b I1 = g92.a.I1(g92.b.f269769e, false, 1, null);
        if (I1 == null) {
            android.view.View view2 = this.f290827o;
            android.view.View findViewById2 = view2 != null ? view2.findViewById(com.tencent.mm.R.id.ur6) : null;
            if (findViewById2 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLivePersonalCenterUIC", "renderFakeCreateLiveEntranceData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLivePersonalCenterUIC", "renderFakeCreateLiveEntranceData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view3 = this.f290827o;
            android.view.View findViewById3 = view3 != null ? view3.findViewById(com.tencent.mm.R.id.f486364ur5) : null;
            if (findViewById3 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLivePersonalCenterUIC", "renderFakeCreateLiveEntranceData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLivePersonalCenterUIC", "renderFakeCreateLiveEntranceData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view4 = this.f290827o;
            android.view.View findViewById4 = view4 != null ? view4.findViewById(com.tencent.mm.R.id.t18) : null;
            if (findViewById4 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(findViewById4, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLivePersonalCenterUIC", "renderFakeCreateLiveEntranceData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLivePersonalCenterUIC", "renderFakeCreateLiveEntranceData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById, arrayList4.toArray(), "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLivePersonalCenterUIC", "renderFakeCreateLiveEntranceData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLivePersonalCenterUIC", "renderFakeCreateLiveEntranceData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view5 = this.f290827o;
        android.view.View findViewById5 = view5 != null ? view5.findViewById(com.tencent.mm.R.id.ur6) : null;
        if (findViewById5 != null) {
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(findViewById5, arrayList5.toArray(), "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLivePersonalCenterUIC", "renderFakeCreateLiveEntranceData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(findViewById5, "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLivePersonalCenterUIC", "renderFakeCreateLiveEntranceData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view6 = this.f290827o;
        android.view.View findViewById6 = view6 != null ? view6.findViewById(com.tencent.mm.R.id.f486364ur5) : null;
        if (findViewById6 != null) {
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(findViewById6, arrayList6.toArray(), "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLivePersonalCenterUIC", "renderFakeCreateLiveEntranceData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(findViewById6, "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLivePersonalCenterUIC", "renderFakeCreateLiveEntranceData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view7 = this.f290827o;
        android.view.View findViewById7 = view7 != null ? view7.findViewById(com.tencent.mm.R.id.t18) : null;
        if (findViewById7 != null) {
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal7 = zj0.c.f473285a;
            arrayList7.add(8);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(findViewById7, arrayList7.toArray(), "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLivePersonalCenterUIC", "renderFakeCreateLiveEntranceData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(findViewById7, "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLivePersonalCenterUIC", "renderFakeCreateLiveEntranceData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        java.util.ArrayList arrayList8 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal8 = zj0.c.f473285a;
        arrayList8.add(0);
        java.util.Collections.reverse(arrayList8);
        yj0.a.d(findViewById, arrayList8.toArray(), "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLivePersonalCenterUIC", "renderFakeCreateLiveEntranceData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLivePersonalCenterUIC", "renderFakeCreateLiveEntranceData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view8 = this.f290827o;
        if (view8 != null && (imageView = (android.widget.ImageView) view8.findViewById(com.tencent.mm.R.id.f483983t16)) != null) {
            mn2.g1 g1Var = mn2.g1.f329975a;
            g1Var.a().c(new mn2.n(I1.field_avatarUrl, null, 2, null), imageView, g1Var.h(mn2.f1.f329957h));
        }
        android.view.View view9 = this.f290827o;
        if (view9 == null || (textView = (android.widget.TextView) view9.findViewById(com.tencent.mm.R.id.t1a)) == null) {
            return;
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.app.Activity context = getContext();
        java.lang.String str = I1.field_nickname;
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, str, textSize));
    }

    public void X6(int i17) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        jSONObject.put("entrance_type", 6);
        jSONObject.put("entrance_id", ((im2.p4) ((zy2.m8) ((jz5.n) this.f290821f).getValue())).f292497q.f463010c);
        gk2.e eVar = dk2.ef.I;
        if (eVar != null) {
            mm2.g1 g1Var = (mm2.g1) eVar.a(mm2.g1.class);
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
        jSONObject.put("finder_username", ((k40.f) ((l40.e) i95.n0.c(l40.e.class))).Ui(getContext()));
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.c1 c1Var = ml2.c1.f327325e;
        zy2.zb.j5(zbVar, 36L, jSONObject.toString(), null, 4, null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.aww;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i18 == 1) {
            com.tencent.mars.xlog.Log.i("FinderLivePersonalCente", "onActivityResult, create account success");
            X6(15);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        this.f290827o = null;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        W6();
        r45.lk2 lk2Var = f290818p;
        if (lk2Var != null) {
            T6(lk2Var);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onViewCreated(android.view.View contentView) {
        kotlin.jvm.internal.o.g(contentView, "contentView");
        super.onViewCreated(contentView);
        android.view.View findViewById = contentView.findViewById(com.tencent.mm.R.id.ffk);
        int i17 = com.tencent.mm.R.id.f483030uo;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(findViewById, com.tencent.mm.R.id.f483030uo);
        if (linearLayout != null) {
            i17 = com.tencent.mm.R.id.f483031uq;
            android.widget.TextView textView = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.f483031uq);
            if (textView != null) {
                i17 = com.tencent.mm.R.id.t2l;
                android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) x4.b.a(findViewById, com.tencent.mm.R.id.t2l);
                if (linearLayout2 != null) {
                    i17 = com.tencent.mm.R.id.t2m;
                    android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.t2m);
                    if (textView2 != null) {
                        i17 = com.tencent.mm.R.id.tl7;
                        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(findViewById, com.tencent.mm.R.id.tl7);
                        if (weImageView != null) {
                            i17 = com.tencent.mm.R.id.tl8;
                            android.widget.TextView textView3 = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.tl8);
                            if (textView3 != null) {
                                i17 = com.tencent.mm.R.id.tl9;
                                android.widget.TextView textView4 = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.tl9);
                                if (textView4 != null) {
                                    i17 = com.tencent.mm.R.id.tl_;
                                    android.widget.TextView textView5 = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.tl_);
                                    if (textView5 != null) {
                                        i17 = com.tencent.mm.R.id.tla;
                                        android.widget.TextView textView6 = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.tla);
                                        if (textView6 != null) {
                                            android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) findViewById;
                                            i17 = com.tencent.mm.R.id.g5h;
                                            android.widget.TextView textView7 = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.g5h);
                                            if (textView7 != null) {
                                                i17 = com.tencent.mm.R.id.g5i;
                                                android.widget.TextView textView8 = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.g5i);
                                                if (textView8 != null) {
                                                    i17 = com.tencent.mm.R.id.g5j;
                                                    android.widget.TextView textView9 = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.g5j);
                                                    if (textView9 != null) {
                                                        i17 = com.tencent.mm.R.id.twc;
                                                        android.widget.TextView textView10 = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.twc);
                                                        if (textView10 != null) {
                                                            i17 = com.tencent.mm.R.id.u7y;
                                                            android.widget.LinearLayout linearLayout4 = (android.widget.LinearLayout) x4.b.a(findViewById, com.tencent.mm.R.id.u7y);
                                                            if (linearLayout4 != null) {
                                                                i17 = com.tencent.mm.R.id.hpm;
                                                                android.widget.LinearLayout linearLayout5 = (android.widget.LinearLayout) x4.b.a(findViewById, com.tencent.mm.R.id.hpm);
                                                                if (linearLayout5 != null) {
                                                                    i17 = com.tencent.mm.R.id.hpn;
                                                                    android.widget.LinearLayout linearLayout6 = (android.widget.LinearLayout) x4.b.a(findViewById, com.tencent.mm.R.id.hpn);
                                                                    if (linearLayout6 != null) {
                                                                        i17 = com.tencent.mm.R.id.hps;
                                                                        android.widget.LinearLayout linearLayout7 = (android.widget.LinearLayout) x4.b.a(findViewById, com.tencent.mm.R.id.hps);
                                                                        if (linearLayout7 != null) {
                                                                            i17 = com.tencent.mm.R.id.u7z;
                                                                            android.widget.LinearLayout linearLayout8 = (android.widget.LinearLayout) x4.b.a(findViewById, com.tencent.mm.R.id.u7z);
                                                                            if (linearLayout8 != null) {
                                                                                i17 = com.tencent.mm.R.id.f485449u80;
                                                                                android.widget.LinearLayout linearLayout9 = (android.widget.LinearLayout) x4.b.a(findViewById, com.tencent.mm.R.id.f485449u80);
                                                                                if (linearLayout9 != null) {
                                                                                    i17 = com.tencent.mm.R.id.klf;
                                                                                    android.widget.LinearLayout linearLayout10 = (android.widget.LinearLayout) x4.b.a(findViewById, com.tencent.mm.R.id.klf);
                                                                                    if (linearLayout10 != null) {
                                                                                        i17 = com.tencent.mm.R.id.l7d;
                                                                                        android.widget.TextView textView11 = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.l7d);
                                                                                        if (textView11 != null) {
                                                                                            i17 = com.tencent.mm.R.id.l7e;
                                                                                            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) x4.b.a(findViewById, com.tencent.mm.R.id.l7e);
                                                                                            if (weImageView2 != null) {
                                                                                                i17 = com.tencent.mm.R.id.l7f;
                                                                                                android.widget.TextView textView12 = (android.widget.TextView) x4.b.a(findViewById, com.tencent.mm.R.id.l7f);
                                                                                                if (textView12 != null) {
                                                                                                    i17 = com.tencent.mm.R.id.f486732ma2;
                                                                                                    android.widget.LinearLayout linearLayout11 = (android.widget.LinearLayout) x4.b.a(findViewById, com.tencent.mm.R.id.f486732ma2);
                                                                                                    if (linearLayout11 != null) {
                                                                                                        this.f290819d = new fg2.o1(linearLayout3, linearLayout, textView, linearLayout2, textView2, weImageView, textView3, textView4, textView5, textView6, linearLayout3, textView7, textView8, textView9, textView10, linearLayout4, linearLayout5, linearLayout6, linearLayout7, linearLayout8, linearLayout9, linearLayout10, textView11, weImageView2, textView12, linearLayout11);
                                                                                                        java.util.ArrayList arrayList = this.f290820e;
                                                                                                        arrayList.add(new yk2.l(linearLayout8));
                                                                                                        fg2.o1 o1Var = this.f290819d;
                                                                                                        if (o1Var == null) {
                                                                                                            kotlin.jvm.internal.o.o("uiBinding");
                                                                                                            throw null;
                                                                                                        }
                                                                                                        android.widget.LinearLayout jumpFinderReservedRecord = o1Var.f262197h;
                                                                                                        kotlin.jvm.internal.o.f(jumpFinderReservedRecord, "jumpFinderReservedRecord");
                                                                                                        arrayList.add(new yk2.m(jumpFinderReservedRecord));
                                                                                                        fg2.o1 o1Var2 = this.f290819d;
                                                                                                        if (o1Var2 == null) {
                                                                                                            kotlin.jvm.internal.o.o("uiBinding");
                                                                                                            throw null;
                                                                                                        }
                                                                                                        android.widget.LinearLayout jumpFinderPrivateMsg = o1Var2.f262196g;
                                                                                                        kotlin.jvm.internal.o.f(jumpFinderPrivateMsg, "jumpFinderPrivateMsg");
                                                                                                        arrayList.add(new yk2.h(jumpFinderPrivateMsg));
                                                                                                        fg2.o1 o1Var3 = this.f290819d;
                                                                                                        if (o1Var3 == null) {
                                                                                                            kotlin.jvm.internal.o.o("uiBinding");
                                                                                                            throw null;
                                                                                                        }
                                                                                                        android.widget.LinearLayout jumpFinderLiveMoreOption = o1Var3.f262194e;
                                                                                                        kotlin.jvm.internal.o.f(jumpFinderLiveMoreOption, "jumpFinderLiveMoreOption");
                                                                                                        arrayList.add(new yk2.f(jumpFinderLiveMoreOption));
                                                                                                        ae2.in inVar = ae2.in.f3688a;
                                                                                                        if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.W7).getValue()).r()).intValue() == 1) {
                                                                                                            fg2.o1 o1Var4 = this.f290819d;
                                                                                                            if (o1Var4 == null) {
                                                                                                                kotlin.jvm.internal.o.o("uiBinding");
                                                                                                                throw null;
                                                                                                            }
                                                                                                            o1Var4.f262193d.setVisibility(0);
                                                                                                            fg2.o1 o1Var5 = this.f290819d;
                                                                                                            if (o1Var5 == null) {
                                                                                                                kotlin.jvm.internal.o.o("uiBinding");
                                                                                                                throw null;
                                                                                                            }
                                                                                                            android.widget.LinearLayout jumpFinderLiveMentions = o1Var5.f262193d;
                                                                                                            kotlin.jvm.internal.o.f(jumpFinderLiveMentions, "jumpFinderLiveMentions");
                                                                                                            arrayList.add(new yk2.e(jumpFinderLiveMentions));
                                                                                                        }
                                                                                                        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.B).getValue()).r()).intValue();
                                                                                                        java.util.ArrayList arrayList2 = this.f290822g;
                                                                                                        if (intValue == 0) {
                                                                                                            fg2.o1 o1Var6 = this.f290819d;
                                                                                                            if (o1Var6 == null) {
                                                                                                                kotlin.jvm.internal.o.o("uiBinding");
                                                                                                                throw null;
                                                                                                            }
                                                                                                            android.widget.LinearLayout jumpFinderLiveProductOrderCenter = o1Var6.f262195f;
                                                                                                            kotlin.jvm.internal.o.f(jumpFinderLiveProductOrderCenter, "jumpFinderLiveProductOrderCenter");
                                                                                                            arrayList2.add(new yk2.i(jumpFinderLiveProductOrderCenter));
                                                                                                        }
                                                                                                        fg2.o1 o1Var7 = this.f290819d;
                                                                                                        if (o1Var7 == null) {
                                                                                                            kotlin.jvm.internal.o.o("uiBinding");
                                                                                                            throw null;
                                                                                                        }
                                                                                                        android.widget.LinearLayout scanSettingLayout = o1Var7.f262199j;
                                                                                                        kotlin.jvm.internal.o.f(scanSettingLayout, "scanSettingLayout");
                                                                                                        S6(arrayList, scanSettingLayout);
                                                                                                        fg2.o1 o1Var8 = this.f290819d;
                                                                                                        if (o1Var8 == null) {
                                                                                                            kotlin.jvm.internal.o.o("uiBinding");
                                                                                                            throw null;
                                                                                                        }
                                                                                                        android.widget.LinearLayout orderRecordLayout = o1Var8.f262198i;
                                                                                                        kotlin.jvm.internal.o.f(orderRecordLayout, "orderRecordLayout");
                                                                                                        S6(arrayList2, orderRecordLayout);
                                                                                                        kotlinx.coroutines.l.d(v65.m.b(getActivity()), null, null, new id2.u2(this, null), 3, null);
                                                                                                        return;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i17)));
    }
}
