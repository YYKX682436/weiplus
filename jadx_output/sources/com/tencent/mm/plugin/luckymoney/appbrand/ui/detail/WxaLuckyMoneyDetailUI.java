package com.tencent.mm.plugin.luckymoney.appbrand.ui.detail;

/* loaded from: classes9.dex */
public class WxaLuckyMoneyDetailUI extends com.tencent.mm.plugin.luckymoney.appbrand.ui.WxaLuckyMoneyBaseUI implements nb3.b {
    public static final /* synthetic */ int A = 0;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ListView f145017n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ImageView f145018o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f145019p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f145020q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.ImageView f145021r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f145022s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f145023t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f145024u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f145025v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f145026w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f145027x;

    /* renamed from: y, reason: collision with root package name */
    public nb3.d f145028y;

    /* renamed from: h, reason: collision with root package name */
    public final nb3.a f145014h = new nb3.i();

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f145015i = null;

    /* renamed from: m, reason: collision with root package name */
    public android.content.Intent f145016m = null;

    /* renamed from: z, reason: collision with root package name */
    public final android.widget.AbsListView.OnScrollListener f145029z = new nb3.e(this);

    public final void U6(lb3.j jVar) {
        androidx.appcompat.app.AppCompatActivity context = getContext();
        com.tencent.mm.plugin.luckymoney.model.m5.b(this.f145018o, jVar.f317764b, jVar.f317763a);
        com.tencent.mm.plugin.luckymoney.model.m5.E(context, this.f145019p, jVar.f317765c);
        com.tencent.mm.plugin.luckymoney.model.m5.E(context, this.f145020q, jVar.f317769g);
        if (jVar.f317768f == 1) {
            this.f145021r.setVisibility(0);
            this.f145021r.setImageResource(com.tencent.mm.R.drawable.c_h);
        } else {
            this.f145021r.setVisibility(8);
        }
        if (jVar.f317767e == 2) {
            this.f145023t.setText(com.tencent.mm.wallet_core.ui.r1.o(jVar.f317766d / 100.0d));
            this.f145028y.getClass();
            android.view.View view = this.f145022s;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/appbrand/ui/detail/WxaLuckyMoneyDetailUI", "renderHeaderView", "(Lcom/tencent/mm/plugin/luckymoney/appbrand/model/WxaLuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/appbrand/ui/detail/WxaLuckyMoneyDetailUI", "renderHeaderView", "(Lcom/tencent/mm/plugin/luckymoney/appbrand/model/WxaLuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view2 = this.f145022s;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/appbrand/ui/detail/WxaLuckyMoneyDetailUI", "renderHeaderView", "(Lcom/tencent/mm/plugin/luckymoney/appbrand/model/WxaLuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/appbrand/ui/detail/WxaLuckyMoneyDetailUI", "renderHeaderView", "(Lcom/tencent/mm/plugin/luckymoney/appbrand/model/WxaLuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(jVar.f317770h)) {
            android.view.View view3 = this.f145024u;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/luckymoney/appbrand/ui/detail/WxaLuckyMoneyDetailUI", "renderHeaderView", "(Lcom/tencent/mm/plugin/luckymoney/appbrand/model/WxaLuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/luckymoney/appbrand/ui/detail/WxaLuckyMoneyDetailUI", "renderHeaderView", "(Lcom/tencent/mm/plugin/luckymoney/appbrand/model/WxaLuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view4 = this.f145024u;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/luckymoney/appbrand/ui/detail/WxaLuckyMoneyDetailUI", "renderHeaderView", "(Lcom/tencent/mm/plugin/luckymoney/appbrand/model/WxaLuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/luckymoney/appbrand/ui/detail/WxaLuckyMoneyDetailUI", "renderHeaderView", "(Lcom/tencent/mm/plugin/luckymoney/appbrand/model/WxaLuckyMoneyDetail;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f145025v.setText(jVar.f317770h);
            this.f145025v.setTextColor(getResources().getColor(com.tencent.mm.R.color.f479367xm));
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(jVar.f317771i)) {
            this.f145026w.setText((java.lang.CharSequence) null);
        } else {
            this.f145026w.setText(jVar.f317771i);
        }
    }

    public void V6() {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f145015i;
        if (u3Var == null || !u3Var.isShowing()) {
            return;
        }
        this.f145015i.dismiss();
    }

    public void W6(int i17, java.util.List list, java.util.List list2) {
        nb3.d dVar = this.f145028y;
        if (list2 == null) {
            dVar.getClass();
            dVar.f336042d = new java.util.LinkedList();
        } else {
            dVar.f336042d = list2;
        }
        dVar.notifyDataSetChanged();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bub;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.gjt);
        setBackBtn(new nb3.f(this));
        this.f145017n = (android.widget.ListView) findViewById(com.tencent.mm.R.id.izx);
        this.f145028y = new nb3.d(getContext());
        android.view.View inflate = android.view.LayoutInflater.from(this).inflate(com.tencent.mm.R.layout.bu7, (android.view.ViewGroup) null);
        this.f145027x = inflate;
        this.f145017n.addHeaderView(inflate);
        this.f145017n.setAdapter((android.widget.ListAdapter) this.f145028y);
        this.f145028y.getClass();
        this.f145017n.setOnScrollListener(this.f145029z);
        this.f145018o = (android.widget.ImageView) this.f145027x.findViewById(com.tencent.mm.R.id.f485766j01);
        this.f145019p = (android.widget.TextView) this.f145027x.findViewById(com.tencent.mm.R.id.j0j);
        this.f145021r = (android.widget.ImageView) this.f145027x.findViewById(com.tencent.mm.R.id.izf);
        this.f145020q = (android.widget.TextView) this.f145027x.findViewById(com.tencent.mm.R.id.j0m);
        this.f145022s = this.f145027x.findViewById(com.tencent.mm.R.id.iyx);
        this.f145023t = (android.widget.TextView) this.f145027x.findViewById(com.tencent.mm.R.id.iyw);
        this.f145024u = this.f145027x.findViewById(com.tencent.mm.R.id.izi);
        this.f145025v = (android.widget.TextView) this.f145027x.findViewById(com.tencent.mm.R.id.j0e);
        this.f145026w = (android.widget.TextView) this.f145027x.findViewById(com.tencent.mm.R.id.f485762iz3);
        com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(getContext(), null, getString(com.tencent.mm.R.string.ggc), true, true, new nb3.g(this));
        this.f145015i = Q;
        Q.show();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        android.content.Intent intent = this.f145016m;
        if (intent != null) {
            setResult(0, intent);
        } else {
            setResult(-1, null);
        }
        finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    @Override // com.tencent.mm.plugin.luckymoney.appbrand.ui.WxaLuckyMoneyBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            super.onCreate(r7)
            r6.initView()
            nb3.a r7 = r6.f145014h
            android.content.Intent r0 = r6.getIntent()
            nb3.i r7 = (nb3.i) r7
            r7.getClass()
            r7.f336053a = r6
            java.lang.String r1 = "key_sendid"
            java.lang.String r1 = r0.getStringExtra(r1)
            r7.f336054b = r1
            java.lang.String r1 = "key_appid"
            java.lang.String r1 = r0.getStringExtra(r1)
            r7.f336055c = r1
            java.lang.String r1 = "key_data"
            byte[] r1 = r0.getByteArrayExtra(r1)
            java.lang.String r2 = "key_from"
            java.lang.String r0 = r0.getStringExtra(r2)
            r2 = 0
            if (r0 == 0) goto Lba
            java.lang.String r3 = "value_open"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto Lba
            java.lang.String r0 = "MicroMsg.WxaLuckyMoneyLogicDetail"
            if (r1 == 0) goto L5c
            int r3 = r1.length
            if (r3 != 0) goto L43
            goto L5c
        L43:
            r45.b25 r3 = new r45.b25
            r3.<init>()
            r3.parseFrom(r1)     // Catch: java.io.IOException -> L51
            java.lang.String r1 = "parseFrom succeed."
            com.tencent.mars.xlog.Log.i(r0, r1)
            goto L62
        L51:
            r1 = move-exception
            java.lang.String r3 = "parseFrom failed. IOException: %s"
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            com.tencent.mars.xlog.Log.e(r0, r3, r1)
            goto L61
        L5c:
            java.lang.String r1 = "parseFrom failed. No data found."
            com.tencent.mars.xlog.Log.e(r0, r1)
        L61:
            r3 = 0
        L62:
            if (r3 != 0) goto L6d
            java.lang.String r1 = "parse OpenWxaHBResponse failed."
            com.tencent.mars.xlog.Log.e(r0, r1)
            r7.b(r2)
            goto Lbd
        L6d:
            int r0 = r3.f370481w
            r7.f336056d = r0
            java.util.List r0 = r7.f336058f
            java.util.LinkedList r1 = r3.f370474p
            java.util.LinkedList r0 = (java.util.LinkedList) r0
            r0.addAll(r1)
            nb3.b r0 = r7.f336053a
            com.tencent.mm.plugin.luckymoney.appbrand.ui.detail.WxaLuckyMoneyDetailUI r0 = (com.tencent.mm.plugin.luckymoney.appbrand.ui.detail.WxaLuckyMoneyDetailUI) r0
            r0.V6()
            nb3.b r7 = r7.f336053a
            com.tencent.mm.plugin.luckymoney.appbrand.ui.detail.WxaLuckyMoneyDetailUI r7 = (com.tencent.mm.plugin.luckymoney.appbrand.ui.detail.WxaLuckyMoneyDetailUI) r7
            r7.getClass()
            lb3.j r0 = new lb3.j
            r0.<init>()
            java.lang.String r2 = r3.f370476r
            r0.f317763a = r2
            java.lang.String r2 = r3.f370478t
            r0.f317764b = r2
            java.lang.String r2 = r3.f370477s
            r0.f317765c = r2
            long r4 = r3.f370468g
            r0.f317766d = r4
            java.lang.String r2 = r3.f370482x
            r0.f317770h = r2
            java.lang.String r2 = r3.f370480v
            r0.f317771i = r2
            int r2 = r3.f370473o
            r0.f317768f = r2
            int r2 = r3.f370467f
            r0.f317767e = r2
            java.lang.String r2 = r3.f370475q
            r0.f317769g = r2
            r7.U6(r0)
            int r0 = r3.f370481w
            r7.W6(r0, r1, r1)
            goto Lbd
        Lba:
            r7.b(r2)
        Lbd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.luckymoney.appbrand.ui.detail.WxaLuckyMoneyDetailUI.onCreate(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i17, android.view.Menu menu) {
        boolean onCreatePanelMenu = super.onCreatePanelMenu(i17, menu);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f482486fu);
        if (textView != null) {
            textView.setTextColor(getResources().getColor(com.tencent.mm.R.color.f479349x3));
        }
        return onCreatePanelMenu;
    }

    @Override // com.tencent.mm.plugin.luckymoney.appbrand.ui.WxaLuckyMoneyBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f145015i;
        if (u3Var == null || !u3Var.isShowing()) {
            return;
        }
        this.f145015i.dismiss();
    }
}
