package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class t3 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI f147442e;

    public t3(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI) {
        this.f147442e = luckyMoneyDetailUI;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.bv7;
    }

    @Override // in5.r
    public void h(in5.s0 s0Var, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        android.view.View p17;
        com.tencent.mm.plugin.luckymoney.model.h5 h5Var = ((com.tencent.mm.plugin.luckymoney.ui.p3) cVar).f147304d;
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI = this.f147442e;
        if (luckyMoneyDetailUI.Q2 == 7) {
            s0Var.w(com.tencent.mm.R.id.j6l, 8);
        } else {
            com.tencent.mm.plugin.luckymoney.model.m5.b((android.widget.ImageView) s0Var.p(com.tencent.mm.R.id.j6l), h5Var.f145313e, h5Var.f145319n);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(h5Var.f145316h)) {
            s0Var.w(com.tencent.mm.R.id.j6k, 8);
        } else {
            com.tencent.mm.plugin.luckymoney.model.m5.E(luckyMoneyDetailUI.getContext(), (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.j6k), h5Var.f145316h);
            s0Var.w(com.tencent.mm.R.id.j6k, 0);
        }
        s0Var.s(com.tencent.mm.R.id.j6q, com.tencent.mm.plugin.luckymoney.model.m5.f(luckyMoneyDetailUI.getContext(), com.tencent.mm.sdk.platformtools.t8.V(h5Var.f145315g, 0L) * 1000));
        s0Var.w(com.tencent.mm.R.id.j6q, 0);
        s0Var.w(com.tencent.mm.R.id.j6r, 8);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(h5Var.f145321p)) {
            android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.j6p);
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            androidx.appcompat.app.AppCompatActivity context = luckyMoneyDetailUI.getContext();
            java.lang.String str = h5Var.f145312d + h5Var.f145321p;
            float textSize = textView.getTextSize();
            ((ke0.e) xVar).getClass();
            android.text.SpannableString j17 = com.tencent.mm.pluginsdk.ui.span.c0.j(context, str, textSize);
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            androidx.appcompat.app.AppCompatActivity context2 = luckyMoneyDetailUI.getContext();
            java.lang.String str2 = h5Var.f145312d;
            float textSize2 = textView.getTextSize();
            ((ke0.e) xVar2).getClass();
            android.text.SpannableString j18 = com.tencent.mm.pluginsdk.ui.span.c0.j(context2, str2, textSize2);
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(j17);
            spannableStringBuilder.setSpan(new com.tencent.mm.plugin.wallet_core.ui.d7("#FA9D3B", new com.tencent.mm.plugin.luckymoney.ui.q3(this)), j18.length(), j17.length(), 18);
            textView.setText(spannableStringBuilder);
        } else if (h5Var.f145322q) {
            s0Var.s(com.tencent.mm.R.id.j6p, "");
            android.widget.TextView textView2 = (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.j6p);
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyDetailUI", "try get user contact: %s", h5Var.f145319n);
            textView2.setTag(h5Var.f145319n);
            ((java.util.HashSet) luckyMoneyDetailUI.f146093r2).add(h5Var.f145319n);
            ((c01.k7) c01.n8.a()).b(h5Var.f145319n, 4, new com.tencent.mm.plugin.luckymoney.ui.s3(this, h5Var, textView2));
        } else {
            com.tencent.mm.plugin.luckymoney.model.m5.E(luckyMoneyDetailUI.getContext(), (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.j6p), h5Var.f145312d);
        }
        s0Var.s(com.tencent.mm.R.id.j6j, luckyMoneyDetailUI.getContext().getString(com.tencent.mm.R.string.gna, com.tencent.mm.wallet_core.ui.r1.o(h5Var.f145314f / 100.0d)));
        if (com.tencent.mm.sdk.platformtools.t8.K0(h5Var.f145320o)) {
            s0Var.w(com.tencent.mm.R.id.j6o, 8);
        } else {
            s0Var.s(com.tencent.mm.R.id.j6o, h5Var.f145320o);
            s0Var.w(com.tencent.mm.R.id.j6o, 0);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(h5Var.f145318m)) {
            s0Var.w(com.tencent.mm.R.id.j6m, 8);
            s0Var.w(com.tencent.mm.R.id.j6n, 8);
        } else {
            s0Var.s(com.tencent.mm.R.id.j6n, h5Var.f145318m);
            if (luckyMoneyDetailUI.Q2 == 2) {
                ((android.widget.ImageView) s0Var.p(com.tencent.mm.R.id.j6m)).setImageResource(com.tencent.mm.R.drawable.c_a);
            } else {
                ((android.widget.ImageView) s0Var.p(com.tencent.mm.R.id.j6m)).setImageResource(com.tencent.mm.R.drawable.c99);
            }
            s0Var.w(com.tencent.mm.R.id.j6m, 0);
            s0Var.w(com.tencent.mm.R.id.j6n, 0);
        }
        java.util.ArrayList arrayList = luckyMoneyDetailUI.T1;
        if (arrayList == null || arrayList.isEmpty() || (p17 = s0Var.p(com.tencent.mm.R.id.uef)) == null) {
            return;
        }
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) p17.getLayoutParams();
        if (i17 == arrayList.size() - 1) {
            layoutParams.leftMargin = i65.a.b(luckyMoneyDetailUI.getContext(), 0);
        } else {
            layoutParams.leftMargin = i65.a.b(luckyMoneyDetailUI.getContext(), 76);
        }
        p17.setLayoutParams(layoutParams);
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 s0Var, int i17) {
    }
}
