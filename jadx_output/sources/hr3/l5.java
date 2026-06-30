package hr3;

/* loaded from: classes8.dex */
public final class l5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.ContactMoreInfoUIWxContact f283743d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.contact.o f283744e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(com.tencent.mm.plugin.profile.ui.ContactMoreInfoUIWxContact contactMoreInfoUIWxContact, com.tencent.mm.contact.o oVar) {
        super(0);
        this.f283743d = contactMoreInfoUIWxContact;
        this.f283744e = oVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.profile.ui.ContactMoreInfoUIWxContact contactMoreInfoUIWxContact = this.f283743d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(contactMoreInfoUIWxContact.f153705q)) {
            com.tencent.mm.storage.z3 z3Var = ((yq3.v) this.f283744e).f464535f;
            contactMoreInfoUIWxContact.f153705q = z3Var != null ? z3Var.C1 : null;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(contactMoreInfoUIWxContact.f153705q)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", contactMoreInfoUIWxContact.f153705q);
            intent.putExtra("geta8key_username", c01.z1.r());
            j45.l.j(contactMoreInfoUIWxContact, "webview", ".ui.tools.WebViewUI", intent, null);
        }
        return jz5.f0.f302826a;
    }
}
