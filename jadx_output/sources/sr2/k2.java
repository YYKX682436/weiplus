package sr2;

/* loaded from: classes10.dex */
public final class k2 implements w25.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sr2.y2 f411611a;

    public k2(sr2.y2 y2Var) {
        this.f411611a = y2Var;
    }

    @Override // w25.g
    public final void a() {
        sr2.y2 y2Var = this.f411611a;
        y2Var.f411803g = true;
        if (y2Var.W6() && !y2Var.V6()) {
            java.lang.String string = y2Var.getActivity().getResources().getString(com.tencent.mm.R.string.f491374nm1);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            ry2.j.f401398a.a(y2Var.getActivity(), kz5.b0.c(new ry2.f(2, com.tencent.mm.R.color.Red_100, com.tencent.mm.R.string.css, new sr2.p2(y2Var), null, 16, null)), string);
            return;
        }
        if (y2Var.U6()) {
            y2Var.Z6();
            return;
        }
        if (!y2Var.R6() || !y2Var.X6()) {
            y2Var.getClass();
            int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.D8).getValue()).r()).intValue();
            if (intValue == 1) {
                y2Var.Z6();
                return;
            }
            if (intValue == 2) {
                pf5.e.launch$default(y2Var, null, null, new sr2.h2(y2Var, null), 3, null);
                return;
            }
            ya2.p1 p1Var = y2Var.f411800d;
            if (p1Var == null) {
                kotlin.jvm.internal.o.o("locationWidget");
                throw null;
            }
            yv2.b bVar = p1Var instanceof yv2.b ? (yv2.b) p1Var : null;
            if (bVar != null) {
                bVar.b();
                return;
            }
            return;
        }
        android.view.View inflate = com.tencent.mm.ui.id.b(y2Var.getContext()).inflate(com.tencent.mm.R.layout.bsu, (android.view.ViewGroup) null, false);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.qxk);
        if (textView != null) {
            com.tencent.mm.ui.fk.a(textView);
        }
        com.tencent.neattextview.textview.view.NeatTextView neatTextView = (com.tencent.neattextview.textview.view.NeatTextView) inflate.findViewById(com.tencent.mm.R.id.qxh);
        if (neatTextView != null) {
            java.lang.String string2 = y2Var.getContext().getResources().getString(com.tencent.mm.R.string.eod);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            java.lang.String string3 = y2Var.getContext().getResources().getString(com.tencent.mm.R.string.eoe, string2);
            kotlin.jvm.internal.o.f(string3, "getString(...)");
            android.text.SpannableString spannableString = new android.text.SpannableString(string3);
            int L = r26.n0.L(string3, string2, 0, false, 6, null);
            spannableString.setSpan(new com.tencent.mm.plugin.finder.view.yl(string3, y2Var.getContext().getResources().getColor(com.tencent.mm.R.color.Link_100), y2Var.getContext().getResources().getColor(com.tencent.mm.R.color.a9e), false, false, new sr2.q2(y2Var)), L, string2.length() + L, 17);
            neatTextView.b(spannableString);
        }
        android.widget.CheckBox checkBox = (android.widget.CheckBox) inflate.findViewById(com.tencent.mm.R.id.hrk);
        ((android.widget.FrameLayout) inflate.findViewById(com.tencent.mm.R.id.f485005qt1)).setOnClickListener(new sr2.r2(checkBox));
        com.tencent.mm.ui.widget.button.WeButton weButton = (com.tencent.mm.ui.widget.button.WeButton) inflate.findViewById(com.tencent.mm.R.id.b0e);
        com.tencent.mm.ui.widget.button.WeButton weButton2 = (com.tencent.mm.ui.widget.button.WeButton) inflate.findViewById(com.tencent.mm.R.id.b0f);
        weButton.setText(y2Var.getContext().getResources().getString(com.tencent.mm.R.string.cju));
        com.tencent.mm.ui.fk.a(weButton);
        weButton2.setText(y2Var.getContext().getResources().getString(com.tencent.mm.R.string.f491420h95));
        com.tencent.mm.ui.fk.a(weButton2);
        weButton2.setOnClickListener(new sr2.s2(checkBox, y2Var));
        y2Var.a7(inflate, "groupbuy_share_plan_describe", 32);
        y2Var.a7(weButton2, "join_groupbuy_share_plan", 8);
        com.tencent.mm.ui.widget.dialog.y1 y1Var = new com.tencent.mm.ui.widget.dialog.y1(y2Var.getActivity());
        y1Var.k(inflate);
        weButton.setOnClickListener(new sr2.t2(y1Var));
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.pnq);
        if (findViewById != null) {
            findViewById.setOnClickListener(new sr2.u2(y1Var));
        }
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.qxi);
        kotlin.jvm.internal.o.d(textView2);
        com.tencent.mm.ui.fk.a(textView2);
        textView2.setOnClickListener(new sr2.v2(y1Var, y2Var));
        y1Var.s();
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FINDER_POST_STORE_PROMOTE_DIALOG_SHOW_COUNT_INT_SYNC;
        gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(c17.r(u3Var, 0) + 1));
    }
}
