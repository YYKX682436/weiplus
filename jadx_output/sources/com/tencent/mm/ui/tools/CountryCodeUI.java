package com.tencent.mm.ui.tools;

/* loaded from: classes15.dex */
public class CountryCodeUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f209985d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.tools.p1 f209986e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.base.VerticalScrollBar f209987f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f209988g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f209989h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f209990i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f209991m;

    /* renamed from: n, reason: collision with root package name */
    public db5.o9 f209992n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.ui.tools.c9 f209993o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f209994p = false;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String[] f209995q = null;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f209996r = null;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.sdk.platformtools.m2.n() ? com.tencent.mm.R.layout.f488695a33 : com.tencent.mm.R.layout.f488694a32;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        boolean z17;
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f209996r)) {
            setMMTitle(com.tencent.mm.R.string.f489935fy);
        } else {
            setMMTitle(this.f209996r);
        }
        java.util.List b17 = u11.b.b(true);
        this.f209988g = b17;
        java.lang.String[] strArr = this.f209995q;
        if (strArr != null && strArr.length > 0) {
            for (int size = ((java.util.ArrayList) b17).size() - 1; size >= 0; size--) {
                java.lang.String str = ((u11.a) ((java.util.ArrayList) this.f209988g).get(size)).f423727a;
                java.lang.String[] strArr2 = this.f209995q;
                int length = strArr2.length;
                int i17 = 0;
                while (true) {
                    if (i17 >= length) {
                        z17 = false;
                        break;
                    } else {
                        if (strArr2[i17].equals(str)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.CountryCodeUI", "exclude country: %s", str);
                            z17 = true;
                            break;
                        }
                        i17++;
                    }
                }
                if (z17) {
                    ((java.util.ArrayList) this.f209988g).remove(size);
                }
            }
        }
        if (com.tencent.mm.sdk.platformtools.m2.n()) {
            java.util.Collections.sort(this.f209988g, new com.tencent.mm.ui.tools.r1(this));
        } else {
            java.util.Collections.sort(this.f209988g, new com.tencent.mm.ui.tools.q1(this));
        }
        com.tencent.mm.ui.tools.c9 c9Var = new com.tencent.mm.ui.tools.c9(true, true);
        this.f209993o = c9Var;
        c9Var.f210324i = new com.tencent.mm.ui.tools.s1(this);
        addSearchMenu(true, c9Var);
        this.f209985d = (android.widget.ListView) findViewById(com.tencent.mm.R.id.f482735mf);
        com.tencent.mm.ui.tools.p1 p1Var = new com.tencent.mm.ui.tools.p1(this, this.f209988g);
        this.f209986e = p1Var;
        p1Var.f210634i = this.f209994p;
        this.f209985d.setAdapter((android.widget.ListAdapter) p1Var);
        this.f209985d.setVisibility(0);
        this.f209987f = (com.tencent.mm.ui.base.VerticalScrollBar) findViewById(com.tencent.mm.R.id.f482748mx);
        if (com.tencent.mm.sdk.platformtools.m2.n()) {
            this.f209992n = new com.tencent.mm.ui.tools.u1(this);
        } else {
            this.f209992n = new com.tencent.mm.ui.tools.t1(this);
        }
        this.f209987f.setOnScrollBarTouchListener(this.f209992n);
        setBackBtn(new com.tencent.mm.ui.tools.v1(this));
        this.f209985d.setOnItemClickListener(new com.tencent.mm.ui.tools.w1(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.String stringExtra = getIntent().getStringExtra("country_name");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f209989h = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("couttry_code");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.f209990i = stringExtra2;
        java.lang.String stringExtra3 = getIntent().getStringExtra("iso_code");
        this.f209991m = stringExtra3 != null ? stringExtra3 : "";
        this.f209994p = getIntent().getBooleanExtra("CountryCodeUI_isShowCountryCode", true);
        this.f209995q = getIntent().getStringArrayExtra("exclude_countries_iso");
        this.f209996r = getIntent().getStringExtra("ui_title");
        initView();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyUp(i17, keyEvent);
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("country_name", this.f209989h);
        intent.putExtra("couttry_code", this.f209990i);
        intent.putExtra("iso_code", this.f209991m);
        setResult(100, intent);
        finish();
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mm.ui.tools.c9 c9Var = this.f209993o;
        if (c9Var != null) {
            c9Var.b();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(la5.y.class);
    }
}
