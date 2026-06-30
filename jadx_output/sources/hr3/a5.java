package hr3;

/* loaded from: classes8.dex */
public final class a5 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.ContactMoreInfoUIWxContact f283376d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(com.tencent.mm.plugin.profile.ui.ContactMoreInfoUIWxContact contactMoreInfoUIWxContact) {
        super(2);
        this.f283376d = contactMoreInfoUIWxContact;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str;
        pr3.c item = (pr3.c) obj;
        com.tencent.mm.contact.o contact = (com.tencent.mm.contact.o) obj2;
        kotlin.jvm.internal.o.g(item, "$this$item");
        kotlin.jvm.internal.o.g(contact, "contact");
        int i17 = com.tencent.mm.plugin.profile.ui.ContactMoreInfoUIWxContact.f153694y;
        com.tencent.mm.plugin.profile.ui.ContactMoreInfoUIWxContact contactMoreInfoUIWxContact = this.f283376d;
        contactMoreInfoUIWxContact.getClass();
        yq3.v vVar = (yq3.v) contact;
        java.lang.String str2 = null;
        if (kotlin.jvm.internal.o.b(c01.z1.r(), vVar.h())) {
            java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_PROFILE_WEIDIANINFO_STRING, null);
            if (m17 instanceof java.lang.String) {
                str = (java.lang.String) m17;
            }
            str = null;
        } else {
            com.tencent.mm.storage.z3 z3Var = vVar.f464535f;
            if (z3Var != null) {
                str = z3Var.D1;
            }
            str = null;
        }
        if (str != null && !com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                contactMoreInfoUIWxContact.f153711w = jSONObject.optString("ShopUrl");
                str2 = jSONObject.optString("ShopName");
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ContactMoreInfoUI", e17, "", new java.lang.Object[0]);
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(contactMoreInfoUIWxContact.f153711w)) {
            item.f357956g = str2;
            item.f357960n = java.lang.Integer.valueOf(contactMoreInfoUIWxContact.getResources().getColor(com.tencent.mm.R.color.a1u));
            item.f357966t = new hr3.n5(contactMoreInfoUIWxContact);
        }
        return jz5.f0.f302826a;
    }
}
