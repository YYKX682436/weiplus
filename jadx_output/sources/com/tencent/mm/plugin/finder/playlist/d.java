package com.tencent.mm.plugin.finder.playlist;

/* loaded from: classes2.dex */
public class d extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.b4x;
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }

    @Override // in5.r
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void h(in5.s0 holder, com.tencent.mm.plugin.finder.playlist.e item, int i17, int i18, boolean z17, java.util.List list) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.fvh);
        r45.vx0 vx0Var = item.f122291d;
        java.lang.String string = vx0Var.getString(3);
        if (string == null || string.length() == 0) {
            imageView.setImageResource(com.tencent.mm.R.color.BW_0_Alpha_0_1);
        } else {
            mn2.g1 g1Var = mn2.g1.f329975a;
            vo0.d e17 = g1Var.e();
            mn2.q3 q3Var = new mn2.q3(vx0Var.getString(3), com.tencent.mm.plugin.finder.storage.y90.f128356f);
            kotlin.jvm.internal.o.d(imageView);
            e17.c(q3Var, imageView, g1Var.h(mn2.f1.f329963q));
        }
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.fvm);
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.fvj);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String string2 = vx0Var.getString(1);
        ((ke0.e) xVar).getClass();
        android.content.Context context = holder.f293121e;
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, string2));
        long f17 = c01.id.f(vx0Var.getInteger(7));
        java.lang.String m17 = com.tencent.mm.plugin.finder.assist.w2.m(context, vx0Var.getInteger(7) * 1000, java.lang.Boolean.TRUE);
        java.lang.String string3 = context.getString(com.tencent.mm.R.string.ets);
        kotlin.jvm.internal.o.f(string3, "getString(...)");
        if (f17 < 31536000) {
            m17 = m17 + string3;
        }
        java.lang.String string4 = context.getString(com.tencent.mm.R.string.etl, java.lang.Integer.valueOf(vx0Var.getInteger(4)));
        kotlin.jvm.internal.o.f(string4, "getString(...)");
        java.lang.String string5 = context.getString(com.tencent.mm.R.string.etm, m17);
        kotlin.jvm.internal.o.f(string5, "getString(...)");
        kotlin.jvm.internal.o.d(m17);
        if (m17.length() > 0) {
            string4 = string4 + ' ' + string5;
        }
        textView2.setText(string4);
        o(holder, vx0Var, i17);
    }

    public void o(in5.s0 holder, r45.vx0 info, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(info, "info");
        com.tencent.mm.plugin.finder.report.d2 d2Var = com.tencent.mm.plugin.finder.report.d2.f124994a;
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        com.tencent.mm.plugin.finder.report.d2.m(d2Var, itemView, "collection_card", 0, 0, kz5.c1.k(new jz5.l("collection_id", pm0.v.u(info.getLong(0))), new jz5.l("collection_location_id", java.lang.Integer.valueOf(i17))), null, 44, null);
    }
}
