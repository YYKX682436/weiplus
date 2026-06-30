package hr3;

/* loaded from: classes8.dex */
public final class s4 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.ContactMoreInfoUIWxContact f283967d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4(com.tencent.mm.plugin.profile.ui.ContactMoreInfoUIWxContact contactMoreInfoUIWxContact) {
        super(2);
        this.f283967d = contactMoreInfoUIWxContact;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        pr3.c item = (pr3.c) obj;
        com.tencent.mm.contact.o contact = (com.tencent.mm.contact.o) obj2;
        kotlin.jvm.internal.o.g(item, "$this$item");
        kotlin.jvm.internal.o.g(contact, "contact");
        int i17 = com.tencent.mm.plugin.profile.ui.ContactMoreInfoUIWxContact.f153694y;
        com.tencent.mm.plugin.profile.ui.ContactMoreInfoUIWxContact contactMoreInfoUIWxContact = this.f283967d;
        contactMoreInfoUIWxContact.getClass();
        yq3.v vVar = (yq3.v) contact;
        if (com.tencent.mm.storage.z3.m4(vVar.h())) {
            com.tencent.mm.storage.z3 z3Var = vVar.f464535f;
            java.lang.Integer valueOf = z3Var != null ? java.lang.Integer.valueOf(z3Var.I1) : null;
            if (valueOf == null || valueOf.intValue() != 0) {
                j41.b0 b0Var = (j41.b0) i95.n0.c(j41.b0.class);
                com.tencent.mm.storage.z3 z3Var2 = vVar.f464535f;
                java.lang.String Vi = ((l41.q2) b0Var).Vi(z3Var2 != null ? z3Var2.Q0() : null, "openim_intro_desc", j41.a0.TYPE_WORDING, 0);
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                androidx.appcompat.app.AppCompatActivity context = contactMoreInfoUIWxContact.getContext();
                ((ke0.e) xVar).getClass();
                item.f357956g = com.tencent.mm.pluginsdk.ui.span.c0.i(context, Vi);
                j41.b0 b0Var2 = (j41.b0) i95.n0.c(j41.b0.class);
                com.tencent.mm.storage.z3 z3Var3 = vVar.f464535f;
                java.lang.String Vi2 = ((l41.q2) b0Var2).Vi(z3Var3 != null ? z3Var3.Q0() : null, "openim_intro_url", j41.a0.TYPE_URL, 0);
                if (!android.text.TextUtils.isEmpty(Vi2)) {
                    item.f357966t = new hr3.c4(contactMoreInfoUIWxContact, Vi2, contact, Vi);
                }
                return jz5.f0.f302826a;
            }
        }
        item.f357963q = pr3.f.f357973f;
        return jz5.f0.f302826a;
    }
}
