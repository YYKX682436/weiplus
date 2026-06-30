package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class bh implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.kh f112036d;

    public bh(com.tencent.mm.plugin.finder.live.plugin.kh khVar) {
        this.f112036d = khVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i17;
        android.widget.TextView textView;
        r45.oa4 oa4Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.y6((zy2.zb) c17, ml2.z4.M, "2", null, 4, null);
        com.tencent.mm.plugin.finder.live.plugin.kh khVar = this.f112036d;
        int x17 = khVar.x1();
        android.view.ViewGroup viewGroup = khVar.f365323d;
        if (x17 == 1) {
            com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(viewGroup.getContext(), 2, 0, true, false);
            z2Var.y(viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.f490454vi));
            z2Var.x(6);
            z2Var.F = new com.tencent.mm.plugin.finder.live.plugin.gh(z2Var);
            android.view.View inflate = com.tencent.mm.ui.id.b(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.and, (android.view.ViewGroup) null);
            android.widget.TextView textView2 = inflate != null ? (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.l3j) : null;
            if (textView2 != null) {
                textView2.setText(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.dth));
            }
            z2Var.j(inflate);
            z2Var.C();
        } else if (x17 == 2) {
            com.tencent.mm.ui.widget.dialog.z2 z2Var2 = new com.tencent.mm.ui.widget.dialog.z2(viewGroup.getContext(), 2, 0, true, false);
            z2Var2.y(viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.f490454vi));
            z2Var2.x(6);
            z2Var2.F = new com.tencent.mm.plugin.finder.live.plugin.hh(z2Var2);
            android.view.View inflate2 = com.tencent.mm.ui.id.b(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.ama, (android.view.ViewGroup) null);
            int dimensionPixelSize = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479704cz);
            android.widget.TextView textView3 = inflate2 != null ? (android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.l3i) : null;
            if (textView3 != null) {
                textView3.setText(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.eez));
            }
            android.widget.TextView textView4 = inflate2 != null ? (android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.l3e) : null;
            if (textView4 != null) {
                textView4.setText(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.eex));
            }
            android.widget.TextView textView5 = inflate2 != null ? (android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.l3f) : null;
            if (textView5 != null) {
                textView5.setText(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.eey));
            }
            android.widget.TextView textView6 = inflate2 != null ? (android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.l3c) : null;
            if (textView6 != null) {
                android.text.SpannableString spannableString = new android.text.SpannableString(" •  " + com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.eev));
                spannableString.setSpan(new android.text.style.LeadingMarginSpan.Standard(0, dimensionPixelSize), 0, spannableString.length(), 33);
                textView6.setText(spannableString);
            }
            android.widget.TextView textView7 = inflate2 != null ? (android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.l3d) : null;
            if (textView7 != null) {
                android.text.SpannableString spannableString2 = new android.text.SpannableString(" •  " + com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.eew));
                spannableString2.setSpan(new android.text.style.LeadingMarginSpan.Standard(0, dimensionPixelSize), 0, spannableString2.length(), 33);
                textView7.setText(spannableString2);
            }
            android.view.View findViewById = inflate2 != null ? inflate2.findViewById(com.tencent.mm.R.id.usq) : null;
            if (findViewById != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                android.view.View view2 = findViewById;
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin", "showExceptionTipPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin", "showExceptionTipPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View findViewById2 = inflate2 != null ? inflate2.findViewById(com.tencent.mm.R.id.usp) : null;
            if (findViewById2 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                android.view.View view3 = findViewById2;
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin", "showExceptionTipPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin", "showExceptionTipPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View findViewById3 = inflate2 != null ? inflate2.findViewById(com.tencent.mm.R.id.uso) : null;
            if (findViewById3 != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                android.view.View view4 = findViewById3;
                yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin", "showExceptionTipPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin", "showExceptionTipPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.widget.TextView textView8 = inflate2 != null ? (android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.l3b) : null;
            android.widget.TextView textView9 = inflate2 != null ? (android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.l3a) : null;
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout = inflate2 instanceof androidx.constraintlayout.widget.ConstraintLayout ? (androidx.constraintlayout.widget.ConstraintLayout) inflate2 : null;
            if (constraintLayout != null) {
                androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
                cVar.d(constraintLayout);
                cVar.f(com.tencent.mm.R.id.l3b, 3, com.tencent.mm.R.id.l3d, 4, constraintLayout.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479714d7));
                cVar.b(constraintLayout);
                constraintLayout.setConstraintSet(null);
            }
            if (textView8 != null) {
                textView8.setVisibility(0);
            }
            if (textView9 != null) {
                textView9.setVisibility(0);
            }
            z2Var2.j(inflate2);
            z2Var2.C();
        } else if (x17 == 4) {
            com.tencent.mm.ui.widget.dialog.z2 z2Var3 = new com.tencent.mm.ui.widget.dialog.z2(viewGroup.getContext(), 2, 0, true, false);
            z2Var3.y(viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.f490454vi));
            z2Var3.x(6);
            z2Var3.F = new com.tencent.mm.plugin.finder.live.plugin.ih(z2Var3);
            android.view.View inflate3 = com.tencent.mm.ui.id.b(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.and, (android.view.ViewGroup) null);
            android.widget.TextView textView10 = inflate3 != null ? (android.widget.TextView) inflate3.findViewById(com.tencent.mm.R.id.l3j) : null;
            if (textView10 != null) {
                textView10.setText(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.egd));
            }
            z2Var3.j(inflate3);
            z2Var3.C();
        } else if (x17 == 8) {
            com.tencent.mm.ui.widget.dialog.z2 z2Var4 = new com.tencent.mm.ui.widget.dialog.z2(viewGroup.getContext(), 0, 0, true, false);
            android.view.View inflate4 = com.tencent.mm.ui.id.b(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.ama, (android.view.ViewGroup) null);
            android.widget.TextView textView11 = inflate4 != null ? (android.widget.TextView) inflate4.findViewById(com.tencent.mm.R.id.l3i) : null;
            if (textView11 != null) {
                textView11.setText(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.dzn));
            }
            android.widget.TextView textView12 = inflate4 != null ? (android.widget.TextView) inflate4.findViewById(com.tencent.mm.R.id.l3e) : null;
            if (textView12 != null) {
                textView12.setText(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.dzl));
            }
            int dimensionPixelSize2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479704cz);
            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.dzj);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            android.widget.TextView textView13 = inflate4 != null ? (android.widget.TextView) inflate4.findViewById(com.tencent.mm.R.id.l3c) : null;
            if (textView13 != null) {
                android.text.SpannableString spannableString3 = new android.text.SpannableString(" •  ".concat(string));
                spannableString3.setSpan(new android.text.style.LeadingMarginSpan.Standard(0, dimensionPixelSize2), 0, spannableString3.length(), 33);
                textView13.setText(spannableString3);
            }
            mm2.e1 e1Var = (mm2.e1) dk2.ef.f233372a.i(mm2.e1.class);
            java.util.LinkedList linkedList = (e1Var == null || (oa4Var = e1Var.f328996z) == null) ? null : oa4Var.I;
            if (linkedList == null || linkedList.isEmpty()) {
                android.widget.TextView textView14 = inflate4 != null ? (android.widget.TextView) inflate4.findViewById(com.tencent.mm.R.id.l3h) : null;
                if (textView14 != null) {
                    textView14.setVisibility(0);
                }
                android.widget.TextView textView15 = inflate4 != null ? (android.widget.TextView) inflate4.findViewById(com.tencent.mm.R.id.l3f) : null;
                if (textView15 != null) {
                    textView15.setVisibility(0);
                }
                android.widget.TextView textView16 = inflate4 != null ? (android.widget.TextView) inflate4.findViewById(com.tencent.mm.R.id.l3d) : null;
                if (textView16 != null) {
                    textView16.setVisibility(0);
                }
                android.widget.TextView textView17 = inflate4 != null ? (android.widget.TextView) inflate4.findViewById(com.tencent.mm.R.id.l3f) : null;
                if (textView17 != null) {
                    textView17.setText(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.ox7));
                }
                java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f493754ox4);
                kotlin.jvm.internal.o.f(string2, "getString(...)");
                android.widget.TextView textView18 = inflate4 != null ? (android.widget.TextView) inflate4.findViewById(com.tencent.mm.R.id.l3d) : null;
                if (textView18 != null) {
                    android.text.SpannableString spannableString4 = new android.text.SpannableString(" •  ".concat(string2));
                    spannableString4.setSpan(new android.text.style.LeadingMarginSpan.Standard(0, dimensionPixelSize2), 0, spannableString4.length(), 33);
                    textView18.setText(spannableString4);
                }
                android.view.View findViewById4 = inflate4 != null ? inflate4.findViewById(com.tencent.mm.R.id.usq) : null;
                if (findViewById4 != null) {
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                    arrayList5.add(8);
                    java.util.Collections.reverse(arrayList5);
                    android.view.View view5 = findViewById4;
                    yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin", "showExceptionTipPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById4.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(view5, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin", "showExceptionTipPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View findViewById5 = inflate4 != null ? inflate4.findViewById(com.tencent.mm.R.id.usp) : null;
                if (findViewById5 != null) {
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
                    arrayList6.add(8);
                    java.util.Collections.reverse(arrayList6);
                    android.view.View view6 = findViewById5;
                    yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin", "showExceptionTipPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById5.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                    yj0.a.f(view6, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin", "showExceptionTipPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View findViewById6 = inflate4 != null ? inflate4.findViewById(com.tencent.mm.R.id.uso) : null;
                if (findViewById6 != null) {
                    java.util.ArrayList arrayList7 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
                    arrayList7.add(8);
                    java.util.Collections.reverse(arrayList7);
                    android.view.View view7 = findViewById6;
                    yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin", "showExceptionTipPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById6.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                    yj0.a.f(view7, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin", "showExceptionTipPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                android.widget.TextView textView19 = inflate4 != null ? (android.widget.TextView) inflate4.findViewById(com.tencent.mm.R.id.l3h) : null;
                if (textView19 != null) {
                    textView19.setVisibility(0);
                }
                android.widget.TextView textView20 = inflate4 != null ? (android.widget.TextView) inflate4.findViewById(com.tencent.mm.R.id.l3f) : null;
                if (textView20 != null) {
                    textView20.setVisibility(0);
                }
                android.widget.TextView textView21 = inflate4 != null ? (android.widget.TextView) inflate4.findViewById(com.tencent.mm.R.id.l3d) : null;
                if (textView21 != null) {
                    textView21.setVisibility(0);
                }
                android.widget.TextView textView22 = inflate4 != null ? (android.widget.TextView) inflate4.findViewById(com.tencent.mm.R.id.l3f) : null;
                if (textView22 != null) {
                    textView22.setText(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.dzm));
                }
                java.lang.String string3 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.dzk);
                kotlin.jvm.internal.o.f(string3, "getString(...)");
                java.lang.String string4 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.ox6);
                kotlin.jvm.internal.o.f(string4, "getString(...)");
                android.text.SpannableString spannableString5 = new android.text.SpannableString(" •  " + string3 + string4);
                spannableString5.setSpan(new android.text.style.LeadingMarginSpan.Standard(0, dimensionPixelSize2), 0, spannableString5.length(), 33);
                spannableString5.setSpan(new com.tencent.mm.plugin.finder.live.plugin.jh(khVar), spannableString5.length() - string4.length(), spannableString5.length(), 33);
                spannableString5.setSpan(new android.text.style.ForegroundColorSpan(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.Link_100)), spannableString5.length() - string4.length(), spannableString5.length(), 33);
                if (inflate4 != null) {
                    i17 = com.tencent.mm.R.id.l3d;
                    textView = (android.widget.TextView) inflate4.findViewById(com.tencent.mm.R.id.l3d);
                } else {
                    i17 = com.tencent.mm.R.id.l3d;
                    textView = null;
                }
                if (textView != null) {
                    textView.setText(spannableString5);
                }
                android.widget.TextView textView23 = inflate4 != null ? (android.widget.TextView) inflate4.findViewById(i17) : null;
                if (textView23 != null) {
                    textView23.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
                }
                android.widget.TextView textView24 = inflate4 != null ? (android.widget.TextView) inflate4.findViewById(com.tencent.mm.R.id.usq) : null;
                if (textView24 != null) {
                    textView24.setVisibility(0);
                }
                android.widget.TextView textView25 = inflate4 != null ? (android.widget.TextView) inflate4.findViewById(com.tencent.mm.R.id.usp) : null;
                if (textView25 != null) {
                    textView25.setVisibility(0);
                }
                android.widget.TextView textView26 = inflate4 != null ? (android.widget.TextView) inflate4.findViewById(com.tencent.mm.R.id.uso) : null;
                if (textView26 != null) {
                    textView26.setVisibility(0);
                }
                android.widget.TextView textView27 = inflate4 != null ? (android.widget.TextView) inflate4.findViewById(com.tencent.mm.R.id.usp) : null;
                if (textView27 != null) {
                    textView27.setText(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.ox7));
                }
                java.lang.String string5 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.f493754ox4);
                kotlin.jvm.internal.o.f(string5, "getString(...)");
                android.widget.TextView textView28 = inflate4 != null ? (android.widget.TextView) inflate4.findViewById(com.tencent.mm.R.id.uso) : null;
                if (textView28 != null) {
                    android.text.SpannableString spannableString6 = new android.text.SpannableString(" •  ".concat(string5));
                    spannableString6.setSpan(new android.text.style.LeadingMarginSpan.Standard(0, dimensionPixelSize2), 0, spannableString6.length(), 33);
                    textView28.setText(spannableString6);
                }
            }
            android.view.View findViewById7 = inflate4 != null ? inflate4.findViewById(com.tencent.mm.R.id.l3b) : null;
            if (findViewById7 != null) {
                java.util.ArrayList arrayList8 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal7 = zj0.c.f473285a;
                arrayList8.add(0);
                java.util.Collections.reverse(arrayList8);
                android.view.View view8 = findViewById7;
                yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin", "showExceptionTipPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById7.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                yj0.a.f(view8, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin", "showExceptionTipPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View findViewById8 = inflate4 != null ? inflate4.findViewById(com.tencent.mm.R.id.l3a) : null;
            if (findViewById8 != null) {
                java.util.ArrayList arrayList9 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal8 = zj0.c.f473285a;
                arrayList9.add(0);
                java.util.Collections.reverse(arrayList9);
                android.view.View view9 = findViewById8;
                yj0.a.d(view9, arrayList9.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin", "showExceptionTipPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById8.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                yj0.a.f(view9, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin", "showExceptionTipPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (inflate4 != null) {
                inflate4.setPadding(inflate4.getPaddingLeft(), inflate4.getPaddingTop(), inflate4.getPaddingRight(), inflate4.getPaddingBottom() + i65.a.h(viewGroup.getContext(), com.tencent.mm.R.dimen.f479653br));
            }
            z2Var4.j(inflate4);
            z2Var4.C();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
