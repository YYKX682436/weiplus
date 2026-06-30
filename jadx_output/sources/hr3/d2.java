package hr3;

/* loaded from: classes8.dex */
public final class d2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI f283464d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f283465e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f283466f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f283467g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI contactMoreInfoUI, java.lang.String str, com.tencent.mm.storage.z3 z3Var, java.lang.String str2) {
        super(0);
        this.f283464d = contactMoreInfoUI;
        this.f283465e = str;
        this.f283466f = z3Var;
        this.f283467g = str2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.sdk.platformtools.f9 f9Var = com.tencent.mm.sdk.platformtools.f9.ContactWeCom;
        com.tencent.mm.plugin.profile.ui.ContactMoreInfoUI contactMoreInfoUI = this.f283464d;
        if (f9Var.k(contactMoreInfoUI.getContext(), null)) {
            if (t41.i.a()) {
                android.content.Intent intent = new android.content.Intent();
                intent.setFlags(268435456);
                intent.setClassName(com.tencent.mm.sdk.platformtools.x2.f193071a, "com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
                intent.putExtra("rawUrl", this.f283465e);
                intent.putExtra("geta8key_scene", 58);
                j45.l.j(com.tencent.mm.sdk.platformtools.x2.f193071a, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, null);
            } else {
                com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(contactMoreInfoUI.getContext());
                u1Var.g(contactMoreInfoUI.getString(com.tencent.mm.R.string.bd_));
                u1Var.m(com.tencent.mm.R.string.f490375t8);
                u1Var.b(new hr3.c2(contactMoreInfoUI));
                u1Var.q(false);
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15319, this.f283466f.Q0(), 6, this.f283467g);
        }
        return jz5.f0.f302826a;
    }
}
