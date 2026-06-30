package ns4;

/* loaded from: classes8.dex */
public final class s1 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinIncomeDetailView f339651d;

    public s1(com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinIncomeDetailView weCoinIncomeDetailView) {
        this.f339651d = weCoinIncomeDetailView;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        android.view.View view;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams;
        java.lang.Long l17 = (java.lang.Long) obj;
        com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinIncomeDetailView weCoinIncomeDetailView = this.f339651d;
        ms4.t tVar = weCoinIncomeDetailView.f179176s;
        if (tVar == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        java.lang.Long l18 = (java.lang.Long) tVar.f331111f.getValue();
        if (l18 == null) {
            l18 = 0L;
        }
        long longValue = l18.longValue();
        ms4.t tVar2 = weCoinIncomeDetailView.f179176s;
        if (tVar2 == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        if (tVar2.f331118p && longValue <= 0) {
            android.view.View view2 = weCoinIncomeDetailView.f179168h;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("newIncomeLayout");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView$bindData$3", "onChanged", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView$bindData$3", "onChanged", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = weCoinIncomeDetailView.B;
            if (view3 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView$bindData$3", "onChanged", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView$bindData$3", "onChanged", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view4 = weCoinIncomeDetailView.f179183z;
            if (view4 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView$bindData$3", "onChanged", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView$bindData$3", "onChanged", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view5 = weCoinIncomeDetailView.f179168h;
            if (view5 == null) {
                kotlin.jvm.internal.o.o("newIncomeLayout");
                throw null;
            }
            android.widget.TextView textView = (android.widget.TextView) view5.findViewById(com.tencent.mm.R.id.qda);
            kotlin.jvm.internal.o.d(textView);
            com.tencent.mm.ui.fk.a(textView);
            ms4.t tVar3 = weCoinIncomeDetailView.f179176s;
            if (tVar3 == null) {
                kotlin.jvm.internal.o.o("mViewModel");
                throw null;
            }
            textView.setText(tVar3.f331119q);
            android.view.View view6 = weCoinIncomeDetailView.f179168h;
            if (view6 == null) {
                kotlin.jvm.internal.o.o("newIncomeLayout");
                throw null;
            }
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view6.findViewById(com.tencent.mm.R.id.qdc);
            android.widget.TextView textView2 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.qdd);
            kotlin.jvm.internal.o.d(l17);
            if (l17.longValue() > 0) {
                com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinIncomeDetailView.T6(weCoinIncomeDetailView, l17.longValue(), viewGroup, textView2);
                return;
            } else {
                viewGroup.setVisibility(8);
                return;
            }
        }
        android.view.View view7 = weCoinIncomeDetailView.f179168h;
        if (view7 == null) {
            kotlin.jvm.internal.o.o("newIncomeLayout");
            throw null;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view7, arrayList4.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView$bindData$3", "onChanged", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view7.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view7, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView$bindData$3", "onChanged", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view8 = weCoinIncomeDetailView.f179183z;
        if (view8 != null) {
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view8, arrayList5.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView$bindData$3", "onChanged", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view8, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView$bindData$3", "onChanged", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        kotlin.jvm.internal.o.d(l17);
        if (l17.longValue() > 0) {
            com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinIncomeDetailView.T6(weCoinIncomeDetailView, l17.longValue(), weCoinIncomeDetailView.B, weCoinIncomeDetailView.C);
        } else {
            android.view.View view9 = weCoinIncomeDetailView.B;
            if (view9 != null) {
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                arrayList6.add(8);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(view9, arrayList6.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView$bindData$3", "onChanged", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view9.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(view9, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView$bindData$3", "onChanged", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        ms4.t tVar4 = weCoinIncomeDetailView.f179176s;
        if (tVar4 == null) {
            kotlin.jvm.internal.o.o("mViewModel");
            throw null;
        }
        if (tVar4.f331119q.length() == 0) {
            android.widget.TextView textView3 = weCoinIncomeDetailView.A;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
        } else {
            android.widget.TextView textView4 = weCoinIncomeDetailView.A;
            if (textView4 != null) {
                textView4.setVisibility(0);
            }
            android.widget.TextView textView5 = weCoinIncomeDetailView.A;
            if (textView5 != null) {
                ms4.t tVar5 = weCoinIncomeDetailView.f179176s;
                if (tVar5 == null) {
                    kotlin.jvm.internal.o.o("mViewModel");
                    throw null;
                }
                textView5.setText(tVar5.f331119q);
            }
            android.view.View view10 = weCoinIncomeDetailView.B;
            if (view10 != null && view10.getVisibility() == 0) {
                android.widget.TextView textView6 = weCoinIncomeDetailView.A;
                java.lang.Object layoutParams = textView6 != null ? textView6.getLayoutParams() : null;
                marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams != null) {
                    marginLayoutParams.bottomMargin = (int) weCoinIncomeDetailView.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479738dv);
                }
            } else {
                android.widget.TextView textView7 = weCoinIncomeDetailView.A;
                java.lang.Object layoutParams2 = textView7 != null ? textView7.getLayoutParams() : null;
                marginLayoutParams = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
                if (marginLayoutParams != null) {
                    marginLayoutParams.bottomMargin = 0;
                }
            }
        }
        android.view.View view11 = weCoinIncomeDetailView.B;
        if (view11 != null && view11.getVisibility() == 0) {
            return;
        }
        android.widget.TextView textView8 = weCoinIncomeDetailView.A;
        if ((textView8 != null && textView8.getVisibility() == 0) || (view = weCoinIncomeDetailView.f179183z) == null) {
            return;
        }
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        arrayList7.add(8);
        java.util.Collections.reverse(arrayList7);
        yj0.a.d(view, arrayList7.toArray(), "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView$bindData$3", "onChanged", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView$bindData$3", "onChanged", "(Ljava/lang/Long;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
