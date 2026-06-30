package hr3;

/* loaded from: classes8.dex */
public final class d3 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI f283468d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI contactMoreInfoUI) {
        super(2);
        this.f283468d = contactMoreInfoUI;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        pr3.c item = (pr3.c) obj;
        com.tencent.mm.storage.z3 contact = (com.tencent.mm.storage.z3) obj2;
        kotlin.jvm.internal.o.g(item, "$this$item");
        kotlin.jvm.internal.o.g(contact, "contact");
        item.f357963q = pr3.f.f357971d;
        item.f357961o = java.lang.Integer.valueOf(com.tencent.mm.R.dimen.anf);
        com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI.T6(this.f283468d, item, contact, 38);
        return jz5.f0.f302826a;
    }
}
