package com.tencent.mm.plugin.mall.ui;

/* loaded from: classes8.dex */
public class r extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mall.ui.MallFunctionSettingsUI f148472d;

    public r(com.tencent.mm.plugin.mall.ui.MallFunctionSettingsUI mallFunctionSettingsUI, com.tencent.mm.plugin.mall.ui.p pVar) {
        this.f148472d = mallFunctionSettingsUI;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((java.util.ArrayList) this.f148472d.f148236m).size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (com.tencent.mm.plugin.mall.ui.s) ((java.util.ArrayList) this.f148472d.f148236m).get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        return ((com.tencent.mm.plugin.mall.ui.s) ((java.util.ArrayList) this.f148472d.f148236m).get(i17)).f148477a;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View view2;
        com.tencent.mm.plugin.mall.ui.MallFunctionSettingsUI mallFunctionSettingsUI = this.f148472d;
        if (view == null) {
            int itemViewType = getItemViewType(i17);
            com.tencent.mm.plugin.mall.ui.u uVar = new com.tencent.mm.plugin.mall.ui.u(mallFunctionSettingsUI, null);
            if (itemViewType == 1) {
                view2 = android.view.LayoutInflater.from(mallFunctionSettingsUI.getContext()).inflate(com.tencent.mm.R.layout.bvv, viewGroup, false);
                ((android.view.ViewGroup) view2).getChildAt(0).setId(com.tencent.mm.R.id.m7j);
                uVar.f148494a = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) view2.findViewById(com.tencent.mm.R.id.jil);
                uVar.f148495b = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.jin);
                uVar.f148496c = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.jij);
                uVar.f148497d = (com.tencent.mm.ui.widget.MMSwitchBtn) view2.findViewById(com.tencent.mm.R.id.jim);
                uVar.f148498e = view2.findViewById(com.tencent.mm.R.id.jik);
                uVar.f148500g = view2.findViewById(com.tencent.mm.R.id.jii);
                uVar.f148499f = (android.view.ViewGroup) view2;
                uVar.f148494a.setUseSdcardCache(true);
            } else {
                view2 = android.view.LayoutInflater.from(mallFunctionSettingsUI.getContext()).inflate(com.tencent.mm.R.layout.bvw, viewGroup, false);
                uVar.f148495b = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.jio);
                uVar.f148499f = (android.view.ViewGroup) view2;
            }
            view2.setTag(uVar);
        } else {
            view2 = view;
        }
        com.tencent.mm.plugin.mall.ui.s sVar = (com.tencent.mm.plugin.mall.ui.s) ((java.util.ArrayList) mallFunctionSettingsUI.f148236m).get(i17);
        com.tencent.mm.plugin.mall.ui.u uVar2 = (com.tencent.mm.plugin.mall.ui.u) view2.getTag();
        uVar2.getClass();
        int i18 = sVar.f148477a;
        if (i18 == 1) {
            r45.y55 y55Var = sVar.f148478b;
            if (com.tencent.mm.ui.bk.C()) {
                java.lang.String str = y55Var.f390809n;
                if (str != null) {
                    uVar2.f148494a.setUrl(str);
                } else {
                    java.lang.String str2 = y55Var.f390805g;
                    if (str2 != null) {
                        uVar2.f148494a.setUrl(str2);
                    }
                }
            } else {
                java.lang.String str3 = y55Var.f390805g;
                if (str3 != null) {
                    uVar2.f148494a.setUrl(str3);
                }
            }
            java.lang.String str4 = y55Var.f390804f;
            if (str4 != null) {
                uVar2.f148495b.setText(str4);
            }
            java.lang.String str5 = y55Var.f390806h;
            if (str5 == null || com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
                uVar2.f148496c.setVisibility(8);
            } else {
                uVar2.f148496c.setText(y55Var.f390806h);
                uVar2.f148496c.setVisibility(0);
            }
            int i19 = y55Var.f390803e;
            com.tencent.mm.plugin.mall.ui.MallFunctionSettingsUI mallFunctionSettingsUI2 = uVar2.f148501h;
            if (i19 == 0) {
                uVar2.f148497d.setCheck(true);
                uVar2.f148497d.setEnabled(true);
                uVar2.f148495b.setTextColor(mallFunctionSettingsUI2.getContext().getResources().getColor(com.tencent.mm.R.color.f_));
                android.view.View view3 = uVar2.f148500g;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/mall/ui/MallFunctionSettingsUI$VH", "setData", "(Lcom/tencent/mm/plugin/mall/ui/MallFunctionSettingsUI$FunctionModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/mall/ui/MallFunctionSettingsUI$VH", "setData", "(Lcom/tencent/mm/plugin/mall/ui/MallFunctionSettingsUI$FunctionModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (i19 == 1) {
                uVar2.f148497d.setCheck(false);
                uVar2.f148497d.setEnabled(true);
                uVar2.f148495b.setTextColor(mallFunctionSettingsUI2.getContext().getResources().getColor(com.tencent.mm.R.color.f_));
                android.view.View view4 = uVar2.f148500g;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/mall/ui/MallFunctionSettingsUI$VH", "setData", "(Lcom/tencent/mm/plugin/mall/ui/MallFunctionSettingsUI$FunctionModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/mall/ui/MallFunctionSettingsUI$VH", "setData", "(Lcom/tencent/mm/plugin/mall/ui/MallFunctionSettingsUI$FunctionModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (i19 == 2) {
                uVar2.f148497d.setCheck(false);
                uVar2.f148497d.setEnabled(false);
                android.view.View view5 = uVar2.f148500g;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view5, arrayList3.toArray(), "com/tencent/mm/plugin/mall/ui/MallFunctionSettingsUI$VH", "setData", "(Lcom/tencent/mm/plugin/mall/ui/MallFunctionSettingsUI$FunctionModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/mall/ui/MallFunctionSettingsUI$VH", "setData", "(Lcom/tencent/mm/plugin/mall/ui/MallFunctionSettingsUI$FunctionModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            uVar2.f148497d.setSwitchListener(new com.tencent.mm.plugin.mall.ui.t(uVar2, y55Var));
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) uVar2.f148498e.getLayoutParams();
            if (sVar.f148480d) {
                layoutParams.leftMargin = 0;
            } else {
                layoutParams.leftMargin = mallFunctionSettingsUI2.f148231e;
            }
            uVar2.f148498e.setLayoutParams(layoutParams);
        } else if (i18 == 0) {
            uVar2.f148495b.setText(sVar.f148479c);
        }
        return view2;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 2;
    }
}
