package dn2;

/* loaded from: classes3.dex */
public final class z implements dn2.e {

    /* renamed from: a, reason: collision with root package name */
    public android.view.View f241994a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.TextView f241995b;

    /* renamed from: c, reason: collision with root package name */
    public int f241996c;

    @Override // dn2.e
    public java.lang.Integer a() {
        return java.lang.Integer.valueOf(com.tencent.mm.R.id.b1u);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r14v4 */
    @Override // dn2.e
    public android.view.View c(android.view.View rootView, dk2.zf liveMsg, cn2.p0 widget) {
        java.lang.String str;
        java.lang.String str2;
        boolean z17;
        ?? r142;
        kotlin.jvm.internal.o.g(rootView, "rootView");
        kotlin.jvm.internal.o.g(liveMsg, "liveMsg");
        kotlin.jvm.internal.o.g(widget, "widget");
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.f484574er2);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f241994a = findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.b1u);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f241995b = (android.widget.TextView) findViewById2;
        jz5.g b17 = jz5.h.b(new dn2.y(rootView));
        android.view.View findViewById3 = rootView.findViewById(com.tencent.mm.R.id.f483515b23);
        android.widget.TextView textView = this.f241995b;
        if (textView == null) {
            kotlin.jvm.internal.o.o("bulletContentTv");
            throw null;
        }
        textView.setTextColor(rootView.getContext().getResources().getColor(com.tencent.mm.R.color.f479549ab0));
        android.view.View view = this.f241994a;
        if (view == null) {
            kotlin.jvm.internal.o.o("bulletContent");
            throw null;
        }
        view.setBackground(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDrawable(com.tencent.mm.R.drawable.a1k));
        java.lang.Object D = liveMsg.D();
        r45.xi1 xi1Var = D instanceof r45.xi1 ? (r45.xi1) D : null;
        if (xi1Var != null) {
            com.tencent.mars.xlog.Log.i("Finder.LiveCommentPlugin_BulletNew_View", "like bullet msg: " + pm0.b0.g(xi1Var));
            java.util.LinkedList list = xi1Var.getList(1);
            kotlin.jvm.internal.o.f(list, "getMerged_msg_list(...)");
            int i17 = 0;
            int i18 = 0;
            for (java.lang.Object obj : list) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                if (((r45.w64) obj).getInteger(0) == this.f241996c) {
                    i17 = i19;
                }
                i18 = i19;
            }
            r45.w64 w64Var = (r45.w64) xi1Var.getCustom(0);
            this.f241996c = w64Var != null ? w64Var.getInteger(0) : 0;
            r45.w64 w64Var2 = i17 >= 0 && i17 < xi1Var.getList(1).size() ? (r45.w64) xi1Var.getList(1).get(i17) : (r45.w64) xi1Var.getCustom(0);
            if (w64Var2 != null) {
                com.tencent.mars.xlog.Log.i("Finder.LiveCommentPlugin_BulletNew_View", "like bullet chosen msg: " + pm0.b0.g(w64Var2));
                java.util.LinkedList list2 = w64Var2.getList(1);
                kotlin.jvm.internal.o.f(list2, "getUser_info_list(...)");
                r45.x64 x64Var = (r45.x64) kz5.n0.Z(list2);
                if (x64Var == null || (str = x64Var.getString(0)) == null) {
                    str = "";
                }
                java.lang.String str3 = str;
                dk2.ef efVar = dk2.ef.f233372a;
                gk2.e eVar = dk2.ef.I;
                if (eVar != null ? zl2.r4.f473950a.y1(eVar) : false) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    str2 = str3;
                    z17 = false;
                    yj0.a.d(findViewById3, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/bulletcommet/item/LiveLikeBulletItem", "getView", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;Lcom/tencent/mm/plugin/finder/live/widget/bulletcommet/FinderLiveBulletCommentWidgetNew;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/live/widget/bulletcommet/item/LiveLikeBulletItem", "getView", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;Lcom/tencent/mm/plugin/finder/live/widget/bulletcommet/FinderLiveBulletCommentWidgetNew;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    jz5.n nVar = (jz5.n) b17;
                    for (android.widget.ImageView imageView : (android.widget.ImageView[]) nVar.getValue()) {
                        imageView.setVisibility(8);
                    }
                    r142 = 1;
                    java.util.LinkedList list3 = w64Var2.getList(1);
                    kotlin.jvm.internal.o.f(list3, "getUser_info_list(...)");
                    int i27 = 0;
                    for (java.lang.Object obj2 : kz5.n0.L0(list3, 3)) {
                        int i28 = i27 + 1;
                        if (i27 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        r45.x64 x64Var2 = (r45.x64) obj2;
                        android.widget.ImageView imageView2 = ((android.widget.ImageView[]) nVar.getValue())[i27];
                        imageView2.setVisibility(0);
                        int integer = x64Var2.getInteger(2);
                        pf5.u uVar = pf5.u.f353936a;
                        jz5.l lVar = integer == 3 ? new jz5.l(new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) uVar.e(zy2.b6.class).c(mn2.i4.class))).K).getValue()), mn2.f1.f329957h) : new jz5.l(new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) uVar.e(zy2.b6.class).c(mn2.i4.class))).L).getValue()), mn2.f1.f329961o);
                        ((vo0.d) lVar.f302833d).c(new mn2.n(x64Var2.getString(1), com.tencent.mm.plugin.finder.storage.y90.X), imageView2, mn2.g1.f329975a.h((mn2.f1) lVar.f302834e));
                        i27 = i28;
                    }
                } else {
                    str2 = str3;
                    z17 = false;
                    r142 = 1;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(findViewById3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/bulletcommet/item/LiveLikeBulletItem", "getView", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;Lcom/tencent/mm/plugin/finder/live/widget/bulletcommet/FinderLiveBulletCommentWidgetNew;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/live/widget/bulletcommet/item/LiveLikeBulletItem", "getView", "(Landroid/view/View;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;Lcom/tencent/mm/plugin/finder/live/widget/bulletcommet/FinderLiveBulletCommentWidgetNew;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                java.lang.String c17 = zl2.r4.f473950a.c1(str2, 6, r142);
                if (w64Var2.getInteger(2) > r142) {
                    android.widget.TextView textView2 = this.f241995b;
                    if (textView2 == null) {
                        kotlin.jvm.internal.o.o("bulletContentTv");
                        throw null;
                    }
                    android.view.View view2 = this.f241994a;
                    if (view2 == null) {
                        kotlin.jvm.internal.o.o("bulletContent");
                        throw null;
                    }
                    textView2.setText(view2.getContext().getString(com.tencent.mm.R.string.f491590dm1, c17, java.lang.Integer.valueOf(w64Var2.getInteger(2))));
                    cn2.l.f43568a.c(r142, r142);
                } else {
                    android.widget.TextView textView3 = this.f241995b;
                    if (textView3 == null) {
                        kotlin.jvm.internal.o.o("bulletContentTv");
                        throw null;
                    }
                    android.view.View view3 = this.f241994a;
                    if (view3 == null) {
                        kotlin.jvm.internal.o.o("bulletContent");
                        throw null;
                    }
                    textView3.setText(view3.getContext().getString(com.tencent.mm.R.string.f491591dm2, c17));
                    cn2.l.f43568a.c(r142, z17);
                }
            }
        }
        return rootView;
    }

    @Override // dn2.e
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dex;
    }
}
