package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes9.dex */
public class o extends android.widget.BaseAdapter {

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.mall.ui.n f148451f;

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Context f148452g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.LayoutInflater f148453h;

    /* renamed from: i, reason: collision with root package name */
    public final int f148454i;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f148449d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public android.util.SparseArray f148450e = null;

    /* renamed from: m, reason: collision with root package name */
    public boolean f148455m = false;

    public o(android.content.Context context, int i17) {
        this.f148452g = context;
        this.f148454i = i17;
        this.f148453h = android.view.LayoutInflater.from(context);
    }

    public static boolean c(r45.n53 n53Var) {
        r45.l67 l67Var = n53Var.f381083e;
        if (l67Var == null || l67Var.f379187e == null || !f(n53Var)) {
            return false;
        }
        bt4.g b17 = bt4.g.b();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(n53Var.f381082d.f381996d);
        sb6.append("");
        return b17.c(sb6.toString()) != null;
    }

    public static boolean f(r45.n53 n53Var) {
        com.tencent.mm.plugin.wallet_core.model.mall.MallNews c17 = bt4.g.b().c(n53Var.f381082d.f381996d + "");
        if (c17 != null && !com.tencent.mm.sdk.platformtools.t8.K0(c17.f179834g)) {
            if (c17.f179834g.equals(n53Var.f381083e.f379186d + "")) {
                return "0".equals(c17.f179831d);
            }
        }
        int i17 = n53Var.f381083e.f379186d;
        java.lang.String str = n53Var.f381082d.f381997e;
        com.tencent.mm.plugin.wallet_core.model.mall.MallNews mallNews = new com.tencent.mm.plugin.wallet_core.model.mall.MallNews(n53Var.f381082d.f381996d + "");
        mallNews.f179834g = n53Var.f381083e.f379186d + "";
        bt4.g.b().a(mallNews);
        return true;
    }

