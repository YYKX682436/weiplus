package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class z2 extends com.tencent.mm.ui.component.UIComponent implements zy2.u7 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f117557d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f117558e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f117559f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f117560g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f117561h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f117562i;

    /* renamed from: m, reason: collision with root package name */
    public r45.lc1 f117563m;

    /* renamed from: n, reason: collision with root package name */
    public r45.s02 f117564n;

    /* renamed from: o, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f117565o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f117566p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f117567q;

    /* renamed from: r, reason: collision with root package name */
    public yz5.a f117568r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f117557d = "Micro.FinderJoinLiveVisibleInfoUIC";
        this.f117560g = new java.util.LinkedList();
        this.f117565o = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) kotlinx.coroutines.t3.a(null, 1, null)).plus(kotlinx.coroutines.q1.f310570c));
        this.f117567q = jz5.h.b(new com.tencent.mm.plugin.finder.live.viewmodel.y2(this));
    }

    public static final void O6(com.tencent.mm.plugin.finder.live.viewmodel.z2 z2Var) {
        z2Var.getClass();
        r45.aw1 aw1Var = dk2.u7.f234194n;
        java.lang.String str = "currentLevel = " + id2.v1.N;
        java.lang.String str2 = z2Var.f117557d;
        com.tencent.mars.xlog.Log.i(str2, str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("url: ");
        sb6.append(aw1Var != null ? aw1Var.getString(3) : null);
        com.tencent.mars.xlog.Log.i(str2, sb6.toString());
        java.lang.String u07 = zl2.r4.f473950a.u0(aw1Var);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", u07);
        intent.putExtra("convertActivityFromTranslucent", true);
        j45.l.n(z2Var.getContext(), "webview", ".ui.tools.WebViewUI", intent, 1016);
        yz5.a aVar = z2Var.f117568r;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object P6(kotlin.coroutines.Continuation r28) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.viewmodel.z2.P6(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public android.view.View Q6(r45.lc1 lc1Var, r45.s02 modInfo, boolean z17, boolean z18, boolean z19) {
        java.lang.Object obj;
        boolean z27;
        kotlin.jvm.internal.o.g(modInfo, "modInfo");
        this.f117566p = false;
        this.f117563m = lc1Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[refresh] data = ");
        if (lc1Var == null || (obj = pm0.b0.g(lc1Var)) == null) {
            obj = "null";
        }
        sb6.append(obj);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f117557d;
        com.tencent.mars.xlog.Log.i(str, sb7);
        if (lc1Var != null) {
            this.f117561h = z17;
            this.f117562i = z18;
            this.f117564n = modInfo;
            boolean z28 = pm0.v.z(lc1Var.getInteger(0), 1);
            boolean z29 = pm0.v.z(lc1Var.getInteger(0), 2);
            boolean z37 = pm0.v.z(lc1Var.getInteger(0), 4);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_USER_INFO_FINDER_SETTING_LONG_SYNC;
            boolean z38 = (16 & c17.t(u3Var, 0L)) != 0;
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            boolean z39 = (32 & gm0.j1.u().c().t(u3Var, 0L)) != 0;
            boolean z47 = (z38 || z39) ? false : true;
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            boolean z48 = !((512 & gm0.j1.u().c().t(u3Var, 0L)) != 0);
            com.tencent.mars.xlog.Log.i(str, "[refresh] hasNormalOption:" + z28 + ", hasInvisibleVipOption:" + z29 + ", hasHideIdentityOption:" + z37 + ", enableShowMysteriousAudienceInfo:" + z48 + ", chooseInvisibleVip:" + z38 + ", chooseHideIdentity:" + z39);
            if (z29 || z37) {
                java.util.LinkedList linkedList = this.f117560g;
                linkedList.clear();
                if (z28) {
                    java.lang.String string = getActivity().getString(com.tencent.mm.R.string.nqg);
                    kotlin.jvm.internal.o.f(string, "getString(...)");
                    java.lang.String string2 = getActivity().getString(com.tencent.mm.R.string.nqh);
                    kotlin.jvm.internal.o.f(string2, "getString(...)");
                    linkedList.add(new com.tencent.mm.plugin.finder.live.viewmodel.m2(0, string, string2, z47, null, 16, null));
                }
                if (z29) {
                    java.lang.String string3 = getActivity().getString(com.tencent.mm.R.string.nqc);
                    kotlin.jvm.internal.o.f(string3, "getString(...)");
                    java.lang.String string4 = getActivity().getString(com.tencent.mm.R.string.nqd);
                    kotlin.jvm.internal.o.f(string4, "getString(...)");
                    z27 = z39;
                    linkedList.add(new com.tencent.mm.plugin.finder.live.viewmodel.m2(1, string3, string4, z38, null, 16, null));
                } else {
                    z27 = z39;
                }
                if (z37) {
                    java.lang.String string5 = getActivity().getString(com.tencent.mm.R.string.nqi);
                    kotlin.jvm.internal.o.f(string5, "getString(...)");
                    java.lang.String string6 = getActivity().getString(com.tencent.mm.R.string.nqj);
                    kotlin.jvm.internal.o.f(string6, "getString(...)");
                    com.tencent.mm.plugin.finder.live.viewmodel.l2 l2Var = new com.tencent.mm.plugin.finder.live.viewmodel.l2(1, string5, string6, z48);
                    java.lang.String string7 = getActivity().getString(com.tencent.mm.R.string.nqe);
                    kotlin.jvm.internal.o.f(string7, "getString(...)");
                    java.lang.String string8 = getActivity().getString(com.tencent.mm.R.string.nqf);
                    kotlin.jvm.internal.o.f(string8, "getString(...)");
                    linkedList.add(new com.tencent.mm.plugin.finder.live.viewmodel.m2(2, string7, string8, z27, l2Var));
                }
                android.view.View inflate = com.tencent.mm.ui.id.b(getActivity()).inflate(com.tencent.mm.R.layout.e_t, (android.view.ViewGroup) null);
                this.f117558e = inflate;
                com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = inflate != null ? (com.tencent.mm.view.recyclerview.WxRecyclerView) inflate.findViewById(com.tencent.mm.R.id.tjv) : null;
                this.f117559f = wxRecyclerView;
                jz5.g gVar = this.f117567q;
                if (wxRecyclerView != null) {
                    wxRecyclerView.setAdapter((com.tencent.mm.plugin.finder.live.viewmodel.x2) ((jz5.n) gVar).getValue());
                }
                com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = this.f117559f;
                if (wxRecyclerView2 != null) {
                    wxRecyclerView2.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext()));
                }
                ((com.tencent.mm.plugin.finder.live.viewmodel.x2) ((jz5.n) gVar).getValue()).notifyDataSetChanged();
                android.view.View view = this.f117558e;
                android.view.View findViewById = view != null ? view.findViewById(com.tencent.mm.R.id.tju) : null;
                android.view.View view2 = this.f117558e;
                android.widget.TextView textView = view2 != null ? (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.tjt) : null;
                if (this.f117562i) {
                    if (textView != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(8);
                        java.util.Collections.reverse(arrayList);
                        android.widget.TextView textView2 = textView;
                        yj0.a.d(textView2, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(java.lang.Integer.valueOf(intValue));
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(textView2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderJoinLiveVisibleInfoUIC", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        textView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(textView2, "com/tencent/mm/plugin/finder/live/viewmodel/FinderJoinLiveVisibleInfoUIC", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        yj0.a.f(textView2, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    if (findViewById != null) {
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                        arrayList3.add(0);
                        java.util.Collections.reverse(arrayList3);
                        android.view.View view3 = findViewById;
                        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        int intValue2 = ((java.lang.Integer) arrayList3.get(0)).intValue();
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        arrayList4.add(java.lang.Integer.valueOf(intValue2));
                        java.util.Collections.reverse(arrayList4);
                        yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderJoinLiveVisibleInfoUIC", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                        yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/viewmodel/FinderJoinLiveVisibleInfoUIC", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        yj0.a.f(view3, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    if (findViewById != null) {
                        findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.live.viewmodel.o2(this));
                    }
                } else {
                    java.lang.String string9 = getContext().getString(com.tencent.mm.R.string.nqa);
                    kotlin.jvm.internal.o.f(string9, "getString(...)");
                    java.lang.String string10 = getContext().getString(com.tencent.mm.R.string.nq_, string9);
                    kotlin.jvm.internal.o.f(string10, "getString(...)");
                    android.text.SpannableString spannableString = new android.text.SpannableString(string10);
                    int L = r26.n0.L(string10, string9, 0, false, 6, null);
                    if (L >= 0 && string9.length() + L <= string10.length()) {
                        spannableString.setSpan(new com.tencent.mm.plugin.finder.live.viewmodel.p2(this), L, string9.length() + L, 33);
                    }
                    if (textView != null) {
                        textView.setText(spannableString);
                    }
                    if (textView != null) {
                        textView.setHighlightColor(getContext().getResources().getColor(android.R.color.transparent));
                    }
                    if (textView != null) {
                        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
                    }
                    if (textView != null) {
                        java.util.ArrayList arrayList5 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                        arrayList5.add(0);
                        java.util.Collections.reverse(arrayList5);
                        android.widget.TextView textView3 = textView;
                        yj0.a.d(textView3, arrayList5.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        int intValue3 = ((java.lang.Integer) arrayList5.get(0)).intValue();
                        java.util.ArrayList arrayList6 = new java.util.ArrayList();
                        arrayList6.add(java.lang.Integer.valueOf(intValue3));
                        java.util.Collections.reverse(arrayList6);
                        yj0.a.d(textView3, arrayList6.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderJoinLiveVisibleInfoUIC", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        textView.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                        yj0.a.f(textView3, "com/tencent/mm/plugin/finder/live/viewmodel/FinderJoinLiveVisibleInfoUIC", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        yj0.a.f(textView3, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    if (findViewById != null) {
                        java.util.ArrayList arrayList7 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                        arrayList7.add(8);
                        java.util.Collections.reverse(arrayList7);
                        android.view.View view4 = findViewById;
                        yj0.a.d(view4, arrayList7.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        int intValue4 = ((java.lang.Integer) arrayList7.get(0)).intValue();
                        java.util.ArrayList arrayList8 = new java.util.ArrayList();
                        arrayList8.add(java.lang.Integer.valueOf(intValue4));
                        java.util.Collections.reverse(arrayList8);
                        yj0.a.d(view4, arrayList8.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderJoinLiveVisibleInfoUIC", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                        yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/viewmodel/FinderJoinLiveVisibleInfoUIC", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        yj0.a.f(view4, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
                if (!z19) {
                    android.view.View view5 = this.f117558e;
                    if (view5 != null) {
                        view5.setPadding(0, 0, 0, 0);
                    }
                    com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView3 = this.f117559f;
                    if (wxRecyclerView3 != null) {
                        wxRecyclerView3.setBackgroundColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478491c));
                    }
                }
                return this.f117558e;
            }
        }
        return null;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        kotlinx.coroutines.z0.e(this.f117565o, null, 1, null);
    }
}
