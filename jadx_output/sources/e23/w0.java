package e23;

/* loaded from: classes12.dex */
public final class w0 extends u13.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.b1 f246975b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(e23.b1 b1Var) {
        super(b1Var);
        this.f246975b = b1Var;
    }

    @Override // u13.f
    public void b(android.content.Context context, u13.e eVar, u13.g gVar, java.lang.Object... extraData) {
        int i17;
        android.widget.LinearLayout linearLayout;
        boolean z17;
        java.util.LinkedList linkedList;
        r45.di6 di6Var;
        r45.ak6 ak6Var;
        kotlin.jvm.internal.o.g(extraData, "extraData");
        kotlin.jvm.internal.o.e(eVar, "null cannot be cast to non-null type com.tencent.mm.plugin.fts.ui.item.FTSRelevantSearchDataItem.FTSRelevantSearchViewHolder");
        em.m0 m0Var = ((e23.t0) eVar).f246966a;
        if (m0Var != null) {
            e23.b1 b1Var = this.f246975b;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(b1Var.f246785s)) {
                if (m0Var.f254592d == null) {
                    m0Var.f254592d = (android.widget.TextView) m0Var.f254589a.findViewById(com.tencent.mm.R.id.ltq);
                }
                m0Var.f254592d.setText(b1Var.f246785s);
            }
            b1Var.f246787u.getClass();
            m0Var.a().removeAllViews();
            java.lang.String str = "";
            b1Var.f246786t = "";
            if (context != null) {
                pf5.z zVar = pf5.z.f353948a;
                boolean z18 = context instanceof androidx.appcompat.app.AppCompatActivity;
                if (!z18) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                androidx.appcompat.app.AppCompatActivity appCompatActivity = (androidx.appcompat.app.AppCompatActivity) context;
                androidx.lifecycle.c1 a17 = zVar.a(appCompatActivity).a(z13.f.class);
                kotlin.jvm.internal.o.f(a17, "get(...)");
                boolean f76 = ((z13.f) a17).f7();
                if (!z18) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                boolean z19 = false;
                boolean z27 = ((c23.c0) zVar.a(appCompatActivity).a(c23.c0.class)).f38017s > 0;
                java.util.LinkedList linkedList2 = b1Var.f246783q;
                if (z27) {
                    android.widget.LinearLayout a18 = m0Var.a();
                    kotlin.jvm.internal.o.f(a18, "getSugContainer(...)");
                    int i18 = b1Var.f246784r;
                    int i19 = 0;
                    while (i19 < i18) {
                        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.efo, a18, z19);
                        em.j0 j0Var = new em.j0(inflate);
                        r45.jo0 jo0Var = (r45.jo0) kz5.n0.a0(linkedList2, i19);
                        java.lang.String str2 = str;
                        if (j0Var.f254450b == null) {
                            j0Var.f254450b = (androidx.constraintlayout.widget.ConstraintLayout) inflate.findViewById(com.tencent.mm.R.id.uxx);
                        }
                        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = j0Var.f254450b;
                        int i27 = i18;
                        kotlin.jvm.internal.o.f(constraintLayout, "getRelevantDataItemLayout(...)");
                        if (f76) {
                            z17 = f76;
                            linkedList = linkedList2;
                            linearLayout = a18;
                            constraintLayout.setPadding(i65.a.h(context, com.tencent.mm.R.dimen.f479672c9), constraintLayout.getPaddingTop(), constraintLayout.getPaddingRight(), constraintLayout.getPaddingBottom());
                        } else {
                            linearLayout = a18;
                            z17 = f76;
                            linkedList = linkedList2;
                        }
                        if (j0Var.f254451c == null) {
                            j0Var.f254451c = (com.tencent.mm.ui.widget.imageview.WeImageView) inflate.findViewById(com.tencent.mm.R.id.f483271d15);
                        }
                        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = j0Var.f254451c;
                        kotlin.jvm.internal.o.f(weImageView, "getArrowRight(...)");
                        if (j0Var.f254452d == null) {
                            j0Var.f254452d = (com.tencent.mm.ui.widget.imageview.WeImageView) inflate.findViewById(com.tencent.mm.R.id.sf7);
                        }
                        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = j0Var.f254452d;
                        kotlin.jvm.internal.o.f(weImageView2, "getArrowUpLeft(...)");
                        e(context, weImageView, weImageView2, jo0Var);
                        kotlin.jvm.internal.o.f(inflate, "getInflateRootView(...)");
                        if (j0Var.f254455g == null) {
                            j0Var.f254455g = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.ltk);
                        }
                        android.widget.TextView textView = j0Var.f254455g;
                        kotlin.jvm.internal.o.f(textView, "getRelevantQuery(...)");
                        b1Var.p(i19, inflate, textView);
                        if (i19 == b1Var.f246784r - 1) {
                            if (j0Var.f254454f == null) {
                                j0Var.f254454f = inflate.findViewById(com.tencent.mm.R.id.q_a);
                            }
                            android.view.View view = j0Var.f254454f;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                            arrayList.add(8);
                            java.util.Collections.reverse(arrayList);
                            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/item/FTSRelevantSearchDataItem$FTSRelevantSearchViewItem", "addNewSugItemView", "(Landroid/content/Context;Landroid/widget/LinearLayout;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                            yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/item/FTSRelevantSearchDataItem$FTSRelevantSearchViewItem", "addNewSugItemView", "(Landroid/content/Context;Landroid/widget/LinearLayout;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        if (jo0Var != null && (di6Var = jo0Var.f377986d) != null && (ak6Var = di6Var.f372521p) != null) {
                            int i28 = ak6Var.f370072d;
                            if (i28 != 3) {
                                if (i28 == 6) {
                                    j0Var.a().setVisibility(0);
                                    j0Var.b().setVisibility(0);
                                    android.widget.TextView b17 = j0Var.b();
                                    com.tencent.mm.protobuf.g gVar2 = ak6Var.f370073e;
                                    b17.setText(gVar2 != null ? gVar2.i() : str2);
                                    j0Var.b().setTextColor(i65.a.d(context, com.tencent.mm.R.color.OrangeRed_100));
                                } else if (i28 != 32) {
                                    if (i28 == 33) {
                                        j0Var.a().setVisibility(0);
                                        android.view.ViewGroup.LayoutParams layoutParams = j0Var.a().getLayoutParams();
                                        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                                        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
                                        layoutParams2.width = i65.a.h(context, com.tencent.mm.R.dimen.f479673ca);
                                        layoutParams2.height = i65.a.h(context, com.tencent.mm.R.dimen.f479673ca);
                                        j0Var.a().setLayoutParams(layoutParams2);
                                        j0Var.a().setImageResource(com.tencent.mm.R.raw.fts_ai_logo);
                                        j0Var.a().setIconColor(i65.a.d(context, com.tencent.mm.R.color.BW_0_Alpha_0_2));
                                    }
                                }
                            }
                            j0Var.b().setVisibility(0);
                            android.widget.TextView b18 = j0Var.b();
                            com.tencent.mm.protobuf.g gVar3 = ak6Var.f370073e;
                            b18.setText(gVar3 != null ? gVar3.i() : str2);
                            j0Var.b().setBackground(i65.a.i(context, com.tencent.mm.R.drawable.f481854d55));
                            if (ak6Var.f370072d == 32) {
                                j0Var.b().setTextColor(i65.a.d(context, com.tencent.mm.R.color.f478520a84));
                            } else {
                                j0Var.b().setTextColor(i65.a.d(context, com.tencent.mm.R.color.adg));
                            }
                            android.view.ViewGroup.LayoutParams layoutParams3 = j0Var.b().getLayoutParams();
                            kotlin.jvm.internal.o.e(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                            android.widget.LinearLayout.LayoutParams layoutParams4 = (android.widget.LinearLayout.LayoutParams) layoutParams3;
                            layoutParams4.setMarginStart(com.tencent.mm.ui.zk.a(context, 4));
                            j0Var.b().setLayoutParams(layoutParams4);
                        }
                        a18 = linearLayout;
                        a18.addView(inflate);
                        i19++;
                        str = str2;
                        i18 = i27;
                        f76 = z17;
                        linkedList2 = linkedList;
                        z19 = false;
                    }
                } else {
                    java.util.LinkedList linkedList3 = linkedList2;
                    android.widget.LinearLayout a19 = m0Var.a();
                    kotlin.jvm.internal.o.f(a19, "getSugContainer(...)");
                    int i29 = b1Var.f246784r;
                    int i37 = 0;
                    while (i37 < i29) {
                        android.view.View inflate2 = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.df9, (android.view.ViewGroup) a19, false);
                        java.util.LinkedList linkedList4 = linkedList3;
                        r45.jo0 jo0Var2 = (r45.jo0) kz5.n0.a0(linkedList4, i37);
                        kotlin.jvm.internal.o.f(inflate2, "getInflateRootView(...)");
                        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) inflate2.findViewById(com.tencent.mm.R.id.uxx);
                        if (linearLayout2 == null || !f76) {
                            i17 = i29;
                            linkedList3 = linkedList4;
                        } else {
                            i17 = i29;
                            linkedList3 = linkedList4;
                            linearLayout2.setPadding(i65.a.h(context, com.tencent.mm.R.dimen.f479672c9), linearLayout2.getPaddingTop(), linearLayout2.getPaddingRight(), linearLayout2.getPaddingBottom());
                        }
                        com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = (com.tencent.mm.ui.widget.imageview.WeImageView) inflate2.findViewById(com.tencent.mm.R.id.f483271d15);
                        kotlin.jvm.internal.o.f(weImageView3, "getArrowRight(...)");
                        com.tencent.mm.ui.widget.imageview.WeImageView weImageView4 = (com.tencent.mm.ui.widget.imageview.WeImageView) inflate2.findViewById(com.tencent.mm.R.id.sf7);
                        kotlin.jvm.internal.o.f(weImageView4, "getArrowUpLeft(...)");
                        e(context, weImageView3, weImageView4, jo0Var2);
                        android.widget.TextView textView2 = (android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.ltk);
                        kotlin.jvm.internal.o.f(textView2, "getRelevantQuery(...)");
                        b1Var.p(i37, inflate2, textView2);
                        if (i37 == b1Var.f246784r - 1) {
                            android.view.View findViewById = inflate2.findViewById(com.tencent.mm.R.id.q_a);
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                            arrayList2.add(8);
                            java.util.Collections.reverse(arrayList2);
                            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/fts/ui/item/FTSRelevantSearchDataItem$FTSRelevantSearchViewItem", "addSugItemView", "(Landroid/content/Context;Landroid/widget/LinearLayout;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                            yj0.a.f(findViewById, "com/tencent/mm/plugin/fts/ui/item/FTSRelevantSearchDataItem$FTSRelevantSearchViewItem", "addSugItemView", "(Landroid/content/Context;Landroid/widget/LinearLayout;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        a19.addView(inflate2);
                        i37++;
                        i29 = i17;
                    }
                }
                java.lang.String str3 = b1Var.f246786t;
                kotlin.jvm.internal.o.g(str3, "<set-?>");
                com.tencent.mm.plugin.fts.ui.c3.f138031b = str3;
            }
        }
    }

    @Override // u13.f
    public android.view.View c(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.bcy, viewGroup, false);
        e23.b1 b1Var = this.f246975b;
        e23.t0 o17 = b1Var.o();
        kotlin.jvm.internal.o.e(o17, "null cannot be cast to non-null type com.tencent.mm.plugin.fts.ui.item.FTSRelevantSearchDataItem.FTSRelevantSearchViewHolder");
        em.m0 m0Var = new em.m0(inflate);
        o17.f246966a = m0Var;
        if (m0Var.f254590b == null) {
            m0Var.f254590b = (com.tencent.mm.ui.widget.imageview.WeImageView) inflate.findViewById(com.tencent.mm.R.id.f486602uy1);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = m0Var.f254590b;
        if (j62.e.g().l("clicfg_android_use_search_global_sug_feedback", false, true, true)) {
            if (weImageView != null) {
                weImageView.setVisibility(0);
            }
            if (weImageView != null) {
                weImageView.setOnClickListener(new e23.u0(b1Var));
            }
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            b1Var.f246788v = activity != null ? activity.findViewById(com.tencent.mm.R.id.typ) : null;
        } else if (weImageView != null) {
            weImageView.setVisibility(8);
        }
        inflate.setTag(o17);
        return inflate;
    }

    @Override // u13.f
    public boolean d(android.content.Context context, android.view.View view, u13.g gVar, java.lang.Object... extraData) {
        kotlin.jvm.internal.o.g(extraData, "extraData");
        return false;
    }

    public final void e(android.content.Context context, com.tencent.mm.ui.widget.imageview.WeImageView weImageView, com.tencent.mm.ui.widget.imageview.WeImageView weImageView2, r45.jo0 jo0Var) {
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(z13.f.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        z13.f fVar = (z13.f) a17;
        boolean z17 = this.f246975b.f423759b == 0;
        if (!fVar.f7() || !z17) {
            weImageView2.setVisibility(8);
            weImageView.setVisibility(0);
        } else {
            weImageView2.setVisibility(0);
            weImageView.setVisibility(8);
            weImageView2.setOnClickListener(new e23.v0(fVar, jo0Var));
        }
    }
}
