package hr3;

/* loaded from: classes8.dex */
public final class m2 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI f283788d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI contactMoreInfoUI) {
        super(2);
        this.f283788d = contactMoreInfoUI;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        pr3.c item = (pr3.c) obj;
        com.tencent.mm.storage.z3 contact = (com.tencent.mm.storage.z3) obj2;
        kotlin.jvm.internal.o.g(item, "$this$item");
        kotlin.jvm.internal.o.g(contact, "contact");
        if (!kotlin.jvm.internal.o.b(contact.d1(), c01.z1.r()) && contact.r2()) {
            int i17 = com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI.f153674z;
            com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI contactMoreInfoUI = this.f283788d;
            contactMoreInfoUI.getClass();
            if (kotlin.jvm.internal.o.b(contact.d1(), c01.z1.r())) {
                item.f357963q = pr3.f.f357973f;
            } else {
                int i18 = contact.I;
                item.f357955f = i18 != 1 ? i18 != 2 ? com.tencent.mm.R.string.f490958bd2 : com.tencent.mm.R.string.bcx : com.tencent.mm.R.string.bcy;
                p13.u uVar = new p13.u();
                uVar.f351141c = contact.d1();
                uVar.f351151m = new hr3.a2(item, contactMoreInfoUI, contact);
                uVar.f351152n = contactMoreInfoUI.f153693y;
                uVar.f351140b = 5;
                ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(2, uVar);
            }
        }
        return jz5.f0.f302826a;
    }
}
