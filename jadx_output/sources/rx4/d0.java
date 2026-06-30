package rx4;

/* loaded from: classes8.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rx4.e0 f401128d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f401129e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(rx4.e0 e0Var, boolean z17) {
        super(0);
        this.f401128d = e0Var;
        this.f401129e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        java.lang.Class<rx4.h2> cls;
        int min;
        int i17;
        android.view.ViewGroup viewGroup;
        int i18;
        java.lang.String str2;
        android.widget.LinearLayout linearLayout;
        int i19;
        java.util.List list;
        java.lang.String str3;
        int i27;
        java.lang.Class<rx4.h2> cls2;
        java.util.List list2;
        java.util.List list3;
        rx4.e0 e0Var = this.f401128d;
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) e0Var.findViewById(com.tencent.mm.R.id.rr7);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[hitest] updateHistoryBox historyBoxView=");
        char c17 = 0;
        sb6.append(viewGroup2 != null);
        sb6.append(", block.items=");
        rx4.h hVar = e0Var.f401141h;
        sb6.append((hVar == null || (list3 = hVar.f401161d) == null) ? -1 : ((java.util.ArrayList) list3).size());
        com.tencent.mars.xlog.Log.i("FTSNativeTeachHistoryBoxUIC", sb6.toString());
        if (viewGroup2 != null) {
            android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) viewGroup2.findViewById(com.tencent.mm.R.id.cgz);
            if (viewGroup3 != null) {
                viewGroup3.removeAllViews();
            }
            java.util.List list4 = e0Var.f401143m;
            ((java.util.ArrayList) list4).clear();
            boolean z17 = this.f401129e;
            if (z17) {
                e0Var.f401138e = false;
                e0Var.f401139f = false;
                ((java.util.LinkedHashMap) e0Var.f401145o).clear();
                viewGroup3.setVisibility(0);
                android.view.View findViewById = viewGroup2.findViewById(com.tencent.mm.R.id.rqv);
                if (findViewById != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSNativeTeachHistoryBoxUIC$updateHistoryBox$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSNativeTeachHistoryBoxUIC$updateHistoryBox$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View findViewById2 = viewGroup2.findViewById(com.tencent.mm.R.id.rji);
                if (findViewById2 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSNativeTeachHistoryBoxUIC$updateHistoryBox$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(findViewById2, "com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSNativeTeachHistoryBoxUIC$updateHistoryBox$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            android.widget.TextView textView = (android.widget.TextView) viewGroup2.findViewById(com.tencent.mm.R.id.odf);
            if (textView != null) {
                rx4.h hVar2 = e0Var.f401141h;
                textView.setText(hVar2 != null ? hVar2.f401160c : null);
            }
            android.widget.TextView textView2 = (android.widget.TextView) viewGroup2.findViewById(com.tencent.mm.R.id.f485224rr2);
            if (textView2 != null) {
                textView2.setText(e0Var.f401138e ? "收起" : "展开");
            }
            android.view.View findViewById3 = viewGroup2.findViewById(com.tencent.mm.R.id.f485222rr1);
            if (findViewById3 != null) {
                findViewById3.setRotation(e0Var.f401138e ? 180.0f : 0.0f);
            }
            if (!e0Var.f401139f) {
                android.view.View findViewById4 = viewGroup2.findViewById(com.tencent.mm.R.id.rqw);
                if (findViewById4 != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                    arrayList3.add(0);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(findViewById4, arrayList3.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSNativeTeachHistoryBoxUIC$updateHistoryBox$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(findViewById4, "com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSNativeTeachHistoryBoxUIC$updateHistoryBox$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View findViewById5 = viewGroup2.findViewById(com.tencent.mm.R.id.rqx);
                if (findViewById5 != null) {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                    arrayList4.add(8);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(findViewById5, arrayList4.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSNativeTeachHistoryBoxUIC$updateHistoryBox$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(findViewById5, "com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSNativeTeachHistoryBoxUIC$updateHistoryBox$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            if (z17) {
                java.lang.String u17 = ((sg0.a3) ((su4.e1) i95.n0.c(su4.e1.class))).wi().u("websearch:history14", "");
                rx4.h hVar3 = e0Var.f401141h;
                if (hVar3 != null) {
                    kotlin.jvm.internal.o.d(u17);
                    hVar3.f401161d = rx4.e0.f401136p.a(u17, 20);
                    com.tencent.mars.xlog.Log.i("FTSNativeTeachHistoryBoxUIC", "FTSHistoryBlock fill, liveItems: " + ((java.util.ArrayList) hVar3.f401161d).size());
                }
                rx4.h hVar4 = e0Var.f401141h;
                if (hVar4 != null) {
                    hVar4.a(e0Var.f401144n);
                }
            }
            rx4.h hVar5 = e0Var.f401141h;
            java.lang.Class<rx4.h2> cls3 = rx4.h2.class;
            java.lang.String str4 = "getContext(...)";
            if (((hVar5 == null || (list2 = hVar5.f401161d) == null) ? 0 : ((java.util.ArrayList) list2).size()) > 0) {
                rx4.h hVar6 = e0Var.f401141h;
                kotlin.jvm.internal.o.d(hVar6);
                int size = ((java.util.ArrayList) hVar6.f401161d).size();
                android.view.View findViewById6 = viewGroup2.findViewById(com.tencent.mm.R.id.f485221rr0);
                if (findViewById6 != null) {
                    int i28 = (size <= 4 || e0Var.f401139f) ? 8 : 0;
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
                    arrayList5.add(java.lang.Integer.valueOf(i28));
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(findViewById6, arrayList5.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSNativeTeachHistoryBoxUIC$updateHistoryBox$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById6.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(findViewById6, "com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSNativeTeachHistoryBoxUIC$updateHistoryBox$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (e0Var.f401138e || e0Var.f401139f) {
                    min = java.lang.Math.min(size, 20);
                } else {
                    rx4.h hVar7 = e0Var.f401141h;
                    kotlin.jvm.internal.o.d(hVar7);
                    min = java.lang.Math.min(((java.util.ArrayList) hVar7.f401161d).size(), 4);
                }
                int i29 = 2;
                int i37 = (min - 1) / 2;
                if (i37 >= 0) {
                    int i38 = 0;
                    while (true) {
                        android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(e0Var.getActivity());
                        linearLayout2.setWeightSum(2.0f);
                        linearLayout2.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
                        java.lang.Integer[] numArr = new java.lang.Integer[i29];
                        int i39 = i38 * 2;
                        numArr[c17] = java.lang.Integer.valueOf(i39);
                        numArr[1] = java.lang.Integer.valueOf(i39 + 1);
                        java.util.Iterator it = kz5.c0.i(numArr).iterator();
                        while (it.hasNext()) {
                            int intValue = ((java.lang.Number) it.next()).intValue();
                            rx4.h hVar8 = e0Var.f401141h;
                            kotlin.jvm.internal.o.d(hVar8);
                            rx4.i iVar = (rx4.i) kz5.n0.a0(hVar8.f401161d, intValue);
                            if (iVar == null) {
                                linearLayout = linearLayout2;
                                i19 = i37;
                                str3 = str4;
                                cls2 = cls3;
                                list = list4;
                                i27 = i38;
                            } else {
                                android.content.Context context = viewGroup2.getContext();
                                kotlin.jvm.internal.o.f(context, str4);
                                pf5.z zVar = pf5.z.f353948a;
                                if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                                    throw new java.lang.IllegalStateException("Check failed.".toString());
                                }
                                androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(cls3);
                                kotlin.jvm.internal.o.f(a17, "get(...)");
                                rx4.h2 h2Var = (rx4.h2) a17;
                                if (h2Var.i7()) {
                                    android.view.View inflate = android.view.LayoutInflater.from(e0Var.getActivity()).inflate(h2Var.E ? com.tencent.mm.R.layout.eg7 : com.tencent.mm.R.layout.eg8, (android.view.ViewGroup) null);
                                    kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
                                    viewGroup = (android.view.ViewGroup) inflate;
                                    if (iVar.f401191g) {
                                        android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) viewGroup.findViewById(com.tencent.mm.R.id.nwj);
                                        if (linearLayout3 != null) {
                                            linearLayout3.setVisibility(0);
                                        }
                                        ((android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.vcd)).setText(iVar.f401192h);
                                    }
                                } else {
                                    android.view.View inflate2 = android.view.LayoutInflater.from(e0Var.getActivity()).inflate(h2Var.E ? com.tencent.mm.R.layout.duk : com.tencent.mm.R.layout.ega, (android.view.ViewGroup) null);
                                    kotlin.jvm.internal.o.e(inflate2, "null cannot be cast to non-null type android.view.ViewGroup");
                                    viewGroup = (android.view.ViewGroup) inflate2;
                                }
                                int i47 = i38;
                                android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(0, -2, 1.0f);
                                int i48 = intValue % 2;
                                boolean z18 = e0Var.f401139f;
                                float f17 = e0Var.f401142i;
                                if (z18) {
                                    i18 = i37;
                                    int i49 = (int) (4 * f17);
                                    layoutParams.setMargins(0, i49, 0, i49);
                                    viewGroup.setPadding(i49, i49, i49, i49);
                                    viewGroup.setBackgroundColor(b3.l.getColor(e0Var.getActivity(), com.tencent.mm.R.color.f478492d));
                                    android.view.View findViewById7 = viewGroup.findViewById(com.tencent.mm.R.id.f484036cs5);
                                    if (findViewById7 != null) {
                                        java.util.ArrayList arrayList6 = new java.util.ArrayList();
                                        java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
                                        arrayList6.add(0);
                                        java.util.Collections.reverse(arrayList6);
                                        yj0.a.d(findViewById7, arrayList6.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSNativeTeachHistoryBoxUIC$updateHistoryBox$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        str2 = str4;
                                        findViewById7.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                                        yj0.a.f(findViewById7, "com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSNativeTeachHistoryBoxUIC$updateHistoryBox$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        findViewById7.setOnClickListener(new rx4.b0(e0Var, iVar, intValue));
                                    } else {
                                        str2 = str4;
                                    }
                                } else {
                                    i18 = i37;
                                    str2 = str4;
                                    int i57 = (int) (6 * f17);
                                    layoutParams.setMargins(0, i57, 0, i57);
                                }
                                if (i48 == 0) {
                                    layoutParams.rightMargin = (int) (12 * f17);
                                }
                                viewGroup.setLayoutParams(layoutParams);
                                linearLayout2.addView(viewGroup);
                                ((java.util.ArrayList) list4).add(viewGroup);
                                android.widget.TextView textView3 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.f483931ci2);
                                java.lang.String str5 = iVar.f401186b;
                                textView3.setText(str5);
                                linearLayout = linearLayout2;
                                i19 = i18;
                                list = list4;
                                str3 = str2;
                                i27 = i47;
                                cls2 = cls3;
                                viewGroup.setOnClickListener(new rx4.c0(e0Var, iVar, intValue, viewGroup2, str5));
                            }
                            i37 = i19;
                            i38 = i27;
                            linearLayout2 = linearLayout;
                            list4 = list;
                            str4 = str3;
                            cls3 = cls2;
                        }
                        android.widget.LinearLayout linearLayout4 = linearLayout2;
                        int i58 = i37;
                        str = str4;
                        cls = cls3;
                        java.util.List list5 = list4;
                        int i59 = i38;
                        if (viewGroup3 != null) {
                            viewGroup3.addView(linearLayout4);
                        }
                        if (i59 == i58) {
                            i17 = 0;
                            break;
                        }
                        i38 = i59 + 1;
                        i37 = i58;
                        list4 = list5;
                        str4 = str;
                        cls3 = cls;
                        c17 = 0;
                        i29 = 2;
                    }
                } else {
                    str = "getContext(...)";
                    cls = cls3;
                    i17 = 0;
                }
                viewGroup2.setVisibility(i17);
            } else {
                str = "getContext(...)";
                cls = cls3;
                if (e0Var.f401139f) {
                    android.view.View findViewById8 = viewGroup2.findViewById(com.tencent.mm.R.id.rqv);
                    if (findViewById8 != null) {
                        java.util.ArrayList arrayList7 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal7 = zj0.c.f473285a;
                        arrayList7.add(8);
                        java.util.Collections.reverse(arrayList7);
                        yj0.a.d(findViewById8, arrayList7.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSNativeTeachHistoryBoxUIC$updateHistoryBox$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById8.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                        yj0.a.f(findViewById8, "com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSNativeTeachHistoryBoxUIC$updateHistoryBox$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View findViewById9 = viewGroup2.findViewById(com.tencent.mm.R.id.cgz);
                    if (findViewById9 != null) {
                        java.util.ArrayList arrayList8 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal8 = zj0.c.f473285a;
                        arrayList8.add(8);
                        java.util.Collections.reverse(arrayList8);
                        yj0.a.d(findViewById9, arrayList8.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSNativeTeachHistoryBoxUIC$updateHistoryBox$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById9.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                        yj0.a.f(findViewById9, "com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSNativeTeachHistoryBoxUIC$updateHistoryBox$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View findViewById10 = viewGroup2.findViewById(com.tencent.mm.R.id.rji);
                    if (findViewById10 != null) {
                        java.util.ArrayList arrayList9 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal9 = zj0.c.f473285a;
                        arrayList9.add(0);
                        java.util.Collections.reverse(arrayList9);
                        yj0.a.d(findViewById10, arrayList9.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSNativeTeachHistoryBoxUIC$updateHistoryBox$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById10.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                        yj0.a.f(findViewById10, "com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSNativeTeachHistoryBoxUIC$updateHistoryBox$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        android.widget.TextView textView4 = (android.widget.TextView) findViewById10.findViewById(com.tencent.mm.R.id.f484228dg2);
                        if (textView4 != null) {
                            textView4.setText("没有最近在搜内容");
                        }
                    }
                } else {
                    viewGroup2.setVisibility(8);
                }
            }
            android.content.Context context2 = viewGroup2.getContext();
            kotlin.jvm.internal.o.f(context2, str);
            pf5.z zVar2 = pf5.z.f353948a;
            if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((rx4.h2) zVar2.a((androidx.appcompat.app.AppCompatActivity) context2).a(cls)).z7();
        }
        return jz5.f0.f302826a;
    }
}
