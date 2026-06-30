package hr3;

/* loaded from: classes8.dex */
public final class i2 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI f283645d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI contactMoreInfoUI) {
        super(2);
        this.f283645d = contactMoreInfoUI;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        pr3.c item = (pr3.c) obj;
        com.tencent.mm.storage.z3 contact = (com.tencent.mm.storage.z3) obj2;
        kotlin.jvm.internal.o.g(item, "$this$item");
        kotlin.jvm.internal.o.g(contact, "contact");
        int i17 = com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI.f153674z;
        com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI contactMoreInfoUI = this.f283645d;
        contactMoreInfoUI.getClass();
        com.tencent.mm.plugin.profile.n2.f153540a.c(contact, new com.tencent.mm.sdk.coroutines.LifecycleScope("MicroMsg.ContactMoreInfoUI", contactMoreInfoUI, 0, 4, null), hr3.e2.f283506d, new hr3.g2(item, contactMoreInfoUI, contact));
        return jz5.f0.f302826a;
    }
}
