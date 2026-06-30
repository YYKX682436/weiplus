package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class t5 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyHistoryEnvelopeUI f147443e;

    public t5(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyHistoryEnvelopeUI luckyMoneyHistoryEnvelopeUI) {
        this.f147443e = luckyMoneyHistoryEnvelopeUI;
    }

    @Override // in5.r
    public in5.s0 d(androidx.recyclerview.widget.RecyclerView recyclerView, android.view.View view) {
        return new com.tencent.mm.plugin.luckymoney.ui.w5(this.f147443e, view);
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.bui;
    }

    @Override // in5.r
    public void h(in5.s0 s0Var, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.Integer num;
        com.tencent.mm.chatting.component.ListScrollPAGView listScrollPAGView;
        android.view.View view;
        int i19;
        com.tencent.mm.plugin.luckymoney.ui.i5 i5Var = (com.tencent.mm.plugin.luckymoney.ui.i5) cVar;
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ri((android.widget.ImageView) s0Var.p(com.tencent.mm.R.id.ij7), c01.z1.r(), 0.06f);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyHistoryEnvelopeUI luckyMoneyHistoryEnvelopeUI = this.f147443e;
        s0Var.s(com.tencent.mm.R.id.ikt, luckyMoneyHistoryEnvelopeUI.getString(com.tencent.mm.R.string.god, ((ke0.e) xVar).bj(luckyMoneyHistoryEnvelopeUI.getContext(), c01.z1.l(), i65.a.h(luckyMoneyHistoryEnvelopeUI.getContext(), com.tencent.mm.R.dimen.f479599a9))));
        r45.wv3 wv3Var = i5Var.f147015d;
        android.view.View p17 = s0Var.p(com.tencent.mm.R.id.ik_);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "resetEnvelopeDecoration", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "resetEnvelopeDecoration", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((android.widget.ImageView) s0Var.p(com.tencent.mm.R.id.ik_)).setImageBitmap(null);
        android.view.View p18 = s0Var.p(com.tencent.mm.R.id.ikh);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "resetEnvelopeDecoration", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(p18, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "resetEnvelopeDecoration", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        s0Var.p(com.tencent.mm.R.id.ikg).setBackgroundResource(com.tencent.mm.R.drawable.f481946am4);
        android.view.View p19 = s0Var.p(com.tencent.mm.R.id.ikj);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(p19, arrayList3.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "resetEnvelopeDecoration", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p19.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(p19, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "resetEnvelopeDecoration", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View p27 = s0Var.p(com.tencent.mm.R.id.ikm);
        com.tencent.mm.chatting.component.ListScrollPAGView listScrollPAGView2 = (com.tencent.mm.chatting.component.ListScrollPAGView) s0Var.p(com.tencent.mm.R.id.ikl);
        android.view.View p28 = s0Var.p(com.tencent.mm.R.id.ikp);
        com.tencent.mm.chatting.component.ListScrollPAGView listScrollPAGView3 = (com.tencent.mm.chatting.component.ListScrollPAGView) s0Var.p(com.tencent.mm.R.id.iko);
        if (p27 != null) {
            listScrollPAGView2.n();
            if (s0Var instanceof com.tencent.mm.plugin.luckymoney.ui.w5) {
                com.tencent.mm.plugin.luckymoney.ui.w5 w5Var = (com.tencent.mm.plugin.luckymoney.ui.w5) s0Var;
                listScrollPAGView2.i(w5Var.f147632n);
                w5Var.f147632n = null;
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            num = 8;
            listScrollPAGView = listScrollPAGView3;
            yj0.a.d(p27, arrayList4.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "resetPagView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p27.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(p27, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "resetPagView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view = p28;
        } else {
            num = 8;
            listScrollPAGView = listScrollPAGView3;
            view = p28;
        }
        if (view != null) {
            listScrollPAGView.n();
            if (s0Var instanceof com.tencent.mm.plugin.luckymoney.ui.w5) {
                com.tencent.mm.plugin.luckymoney.ui.w5 w5Var2 = (com.tencent.mm.plugin.luckymoney.ui.w5) s0Var;
                com.tencent.mm.chatting.component.ListScrollPAGView listScrollPAGView4 = listScrollPAGView;
                listScrollPAGView4.i(w5Var2.f147633o);
                listScrollPAGView4.j(w5Var2.f147634p);
                w5Var2.f147633o = null;
                w5Var2.f147634p = null;
            }
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(num);
            java.util.Collections.reverse(arrayList5);
            android.view.View view2 = view;
            yj0.a.d(view2, arrayList5.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "resetPagView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "resetPagView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (wv3Var.f389501g != null) {
            android.widget.ImageView imageView = (android.widget.ImageView) s0Var.p(com.tencent.mm.R.id.ikj);
            android.view.View p29 = s0Var.p(com.tencent.mm.R.id.ikm);
            android.view.View p37 = s0Var.p(com.tencent.mm.R.id.ikp);
            if (n(s0Var, wv3Var.f389501g)) {
                imageView.setVisibility(0);
                android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                layoutParams.width = luckyMoneyHistoryEnvelopeUI.f146128o;
                layoutParams.height = luckyMoneyHistoryEnvelopeUI.f146129p;
                imageView.setLayoutParams(layoutParams);
                r45.xv3 xv3Var = wv3Var.f389501g;
                if ((s0Var.p(com.tencent.mm.R.id.ikp) == null || xv3Var == null || com.tencent.mm.sdk.platformtools.t8.K0(xv3Var.f390494x) || xv3Var.D != 2) ? false : true) {
                    i19 = 8;
                    float b17 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 8);
                    if (p37 != null) {
                        p37.setOutlineProvider(new zl5.a(true, true, b17));
                    }
                    if (p37 != null) {
                        p37.setClipToOutline(true);
                    }
                    android.view.ViewGroup.LayoutParams layoutParams2 = p37.getLayoutParams();
                    layoutParams2.width = luckyMoneyHistoryEnvelopeUI.f146128o;
                    layoutParams2.height = luckyMoneyHistoryEnvelopeUI.f146129p;
                    p37.setLayoutParams(layoutParams2);
                } else {
                    i19 = 8;
                    if (p37 != null) {
                        java.util.ArrayList arrayList6 = new java.util.ArrayList();
                        arrayList6.add(8);
                        java.util.Collections.reverse(arrayList6);
                        yj0.a.d(p37, arrayList6.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "recalculateItemSize", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        p37.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                        yj0.a.f(p37, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "recalculateItemSize", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        java.util.ArrayList arrayList7 = new java.util.ArrayList();
                        arrayList7.add(8);
                        java.util.Collections.reverse(arrayList7);
                        yj0.a.d(p29, arrayList7.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "recalculateItemSize", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        p29.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                        yj0.a.f(p29, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "recalculateItemSize", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
                android.widget.LinearLayout.LayoutParams layoutParams3 = (android.widget.LinearLayout.LayoutParams) s0Var.p(com.tencent.mm.R.id.ikg).getLayoutParams();
                layoutParams3.width = luckyMoneyHistoryEnvelopeUI.f146126m;
                int i27 = luckyMoneyHistoryEnvelopeUI.f146127n;
                layoutParams3.height = i27;
                layoutParams3.topMargin = (luckyMoneyHistoryEnvelopeUI.f146129p - i27) / 2;
                s0Var.p(com.tencent.mm.R.id.ikg).setLayoutParams(layoutParams3);
                android.widget.RelativeLayout.LayoutParams layoutParams4 = (android.widget.RelativeLayout.LayoutParams) s0Var.p(com.tencent.mm.R.id.ikq).getLayoutParams();
                layoutParams4.width = luckyMoneyHistoryEnvelopeUI.f146126m;
                int i28 = luckyMoneyHistoryEnvelopeUI.f146127n;
                layoutParams4.height = i28;
                layoutParams4.topMargin = (luckyMoneyHistoryEnvelopeUI.f146129p - i28) / 2;
                s0Var.p(com.tencent.mm.R.id.ikq).setLayoutParams(layoutParams4);
                android.view.ViewGroup.LayoutParams layoutParams5 = s0Var.p(com.tencent.mm.R.id.ik_).getLayoutParams();
                layoutParams5.width = luckyMoneyHistoryEnvelopeUI.f146126m;
                layoutParams5.height = luckyMoneyHistoryEnvelopeUI.f146127n;
                s0Var.p(com.tencent.mm.R.id.ik_).setLayoutParams(layoutParams5);
                android.view.ViewGroup.LayoutParams layoutParams6 = s0Var.p(com.tencent.mm.R.id.ikh).getLayoutParams();
                layoutParams6.width = luckyMoneyHistoryEnvelopeUI.f146126m;
                layoutParams6.height = luckyMoneyHistoryEnvelopeUI.f146130q;
                s0Var.p(com.tencent.mm.R.id.ikh).setLayoutParams(layoutParams6);
                android.view.ViewGroup.LayoutParams layoutParams7 = s0Var.p(com.tencent.mm.R.id.ikf).getLayoutParams();
                int i29 = luckyMoneyHistoryEnvelopeUI.f146131r;
                layoutParams7.width = i29;
                layoutParams7.height = i29;
                s0Var.p(com.tencent.mm.R.id.ikf).setLayoutParams(layoutParams7);
                android.widget.RelativeLayout.LayoutParams layoutParams8 = (android.widget.RelativeLayout.LayoutParams) s0Var.p(com.tencent.mm.R.id.ikd).getLayoutParams();
                layoutParams8.addRule(3, com.tencent.mm.R.id.ikj);
                layoutParams8.topMargin = 0;
                s0Var.p(com.tencent.mm.R.id.ikd).setLayoutParams(layoutParams8);
            } else {
                i19 = 8;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                android.widget.LinearLayout.LayoutParams layoutParams9 = (android.widget.LinearLayout.LayoutParams) s0Var.p(com.tencent.mm.R.id.ikg).getLayoutParams();
                layoutParams9.width = luckyMoneyHistoryEnvelopeUI.f146122f;
                layoutParams9.height = luckyMoneyHistoryEnvelopeUI.f146123g;
                layoutParams9.topMargin = 0;
                s0Var.p(com.tencent.mm.R.id.ikg).setLayoutParams(layoutParams9);
                android.widget.RelativeLayout.LayoutParams layoutParams10 = (android.widget.RelativeLayout.LayoutParams) s0Var.p(com.tencent.mm.R.id.ikq).getLayoutParams();
                layoutParams10.width = luckyMoneyHistoryEnvelopeUI.f146122f;
                layoutParams10.height = luckyMoneyHistoryEnvelopeUI.f146123g;
                layoutParams10.topMargin = 0;
                s0Var.p(com.tencent.mm.R.id.ikq).setLayoutParams(layoutParams10);
                android.view.ViewGroup.LayoutParams layoutParams11 = s0Var.p(com.tencent.mm.R.id.ik_).getLayoutParams();
                layoutParams11.width = luckyMoneyHistoryEnvelopeUI.f146122f;
                layoutParams11.height = luckyMoneyHistoryEnvelopeUI.f146123g;
                s0Var.p(com.tencent.mm.R.id.ik_).setLayoutParams(layoutParams11);
                r45.xv3 xv3Var2 = wv3Var.f389501g;
                if ((s0Var.p(com.tencent.mm.R.id.ikm) == null || xv3Var2 == null || com.tencent.mm.sdk.platformtools.t8.K0(xv3Var2.f390494x) || xv3Var2.D != 1) ? false : true) {
                    float b18 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 4);
                    if (p29 != null) {
                        p29.setOutlineProvider(new zl5.a(true, true, b18));
                    }
                    if (p29 != null) {
                        p29.setClipToOutline(true);
                    }
                    android.view.ViewGroup.LayoutParams layoutParams12 = p29.getLayoutParams();
                    layoutParams12.width = luckyMoneyHistoryEnvelopeUI.f146122f;
                    layoutParams12.height = luckyMoneyHistoryEnvelopeUI.f146123g;
                    p29.setLayoutParams(layoutParams12);
                } else if (p29 != null) {
                    java.util.ArrayList arrayList8 = new java.util.ArrayList();
                    arrayList8.add(8);
                    java.util.Collections.reverse(arrayList8);
                    yj0.a.d(p29, arrayList8.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "recalculateItemSize", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p29.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                    yj0.a.f(p29, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "recalculateItemSize", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    java.util.ArrayList arrayList9 = new java.util.ArrayList();
                    arrayList9.add(8);
                    java.util.Collections.reverse(arrayList9);
                    yj0.a.d(p37, arrayList9.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "recalculateItemSize", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p37.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                    yj0.a.f(p37, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "recalculateItemSize", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.ViewGroup.LayoutParams layoutParams13 = s0Var.p(com.tencent.mm.R.id.ikh).getLayoutParams();
                layoutParams13.width = luckyMoneyHistoryEnvelopeUI.f146122f;
                layoutParams13.height = luckyMoneyHistoryEnvelopeUI.f146124h;
                s0Var.p(com.tencent.mm.R.id.ikh).setLayoutParams(layoutParams13);
                android.view.ViewGroup.LayoutParams layoutParams14 = s0Var.p(com.tencent.mm.R.id.ikf).getLayoutParams();
                int i37 = luckyMoneyHistoryEnvelopeUI.f146125i;
                layoutParams14.width = i37;
                layoutParams14.height = i37;
                s0Var.p(com.tencent.mm.R.id.ikf).setLayoutParams(layoutParams14);
            }
            o(s0Var, wv3Var, false, i5Var);
        } else {
            i19 = 8;
        }
        s0Var.p(com.tencent.mm.R.id.ikz).setOnClickListener(new com.tencent.mm.plugin.luckymoney.ui.j5(this, s0Var, wv3Var, i5Var));
        if (wv3Var.f389506o == 2) {
            android.view.View p38 = s0Var.p(com.tencent.mm.R.id.iky);
            java.util.ArrayList arrayList10 = new java.util.ArrayList();
            arrayList10.add(0);
            java.util.Collections.reverse(arrayList10);
            yj0.a.d(p38, arrayList10.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p38.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
            yj0.a.f(p38, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((android.widget.TextView) s0Var.p(com.tencent.mm.R.id.iky)).setTextSize(1, 11.0f);
        } else {
            android.view.View p39 = s0Var.p(com.tencent.mm.R.id.iky);
            java.util.ArrayList arrayList11 = new java.util.ArrayList();
            arrayList11.add(java.lang.Integer.valueOf(i19));
            java.util.Collections.reverse(arrayList11);
            yj0.a.d(p39, arrayList11.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p39.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
            yj0.a.f(p39, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        s0Var.s(com.tencent.mm.R.id.ike, wv3Var.f389498d);
        android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.ik9);
        if (wv3Var.f389507p == 1) {
            textView.setText(wv3Var.f389508q);
        } else if (wv3Var.f389503i == 1) {
            textView.setText(wv3Var.f389502h);
        } else {
            if (((java.util.ArrayList) luckyMoneyHistoryEnvelopeUI.f146137x).contains(wv3Var.f389500f)) {
                textView.setText(com.tencent.mm.R.string.gkb);
            }
        }
        java.lang.String str = luckyMoneyHistoryEnvelopeUI.f146138y;
        if (str == null || str.length() <= 0 || !(luckyMoneyHistoryEnvelopeUI.f146138y.equals("zh_CN") || luckyMoneyHistoryEnvelopeUI.f146138y.equals("zh_TW") || luckyMoneyHistoryEnvelopeUI.f146138y.equals("zh_HK"))) {
            s0Var.p(com.tencent.mm.R.id.ikf).setBackgroundResource(com.tencent.mm.R.drawable.ccz);
            s0Var.r(com.tencent.mm.R.id.ikf, com.tencent.mm.R.string.gmm);
        }
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 s0Var, int i17) {
        android.view.ViewGroup.LayoutParams layoutParams = s0Var.itemView.getLayoutParams();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyHistoryEnvelopeUI luckyMoneyHistoryEnvelopeUI = this.f147443e;
        layoutParams.width = luckyMoneyHistoryEnvelopeUI.f146120d;
        s0Var.itemView.setMinimumHeight(luckyMoneyHistoryEnvelopeUI.f146121e);
        s0Var.itemView.setLayoutParams(layoutParams);
        int a17 = sp5.c.a(8);
        s0Var.itemView.setPadding(a17, a17, a17, a17);
        android.view.ViewGroup.LayoutParams layoutParams2 = s0Var.p(com.tencent.mm.R.id.ikg).getLayoutParams();
        layoutParams2.width = luckyMoneyHistoryEnvelopeUI.f146122f;
        layoutParams2.height = luckyMoneyHistoryEnvelopeUI.f146123g;
        s0Var.p(com.tencent.mm.R.id.ikg).setLayoutParams(layoutParams2);
        android.view.ViewGroup.LayoutParams layoutParams3 = s0Var.p(com.tencent.mm.R.id.ikq).getLayoutParams();
        layoutParams3.width = luckyMoneyHistoryEnvelopeUI.f146122f;
        layoutParams3.height = luckyMoneyHistoryEnvelopeUI.f146123g;
        s0Var.p(com.tencent.mm.R.id.ikq).setLayoutParams(layoutParams3);
        android.view.ViewGroup.LayoutParams layoutParams4 = s0Var.p(com.tencent.mm.R.id.ik_).getLayoutParams();
        layoutParams4.width = luckyMoneyHistoryEnvelopeUI.f146122f;
        layoutParams4.height = luckyMoneyHistoryEnvelopeUI.f146123g;
        s0Var.p(com.tencent.mm.R.id.ik_).setLayoutParams(layoutParams4);
        android.view.ViewGroup.LayoutParams layoutParams5 = s0Var.p(com.tencent.mm.R.id.ikh).getLayoutParams();
        layoutParams5.width = luckyMoneyHistoryEnvelopeUI.f146122f;
        layoutParams5.height = luckyMoneyHistoryEnvelopeUI.f146124h;
        s0Var.p(com.tencent.mm.R.id.ikh).setLayoutParams(layoutParams5);
        android.view.ViewGroup.LayoutParams layoutParams6 = s0Var.p(com.tencent.mm.R.id.ikf).getLayoutParams();
        int i18 = luckyMoneyHistoryEnvelopeUI.f146125i;
        layoutParams6.width = i18;
        layoutParams6.height = i18;
        s0Var.p(com.tencent.mm.R.id.ikf).setLayoutParams(layoutParams6);
    }

    @Override // in5.r
    public void l(in5.s0 s0Var) {
        android.view.View p17 = s0Var.p(com.tencent.mm.R.id.ikm);
        com.tencent.mm.chatting.component.ListScrollPAGView listScrollPAGView = (com.tencent.mm.chatting.component.ListScrollPAGView) s0Var.p(com.tencent.mm.R.id.ikl);
        android.view.View p18 = s0Var.p(com.tencent.mm.R.id.ikp);
        com.tencent.mm.chatting.component.ListScrollPAGView listScrollPAGView2 = (com.tencent.mm.chatting.component.ListScrollPAGView) s0Var.p(com.tencent.mm.R.id.iko);
        if (p17 != null && p17.getVisibility() == 0) {
            listScrollPAGView.n();
            if (s0Var instanceof com.tencent.mm.plugin.luckymoney.ui.w5) {
                com.tencent.mm.plugin.luckymoney.ui.w5 w5Var = (com.tencent.mm.plugin.luckymoney.ui.w5) s0Var;
                listScrollPAGView.i(w5Var.f147632n);
                w5Var.f147632n = null;
            }
        }
        if (p18 == null || p18.getVisibility() != 0) {
            return;
        }
        listScrollPAGView2.n();
        if (s0Var instanceof com.tencent.mm.plugin.luckymoney.ui.w5) {
            com.tencent.mm.plugin.luckymoney.ui.w5 w5Var2 = (com.tencent.mm.plugin.luckymoney.ui.w5) s0Var;
            listScrollPAGView2.i(w5Var2.f147633o);
            listScrollPAGView2.j(w5Var2.f147634p);
            w5Var2.f147633o = null;
            w5Var2.f147634p = null;
        }
    }

    public final boolean n(in5.s0 s0Var, r45.xv3 xv3Var) {
        return (s0Var.p(com.tencent.mm.R.id.ikj) == null || xv3Var == null || com.tencent.mm.sdk.platformtools.t8.K0(xv3Var.f390485o) || com.tencent.mm.sdk.platformtools.t8.K0(xv3Var.f390486p)) ? false : true;
    }

    public final void o(in5.s0 s0Var, r45.wv3 wv3Var, boolean z17, com.tencent.mm.plugin.luckymoney.ui.i5 i5Var) {
        if (z17) {
            android.view.View p17 = s0Var.p(com.tencent.mm.R.id.iks);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "tryLoadCoverImage", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;ZLcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "tryLoadCoverImage", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;ZLcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View p18 = s0Var.p(com.tencent.mm.R.id.ij6);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "tryLoadCoverImage", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;ZLcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "tryLoadCoverImage", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;ZLcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View p19 = s0Var.p(com.tencent.mm.R.id.ikx);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(p19, arrayList3.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "tryLoadCoverImage", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;ZLcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p19.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(p19, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "tryLoadCoverImage", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;ZLcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View p27 = s0Var.p(com.tencent.mm.R.id.ikr);
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(p27, arrayList4.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "tryLoadCoverImage", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;ZLcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p27.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(p27, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "tryLoadCoverImage", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;ZLcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        ((android.widget.ImageView) s0Var.p(com.tencent.mm.R.id.ik_)).setImageBitmap(null);
        ((android.widget.ImageView) s0Var.p(com.tencent.mm.R.id.ik_)).setVisibility(0);
        ((com.tencent.mm.plugin.luckymoney.model.w2) ((gb3.j) i95.n0.c(gb3.j.class))).aj((android.widget.ImageView) s0Var.p(com.tencent.mm.R.id.ik_), wv3Var, new com.tencent.mm.plugin.luckymoney.ui.l5(this, s0Var), 0, 0, 0);
        android.view.View p28 = s0Var.p(com.tencent.mm.R.id.ikm);
        com.tencent.mm.chatting.component.ListScrollPAGView listScrollPAGView = (com.tencent.mm.chatting.component.ListScrollPAGView) s0Var.p(com.tencent.mm.R.id.ikl);
        android.view.View p29 = s0Var.p(com.tencent.mm.R.id.ikp);
        com.tencent.mm.chatting.component.ListScrollPAGView listScrollPAGView2 = (com.tencent.mm.chatting.component.ListScrollPAGView) s0Var.p(com.tencent.mm.R.id.iko);
        if (!this.f147443e.B && p28 != null && p29 != null) {
            r45.xv3 xv3Var = wv3Var.f389501g;
            if (xv3Var == null || com.tencent.mm.sdk.platformtools.t8.K0(xv3Var.f390494x)) {
                listScrollPAGView.n();
                listScrollPAGView2.n();
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.add(8);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(p28, arrayList5.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "renderEnvelopeDynamic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p28.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(p28, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "renderEnvelopeDynamic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                arrayList6.add(8);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(p29, arrayList6.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "renderEnvelopeDynamic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p29.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(p29, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "renderEnvelopeDynamic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else if (wv3Var.f389501g.D == 2) {
                if (s0Var instanceof com.tencent.mm.plugin.luckymoney.ui.w5) {
                    com.tencent.mm.plugin.luckymoney.ui.w5 w5Var = (com.tencent.mm.plugin.luckymoney.ui.w5) s0Var;
                    com.tencent.mm.plugin.luckymoney.ui.m5 m5Var = new com.tencent.mm.plugin.luckymoney.ui.m5(this, p29);
                    w5Var.f147633o = m5Var;
                    listScrollPAGView2.a(m5Var);
                    listScrollPAGView2.setRepeatCount(0);
                    listScrollPAGView2.setScaleMode(3);
                    com.tencent.mm.plugin.luckymoney.ui.n5 n5Var = new com.tencent.mm.plugin.luckymoney.ui.n5(this, i5Var, listScrollPAGView2, s0Var);
                    w5Var.f147634p = n5Var;
                    listScrollPAGView2.b(n5Var);
                }
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                arrayList7.add(8);
                java.util.Collections.reverse(arrayList7);
                yj0.a.d(p28, arrayList7.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "renderEnvelopeDynamic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p28.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                yj0.a.f(p28, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "renderEnvelopeDynamic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                listScrollPAGView.n();
                com.tencent.mm.plugin.luckymoney.model.n3.f145460a.b(wv3Var, 1, s0Var.f293120d, new com.tencent.mm.plugin.luckymoney.ui.o5(this, i5Var, listScrollPAGView2, wv3Var, p29));
            } else {
                if (s0Var instanceof com.tencent.mm.plugin.luckymoney.ui.w5) {
                    com.tencent.mm.plugin.luckymoney.ui.p5 p5Var = new com.tencent.mm.plugin.luckymoney.ui.p5(this, p28);
                    ((com.tencent.mm.plugin.luckymoney.ui.w5) s0Var).f147632n = p5Var;
                    listScrollPAGView.a(p5Var);
                }
                listScrollPAGView.b(new com.tencent.mm.plugin.luckymoney.ui.q5(this));
                listScrollPAGView.setRepeatCount(0);
                listScrollPAGView.setScaleMode(3);
                java.util.ArrayList arrayList8 = new java.util.ArrayList();
                arrayList8.add(8);
                java.util.Collections.reverse(arrayList8);
                yj0.a.d(p29, arrayList8.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "renderEnvelopeDynamic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p29.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                yj0.a.f(p29, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertItem", "renderEnvelopeDynamic", "(Lcom/tencent/mm/protocal/protobuf/HbEnvelopSource;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyHistoryEnvelopeUI$EnvelopeConvertData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                listScrollPAGView2.n();
                p28.setOutlineProvider(new zl5.a(true, true, i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 4)));
                p28.setClipToOutline(true);
                com.tencent.mm.plugin.luckymoney.model.n3.f145460a.b(wv3Var, 1, s0Var.f293120d, new com.tencent.mm.plugin.luckymoney.ui.r5(this, listScrollPAGView, wv3Var, p28));
            }
        }
        if (n(s0Var, wv3Var.f389501g)) {
            ((com.tencent.mm.plugin.luckymoney.model.w2) ((gb3.j) i95.n0.c(gb3.j.class))).bj((android.widget.ImageView) s0Var.p(com.tencent.mm.R.id.ikj), wv3Var, new com.tencent.mm.plugin.luckymoney.ui.s5(this), 0, 0);
        }
    }
}
