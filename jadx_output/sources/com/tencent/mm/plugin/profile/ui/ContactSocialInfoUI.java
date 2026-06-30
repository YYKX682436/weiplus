package com.tencent.mm.plugin.profile.ui;

/* loaded from: classes11.dex */
public class ContactSocialInfoUI extends com.tencent.mm.ui.base.preference.MMPreference {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f153713s = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f153714d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.storage.z3 f153715e;

    /* renamed from: f, reason: collision with root package name */
    public r61.a f153716f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f153717g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f153718h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f153719i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f153720m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f153721n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f153722o;

    /* renamed from: p, reason: collision with root package name */
    public org.json.JSONObject f153723p;

    /* renamed from: q, reason: collision with root package name */
    public long f153724q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f153725r;

    public final void V6(java.lang.String str) {
        android.content.Intent intent = new android.content.Intent("android.intent.action.DIAL");
        intent.setFlags(268435456);
        intent.setData(android.net.Uri.parse("tel:" + str));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/ContactSocialInfoUI", "dial", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/profile/ui/ContactSocialInfoUI", "dial", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void W6() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", this.f153723p.optString("ShopUrl"));
        intent.putExtra("geta8key_username", c01.z1.r());
        j45.l.j(getContext(), "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, null);
    }

    public final boolean X6(java.lang.String str, android.graphics.Bitmap bitmap) {
        if (bitmap == null) {
            return false;
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return r61.q0.j(str, getContext(), byteArrayOutputStream.toByteArray());
    }

    public final void Y6(java.lang.String str, java.lang.String str2, boolean z17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2) || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            ((com.tencent.mm.ui.base.preference.h0) this.f153714d).w(str);
            return;
        }
        com.tencent.mm.ui.base.preference.KeyValuePreference keyValuePreference = (com.tencent.mm.ui.base.preference.KeyValuePreference) ((com.tencent.mm.ui.base.preference.h0) this.f153714d).h(str);
        if (keyValuePreference != null) {
            keyValuePreference.U = true;
            keyValuePreference.W = 5;
            if (z17) {
                keyValuePreference.f197788y = getResources().getColor(com.tencent.mm.R.color.f479308vo);
            }
            keyValuePreference.H(str2);
            keyValuePreference.O(false);
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494866aa;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        java.lang.String str;
        setMMTitle(com.tencent.mm.R.string.bhk);
        setBackBtn(new hr3.u5(this));
        this.f153714d = getPreferenceScreen();
        java.lang.String stringExtra = getIntent().getStringExtra("Contact_Mobile_MD5");
        java.lang.String stringExtra2 = getIntent().getStringExtra("Contact_full_Mobile_MD5");
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra) && com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f153715e.d1())) {
                this.f153716f = m61.k.wi().h(this.f153725r);
            } else {
                this.f153716f = m61.k.wi().h(this.f153715e.d1());
            }
        } else if ((stringExtra != null && stringExtra.length() > 0) || (stringExtra2 != null && stringExtra2.length() > 0)) {
            r61.a i17 = m61.k.wi().i(stringExtra);
            this.f153716f = i17;
            if (i17 == null || i17.e() == null || this.f153716f.e().length() <= 0) {
                r61.a i18 = m61.k.wi().i(stringExtra2);
                this.f153716f = i18;
                if (i18 != null && i18.e() != null) {
                    this.f153716f.e().getClass();
                }
            }
        }
        r61.a aVar = this.f153716f;
        if (aVar == null || aVar.e() == null || this.f153716f.e().length() <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ContactSocialInfoUI", "error : this is not the mobile contact, MD5 = null");
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.String h17 = this.f153716f.h();
            if (h17 == null) {
                h17 = "";
            }
            sb6.append(h17);
            sb6.append(" ");
            java.lang.String f17 = this.f153716f.f();
            if (f17 == null) {
                f17 = "";
            }
            sb6.append(f17.replace(" ", ""));
            this.f153717g = sb6.toString();
        }
        Y6("contact_info_social_mobile", this.f153717g, true);
        int q17 = com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) c01.d9.b().p().l(9, null));
        this.f153724q = getIntent().getLongExtra("Contact_Uin", 0L);
        java.lang.String stringExtra3 = getIntent().getStringExtra("Contact_QQNick");
        this.f153718h = stringExtra3;
        if (this.f153724q != 0 && q17 != 0) {
            if (stringExtra3 == null || stringExtra3.length() == 0) {
                r61.w1 g17 = m61.k.Ri().g(this.f153724q);
                if (g17 == null) {
                    g17 = null;
                }
                if (g17 != null) {
                    this.f153718h = g17.c();
                }
            }
            java.lang.String str2 = this.f153718h;
            if (str2 == null) {
                str2 = "";
            }
            this.f153719i = str2;
            this.f153719i += " " + new kk.v(this.f153724q).longValue();
        }
        Y6("contact_info_social_qq", this.f153719i, true);
        java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("LinkedinPluginClose");
        if (!(com.tencent.mm.sdk.platformtools.t8.K0(d17) || com.tencent.mm.sdk.platformtools.t8.P(d17, 0) == 0) || com.tencent.mm.sdk.platformtools.t8.K0(this.f153715e.A1)) {
            this.f153720m = "";
        } else {
            this.f153720m = this.f153715e.B1;
        }
        Y6("contact_info_social_linkedin", this.f153720m, true);
        Y6("contact_info_social_facebook", null, false);
        java.lang.String stringExtra4 = getIntent().getStringExtra("verify_gmail");
        if (stringExtra4 == null) {
            stringExtra4 = "";
        }
        this.f153722o = stringExtra4;
        java.lang.String stringExtra5 = getIntent().getStringExtra("profileName");
        java.lang.String Q1 = com.tencent.mm.sdk.platformtools.t8.Q1(this.f153722o);
        if (stringExtra5 == null) {
            stringExtra5 = Q1;
        }
        this.f153721n = stringExtra5;
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f153722o) || com.tencent.mm.sdk.platformtools.t8.K0(this.f153721n)) {
            Y6("contact_info_social_googlecontacts", "", false);
        } else {
            Y6("contact_info_social_googlecontacts", this.f153721n + '\n' + this.f153722o, false);
        }
        if (c01.z1.r().equals(this.f153715e.d1())) {
            str = (java.lang.String) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_PROFILE_WEIDIANINFO_STRING, null);
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactSocialInfoUI", "in self social info page, weishop info:%s", str);
        } else {
            str = this.f153715e.D1;
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactSocialInfoUI", "weiShopInfo:%s", str);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            try {
                this.f153723p = new org.json.JSONObject(str);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ContactSocialInfoUI", e17, "", new java.lang.Object[0]);
                this.f153723p = null;
            }
        }
        org.json.JSONObject jSONObject = this.f153723p;
        if (jSONObject != null) {
            Y6("contact_info_social_weishop", jSONObject.optString("ShopName"), true);
        } else {
            Y6("contact_info_social_weishop", "", false);
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.String stringExtra = getIntent().getStringExtra("Contact_User");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f153725r = stringExtra;
        this.f153715e = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(this.f153725r, true);
        initView();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        int lastIndexOf;
        java.lang.String str = preference.f197780q;
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactSocialInfoUI", str + " item has been clicked!");
        if (str.equals("contact_info_social_mobile")) {
            if (this.f153716f == null || this.f153715e == null) {
                return false;
            }
            if (((com.tencent.mm.storage.k4) c01.d9.b().q()).h(this.f153716f.i())) {
                r61.a aVar = this.f153716f;
                java.lang.String[] stringArray = (aVar == null || com.tencent.mm.sdk.platformtools.t8.K0(aVar.f392800p)) ? getResources().getStringArray(com.tencent.mm.R.array.f478017a4) : getResources().getStringArray(com.tencent.mm.R.array.f478016a3);
                ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi().getClass();
                db5.e1.e(this, null, stringArray, null, new hr3.v5(this, stringArray));
                return false;
            }
            java.lang.String str2 = this.f153717g;
            if (str2 == null || str2.length() == 0 || (lastIndexOf = this.f153717g.lastIndexOf(32) + 1) <= 0) {
                return false;
            }
            V6(this.f153717g.substring(lastIndexOf));
            return false;
        }
        if (str.equals("contact_info_social_qq")) {
            return false;
        }
        if (str.equals("contact_info_social_linkedin")) {
            java.lang.String str3 = this.f153715e.C1;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ContactSocialInfoUI", "this liurl is null!");
                return false;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", str3);
            intent.putExtra("geta8key_username", c01.z1.r());
            j45.l.j(this, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, null);
            return false;
        }
        if (str.equals("contact_info_social_facebook") || str.equals("contact_info_social_googlecontacts") || !str.equals("contact_info_social_weishop") || this.f153723p == null) {
            return false;
        }
        if (c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_PROFILE_WEIDIANINFO_ALERT_INT, null) == null) {
            db5.e1.n(this, com.tencent.mm.R.string.bhm, com.tencent.mm.R.string.f490573yv, new hr3.x5(this), null);
            return false;
        }
        W6();
        return false;
    }
}
