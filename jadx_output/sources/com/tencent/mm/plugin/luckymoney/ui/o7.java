package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class o7 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI f147264e;

    public o7(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI) {
        this.f147264e = luckyMoneyNewDetailUI;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.bv7;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.tencent.mm.plugin.luckymoney.ui.k7 item = (com.tencent.mm.plugin.luckymoney.ui.k7) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.plugin.luckymoney.model.h5 h5Var = item.f147098d;
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI = this.f147264e;
        if (luckyMoneyNewDetailUI.Q2 == 7) {
            holder.w(com.tencent.mm.R.id.j6l, 8);
        } else {
            android.view.View p17 = holder.p(com.tencent.mm.R.id.j6l);
            com.tencent.mm.plugin.luckymoney.model.m5.b(p17 instanceof android.widget.ImageView ? (android.widget.ImageView) p17 : null, h5Var != null ? h5Var.f145313e : null, h5Var != null ? h5Var.f145319n : null);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(h5Var != null ? h5Var.f145316h : null)) {
            holder.w(com.tencent.mm.R.id.j6k, 8);
        } else {
            androidx.appcompat.app.AppCompatActivity context = luckyMoneyNewDetailUI.getContext();
            android.view.View p18 = holder.p(com.tencent.mm.R.id.j6k);
            com.tencent.mm.plugin.luckymoney.model.m5.E(context, p18 instanceof android.widget.TextView ? (android.widget.TextView) p18 : null, h5Var != null ? h5Var.f145316h : null);
            holder.w(com.tencent.mm.R.id.j6k, 0);
        }
        holder.s(com.tencent.mm.R.id.j6q, com.tencent.mm.plugin.luckymoney.model.m5.f(luckyMoneyNewDetailUI.getContext(), com.tencent.mm.sdk.platformtools.t8.V(h5Var != null ? h5Var.f145315g : null, 0L) * 1000));
        holder.w(com.tencent.mm.R.id.j6q, 0);
        holder.w(com.tencent.mm.R.id.j6r, 8);
        if (com.tencent.mm.sdk.platformtools.t8.K0(h5Var != null ? h5Var.f145321p : null)) {
            if (h5Var != null && h5Var.f145322q) {
                holder.s(com.tencent.mm.R.id.j6p, "");
                android.view.View p19 = holder.p(com.tencent.mm.R.id.j6p);
                android.widget.TextView textView = p19 instanceof android.widget.TextView ? (android.widget.TextView) p19 : null;
                java.lang.Object[] objArr = new java.lang.Object[1];
                objArr[0] = h5Var != null ? h5Var.f145319n : null;
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "[tryGetReceiveName] username: %s", objArr);
                if (textView != null) {
                    textView.setTag(h5Var != null ? h5Var.f145319n : null);
                }
                ((java.util.HashSet) luckyMoneyNewDetailUI.f146219r2).add(h5Var != null ? h5Var.f145319n : null);
                ((c01.k7) c01.n8.a()).b(h5Var != null ? h5Var.f145319n : null, 4, new com.tencent.mm.plugin.luckymoney.ui.n7(h5Var, luckyMoneyNewDetailUI, textView));
            } else {
                androidx.appcompat.app.AppCompatActivity context2 = luckyMoneyNewDetailUI.getContext();
                android.view.View p27 = holder.p(com.tencent.mm.R.id.j6p);
                com.tencent.mm.plugin.luckymoney.model.m5.E(context2, p27 instanceof android.widget.TextView ? (android.widget.TextView) p27 : null, h5Var != null ? h5Var.f145312d : null);
            }
        } else {
            android.view.View p28 = holder.p(com.tencent.mm.R.id.j6p);
            android.widget.TextView textView2 = p28 instanceof android.widget.TextView ? (android.widget.TextView) p28 : null;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            androidx.appcompat.app.AppCompatActivity context3 = luckyMoneyNewDetailUI.getContext();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(h5Var != null ? h5Var.f145312d : null);
            sb6.append(h5Var != null ? h5Var.f145321p : null);
            java.lang.String sb7 = sb6.toString();
            float textSize = textView2 != null ? textView2.getTextSize() : 0.0f;
            ((ke0.e) xVar).getClass();
            android.text.SpannableString j17 = com.tencent.mm.pluginsdk.ui.span.c0.j(context3, sb7, textSize);
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            androidx.appcompat.app.AppCompatActivity context4 = luckyMoneyNewDetailUI.getContext();
            java.lang.String str = h5Var != null ? h5Var.f145312d : null;
            float textSize2 = textView2 != null ? textView2.getTextSize() : 0.0f;
            ((ke0.e) xVar2).getClass();
            android.text.SpannableString j18 = com.tencent.mm.pluginsdk.ui.span.c0.j(context4, str, textSize2);
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(j17);
            spannableStringBuilder.setSpan(new com.tencent.mm.plugin.wallet_core.ui.d7("#FA9D3B", com.tencent.mm.plugin.luckymoney.ui.l7.f147129a), j18.length(), j17.length(), 18);
            if (textView2 != null) {
                textView2.setText(spannableStringBuilder);
            }
        }
        androidx.appcompat.app.AppCompatActivity context5 = luckyMoneyNewDetailUI.getContext();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        objArr2[0] = com.tencent.mm.wallet_core.ui.r1.o((h5Var != null ? h5Var.f145314f : 0L) / 100.0d);
        java.lang.String string = context5.getString(com.tencent.mm.R.string.gna, objArr2);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        holder.s(com.tencent.mm.R.id.j6j, string);
        if (com.tencent.mm.sdk.platformtools.t8.K0(h5Var != null ? h5Var.f145320o : null)) {
            holder.w(com.tencent.mm.R.id.j6o, 8);
        } else {
            holder.s(com.tencent.mm.R.id.j6o, h5Var != null ? h5Var.f145320o : null);
            holder.w(com.tencent.mm.R.id.j6o, 0);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(h5Var != null ? h5Var.f145318m : null)) {
            holder.w(com.tencent.mm.R.id.j6m, 8);
            holder.w(com.tencent.mm.R.id.j6n, 8);
        } else {
            holder.s(com.tencent.mm.R.id.j6n, h5Var != null ? h5Var.f145318m : null);
            if (luckyMoneyNewDetailUI.Q2 == 2) {
                android.view.View p29 = holder.p(com.tencent.mm.R.id.j6m);
                android.widget.ImageView imageView = p29 instanceof android.widget.ImageView ? (android.widget.ImageView) p29 : null;
                if (imageView != null) {
                    imageView.setImageResource(com.tencent.mm.R.drawable.c_a);
                }
            } else {
                android.view.View p37 = holder.p(com.tencent.mm.R.id.j6m);
                android.widget.ImageView imageView2 = p37 instanceof android.widget.ImageView ? (android.widget.ImageView) p37 : null;
                if (imageView2 != null) {
                    imageView2.setImageResource(com.tencent.mm.R.drawable.c99);
                }
            }
            holder.w(com.tencent.mm.R.id.j6m, 0);
            holder.w(com.tencent.mm.R.id.j6n, 0);
        }
        java.util.ArrayList arrayList = luckyMoneyNewDetailUI.T1;
        if (!arrayList.isEmpty()) {
            android.view.View p38 = holder.p(com.tencent.mm.R.id.uef);
            if (!(p38 instanceof android.view.View)) {
                p38 = null;
            }
            if (p38 != null) {
                android.view.ViewGroup.LayoutParams layoutParams = p38.getLayoutParams();
                android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
                if (i17 == arrayList.size() - 1) {
                    if (layoutParams2 != null) {
                        layoutParams2.leftMargin = i65.a.b(luckyMoneyNewDetailUI.getContext(), 0);
                    }
                } else if (layoutParams2 != null) {
                    layoutParams2.leftMargin = i65.a.b(luckyMoneyNewDetailUI.getContext(), 76);
                }
                p38.setLayoutParams(layoutParams2);
            }
        }
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
