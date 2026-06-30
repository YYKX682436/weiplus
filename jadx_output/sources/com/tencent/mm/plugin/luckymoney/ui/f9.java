package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class f9 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI f146901d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f9(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI) {
        super(false);
        this.f146901d = luckyMoneyNewDetailUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View v17) {
        int i17;
        com.tencent.mm.plugin.luckymoney.model.i0 i0Var;
        com.tencent.mm.plugin.luckymoney.model.i0 i0Var2;
        kotlin.jvm.internal.o.g(v17, "v");
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI = this.f146901d;
        com.tencent.mm.plugin.luckymoney.model.e1 e1Var = luckyMoneyNewDetailUI.U2;
        if (e1Var == null || e1Var.W == null) {
            return;
        }
        java.util.LinkedList linkedList = null;
        android.view.View inflate = android.view.LayoutInflater.from(luckyMoneyNewDetailUI.getContext()).inflate(com.tencent.mm.R.layout.bul, (android.view.ViewGroup) null);
        android.view.ViewGroup viewGroup = inflate instanceof android.view.ViewGroup ? (android.view.ViewGroup) inflate : null;
        android.widget.TextView textView = viewGroup != null ? (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.f485789j24) : null;
        android.widget.LinearLayout linearLayout = viewGroup != null ? (android.widget.LinearLayout) viewGroup.findViewById(com.tencent.mm.R.id.f485788j23) : null;
        if (textView != null) {
            com.tencent.mm.plugin.luckymoney.model.e1 e1Var2 = luckyMoneyNewDetailUI.U2;
            textView.setText((e1Var2 == null || (i0Var2 = e1Var2.W) == null) ? null : i0Var2.f145328d);
        }
        com.tencent.mm.ui.bk.r0(textView != null ? textView.getPaint() : null, 0.8f);
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.topMargin = i65.a.b(luckyMoneyNewDetailUI.getContext(), 16);
        com.tencent.mm.plugin.luckymoney.model.e1 e1Var3 = luckyMoneyNewDetailUI.U2;
        if (e1Var3 != null && (i0Var = e1Var3.W) != null) {
            linkedList = i0Var.f145329e;
        }
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            boolean z17 = true;
            while (it.hasNext()) {
                com.tencent.mm.plugin.luckymoney.model.k kVar = (com.tencent.mm.plugin.luckymoney.model.k) it.next();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(kVar.f145361d)) {
                    android.widget.TextView textView2 = new android.widget.TextView(luckyMoneyNewDetailUI.getContext());
                    android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(kVar.f145361d);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(kVar.f145362e)) {
                        java.lang.String str = kVar.f145361d;
                        if (str != null) {
                            java.lang.String str2 = kVar.f145362e;
                            if (str2 == null) {
                                str2 = "";
                            }
                            i17 = r26.n0.L(str, str2, 0, false, 6, null);
                        } else {
                            i17 = 0;
                        }
                        if (i17 > 0) {
                            com.tencent.mm.plugin.wallet_core.ui.d7 d7Var = new com.tencent.mm.plugin.wallet_core.ui.d7(2, new com.tencent.mm.plugin.luckymoney.ui.r9(luckyMoneyNewDetailUI, kVar));
                            java.lang.String str3 = kVar.f145362e;
                            spannableStringBuilder.setSpan(d7Var, i17, (str3 != null ? str3.length() : 0) + i17, 18);
                            textView2.setClickable(true);
                            textView2.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y0(luckyMoneyNewDetailUI.getContext()));
                        }
                    }
                    textView2.setText(spannableStringBuilder);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setTextColor(luckyMoneyNewDetailUI.getResources().getColor(com.tencent.mm.R.color.t_));
                    if (z17) {
                        if (linearLayout != null) {
                            linearLayout.addView(textView2);
                        }
                    } else if (linearLayout != null) {
                        linearLayout.addView(textView2, marginLayoutParams);
                    }
                    if (z17) {
                        z17 = false;
                    }
                }
            }
        }
        com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(luckyMoneyNewDetailUI.getContext(), 2, 0);
        z2Var.y(luckyMoneyNewDetailUI.getResources().getString(com.tencent.mm.R.string.f490454vi));
        z2Var.x(1);
        z2Var.F = new com.tencent.mm.plugin.luckymoney.ui.q9(z2Var);
        z2Var.j(viewGroup);
        z2Var.C();
    }
}
