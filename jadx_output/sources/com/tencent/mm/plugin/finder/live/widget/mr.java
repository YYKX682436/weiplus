package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class mr extends com.tencent.mm.plugin.finder.live.widget.e0 {
    public android.view.View.OnClickListener A1;
    public final gk2.e H;
    public final java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f119108J;
    public boolean K;
    public android.widget.TextView L;
    public android.view.View M;
    public com.tencent.mm.ui.widget.MMEditText N;
    public android.widget.TextView P;
    public android.view.View Q;
    public com.tencent.mm.ui.widget.imageview.WeImageView R;
    public android.widget.TextView S;
    public com.tencent.mm.plugin.finder.live.widget.FinderLiveLocSingleTagLayout T;
    public android.view.View U;
    public android.widget.TextView V;
    public android.view.View W;
    public com.tencent.mm.ui.widget.imageview.WeImageView X;
    public android.widget.TextView Y;
    public android.view.View Z;

    /* renamed from: l1, reason: collision with root package name */
    public final jz5.g f119109l1;

    /* renamed from: p0, reason: collision with root package name */
    public android.view.View f119110p0;

    /* renamed from: p1, reason: collision with root package name */
    public final jz5.g f119111p1;

    /* renamed from: x0, reason: collision with root package name */
    public java.lang.String f119112x0;

    /* renamed from: x1, reason: collision with root package name */
    public r45.ze2 f119113x1;

    /* renamed from: y0, reason: collision with root package name */
    public final jz5.g f119114y0;

    /* renamed from: y1, reason: collision with root package name */
    public final jz5.g f119115y1;

    /* renamed from: z1, reason: collision with root package name */
    public final jz5.g f119116z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mr(android.content.Context context, gk2.e buContext) {
        super(context, false, null, -1.0f, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(buContext, "buContext");
        this.H = buContext;
        this.I = "FinderLivePostStrengthenPanel";
        this.f119112x0 = "";
        this.f119114y0 = jz5.h.b(new com.tencent.mm.plugin.finder.live.widget.hr(context));
        this.f119109l1 = jz5.h.b(new com.tencent.mm.plugin.finder.live.widget.gr(context));
        this.f119111p1 = jz5.h.b(new com.tencent.mm.plugin.finder.live.widget.yq(context));
        this.f119115y1 = jz5.h.b(new com.tencent.mm.plugin.finder.live.widget.er(this, context));
        this.f119116z1 = jz5.h.b(new com.tencent.mm.plugin.finder.live.widget.cr(this));
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int A() {
        return com.tencent.mm.R.layout.eb6;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int J() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public int K() {
        return 48;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void N(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        android.content.Context context = this.f118183e;
        a0(context.getDrawable(com.tencent.mm.R.drawable.d1x));
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.f486378us5);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f119110p0 = findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.usf);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        this.L = textView;
        com.tencent.mm.ui.fk.a(textView);
        android.view.View findViewById3 = rootView.findViewById(com.tencent.mm.R.id.us8);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.M = findViewById3;
        android.view.View findViewById4 = rootView.findViewById(com.tencent.mm.R.id.us7);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.N = (com.tencent.mm.ui.widget.MMEditText) findViewById4;
        android.view.View findViewById5 = rootView.findViewById(com.tencent.mm.R.id.us9);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.P = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = rootView.findViewById(com.tencent.mm.R.id.usd);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.Q = findViewById6;
        android.view.View findViewById7 = rootView.findViewById(com.tencent.mm.R.id.use);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.R = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById7;
        android.view.View findViewById8 = rootView.findViewById(com.tencent.mm.R.id.usc);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.S = (android.widget.TextView) findViewById8;
        android.view.View findViewById9 = rootView.findViewById(com.tencent.mm.R.id.us_);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        com.tencent.mm.plugin.finder.live.widget.FinderLiveLocSingleTagLayout finderLiveLocSingleTagLayout = (com.tencent.mm.plugin.finder.live.widget.FinderLiveLocSingleTagLayout) findViewById9;
        this.T = finderLiveLocSingleTagLayout;
        finderLiveLocSingleTagLayout.U = java.lang.Boolean.TRUE;
        finderLiveLocSingleTagLayout.setTagView(com.tencent.mm.R.layout.f488966eb4);
        android.view.View findViewById10 = rootView.findViewById(com.tencent.mm.R.id.us6);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        this.U = findViewById10;
        android.view.View findViewById11 = rootView.findViewById(com.tencent.mm.R.id.f486374us1);
        kotlin.jvm.internal.o.f(findViewById11, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById11;
        this.V = textView2;
        com.tencent.mm.ui.fk.a(textView2);
        android.view.View findViewById12 = rootView.findViewById(com.tencent.mm.R.id.fg_);
        kotlin.jvm.internal.o.f(findViewById12, "findViewById(...)");
        this.W = findViewById12;
        android.view.View findViewById13 = rootView.findViewById(com.tencent.mm.R.id.tna);
        kotlin.jvm.internal.o.f(findViewById13, "findViewById(...)");
        this.X = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById13;
        android.view.View findViewById14 = rootView.findViewById(com.tencent.mm.R.id.tnl);
        kotlin.jvm.internal.o.f(findViewById14, "findViewById(...)");
        android.widget.TextView textView3 = (android.widget.TextView) findViewById14;
        this.Y = textView3;
        com.tencent.mm.ui.fk.a(textView3);
        android.view.View findViewById15 = rootView.findViewById(com.tencent.mm.R.id.f486376us3);
        kotlin.jvm.internal.o.f(findViewById15, "findViewById(...)");
        this.Z = findViewById15;
        android.view.View findViewById16 = rootView.findViewById(com.tencent.mm.R.id.f486377us4);
        kotlin.jvm.internal.o.f(findViewById16, "findViewById(...)");
        com.tencent.mm.ui.fk.a((android.widget.TextView) findViewById16);
        android.widget.TextView textView4 = this.P;
        if (textView4 == null) {
            kotlin.jvm.internal.o.o("descEdtTips");
            throw null;
        }
        textView4.setText("16");
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.N;
        if (mMEditText == null) {
            kotlin.jvm.internal.o.o("descEdt");
            throw null;
        }
        mMEditText.addTextChangedListener(new com.tencent.mm.plugin.finder.live.widget.zq(this));
        android.view.View view = this.Z;
        if (view == null) {
            kotlin.jvm.internal.o.o("confirmBtnSingle");
            throw null;
        }
        view.setOnClickListener((android.view.View.OnClickListener) ((jz5.n) this.f119115y1).getValue());
        android.widget.TextView textView5 = this.V;
        if (textView5 == null) {
            kotlin.jvm.internal.o.o("cancelBtn");
            throw null;
        }
        textView5.setOnClickListener((android.view.View.OnClickListener) ((jz5.n) this.f119116z1).getValue());
        com.tencent.mm.sdk.platformtools.d2.a(context);
        android.view.View view2 = this.M;
        if (view2 != null) {
            view2.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.ar(this));
        } else {
            kotlin.jvm.internal.o.o("descEdtGroup");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public boolean Q() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void S() {
        super.S();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x06df  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0756  */
    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void V(com.tencent.mm.plugin.finder.live.widget.e0 r33, boolean r34, int r35) {
        /*
            Method dump skipped, instructions count: 1904
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.mr.V(com.tencent.mm.plugin.finder.live.widget.e0, boolean, int):void");
    }

    public final void e0(int i17) {
        jz5.g gVar = this.f119114y0;
        int intValue = i17 > 0 ? !zl2.r4.f473950a.Y1(this.f118183e) ? i17 + ((java.lang.Number) ((jz5.n) this.f119109l1).getValue()).intValue() : ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue() : ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue();
        android.view.View view = this.f119110p0;
        if (view == null) {
            kotlin.jvm.internal.o.o("panelContent");
            throw null;
        }
        com.tencent.mm.ui.kk.g(view, intValue);
        android.view.View view2 = this.f119110p0;
        if (view2 != null) {
            view2.post(new com.tencent.mm.plugin.finder.live.widget.fr(this));
        } else {
            kotlin.jvm.internal.o.o("panelContent");
            throw null;
        }
    }

    public final void f0(boolean z17) {
        android.content.Context context = this.f118183e;
        if (z17) {
            android.view.View view = this.W;
            if (view == null) {
                kotlin.jvm.internal.o.o("confirmBtnInDouble");
                throw null;
            }
            view.setOnClickListener((android.view.View.OnClickListener) ((jz5.n) this.f119115y1).getValue());
            android.view.View view2 = this.W;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("confirmBtnInDouble");
                throw null;
            }
            view2.setBackgroundDrawable(context.getResources().getDrawable(com.tencent.mm.R.drawable.a0f));
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.X;
            if (weImageView == null) {
                kotlin.jvm.internal.o.o("confirmBtnInDoubleIcon");
                throw null;
            }
            weImageView.setIconColor(context.getResources().getColor(com.tencent.mm.R.color.f479549ab0));
            android.widget.TextView textView = this.Y;
            if (textView != null) {
                textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f479549ab0));
                return;
            } else {
                kotlin.jvm.internal.o.o("confirmBtnInDoubleTxt");
                throw null;
            }
        }
        android.view.View view3 = this.W;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("confirmBtnInDouble");
            throw null;
        }
        view3.setOnClickListener(null);
        android.view.View view4 = this.W;
        if (view4 == null) {
            kotlin.jvm.internal.o.o("confirmBtnInDouble");
            throw null;
        }
        view4.setBackgroundDrawable(context.getResources().getDrawable(com.tencent.mm.R.drawable.d6a));
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.X;
        if (weImageView2 == null) {
            kotlin.jvm.internal.o.o("confirmBtnInDoubleIcon");
            throw null;
        }
        weImageView2.setIconColor(context.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_3));
        android.widget.TextView textView2 = this.Y;
        if (textView2 != null) {
            textView2.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_3));
        } else {
            kotlin.jvm.internal.o.o("confirmBtnInDoubleTxt");
            throw null;
        }
    }

    public final void g0(r45.ze2 ze2Var) {
        android.content.Context context = this.f118183e;
        if (ze2Var == null) {
            android.widget.TextView textView = this.S;
            if (textView == null) {
                kotlin.jvm.internal.o.o("poiTxt");
                throw null;
            }
            textView.setText("");
            android.widget.TextView textView2 = this.S;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("poiTxt");
                throw null;
            }
            textView2.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.FG_0));
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.R;
            if (weImageView == null) {
                kotlin.jvm.internal.o.o("poiIcon");
                throw null;
            }
            weImageView.s(com.tencent.mm.R.raw.icons_outlined_location, com.tencent.mm.R.color.FG_0);
            com.tencent.mm.plugin.finder.live.widget.FinderLiveLocSingleTagLayout finderLiveLocSingleTagLayout = this.T;
            if (finderLiveLocSingleTagLayout == null) {
                kotlin.jvm.internal.o.o("poiFlow");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(finderLiveLocSingleTagLayout, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(finderLiveLocSingleTagLayout, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLivePostStrengthenPanel", "refreshOnLocPick", "(Lcom/tencent/mm/protocal/protobuf/FinderLocation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            finderLiveLocSingleTagLayout.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(finderLiveLocSingleTagLayout, "com/tencent/mm/plugin/finder/live/widget/FinderLivePostStrengthenPanel", "refreshOnLocPick", "(Lcom/tencent/mm/protocal/protobuf/FinderLocation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(finderLiveLocSingleTagLayout, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.widget.TextView textView3 = this.S;
        if (textView3 == null) {
            kotlin.jvm.internal.o.o("poiTxt");
            throw null;
        }
        java.lang.String string = ze2Var.getString(3);
        textView3.setText(string != null ? string : "");
        android.widget.TextView textView4 = this.S;
        if (textView4 == null) {
            kotlin.jvm.internal.o.o("poiTxt");
            throw null;
        }
        textView4.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f479094pt));
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.R;
        if (weImageView2 == null) {
            kotlin.jvm.internal.o.o("poiIcon");
            throw null;
        }
        weImageView2.s(com.tencent.mm.R.raw.icons_filled_location, com.tencent.mm.R.color.f479094pt);
        com.tencent.mm.plugin.finder.live.widget.FinderLiveLocSingleTagLayout finderLiveLocSingleTagLayout2 = this.T;
        if (finderLiveLocSingleTagLayout2 == null) {
            kotlin.jvm.internal.o.o("poiFlow");
            throw null;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(finderLiveLocSingleTagLayout2, arrayList3.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue2 = ((java.lang.Integer) arrayList3.get(0)).intValue();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(java.lang.Integer.valueOf(intValue2));
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(finderLiveLocSingleTagLayout2, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLivePostStrengthenPanel", "refreshOnLocPick", "(Lcom/tencent/mm/protocal/protobuf/FinderLocation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        finderLiveLocSingleTagLayout2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(finderLiveLocSingleTagLayout2, "com/tencent/mm/plugin/finder/live/widget/FinderLivePostStrengthenPanel", "refreshOnLocPick", "(Lcom/tencent/mm/protocal/protobuf/FinderLocation;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(finderLiveLocSingleTagLayout2, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void h0(int i17) {
        cl0.g gVar = new cl0.g();
        gVar.o("type", i17);
        gVar.o("show_poi_guide", this.K ? 1 : 0);
        gVar.o("show_topic_guide", this.f119108J ? 1 : 0);
        gVar.o("display_mode", ((kotlinx.coroutines.flow.h3) ((mm2.e1) this.H.a(mm2.e1.class)).E).getValue() == r45.aa0.CREATELIVEPAGEMODE_DEFAULT_MODE ? 0 : 1);
        com.tencent.mars.xlog.Log.i(this.I, "[report] json = " + gVar);
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.c1 c1Var = ml2.c1.f327325e;
        zy2.zb.j5(zbVar, 62L, gVar.toString(), null, 4, null);
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public boolean w() {
        return zl2.r4.f473950a.Y1(this.f118183e);
    }
}
