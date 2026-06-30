package hr3;

/* loaded from: classes8.dex */
public final class p4 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.ContactMoreInfoUIWxContact f283875d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(com.tencent.mm.plugin.profile.ui.ContactMoreInfoUIWxContact contactMoreInfoUIWxContact) {
        super(2);
        this.f283875d = contactMoreInfoUIWxContact;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        pr3.c item = (pr3.c) obj;
        com.tencent.mm.contact.o contact = (com.tencent.mm.contact.o) obj2;
        kotlin.jvm.internal.o.g(item, "$this$item");
        kotlin.jvm.internal.o.g(contact, "contact");
        pr3.f fVar = ((yq3.v) contact).k() ? pr3.f.f357973f : pr3.f.f357972e;
        int i17 = com.tencent.mm.plugin.profile.ui.ContactMoreInfoUIWxContact.f153694y;
        this.f283875d.W6(item, contact, fVar, false);
        return jz5.f0.f302826a;
    }
}
