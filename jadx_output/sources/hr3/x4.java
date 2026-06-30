package hr3;

/* loaded from: classes8.dex */
public final class x4 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.ContactMoreInfoUIWxContact f284170d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(com.tencent.mm.plugin.profile.ui.ContactMoreInfoUIWxContact contactMoreInfoUIWxContact) {
        super(2);
        this.f284170d = contactMoreInfoUIWxContact;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        pr3.c item = (pr3.c) obj;
        com.tencent.mm.contact.o contact = (com.tencent.mm.contact.o) obj2;
        kotlin.jvm.internal.o.g(item, "$this$item");
        kotlin.jvm.internal.o.g(contact, "contact");
        int i17 = com.tencent.mm.plugin.profile.ui.ContactMoreInfoUIWxContact.f153694y;
        com.tencent.mm.plugin.profile.ui.ContactMoreInfoUIWxContact contactMoreInfoUIWxContact = this.f284170d;
        contactMoreInfoUIWxContact.getClass();
        yq3.v vVar = (yq3.v) contact;
        if (!vVar.k() || contactMoreInfoUIWxContact.X6()) {
            item.f357956g = "";
        } else {
            g95.d dVar = g95.e.f269801a;
            java.lang.String h17 = vVar.h();
            long c17 = dVar.c(h17 != null ? h17 : "");
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactMoreInfoUI", "[initFriendSourceTime] time:%s", java.lang.Long.valueOf(c17));
            if (c17 > 0) {
                item.f357956g = k35.m1.d(contactMoreInfoUIWxContact.getString(com.tencent.mm.R.string.f492149fe4), c17);
            }
        }
        return jz5.f0.f302826a;
    }
}
