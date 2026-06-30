package com.tencent.mm.plugin.shake.ui;

/* loaded from: classes9.dex */
public class TVInfoUI extends com.tencent.mm.ui.base.preference.MMPreference implements x51.r0, com.tencent.mm.modelbase.u0 {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f162223q = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f162224d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f162225e;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f162227g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f162228h;

    /* renamed from: i, reason: collision with root package name */
    public j34.i f162229i;

    /* renamed from: m, reason: collision with root package name */
    public long f162230m;

    /* renamed from: o, reason: collision with root package name */
    public j34.h f162232o;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f162226f = "";

    /* renamed from: n, reason: collision with root package name */
    public boolean f162231n = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f162233p = false;

    public static void V6(com.tencent.mm.plugin.shake.ui.TVInfoUI tVInfoUI, java.lang.String str) {
        tVInfoUI.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("show_bottom", false);
        intent.putExtra("geta8key_scene", 10);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.D(intent, tVInfoUI);
    }

    @Override // y60.e
    public void K4(java.lang.String str, android.graphics.Bitmap bitmap) {
        if (str == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TVInfoUI", "onUpdateEnable pic, url  is null ");
            return;
        }
        try {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.shake.ui.n1(this, str, bitmap));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TVInfoUI", "onGetPictureFinish : [%s]", e17.getLocalizedMessage());
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TVInfoUI", e17, "", new java.lang.Object[0]);
        }
    }

    public final void W6(j34.i iVar) {
        if (iVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TVInfoUI", "refreshViewByProduct(), pd == null");
            finish();
            return;
        }
        this.f162227g.setText(iVar.field_title);
        if (com.tencent.mm.sdk.platformtools.t8.K0(iVar.field_topic)) {
            this.f162228h.setVisibility(8);
        } else {
            this.f162228h.setText(iVar.field_topic);
        }
        this.f162225e = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.oqz);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(iVar.field_playurl)) {
            android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.oqy);
            imageView.setVisibility(0);
            imageView.setOnClickListener(new com.tencent.mm.plugin.shake.ui.g1(this, iVar));
            this.f162225e.setOnClickListener(new com.tencent.mm.plugin.shake.ui.h1(this, iVar));
        }
        addIconOptionMenu(0, com.tencent.mm.R.raw.icons_outlined_more, new com.tencent.mm.plugin.shake.ui.i1(this));
        if (!com.tencent.mm.sdk.platformtools.t8.K0(iVar.field_id) && !this.f162231n && !getIntent().getBooleanExtra("key_TV_come_from_shake", false)) {
            c01.d9.e().g(new h34.g(iVar.field_id, getIntent().getIntExtra("key_TV_getProductInfoScene", 0)));
            this.f162231n = true;
        }
        this.f162225e.setVisibility(0);
        setBackBtn(new com.tencent.mm.plugin.shake.ui.j1(this));
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.shake.ui.k1(this, iVar));
    }

    public final void X6() {
        this.f162230m = getIntent().getLongExtra("key_TVInfoUI_chatting_msgId", 0L);
        java.lang.String stringExtra = getIntent().getStringExtra("key_TVInfoUI_chatting_talker");
        if (this.f162230m <= 0 || !gm0.j1.a()) {
            return;
        }
        com.tencent.mm.storage.f9 Li = pt0.f0.Li(stringExtra, this.f162230m);
        if (Li.getMsgId() > 0) {
            Li.i1(this.f162232o.k());
            ((com.tencent.mm.storage.g9) c01.d9.b().u()).lb(this.f162230m, Li, true);
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getHeaderResourceId() {
        return com.tencent.mm.R.layout.d2g;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.d2f;
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494966cv;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        byte[] byteArrayExtra;
        setMMTitle(com.tencent.mm.R.string.f492930ib0);
        this.f162224d = getPreferenceScreen();
        this.f162227g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f487475or0);
        this.f162228h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f487476or1);
        java.lang.String stringExtra = getIntent().getStringExtra("key_TV_xml");
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra) && (byteArrayExtra = getIntent().getByteArrayExtra("key_TV_xml_bytes")) != null) {
            stringExtra = new java.lang.String(byteArrayExtra);
        }
        j34.i b17 = j34.j.b(stringExtra);
        this.f162229i = b17;
        if (b17 != null) {
            W6(b17);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.TVInfoUI", "initView(), tv == null");
            finish();
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).getClass();
        x51.w0.a(this);
        initView();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).getClass();
        x51.w0.e(this);
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        c01.d9.e().q(com.tencent.mm.plugin.appbrand.jsapi.share.f0.CTRL_INDEX, this);
        super.onPause();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        java.lang.String str = preference.f197780q;
        j34.i iVar = this.f162229i;
        if (iVar == null || iVar.f297494a == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TVInfoUI", "tv == null || tv.actionlist == null");
            return false;
        }
        try {
            int intValue = java.lang.Integer.valueOf(str).intValue();
            int i17 = intValue / 100;
            int i18 = intValue % 100;
            if (i17 >= 0 && i17 < this.f162229i.f297494a.size()) {
                j34.g gVar = (j34.g) this.f162229i.f297494a.get(i17);
                if (gVar == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.TVInfoUI", "actionList == null");
                    return false;
                }
                if (i18 >= 0 && i18 < gVar.f297491a.size()) {
                    j34.f fVar = (j34.f) gVar.f297491a.get(i18);
                    if (fVar == null) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.TVInfoUI", "action == null");
                        return false;
                    }
                    int i19 = fVar.f297484a;
                    if (i19 == 3) {
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("rawUrl", fVar.f297487d);
                        intent.putExtra("show_bottom", false);
                        intent.putExtra("geta8key_scene", 10);
                        intent.putExtra("srcUsername", fVar.f297490g);
                        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.D(intent, this);
                    } else if (i19 == 4) {
                        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(fVar.f297487d, true);
                        if (n17 != null) {
                            android.content.Intent intent2 = new android.content.Intent();
                            if (n17.r2() && n17.k2()) {
                                r01.q3.cj().b1(fVar.f297487d);
                                if (fVar.f297489f.equals("1")) {
                                    intent2.putExtra("Chat_User", fVar.f297487d);
                                    intent2.putExtra("finish_direct", true);
                                    ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.j(intent2, this);
                                }
                            }
                            intent2.putExtra("Contact_User", fVar.f297487d);
                            intent2.putExtra("force_get_contact", true);
                            j45.l.j(this, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent2, null);
                        }
                    } else if (i19 == 5) {
                        com.tencent.mm.autogen.events.GetA8KeyRedirectEvent getA8KeyRedirectEvent = new com.tencent.mm.autogen.events.GetA8KeyRedirectEvent();
                        am.df dfVar = getA8KeyRedirectEvent.f54376g;
                        dfVar.f6446a = 11;
                        dfVar.f6447b = fVar.f297487d;
                        dfVar.f6448c = new java.lang.ref.WeakReference(this);
                        getA8KeyRedirectEvent.f192364d = null;
                        getA8KeyRedirectEvent.b(android.os.Looper.myLooper());
                    } else if (i19 == 6) {
                        android.content.Intent intent3 = new android.content.Intent();
                        intent3.putExtra("key_product_id", fVar.f297487d);
                        intent3.putExtra("key_product_scene", 9);
                        j45.l.j(this, "product", ".ui.MallProductUI", intent3, null);
                    }
                    return true;
                }
                com.tencent.mars.xlog.Log.w("MicroMsg.TVInfoUI", "index out of bounds, jj=[%s], actions Size=[%s]", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(gVar.f297491a.size()));
                return false;
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.TVInfoUI", "index out of bounds, ii=[%s], list Size=[%s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f162229i.f297494a.size()));
            return false;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TVInfoUI", "onPreferenceTreeClick, [%s]", e17.getMessage());
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TVInfoUI", e17, "", new java.lang.Object[0]);
            return false;
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        c01.d9.e().a(com.tencent.mm.plugin.appbrand.jsapi.share.f0.CTRL_INDEX, this);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.String str2;
        java.lang.String str3;
        com.tencent.mm.protobuf.f fVar;
        if (m1Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TVInfoUI", "scene == null");
            return;
        }
        if (m1Var.getType() == 552) {
            if (i17 != 0 || i18 != 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.TVInfoUI", "onSceneEnd() errType = [%s], errCode = [%s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                dp.a.makeText(this, com.tencent.mm.R.string.f492931ib1, 0).show();
                return;
            }
            if (this.f162229i == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.TVInfoUI", "onSceneEnd tv == null");
                return;
            }
            com.tencent.mm.modelbase.o oVar = ((h34.g) m1Var).f278529e;
            r45.wo3 wo3Var = (oVar == null || (fVar = oVar.f70711b.f70700a) == null) ? null : (r45.wo3) fVar;
            if (wo3Var == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.TVInfoUI", "onSceneEnd tvInfo == null");
                return;
            }
            java.lang.String str4 = wo3Var.f389341e;
            if (str4 != null) {
                j34.i b17 = j34.j.b(str4);
                j34.i iVar = this.f162229i;
                if (iVar == null || (str2 = iVar.field_xml) == null || b17 == null || (str3 = b17.field_xml) == null || str2.equals(str3)) {
                    return;
                }
                this.f162229i = b17;
                W6(b17);
            }
        }
    }
}
