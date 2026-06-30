package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class q1 extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.c6s;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String str;
        vp2.p item = (vp2.p) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        r45.mb4 mb4Var = item.getFeedObject().isLiveFeed() ? (r45.mb4) kz5.n0.Z(item.getFeedObject().getLiveMediaList()) : (r45.mb4) kz5.n0.Z(item.getFeedObject().getMediaList());
        str = "";
        if (mb4Var != null) {
            java.lang.String string = mb4Var.getString(16);
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (string == null) {
                string = "";
            }
            java.lang.String string2 = mb4Var.getString(20);
            if (string2 == null) {
                string2 = "";
            }
            java.lang.String concat = string.concat(string2);
            if (com.tencent.mm.sdk.platformtools.t8.K0(concat)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(mb4Var.getString(1));
                java.lang.String string3 = mb4Var.getString(19);
                sb6.append(string3 != null ? string3 : "");
                str = sb6.toString();
            } else {
                str = concat;
            }
        }
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.hmn);
        if (textView != null) {
            textView.setText(item.getFeedObject().getNickName());
        }
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.hkh);
        if (imageView != null) {
            mn2.g1 g1Var = mn2.g1.f329975a;
            g1Var.e().c(new mn2.q3(str, com.tencent.mm.plugin.finder.storage.y90.f128355e), imageView, g1Var.h(mn2.f1.f329965s));
        }
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
