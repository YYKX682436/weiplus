package hr3;

/* loaded from: classes8.dex */
public final class g3 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI f283573d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI contactMoreInfoUI) {
        super(2);
        this.f283573d = contactMoreInfoUI;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        pr3.c item = (pr3.c) obj;
        com.tencent.mm.storage.z3 contact = (com.tencent.mm.storage.z3) obj2;
        kotlin.jvm.internal.o.g(item, "$this$item");
        kotlin.jvm.internal.o.g(contact, "contact");
        java.lang.String w07 = contact.w0();
        com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI contactMoreInfoUI = this.f283573d;
        if (w07 == null) {
            com.tencent.mm.storage.ya yaVar = contactMoreInfoUI.f153678g;
            w07 = yaVar != null ? yaVar.field_conRemark : null;
            if (w07 == null) {
                w07 = "";
            }
        }
        item.f357956g = w07;
        if (r26.n0.N(w07)) {
            item.f357956g = contact.f2();
            item.f357960n = java.lang.Integer.valueOf(i65.a.d(contactMoreInfoUI, com.tencent.mm.R.color.f478520a84));
        } else {
            item.f357960n = java.lang.Integer.valueOf(i65.a.d(contactMoreInfoUI, com.tencent.mm.R.color.adg));
        }
        return jz5.f0.f302826a;
    }
}
