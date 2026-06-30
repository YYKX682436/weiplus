package hr3;

/* loaded from: classes8.dex */
public final class m3 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI f283789d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI contactMoreInfoUI) {
        super(2);
        this.f283789d = contactMoreInfoUI;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        pr3.c item = (pr3.c) obj;
        com.tencent.mm.storage.z3 contact = (com.tencent.mm.storage.z3) obj2;
        kotlin.jvm.internal.o.g(item, "$this$item");
        kotlin.jvm.internal.o.g(contact, "contact");
        com.tencent.mm.plugin.profile.n2 n2Var = com.tencent.mm.plugin.profile.n2.f153540a;
        com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI contactMoreInfoUI = this.f283789d;
        item.f357956g = n2Var.d(contact, contactMoreInfoUI.f153678g, contactMoreInfoUI);
        n2Var.d(contact, contactMoreInfoUI.f153678g, contactMoreInfoUI);
        return jz5.f0.f302826a;
    }
}
