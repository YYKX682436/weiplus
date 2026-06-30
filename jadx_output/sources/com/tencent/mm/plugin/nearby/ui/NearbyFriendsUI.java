package com.tencent.mm.plugin.nearby.ui;

@gm0.a2
/* loaded from: classes15.dex */
public class NearbyFriendsUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {
    public static final /* synthetic */ int D = 0;
    public boolean A;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.nearby.ui.q0 f152088e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ListView f152089f;

    /* renamed from: g, reason: collision with root package name */
    public an3.f f152090g;

    /* renamed from: h, reason: collision with root package name */
    public an3.f f152091h;

    /* renamed from: i, reason: collision with root package name */
    public an3.g f152092i;

    /* renamed from: q, reason: collision with root package name */
    public android.view.ViewGroup f152097q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f152098r;

    /* renamed from: t, reason: collision with root package name */
    public int f152100t;

    /* renamed from: v, reason: collision with root package name */
    public i11.e f152102v;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.nearby.ui.m0 f152105y;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f152087d = null;

    /* renamed from: m, reason: collision with root package name */
    public java.util.List f152093m = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Map f152094n = new java.util.HashMap();

    /* renamed from: o, reason: collision with root package name */
    public boolean f152095o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f152096p = 1;

    /* renamed from: s, reason: collision with root package name */
    public boolean f152099s = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f152101u = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f152103w = false;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f152104x = null;

