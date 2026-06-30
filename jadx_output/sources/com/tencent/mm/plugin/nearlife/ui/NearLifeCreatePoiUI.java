package com.tencent.mm.plugin.nearlife.ui;

/* loaded from: classes15.dex */
public class NearLifeCreatePoiUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f152265z = 0;

    /* renamed from: d, reason: collision with root package name */
    public r45.d64 f152266d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f152267e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f152268f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.modelgeo.Addr f152269g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f152270h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.EditText f152271i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.EditText f152272m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f152273n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f152274o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f152275p;

    /* renamed from: q, reason: collision with root package name */
    public dn3.j f152276q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f152277r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.View.OnClickListener f152278s = new com.tencent.mm.plugin.nearlife.ui.r(this);

    /* renamed from: t, reason: collision with root package name */
    public final android.view.View.OnClickListener f152279t = new com.tencent.mm.plugin.nearlife.ui.s(this);

    /* renamed from: u, reason: collision with root package name */
    public final android.view.View.OnClickListener f152280u = new com.tencent.mm.plugin.nearlife.ui.t(this);

    /* renamed from: v, reason: collision with root package name */
    public final android.view.MenuItem.OnMenuItemClickListener f152281v = new com.tencent.mm.plugin.nearlife.ui.v(this);

    /* renamed from: w, reason: collision with root package name */
    public final u60.e f152282w = new com.tencent.mm.plugin.nearlife.ui.w(this);

    /* renamed from: x, reason: collision with root package name */
    public final android.view.MenuItem.OnMenuItemClickListener f152283x = new com.tencent.mm.plugin.nearlife.ui.x(this);

    /* renamed from: y, reason: collision with root package name */
    public final android.text.TextWatcher f152284y = new com.tencent.mm.plugin.nearlife.ui.y(this);

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.c5v;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.h9k);
        ((android.view.ViewGroup) findViewById(com.tencent.mm.R.id.iii)).setOnClickListener(this.f152278s);
        ((android.view.ViewGroup) findViewById(com.tencent.mm.R.id.iih)).setOnClickListener(this.f152279t);
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.oo8)).setOnClickListener(this.f152280u);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.oo8);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/nearlife/ui/NearLifeCreatePoiUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/nearlife/ui/NearLifeCreatePoiUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.iih);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/nearlife/ui/NearLifeCreatePoiUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/nearlife/ui/NearLifeCreatePoiUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.iij);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/nearlife/ui/NearLifeCreatePoiUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById3, "com/tencent/mm/plugin/nearlife/ui/NearLifeCreatePoiUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f152271i = (android.widget.EditText) findViewById(com.tencent.mm.R.id.f484237di0);
        this.f152272m = (android.widget.EditText) findViewById(com.tencent.mm.R.id.dht);
        this.f152273n = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f487455op2);
        this.f152274o = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f487454op1);
        android.widget.EditText editText = this.f152271i;
        android.text.TextWatcher textWatcher = this.f152284y;
        editText.addTextChangedListener(textWatcher);
        this.f152272m.addTextChangedListener(textWatcher);
        this.f152273n.addTextChangedListener(textWatcher);
        java.lang.String stringExtra = getIntent().getStringExtra("get_poi_name");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        if (stringExtra.length() != 0) {
            this.f152271i.setText(stringExtra);
            this.f152271i.setSelection(stringExtra.length());
        }
        ck5.f b17 = ck5.f.b(this.f152271i);
        b17.f42561f = 0;
        b17.f42560e = 100;
        b17.d(null);
        ck5.f b18 = ck5.f.b(this.f152272m);
        b18.f42561f = 0;
        b18.f42560e = 400;
        b18.d(null);
        ck5.f b19 = ck5.f.b((android.widget.EditText) findViewById(com.tencent.mm.R.id.f484238di1));
        b19.f42561f = 0;
        b19.f42560e = 100;
        b19.d(null);
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.f490441v5), this.f152281v, null, com.tencent.mm.ui.fb.GREEN);
        enableOptionMenu(0, false);
        setBackBtn(this.f152283x);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 1) {
            java.lang.String stringExtra = intent.getStringExtra("karea_result");
            if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                return;
            }
            ((android.widget.TextView) findViewById(com.tencent.mm.R.id.f487455op2)).setText(stringExtra.replace(" ", ""));
            return;
        }
        if (i17 == 2 && -1 == i18 && intent != null) {
            java.lang.String stringExtra2 = intent.getStringExtra("poi_category");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            this.f152274o.setText(stringExtra2 != null ? stringExtra2 : "");
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        c01.d9.e().a(me1.c.CTRL_INDEX, this);
        r45.d64 d64Var = new r45.d64();
        this.f152266d = d64Var;
        d64Var.f372175e = getIntent().getFloatExtra("get_lat", -85.0f);
        this.f152266d.f372174d = getIntent().getFloatExtra("get_lng", -1000.0f);
        this.f152266d.f372176f = getIntent().getIntExtra("get_preci", 0);
        r45.d64 d64Var2 = this.f152266d;
        d64Var2.f372178h = "";
        d64Var2.f372179i = 0;
        d64Var2.f372177g = "";
        u60.f wi6 = ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).wi();
        if (wi6 != null) {
            r45.d64 d64Var3 = this.f152266d;
            ((i11.g) wi6).b(new u60.h(d64Var3.f372175e, d64Var3.f372174d), this.f152282w);
        }
        this.f152277r = getIntent().getStringExtra("search_id");
        initView();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        c01.d9.e().q(me1.c.CTRL_INDEX, this);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (4 != keyEvent.getKeyCode()) {
            return super.onKeyDown(i17, keyEvent);
        }
        db5.e1.n(this, com.tencent.mm.R.string.h9e, com.tencent.mm.R.string.h9k, new com.tencent.mm.plugin.nearlife.ui.z(this), null);
        return true;
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NearLifeCreatePoiUI", "errType:%d, errCode:%d, errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (i17 != 0 || i18 != 0) {
            this.f152275p.dismiss();
            dp.a.makeText(getContext(), getString(com.tencent.mm.R.string.h9i), 1).show();
            this.f152276q = null;
            return;
        }
        this.f152275p.dismiss();
        dn3.j jVar = (dn3.j) m1Var;
        jVar.getClass();
        android.content.Intent intent = new android.content.Intent();
        r45.d64 d64Var = this.f152266d;
        if (d64Var != null) {
            intent.putExtra("get_lat", d64Var.f372175e);
            intent.putExtra("get_lng", this.f152266d.f372174d);
            com.tencent.mars.xlog.Log.i("MicroMsg.NearLifeCreatePoiUI", "onSceneEnd: put lat lng: %f,%f", java.lang.Float.valueOf(this.f152266d.f372175e), java.lang.Float.valueOf(this.f152266d.f372174d));
        }
        com.tencent.mm.modelgeo.Addr addr = this.f152269g;
        if (addr != null) {
            intent.putExtra("get_city", addr.f71214g);
            intent.putExtra("get_poi_city", this.f152269g.f71214g);
        }
        intent.putExtra("get_poi_address", this.f152268f);
        intent.putExtra("get_poi_classify_id", jVar.f242022f);
        intent.putExtra("get_poi_name", this.f152267e);
        intent.putExtra("get_poi_classify_type", 1);
        setResult(-1, intent);
        finish();
    }
}
