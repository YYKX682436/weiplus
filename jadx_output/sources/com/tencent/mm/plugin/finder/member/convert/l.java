package com.tencent.mm.plugin.finder.member.convert;

/* loaded from: classes8.dex */
public final class l extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.dtr;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        jo2.e item = (jo2.e) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        r45.kg2 kg2Var = item.f300884d;
        int i19 = kg2Var.f378677m;
        mn2.g1 g1Var = mn2.g1.f329975a;
        if (i19 == 2) {
            vo0.d a17 = g1Var.a();
            java.lang.String str = kg2Var.f378672e;
            mn2.n nVar = new mn2.n(str != null ? str : "", null, 2, null);
            android.view.View p17 = holder.p(com.tencent.mm.R.id.f485885rx0);
            kotlin.jvm.internal.o.f(p17, "getView(...)");
            a17.c(nVar, (android.widget.ImageView) p17, g1Var.h(mn2.f1.f329957h));
        } else {
            vo0.d l17 = g1Var.l();
            java.lang.String str2 = kg2Var.f378672e;
            mn2.n nVar2 = new mn2.n(str2 != null ? str2 : "", null, 2, null);
            android.view.View p18 = holder.p(com.tencent.mm.R.id.f485885rx0);
            kotlin.jvm.internal.o.f(p18, "getView(...)");
            l17.c(nVar2, (android.widget.ImageView) p18, g1Var.h(mn2.f1.f329957h));
        }
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.f485886rx1);
        android.content.Context context = holder.f293121e;
        if (textView != null) {
            android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.f485886rx1);
            i95.m c17 = i95.n0.c(ht2.y0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.s6 s6Var = (zy2.s6) c17;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str3 = kg2Var.f378671d;
            ((ke0.e) xVar).getClass();
            textView2.setText(zy2.s6.l6(s6Var, com.tencent.mm.pluginsdk.ui.span.c0.i(context, str3), (int) textView.getTextSize(), false, null, 0, false, null, 120, null));
        }
        android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.f485887rx2);
        le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String str4 = kg2Var.f378673f;
        ((ke0.e) xVar2).getClass();
        textView3.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, str4));
        ((android.widget.TextView) holder.p(com.tencent.mm.R.id.f485888rx3)).setText(com.tencent.mm.plugin.finder.assist.w2.k(context, kg2Var.f378675h * 1000));
        if (kg2Var.f378674g == 0) {
            ((android.widget.TextView) holder.p(com.tencent.mm.R.id.rwz)).setText(context.getString(com.tencent.mm.R.string.mrg));
        } else {
            ((android.widget.TextView) holder.p(com.tencent.mm.R.id.rwz)).setText(context.getString(com.tencent.mm.R.string.mri, java.lang.String.valueOf(kg2Var.f378674g)));
        }
    }
}
