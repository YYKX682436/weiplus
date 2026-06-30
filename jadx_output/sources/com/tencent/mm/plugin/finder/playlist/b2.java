package com.tencent.mm.plugin.finder.playlist;

/* loaded from: classes2.dex */
public final class b2 extends com.tencent.mm.plugin.finder.playlist.d {
    @Override // com.tencent.mm.plugin.finder.playlist.d, in5.r
    public int e() {
        return com.tencent.mm.R.layout.b4y;
    }

    @Override // com.tencent.mm.plugin.finder.playlist.d, in5.r
    /* renamed from: n */
    public void h(in5.s0 holder, com.tencent.mm.plugin.finder.playlist.e item, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.fvj);
        r45.vx0 vx0Var = item.f122291d;
        long f17 = c01.id.f(vx0Var.getInteger(7));
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        android.content.Context context = holder.f293121e;
        java.lang.String m17 = com.tencent.mm.plugin.finder.assist.w2.m(context, vx0Var.getInteger(7) * 1000, bool);
        java.lang.String string = context.getString(com.tencent.mm.R.string.ets);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        if (f17 < 31536000) {
            m17 = m17 + string;
        }
        java.lang.String string2 = context.getString(com.tencent.mm.R.string.etl, java.lang.Integer.valueOf(vx0Var.getInteger(4)));
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        java.lang.String string3 = context.getString(com.tencent.mm.R.string.etm, m17);
        kotlin.jvm.internal.o.f(string3, "getString(...)");
        kotlin.jvm.internal.o.d(m17);
        if ((m17.length() > 0) && f17 <= 604800) {
            string2 = string2 + ' ' + string3;
        }
        textView.setText(string2);
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = null;
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.profile.uic.p2 p2Var = (com.tencent.mm.plugin.finder.profile.uic.p2) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.profile.uic.p2.class);
        if (p2Var == null || (str = p2Var.getUsername()) == null) {
            str = "";
        }
        android.view.View p17 = holder.p(com.tencent.mm.R.id.d1y);
        android.view.ViewGroup.LayoutParams layoutParams = p17.getLayoutParams();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams2 != null) {
            if (item.f122292e == item.f122293f - 1) {
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                marginLayoutParams2.leftMargin = context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479693cs);
            } else {
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                marginLayoutParams2.leftMargin = context.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479659bw);
            }
            marginLayoutParams = marginLayoutParams2;
        }
        p17.setLayoutParams(marginLayoutParams);
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        dy1.a.i(itemView, "profile_collection_card");
        android.view.View itemView2 = holder.itemView;
        kotlin.jvm.internal.o.f(itemView2, "itemView");
        dy1.a.a(itemView2, new com.tencent.mm.plugin.finder.playlist.a2(V6, item, str, holder));
        android.view.View itemView3 = holder.itemView;
        kotlin.jvm.internal.o.f(itemView3, "itemView");
        dy1.a.l(itemView3, 40, 25496);
    }
}
