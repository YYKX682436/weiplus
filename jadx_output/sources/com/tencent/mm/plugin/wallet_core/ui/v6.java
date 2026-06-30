package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class v6 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI f180671d;

    public v6(com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI walletOrderInfoOldUI) {
        this.f180671d = walletOrderInfoOldUI;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        java.util.List list = this.f180671d.f180056m;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (com.tencent.mm.plugin.wallet_core.model.Orders.Commodity) this.f180671d.f180056m.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.wallet_core.ui.u6 u6Var;
        android.view.View view2;
        com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI walletOrderInfoOldUI = this.f180671d;
        if (view == null) {
            view2 = android.view.View.inflate(walletOrderInfoOldUI, com.tencent.mm.R.layout.d7l, null);
            u6Var = new com.tencent.mm.plugin.wallet_core.ui.u6(this);
            u6Var.f180637a = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.pdb);
            u6Var.f180641e = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.pdg);
            u6Var.f180640d = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.f487670pe3);
            u6Var.f180638b = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.pe8);
            android.widget.TextView textView = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.pdv);
            u6Var.f180639c = textView;
            textView.getPaint().setFlags(16);
            u6Var.f180642f = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.pe9);
            u6Var.f180643g = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.pde);
            u6Var.f180644h = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.pda);
            u6Var.f180646j = (com.tencent.mm.ui.base.MaxListView) view2.findViewById(com.tencent.mm.R.id.pdx);
            u6Var.f180647k = view2.findViewById(com.tencent.mm.R.id.pdj);
            u6Var.f180645i = view2.findViewById(com.tencent.mm.R.id.f487668pe1);
            u6Var.f180649m = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.pea);
            u6Var.f180648l = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.peb);
            u6Var.f180650n = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.pec);
            u6Var.f180651o = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.ped);
            u6Var.f180653q = (android.view.ViewGroup) view2.findViewById(com.tencent.mm.R.id.f487672pe5);
            u6Var.f180654r = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) view2.findViewById(com.tencent.mm.R.id.o9y);
            u6Var.f180655s = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.o9u);
            u6Var.f180656t = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.o9z);
            u6Var.f180652p = view2.findViewById(com.tencent.mm.R.id.f487669pe2);
            view2.setTag(u6Var);
        } else {
            u6Var = (com.tencent.mm.plugin.wallet_core.ui.u6) view.getTag();
            view2 = view;
        }
        com.tencent.mm.plugin.wallet_core.model.Orders.Commodity commodity = (com.tencent.mm.plugin.wallet_core.model.Orders.Commodity) walletOrderInfoOldUI.f180056m.get(i17);
        if (commodity != null && u6Var != null) {
            walletOrderInfoOldUI.f180069z = commodity.f179714r;
            u6Var.f180638b.setText(com.tencent.mm.wallet_core.ui.r1.n(commodity.f179709m, commodity.f179716t));
            double d17 = commodity.f179710n;
            if (d17 < 0.0d || commodity.f179709m >= d17) {
                u6Var.f180639c.setVisibility(8);
            } else {
                u6Var.f180639c.setText(com.tencent.mm.wallet_core.ui.r1.n(d17, commodity.f179716t));
                u6Var.f180639c.setVisibility(0);
            }
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) u6Var.f180647k;
            java.util.List list = commodity.A;
            linearLayout.removeAllViews();
            if (list != null) {
                java.util.ArrayList arrayList = (java.util.ArrayList) list;
                if (arrayList.size() > 0) {
                    for (int i18 = 0; i18 < arrayList.size(); i18++) {
                        com.tencent.mm.plugin.wallet_core.model.Orders.DiscountInfo discountInfo = (com.tencent.mm.plugin.wallet_core.model.Orders.DiscountInfo) arrayList.get(i18);
                        android.widget.TextView textView2 = new android.widget.TextView(walletOrderInfoOldUI.getContext());
                        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
                        layoutParams.bottomMargin = walletOrderInfoOldUI.getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479563f);
                        textView2.setLayoutParams(layoutParams);
                        textView2.setTextAppearance(walletOrderInfoOldUI.getContext(), com.tencent.mm.R.style.f494411md);
                        if (discountInfo.f179740d > 0.0d) {
                            textView2.setText(discountInfo.f179741e + com.tencent.mm.wallet_core.ui.r1.n(discountInfo.f179740d / 100.0d, walletOrderInfoOldUI.f180057n.f179681m));
                        } else {
                            textView2.setText(discountInfo.f179741e);
                        }
                        linearLayout.addView(textView2);
                        textView2.setTextColor(walletOrderInfoOldUI.getResources().getColor(com.tencent.mm.R.color.a_s));
                    }
                }
            }
            if (linearLayout.getChildCount() > 0) {
                linearLayout.setVisibility(0);
            } else {
                linearLayout.setVisibility(8);
            }
            u6Var.f180637a.setText(c01.z1.I() ? walletOrderInfoOldUI.getString(com.tencent.mm.R.string.kso) : walletOrderInfoOldUI.getString(com.tencent.mm.R.string.ksn));
            u6Var.f180640d.setText(commodity.f179706g);
            u6Var.f180641e.setText(commodity.f179707h);
            u6Var.f180641e.setTag(commodity.f179707h);
            android.widget.TextView textView3 = u6Var.f180641e;
            android.view.View.OnLongClickListener onLongClickListener = walletOrderInfoOldUI.F;
            textView3.setOnLongClickListener(onLongClickListener);
            u6Var.f180641e.setBackgroundResource(com.tencent.mm.R.drawable.ba9);
            u6Var.f180642f.setText(commodity.f179714r);
            u6Var.f180642f.setTag(commodity.f179714r);
            u6Var.f180642f.setOnLongClickListener(onLongClickListener);
            u6Var.f180642f.setBackgroundResource(com.tencent.mm.R.drawable.ba9);
            u6Var.f180643g.setText(com.tencent.mm.wallet_core.ui.r1.p(commodity.f179713q));
            u6Var.f180644h.setText(commodity.f179715s);
            java.lang.String str = commodity.B;
            if (u6Var.f180650n != null) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    u6Var.f180651o.setVisibility(8);
                    u6Var.f180650n.setVisibility(8);
                } else {
                    u6Var.f180650n.setText(str);
                    u6Var.f180650n.setVisibility(0);
                    u6Var.f180651o.setVisibility(0);
                }
            }
            java.lang.String str2 = commodity.C;
            if (u6Var.f180649m != null) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                    u6Var.f180648l.setVisibility(8);
                    u6Var.f180649m.setVisibility(8);
                } else {
                    u6Var.f180649m.setText(str2);
                    u6Var.f180649m.setVisibility(0);
                    u6Var.f180648l.setVisibility(0);
                }
            }
            if (((java.util.ArrayList) commodity.H).size() > 0) {
                com.tencent.mm.plugin.wallet_core.model.Orders.Promotions promotions = (com.tencent.mm.plugin.wallet_core.model.Orders.Promotions) ((java.util.ArrayList) commodity.H).get(0);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13033, 1, promotions.f179776i, promotions.f179775h, promotions.f179773f, walletOrderInfoOldUI.f180069z);
                com.tencent.mm.plugin.wallet_core.ui.y6 y6Var = new com.tencent.mm.plugin.wallet_core.ui.y6(walletOrderInfoOldUI, commodity.H);
                walletOrderInfoOldUI.f180066w = y6Var;
                u6Var.f180646j.setAdapter((android.widget.ListAdapter) y6Var);
                u6Var.f180646j.setOnItemClickListener(new com.tencent.mm.plugin.wallet_core.ui.s6(this));
                walletOrderInfoOldUI.f180066w.notifyDataSetChanged();
                u6Var.f180646j.setVisibility(0);
                android.view.View view3 = u6Var.f180645i;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoOldUI$OrderInfoAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoOldUI$OrderInfoAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                u6Var.f180646j.setVisibility(8);
                u6Var.f180653q.setVisibility(8);
                android.view.View view4 = u6Var.f180645i;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoOldUI$OrderInfoAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoOldUI$OrderInfoAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.tencent.mm.plugin.wallet_core.model.Orders.RecommendTinyAppInfo recommendTinyAppInfo = commodity.D;
            if (recommendTinyAppInfo == null || com.tencent.mm.sdk.platformtools.t8.K0(recommendTinyAppInfo.f179794g)) {
                u6Var.f180653q.setVisibility(8);
                android.view.View view5 = u6Var.f180652p;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoOldUI$OrderInfoAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoOldUI$OrderInfoAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                u6Var.f180654r.setUrl(commodity.D.f179792e);
                u6Var.f180655s.setText(commodity.D.f179793f);
                u6Var.f180656t.setText(commodity.D.f179791d);
                u6Var.f180653q.setOnClickListener(new com.tencent.mm.plugin.wallet_core.ui.t6(this, commodity));
                android.view.View view6 = u6Var.f180652p;
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.add(0);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view6, arrayList5.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoOldUI$OrderInfoAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view6, "com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoOldUI$OrderInfoAdapter", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        return view2;
    }
}
