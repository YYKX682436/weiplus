package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public class d2 extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.c6t;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String string;
        android.widget.ImageView imageView;
        java.lang.String str;
        vp2.r item = (vp2.r) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        holder.itemView.setTag(java.lang.Integer.valueOf(i17));
        holder.f293124h = item;
        r45.na2 na2Var = item.f438952d;
        r45.dd2 dd2Var = (r45.dd2) na2Var.getCustom(0);
        if (dd2Var != null && dd2Var.getInteger(0) == 0) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) holder.p(com.tencent.mm.R.id.jr6);
            if (weImageView != null) {
                weImageView.setVisibility(0);
                return;
            }
            return;
        }
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.hnz);
        if (textView != null) {
            r45.dd2 dd2Var2 = (r45.dd2) na2Var.getCustom(0);
            if (dd2Var2 == null || (str = dd2Var2.getString(1)) == null) {
                str = "";
            }
            textView.setText(str);
        }
        r45.dd2 dd2Var3 = (r45.dd2) na2Var.getCustom(0);
        if (dd2Var3 == null || (string = dd2Var3.getString(9)) == null || (imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.hny)) == null) {
            return;
        }
        mn2.g1 g1Var = mn2.g1.f329975a;
        g1Var.e().c(new mn2.q3(string, com.tencent.mm.plugin.finder.storage.y90.f128355e), imageView, g1Var.h(mn2.f1.f329965s));
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