    /* renamed from: z, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f152106z = new com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI.AnonymousClass1(com.tencent.mm.app.a0.f53288d);
    public boolean B = false;
    public final i11.c C = new com.tencent.mm.plugin.nearby.ui.f0(this);

    /* renamed from: com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI$1, reason: invalid class name */
    /* loaded from: classes15.dex */
    public class AnonymousClass1 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.LbsSayHiEvent> {
        public AnonymousClass1(androidx.lifecycle.y yVar) {
            super(yVar);
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.LbsSayHiEvent lbsSayHiEvent) {
            if (lbsSayHiEvent == null) {
                return false;
            }
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.nearby.ui.s(this));
            return false;
        }
    }

    public static void T6(com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI nearbyFriendsUI, android.widget.ImageView imageView, java.lang.String str) {
        nearbyFriendsUI.getClass();
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NearbyFriend", "setImgBmp url is empty");
            return;
        }
        imageView.setImageBitmap(null);
        o11.f fVar = new o11.f();
        fVar.f342083g = g83.a.a();
        fVar.f342078b = true;
        fVar.f342095s = true;
        n11.a.b().h(str, imageView, fVar.a());
    }

    public final void U6() {
        this.f152103w = false;
        this.f152087d = db5.e1.Q(getContext(), getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.h69), true, true, new com.tencent.mm.plugin.nearby.ui.d0(this));
        this.B = false;
        i11.e eVar = this.f152102v;
        if (eVar != null) {
            ((i11.h) eVar).l(this.C, true, false, false);
            com.tencent.mm.plugin.report.service.b1.f(22, 10);
        }
    }

    public final void V6() {
        int i17;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        int i18 = 0;
        int i19 = 0;
        while (true) {
            if (i19 >= ((java.util.LinkedList) this.f152093m).size()) {
                break;
            }
            if (!(((r45.b64) ((java.util.LinkedList) this.f152093m).get(i19)).f370556m == 10000)) {
                linkedList.add((r45.b64) ((java.util.LinkedList) this.f152093m).get(i19));
            }
            i19++;
        }
        ((java.util.LinkedList) this.f152093m).clear();
        this.f152093m = linkedList;
        com.tencent.mars.xlog.Log.i("MicroMsg.NearbyFriend", "insertPoiItemList()");
        boolean z17 = !this.f152093m.isEmpty();
        java.util.HashMap hashMap = (java.util.HashMap) this.f152094n;
        for (java.lang.String str : hashMap.keySet()) {
            if (z17) {
                com.tencent.mm.plugin.nearby.ui.l0 l0Var = (com.tencent.mm.plugin.nearby.ui.l0) hashMap.get(str);
                if (!l0Var.f152175m && ((i17 = l0Var.f152165c) < 1 || l0Var.f152172j < i17)) {
                    if (l0Var.f152173k < l0Var.f152166d) {
                        java.util.List list = this.f152093m;
                        int i27 = l0Var.f152164b;
                        int size = (i27 < 0 || i27 > ((java.util.LinkedList) list).size()) ? ((java.util.LinkedList) this.f152093m).size() : l0Var.f152164b + i18;
                        java.lang.String str2 = l0Var.f152163a;
                        java.lang.String str3 = l0Var.f152169g;
                        java.lang.String str4 = l0Var.f152167e;
                        java.lang.String str5 = l0Var.f152168f;
                        java.lang.String str6 = l0Var.f152171i;
                        an3.c cVar = new an3.c();
                        cVar.f370556m = 10000;
                        cVar.f370550d = str2;
                        cVar.f370569z = str3;
                        cVar.f370555i = str5;
                        cVar.f370551e = str4;
                        cVar.f370552f = str6;
                        ((java.util.LinkedList) list).add(size, cVar);
                        i18++;
                    }
                }
            }
        }
    }

    public final void W6() {
        if (m25.a.c()) {
            android.view.View view = this.f152104x;
            android.view.View view2 = null;
            if (view != null) {
                this.f152089f.removeHeaderView(view);
                this.f152104x = null;
            }
            android.view.View inflate = android.view.View.inflate(this, com.tencent.mm.R.layout.c6_, null);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.m9z);
            gm0.j1.b().c();
            int f17 = ((com.tencent.mm.storage.u8) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Zi()).f();
            if (f17 == 0) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(inflate, arrayList.toArray(), "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI", "getSayhiLayout", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                inflate.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(inflate, "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI", "getSayhiLayout", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(inflate, arrayList2.toArray(), "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI", "getSayhiLayout", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                inflate.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(inflate, "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI", "getSayhiLayout", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                textView.setText(getResources().getQuantityString(com.tencent.mm.R.plurals.f489691a1, f17, java.lang.Integer.valueOf(f17)));
                android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.f485863jd0);
                com.tencent.mm.storage.t8 P0 = ((com.tencent.mm.storage.u8) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Zi()).P0();
                if (P0 != null) {
                    ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, P0.field_sayhiuser, null);
                }
                inflate.setOnClickListener(new com.tencent.mm.plugin.nearby.ui.g0(this));
                view2 = inflate;
            }
            this.f152104x = view2;
            if (view2 != null) {
                this.f152089f.addHeaderView(view2);
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489341c66;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f152089f = (android.widget.ListView) findViewById(com.tencent.mm.R.id.k5q);
        this.f152088e = new com.tencent.mm.plugin.nearby.ui.q0(this, this);
        android.widget.ListView listView = this.f152089f;
        if (this.f152097q == null) {
            android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(this);
            this.f152097q = linearLayout;
            linearLayout.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, -2));
            ((android.widget.LinearLayout) this.f152097q).setGravity(17);
        }
        this.f152099s = true;
        listView.addHeaderView(this.f152097q);
        java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("LBSShowBindPhone");
        if (d17 != null && d17.length() > 0) {
            try {
                this.f152100t = java.lang.Integer.valueOf(d17).intValue();
            } catch (java.lang.Exception unused) {
                this.f152100t = 0;
            }
        }
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(6, null);
        if (str != null && str.length() > 0) {
            this.f152100t = 0;
        }
        if (this.f152100t > 0) {
            this.f152089f.addHeaderView(new com.tencent.mm.plugin.nearby.ui.BindMobileOrQQHeaderView(this));
        }
        this.f152089f.setAdapter((android.widget.ListAdapter) this.f152088e);
        this.f152089f.setOnItemClickListener(new com.tencent.mm.plugin.nearby.ui.h0(this));
        this.f152089f.setOnTouchListener(new com.tencent.mm.plugin.nearby.ui.i0(this));
        setBackBtn(new com.tencent.mm.plugin.nearby.ui.j0(this));
        setToTop(new com.tencent.mm.plugin.nearby.ui.k0(this));
        addIconOptionMenu(0, com.tencent.mm.R.raw.icons_outlined_more, new com.tencent.mm.plugin.nearby.ui.w(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 != 1) {
            if (i17 == 2009 && i18 == -1) {
                finish();
                return;
            }
            return;
        }
        if (i18 == -1) {
            this.f152095o = false;
            U6();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        int P;
        java.util.Map map;
        com.tencent.mm.plugin.report.service.f0.a(11);
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.h6j);
        gm0.j1.d().a(148, this);
        gm0.j1.d().a(376, this);
        gm0.j1.d().a(1087, this);
        ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
        this.f152102v = i11.h.e();
        initView();
        getResources().getString(com.tencent.mm.R.string.h6b);
        getResources().getString(com.tencent.mm.R.string.h6a);
        getResources().getString(com.tencent.mm.R.string.h6_);
        getResources().getString(com.tencent.mm.R.string.i8h);
        int j17 = com.tencent.mm.sdk.platformtools.t8.j1((java.lang.Integer) gm0.j1.u().c().l(16386, null), 1);
        this.f152096p = j17;
        if (j17 == 3) {
            setTitleLogo(0, com.tencent.mm.R.raw.ic_sex_male);
        } else if (j17 == 4) {
            setTitleLogo(0, com.tencent.mm.R.raw.ic_sex_female);
        } else {
            setTitleLogo(0, 0);
            this.f152096p = 1;
        }
        d85.m0 m0Var = (d85.m0) i95.n0.c(d85.m0.class);
        d85.g0 g0Var = d85.g0.LOCAION;
        d85.f0 f0Var = d85.f0.f227169t;
        if (((d85.d1) m0Var).Ri(g0Var, f0Var)) {
            U6();
        } else {
            ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Di(g0Var, f0Var, new com.tencent.mm.plugin.nearby.ui.c0(this));
        }
        if (com.tencent.mm.sdk.platformtools.m2.m()) {
            java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_nearby_ad, "", true), "lbsads", null);
            if (d17 != null && (P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".lbsads.$count"), 0)) > 0) {
                int i17 = 0;
                while (true) {
                    map = this.f152094n;
                    if (i17 >= P) {
                        break;
                    }
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder(".lbsads.lbsad");
                    sb6.append(i17 == 0 ? "" : java.lang.Integer.valueOf(i17));
                    java.lang.String sb7 = sb6.toString();
                    com.tencent.mm.plugin.nearby.ui.l0 l0Var = new com.tencent.mm.plugin.nearby.ui.l0(null);
                    l0Var.f152163a = (java.lang.String) d17.get(sb7 + ".$id");
                    l0Var.f152164b = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(sb7 + ".$pos"), 0);
                    l0Var.f152165c = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(sb7 + ".$close_times"), 0);
                    l0Var.f152166d = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(sb7 + ".$show_times"), Integer.MAX_VALUE);
                    l0Var.f152167e = (java.lang.String) d17.get(sb7 + ".name");
                    l0Var.f152168f = (java.lang.String) d17.get(sb7 + ".desc");
                    l0Var.f152169g = (java.lang.String) d17.get(sb7 + ".icon");
                    l0Var.f152170h = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(sb7 + ".jump.$type"), 0);
                    l0Var.f152171i = (java.lang.String) d17.get(sb7 + ".jump");
                    ((java.util.HashMap) map).put(l0Var.f152163a, l0Var);
                    i17++;
                }
                java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_NEAR_BY_AD_STRING_SYNC, null);
                for (java.lang.String str : (m17 != null ? (java.lang.String) m17 : "").split("\\|")) {
                    java.lang.String[] split = str.split(":");
                    if (split.length == 3) {
                        com.tencent.mm.plugin.nearby.ui.l0 l0Var2 = (com.tencent.mm.plugin.nearby.ui.l0) ((java.util.HashMap) map).get(split[0]);
                        if (l0Var2 != null) {
                            l0Var2.f152172j = com.tencent.mm.sdk.platformtools.t8.P(split[1], 0);
                            l0Var2.f152173k = com.tencent.mm.sdk.platformtools.t8.P(split[2], 0);
                        }
                    }
                }
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        bb5.g gVar;
        com.tencent.mm.plugin.report.service.f0.e(11);
        gm0.j1.d().q(148, this);
        gm0.j1.d().q(376, this);
        gm0.j1.d().q(1087, this);
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f152087d;
        if (u3Var != null && u3Var.isShowing()) {
            this.f152087d.dismiss();
        }
        i11.e eVar = this.f152102v;
        if (eVar != null) {
            ((i11.h) eVar).m(this.C);
        }
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.tencent.mm.modelavatar.d1.wi().a();
        com.tencent.mm.plugin.nearby.ui.q0 q0Var = this.f152088e;
        if (q0Var != null && (gVar = q0Var.f152200e) != null) {
            gVar.a();
            q0Var.f152200e = null;
        }
        if (((java.util.LinkedList) this.f152093m).size() > 0) {
            java.lang.String str = "";
            for (com.tencent.mm.plugin.nearby.ui.l0 l0Var : ((java.util.HashMap) this.f152094n).values()) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(str);
                sb6.append("|");
                sb6.append(l0Var.f152163a);
                sb6.append(":");
                sb6.append(l0Var.f152172j);
                sb6.append(":");
                int i17 = l0Var.f152173k + 1;
                l0Var.f152173k = i17;
                sb6.append(i17);
                str = sb6.toString();
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(17431, l0Var.f152163a, java.lang.Integer.valueOf(l0Var.f152174l + 1));
            }
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_NEAR_BY_AD_STRING_SYNC, str);
        }
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        i11.e eVar = this.f152102v;
        if (eVar != null) {
            ((i11.h) eVar).m(this.C);
        }
        this.f152106z.dead();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        W6();
        this.f152088e.notifyDataSetChanged();
        gm0.j1.b().c();
        if (((com.tencent.mm.storage.u8) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Zi()).f() == 0) {
            this.f152089f.removeHeaderView(null);
        }
        this.f152106z.alive();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.String str2;
        java.lang.String str3;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f152087d;
        if (u3Var != null) {
            u3Var.dismiss();
            this.f152087d = null;
        }
        if (m1Var.getType() != 148) {
            if (m1Var.getType() == 376) {
                an3.g gVar = (an3.g) m1Var;
                if (((r45.h64) gVar.f8871e.f70710a.f70684a).f375871d != 1) {
                    return;
                }
                com.tencent.mm.ui.widget.dialog.u3 u3Var2 = this.f152087d;
                if (u3Var2 != null) {
                    u3Var2.dismiss();
                    this.f152087d = null;
                }
                if (i17 != 0 || i18 != 0 || (str2 = gVar.f8872f) == null) {
                    db5.e1.m(getContext(), com.tencent.mm.R.string.h6k, com.tencent.mm.R.string.f490573yv, new com.tencent.mm.plugin.nearby.ui.b0(this));
                    return;
                }
                java.lang.String str4 = gVar.f8873g;
                com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3();
                z3Var.M1(str4);
                z3Var.X1(str2);
                com.tencent.mm.storage.k4 Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
                if (!Bi.j0(z3Var.d1())) {
                    Bi.h0(z3Var);
                }
                gm0.j1.u().c().w(143873, str2);
                gm0.j1.u().c().w(143874, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()));
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Chat_User", str2);
                ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.k(intent, 1, this);
                return;
            }
            return;
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var3 = this.f152087d;
        if (u3Var3 != null) {
            u3Var3.dismiss();
            this.f152087d = null;
        }
        an3.f fVar = (an3.f) m1Var;
        int I = fVar.I();
        if (this.f152090g == null && (I == 1 || I == 3 || I == 4)) {
            return;
        }
        if ((I == 1 || I == 3 || I == 4) && this.f152095o) {
            return;
        }
        if (this.f152091h == null && I == 2) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NearbyFriend", "onSceneEnd: errType=%d, errCode=%d, errMsg=%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (m1Var.getType() != 148) {
            return;
        }
        if (i17 != 0 || i18 != 0) {
            if (I == 1 || I == 3 || I == 4) {
                android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.k5s);
                textView.setVisibility(0);
                ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.e(this);
                tm.a b17 = (str == null || str.length() <= 0) ? null : tm.a.b(str);
                if (b17 != null && (str3 = b17.f420399b) != null && str3.length() > 0) {
                    textView.setText(b17.f420399b);
                } else if (i18 == -2001) {
                    textView.setText(getString(com.tencent.mm.R.string.f492618h60));
                } else {
                    textView.setText(getString(com.tencent.mm.R.string.f492621h63));
                }
                this.f152089f.setVisibility(8);
                this.f152090g = null;
            }
            if (fVar.I() == 2) {
                dp.a.makeText(this, com.tencent.mm.R.string.h5x, 1).show();
                this.f152091h = null;
                return;
            }
            return;
        }
        if (I == 1 || I == 3 || I == 4) {
            java.util.List H = fVar.H();
            this.f152093m = H;
            if (H == null || ((java.util.LinkedList) H).size() == 0) {
                android.view.View findViewById = findViewById(com.tencent.mm.R.id.k5s);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f152089f.setVisibility(8);
                ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.e(this);
                com.tencent.mm.plugin.report.service.f0.e(11);
            } else {
                java.util.LinkedList linkedList = new java.util.LinkedList();
                int i19 = 0;
                for (r45.b64 b64Var : this.f152093m) {
                    if (((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().h(b64Var.f370550d)) {
                        linkedList.add(i19, b64Var);
                        i19++;
                    } else if (!com.tencent.mm.sdk.platformtools.t8.K0(b64Var.f370550d) && !com.tencent.mm.sdk.platformtools.t8.K0(b64Var.f370555i)) {
                        linkedList.add(b64Var);
                    }
                }
                ((java.util.LinkedList) this.f152093m).clear();
                this.f152093m = linkedList;
                if (linkedList.size() == 0) {
                    android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.k5s);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(findViewById2, "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    this.f152089f.setVisibility(8);
                } else {
                    android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.k5s);
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(findViewById3, "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    V6();
                    this.f152088e.notifyDataSetChanged();
                    if (this.f152088e.getCount() > 0) {
                        this.f152089f.setSelection(0);
                    }
                    this.f152089f.post(new com.tencent.mm.plugin.nearby.ui.z(this));
                }
            }
            int i27 = this.f152096p;
            if (i27 == 3) {
                setTitleLogo(0, com.tencent.mm.R.raw.ic_sex_male);
            } else if (i27 == 4) {
                setTitleLogo(0, com.tencent.mm.R.raw.ic_sex_female);
            } else {
                setTitleLogo(0, 0);
                this.f152096p = 1;
            }
            this.f152095o = true;
            this.f152090g = null;
        }
        if (fVar.I() == 2) {
            db5.e1.t(getContext(), getString(com.tencent.mm.R.string.h5y), "", new com.tencent.mm.plugin.nearby.ui.a0(this));
            this.f152091h = null;
        }
        com.tencent.mm.modelbase.o oVar = fVar.f8869e;
        if (((r45.g64) oVar.f70711b.f70700a).f374921h == 1) {
            java.lang.String string = getString(com.tencent.mm.R.string.h6m);
            int i28 = ((r45.g64) oVar.f70711b.f70700a).f374922i;
            if (this.f152097q != null) {
                android.view.View view = this.f152098r;
                if (view == null) {
                    android.view.View inflate = android.view.View.inflate(this, com.tencent.mm.R.layout.c6a, null);
                    this.f152098r = inflate;
                    this.f152097q.addView(inflate);
                    this.f152098r.setOnClickListener(new com.tencent.mm.plugin.nearby.ui.x(this));
                } else {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                    arrayList4.add(0);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(view, arrayList4.toArray(), "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI", "showLbsroomEntry", "(Ljava/lang/String;I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI", "showLbsroomEntry", "(Ljava/lang/String;I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                ((android.widget.TextView) this.f152098r.findViewById(com.tencent.mm.R.id.k5y)).setText(string);
                if (i28 != 0) {
                    ((android.widget.TextView) this.f152098r.findViewById(com.tencent.mm.R.id.k5x)).setText(java.lang.String.format(getResources().getQuantityString(com.tencent.mm.R.plurals.f489685w, i28, java.lang.Integer.valueOf(i28)), new java.lang.Object[0]));
                }
            }
        } else {
            android.view.View view2 = this.f152098r;
            if (view2 != null && this.f152097q != null) {
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
                arrayList5.add(8);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view2, arrayList5.toArray(), "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI", "hideLbsroomEntryView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/nearby/ui/NearbyFriendsUI", "hideLbsroomEntryView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        this.f152101u = true;
    }
}
