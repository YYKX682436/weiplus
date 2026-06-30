package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class y extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.app.Activity f171593d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f171594e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f171595f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f171596g = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public int f171597h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f171598i = 0;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.w f171599m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.z f171600n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.r f171601o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f171602p;

    /* renamed from: q, reason: collision with root package name */
    public r45.za f171603q;

    public y(com.tencent.mm.ui.MMActivity mMActivity, java.lang.String str, com.tencent.mm.plugin.sns.ui.w wVar, com.tencent.mm.plugin.sns.ui.r rVar) {
        new com.tencent.mm.sdk.platformtools.n3();
        this.f171602p = "";
        this.f171593d = mMActivity;
        this.f171602p = str;
        this.f171599m = wVar;
        this.f171601o = rVar;
        this.f171600n = new com.tencent.mm.plugin.sns.ui.z(mMActivity, new com.tencent.mm.plugin.sns.ui.q(this));
        a();
    }

    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetCursor", "com.tencent.mm.plugin.sns.ui.ArtistAdapter");
        com.tencent.mm.plugin.sns.ui.z zVar = this.f171600n;
        if (zVar != null) {
            ((qz.c) ((rz.q) i95.n0.c(rz.q.class))).getClass();
            f21.r0.Bi().getClass();
            java.lang.String a17 = zz1.a.a();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetCursor", "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper");
            zVar.f171657g = this.f171602p;
            zVar.f171658h = a17;
            zVar.a(true);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetCursor", "com.tencent.mm.plugin.sns.ui.ArtistAdapterHelper");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetCursor", "com.tencent.mm.plugin.sns.ui.ArtistAdapter");
    }

    public final void c(int i17, android.widget.ImageView imageView, com.tencent.mm.plugin.sns.ui.x xVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setImgInfo", "com.tencent.mm.plugin.sns.ui.ArtistAdapter");
        r45.jj4 jj4Var = (r45.jj4) getItem(i17);
        imageView.setVisibility(0);
        com.tencent.mm.plugin.sns.ui.v vVar = new com.tencent.mm.plugin.sns.ui.v();
        vVar.f170606b = "";
        vVar.f170605a = i17;
        imageView.setTag(vVar);
        com.tencent.mm.plugin.sns.model.l4.hj().e0(jj4Var, imageView, this.f171593d.hashCode(), com.tencent.mm.storage.s7.f195307k);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setImgInfo", "com.tencent.mm.plugin.sns.ui.ArtistAdapter");
    }

    @Override // android.widget.Adapter
    public int getCount() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.ArtistAdapter");
        int i17 = this.f171597h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.ArtistAdapter");
        return i17;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.ArtistAdapter");
        java.lang.Object obj = ((java.util.ArrayList) this.f171594e).get(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItem", "com.tencent.mm.plugin.sns.ui.ArtistAdapter");
        return obj;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemId", "com.tencent.mm.plugin.sns.ui.ArtistAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemId", "com.tencent.mm.plugin.sns.ui.ArtistAdapter");
        return 0L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.plugin.sns.ui.x xVar;
        android.view.View view2;
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.x xVar2;
        java.lang.String str2 = "com.tencent.mm.plugin.sns.ui.ArtistAdapter";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getView", "com.tencent.mm.plugin.sns.ui.ArtistAdapter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createView", "com.tencent.mm.plugin.sns.ui.ArtistAdapter");
        if (view == null) {
            com.tencent.mm.plugin.sns.ui.x xVar3 = new com.tencent.mm.plugin.sns.ui.x(this);
            android.view.View inflate = android.view.View.inflate(this.f171593d, com.tencent.mm.R.layout.cqr, null);
            xVar3.f171467a = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f487056nc4);
            xVar3.f171468b = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f487057nc5);
            xVar3.f171469c = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.haa);
            xVar3.f171470d = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.hab);
            xVar3.f171471e = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.hac);
            xVar3.f171472f = inflate.findViewById(com.tencent.mm.R.id.f485550i26);
            android.widget.ImageView imageView = xVar3.f171469c;
            com.tencent.mm.plugin.sns.ui.w wVar = this.f171599m;
            imageView.setOnClickListener(wVar.f170724a);
            xVar3.f171470d.setOnClickListener(wVar.f170725b);
            xVar3.f171471e.setOnClickListener(wVar.f170726c);
            inflate.setTag(xVar3);
            xVar = xVar3;
            view2 = inflate;
        } else {
            xVar = (com.tencent.mm.plugin.sns.ui.x) view.getTag();
            view2 = view;
        }
        java.util.HashMap hashMap = (java.util.HashMap) this.f171595f;
        int intValue = hashMap.get(java.lang.Integer.valueOf(i17)) != null ? ((java.lang.Integer) hashMap.get(java.lang.Integer.valueOf(i17))).intValue() : -1;
        xVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.ArtistAdapter$ViewHolder");
        xVar.f171469c.setVisibility(8);
        xVar.f171470d.setVisibility(8);
        xVar.f171471e.setVisibility(8);
        android.view.View view3 = xVar.f171472f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/ArtistAdapter$ViewHolder", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/sns/ui/ArtistAdapter$ViewHolder", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.ArtistAdapter");
        java.lang.String str3 = xVar.f171473g.f171602p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.ArtistAdapter");
        if (str3.equals("en")) {
            xVar.f171467a.setVisibility(8);
            xVar.f171468b.setVisibility(4);
        } else {
            xVar.f171467a.setVisibility(4);
            xVar.f171468b.setVisibility(8);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.ArtistAdapter$ViewHolder");
        if (intValue >= this.f171598i || intValue == -1) {
            str = "getView";
            view2.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, 1));
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            android.view.View view4 = view2;
            yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/ArtistAdapter", "createView", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/sns/ui/ArtistAdapter", "createView", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.ui.ArtistAdapter");
        } else {
            int i18 = intValue - 1;
            java.lang.String str4 = i18 >= 0 ? ((r45.jj4) getItem(i18)).f377857f : "";
            view2.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, -2));
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            android.view.View view5 = view2;
            str = "getView";
            java.lang.String str5 = str4;
            com.tencent.mm.plugin.sns.ui.x xVar4 = xVar;
            yj0.a.d(view5, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ui/ArtistAdapter", "createView", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/sns/ui/ArtistAdapter", "createView", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.HashMap hashMap2 = (java.util.HashMap) this.f171596g;
            int intValue2 = hashMap2.get(java.lang.Integer.valueOf(i17)) != null ? ((java.lang.Integer) hashMap2.get(java.lang.Integer.valueOf(i17))).intValue() : 1;
            r45.jj4 jj4Var = (r45.jj4) getItem(intValue);
            if (!jj4Var.f377857f.equals("") && jj4Var.f377857f.equals(str5)) {
                xVar2 = xVar4;
            } else if (this.f171602p.equals("en")) {
                xVar2 = xVar4;
                xVar2.f171468b.setVisibility(0);
                xVar2.f171468b.setText(jj4Var.f377857f + "");
                android.view.View view6 = xVar2.f171472f;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view6, arrayList4.toArray(), "com/tencent/mm/plugin/sns/ui/ArtistAdapter", "createView", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view6, "com/tencent/mm/plugin/sns/ui/ArtistAdapter", "createView", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                xVar2 = xVar4;
                xVar2.f171467a.setVisibility(0);
                xVar2.f171467a.setText(jj4Var.f377857f + "");
                android.view.View view7 = xVar2.f171472f;
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.add(0);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view7, arrayList5.toArray(), "com/tencent/mm/plugin/sns/ui/ArtistAdapter", "createView", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view7, "com/tencent/mm/plugin/sns/ui/ArtistAdapter", "createView", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (intValue2 >= 1) {
                c(intValue, xVar2.f171469c, xVar2);
            }
            if (intValue2 >= 2) {
                c(intValue + 1, xVar2.f171470d, xVar2);
            }
            if (intValue2 >= 3) {
                c(intValue + 2, xVar2.f171471e, xVar2);
            }
            com.tencent.mm.plugin.sns.ui.r rVar = this.f171601o;
            if (rVar != null) {
                r45.za zaVar = this.f171603q;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onRefreshAuthor", "com.tencent.mm.plugin.sns.ui.ArtistUI$5");
                com.tencent.mm.plugin.sns.ui.ArtistUI artistUI = ((com.tencent.mm.plugin.sns.ui.p0) rVar).f170136a;
                if (com.tencent.mm.plugin.sns.ui.ArtistUI.U6(artistUI) != null) {
                    com.tencent.mm.plugin.sns.ui.ArtistUI.U6(artistUI).setVisibility(0);
                    com.tencent.mm.plugin.sns.ui.ArtistUI.U6(artistUI).setUserName(zaVar);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onRefreshAuthor", "com.tencent.mm.plugin.sns.ui.ArtistUI$5");
            }
            str2 = "com.tencent.mm.plugin.sns.ui.ArtistAdapter";
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createView", str2);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str2);
        return view2;
    }
}
