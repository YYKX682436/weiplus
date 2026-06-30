package hr3;

/* loaded from: classes8.dex */
public final class k4 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.ContactMoreInfoUIWxContact f283711d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(com.tencent.mm.plugin.profile.ui.ContactMoreInfoUIWxContact contactMoreInfoUIWxContact) {
        super(2);
        this.f283711d = contactMoreInfoUIWxContact;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        pr3.c item = (pr3.c) obj;
        com.tencent.mm.contact.o contact = (com.tencent.mm.contact.o) obj2;
        kotlin.jvm.internal.o.g(item, "$this$item");
        kotlin.jvm.internal.o.g(contact, "contact");
        yq3.v vVar = (yq3.v) contact;
        if (!kotlin.jvm.internal.o.b(vVar.h(), c01.z1.r()) && vVar.k()) {
            int i17 = com.tencent.mm.plugin.profile.ui.ContactMoreInfoUIWxContact.f153694y;
            com.tencent.mm.plugin.profile.ui.ContactMoreInfoUIWxContact contactMoreInfoUIWxContact = this.f283711d;
            contactMoreInfoUIWxContact.getClass();
            if (kotlin.jvm.internal.o.b(vVar.h(), c01.z1.r())) {
                item.f357963q = pr3.f.f357973f;
            } else {
                com.tencent.mm.storage.z3 z3Var = vVar.f464535f;
                int i18 = z3Var != null ? z3Var.I : 0;
                item.f357955f = i18 != 1 ? i18 != 2 ? com.tencent.mm.R.string.f490958bd2 : com.tencent.mm.R.string.bcx : com.tencent.mm.R.string.bcy;
                p13.u uVar = new p13.u();
                uVar.f351141c = vVar.h();
                uVar.f351151m = new hr3.z3(item, contactMoreInfoUIWxContact, vVar);
                uVar.f351152n = contactMoreInfoUIWxContact.f153712x;
                uVar.f351140b = 5;
                ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(2, uVar);
            }
        }
        return jz5.f0.f302826a;
    }
}
