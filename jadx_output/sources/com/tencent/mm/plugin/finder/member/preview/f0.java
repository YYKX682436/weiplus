package com.tencent.mm.plugin.finder.member.preview;

/* loaded from: classes2.dex */
public final class f0 extends eo2.j {

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f121213e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.ViewGroup f121214f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f121215g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f121216h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f121217i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f121218m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f121219n;

    /* renamed from: o, reason: collision with root package name */
    public int f121220o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f121219n = "";
    }

    public static void V6(com.tencent.mm.plugin.finder.member.preview.f0 f0Var, android.view.View view, yz5.l lVar, int i17, java.lang.Object obj) {
        com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawer U6;
        android.view.View view2 = (i17 & 1) != 0 ? null : view;
        yz5.l lVar2 = (i17 & 2) != 0 ? null : lVar;
        pf5.u uVar = pf5.u.f353936a;
        com.tencent.mm.plugin.finder.member.preview.o0 o0Var = (com.tencent.mm.plugin.finder.member.preview.o0) uVar.b(f0Var.getContext()).e(com.tencent.mm.plugin.finder.member.preview.o0.class);
        if (o0Var != null) {
            com.tencent.mm.plugin.finder.member.preview.n0 n0Var = o0Var.f121266d;
            if (n0Var != null) {
                n0Var.a();
            }
            com.tencent.mm.plugin.finder.member.preview.n0 n0Var2 = o0Var.f121267e;
            if (n0Var2 != null) {
                n0Var2.a();
            }
        }
        com.tencent.mm.plugin.finder.playlist.w1 w1Var = (com.tencent.mm.plugin.finder.playlist.w1) uVar.b(f0Var.getContext()).e(com.tencent.mm.plugin.finder.playlist.w1.class);
        if (w1Var != null && (U6 = w1Var.U6()) != null) {
            U6.u();
        }
        eo2.b bVar = (eo2.b) uVar.b(f0Var.getContext()).e(eo2.b.class);
        int i18 = bVar != null ? bVar.f255558d : 0;
        go2.a1 a1Var = (go2.a1) uVar.b(f0Var.getContext()).e(go2.a1.class);
        if (a1Var != null) {
            r45.tr0 tr0Var = (r45.tr0) f0Var.f255580d;
            java.lang.Integer valueOf = tr0Var != null ? java.lang.Integer.valueOf(tr0Var.f386730n) : null;
            r45.tr0 tr0Var2 = (r45.tr0) f0Var.f255580d;
            java.lang.Integer valueOf2 = tr0Var2 != null ? java.lang.Integer.valueOf(tr0Var2.f386736t) : null;
            r45.tr0 tr0Var3 = (r45.tr0) f0Var.f255580d;
            a1Var.R6(valueOf, valueOf2, tr0Var3 != null ? java.lang.Integer.valueOf(tr0Var3.f386738v) : null, f0Var.f121219n, view2, i18, f0Var.f121220o, lVar2);
        }
    }

    @Override // eo2.j
    public void O6() {
        java.lang.String stringExtra = getIntent().getStringExtra("key_author_finder_name");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f121219n = stringExtra;
        this.f121220o = getIntent().getIntExtra("key_member_preview_mode", 0);
        ya2.h.f460484a.b(this.f121219n);
    }

    @Override // eo2.j
    public void P6() {
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.kqj);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f121213e = findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.rzt);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f121214f = (android.view.ViewGroup) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.krf);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById3;
        this.f121216h = textView;
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        com.tencent.mm.ui.bk.r0(((android.widget.TextView) findViewById(com.tencent.mm.R.id.kqh)).getPaint(), 0.8f);
        com.tencent.mm.ui.bk.r0(((android.widget.TextView) findViewById(com.tencent.mm.R.id.kqw)).getPaint(), 0.8f);
        android.widget.TextView textView2 = this.f121216h;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("payTipsTitle");
            throw null;
        }
        com.tencent.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.krd);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f121215g = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.kr6);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f121217i = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.kqi);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f121218m = findViewById6;
        findViewById6.setOnClickListener(new com.tencent.mm.plugin.finder.member.preview.d0(this));
        android.widget.TextView textView3 = this.f121217i;
        if (textView3 == null) {
            kotlin.jvm.internal.o.o("payPrice");
            throw null;
        }
        qg0.h0 h0Var = (qg0.h0) i95.n0.c(qg0.h0.class);
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        ((pg0.s3) h0Var).getClass();
        textView3.setTypeface(com.tencent.mm.wallet_core.ui.r1.F(activity, 4));
        if (com.tencent.mm.ui.bk.C()) {
            android.view.View view = this.f121213e;
            if (view == null) {
                kotlin.jvm.internal.o.o("payContainer");
                throw null;
            }
            view.setBackgroundColor(com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.f478518a0));
        }
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        android.view.View view2 = this.f121218m;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("payBtn");
            throw null;
        }
        ((cy1.a) rVar).pk(view2, "become_member");
        dy1.r rVar2 = (dy1.r) i95.n0.c(dy1.r.class);
        android.view.View view3 = this.f121218m;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("payBtn");
            throw null;
        }
        ((cy1.a) rVar2).ik(view3, 40, 25496);
        dy1.r rVar3 = (dy1.r) i95.n0.c(dy1.r.class);
        android.view.View view4 = this.f121218m;
        if (view4 == null) {
            kotlin.jvm.internal.o.o("payBtn");
            throw null;
        }
        jz5.l[] lVarArr = new jz5.l[6];
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        eo2.b bVar = (eo2.b) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(eo2.b.class);
        lVarArr[0] = new jz5.l("member_inlet_source", java.lang.Integer.valueOf(bVar != null ? bVar.f255558d : 0));
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
        com.tencent.mm.plugin.finder.viewmodel.component.ny e17 = iyVar.e(getContext());
        lVarArr[1] = new jz5.l("comment_scene", e17 != null ? java.lang.Integer.valueOf(e17.f135380n) : null);
        lVarArr[2] = new jz5.l("finder_username", this.f121219n);
        com.tencent.mm.plugin.finder.viewmodel.component.ny e18 = iyVar.e(getContext());
        lVarArr[3] = new jz5.l("finder_tab_context_id", e18 != null ? e18.f135386r : null);
        com.tencent.mm.plugin.finder.viewmodel.component.ny e19 = iyVar.e(getContext());
        lVarArr[4] = new jz5.l("finder_context_id", e19 != null ? e19.f135382p : null);
        com.tencent.mm.plugin.finder.viewmodel.component.ny e27 = iyVar.e(getContext());
        lVarArr[5] = new jz5.l("behaviour_session_id", e27 != null ? e27.f135385q : null);
        ((cy1.a) rVar3).gk(view4, kz5.c1.k(lVarArr));
        android.widget.TextView textView4 = this.f121215g;
        if (textView4 == null) {
            kotlin.jvm.internal.o.o("payTips");
            throw null;
        }
        textView4.setTextColor(getResources().getColor(com.tencent.mm.R.color.FG_0));
        android.widget.TextView textView5 = this.f121215g;
        if (textView5 == null) {
            kotlin.jvm.internal.o.o("payTips");
            throw null;
        }
        textView5.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y0(getContext()));
        java.lang.String string = getContext().getResources().getString(com.tencent.mm.R.string.elw);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String string2 = getContext().getResources().getString(com.tencent.mm.R.string.emq, string);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        android.text.SpannableString spannableString = new android.text.SpannableString(string2);
        int L = r26.n0.L(string2, string, 0, false, 6, null);
        spannableString.setSpan(new com.tencent.mm.plugin.finder.view.yl(string2, getContext().getResources().getColor(com.tencent.mm.R.color.f479308vo), getContext().getResources().getColor(com.tencent.mm.R.color.a9e), false, false, new com.tencent.mm.plugin.finder.member.preview.e0(this)), L, string.length() + L, 17);
        android.widget.TextView textView6 = this.f121215g;
        if (textView6 != null) {
            textView6.setText(spannableString);
        } else {
            kotlin.jvm.internal.o.o("payTips");
            throw null;
        }
    }

    @Override // eo2.j
    public void U6() {
        r45.tr0 tr0Var = (r45.tr0) this.f255580d;
        if (tr0Var != null) {
            if (tr0Var.A == 1) {
                android.view.ViewGroup viewGroup = this.f121214f;
                if (viewGroup != null) {
                    viewGroup.setVisibility(8);
                    return;
                } else {
                    kotlin.jvm.internal.o.o("payTipsLayout");
                    throw null;
                }
            }
            if (tr0Var.f386726g == 0) {
                android.view.View view = this.f121213e;
                if (view == null) {
                    kotlin.jvm.internal.o.o("payContainer");
                    throw null;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/member/preview/FinderMemberPreviewPayUIC", "updateViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/member/preview/FinderMemberPreviewPayUIC", "updateViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (com.tencent.mm.ui.bk.C()) {
                    android.view.View view2 = this.f121213e;
                    if (view2 == null) {
                        kotlin.jvm.internal.o.o("payContainer");
                        throw null;
                    }
                    view2.setBackgroundColor(com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.f478518a0));
                }
            }
            int i17 = tr0Var.f386736t;
            if (i17 <= 0 || tr0Var.f386738v != 1) {
                i17 = tr0Var.f386730n;
            }
            android.widget.TextView textView = this.f121217i;
            if (textView != null) {
                textView.setText(java.lang.String.valueOf(i17));
            } else {
                kotlin.jvm.internal.o.o("payPrice");
                throw null;
            }
        }
    }
}
