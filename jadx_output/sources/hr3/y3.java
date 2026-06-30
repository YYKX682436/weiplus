package hr3;

/* loaded from: classes8.dex */
public final class y3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f284199d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.ContactMoreInfoUIWxContact f284200e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.contact.o f284201f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(int i17, com.tencent.mm.plugin.profile.ui.ContactMoreInfoUIWxContact contactMoreInfoUIWxContact, com.tencent.mm.contact.o oVar) {
        super(0);
        this.f284199d = i17;
        this.f284200e = contactMoreInfoUIWxContact;
        this.f284201f = oVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = this.f284199d;
        o13.p.d(i17);
        if (i17 > 0) {
            com.tencent.mm.plugin.profile.ui.ContactMoreInfoUIWxContact contactMoreInfoUIWxContact = this.f284200e;
            com.tencent.mm.plugin.profile.p2.Bi(contactMoreInfoUIWxContact.getIntent(), 44, 1, ((yq3.v) this.f284201f).h());
            android.content.Intent intent = new android.content.Intent(contactMoreInfoUIWxContact, (java.lang.Class<?>) com.tencent.mm.plugin.profile.ui.CommonChatroomInfoUI.class);
            intent.putExtra("Select_Talker_Name", contactMoreInfoUIWxContact.f153696e);
            com.tencent.mm.plugin.profile.ui.ContactMoreInfoUIWxContact contactMoreInfoUIWxContact2 = this.f284200e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(contactMoreInfoUIWxContact2, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/ContactMoreInfoUIWxContact$initCommonChatroom$1$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            contactMoreInfoUIWxContact2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(contactMoreInfoUIWxContact2, "com/tencent/mm/plugin/profile/ui/ContactMoreInfoUIWxContact$initCommonChatroom$1$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        return jz5.f0.f302826a;
    }
}
