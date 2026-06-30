package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes11.dex */
public class x6 extends com.tencent.mm.plugin.sns.ui.xk {
    @Override // ql5.d
    public android.view.View b(int i17, int i18, boolean z17, android.view.View view, android.view.ViewGroup viewGroup) {
        final com.tencent.mm.plugin.sns.ui.widget.n nVar;
        android.view.View view2;
        java.lang.String str;
        java.lang.CharSequence charSequence;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRealChildView", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUIAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRealChildView", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        zd4.o oVar = this.f171535f;
        int n17 = oVar.n(i17);
        if (view == null) {
            int i19 = this.f171539j;
            android.view.LayoutInflater layoutInflater = this.f171538i;
            view2 = i19 == 1 ? layoutInflater.inflate(com.tencent.mm.R.layout.cs_, (android.view.ViewGroup) null) : layoutInflater.inflate(com.tencent.mm.R.layout.cs9, (android.view.ViewGroup) null);
            nVar = new com.tencent.mm.plugin.sns.ui.widget.n();
            nVar.f171222a = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.n9q);
            nVar.f171223b = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.n9p);
            nVar.f171224c = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.n9o);
            nVar.f171225d = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.n9n);
            nVar.f171226e = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.n9h);
            android.widget.ImageView imageView = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.n9m);
            nVar.f171227f = imageView;
            imageView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.sns.ui.xk$$a
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view3) {
                    java.lang.String str2;
                    java.lang.String str3;
                    com.tencent.mm.plugin.sns.ui.xk xkVar = com.tencent.mm.plugin.sns.ui.xk.this;
                    xkVar.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$getRealChildView$0", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(view3);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsLabelUIAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", xkVar, array);
                    com.tencent.mm.plugin.sns.ui.zk zkVar = (view3.getTag() == null || !(view3.getTag() instanceof com.tencent.mm.plugin.sns.ui.zk)) ? null : (com.tencent.mm.plugin.sns.ui.zk) view3.getTag();
                    if (zkVar == null) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.Sns.AnimatedExpandableListAdapter", "dividerIv tag is null.");
                        yj0.a.h(xkVar, "com/tencent/mm/plugin/sns/ui/SnsLabelUIAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$getRealChildView$0", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
                        return;
                    }
                    com.tencent.mm.plugin.sns.ui.yk ykVar = xkVar.f171549t;
                    if (ykVar != null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onInnerViewClick", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI$1");
                        int i27 = zkVar.f171697a;
                        int i28 = zkVar.f171698b;
                        int i29 = com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI.D;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
                        com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI baseSelectVisibleRangeUI = ((zd4.d) ykVar).f471628a;
                        baseSelectVisibleRangeUI.getClass();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("gotoEditTag", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
                        if (baseSelectVisibleRangeUI.f170683q != null) {
                            str2 = "lambda$getRealChildView$0";
                            str3 = "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter";
                            com.tencent.mars.xlog.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "gotoEditTag: groupPosition:%d, childPosition:%d", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28));
                            java.lang.Object child = baseSelectVisibleRangeUI.f170683q.getChild(i27, i28);
                            if (child != null && (child instanceof java.lang.String)) {
                                java.lang.String str4 = (java.lang.String) child;
                                java.lang.String e17 = ((b93.b) c93.a.a()).e(str4);
                                android.content.Intent intent = new android.content.Intent();
                                intent.putExtra("label_id", e17);
                                intent.putExtra("label_name", str4);
                                intent.putExtra("is_show_delete", false);
                                intent.putExtra("key_label_click_source", 3);
                                intent.putExtra("last_page_source_type", 1);
                                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_enable_new_contact_label_ui, 1) == 1) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "startActivity ContactEditLabel ");
                                    j45.l.n(baseSelectVisibleRangeUI.getContext(), "label", ".ui.ContactEditLabel", intent, 4002);
                                } else {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.BaseSelectVisibleRangeUI", "startActivity ContactLabelEditUI ");
                                    j45.l.n(baseSelectVisibleRangeUI.getContext(), "label", ".ui.ContactLabelEditUI", intent, 4002);
                                }
                            }
                        } else {
                            str2 = "lambda$getRealChildView$0";
                            str3 = "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter";
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("gotoEditTag", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onInnerViewClick", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI$1");
                    } else {
                        str2 = "lambda$getRealChildView$0";
                        str3 = "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter";
                    }
                    yj0.a.h(xkVar, "com/tencent/mm/plugin/sns/ui/SnsLabelUIAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str2, str3);
                }
            });
            view2.setTag(nVar);
        } else {
            nVar = (com.tencent.mm.plugin.sns.ui.widget.n) view.getTag();
            view2 = view;
        }
        boolean a17 = oVar.a(n17, i18, com.tencent.mm.plugin.sns.ui.xk.f171530x);
        android.content.Context context = this.f171537h;
        if (a17) {
            nVar.f171222a.setVisibility(8);
            nVar.f171223b.setVisibility(8);
            nVar.f171226e.setVisibility(8);
            nVar.f171227f.setVisibility(8);
            nVar.f171224c.setVisibility(0);
            nVar.f171225d.setVisibility(0);
            int i27 = com.tencent.mm.plugin.sns.ui.xk.f171530x;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isEnableUseNewGroup", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUIAdapter");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isEnableUseNewGroup", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUIAdapter");
            nVar.f171224c.setText(i65.a.r(context, oVar.e(n17, i27)));
            nVar.f171225d.setTextColor(i65.a.d(context, com.tencent.mm.R.color.FG_1));
            nVar.f171225d.setSingleLine(false);
            if (oVar.o(n17, 2)) {
                if (this.f171545p.isEmpty()) {
                    nVar.f171225d.setText(i65.a.r(context, oVar.d(n17, i27)));
                } else {
                    nVar.f171225d.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.FG_2));
                    if (!android.text.TextUtils.isEmpty(this.f171550u)) {
                        nVar.f171225d.setText(this.f171550u);
                        nVar.f171225d.setVisibility(0);
                    } else if (this.f171545p.size() < 500) {
                        java.lang.CharSequence j17 = j(this.f171545p, context.getResources().getColor(com.tencent.mm.R.color.a6d));
                        this.f171550u = j17;
                        nVar.f171225d.setText(j17);
                        nVar.f171225d.setVisibility(0);
                    } else {
                        final ru3.f fVar = new ru3.f();
                        fVar.b(context, false, com.tencent.mm.R.string.f490604zq, new com.tencent.mm.plugin.sns.ui.xk$$b());
                        final java.util.ArrayList arrayList = this.f171545p;
                        final int color = context.getResources().getColor(com.tencent.mm.R.color.a6d);
                        final com.tencent.mm.plugin.sns.ui.al alVar = new com.tencent.mm.plugin.sns.ui.al() { // from class: com.tencent.mm.plugin.sns.ui.xk$$c
                            @Override // com.tencent.mm.plugin.sns.ui.al
                            public final void a(final java.lang.CharSequence charSequence2) {
                                final com.tencent.mm.plugin.sns.ui.xk xkVar = com.tencent.mm.plugin.sns.ui.xk.this;
                                final com.tencent.mm.plugin.sns.ui.widget.n nVar2 = nVar;
                                final ru3.f fVar2 = fVar;
                                xkVar.getClass();
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$getRealChildView$3", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
                                ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.ui.xk$$h
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        com.tencent.mm.plugin.sns.ui.xk xkVar2 = com.tencent.mm.plugin.sns.ui.xk.this;
                                        xkVar2.getClass();
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$getRealChildView$2", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
                                        java.lang.CharSequence charSequence3 = charSequence2;
                                        xkVar2.f171550u = charSequence3;
                                        com.tencent.mm.plugin.sns.ui.widget.n nVar3 = nVar2;
                                        nVar3.f171225d.setText(charSequence3);
                                        nVar3.f171225d.setVisibility(0);
                                        fVar2.a();
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$getRealChildView$2", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
                                    }
                                });
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$getRealChildView$3", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
                            }
                        };
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("packageContactName", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
                        ((ku5.t0) ku5.t0.f312615d).a(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.ui.xk$$f
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.tencent.mm.plugin.sns.ui.xk xkVar = com.tencent.mm.plugin.sns.ui.xk.this;
                                xkVar.getClass();
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$packageContactName$7", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
                                long currentTimeMillis = java.lang.System.currentTimeMillis();
                                java.lang.CharSequence j18 = xkVar.j(arrayList, color);
                                com.tencent.mars.xlog.Log.i("MicroMsg.Sns.AnimatedExpandableListAdapter", "packageContactName cost:%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
                                alVar.a(j18);
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$packageContactName$7", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
                            }
                        });
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("packageContactName", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
                    }
                }
            } else if (oVar.o(n17, 3)) {
                if (this.f171546q.isEmpty()) {
                    nVar.f171225d.setTextColor(i65.a.d(context, com.tencent.mm.R.color.BW_50));
                    java.lang.String r17 = i65.a.r(context, oVar.d(n17, i27));
                    nVar.f171225d.setText(r17);
                    if (r17.isEmpty()) {
                        nVar.f171225d.setVisibility(8);
                    } else {
                        nVar.f171225d.setVisibility(0);
                    }
                } else {
                    nVar.f171225d.setVisibility(0);
                    nVar.f171225d.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.FG_2));
                    if (!android.text.TextUtils.isEmpty(this.f171551v)) {
                        nVar.f171225d.setText(this.f171551v);
                        nVar.f171225d.setVisibility(0);
                    } else if (this.f171546q.size() < 500) {
                        java.lang.CharSequence j18 = j(this.f171546q, context.getResources().getColor(com.tencent.mm.R.color.a6e));
                        this.f171551v = j18;
                        nVar.f171225d.setText(j18);
                        nVar.f171225d.setVisibility(0);
                    } else {
                        final ru3.f fVar2 = new ru3.f();
                        fVar2.b(context, false, com.tencent.mm.R.string.f490604zq, new com.tencent.mm.plugin.sns.ui.xk$$d());
                        final java.util.ArrayList arrayList2 = this.f171546q;
                        final int color2 = context.getResources().getColor(com.tencent.mm.R.color.a6e);
                        final com.tencent.mm.plugin.sns.ui.al alVar2 = new com.tencent.mm.plugin.sns.ui.al() { // from class: com.tencent.mm.plugin.sns.ui.xk$$e
                            @Override // com.tencent.mm.plugin.sns.ui.al
                            public final void a(final java.lang.CharSequence charSequence2) {
                                final com.tencent.mm.plugin.sns.ui.xk xkVar = com.tencent.mm.plugin.sns.ui.xk.this;
                                final com.tencent.mm.plugin.sns.ui.widget.n nVar2 = nVar;
                                final ru3.f fVar3 = fVar2;
                                xkVar.getClass();
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$getRealChildView$6", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
                                ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.ui.xk$$g
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        com.tencent.mm.plugin.sns.ui.xk xkVar2 = com.tencent.mm.plugin.sns.ui.xk.this;
                                        xkVar2.getClass();
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$getRealChildView$5", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
                                        java.lang.CharSequence charSequence3 = charSequence2;
                                        xkVar2.f171551v = charSequence3;
                                        com.tencent.mm.plugin.sns.ui.widget.n nVar3 = nVar2;
                                        nVar3.f171225d.setText(charSequence3);
                                        nVar3.f171225d.setVisibility(0);
                                        fVar3.a();
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$getRealChildView$5", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
                                    }
                                });
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$getRealChildView$6", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
                            }
                        };
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("packageContactName", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
                        ((ku5.t0) ku5.t0.f312615d).a(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.ui.xk$$f
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.tencent.mm.plugin.sns.ui.xk xkVar = com.tencent.mm.plugin.sns.ui.xk.this;
                                xkVar.getClass();
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$packageContactName$7", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
                                long currentTimeMillis = java.lang.System.currentTimeMillis();
                                java.lang.CharSequence j182 = xkVar.j(arrayList2, color2);
                                com.tencent.mars.xlog.Log.i("MicroMsg.Sns.AnimatedExpandableListAdapter", "packageContactName cost:%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
                                alVar2.a(j182);
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$packageContactName$7", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
                            }
                        });
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("packageContactName", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
                    }
                }
            }
        } else if (oVar.a(n17, i18, com.tencent.mm.plugin.sns.ui.xk.f171529w)) {
            nVar.f171222a.setVisibility(8);
            nVar.f171226e.setVisibility(8);
            nVar.f171227f.setVisibility(8);
            nVar.f171224c.setVisibility(0);
            nVar.f171223b.setVisibility(8);
            nVar.f171225d.setVisibility(0);
            int i28 = com.tencent.mm.plugin.sns.ui.xk.f171529w;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isEnableUseNewGroup", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUIAdapter");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isEnableUseNewGroup", "com.tencent.mm.plugin.sns.ui.NewSnsLabelUIAdapter");
            nVar.f171224c.setText(i65.a.r(context, oVar.e(n17, i28)));
            nVar.f171225d.setTextColor(i65.a.d(context, com.tencent.mm.R.color.FG_1));
            nVar.f171225d.setSingleLine(false);
            java.util.ArrayList arrayList3 = this.f171544o;
            com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI.X6(arrayList3);
            if (!oVar.o(n17, 3)) {
                java.util.ArrayList arrayList4 = this.f171543n;
                com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI.X6(arrayList4);
                if (arrayList4.isEmpty()) {
                    nVar.f171225d.setText(i65.a.r(context, oVar.d(n17, i28)));
                } else {
                    nVar.f171225d.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.FG_2));
                    nVar.f171225d.setText(com.tencent.mm.plugin.sns.ui.xk.k(arrayList4, true, com.tencent.mm.R.color.a6d));
                }
            } else if (arrayList3.isEmpty()) {
                nVar.f171225d.setText(i65.a.r(context, oVar.d(n17, i28)));
            } else {
                nVar.f171225d.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.FG_2));
                nVar.f171225d.setText(com.tencent.mm.plugin.sns.ui.xk.k(arrayList3, true, com.tencent.mm.R.color.a6e));
            }
        } else {
            if (!this.f171533d || !oVar.a(n17, i18, com.tencent.mm.plugin.sns.ui.xk.f171531y)) {
                int f17 = i18 - f();
                android.widget.ImageView imageView2 = nVar.f171227f;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initMoreBtnIndicator", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
                java.lang.Object tag = imageView2.getTag();
                if (tag == null || !(tag instanceof com.tencent.mm.plugin.sns.ui.zk)) {
                    com.tencent.mm.plugin.sns.ui.zk zkVar = new com.tencent.mm.plugin.sns.ui.zk(this);
                    zkVar.f171697a = i17;
                    zkVar.f171698b = f17;
                    imageView2.setTag(zkVar);
                } else {
                    com.tencent.mm.plugin.sns.ui.zk zkVar2 = (com.tencent.mm.plugin.sns.ui.zk) imageView2.getTag();
                    zkVar2.f171697a = i17;
                    zkVar2.f171698b = f17;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initMoreBtnIndicator", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
                nVar.f171222a.setVisibility(0);
                nVar.f171223b.setVisibility(0);
                nVar.f171226e.setVisibility(0);
                nVar.f171227f.setVisibility(0);
                nVar.f171224c.setVisibility(8);
                nVar.f171225d.setVisibility(8);
                java.lang.String str2 = (java.lang.String) this.f171536g.get(f17);
                android.widget.TextView textView = nVar.f171222a;
                ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
                textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, str2));
                android.widget.TextView textView2 = nVar.f171223b;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDisplayNamesByLabel", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
                java.util.List<java.lang.String> j19 = ((b93.b) c93.a.a()).j(((b93.b) c93.a.a()).e(str2));
                if (j19 == null || j19.size() == 0) {
                    str = "com.tencent.mm.plugin.sns.ui.NewSnsLabelUIAdapter";
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDisplayNamesByLabel", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
                    charSequence = "";
                } else {
                    str = "com.tencent.mm.plugin.sns.ui.NewSnsLabelUIAdapter";
                    java.util.ArrayList arrayList5 = new java.util.ArrayList(j19.size());
                    for (java.lang.String str3 : j19) {
                        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                        ((sg3.a) v0Var).getClass();
                        arrayList5.add(c01.a2.e(str3));
                    }
                    java.lang.String c17 = com.tencent.mm.sdk.platformtools.t8.c1(arrayList5, ",");
                    ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
                    charSequence = com.tencent.mm.pluginsdk.ui.span.c0.i(context, c17);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDisplayNamesByLabel", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
                }
                textView2.setText(charSequence);
                nVar.f171227f.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.sns_label_more_btn, context.getResources().getColor(com.tencent.mm.R.color.BW_50)));
                if (this.f171539j == 1) {
                    if (oVar.o(n17, 2)) {
                        if (h(1, str2)) {
                            nVar.f171226e.setImageResource(com.tencent.mm.R.raw.sight_list_checkbox_selected);
                        } else {
                            nVar.f171226e.setImageResource(com.tencent.mm.R.raw.sight_list_checkbox_unselected);
                        }
                    } else if (oVar.o(n17, 3)) {
                        if (this.f171540k != i17) {
                            nVar.f171226e.setImageResource(com.tencent.mm.R.raw.sight_list_checkbox_unselected_red);
                        } else {
                            nVar.f171226e.setImageResource(com.tencent.mm.R.raw.sight_list_checkbox_selected_red);
                        }
                        if (h(2, str2)) {
                            nVar.f171226e.setImageResource(com.tencent.mm.R.raw.sight_list_checkbox_selected_red);
                        } else {
                            nVar.f171226e.setImageResource(com.tencent.mm.R.raw.sight_list_checkbox_unselected_red);
                        }
                    }
                } else if (oVar.o(n17, 2)) {
                    if (h(1, str2)) {
                        nVar.f171226e.setImageResource(com.tencent.mm.R.raw.checkbox_selected);
                    } else {
                        nVar.f171226e.setImageResource(com.tencent.mm.R.drawable.f481256oo);
                    }
                } else if (oVar.o(n17, 3)) {
                    if (h(2, str2)) {
                        nVar.f171226e.setImageResource(com.tencent.mm.R.raw.checkbox_selected_red);
                    } else {
                        nVar.f171226e.setImageResource(com.tencent.mm.R.drawable.f481256oo);
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRealChildView", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
                view2.setPadding(i65.a.h(context, com.tencent.mm.R.dimen.f479727dj), view2.getPaddingTop(), view2.getPaddingRight(), view2.getPaddingBottom());
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRealChildView", str);
                return view2;
            }
            int i29 = com.tencent.mm.plugin.sns.ui.xk.f171531y;
            nVar.f171224c.setVisibility(0);
            nVar.f171224c.setText(i65.a.r(context, oVar.e(n17, i29)));
            nVar.f171225d.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.a6e));
            if (oVar.o(n17, 3)) {
                nVar.f171225d.setText(i65.a.r(context, oVar.d(n17, i29)));
                if (this.f171534e) {
                    nVar.f171225d.setVisibility(0);
                } else {
                    nVar.f171225d.setVisibility(8);
                }
            }
        }
        str = "com.tencent.mm.plugin.sns.ui.NewSnsLabelUIAdapter";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRealChildView", "com.tencent.mm.plugin.sns.ui.SnsLabelUIAdapter");
        view2.setPadding(i65.a.h(context, com.tencent.mm.R.dimen.f479727dj), view2.getPaddingTop(), view2.getPaddingRight(), view2.getPaddingBottom());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRealChildView", str);
        return view2;
    }
}
