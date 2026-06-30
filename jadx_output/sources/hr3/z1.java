package hr3;

/* loaded from: classes8.dex */
public final class z1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f284224d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI f284225e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f284226f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(int i17, com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI contactMoreInfoUI, com.tencent.mm.storage.z3 z3Var) {
        super(0);
        this.f284224d = i17;
        this.f284225e = contactMoreInfoUI;
        this.f284226f = z3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = this.f284224d;
        o13.p.d(i17);
        if (i17 > 0) {
            com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI contactMoreInfoUI = this.f284225e;
            com.tencent.mm.plugin.profile.p2.Bi(contactMoreInfoUI.getIntent(), 44, 1, this.f284226f.d1());
            android.content.Intent intent = new android.content.Intent(contactMoreInfoUI, (java.lang.Class<?>) com.tencent.mm.plugin.profile.ui.CommonChatroomInfoUI.class);
            intent.putExtra("Select_Talker_Name", contactMoreInfoUI.f153676e);
            com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI contactMoreInfoUI2 = this.f284225e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(contactMoreInfoUI2, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/ContactMoreInfoUI$initCommonChatroom$1$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            contactMoreInfoUI2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(contactMoreInfoUI2, "com/tencent/mm/plugin/profile/ui/ContactMoreInfoUI$initCommonChatroom$1$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        return jz5.f0.f302826a;
    }
}
