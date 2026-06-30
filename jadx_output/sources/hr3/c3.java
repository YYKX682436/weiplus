package hr3;

/* loaded from: classes8.dex */
public final class c3 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI f283439d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI contactMoreInfoUI) {
        super(2);
        this.f283439d = contactMoreInfoUI;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str;
        pr3.c item = (pr3.c) obj;
        com.tencent.mm.storage.z3 contact = (com.tencent.mm.storage.z3) obj2;
        kotlin.jvm.internal.o.g(item, "$this$item");
        kotlin.jvm.internal.o.g(contact, "contact");
        int i17 = com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI.f153674z;
        com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI contactMoreInfoUI = this.f283439d;
        contactMoreInfoUI.getClass();
        java.lang.String str2 = null;
        if (kotlin.jvm.internal.o.b(c01.z1.r(), contact.d1())) {
            java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_PROFILE_WEIDIANINFO_STRING, null);
            str = m17 instanceof java.lang.String ? (java.lang.String) m17 : null;
        } else {
            str = contact.D1;
        }
        if (str != null && !com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                contactMoreInfoUI.f153692x = jSONObject.optString("ShopUrl");
                str2 = jSONObject.optString("ShopName");
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ContactMoreInfoUI", e17, "", new java.lang.Object[0]);
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(contactMoreInfoUI.f153692x)) {
            item.f357956g = str2;
            item.f357960n = java.lang.Integer.valueOf(contactMoreInfoUI.getResources().getColor(com.tencent.mm.R.color.a1u));
            item.f357966t = new hr3.p3(contactMoreInfoUI);
        }
        return jz5.f0.f302826a;
    }
}
