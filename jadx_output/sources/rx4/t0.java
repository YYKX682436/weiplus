package rx4;

/* loaded from: classes8.dex */
public final class t0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rx4.u0 f401277d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(rx4.u0 u0Var) {
        super(0);
        this.f401277d = u0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.ViewGroup viewGroup;
        int i17;
        rx4.v0 v0Var;
        android.view.ViewGroup viewGroup2;
        java.util.List list;
        int i18;
        int i19;
        android.widget.LinearLayout linearLayout;
        int i27;
        int i28;
        int i29;
        java.util.List list2;
        rx4.u0 u0Var = this.f401277d;
        android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) u0Var.findViewById(com.tencent.mm.R.id.f486554s23);
        if (viewGroup3 != null) {
            android.view.ViewGroup viewGroup4 = (android.view.ViewGroup) viewGroup3.findViewById(com.tencent.mm.R.id.cgz);
            android.widget.TextView textView = (android.widget.TextView) viewGroup3.findViewById(com.tencent.mm.R.id.odf);
            if (viewGroup4 != null) {
                viewGroup4.removeAllViews();
            }
            java.util.List list3 = u0Var.f401286m;
            ((java.util.ArrayList) list3).clear();
            ((java.util.LinkedHashMap) u0Var.f401287n).clear();
            u0Var.f401289p = false;
            android.view.ViewGroup viewGroup5 = null;
            if (textView != null) {
                rx4.w0 w0Var = u0Var.f401284h;
                textView.setText(w0Var != null ? w0Var.f401317d : null);
            }
            rx4.w0 w0Var2 = u0Var.f401284h;
            if (((w0Var2 == null || (list2 = w0Var2.f401318e) == null) ? 0 : ((java.util.ArrayList) list2).size()) > 0) {
                rx4.w0 w0Var3 = u0Var.f401284h;
                kotlin.jvm.internal.o.d(w0Var3);
                int i37 = 1;
                int i38 = 2;
                int size = (((java.util.ArrayList) w0Var3.f401318e).size() - 1) / 2;
                if (size >= 0) {
                    int i39 = 0;
                    while (true) {
                        android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(u0Var.getActivity());
                        linearLayout2.setWeightSum(2.0f);
                        int i47 = -2;
                        linearLayout2.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
                        java.lang.Integer[] numArr = new java.lang.Integer[i38];
                        int i48 = i39 * 2;
                        numArr[0] = java.lang.Integer.valueOf(i48);
                        numArr[i37] = java.lang.Integer.valueOf(i48 + i37);
                        java.util.Iterator it = kz5.c0.i(numArr).iterator();
                        while (it.hasNext()) {
                            int intValue = ((java.lang.Number) it.next()).intValue();
                            rx4.w0 w0Var4 = u0Var.f401284h;
                            kotlin.jvm.internal.o.d(w0Var4);
                            rx4.x0 x0Var = (rx4.x0) kz5.n0.a0(w0Var4.f401318e, intValue);
                            if (x0Var == null) {
                                i19 = i47;
                                i27 = i39;
                                viewGroup2 = viewGroup4;
                                list = list3;
                                i18 = i37;
                                linearLayout = linearLayout2;
                                i28 = size;
                            } else {
                                android.view.View inflate = android.view.LayoutInflater.from(u0Var.getActivity()).inflate(com.tencent.mm.R.layout.dum, viewGroup5);
                                int i49 = intValue % 2;
                                android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(0, i47, 1.0f);
                                if (i49 == 0) {
                                    layoutParams.rightMargin = (int) (12 * u0Var.f401285i);
                                }
                                inflate.setLayoutParams(layoutParams);
                                linearLayout2.addView(inflate);
                                ((java.util.ArrayList) list3).add(inflate);
                                android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f483931ci2);
                                java.lang.String str = x0Var.f401327d;
                                textView2.setText(str);
                                if (x0Var.f401330g) {
                                    com.tencent.mm.ui.fk.a(textView2);
                                }
                                rx4.y0 y0Var = x0Var.f401331h;
                                if (y0Var != null) {
                                    android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.nxa);
                                    textView3.setVisibility(0);
                                    textView3.setText(y0Var.f401338b);
                                    viewGroup2 = viewGroup4;
                                    list = list3;
                                    if (r26.n0.D(y0Var.f401340d, "var(--ORANGE)", false, 2, null)) {
                                        i29 = com.tencent.mm.R.color.f478526a7;
                                        i18 = 1;
                                    } else {
                                        int i57 = y0Var.f401339c;
                                        i18 = 1;
                                        i29 = i57 != 1 ? i57 != 2 ? (i57 == 6 || i57 == 11 || (i57 != 29 && i57 == 35)) ? com.tencent.mm.R.color.OrangeRed_100 : com.tencent.mm.R.color.adg : com.tencent.mm.R.color.Orange_100 : com.tencent.mm.R.color.f478522a3;
                                    }
                                    textView3.setTextColor(u0Var.getColor(i29));
                                } else {
                                    viewGroup2 = viewGroup4;
                                    list = list3;
                                    i18 = 1;
                                }
                                i19 = -2;
                                linearLayout = linearLayout2;
                                i27 = i39;
                                i28 = size;
                                inflate.setOnClickListener(new rx4.s0(u0Var, x0Var, intValue, viewGroup3, str));
                            }
                            linearLayout2 = linearLayout;
                            size = i28;
                            i37 = i18;
                            i39 = i27;
                            i47 = i19;
                            viewGroup4 = viewGroup2;
                            list3 = list;
                            viewGroup5 = null;
                        }
                        int i58 = i39;
                        android.view.ViewGroup viewGroup6 = viewGroup4;
                        java.util.List list4 = list3;
                        i17 = i37;
                        android.widget.LinearLayout linearLayout3 = linearLayout2;
                        int i59 = size;
                        viewGroup = viewGroup6;
                        if (viewGroup6 != null) {
                            viewGroup.addView(linearLayout3);
                        }
                        if (i58 == i59) {
                            break;
                        }
                        i39 = i58 + 1;
                        viewGroup4 = viewGroup;
                        size = i59;
                        i37 = i17;
                        list3 = list4;
                        viewGroup5 = null;
                        i38 = 2;
                    }
                } else {
                    viewGroup = viewGroup4;
                    i17 = 1;
                }
                rx4.w0 w0Var5 = u0Var.f401284h;
                if (w0Var5 != null && (v0Var = w0Var5.f401319f) != null) {
                    java.lang.String str2 = v0Var.f401301b;
                    if ((str2.length() == 0 ? i17 : 0) == 0) {
                        android.app.Activity context = u0Var.getContext();
                        kotlin.jvm.internal.o.g(context, "context");
                        pf5.z zVar = pf5.z.f353948a;
                        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                            throw new java.lang.IllegalStateException("Check failed.".toString());
                        }
                        android.view.View inflate2 = android.view.LayoutInflater.from(u0Var.getActivity()).inflate(((rx4.h2) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(rx4.h2.class)).E ? com.tencent.mm.R.layout.egh : com.tencent.mm.R.layout.egi, viewGroup3, false);
                        android.widget.ImageView imageView = (android.widget.ImageView) inflate2.findViewById(com.tencent.mm.R.id.f483348sh5);
                        int i66 = (int) (18 * u0Var.f401285i);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(8);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(inflate2, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSNativeTeachRecommendBoxUIC", "renderBanner", "(Landroid/view/ViewGroup;Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSRecommendBannerInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        inflate2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(inflate2, "com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSNativeTeachRecommendBoxUIC", "renderBanner", "(Landroid/view/ViewGroup;Landroid/view/ViewGroup;Lcom/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSRecommendBannerInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        if (viewGroup != null) {
                            viewGroup.addView(inflate2);
                        }
                        u0Var.f401288o = inflate2;
                        wo0.b bVar = (wo0.b) vo0.e.f438468b.a(str2);
                        bVar.g((yo0.i) n0.o5.f333666c.getValue());
                        kotlin.jvm.internal.o.d(imageView);
                        bVar.i(imageView, new n0.k5(inflate2, i66, imageView, v0Var, u0Var));
                    }
                }
                viewGroup3.setVisibility(0);
            } else {
                viewGroup3.setVisibility(8);
            }
        }
        return jz5.f0.f302826a;
    }
}
