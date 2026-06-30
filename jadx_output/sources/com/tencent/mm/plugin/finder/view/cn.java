package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class cn extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f131787e;

    public cn(yz5.l changeCurTypeClickCallback) {
        kotlin.jvm.internal.o.g(changeCurTypeClickCallback, "changeCurTypeClickCallback");
        this.f131787e = changeCurTypeClickCallback;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.duf;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String string;
        int i19;
        com.tencent.mm.plugin.finder.view.dn item = (com.tencent.mm.plugin.finder.view.dn) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        java.lang.Object Z = list != null ? kz5.n0.Z(list) : null;
        java.lang.Integer num = Z instanceof java.lang.Integer ? (java.lang.Integer) Z : null;
        boolean z18 = num != null && num.intValue() == 1;
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.a_4);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        h0Var.f310123d = findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.kbq);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.tencent.mm.R.id.ry8);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = itemView.findViewById(com.tencent.mm.R.id.rhu);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        android.widget.TextView textView3 = (android.widget.TextView) findViewById4;
        kotlin.jvm.internal.h0 h0Var2 = new kotlin.jvm.internal.h0();
        android.view.View findViewById5 = itemView.findViewById(com.tencent.mm.R.id.rfl);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        h0Var2.f310123d = findViewById5;
        if (z18) {
            ((com.tencent.mm.ui.widget.imageview.WeImageView) findViewById5).setVisibility(4);
            return;
        }
        java.lang.String str = item.f131912f;
        int i27 = item.f131911e;
        if (i27 == 3) {
            wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).M).getValue()).a(new mn2.n(str, null, 2, null));
            a17.f447873d = new com.tencent.mm.plugin.finder.view.an(holder, h0Var);
            a17.f();
        } else {
            mn2.g1 g1Var = mn2.g1.f329975a;
            g1Var.l().c(new mn2.n(str, null, 2, null), (android.widget.ImageView) h0Var.f310123d, g1Var.h(mn2.f1.f329961o));
        }
        textView.setText(item.f131910d);
        if (i27 == 1) {
            string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.msc);
            kotlin.jvm.internal.o.d(string);
        } else if (i27 != 3) {
            string = "";
        } else {
            string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.msa);
            kotlin.jvm.internal.o.d(string);
        }
        if (string.length() == 0) {
            textView2.setVisibility(8);
            i19 = 0;
        } else {
            i19 = 0;
            textView2.setVisibility(0);
            textView2.setText(string);
        }
        if (i27 == com.tencent.mm.plugin.finder.view.ko.f132521b) {
            textView3.setVisibility(i19);
            ((com.tencent.mm.ui.widget.imageview.WeImageView) h0Var2.f310123d).setVisibility(i19);
        } else {
            textView3.setVisibility(8);
            ((com.tencent.mm.ui.widget.imageview.WeImageView) h0Var2.f310123d).setVisibility(4);
        }
        holder.itemView.setOnClickListener(new com.tencent.mm.plugin.finder.view.bn(h0Var2, this, item));
    }
}
