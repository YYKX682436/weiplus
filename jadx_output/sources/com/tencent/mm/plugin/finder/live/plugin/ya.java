package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ya extends com.tencent.mm.plugin.finder.live.plugin.l {

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f115169p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f115170q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.LiveBottomSheetPanel f115171r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.Button f115172s;

    /* renamed from: t, reason: collision with root package name */
    public final android.widget.Button f115173t;

    /* renamed from: u, reason: collision with root package name */
    public final android.widget.TextView f115174u;

    /* renamed from: v, reason: collision with root package name */
    public final android.widget.TextView f115175v;

    /* renamed from: w, reason: collision with root package name */
    public final android.view.View f115176w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f115169p = statusMonitor;
        this.f115170q = "FinderLiveBottomTipPlugin";
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.eqq);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f115176w = findViewById;
        android.view.View findViewById2 = root.findViewById(com.tencent.mm.R.id.eqr);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel = (com.tencent.mm.ui.widget.LiveBottomSheetPanel) findViewById2;
        this.f115171r = liveBottomSheetPanel;
        android.view.View findViewById3 = root.findViewById(com.tencent.mm.R.id.eqn);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.view.View findViewById4 = root.findViewById(com.tencent.mm.R.id.eqo);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f115172s = (android.widget.Button) findViewById4;
        android.view.View findViewById5 = root.findViewById(com.tencent.mm.R.id.eqp);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f115173t = (android.widget.Button) findViewById5;
        android.view.View findViewById6 = root.findViewById(com.tencent.mm.R.id.eqt);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f115174u = (android.widget.TextView) findViewById6;
        android.view.View findViewById7 = root.findViewById(com.tencent.mm.R.id.eqs);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f115175v = (android.widget.TextView) findViewById7;
        liveBottomSheetPanel.setTranslationY(com.tencent.mm.ui.bl.b(root.getContext()).y);
        android.view.ViewGroup.LayoutParams layoutParams = ((android.widget.RelativeLayout) findViewById3).getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        ((android.widget.RelativeLayout.LayoutParams) layoutParams).bottomMargin += com.tencent.mm.ui.bl.c(root.getContext());
        liveBottomSheetPanel.setOnVisibilityListener(new com.tencent.mm.plugin.finder.live.plugin.va(this));
        findViewById.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.wa(this));
    }

    @Override // qo0.a
    public boolean B0() {
        if (w0() != 0) {
            return false;
        }
        com.tencent.mm.ui.widget.LiveBottomSheetPanel.b(this.f115171r, null, 1, null);
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void K0(int i17) {
        if (!((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
            super.K0(i17);
        } else {
            this.f365323d.setVisibility(8);
            com.tencent.mars.xlog.Log.w(this.f115170q, "setVisible return for isTeenMode");
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f328801f2 != 1;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return false;
    }

    public final void t1(android.widget.Button button) {
        button.setBackground(button.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.f481057jk));
        button.setTextColor(button.getContext().getResources().getColor(com.tencent.mm.R.color.f478838io));
    }

    public final void u1(android.widget.Button button) {
        button.setBackground(button.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.f481068jy));
        button.setTextColor(button.getContext().getResources().getColor(com.tencent.mm.R.color.aax));
    }

    public final void v1(int i17, android.view.View.OnClickListener onClickListener, android.view.View.OnClickListener onClickListener2) {
        K0(0);
        android.view.ViewGroup viewGroup = this.f365323d;
        java.lang.String string = viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.f491800ea0);
        android.widget.TextView textView = this.f115174u;
        textView.setText(string);
        java.lang.String string2 = viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.e_z);
        android.widget.TextView textView2 = this.f115175v;
        textView2.setText(string2);
        java.lang.String string3 = viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.e_y);
        android.widget.Button button = this.f115172s;
        button.setText(string3);
        java.lang.String string4 = viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.f491801ea1);
        android.widget.Button button2 = this.f115173t;
        button2.setText(string4);
        button.setBackground(viewGroup.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.f481699a10));
        button2.setBackground(viewGroup.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.a0r));
        if (i17 == 0) {
            textView.setText(viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.dnk));
            textView2.setText(viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.dnj));
            button.setText(viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.dnr));
            button2.setText(viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.dna));
            t1(button);
            u1(button2);
        } else if (i17 == 1) {
            textView.setText(viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.f491800ea0));
            textView2.setText(viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.e_z));
            button.setText(viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.e_y));
            button2.setText(viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.f491801ea1));
            u1(button);
            t1(button2);
        } else if (i17 == 2) {
            textView.setText(viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.e_x));
            textView2.setText(viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.e_w));
            button.setText(viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.e_y));
            button2.setText(viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.f491801ea1));
            u1(button);
            t1(button2);
        }
        if (this.f115169p.getLiveRole() == 0) {
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            ml2.d5[] d5VarArr = ml2.d5.f327367d;
            jz5.l lVar = new jz5.l("red_packet_err_type", 3);
            ml2.e5 e5Var = ml2.e5.f327389e;
            ((cy1.a) rVar).Cj("finder_live_red_packet_hold_up", viewGroup, kz5.c1.k(lVar, new jz5.l("cur_red_packet_source", -1)), 25561);
        }
        button.setOnClickListener(onClickListener);
        button2.setOnClickListener(onClickListener2);
        this.f115171r.post(new com.tencent.mm.plugin.finder.live.plugin.xa(this));
    }
}
