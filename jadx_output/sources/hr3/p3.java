package hr3;

/* loaded from: classes8.dex */
public final class p3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI f283874d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI contactMoreInfoUI) {
        super(0);
        this.f283874d = contactMoreInfoUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI contactMoreInfoUI = this.f283874d;
        intent.putExtra("rawUrl", contactMoreInfoUI.f153692x);
        intent.putExtra("geta8key_username", c01.z1.r());
        j45.l.j(contactMoreInfoUI, "webview", ".ui.tools.WebViewUI", intent, null);
        return jz5.f0.f302826a;
    }
}
