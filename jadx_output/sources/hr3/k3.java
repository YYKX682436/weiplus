package hr3;

/* loaded from: classes8.dex */
public final class k3 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI f283710d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI contactMoreInfoUI) {
        super(2);
        this.f283710d = contactMoreInfoUI;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        pr3.c item = (pr3.c) obj;
        com.tencent.mm.storage.z3 contact = (com.tencent.mm.storage.z3) obj2;
        kotlin.jvm.internal.o.g(item, "$this$item");
        kotlin.jvm.internal.o.g(contact, "contact");
        int i17 = com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI.f153674z;
        com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI contactMoreInfoUI = this.f283710d;
        contactMoreInfoUI.getClass();
        item.f357956g = "";
        java.util.List i18 = com.tencent.mm.plugin.profile.n2.f153540a.i(contact);
        if (!i18.isEmpty()) {
            item.f357956g = com.tencent.mm.sdk.platformtools.t8.c1(i18, contactMoreInfoUI.getResources().getString(com.tencent.mm.R.string.f490924ba0));
        }
        com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI.T6(contactMoreInfoUI, item, contact, 39);
        return jz5.f0.f302826a;
    }
}
