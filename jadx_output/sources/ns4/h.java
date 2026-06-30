package ns4;

/* loaded from: classes8.dex */
public final class h implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ns4.s f339534d;

    public h(ns4.s sVar) {
        this.f339534d = sVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.String str;
        r45.js3 js3Var = (r45.js3) obj;
        ns4.s sVar = this.f339534d;
        if (js3Var == null) {
            sVar.getClass();
        } else {
            android.widget.TextView textView = sVar.f339645j;
            if (textView == null) {
                kotlin.jvm.internal.o.o("headerDesc");
                throw null;
            }
            textView.setVisibility(8);
        }
        if (js3Var == null) {
            sVar.getClass();
        } else {
            com.tencent.mm.ui.widget.dialog.y1 y1Var = sVar.f339638c;
            if (y1Var == null) {
                kotlin.jvm.internal.o.o("mBottomSheet");
                throw null;
            }
            y1Var.f();
            com.tencent.mm.ui.widget.dialog.y1 y1Var2 = sVar.f339638c;
            if (y1Var2 == null) {
                kotlin.jvm.internal.o.o("mBottomSheet");
                throw null;
            }
            if (!y1Var2.f()) {
                sVar.f339640e.O6(1);
            }
            sVar.c(java.lang.Boolean.FALSE);
            java.util.LinkedList price_infos = js3Var.f378085d;
            kotlin.jvm.internal.o.f(price_infos, "price_infos");
            java.util.List V0 = kz5.n0.V0(price_infos);
            r45.ha7 ha7Var = js3Var.f378089h;
            if (ha7Var == null || ha7Var.f375991d != 1) {
                ns4.d dVar = sVar.f339643h;
                if (dVar == null) {
                    kotlin.jvm.internal.o.o("mSecondAdapter");
                    throw null;
                }
                dVar.f339490f = false;
            } else {
                java.util.ArrayList arrayList = (java.util.ArrayList) V0;
                if (ha7Var.f375994g < arrayList.size()) {
                    arrayList.remove(js3Var.f378089h.f375994g);
                    ns4.d dVar2 = sVar.f339643h;
                    if (dVar2 == null) {
                        kotlin.jvm.internal.o.o("mSecondAdapter");
                        throw null;
                    }
                    dVar2.f339490f = true;
                    dVar2.f339491g = js3Var.f378089h.f375993f;
                } else {
                    ns4.d dVar3 = sVar.f339643h;
                    if (dVar3 == null) {
                        kotlin.jvm.internal.o.o("mSecondAdapter");
                        throw null;
                    }
                    dVar3.f339490f = false;
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.ArrayList arrayList4 = (java.util.ArrayList) V0;
            int size = arrayList4.size();
            for (int i17 = 0; i17 < size; i17++) {
                if (i17 < 3) {
                    arrayList2.add(arrayList4.get(i17));
                } else {
                    arrayList3.add(arrayList4.get(i17));
                }
            }
            ns4.d dVar4 = sVar.f339643h;
            if (dVar4 == null) {
                kotlin.jvm.internal.o.o("mSecondAdapter");
                throw null;
            }
            if (dVar4.f339490f) {
                arrayList3.add(new r45.ja7());
            }
            ns4.d dVar5 = sVar.f339642g;
            if (dVar5 == null) {
                kotlin.jvm.internal.o.o("mFirstAdapter");
                throw null;
            }
            dVar5.f339488d = arrayList2;
            dVar5.f339492h = new ns4.q(sVar, arrayList2);
            ns4.d dVar6 = sVar.f339643h;
            if (dVar6 == null) {
                kotlin.jvm.internal.o.o("mSecondAdapter");
                throw null;
            }
            dVar6.f339488d = arrayList3;
            dVar6.f339492h = new ns4.r(sVar, js3Var, arrayList3);
            dVar5.notifyDataSetChanged();
            ns4.d dVar7 = sVar.f339643h;
            if (dVar7 == null) {
                kotlin.jvm.internal.o.o("mSecondAdapter");
                throw null;
            }
            dVar7.notifyDataSetChanged();
            if (sVar.f339637b.f301551i != null) {
                android.view.View view = sVar.f339644i;
                if (view == null) {
                    kotlin.jvm.internal.o.o("mCustomView");
                    throw null;
                }
                if (view.getParent() == null) {
                    android.view.View view2 = sVar.f339644i;
                    if (view2 == null) {
                        kotlin.jvm.internal.o.o("mCustomView");
                        throw null;
                    }
                    ns4.v vVar = new ns4.v(view2);
                    sVar.f339639d = vVar;
                    com.tencent.mm.ui.widget.dialog.y1 y1Var3 = sVar.f339638c;
                    if (y1Var3 == null) {
                        kotlin.jvm.internal.o.o("mBottomSheet");
                        throw null;
                    }
                    y1Var3.h(vVar);
                }
            } else {
                android.view.View view3 = sVar.f339644i;
                if (view3 == null) {
                    kotlin.jvm.internal.o.o("mCustomView");
                    throw null;
                }
                if (view3.getParent() == null) {
                    com.tencent.mm.ui.widget.dialog.y1 y1Var4 = sVar.f339638c;
                    if (y1Var4 == null) {
                        kotlin.jvm.internal.o.o("mBottomSheet");
                        throw null;
                    }
                    android.view.View view4 = sVar.f339644i;
                    if (view4 == null) {
                        kotlin.jvm.internal.o.o("mCustomView");
                        throw null;
                    }
                    y1Var4.k(view4);
                }
                com.tencent.mm.ui.widget.dialog.y1 y1Var5 = sVar.f339638c;
                if (y1Var5 == null) {
                    kotlin.jvm.internal.o.o("mBottomSheet");
                    throw null;
                }
                y1Var5.s();
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            int size2 = arrayList4.size();
            for (int i18 = 0; i18 < size2; i18++) {
                r45.ja7 ja7Var = (r45.ja7) arrayList4.get(i18);
                java.lang.Object obj2 = "";
                if (ja7Var == null || (str = ja7Var.f377679d) == null) {
                    str = "";
                }
                sb6.append(str);
                sb6.append("|");
                sb6.append(ja7Var != null ? java.lang.Integer.valueOf(ja7Var.f377680e) : "");
                sb6.append("|");
                sb6.append(ja7Var != null ? java.lang.Integer.valueOf(ja7Var.f377681f) : "");
                sb6.append("|");
                sb6.append(ja7Var != null ? java.lang.Integer.valueOf(ja7Var.f377682g) : "");
                sb6.append("|");
                if (ja7Var != null) {
                    obj2 = java.lang.Boolean.valueOf(ja7Var.f377683h);
                }
                sb6.append(obj2);
                sb6.append(";");
            }
            android.view.View view5 = sVar.f339644i;
            if (view5 == null) {
                kotlin.jvm.internal.o.o("mCustomView");
                throw null;
            }
            dy1.a.k(view5, kz5.c1.l(new jz5.l("price_info", sb6), new jz5.l("diff_wecoin_count", 0)));
        }
        sVar.getClass();
        if (js3Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BuyGoodsBottomDialog", "updateCheckBox: response is null");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BuyGoodsBottomDialog", "updateCheckBox: " + js3Var.f378087f);
        android.view.View view6 = sVar.f339644i;
        if (view6 == null) {
            kotlin.jvm.internal.o.o("mCustomView");
            throw null;
        }
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view6.findViewById(com.tencent.mm.R.id.lma);
        if (js3Var.f378087f == 1) {
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setVisibility(0);
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(js3Var.f378087f);
        androidx.fragment.app.FragmentActivity fragmentActivity = sVar.f339636a;
        boolean z17 = sVar.f339641f;
        ms4.h hVar = sVar.f339640e;
        if (valueOf != null) {
            valueOf.intValue();
            hVar.O6(valueOf.intValue() == 0 ? 7 : 6);
            android.view.View view7 = sVar.f339644i;
            if (view7 == null) {
                kotlin.jvm.internal.o.o("mCustomView");
                throw null;
            }
            android.widget.CheckBox checkBox = (android.widget.CheckBox) view7.findViewById(com.tencent.mm.R.id.lmb);
            android.view.View view8 = sVar.f339644i;
            if (view8 == null) {
                kotlin.jvm.internal.o.o("mCustomView");
                throw null;
            }
            android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) view8.findViewById(com.tencent.mm.R.id.lma);
            if (z17) {
                checkBox.setBackground(fragmentActivity.getResources().getDrawable(com.tencent.mm.R.drawable.f482222bb1, null));
            }
            checkBox.setChecked(valueOf.intValue() != 0);
            linearLayout2.setOnClickListener(new ns4.p(checkBox, sVar));
        }
        java.lang.String str2 = js3Var.f378086e;
        if (str2 == null || str2.length() == 0) {
            return;
        }
        android.view.View view9 = sVar.f339644i;
        if (view9 == null) {
            kotlin.jvm.internal.o.o("mCustomView");
            throw null;
        }
        android.widget.TextView textView2 = (android.widget.TextView) view9.findViewById(com.tencent.mm.R.id.lmd);
        kotlin.jvm.internal.o.d(textView2);
        os4.h.m(textView2, 14);
        if (z17) {
            textView2.setTextColor(fragmentActivity.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_3));
        }
        r45.js3 js3Var2 = (r45.js3) hVar.f331032h.getValue();
        java.lang.String string = js3Var2 != null && js3Var2.f378087f == 1 ? fragmentActivity.getString(com.tencent.mm.R.string.oog) : fragmentActivity.getString(com.tencent.mm.R.string.kqf);
        kotlin.jvm.internal.o.d(string);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(string.concat(" "));
        java.lang.String string2 = fragmentActivity.getString(com.tencent.mm.R.string.l9x);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        spannableStringBuilder.append((java.lang.CharSequence) string2);
        spannableStringBuilder.setSpan(new com.tencent.mm.wallet_core.ui.a0((com.tencent.mm.wallet_core.ui.z) new ns4.o(sVar, str2), true), string.length(), spannableStringBuilder.length(), 18);
        textView2.setText(spannableStringBuilder);
        textView2.setClickable(true);
        textView2.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y0(fragmentActivity));
        textView2.setVisibility(0);
    }
}
