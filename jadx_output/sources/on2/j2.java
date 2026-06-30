package on2;

/* loaded from: classes3.dex */
public final class j2 extends in5.r {
    public static final void n(on2.j2 j2Var, in5.s0 s0Var, java.lang.String str) {
        j2Var.getClass();
        if (str == null || str.length() == 0) {
            return;
        }
        com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(s0Var.f293121e, 2, 2);
        android.content.Context context = s0Var.f293121e;
        z2Var.y(context.getResources().getString(com.tencent.mm.R.string.f490454vi));
        z2Var.F = new on2.i2(z2Var);
        z2Var.x(1);
        z2Var.q(context.getResources().getString(com.tencent.mm.R.string.f490539xy));
        com.tencent.mm.ui.bk.r0(z2Var.C.getPaint(), 0.8f);
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setTextColor(textView.getContext().getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9, null));
        textView.setText(str);
        z2Var.j(textView);
        z2Var.C();
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f488919au2;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        so2.c3 item = (so2.c3) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.ir9);
        r45.cz1 cz1Var = item.f410296d;
        textView.setText(cz1Var.getString(4));
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.f485726is5);
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(cz1Var.getInteger(6)), zl2.r4.f473950a.H0((r45.xy1) cz1Var.getCustom(5))};
        android.content.Context context = holder.f293121e;
        textView2.setText(context.getString(com.tencent.mm.R.string.dqe, objArr));
        ((android.widget.TextView) holder.p(com.tencent.mm.R.id.is6)).setText(k35.m1.d("yyyy-MM-dd HH:mm", cz1Var.getInteger(2)));
        android.view.View p17 = holder.p(com.tencent.mm.R.id.irz);
        int i19 = item.f410297e ? 8 : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/lottery/FinderLotteryWinnersHeaderConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderLotteryWinnerListHeader;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/finder/lottery/FinderLotteryWinnersHeaderConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderLotteryWinnerListHeader;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.qlv);
        textView3.setVisibility(!lk5.s.b(context) ? 8 : 0);
        on2.l3.f346966a.f(textView3);
        java.lang.String str = item.f410299g;
        if (str == null || str.length() == 0) {
            ((android.widget.TextView) holder.p(com.tencent.mm.R.id.bwy)).setVisibility(8);
            ((com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.bwz)).setVisibility(8);
            return;
        }
        ((ml2.j0) i95.n0.c(ml2.j0.class)).Fj(ml2.j1.f327606v, "");
        ((android.widget.TextView) holder.p(com.tencent.mm.R.id.bwy)).setOnClickListener(new on2.g2(item, this, holder));
        ((com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.bwz)).setOnClickListener(new on2.h2(this, holder, item));
        ((android.widget.TextView) holder.p(com.tencent.mm.R.id.bwy)).setVisibility(0);
        ((com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.bwz)).setVisibility(0);
        if (item.f410300h == 1) {
            ((android.widget.TextView) holder.p(com.tencent.mm.R.id.bwy)).setText(context.getResources().getString(com.tencent.mm.R.string.dqg));
            ((android.widget.TextView) holder.p(com.tencent.mm.R.id.bwy)).setTextColor(context.getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_5, null));
        } else {
            ((android.widget.TextView) holder.p(com.tencent.mm.R.id.bwy)).setText(context.getResources().getString(com.tencent.mm.R.string.dqf));
            ((android.widget.TextView) holder.p(com.tencent.mm.R.id.bwy)).setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f479308vo, null));
        }
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
