package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes8.dex */
public class j5 extends com.tencent.mm.plugin.lite.api.p {
    public final void A(android.content.Context context, boolean z17, android.content.Intent intent) {
        if (!z17 || !(context instanceof androidx.fragment.app.FragmentActivity)) {
            j45.l.j(context, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, z2.j.a(context, com.tencent.mm.R.anim.f477812c6, com.tencent.mm.R.anim.f477728p).toBundle());
            return;
        }
        androidx.fragment.app.FragmentActivity fragmentActivity = (androidx.fragment.app.FragmentActivity) context;
        androidx.fragment.app.DialogFragment wi6 = ((vw.o) ((rv.a3) i95.n0.c(rv.a3.class))).wi(fragmentActivity, intent, null, 0, false);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).D2(wi6);
        wi6.show(fragmentActivity.getSupportFragmentManager(), "BizContactInfoDialogFragment");
    }

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject == null) {
            this.f143443f.a("data is null");
            return;
        }
        java.lang.String optString = jSONObject.optString(dm.i4.COL_USERNAME);
        if (com.tencent.mm.storage.z3.F3(optString) && !((ox.g) ((tk.o) i95.n0.c(tk.o.class))).Ui()) {
            android.content.Context c17 = c();
            if (c17 != null) {
                dp.a.makeText(c17, c17.getString(com.tencent.mm.R.string.p4e), 0).show();
            }
            this.f143443f.a("photo account disabled");
            return;
        }
        boolean optBoolean = jSONObject.optBoolean("halfPage", false);
        android.content.Intent intent = new android.content.Intent();
        try {
            intent.putExtra("nextAnimIn", ra3.h0.a(jSONObject));
            intent.putExtra("currentAnimOut", ra3.h0.b(jSONObject));
            android.content.Context c18 = c();
            if (!(c18 instanceof androidx.appcompat.app.AppCompatActivity) && !(c18 instanceof android.app.Activity) && !(c18 instanceof androidx.fragment.app.FragmentActivity)) {
                intent.addFlags(268435456);
            }
            if (optString == null || optString.length() == 0) {
                com.tencent.mars.xlog.Log.e("LiteAppJsApiProfile", "profile fail, username is null");
                this.f143443f.a("username is null");
                return;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                com.tencent.mm.ipcinvoker.w0.c(true, new com.tencent.mm.plugin.lite.jsapi.comms.f5(this, c18));
                this.f143443f.a("fail");
                return;
            }
            if (!gm0.j1.b().n()) {
                com.tencent.mars.xlog.Log.e("LiteAppJsApiProfile", "have to login");
                return;
            }
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(optString, true);
            if (n17 == null || ((int) n17.E2) <= 0) {
                n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().g0(optString);
            }
            java.lang.String optString2 = jSONObject.optString("profileReportInfo");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
                intent.putExtra("key_add_contact_report_info", optString2);
            }
            if (n17 == null || ((int) n17.E2) <= 0) {
                com.tencent.mm.ipcinvoker.w0.c(true, new com.tencent.mm.plugin.lite.jsapi.comms.i5(this, c18, optString, intent, optBoolean));
                return;
            }
            intent.putExtra("Contact_User", n17.d1());
            if (n17.k2()) {
                intent.putExtra("Contact_Scene", 42);
            }
            A(c18, optBoolean, intent);
            this.f143443f.d(false);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("LiteAppJsApiProfile", e17, "parse json", new java.lang.Object[0]);
            this.f143443f.a("exception");
        }
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public int z() {
        return 1;
    }
}