    public final void a(android.view.View view, com.tencent.mm.plugin.mall.ui.m mVar) {
        if (view == null) {
            return;
        }
        com.tencent.mm.plugin.mall.ui.k kVar = (com.tencent.mm.plugin.mall.ui.k) view.getTag();
        r45.n53 n53Var = mVar.f148441a;
        int i17 = mVar.f148442b;
        if (com.tencent.mm.ui.bk.C()) {
            kVar.f148423f = n53Var.f381082d.f381998f.f385533e;
        } else {
            kVar.f148423f = n53Var.f381082d.f381998f.f385532d;
        }
        hf3.f.a(kVar.f148419b, kVar.f148423f, com.tencent.mm.R.raw.mall_index_icon_default);
        kVar.f148421d.setText(n53Var.f381082d.f381997e);
        d(kVar.f148421d, com.tencent.mm.plugin.mall.ui.b.f148336e);
        java.lang.String str = n53Var.f381088m;
        if (str != null) {
            kVar.f148422e.setText(str);
            kVar.f148422e.setVisibility(0);
            d(kVar.f148422e, com.tencent.mm.plugin.mall.ui.b.f148336e);
            this.f148455m = true;
        } else {
            kVar.f148422e.setText("");
            kVar.f148422e.setVisibility(8);
        }
        r45.l67 l67Var = n53Var.f381083e;
        if (l67Var == null || l67Var.f379187e == null || !f(n53Var)) {
            kVar.f148420c.setImageBitmap(null);
            kVar.f148420c.setVisibility(8);
        } else {
            if (com.tencent.mm.ui.bk.C()) {
                kVar.f148424g = n53Var.f381083e.f379187e.f385533e;
            } else {
                kVar.f148424g = n53Var.f381083e.f379187e.f385532d;
            }
            hf3.f.a(kVar.f148420c, kVar.f148424g, 0);
            kVar.f148420c.setVisibility(0);
            ((android.widget.RelativeLayout.LayoutParams) kVar.f148420c.getLayoutParams()).setMargins((com.tencent.mm.plugin.mall.ui.b.f148336e / 2) - 1, i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 7), 0, 0);
            int i18 = n53Var.f381082d.f381996d;
        }
        android.view.View view2 = kVar.f148418a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/mall/ui/FunctionListAdapterV2", "fillFunctionItem", "(Landroid/view/View;Lcom/tencent/mm/plugin/mall/ui/FunctionListAdapterV2$MallFunctionWrapper;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/mall/ui/FunctionListAdapterV2", "fillFunctionItem", "(Landroid/view/View;Lcom/tencent/mm/plugin/mall/ui/FunctionListAdapterV2$MallFunctionWrapper;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        kVar.f148418a.setOnClickListener(new com.tencent.mm.plugin.mall.ui.j(this, i17, n53Var));
    }

    public final void d(android.widget.TextView textView, int i17) {
        textView.setMaxEms(new android.text.StaticLayout(textView.getText(), textView.getPaint(), i17, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineEnd(0));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((java.util.ArrayList) this.f148449d).size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v20 */
    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.mall.ui.l lVar;
        android.view.View view2;
        boolean z17;
        android.view.View view3;
        boolean z18;
        android.view.LayoutInflater layoutInflater = this.f148453h;
        ?? r37 = 0;
        if (view == null) {
            lVar = new com.tencent.mm.plugin.mall.ui.l(this);
            view2 = layoutInflater.inflate(com.tencent.mm.R.layout.bvt, viewGroup, false);
            lVar.f148430a = (android.widget.LinearLayout) view2.findViewById(com.tencent.mm.R.id.j9j);
            lVar.f148431b = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.j9i);
            lVar.f148432c = view2.findViewById(com.tencent.mm.R.id.i2a);
            lVar.f148433d = view2.findViewById(com.tencent.mm.R.id.auc);
            lVar.f148434e = view2.findViewById(com.tencent.mm.R.id.kd_);
            view2.setTag(lVar);
        } else {
            lVar = (com.tencent.mm.plugin.mall.ui.l) view.getTag();
            view2 = view;
        }
        lVar.f148430a.setVisibility(0);
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f148449d;
        java.util.List list = (java.util.List) arrayList.get(i17);
        int size = list.size();
        android.content.Context context = this.f148452g;
        boolean z19 = true;
        if (size > 0) {
            int i18 = ((com.tencent.mm.plugin.mall.ui.m) list.get(0)).f148441a.f381089n;
            android.util.SparseArray sparseArray = this.f148450e;
            java.lang.String str = sparseArray == null ? null : (java.lang.String) sparseArray.get(i18);
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                z17 = false;
                z18 = false;
            } else {
                if (i17 != 0) {
                    int i19 = i17 - 1;
                    if (((java.util.ArrayList) arrayList.get(i19)).size() <= 0 || i18 == ((com.tencent.mm.plugin.mall.ui.m) ((java.util.ArrayList) arrayList.get(i19)).get(0)).f148441a.f381089n) {
                        z18 = false;
                        z17 = i17 == arrayList.size() + (-1) || i18 != ((com.tencent.mm.plugin.mall.ui.m) ((java.util.ArrayList) arrayList.get(i17 + 1)).get(0)).f148441a.f381089n;
                    }
                }
                z18 = true;
                if (i17 == arrayList.size() + (-1)) {
                }
            }
            if (z18) {
                lVar.f148431b.setText(str);
                lVar.f148431b.setVisibility(0);
                android.view.View view4 = lVar.f148432c;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/mall/ui/FunctionListAdapterV2", "fillFunctionsLine", "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapterV2$LineViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/mall/ui/FunctionListAdapterV2", "fillFunctionsLine", "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapterV2$LineViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.ViewGroup.LayoutParams layoutParams = lVar.f148432c.getLayoutParams();
                layoutParams.height = (int) (i65.a.b(context, 8) * com.tencent.mm.plugin.mall.ui.b.f148339h);
                lVar.f148432c.setLayoutParams(layoutParams);
                lVar.f148431b.setMinHeight((int) (i65.a.b(context, 48) * com.tencent.mm.plugin.mall.ui.b.f148339h));
                lVar.f148432c.setBackgroundColor(com.tencent.mm.plugin.mall.ui.n2.a());
            } else {
                lVar.f148431b.setVisibility(8);
                android.view.View view5 = lVar.f148432c;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view5, arrayList3.toArray(), "com/tencent/mm/plugin/mall/ui/FunctionListAdapterV2", "fillFunctionsLine", "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapterV2$LineViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/mall/ui/FunctionListAdapterV2", "fillFunctionsLine", "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapterV2$LineViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            lVar.f148431b.setVisibility(8);
            android.view.View view6 = lVar.f148432c;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view6, arrayList4.toArray(), "com/tencent/mm/plugin/mall/ui/FunctionListAdapterV2", "fillFunctionsLine", "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapterV2$LineViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/mall/ui/FunctionListAdapterV2", "fillFunctionsLine", "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapterV2$LineViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            z17 = false;
        }
        android.widget.LinearLayout linearLayout = lVar.f148430a;
        linearLayout.setFocusable(true);
        int i27 = com.tencent.mm.plugin.mall.ui.b.f148334c / 2;
        linearLayout.setPadding(i27, 0, i27, 0);
        int i28 = 0;
        while (i28 < 4) {
            if (i28 >= linearLayout.getChildCount() || linearLayout.getChildAt(i28) == null) {
                com.tencent.mm.plugin.mall.ui.k kVar = new com.tencent.mm.plugin.mall.ui.k(this);
                android.view.View inflate = layoutInflater.inflate(com.tencent.mm.R.layout.f489254bw0, linearLayout, (boolean) r37);
                kVar.f148418a = inflate.findViewById(com.tencent.mm.R.id.j9t);
                kVar.f148419b = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.j9q);
                kVar.f148421d = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.j9v);
                kVar.f148422e = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.j9p);
                kVar.f148420c = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.k9w);
                inflate.setTag(kVar);
                if (i28 < list.size()) {
                    a(inflate, (com.tencent.mm.plugin.mall.ui.m) list.get(i28));
                } else {
                    inflate.setFocusable(true);
                    android.view.View view7 = ((com.tencent.mm.plugin.mall.ui.k) inflate.getTag()).f148418a;
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                    arrayList5.add(4);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(view7, arrayList5.toArray(), "com/tencent/mm/plugin/mall/ui/FunctionListAdapterV2", "fillFunctionsLine", "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapterV2$LineViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view7.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(view7, "com/tencent/mm/plugin/mall/ui/FunctionListAdapterV2", "fillFunctionsLine", "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapterV2$LineViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    inflate.setOnClickListener(null);
                    inflate.setEnabled(false);
                    inflate.setClickable(false);
                }
                android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(com.tencent.mm.plugin.mall.ui.b.f148336e + com.tencent.mm.plugin.mall.ui.b.f148334c, -1, 1.0f);
                inflate.setMinimumHeight(com.tencent.mm.plugin.mall.ui.b.f148335d);
                int i29 = com.tencent.mm.plugin.mall.ui.b.f148334c / 2;
                inflate.setPadding(i29, 0, i29, 0);
                linearLayout.addView(inflate, layoutParams2);
                view3 = inflate;
            } else {
                android.view.View childAt = linearLayout.getChildAt(i28);
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
                arrayList6.add(0);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(childAt, arrayList6.toArray(), "com/tencent/mm/plugin/mall/ui/FunctionListAdapterV2", "fillFunctionsLine", "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapterV2$LineViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                childAt.setVisibility(((java.lang.Integer) arrayList6.get(r37)).intValue());
                yj0.a.f(childAt, "com/tencent/mm/plugin/mall/ui/FunctionListAdapterV2", "fillFunctionsLine", "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapterV2$LineViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (i28 < list.size()) {
                    a(childAt, (com.tencent.mm.plugin.mall.ui.m) list.get(i28));
                } else {
                    linearLayout.getChildAt(i28).setFocusable(z19);
                    linearLayout.getChildAt(i28).setOnClickListener(null);
                    android.view.View view8 = ((com.tencent.mm.plugin.mall.ui.k) linearLayout.getChildAt(i28).getTag()).f148418a;
                    java.util.ArrayList arrayList7 = new java.util.ArrayList();
                    arrayList7.add(4);
                    java.util.Collections.reverse(arrayList7);
                    yj0.a.d(view8, arrayList7.toArray(), "com/tencent/mm/plugin/mall/ui/FunctionListAdapterV2", "fillFunctionsLine", "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapterV2$LineViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view8.setVisibility(((java.lang.Integer) arrayList7.get(r37)).intValue());
                    yj0.a.f(view8, "com/tencent/mm/plugin/mall/ui/FunctionListAdapterV2", "fillFunctionsLine", "(ILcom/tencent/mm/plugin/mall/ui/FunctionListAdapterV2$LineViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    childAt.setEnabled(r37);
                    childAt.setClickable(r37);
                }
                android.widget.LinearLayout.LayoutParams layoutParams3 = (android.widget.LinearLayout.LayoutParams) childAt.getLayoutParams();
                layoutParams3.width = com.tencent.mm.plugin.mall.ui.b.f148336e + com.tencent.mm.plugin.mall.ui.b.f148334c;
                childAt.setMinimumHeight(com.tencent.mm.plugin.mall.ui.b.f148335d);
                int i37 = com.tencent.mm.plugin.mall.ui.b.f148334c / 2;
                childAt.setPadding(i37, r37, i37, r37);
                childAt.setLayoutParams(layoutParams3);
                view3 = childAt;
            }
            if (!z17) {
                view3.setBackground(context.getResources().getDrawable(com.tencent.mm.R.drawable.anj));
                android.view.ViewGroup.LayoutParams layoutParams4 = lVar.f148434e.getLayoutParams();
                layoutParams4.height = i65.a.b(context, 4);
                lVar.f148434e.setLayoutParams(layoutParams4);
                lVar.f148434e.setBackground(context.getResources().getDrawable(com.tencent.mm.R.drawable.ani));
            } else if (i28 == 0) {
                view3.setBackground(context.getResources().getDrawable(com.tencent.mm.R.drawable.anf));
                android.view.ViewGroup.LayoutParams layoutParams5 = lVar.f148434e.getLayoutParams();
                if (this.f148455m) {
                    layoutParams5.height = i65.a.b(context, 8);
                } else {
                    layoutParams5.height = i65.a.b(context, 16);
                }
                lVar.f148434e.setLayoutParams(layoutParams5);
                lVar.f148434e.setBackground(context.getResources().getDrawable(com.tencent.mm.R.drawable.anh));
            } else if (i28 == 1) {
                view3.setBackground(context.getResources().getDrawable(com.tencent.mm.R.drawable.anj));
                android.view.ViewGroup.LayoutParams layoutParams6 = lVar.f148434e.getLayoutParams();
                layoutParams6.height = i65.a.b(context, 4);
                lVar.f148434e.setLayoutParams(layoutParams6);
                lVar.f148434e.setBackground(context.getResources().getDrawable(com.tencent.mm.R.drawable.ani));
            } else {
                view3.setBackground(context.getResources().getDrawable(com.tencent.mm.R.drawable.ang));
                android.view.ViewGroup.LayoutParams layoutParams7 = lVar.f148434e.getLayoutParams();
                if (this.f148455m) {
                    layoutParams7.height = i65.a.b(context, 8);
                } else {
                    layoutParams7.height = i65.a.b(context, 16);
                }
                lVar.f148434e.setLayoutParams(layoutParams7);
                lVar.f148434e.setBackground(context.getResources().getDrawable(com.tencent.mm.R.drawable.anh));
            }
            i28++;
            r37 = 0;
            z19 = true;
        }
        if (i17 == getCount() - 1) {
            lVar.f148433d.setBackgroundColor(com.tencent.mm.plugin.mall.ui.n2.a());
            android.view.View view9 = lVar.f148433d;
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
            arrayList8.add(0);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(view9, arrayList8.toArray(), "com/tencent/mm/plugin/mall/ui/FunctionListAdapterV2", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(view9, "com/tencent/mm/plugin/mall/ui/FunctionListAdapterV2", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.ViewGroup.LayoutParams layoutParams8 = lVar.f148433d.getLayoutParams();
            layoutParams8.height = i65.a.b(context, 12);
            lVar.f148433d.setLayoutParams(layoutParams8);
        } else {
            android.view.View view10 = lVar.f148433d;
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal7 = zj0.c.f473285a;
            arrayList9.add(8);
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(view10, arrayList9.toArray(), "com/tencent/mm/plugin/mall/ui/FunctionListAdapterV2", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view10.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
            yj0.a.f(view10, "com/tencent/mm/plugin/mall/ui/FunctionListAdapterV2", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return view2;
    }
}
