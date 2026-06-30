package com.tencent.mm.ui.bizchat;

@db5.a(3)
/* loaded from: classes9.dex */
public class BizChatSearchUI extends com.tencent.mm.ui.MMActivity implements y90.j, hb5.z {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f197926d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f197927e;

    /* renamed from: f, reason: collision with root package name */
    public int f197928f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f197929g;

    /* renamed from: h, reason: collision with root package name */
    public hb5.g0 f197930h;

    /* renamed from: i, reason: collision with root package name */
    public a31.v f197931i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.bizchat.BizChatSearchListView f197932m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f197933n;

    /* renamed from: o, reason: collision with root package name */
    public hb5.e0 f197934o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.AbsListView.OnScrollListener f197935p = new hb5.a0(this);

    @Override // y90.j
    public void G2() {
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void H0() {
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void P4(java.lang.String str) {
        java.lang.String str2;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) && (str2 = this.f197929g) != null) {
            java.lang.String str3 = null;
            this.f197929g = null;
            if (!str2.equals("")) {
                this.f197931i.r(str2);
            }
            a31.v vVar = this.f197931i;
            hb5.e0 e0Var = this.f197934o;
            int i17 = hb5.e0.N;
            if (e0Var.d()) {
                str3 = getContext().getResources().getString(com.tencent.mm.R.string.ao9);
            } else if (this.f197934o.f()) {
                str3 = getContext().getResources().getString(com.tencent.mm.R.string.aod);
            } else {
                if (this.f197934o.f280165e == 3) {
                    str3 = getContext().getResources().getString(com.tencent.mm.R.string.ao6);
                }
            }
            vVar.q(str3);
            this.f197931i.a();
            return;
        }
        hb5.e0 e0Var2 = this.f197934o;
        e0Var2.f280166f = str;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            e0Var2.a();
            e0Var2.E = false;
            e0Var2.L = false;
            e0Var2.h(true);
            return;
        }
        if (e0Var2.f280165e == 4) {
            e0Var2.a();
            e0Var2.E = false;
            e0Var2.L = false;
            e0Var2.j(str);
            return;
        }
        if (e0Var2.f()) {
            e0Var2.E = true;
            e0Var2.L = false;
            e0Var2.g();
            e0Var2.k(str, false);
            if (e0Var2.f280170m) {
                com.tencent.mm.sdk.platformtools.u3.i(new hb5.c0(e0Var2, str), 200L);
                return;
            }
            return;
        }
        e0Var2.k(str, true);
        boolean z17 = e0Var2.f280170m;
        if (z17 && e0Var2.E && z17) {
            com.tencent.mm.sdk.platformtools.u3.i(new hb5.c0(e0Var2, str), 200L);
        }
        if (e0Var2.f280172o) {
            e0Var2.j(str);
        }
    }

    public final void T6(qk.o oVar, int i17) {
        r01.m y07 = r01.q3.bj().y0(this.f197927e);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14507, java.lang.Long.valueOf(y07 != null ? y07.field_wwCorpId : 0L), java.lang.Long.valueOf(oVar.w0()), java.lang.Long.valueOf(y07 != null ? y07.field_wwUserVid : 0L), 2, 2, java.lang.Integer.valueOf(i17));
    }

    public void U6(int i17) {
        hb5.g0 g0Var = this.f197930h;
        if (g0Var != null) {
            if (i17 == 1) {
                g0Var.a(true, false, false);
            } else if (i17 != 2) {
                g0Var.a(false, false, false);
            } else {
                g0Var.a(false, false, true);
            }
        }
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void V5() {
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.a99;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f197926d)) {
            this.f197926d = getIntent().getStringExtra("enterprise_biz_name");
            this.f197927e = getIntent().getStringExtra("enterprise_biz_father_name");
            this.f197928f = getIntent().getIntExtra("biz_chat_search_scene", 1);
            this.f197929g = getIntent().getStringExtra("biz_chat_search_text");
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f197926d)) {
                finish();
            }
        }
        this.f197932m = (com.tencent.mm.ui.bizchat.BizChatSearchListView) findViewById(com.tencent.mm.R.id.ask);
        this.f197933n = (android.widget.TextView) findViewById(com.tencent.mm.R.id.kcj);
        hb5.e0 e0Var = new hb5.e0(getContext(), this.f197926d, this.f197927e, this.f197928f);
        this.f197934o = e0Var;
        if (e0Var.f()) {
            hb5.g0 g0Var = new hb5.g0(null);
            this.f197930h = g0Var;
            com.tencent.mm.ui.bizchat.BizChatSearchListView bizChatSearchListView = this.f197932m;
            android.view.View inflate = android.view.View.inflate(getContext(), com.tencent.mm.R.layout.bsg, null);
            g0Var.f280192a = inflate.findViewById(com.tencent.mm.R.id.imc);
            g0Var.f280193b = inflate.findViewById(com.tencent.mm.R.id.f485680im1);
            g0Var.f280194c = inflate.findViewById(com.tencent.mm.R.id.imi);
            android.view.View view = g0Var.f280192a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/bizchat/BizChatSearchUI$BizChatLoadFooter", "inflateFooterView", "(Landroid/content/Context;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/bizchat/BizChatSearchUI$BizChatLoadFooter", "inflateFooterView", "(Landroid/content/Context;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = g0Var.f280193b;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/bizchat/BizChatSearchUI$BizChatLoadFooter", "inflateFooterView", "(Landroid/content/Context;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/bizchat/BizChatSearchUI$BizChatLoadFooter", "inflateFooterView", "(Landroid/content/Context;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = g0Var.f280194c;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/ui/bizchat/BizChatSearchUI$BizChatLoadFooter", "inflateFooterView", "(Landroid/content/Context;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/ui/bizchat/BizChatSearchUI$BizChatLoadFooter", "inflateFooterView", "(Landroid/content/Context;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            bizChatSearchListView.addFooterView(inflate);
            U6(0);
        }
        this.f197932m.setAdapter((android.widget.ListAdapter) this.f197934o);
        this.f197932m.setOnItemClickListener(new hb5.b0(this));
        this.f197932m.setOnTouchListener(this);
        if (this.f197934o.f()) {
            this.f197932m.setOnScrollListener(this.f197935p);
        }
        a31.v vVar = new a31.v();
        this.f197931i = vVar;
        vVar.c(this.f197934o.d());
        a31.v vVar2 = this.f197931i;
        vVar2.f999u = this;
        vVar2.f210324i = this;
        vVar2.f996r = false;
    }

    @Override // com.tencent.mm.ui.tools.b9
    public boolean n5(java.lang.String str) {
        hideVKB();
        return true;
    }

    @Override // y90.j
    public void o2(boolean z17, java.lang.String[] strArr, long j17, int i17) {
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    @Override // com.tencent.mm.ui.MMActivity, androidx.activity.ComponentActivity, android.app.Activity
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        this.f197931i.j(this, menu);
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f197931i.s();
        this.f197931i.a();
    }

    @Override // com.tencent.mm.ui.MMActivity, android.app.Activity
    public boolean onPrepareOptionsMenu(android.view.Menu menu) {
        this.f197931i.m(this, menu);
        return true;
    }

    @Override // com.tencent.mm.ui.tools.b9
    public void v() {
    }
}
