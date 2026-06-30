package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes15.dex */
public class VcardContactUI extends com.tencent.mm.ui.base.preference.MMPreference {

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.ArrayList f159488g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public static int f159489h = 1;

    /* renamed from: i, reason: collision with root package name */
    public static int f159490i = 1;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.scanner.model.t2 f159491d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f159492e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.scanner.ui.r4 f159493f;

    public static void V6(com.tencent.mm.plugin.scanner.ui.VcardContactUI vcardContactUI, android.content.Intent intent) {
        int i17;
        com.tencent.mm.plugin.scanner.model.q2 q2Var;
        vcardContactUI.getClass();
        intent.setFlags(268435456);
        java.lang.String a17 = vcardContactUI.f159491d.f159050a.a();
        if (com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.scanner.VardContactUI", "no contact user name");
        } else {
            intent.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, a17);
        }
        java.util.List list = vcardContactUI.f159491d.f159059j;
        if (list == null || ((java.util.ArrayList) list).size() <= 0) {
            i17 = 1;
        } else {
            i17 = 2;
            vcardContactUI.X6(list, intent, 2, 1);
        }
        java.util.List list2 = vcardContactUI.f159491d.f159060k;
        if (list2 != null && ((java.util.ArrayList) list2).size() > 0) {
            vcardContactUI.X6(list2, intent, 1, i17);
            i17++;
        }
        java.util.List list3 = vcardContactUI.f159491d.f159061l;
        if (list3 != null && ((java.util.ArrayList) list3).size() > 0) {
            vcardContactUI.X6(list3, intent, 3, i17);
            i17++;
        }
        java.util.List list4 = vcardContactUI.f159491d.f159063n;
        if (list4 != null && ((java.util.ArrayList) list4).size() > 0) {
            vcardContactUI.X6(list4, intent, 7, i17);
            i17++;
        }
        java.util.List list5 = vcardContactUI.f159491d.f159062m;
        if (list5 != null && ((java.util.ArrayList) list5).size() > 0) {
            vcardContactUI.X6(list5, intent, 0, i17);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(vcardContactUI.f159491d.f159070u)) {
            intent.putExtra("company", vcardContactUI.f159491d.f159070u);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(vcardContactUI.f159491d.f159068s)) {
            intent.putExtra("notes", vcardContactUI.f159491d.f159068s);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(vcardContactUI.f159491d.f159064o)) {
            intent.putExtra(com.google.android.gms.common.Scopes.EMAIL, vcardContactUI.f159491d.f159064o);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(vcardContactUI.f159491d.f159065p)) {
            intent.putExtra("job_title", vcardContactUI.f159491d.f159065p);
        }
        com.tencent.mm.plugin.scanner.model.t2 t2Var = vcardContactUI.f159491d;
        com.tencent.mm.plugin.scanner.model.q2 q2Var2 = t2Var.f159056g;
        if (q2Var2 == null || q2Var2.a().length() <= 0) {
            com.tencent.mm.plugin.scanner.model.q2 q2Var3 = t2Var.f159057h;
            if (q2Var3 == null || q2Var3.a().length() <= 0) {
                com.tencent.mm.plugin.scanner.model.q2 q2Var4 = t2Var.f159058i;
                if (q2Var4 == null || q2Var4.a().length() <= 0) {
                    com.tencent.mm.plugin.scanner.model.q2 q2Var5 = t2Var.f159055f;
                    q2Var = (q2Var5 == null || q2Var5.a().length() <= 0) ? null : t2Var.f159055f;
                } else {
                    q2Var = t2Var.f159058i;
                }
            } else {
                q2Var = t2Var.f159057h;
            }
        } else {
            q2Var = t2Var.f159056g;
        }
        if (q2Var == null || q2Var.a().length() <= 0) {
            return;
        }
        intent.putExtra("postal", q2Var.a());
    }

    public final void W6(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.ui.base.preference.KeyValuePreference keyValuePreference = new com.tencent.mm.ui.base.preference.KeyValuePreference(this);
        keyValuePreference.L(str2);
        keyValuePreference.G = com.tencent.mm.R.layout.byv;
        keyValuePreference.O(false);
        keyValuePreference.H(str);
        keyValuePreference.P = false;
        keyValuePreference.T = true;
        keyValuePreference.V = 49;
        ((com.tencent.mm.ui.base.preference.h0) this.f159492e).d(keyValuePreference, f159490i);
    }

    public final void X6(java.util.List list, android.content.Intent intent, int i17, int i18) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (i18 == 1) {
                intent.putExtra("phone", str);
                intent.putExtra("phone_type", i17);
            } else if (i18 == 2) {
                intent.putExtra("secondary_phone", str);
                intent.putExtra("phone_type", i17);
            } else if (i18 == 3) {
                intent.putExtra("tertiary_phone", str);
                intent.putExtra("phone_type", i17);
            }
        }
    }

    public final void Y6(java.util.List list, java.lang.String str, java.lang.String str2) {
        if (list == null || list.size() <= 0) {
            return;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str3 = (java.lang.String) it.next();
            com.tencent.mm.plugin.scanner.ui.VcardContactLinkPreference vcardContactLinkPreference = new com.tencent.mm.plugin.scanner.ui.VcardContactLinkPreference(this);
            vcardContactLinkPreference.C(str + java.lang.String.valueOf(str3));
            java.util.ArrayList arrayList = f159488g;
            if (!arrayList.contains(str + java.lang.String.valueOf(str3))) {
                arrayList.add(str + java.lang.String.valueOf(str3));
            }
            vcardContactLinkPreference.L(str2);
            vcardContactLinkPreference.G = com.tencent.mm.R.layout.byv;
            vcardContactLinkPreference.H(str3);
            vcardContactLinkPreference.O(false);
            vcardContactLinkPreference.P = true;
            vcardContactLinkPreference.T = true;
            vcardContactLinkPreference.V = 49;
            ((com.tencent.mm.ui.base.preference.h0) this.f159492e).d(vcardContactLinkPreference, f159489h);
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        com.tencent.mm.plugin.scanner.model.t2 t2Var;
        this.f159493f = new com.tencent.mm.plugin.scanner.ui.r4(this);
        this.f159492e = getPreferenceScreen();
        this.f159491d = com.tencent.mm.plugin.scanner.model.t2.f159049v;
        setBackBtn(new com.tencent.mm.plugin.scanner.ui.n4(this));
        setMMTitle("");
        ((com.tencent.mm.ui.base.preference.h0) this.f159492e).t();
        ((com.tencent.mm.ui.base.preference.h0) this.f159492e).g(com.tencent.mm.R.xml.f494967cw);
        com.tencent.mm.plugin.scanner.ui.VcardContactUserHeaderPreference vcardContactUserHeaderPreference = (com.tencent.mm.plugin.scanner.ui.VcardContactUserHeaderPreference) ((com.tencent.mm.ui.base.preference.h0) this.f159492e).h("v_contact_info_header");
        if (vcardContactUserHeaderPreference != null && (t2Var = this.f159491d) != null) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(t2Var.f159050a.a())) {
                vcardContactUserHeaderPreference.P = t2Var.f159050a.a();
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(t2Var.f159051b)) {
                vcardContactUserHeaderPreference.Q = t2Var.f159051b;
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(t2Var.f159066q)) {
                vcardContactUserHeaderPreference.R = t2Var.f159066q;
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(t2Var.f159065p)) {
                vcardContactUserHeaderPreference.S = t2Var.f159065p;
            }
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f159492e).w("c_contact_info_wx_id");
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f159491d.f159052c)) {
            ((com.tencent.mm.ui.base.preference.h0) this.f159492e).w("v_contact_info_photo_uri");
            ((com.tencent.mm.ui.base.preference.h0) this.f159492e).w("v_category_photo_uri");
        } else {
            com.tencent.mm.plugin.scanner.ui.VcardContactLinkPreference vcardContactLinkPreference = (com.tencent.mm.plugin.scanner.ui.VcardContactLinkPreference) ((com.tencent.mm.ui.base.preference.h0) this.f159492e).h("v_contact_info_photo_uri");
            if (vcardContactLinkPreference != null) {
                vcardContactLinkPreference.H(this.f159491d.f159052c);
                vcardContactLinkPreference.O(false);
                vcardContactLinkPreference.P = false;
                f159489h += 2;
                f159490i += 2;
            }
        }
        com.tencent.mm.plugin.scanner.model.q2 q2Var = this.f159491d.f159057h;
        if (q2Var != null && q2Var.a().length() > 0) {
            W6(q2Var.a(), getContext().getString(com.tencent.mm.R.string.k5h));
        }
        com.tencent.mm.plugin.scanner.model.q2 q2Var2 = this.f159491d.f159058i;
        if (q2Var2 != null && q2Var2.a().length() > 0) {
            W6(q2Var2.a(), getContext().getString(com.tencent.mm.R.string.k5u));
        }
        com.tencent.mm.plugin.scanner.model.q2 q2Var3 = this.f159491d.f159055f;
        if (q2Var3 != null && q2Var3.a().length() > 0) {
            W6(q2Var3.a(), getContext().getString(com.tencent.mm.R.string.k5c));
        }
        com.tencent.mm.plugin.scanner.model.q2 q2Var4 = this.f159491d.f159056g;
        if (q2Var4 != null && q2Var4.a().length() > 0) {
            W6(q2Var4.a(), getContext().getString(com.tencent.mm.R.string.k5c));
        }
        java.util.List list = this.f159491d.f159061l;
        if (list != null && ((java.util.ArrayList) list).size() > 0) {
            Y6(list, "WorkTel", getContext().getString(com.tencent.mm.R.string.k5v));
        }
        java.util.List list2 = this.f159491d.f159060k;
        if (list2 != null && ((java.util.ArrayList) list2).size() > 0) {
            Y6(list2, "HomeTel", getContext().getString(com.tencent.mm.R.string.k5j));
        }
        java.util.List list3 = this.f159491d.f159062m;
        if (list3 != null && ((java.util.ArrayList) list3).size() > 0) {
            Y6(list3, "VideoTEL", getContext().getString(com.tencent.mm.R.string.k5s));
        }
        java.util.List list4 = this.f159491d.f159063n;
        if (list4 != null && ((java.util.ArrayList) list4).size() > 0) {
            Y6(list4, "NormalTel", getContext().getString(com.tencent.mm.R.string.k5m));
        }
        java.util.List list5 = this.f159491d.f159059j;
        if (list5 != null && ((java.util.ArrayList) list5).size() > 0) {
            Y6(list5, "CellTel", getContext().getString(com.tencent.mm.R.string.k5f));
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f159491d.f159070u)) {
            ((com.tencent.mm.ui.base.preference.h0) this.f159492e).w("v_contact_info_org");
        } else {
            com.tencent.mm.ui.base.preference.KeyValuePreference keyValuePreference = (com.tencent.mm.ui.base.preference.KeyValuePreference) ((com.tencent.mm.ui.base.preference.h0) this.f159492e).h("v_contact_info_org");
            if (keyValuePreference != null) {
                keyValuePreference.H(this.f159491d.f159070u);
                keyValuePreference.O(false);
                keyValuePreference.P = true;
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f159491d.f159067r)) {
            ((com.tencent.mm.ui.base.preference.h0) this.f159492e).w("v_contact_info_agent");
        } else {
            com.tencent.mm.ui.base.preference.KeyValuePreference keyValuePreference2 = (com.tencent.mm.ui.base.preference.KeyValuePreference) ((com.tencent.mm.ui.base.preference.h0) this.f159492e).h("v_contact_info_agent");
            if (keyValuePreference2 != null) {
                keyValuePreference2.H(this.f159491d.f159067r);
                keyValuePreference2.O(false);
                keyValuePreference2.P = true;
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f159491d.f159069t)) {
            ((com.tencent.mm.ui.base.preference.h0) this.f159492e).w("v_contact_info_home_page");
            ((com.tencent.mm.ui.base.preference.h0) this.f159492e).w("v_category_home_page");
        } else {
            com.tencent.mm.plugin.scanner.ui.VcardContactLinkPreference vcardContactLinkPreference2 = (com.tencent.mm.plugin.scanner.ui.VcardContactLinkPreference) ((com.tencent.mm.ui.base.preference.h0) this.f159492e).h("v_contact_info_home_page");
            if (vcardContactLinkPreference2 != null) {
                vcardContactLinkPreference2.H(this.f159491d.f159069t);
                vcardContactLinkPreference2.O(false);
                vcardContactLinkPreference2.P = true;
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f159491d.f159064o)) {
            ((com.tencent.mm.ui.base.preference.h0) this.f159492e).w("v_contact_info_email");
        } else {
            com.tencent.mm.plugin.scanner.ui.VcardContactLinkPreference vcardContactLinkPreference3 = (com.tencent.mm.plugin.scanner.ui.VcardContactLinkPreference) ((com.tencent.mm.ui.base.preference.h0) this.f159492e).h("v_contact_info_email");
            if (vcardContactLinkPreference3 != null) {
                vcardContactLinkPreference3.H(this.f159491d.f159064o);
                vcardContactLinkPreference3.O(false);
                vcardContactLinkPreference3.P = true;
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f159491d.f159054e)) {
            ((com.tencent.mm.ui.base.preference.h0) this.f159492e).w("v_contact_info_birthday");
            ((com.tencent.mm.ui.base.preference.h0) this.f159492e).w("v_category_birthday");
        } else {
            com.tencent.mm.ui.base.preference.KeyValuePreference keyValuePreference3 = (com.tencent.mm.ui.base.preference.KeyValuePreference) ((com.tencent.mm.ui.base.preference.h0) this.f159492e).h("v_contact_info_birthday");
            if (keyValuePreference3 != null) {
                keyValuePreference3.H(this.f159491d.f159054e);
                keyValuePreference3.O(false);
                keyValuePreference3.P = true;
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f159491d.f159068s)) {
            ((com.tencent.mm.ui.base.preference.h0) this.f159492e).w("v_contact_info_remark");
            ((com.tencent.mm.ui.base.preference.h0) this.f159492e).w("v_category_remark");
        } else {
            com.tencent.mm.ui.base.preference.KeyValuePreference keyValuePreference4 = (com.tencent.mm.ui.base.preference.KeyValuePreference) ((com.tencent.mm.ui.base.preference.h0) this.f159492e).h("v_contact_info_remark");
            if (keyValuePreference4 != null) {
                keyValuePreference4.H(this.f159491d.f159068s);
                keyValuePreference4.O(false);
                keyValuePreference4.P = true;
            }
        }
        com.tencent.mm.plugin.scanner.model.s2 s2Var = this.f159491d.f159053d;
        if (s2Var == null || !s2Var.f159043a.contains("uri")) {
            ((com.tencent.mm.ui.base.preference.h0) this.f159492e).w("v_contact_info_logo");
            ((com.tencent.mm.ui.base.preference.h0) this.f159492e).w("v_category_logo");
        } else {
            com.tencent.mm.plugin.scanner.ui.VcardContactLinkPreference vcardContactLinkPreference4 = (com.tencent.mm.plugin.scanner.ui.VcardContactLinkPreference) ((com.tencent.mm.ui.base.preference.h0) this.f159492e).h("v_contact_info_logo");
            vcardContactLinkPreference4.H(this.f159491d.f159053d.f159044b);
            vcardContactLinkPreference4.P = false;
            vcardContactLinkPreference4.O(false);
        }
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        if (preference.f197780q.equals("add_vcard_contact")) {
            db5.e1.e(this, "", new java.lang.String[]{getString(com.tencent.mm.R.string.k5b), getString(com.tencent.mm.R.string.k5a)}, "", new com.tencent.mm.plugin.scanner.ui.o4(this));
            return true;
        }
        if (preference.f197780q.equals("v_contact_info_photo_uri") || preference.f197780q.equals("v_contact_info_home_page") || preference.f197780q.equals("v_contact_info_logo")) {
            java.lang.String charSequence = preference.n().toString();
            if (charSequence != null && charSequence.length() > 0 && android.webkit.URLUtil.isNetworkUrl(charSequence)) {
                com.tencent.mm.plugin.scanner.ui.r4 r4Var = this.f159493f;
                com.tencent.mm.sdk.platformtools.b4 b4Var = r4Var.f159627h;
                if (!b4Var.e()) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.scanner.ViewMMURL", "already running, skipped");
                } else if (charSequence.length() == 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.scanner.ViewMMURL", "go fail, qqNum is null");
                } else {
                    r4Var.f159624e = charSequence;
                    java.lang.String str = (java.lang.String) gm0.j1.u().c().l(46, null);
                    if (str == null || str.length() == 0) {
                        r4Var.a(charSequence, o45.cg.a(), new byte[0]);
                    } else {
                        gm0.j1.d().a(com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_API_RESPONSE_ERROR, r4Var);
                        r4Var.f159625f = ((v60.u) ((w60.j) i95.n0.c(w60.j.class))).Ai(charSequence, null, 4, 0, o45.cg.a(), new byte[0]);
                        gm0.j1.d().g((com.tencent.mm.modelbase.m1) r4Var.f159625f);
                        b4Var.c(3000L, 3000L);
                    }
                }
                return true;
            }
        } else if (f159488g.contains(preference.f197780q) && !preference.f197780q.toLowerCase().contains("fax")) {
            java.lang.String trim = preference.n().toString().trim();
            if (trim != null && trim.length() > 0) {
                db5.e1.e(this, "", new java.lang.String[]{getString(com.tencent.mm.R.string.bd7)}, "", new com.tencent.mm.plugin.scanner.ui.l4(this, trim));
                return true;
            }
        } else if (preference.f197780q.equals("v_contact_info_email")) {
            db5.e1.e(this, "", new java.lang.String[]{getContext().getString(com.tencent.mm.R.string.ihw), getContext().getString(com.tencent.mm.R.string.ihv)}, "", new com.tencent.mm.plugin.scanner.ui.m4(this, preference.n().toString()));
        }
        return false;
    }
}
