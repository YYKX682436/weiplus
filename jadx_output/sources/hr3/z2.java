package hr3;

/* loaded from: classes8.dex */
public final class z2 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI f284227d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI contactMoreInfoUI) {
        super(2);
        this.f284227d = contactMoreInfoUI;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        pr3.c item = (pr3.c) obj;
        com.tencent.mm.storage.z3 contact = (com.tencent.mm.storage.z3) obj2;
        kotlin.jvm.internal.o.g(item, "$this$item");
        kotlin.jvm.internal.o.g(contact, "contact");
        int i17 = com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI.f153674z;
        com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI contactMoreInfoUI = this.f284227d;
        contactMoreInfoUI.getClass();
        if (!contact.r2() || contactMoreInfoUI.W6()) {
            item.f357956g = "";
        } else {
            g95.d dVar = g95.e.f269801a;
            java.lang.String d17 = contact.d1();
            long c17 = dVar.c(d17 != null ? d17 : "");
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactMoreInfoUI", "[initFriendSourceTime] time:%s", java.lang.Long.valueOf(c17));
            if (c17 > 0) {
                item.f357956g = k35.m1.d(contactMoreInfoUI.getString(com.tencent.mm.R.string.f492149fe4), c17);
            }
        }
        return jz5.f0.f302826a;
    }
}
