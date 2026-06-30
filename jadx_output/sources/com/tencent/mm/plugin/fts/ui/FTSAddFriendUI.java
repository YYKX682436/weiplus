package com.tencent.mm.plugin.fts.ui;

@db5.a(3)
/* loaded from: classes12.dex */
public class FTSAddFriendUI extends com.tencent.mm.plugin.fts.ui.FTSBaseUI {

    /* renamed from: p1, reason: collision with root package name */
    public static final /* synthetic */ int f137869p1 = 0;
    public android.widget.TextView A;
    public android.widget.TextView B;
    public android.widget.TextView C;
    public android.widget.TextView D;
    public android.view.View E;
    public android.view.View F;
    public android.widget.ImageView G;
    public android.widget.TextView H;
    public android.widget.TextView I;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.TextView f137870J;
    public boolean K;
    public boolean L;
    public com.tencent.mm.plugin.fts.ui.widget.FTSLocalPageRelevantView N;
    public com.tencent.mm.plugin.fts.ui.j S;
    public long T;
    public r45.iw5 V;
    public int W;
    public int X;
    public java.lang.String Y;

    /* renamed from: l1, reason: collision with root package name */
    public long f137871l1;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f137872p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f137874q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f137875r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f137876s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f137877t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f137878u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f137879v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.LinearLayout f137880w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.LinearLayout f137881x;

    /* renamed from: x0, reason: collision with root package name */
    public android.app.Dialog f137882x0;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.ImageView f137883y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.TextView f137885z;
    public int M = 1;
    public java.lang.String P = "";
    public java.lang.String Q = "";
    public boolean R = false;
    public su4.p1 U = null;
    public final com.tencent.mm.modelbase.u0 Z = new com.tencent.mm.plugin.fts.ui.u(this);

    /* renamed from: p0, reason: collision with root package name */
    public final com.tencent.mm.modelbase.u0 f137873p0 = new com.tencent.mm.plugin.fts.ui.v(this);

    /* renamed from: y0, reason: collision with root package name */
    public int f137884y0 = -1;

