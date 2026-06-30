package hr3;

/* loaded from: classes8.dex */
public final class n3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI f283820d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f283821e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI contactMoreInfoUI, com.tencent.mm.storage.z3 z3Var) {
        super(0);
        this.f283820d = contactMoreInfoUI;
        this.f283821e = z3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI contactMoreInfoUI = this.f283820d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(contactMoreInfoUI.f153686r)) {
            contactMoreInfoUI.f153686r = this.f283821e.C1;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(contactMoreInfoUI.f153686r)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", contactMoreInfoUI.f153686r);
            intent.putExtra("geta8key_username", c01.z1.r());
            j45.l.j(contactMoreInfoUI, "webview", ".ui.tools.WebViewUI", intent, null);
        }
        return jz5.f0.f302826a;
    }
}
