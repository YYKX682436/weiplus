package hr3;

/* loaded from: classes8.dex */
public final class u2 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI f284041d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI contactMoreInfoUI) {
        super(2);
        this.f284041d = contactMoreInfoUI;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        pr3.c item = (pr3.c) obj;
        com.tencent.mm.storage.z3 contact = (com.tencent.mm.storage.z3) obj2;
        kotlin.jvm.internal.o.g(item, "$this$item");
        kotlin.jvm.internal.o.g(contact, "contact");
        int i17 = com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI.f153674z;
        com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI contactMoreInfoUI = this.f284041d;
        contactMoreInfoUI.getClass();
        if (!com.tencent.mm.storage.z3.m4(contact.d1()) || contact.I1 == 0) {
            item.f357963q = pr3.f.f357973f;
        } else {
            java.lang.String Vi = ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).Vi(contact.Q0(), "openim_intro_desc", j41.a0.TYPE_WORDING, 0);
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            androidx.appcompat.app.AppCompatActivity context = contactMoreInfoUI.getContext();
            ((ke0.e) xVar).getClass();
            item.f357956g = com.tencent.mm.pluginsdk.ui.span.c0.i(context, Vi);
            java.lang.String Vi2 = ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).Vi(contact.Q0(), "openim_intro_url", j41.a0.TYPE_URL, 0);
            if (!android.text.TextUtils.isEmpty(Vi2)) {
                item.f357966t = new hr3.d2(contactMoreInfoUI, Vi2, contact, Vi);
            }
        }
        return jz5.f0.f302826a;
    }
}
