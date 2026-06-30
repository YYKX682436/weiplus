package hr3;

/* loaded from: classes8.dex */
public final class n5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.ContactMoreInfoUIWxContact f283823d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(com.tencent.mm.plugin.profile.ui.ContactMoreInfoUIWxContact contactMoreInfoUIWxContact) {
        super(0);
        this.f283823d = contactMoreInfoUIWxContact;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.profile.ui.ContactMoreInfoUIWxContact contactMoreInfoUIWxContact = this.f283823d;
        intent.putExtra("rawUrl", contactMoreInfoUIWxContact.f153711w);
        intent.putExtra("geta8key_username", c01.z1.r());
        j45.l.j(contactMoreInfoUIWxContact, "webview", ".ui.tools.WebViewUI", intent, null);
        return jz5.f0.f302826a;
    }
}