    public static void f7(final com.tencent.mm.plugin.fts.ui.FTSAddFriendUI fTSAddFriendUI, int i17) {
        if (fTSAddFriendUI.W == 0 || fTSAddFriendUI.X == 0) {
            return;
        }
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.fts.ui.m(fTSAddFriendUI));
        boolean z17 = i17 > 0;
        if (z17 && "yuanbao".equals(fTSAddFriendUI.f137910n) && com.tencent.mm.storage.z3.L3(x51.j1.g(fTSAddFriendUI.V.f377356d))) {
            r45.iw5 iw5Var = fTSAddFriendUI.V;
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSAddFriendUI", "[+] setYuanBaoGuardianPage: user search yuanbao account, show guardian page first.");
            fTSAddFriendUI.h7();
            android.view.View view = fTSAddFriendUI.f137876s;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setYuanBaoGuardianPage", "(Lcom/tencent/mm/protocal/protobuf/SearchContactResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setYuanBaoGuardianPage", "(Lcom/tencent/mm/protocal/protobuf/SearchContactResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = fTSAddFriendUI.f137874q;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setYuanBaoGuardianPage", "(Lcom/tencent/mm/protocal/protobuf/SearchContactResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setYuanBaoGuardianPage", "(Lcom/tencent/mm/protocal/protobuf/SearchContactResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = fTSAddFriendUI.E;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setYuanBaoGuardianPage", "(Lcom/tencent/mm/protocal/protobuf/SearchContactResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setYuanBaoGuardianPage", "(Lcom/tencent/mm/protocal/protobuf/SearchContactResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            final java.lang.String g17 = x51.j1.g(iw5Var.f377356d);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("search_yuanbao_ai_suc", bm5.i0.a(new java.util.HashMap(16), new m3.d("chat_name", g17)), 34004);
            fTSAddFriendUI.F.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.fts.ui.FTSAddFriendUI$$a
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view4) {
                    java.lang.String str = g17;
                    int i18 = com.tencent.mm.plugin.fts.ui.FTSAddFriendUI.f137869p1;
                    com.tencent.mm.plugin.fts.ui.FTSAddFriendUI fTSAddFriendUI2 = com.tencent.mm.plugin.fts.ui.FTSAddFriendUI.this;
                    fTSAddFriendUI2.getClass();
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    arrayList4.add(str);
                    arrayList4.add(view4);
                    java.lang.Object[] array = arrayList4.toArray();
                    arrayList4.clear();
                    yj0.a.b("com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", fTSAddFriendUI2, array);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(fTSAddFriendUI2.f137910n)) {
                        fTSAddFriendUI2.L = true;
                        su4.k3.c(fTSAddFriendUI2.f137910n, fTSAddFriendUI2.M, 1, 16);
                    }
                    ((vh0.f3) ((vh0.n1) i95.n0.c(vh0.n1.class))).aj(fTSAddFriendUI2, 16, str, false, null, null);
                    yj0.a.h(fTSAddFriendUI2, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            java.lang.String g18 = x51.j1.g(iw5Var.f377357e);
            java.lang.String str = iw5Var.f377364o;
            fTSAddFriendUI.H.setText(g18);
            if (android.text.TextUtils.isEmpty(str)) {
                fTSAddFriendUI.I.setVisibility(8);
                fTSAddFriendUI.I.setText("");
            } else {
                fTSAddFriendUI.I.setVisibility(0);
                fTSAddFriendUI.I.setText(str);
            }
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(fTSAddFriendUI.G, g17, null);
            fTSAddFriendUI.f137870J.setVisibility(0);
            fTSAddFriendUI.f137870J.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.fts.ui.FTSAddFriendUI$$b
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view4) {
                    int i18 = com.tencent.mm.plugin.fts.ui.FTSAddFriendUI.f137869p1;
                    com.tencent.mm.plugin.fts.ui.FTSAddFriendUI fTSAddFriendUI2 = com.tencent.mm.plugin.fts.ui.FTSAddFriendUI.this;
                    fTSAddFriendUI2.getClass();
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    arrayList4.add(view4);
                    java.lang.Object[] array = arrayList4.toArray();
                    arrayList4.clear();
                    yj0.a.b("com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", fTSAddFriendUI2, array);
                    fTSAddFriendUI2.g7(fTSAddFriendUI2.f137910n, 0);
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("yuanbao_search_wx_account", "view_clk", java.util.Collections.emptyMap(), 34004);
                    yj0.a.h(fTSAddFriendUI2, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            return;
        }
        if (!fTSAddFriendUI.isFinishing()) {
            y13.n nVar = (y13.n) fTSAddFriendUI.component(y13.n.class);
            java.lang.String str2 = fTSAddFriendUI.f137910n;
            if (!((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) nVar.f458897m).getValue()).i("do_not_show_yuanbao_ad", false)) {
                jz5.g gVar = nVar.f458891d;
                if (z17 && kz5.z.G(vh0.k2.f436892a, str2)) {
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put("view_id", "add_fri_yuanbao_btn");
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_exp", hashMap, 34004);
                    java.lang.Object value = ((jz5.n) gVar).getValue();
                    kotlin.jvm.internal.o.f(value, "getValue(...)");
                    ((android.widget.LinearLayout) value).setVisibility(0);
                } else {
                    java.lang.Object value2 = ((jz5.n) gVar).getValue();
                    kotlin.jvm.internal.o.f(value2, "getValue(...)");
                    ((android.widget.LinearLayout) value2).setVisibility(8);
                }
            }
        }
        int i18 = fTSAddFriendUI.W;
        if (i18 > 0 && fTSAddFriendUI.X < 0) {
            fTSAddFriendUI.L = true;
            fTSAddFriendUI.j7();
            return;
        }
        if (i18 > 0) {
            r45.iw5 iw5Var2 = fTSAddFriendUI.V;
            fTSAddFriendUI.i7();
            if ("yuanbao".equals(fTSAddFriendUI.Y)) {
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("search_yuanbao_real_suc", java.util.Collections.emptyMap(), 34004);
            }
            java.lang.String g19 = x51.j1.g(iw5Var2.f377356d);
            java.lang.String g27 = x51.j1.g(iw5Var2.f377357e);
            java.lang.String str3 = iw5Var2.f377364o;
            fTSAddFriendUI.f137903d.setVisibility(8);
            android.view.View view4 = fTSAddFriendUI.f137874q;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setHasContactLayout", "(Lcom/tencent/mm/protocal/protobuf/SearchContactResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setHasContactLayout", "(Lcom/tencent/mm/protocal/protobuf/SearchContactResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view5 = fTSAddFriendUI.f137875r;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setHasContactLayout", "(Lcom/tencent/mm/protocal/protobuf/SearchContactResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setHasContactLayout", "(Lcom/tencent/mm/protocal/protobuf/SearchContactResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            fTSAddFriendUI.f137879v.setOnClickListener(new com.tencent.mm.plugin.fts.ui.s(fTSAddFriendUI));
            fTSAddFriendUI.f137885z.setText(g27);
            fTSAddFriendUI.A.setText(str3);
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(fTSAddFriendUI.f137883y, g19, null);
            android.view.View view6 = fTSAddFriendUI.f137876s;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setHasContactLayout", "(Lcom/tencent/mm/protocal/protobuf/SearchContactResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setHasContactLayout", "(Lcom/tencent/mm/protocal/protobuf/SearchContactResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view7 = fTSAddFriendUI.f137877t;
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(8);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setHasContactLayout", "(Lcom/tencent/mm/protocal/protobuf/SearchContactResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(view7, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setHasContactLayout", "(Lcom/tencent/mm/protocal/protobuf/SearchContactResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view8 = fTSAddFriendUI.f137878u;
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            arrayList8.add(8);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setHasContactLayout", "(Lcom/tencent/mm/protocal/protobuf/SearchContactResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(view8, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setHasContactLayout", "(Lcom/tencent/mm/protocal/protobuf/SearchContactResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            fTSAddFriendUI.N.setVisibility(8);
        } else {
            fTSAddFriendUI.h7();
        }
        if (fTSAddFriendUI.X <= 0) {
            fTSAddFriendUI.i7();
            android.view.View view9 = fTSAddFriendUI.f137877t;
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList9.add(8);
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(view9, arrayList9.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setNoSearchContentLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
            yj0.a.f(view9, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setNoSearchContentLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view10 = fTSAddFriendUI.f137878u;
            java.util.ArrayList arrayList10 = new java.util.ArrayList();
            arrayList10.add(8);
            java.util.Collections.reverse(arrayList10);
            yj0.a.d(view10, arrayList10.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setNoSearchContentLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view10.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
            yj0.a.f(view10, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setNoSearchContentLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            fTSAddFriendUI.N.setVisibility(8);
            return;
        }
        fTSAddFriendUI.i7();
        if (su4.r2.l()) {
            return;
        }
        fTSAddFriendUI.M = 2;
        android.view.View view11 = fTSAddFriendUI.E;
        java.util.ArrayList arrayList11 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
        arrayList11.add(8);
        java.util.Collections.reverse(arrayList11);
        yj0.a.d(view11, arrayList11.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setHasSearchContentLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view11.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
        yj0.a.f(view11, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setHasSearchContentLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (!fTSAddFriendUI.R) {
            android.widget.TextView textView = fTSAddFriendUI.B;
            java.lang.String string = fTSAddFriendUI.getString(com.tencent.mm.R.string.f492170fh0);
            java.lang.String str4 = fTSAddFriendUI.f137910n;
            textView.setText(o13.q.d(string, "", p13.i.a(str4, str4, false, false)).f351105a);
            android.view.View view12 = fTSAddFriendUI.f137877t;
            java.util.ArrayList arrayList12 = new java.util.ArrayList();
            arrayList12.add(0);
            java.util.Collections.reverse(arrayList12);
            yj0.a.d(view12, arrayList12.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setSearchContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view12.setVisibility(((java.lang.Integer) arrayList12.get(0)).intValue());
            yj0.a.f(view12, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setSearchContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view13 = fTSAddFriendUI.f137878u;
            java.util.ArrayList arrayList13 = new java.util.ArrayList();
            arrayList13.add(0);
            java.util.Collections.reverse(arrayList13);
            yj0.a.d(view13, arrayList13.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setSearchContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view13.setVisibility(((java.lang.Integer) arrayList13.get(0)).intValue());
            yj0.a.f(view13, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setSearchContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            fTSAddFriendUI.f137878u.setOnClickListener(new com.tencent.mm.plugin.fts.ui.q(fTSAddFriendUI));
            return;
        }
        fTSAddFriendUI.f137880w.setVisibility(0);
        fTSAddFriendUI.f137881x.removeAllViews();
        android.widget.ImageView imageView = (android.widget.ImageView) fTSAddFriendUI.f137880w.findViewById(com.tencent.mm.R.id.f486602uy1);
        if (j62.e.g().l("clicfg_android_use_search_global_sug_feedback", false, true, true)) {
            imageView.setVisibility(0);
            imageView.setOnClickListener(new com.tencent.mm.plugin.fts.ui.r(fTSAddFriendUI));
        }
        java.lang.String str5 = fTSAddFriendUI.f137910n;
        if (fTSAddFriendUI.U != null) {
            gm0.j1.d().d(fTSAddFriendUI.U);
            fTSAddFriendUI.U = null;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        r45.g55 g55Var = new r45.g55();
        g55Var.f374889d = str5;
        g55Var.f374892g = java.lang.Long.toString(currentTimeMillis);
        g55Var.f374891f = su4.r2.f(16);
        g55Var.f374894i = 1;
        g55Var.f374895m = com.tencent.mm.plugin.websearch.l2.a(5);
        g55Var.f374900r = com.tencent.mm.plugin.websearch.l2.a(0);
        g55Var.f374901s = 6;
        fTSAddFriendUI.getContext().getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0);
        float b17 = j65.c.b(fTSAddFriendUI.getContext());
        r45.x50 x50Var = new r45.x50();
        x50Var.f389788d = "fontSize";
        x50Var.f389790f = java.lang.Float.toString(b17);
        java.util.LinkedList linkedList = g55Var.f374903u;
        linkedList.add(x50Var);
        r45.x50 x50Var2 = new r45.x50();
        x50Var2.f389788d = "screenWidth";
        x50Var2.f389789e = com.tencent.mm.ui.zk.b(fTSAddFriendUI.getContext(), com.tencent.mm.ui.bl.b(fTSAddFriendUI.getContext()).y);
        linkedList.add(x50Var2);
        fTSAddFriendUI.U = new su4.p1(g55Var);
        gm0.j1.d().g(fTSAddFriendUI.U);
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI, tj5.m
    public void C3(java.lang.String str, java.lang.String str2, java.util.List list, tj5.o oVar) {
        super.C3(str, str2, list, oVar);
        this.K = false;
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI, tj5.n
    public boolean G0() {
        g7(this.f137910n, 1);
        hideVKB();
        return true;
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI
    public com.tencent.mm.plugin.fts.ui.f0 U6(com.tencent.mm.plugin.fts.ui.w0 w0Var) {
        if (this.S == null) {
            this.S = new com.tencent.mm.plugin.fts.ui.j(w0Var);
        }
        return this.S;
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI
    public void d7() {
        super.d7();
        android.view.View view = this.f137874q;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "startSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "startSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI
    public void e7() {
        super.e7();
        android.view.View view = this.f137874q;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "stopSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "stopSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void g7(java.lang.String str, int i17) {
        this.K = true;
        this.L = false;
        this.M = 1;
        if (str == null || str.length() == 0 || str.trim().length() == 0) {
            return;
        }
        this.f137884y0 = java.lang.Character.isDigit(str.charAt(0)) ? 15 : 3;
        this.W = 0;
        this.X = 0;
        gm0.j1.d().a(106, this.f137873p0);
        tg3.r1 r1Var = new tg3.r1(str, 1, 3, false, i17);
        gm0.j1.d().g(r1Var);
        this.f137882x0 = db5.e1.Q(this, getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.icm), true, true, new com.tencent.mm.plugin.fts.ui.k(this, r1Var));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("add_friends_sessionid", this.P);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("search_trigger", hashMap, 33926);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bbs;
    }

    public final void h7() {
        i7();
        this.f137903d.setVisibility(8);
        android.view.View view = this.f137874q;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setNoContactLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setNoContactLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f137875r;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setNoContactLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setNoContactLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f137876s;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setNoContactLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setNoContactLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view4 = this.f137877t;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setNoContactLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setNoContactLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view5 = this.f137878u;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(8);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setNoContactLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(view5, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setNoContactLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.N.setVisibility(8);
    }

    public final void i7() {
        android.view.View view = this.E;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setNoYuanBaoGuardianPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setNoYuanBaoGuardianPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f137870J.setVisibility(8);
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        java.util.HashSet hashSet = new java.util.HashSet(super.importUIComponents());
        hashSet.add(x13.a.class);
        hashSet.add(y13.n.class);
        return hashSet;
    }

    public final void j7() {
        java.lang.String g17 = x51.j1.g(this.V.f377356d);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (g17 == null) {
            g17 = "";
        }
        if (g17.length() > 0) {
            int i17 = this.V.K;
            if (2 == i17) {
                this.f137884y0 = 15;
            } else if (1 == i17) {
                this.f137884y0 = 1;
            }
            android.content.Intent intent = new android.content.Intent();
            ((c01.j0) ((qk.o6) i95.n0.c(qk.o6.class))).Ai(intent, this.V, this.f137884y0);
            if (this.f137884y0 == 15 && 2 == this.V.K) {
                intent.putExtra("Contact_Search_Mobile", this.Y);
            }
            intent.putExtra("add_more_friend_search_scene", 2);
            j45.l.j(this, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        finish();
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI, tj5.n
    public void onClickClearTextBtn(android.view.View view) {
        super.onClickClearTextBtn(view);
        if (this.f137907h.getFtsEditText().k()) {
            return;
        }
        this.f137907h.getFtsEditText().m();
        showVKB();
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        o13.p.f342250c = o13.n.g(16);
        android.transition.Transition inflateTransition = android.transition.TransitionInflater.from(this).inflateTransition(android.R.transition.fade);
        inflateTransition.excludeTarget(getWindow().getDecorView().findViewById(com.tencent.mm.R.id.f482435ei), true);
        inflateTransition.excludeTarget(android.R.id.statusBarBackground, true);
        getWindow().setEnterTransition(inflateTransition);
        setActionbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.a07));
        this.f137908i = getContext().getResources().getString(com.tencent.mm.R.string.bka);
        this.f137907h.getFtsEditText().setHint(W6());
        this.R = ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).cj();
        this.f137872p = findViewById(com.tencent.mm.R.id.ago);
        this.f137874q = findViewById(com.tencent.mm.R.id.cag);
        this.f137875r = findViewById(com.tencent.mm.R.id.f485212gx3);
        this.f137879v = findViewById(com.tencent.mm.R.id.cah);
        this.f137876s = findViewById(com.tencent.mm.R.id.f486143kc2);
        this.f137877t = findViewById(com.tencent.mm.R.id.ji8);
        this.f137878u = findViewById(com.tencent.mm.R.id.mdu);
        this.N = (com.tencent.mm.plugin.fts.ui.widget.FTSLocalPageRelevantView) findViewById(com.tencent.mm.R.id.lts);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.uxz);
        this.f137880w = linearLayout;
        this.f137881x = (android.widget.LinearLayout) linearLayout.findViewById(com.tencent.mm.R.id.ltc);
        this.f137883y = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.ca7);
        this.f137885z = (android.widget.TextView) findViewById(com.tencent.mm.R.id.cfq);
        this.A = (android.widget.TextView) findViewById(com.tencent.mm.R.id.cal);
        this.B = (android.widget.TextView) findViewById(com.tencent.mm.R.id.mfm);
        this.C = (android.widget.TextView) findViewById(com.tencent.mm.R.id.cam);
        this.D = (android.widget.TextView) findViewById(com.tencent.mm.R.id.mdw);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.spi);
        this.E = findViewById;
        this.F = findViewById.findViewById(com.tencent.mm.R.id.spg);
        this.G = (android.widget.ImageView) this.E.findViewById(com.tencent.mm.R.id.spf);
        this.H = (android.widget.TextView) this.E.findViewById(com.tencent.mm.R.id.spj);
        this.I = (android.widget.TextView) this.E.findViewById(com.tencent.mm.R.id.sph);
        this.f137870J = (android.widget.TextView) findViewById(com.tencent.mm.R.id.v1k);
        try {
            java.lang.String optString = su4.o2.d("webSearchBar").optString("wording");
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSAddFriendUI", "set searchNetworkTips %s", optString);
            this.D.setText(optString);
        } catch (java.lang.Exception unused) {
        }
        getContentView().postDelayed(new com.tencent.mm.plugin.fts.ui.n(this), 128L);
        this.f137872p.setOnClickListener(new com.tencent.mm.plugin.fts.ui.o(this));
        this.f137874q.setOnClickListener(new com.tencent.mm.plugin.fts.ui.p(this));
        this.P = getIntent().getStringExtra("report_add_friends_sessionid");
        gm0.j1.d().a(1076, this.Z);
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.d().q(1076, this.Z);
        gm0.j1.d().q(106, this.f137873p0);
        if (!this.K || this.L) {
            return;
        }
        su4.k3.c(this.f137910n, this.M, 3, 16);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        su4.r2.o();
    }

    @Override // com.tencent.mm.plugin.fts.ui.FTSBaseUI, com.tencent.mm.plugin.fts.ui.w0
    public void x6(android.view.View view, u13.g gVar, boolean z17) {
        if (!(gVar instanceof e23.c) || java.lang.System.currentTimeMillis() - this.T <= 1000) {
            return;
        }
        this.T = java.lang.System.currentTimeMillis();
        g7(gVar.i(), 1);
    }
}
