package hr3;

/* loaded from: classes8.dex */
public final class g5 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.ContactMoreInfoUIWxContact f283575d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(com.tencent.mm.plugin.profile.ui.ContactMoreInfoUIWxContact contactMoreInfoUIWxContact) {
        super(2);
        this.f283575d = contactMoreInfoUIWxContact;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        pr3.c item = (pr3.c) obj;
        com.tencent.mm.contact.o contact = (com.tencent.mm.contact.o) obj2;
        kotlin.jvm.internal.o.g(item, "$this$item");
        kotlin.jvm.internal.o.g(contact, "contact");
        pr3.f fVar = ((yq3.v) contact).k() ? pr3.f.f357971d : pr3.f.f357973f;
        int i17 = com.tencent.mm.plugin.profile.ui.ContactMoreInfoUIWxContact.f153694y;
        this.f283575d.W6(item, contact, fVar, true);
        return jz5.f0.f302826a;
    }
}
