package hr3;

/* loaded from: classes8.dex */
public final class e5 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.ContactMoreInfoUIWxContact f283511d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(com.tencent.mm.plugin.profile.ui.ContactMoreInfoUIWxContact contactMoreInfoUIWxContact) {
        super(2);
        this.f283511d = contactMoreInfoUIWxContact;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        pr3.c item = (pr3.c) obj;
        com.tencent.mm.contact.o contact = (com.tencent.mm.contact.o) obj2;
        kotlin.jvm.internal.o.g(item, "$this$item");
        kotlin.jvm.internal.o.g(contact, "contact");
        yq3.v vVar = (yq3.v) contact;
        java.lang.String c17 = vVar.c();
        item.f357956g = c17;
        boolean z17 = c17 == null || r26.n0.N(c17);
        com.tencent.mm.plugin.profile.ui.ContactMoreInfoUIWxContact contactMoreInfoUIWxContact = this.f283511d;
        if (z17) {
            item.f357956g = vVar.d();
            item.f357960n = java.lang.Integer.valueOf(i65.a.d(contactMoreInfoUIWxContact, com.tencent.mm.R.color.f478520a84));
        } else {
            item.f357960n = java.lang.Integer.valueOf(i65.a.d(contactMoreInfoUIWxContact, com.tencent.mm.R.color.adg));
        }
        return jz5.f0.f302826a;
    }
}
