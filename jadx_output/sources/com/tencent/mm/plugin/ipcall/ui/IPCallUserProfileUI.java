package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes8.dex */
public class IPCallUserProfileUI extends com.tencent.mm.ui.MMActivity {
    public static final /* synthetic */ int B = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f142721d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f142722e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f142723f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f142724g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f142725h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f142726i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f142727m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f142728n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f142729o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f142730p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.Button f142731q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f142732r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f142733s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f142734t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f142735u;

    /* renamed from: v, reason: collision with root package name */
    public android.graphics.Bitmap f142736v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f142737w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f142738x = false;

    /* renamed from: y, reason: collision with root package name */
    public android.database.Cursor f142739y = null;

    /* renamed from: z, reason: collision with root package name */
    public boolean f142740z = false;
    public final q83.d A = new q83.d();

    public static void T6(com.tencent.mm.plugin.ipcall.ui.IPCallUserProfileUI iPCallUserProfileUI, java.lang.String str) {
        iPCallUserProfileUI.getClass();
        if (t83.f.c(iPCallUserProfileUI)) {
            android.content.Intent intent = new android.content.Intent(iPCallUserProfileUI, (java.lang.Class<?>) com.tencent.mm.plugin.ipcall.ui.IPCallDialUI.class);
            if (iPCallUserProfileUI.f142740z) {
                intent.putExtra("IPCallTalkUI_dialScene", 4);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12059, 0, 0, 0, 0, 4);
            } else {
                intent.putExtra("IPCallTalkUI_dialScene", 2);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12059, 0, 0, 0, 0, 2);
            }
            intent.putExtra("IPCallTalkUI_contactId", iPCallUserProfileUI.f142734t);
            intent.putExtra("IPCallTalkUI_nickname", iPCallUserProfileUI.f142732r);
            intent.putExtra("IPCallTalkUI_phoneNumber", t83.f.i(str));
            intent.putExtra("IPCallTalkUI_toWechatUsername", iPCallUserProfileUI.f142733s);
            iPCallUserProfileUI.startActivityForResult(intent, 1001);
            iPCallUserProfileUI.f142737w = true;
        }
    }

    public final void U6() {
        android.view.View inflate = android.view.LayoutInflater.from(this).inflate(com.tencent.mm.R.layout.cb8, (android.view.ViewGroup) this.f142725h, false);
        this.f142725h.addView(inflate);
        inflate.setOnClickListener(new com.tencent.mm.plugin.ipcall.ui.m5(this));
    }

    public final void V6(java.lang.String str, int i17, boolean z17) {
        android.view.View inflate = android.view.LayoutInflater.from(this).inflate(com.tencent.mm.R.layout.f489370cb5, (android.view.ViewGroup) this.f142724g, false);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.i3j);
        if (z17) {
            linearLayout.setBackgroundDrawable(getResources().getDrawable(com.tencent.mm.R.drawable.bfj));
        } else {
            linearLayout.setBackgroundDrawable(null);
        }
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f486301kv0);
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.kuz);
        textView2.setText(t83.c.c(t83.f.i(str)));
        textView.setText(t83.c.n(i17));
        inflate.setClickable(true);
        inflate.setOnClickListener(new com.tencent.mm.plugin.ipcall.ui.o5(this, str));
        inflate.setOnLongClickListener(new com.tencent.mm.plugin.ipcall.ui.p5(this, textView2));
        this.f142724g.addView(inflate);
    }

    public final void W6(s83.l lVar, boolean z17, int i17) {
        if (lVar != null) {
            android.view.View inflate = android.view.LayoutInflater.from(this).inflate(com.tencent.mm.R.layout.cb7, (android.view.ViewGroup) this.f142725h, false);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.l_z);
            android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f486456la1);
            android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f486457la2);
            textView2.setText(t83.c.c(lVar.field_phonenumber));
            long j17 = lVar.field_duration;
            if (j17 > 0) {
                textView3.setText(t83.f.a(j17));
            } else {
                textView3.setText(t83.f.h(lVar.field_status));
            }
            textView.setText(t83.f.b(lVar.field_calltime));
            if (z17) {
                inflate.setBackgroundDrawable(getResources().getDrawable(com.tencent.mm.R.drawable.av9));
                int dimensionPixelSize = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480583a81);
                inflate.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
            }
            if (1 == i17) {
                android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) inflate.getLayoutParams();
                layoutParams.height = i65.a.h(getContext(), com.tencent.mm.R.dimen.a7b);
                inflate.setLayoutParams(layoutParams);
            }
            this.f142725h.addView(inflate);
        }
    }

    public final void X6() {
        android.database.Cursor E;
        s83.c D0;
        if (!this.f142740z) {
            this.f142725h.setVisibility(8);
            this.f142729o.setVisibility(8);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f142734t)) {
            E = com.tencent.mm.plugin.ipcall.model.r.Vi().f404888d.E("IPCallRecord", s83.m.f404887f, "phonenumber=?", new java.lang.String[]{this.f142735u}, null, null, "calltime desc limit 4");
        } else {
            java.lang.String str = this.f142734t;
            E = null;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && (D0 = com.tencent.mm.plugin.ipcall.model.r.wi().D0(str)) != null) {
                long j17 = D0.systemRowid;
                if (j17 != -1) {
                    E = com.tencent.mm.plugin.ipcall.model.r.Vi().f404888d.E("IPCallRecord", s83.m.f404887f, "addressId=?", new java.lang.String[]{j17 + ""}, null, null, "calltime desc limit 4");
                }
            }
        }
        if (E == null || E.getCount() <= 0) {
            this.f142725h.setVisibility(8);
            this.f142729o.setVisibility(8);
            return;
        }
        try {
            try {
                if (E.moveToFirst()) {
                    int i17 = 0;
                    while (!E.isAfterLast()) {
                        s83.l lVar = new s83.l();
                        lVar.convertFrom(E);
                        i17++;
                        boolean z17 = i17 >= 3;
                        W6(lVar, z17, E.getCount());
                        if (z17) {
                            break;
                        } else {
                            E.moveToNext();
                        }
                    }
                    if (i17 <= 0) {
                        this.f142725h.setVisibility(8);
                    } else if (E.getCount() >= 4) {
                        U6();
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.IPCallUserProfileUI", "initRecordList, error: %s", e17.getMessage());
            }
        } finally {
            E.close();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.blu;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12061, 0, 1, 0, 0, 0, 0);
        setBackBtn(new com.tencent.mm.plugin.ipcall.ui.n5(this));
        setMMTitle(com.tencent.mm.R.string.g49);
        this.f142721d = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.a_4);
        this.f142722e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.nun);
        this.f142723f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.pju);
        this.f142724g = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.l_f);
        this.f142726i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.l_d);
        this.f142728n = (android.widget.TextView) findViewById(com.tencent.mm.R.id.l_c);
        this.f142727m = (android.widget.TextView) findViewById(com.tencent.mm.R.id.l_b);
        this.f142725h = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.f486455la0);
        this.f142729o = (android.widget.TextView) findViewById(com.tencent.mm.R.id.lpt);
        this.f142730p = (android.widget.TextView) findViewById(com.tencent.mm.R.id.hez);
        this.f142731q = (android.widget.Button) findViewById(com.tencent.mm.R.id.f486451l94);
        this.f142734t = getIntent().getStringExtra("IPCallProfileUI_contactid");
        this.f142732r = getIntent().getStringExtra("IPCallProfileUI_systemUsername");
        this.f142733s = getIntent().getStringExtra("IPCallProfileUI_wechatUsername");
        this.f142735u = getIntent().getStringExtra("IPCallProfileUI_phonenumber");
        this.f142740z = getIntent().getBooleanExtra("IPCallProfileUI_isNeedShowRecord", false);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f142734t)) {
            android.graphics.Bitmap d17 = t83.c.d(this, this.f142734t, false);
            this.f142736v = d17;
            if (d17 != null) {
                this.f142721d.setImageBitmap(d17);
            }
        }
        if (this.f142736v == null && !com.tencent.mm.sdk.platformtools.t8.K0(this.f142733s)) {
            kv.c0 c0Var = (kv.c0) i95.n0.c(kv.c0.class);
            java.lang.String str = this.f142733s;
            ((com.tencent.mm.feature.avatar.w) c0Var).getClass();
            android.graphics.Bitmap a17 = com.tencent.mm.modelavatar.g.a(str);
            this.f142736v = a17;
            if (a17 != null) {
                this.f142721d.setImageBitmap(a17);
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f142732r)) {
            this.f142722e.setText(this.f142732r);
        } else if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f142735u)) {
            this.f142722e.setText(t83.c.c(this.f142735u));
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f142733s) || this.f142733s.endsWith("@stranger")) {
            this.f142723f.setVisibility(8);
        } else {
            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String str2 = this.f142733s;
            ((sg3.a) v0Var).getClass();
            java.lang.String string = getString(com.tencent.mm.R.string.g4_, c01.a2.e(str2));
            android.widget.TextView textView = this.f142723f;
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(this, string));
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f142734t)) {
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
            if (!j35.u.d(this, "android.permission.READ_CONTACTS", true)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.IPCallUserProfileUI", "no contact permission");
                return;
            } else {
                android.database.Cursor query = getContentResolver().query(android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, "contact_id=?", new java.lang.String[]{this.f142734t}, null);
                this.f142739y = query;
                this.f142738x = query.getCount() <= 1;
            }
        }
        X6();
        this.f142728n.setVisibility(8);
        this.f142727m.setVisibility(8);
        this.f142726i.setVisibility(8);
        this.f142731q.setVisibility(8);
        this.f142730p.setVisibility(8);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f142733s) && !com.tencent.mm.sdk.platformtools.t8.K0(this.f142732r)) {
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(this.f142733s, true);
            if (n17 != null && !n17.r2()) {
                this.f142731q.setOnClickListener(new com.tencent.mm.plugin.ipcall.ui.u5(this));
                this.f142731q.setText(com.tencent.mm.R.string.f492341g44);
                this.f142731q.setVisibility(0);
            }
        } else if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f142734t) && !com.tencent.mm.sdk.platformtools.t8.K0(this.f142732r)) {
            this.f142731q.setOnClickListener(new com.tencent.mm.plugin.ipcall.ui.v5(this));
            this.f142731q.setText(com.tencent.mm.R.string.g47);
        } else if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f142735u)) {
            this.f142727m.setVisibility(0);
            this.f142728n.setVisibility(0);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            android.content.Intent intent = new android.content.Intent("android.intent.action.INSERT");
            intent.setType("vnd.android.cursor.dir/contact");
            intent.putExtra("phone", "10086");
            if (com.tencent.mm.sdk.platformtools.t8.I0(context, intent, false, false)) {
                this.f142726i.setVisibility(0);
            }
            this.f142726i.setOnClickListener(new com.tencent.mm.plugin.ipcall.ui.w5(this));
            this.f142727m.setOnClickListener(new com.tencent.mm.plugin.ipcall.ui.x5(this));
            this.f142728n.setOnClickListener(new com.tencent.mm.plugin.ipcall.ui.l5(this));
            this.f142731q.setOnClickListener(new com.tencent.mm.plugin.ipcall.ui.v5(this));
            this.f142731q.setText(com.tencent.mm.R.string.g47);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor cursor = this.f142739y;
        if (cursor == null || cursor.getCount() <= 0) {
            this.f142724g.setVisibility(8);
            return;
        }
        try {
            try {
                if (this.f142739y.moveToFirst()) {
                    int i17 = 0;
                    while (!this.f142739y.isAfterLast()) {
                        i17++;
                        android.database.Cursor cursor2 = this.f142739y;
                        java.lang.String string2 = cursor2.getString(cursor2.getColumnIndex("data1"));
                        android.database.Cursor cursor3 = this.f142739y;
                        int i18 = cursor3.getInt(cursor3.getColumnIndex("data2"));
                        if (!arrayList.contains(string2)) {
                            arrayList.add(string2);
                            if (i17 == this.f142739y.getCount()) {
                                V6(string2, i18, false);
                            } else {
                                V6(string2, i18, true);
                            }
                        }
                        this.f142739y.moveToNext();
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.IPCallUserProfileUI", "initPhoneNumberList error: %s", e17.getMessage());
            }
        } finally {
            this.f142739y.close();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f142737w) {
            this.f142737w = false;
            this.f142725h.removeAllViews();
            X6();
        }
    }
}
