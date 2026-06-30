package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class i80 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.px1 f118650d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.j80 f118651e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.k80 f118652f;

    public i80(r45.px1 px1Var, com.tencent.mm.plugin.finder.live.widget.j80 j80Var, com.tencent.mm.plugin.finder.live.widget.k80 k80Var) {
        this.f118650d = px1Var;
        this.f118651e = j80Var;
        this.f118652f = k80Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        java.util.LinkedList list;
        r45.px1 px1Var = this.f118650d;
        r45.xn1 xn1Var = px1Var.f383452d;
        boolean z17 = (xn1Var == null || (list = xn1Var.getList(11)) == null || list.isEmpty()) ? false : true;
        com.tencent.mm.plugin.finder.live.widget.j80 j80Var = this.f118651e;
        if (!z17) {
            j80Var.f118737i.setText("");
            j80Var.f118737i.setVisibility(8);
            java.lang.String str = j80Var.f118732d;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append((xn1Var == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) ? null : finderContact.getNickname());
            sb6.append(" badge_infos is empty!");
            java.lang.String sb7 = sb6.toString();
            int i17 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.i(str, sb7, null);
            j80Var.itemView.setTag(com.tencent.mm.R.id.e6j, "");
            return;
        }
        java.util.List k17 = kz5.c0.k(2, 4, 5, 10, 13, 14, 17, 16, 12, 20);
        r45.xn1 xn1Var2 = px1Var.f383452d;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(zl2.r4.f473950a.B1(xn1Var2));
        if (valueOf.booleanValue()) {
            valueOf = null;
        }
        if (valueOf != null) {
            valueOf.booleanValue();
            k17.add(15);
        }
        java.lang.Object parent = j80Var.f118737i.getParent();
        kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.View");
        int width = ((android.view.View) parent).getWidth() - j80Var.f118734f.getWidth();
        gm2.c1 c1Var = gm2.c1.f273320a;
        android.widget.TextView textView = j80Var.f118737i;
        android.content.Context context = j80Var.itemView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        r45.xn1 xn1Var3 = px1Var.f383452d;
        java.util.LinkedList list2 = xn1Var3 != null ? xn1Var3.getList(11) : null;
        int[] R0 = kz5.n0.R0(k17);
        zl2.u4 u4Var = this.f118652f.f118822d;
        j80Var.getClass();
        int ordinal = u4Var.ordinal();
        jz5.l d17 = gm2.c1.d(c1Var, textView, context, " ", list2, R0, ordinal != 1 ? ordinal != 2 ? gm2.c2.f273350i : gm2.c2.f273349h : gm2.c2.f273348g, null, 4, java.lang.Integer.valueOf(width), null, 576, null);
        android.widget.TextView textView2 = j80Var.f118737i;
        java.lang.Object obj = d17.f302833d;
        textView2.setText((java.lang.CharSequence) obj);
        j80Var.f118737i.setVisibility(0);
        if (((java.util.List) d17.f302834e).isEmpty()) {
            mm2.x0 x0Var = mm2.c1.f328773y6;
            java.util.LinkedList list3 = xn1Var2.getList(11);
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            com.tencent.mm.protocal.protobuf.FinderContact finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var2.getCustom(0);
            sb8.append(finderContact2 != null ? finderContact2.getNickname() : null);
            sb8.append(",setUserItem");
            x0Var.b(list3, sb8.toString());
        }
        j80Var.itemView.setTag(com.tencent.mm.R.id.e6j, obj);
    }
}
