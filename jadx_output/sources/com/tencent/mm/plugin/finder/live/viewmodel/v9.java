package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes.dex */
public final class v9 extends com.tencent.mm.ui.component.UIComponent implements zy2.u8 {
    public int A;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f117485d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f117486e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f117487f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f117488g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ProgressBar f117489h;

    /* renamed from: i, reason: collision with root package name */
    public rl5.r f117490i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f117491m;

    /* renamed from: n, reason: collision with root package name */
    public bm2.h8 f117492n;

    /* renamed from: o, reason: collision with root package name */
    public final int[] f117493o;

    /* renamed from: p, reason: collision with root package name */
    public int f117494p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f117495q;

    /* renamed from: r, reason: collision with root package name */
    public java.util.LinkedList f117496r;

    /* renamed from: s, reason: collision with root package name */
    public int f117497s;

    /* renamed from: t, reason: collision with root package name */
    public long f117498t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f117499u;

    /* renamed from: v, reason: collision with root package name */
    public int f117500v;

    /* renamed from: w, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f117501w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f117502x;

    /* renamed from: y, reason: collision with root package name */
    public int f117503y;

    /* renamed from: z, reason: collision with root package name */
    public long f117504z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v9(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f117485d = "FinderLiveVisitorRoleUIC";
        this.f117487f = true;
        this.f117493o = new int[2];
        this.f117496r = new java.util.LinkedList();
        this.f117497s = 1;
        this.f117498t = Long.MIN_VALUE;
        this.f117499u = true;
        this.f117500v = 1;
        this.f117501w = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) kotlinx.coroutines.t3.a(null, 1, null)).plus(kotlinx.coroutines.q1.f310570c));
        this.f117502x = true;
    }

    public final android.content.Intent O6() {
        zl2.r4.f473950a.W2(this.f117496r, this.f117497s, this.f117498t);
        android.content.Intent intent = new android.content.Intent();
        int i17 = this.f117494p;
        if (i17 == 1) {
            intent.putExtra("KEY_IS_FROM_SETTING", this.f117495q);
        } else if (i17 == 2) {
            intent.putExtra("KEY_HAS_CHANGE_ROLE", this.f117500v != this.f117497s);
        }
        return intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object P6(kotlin.coroutines.Continuation r18) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.viewmodel.v9.P6(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void Q6(int i17) {
        boolean z17 = zl2.q4.f473933a.E() ? true : this.f117498t - ((long) c01.id.e()) <= 0;
        zl2.r4.f473950a.F(this.f117496r);
        bm2.h8 h8Var = this.f117492n;
        if (h8Var != null) {
            h8Var.x(i17, this.f117496r, z17);
        }
        bm2.h8 h8Var2 = this.f117492n;
        if (h8Var2 != null) {
            h8Var2.notifyDataSetChanged();
        }
    }

    public final void R6() {
        java.lang.String str = "before removeAliasInfo size:" + this.f117496r.size();
        java.lang.String str2 = this.f117485d;
        com.tencent.mars.xlog.Log.i(str2, str);
        java.util.Iterator it = this.f117496r.iterator();
        kotlin.jvm.internal.o.f(it, "iterator(...)");
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            kotlin.jvm.internal.o.f(next, "next(...)");
            r45.of1 of1Var = (r45.of1) next;
            if (of1Var.getInteger(2) == 2) {
                it.remove();
                com.tencent.mars.xlog.Log.i(str2, "removeAliasInfo:" + pm0.b0.g(of1Var));
                break;
            }
        }
        com.tencent.mars.xlog.Log.i(str2, "after removeAliasInfo size:" + this.f117496r.size());
        zl2.r4.f473950a.U2(this.f117496r);
    }

    public final void S6() {
        com.tencent.mars.xlog.Log.i(this.f117485d, "setActivityResult fromSetting:" + this.f117495q + ", " + zl2.r4.f473950a.O2(this.f117485d, this.f117496r, this.f117497s, this.f117498t));
        getActivity().setResult(-1, O6());
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String stringExtra;
        if (i17 == 1) {
            com.tencent.mars.xlog.Log.i(this.f117485d, "requestCode:" + i17 + ",resultCode:" + i18 + ",data:" + intent);
            if (i18 == -1) {
                java.lang.String str3 = "";
                if (intent == null || (str = intent.getStringExtra("KEY_ALIAS_VISITOR_NICKNAME")) == null) {
                    str = "";
                }
                if (intent == null || (str2 = intent.getStringExtra("KEY_ALIAS_VISITOR_AVATAR")) == null) {
                    str2 = "";
                }
                if (intent != null && (stringExtra = intent.getStringExtra("KEY_ALIAS_VISITOR_USERNAME")) != null) {
                    str3 = stringExtra;
                }
                r45.of1 of1Var = new r45.of1();
                of1Var.set(0, str);
                of1Var.set(1, str2);
                of1Var.set(3, str3);
                of1Var.set(2, 2);
                R6();
                if (this.f117496r.size() > 0) {
                    this.f117496r.add(1, of1Var);
                } else {
                    this.f117496r.add(of1Var);
                }
                bm2.h8 h8Var = this.f117492n;
                if (h8Var != null) {
                    h8Var.x(this.f117497s, this.f117496r, true);
                }
                bm2.h8 h8Var2 = this.f117492n;
                if (h8Var2 != null) {
                    h8Var2.notifyDataSetChanged();
                }
                zl2.r4.f473950a.U2(this.f117496r);
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        int i17;
        if (this.f117487f && ((i17 = this.f117494p) == 1 || i17 == 2)) {
            S6();
        }
        getActivity().finish();
        if (this.f117494p != 0) {
            getActivity().overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477877e1);
        }
        return true;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        android.view.View view;
        this.f117486e = findViewById(com.tencent.mm.R.id.ief);
        this.f117489h = (android.widget.ProgressBar) findViewById(com.tencent.mm.R.id.imc);
        boolean g17 = zl2.q4.f473933a.g();
        this.f117487f = g17;
        if (g17) {
            android.view.View view2 = this.f117486e;
            if (view2 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveVisitorRoleUIC", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveVisitorRoleUIC", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            android.view.View view3 = this.f117486e;
            if (view3 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveVisitorRoleUIC", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveVisitorRoleUIC", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.widget.ProgressBar progressBar = this.f117489h;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
        }
        if (getIntent().getBooleanExtra("intent_status_from_privacy_to_video_setting", false) && (view = this.f117486e) != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveVisitorRoleUIC", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveVisitorRoleUIC", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f117488g = (androidx.recyclerview.widget.RecyclerView) findViewById(com.tencent.mm.R.id.p4b);
        bm2.h8 h8Var = new bm2.h8();
        this.f117492n = h8Var;
        h8Var.f21951d = new com.tencent.mm.plugin.finder.live.viewmodel.j9(this);
        h8Var.f21952e = new com.tencent.mm.plugin.finder.live.viewmodel.k9(this);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f117488g;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(recyclerView.getContext(), 1, false));
            recyclerView.setAdapter(this.f117492n);
            recyclerView.P(new com.tencent.mm.plugin.finder.live.viewmodel.l9(this));
        }
        this.f117494p = getIntent().getIntExtra("KEY_SOURCE", 0);
        this.f117495q = getIntent().getBooleanExtra("KEY_IS_FROM_SETTING", true);
        this.f117499u = getIntent().getBooleanExtra("KEY_CAN_MODEI_ALIAS", true);
        if (this.f117495q || this.f117494p == 2) {
            this.f117496r = com.tencent.mm.plugin.finder.live.util.n2.f115640a.a();
            g92.b bVar = g92.b.f269769e;
            this.f117497s = bVar.k2().getInteger(4);
            this.f117498t = bVar.k2().getLong(5);
        } else {
            java.io.Serializable serializableExtra = getIntent().getSerializableExtra("KEY_VISITOR_ROLE_LIST");
            java.util.List<byte[]> list = serializableExtra instanceof java.util.List ? (java.util.List) serializableExtra : null;
            if (list != null) {
                zl2.r4 r4Var = zl2.r4.f473950a;
                java.util.LinkedList linkedList = this.f117496r;
                if (linkedList == null) {
                    linkedList = new java.util.LinkedList();
                } else {
                    linkedList.clear();
                }
                for (byte[] bArr : list) {
                    r45.of1 of1Var = new r45.of1();
                    of1Var.parseFrom(bArr);
                    linkedList.add(of1Var);
                }
            }
            this.f117497s = getIntent().getIntExtra("KEY_VISITOR_ROLE", 1);
            this.f117498t = getIntent().getLongExtra("KEY_MODIFY_TIME", Long.MIN_VALUE);
        }
        if (this.f117496r.size() > 0) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_ALIAS_GUIDE_SHOW_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        }
        this.f117500v = this.f117497s;
        java.lang.String str = "parseInten fromSetting:" + this.f117495q + ',' + zl2.r4.f473950a.O2(this.f117485d, this.f117496r, this.f117497s, this.f117498t);
        java.lang.String str2 = this.f117485d;
        com.tencent.mars.xlog.Log.i(str2, str);
        Q6(this.f117497s);
        com.tencent.mars.xlog.Log.i(str2, "onCreate enableVisitorRoleEntrance:" + this.f117487f);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        kotlinx.coroutines.z0.e(this.f117501w, null, 1, null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).getClass();
        ((c61.l7) i95.n0.c(c61.l7.class)).P.e(65536, 9);
    }
}
