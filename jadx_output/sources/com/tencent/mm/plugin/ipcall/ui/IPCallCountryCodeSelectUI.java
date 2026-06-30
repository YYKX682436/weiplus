package com.tencent.mm.plugin.ipcall.ui;

@db5.a(3)
/* loaded from: classes15.dex */
public class IPCallCountryCodeSelectUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f142578d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.ipcall.ui.h1 f142579e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.ipcall.ui.IPCallCountryCodeScrollbar f142580f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f142581g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f142582h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f142583i;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.tools.c9 f142585n;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.LinearLayout f142588q;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f142584m = "";

    /* renamed from: o, reason: collision with root package name */
    public boolean f142586o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f142587p = false;

    public static void T6(com.tencent.mm.plugin.ipcall.ui.IPCallCountryCodeSelectUI iPCallCountryCodeSelectUI) {
        java.lang.String str;
        com.tencent.mm.plugin.ipcall.ui.h1 h1Var = iPCallCountryCodeSelectUI.f142579e;
        if (h1Var == null || (str = iPCallCountryCodeSelectUI.f142584m) == null) {
            return;
        }
        h1Var.f142846g = str.trim();
        java.util.List list = h1Var.f142844e;
        list.clear();
        java.util.ArrayList arrayList = (java.util.ArrayList) h1Var.f142843d;
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            if (((com.tencent.mm.plugin.ipcall.ui.a) arrayList.get(i17)).f142741a.toUpperCase().contains(h1Var.f142846g.toUpperCase()) || ((com.tencent.mm.plugin.ipcall.ui.a) arrayList.get(i17)).f142744d.toUpperCase().contains(h1Var.f142846g.toUpperCase()) || ((com.tencent.mm.plugin.ipcall.ui.a) arrayList.get(i17)).f142742b.contains(h1Var.f142846g)) {
                list.add((com.tencent.mm.plugin.ipcall.ui.a) arrayList.get(i17));
            }
        }
        h1Var.c();
        int size2 = list.size();
        com.tencent.mm.plugin.ipcall.ui.IPCallCountryCodeSelectUI iPCallCountryCodeSelectUI2 = h1Var.f142845f;
        if (size2 == 0) {
            iPCallCountryCodeSelectUI2.f142588q.setVisibility(0);
        } else {
            iPCallCountryCodeSelectUI2.f142588q.setVisibility(8);
        }
        h1Var.notifyDataSetChanged();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(-1, com.tencent.mm.R.anim.f477855dd);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.blo;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.f489935fy);
        com.tencent.mm.ui.tools.c9 c9Var = new com.tencent.mm.ui.tools.c9(true, true);
        this.f142585n = c9Var;
        c9Var.f210324i = new com.tencent.mm.plugin.ipcall.ui.l1(this);
        addSearchMenu(true, c9Var);
        this.f142580f = (com.tencent.mm.plugin.ipcall.ui.IPCallCountryCodeScrollbar) findViewById(com.tencent.mm.R.id.f482748mx);
        java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.ipcall.model.j a17 = com.tencent.mm.plugin.ipcall.model.j.a();
        if (!a17.f142473c) {
            a17.b(false);
        }
        java.util.Iterator it = a17.f142471a.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            int intValue = ((java.lang.Integer) it.next()).intValue();
            if (i17 >= 5) {
                break;
            }
            java.lang.String f17 = t83.c.f(intValue + "");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(f17) && !com.tencent.mm.plugin.ipcall.model.j.a().e(intValue)) {
                ((java.util.ArrayList) this.f142581g).add(new com.tencent.mm.plugin.ipcall.ui.a(f17, intValue + "", 0, "0"));
                i17++;
            }
        }
        if (i17 > 0) {
            this.f142587p = true;
        }
        if (com.tencent.mm.sdk.platformtools.m2.j()) {
            java.util.HashMap hashMap = t83.c.f416412b;
            if (hashMap.size() == 0) {
                t83.c.k();
            }
            for (java.util.Map.Entry entry : hashMap.entrySet()) {
                t83.d dVar = (t83.d) entry.getValue();
                java.lang.String str = dVar.f416419c;
                if (str != null && !"".equals(str.trim())) {
                    char[] charArray = str.toCharArray();
                    java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                    int length = charArray.length;
                    for (int i18 = 0; i18 < length; i18++) {
                        java.lang.String a18 = com.tencent.mm.platformtools.SpellMap.a(charArray[i18]);
                        if (com.tencent.mm.sdk.platformtools.t8.K0(a18)) {
                            stringBuffer.append(charArray[i18]);
                        } else {
                            stringBuffer.append(a18);
                        }
                    }
                    str = stringBuffer.toString();
                }
                java.lang.String upperCase = str.toUpperCase();
                if (com.tencent.mm.sdk.platformtools.t8.K0(upperCase)) {
                    upperCase = " ";
                }
                if (!com.tencent.mm.plugin.ipcall.model.j.a().e(com.tencent.mm.sdk.platformtools.t8.P(dVar.f416418b, 0))) {
                    ((java.util.ArrayList) this.f142581g).add(new com.tencent.mm.plugin.ipcall.ui.a(dVar.f416419c, dVar.f416418b, upperCase.charAt(0), upperCase));
                }
            }
        } else {
            java.util.HashMap hashMap2 = t83.c.f416412b;
            if (hashMap2.size() == 0) {
                t83.c.k();
            }
            for (java.util.Map.Entry entry2 : hashMap2.entrySet()) {
                t83.d dVar2 = (t83.d) entry2.getValue();
                java.lang.String upperCase2 = dVar2.f416419c.toUpperCase();
                if (com.tencent.mm.sdk.platformtools.t8.K0(upperCase2)) {
                    upperCase2 = " ";
                }
                if (!com.tencent.mm.plugin.ipcall.model.j.a().e(com.tencent.mm.sdk.platformtools.t8.P(dVar2.f416418b, 0))) {
                    ((java.util.ArrayList) this.f142581g).add(new com.tencent.mm.plugin.ipcall.ui.a(dVar2.f416419c, dVar2.f416418b, upperCase2.charAt(0), upperCase2));
                }
            }
        }
        java.util.Collections.sort(this.f142581g, new com.tencent.mm.plugin.ipcall.ui.p1(this));
        java.util.Iterator it6 = ((java.util.ArrayList) this.f142581g).iterator();
        while (it6.hasNext()) {
            int a19 = ((com.tencent.mm.plugin.ipcall.ui.a) it6.next()).a();
            if (a19 != 0) {
                java.lang.String valueOf = java.lang.String.valueOf((char) a19);
                com.tencent.mm.plugin.ipcall.ui.IPCallCountryCodeScrollbar iPCallCountryCodeScrollbar = this.f142580f;
                iPCallCountryCodeScrollbar.getClass();
                java.lang.String[] strArr = com.tencent.mm.plugin.ipcall.ui.IPCallCountryCodeScrollbar.f142566r;
                boolean z17 = false;
                for (int i19 = 0; i19 < 26; i19++) {
                    if (strArr[i19].equals(valueOf)) {
                        z17 = true;
                    }
                }
                if (!z17) {
                    valueOf = "#";
                }
                java.lang.String[] strArr2 = iPCallCountryCodeScrollbar.f142569f;
                int length2 = strArr2.length + 1;
                java.lang.String[] strArr3 = new java.lang.String[length2];
                int length3 = strArr2.length;
                int i27 = 0;
                int i28 = 0;
                while (true) {
                    if (i27 >= length3) {
                        strArr3[length2 - 1] = valueOf;
                        iPCallCountryCodeScrollbar.f142569f = strArr3;
                        break;
                    }
                    java.lang.String str2 = strArr2[i27];
                    if (str2.equals(valueOf)) {
                        break;
                    }
                    strArr3[i28] = str2;
                    i28++;
                    i27++;
                }
            }
        }
        java.lang.System.currentTimeMillis();
        this.f142588q = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.f482754n3);
        this.f142578d = (android.widget.ListView) findViewById(com.tencent.mm.R.id.f482735mf);
        com.tencent.mm.plugin.ipcall.ui.h1 h1Var = new com.tencent.mm.plugin.ipcall.ui.h1(this, this.f142581g);
        this.f142579e = h1Var;
        h1Var.f142848i = this.f142586o;
        h1Var.f142849m = this.f142587p;
        this.f142578d.setAdapter((android.widget.ListAdapter) h1Var);
        this.f142578d.setVisibility(0);
        this.f142580f.setOnScrollBarTouchListener(new com.tencent.mm.plugin.ipcall.ui.m1(this));
        setBackBtn(new com.tencent.mm.plugin.ipcall.ui.n1(this));
        this.f142578d.setOnItemClickListener(new com.tencent.mm.plugin.ipcall.ui.o1(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f142581g = new java.util.ArrayList();
        java.lang.String stringExtra = getIntent().getStringExtra("country_name");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f142582h = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("couttry_code");
        this.f142583i = stringExtra2 != null ? stringExtra2 : "";
        this.f142586o = getIntent().getBooleanExtra("CountryCodeUI_isShowCountryCode", false);
        setBackBtn(new com.tencent.mm.plugin.ipcall.ui.k1(this));
        initView();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4) {
            return super.onKeyDown(i17, keyEvent);
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("country_name", this.f142582h);
        intent.putExtra("couttry_code", this.f142583i);
        setResult(100, intent);
        finish();
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mm.ui.tools.c9 c9Var = this.f142585n;
        if (c9Var != null) {
            c9Var.b();
        }
    }
}
