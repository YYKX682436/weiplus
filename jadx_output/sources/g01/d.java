package g01;

/* loaded from: classes8.dex */
public class d implements com.tencent.mm.plugin.webview.ui.tools.widget.y1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.model.gdpr.ui.MPGdprPolicyUI f267409a;

    public d(com.tencent.mm.model.gdpr.ui.MPGdprPolicyUI mPGdprPolicyUI) {
        this.f267409a = mPGdprPolicyUI;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.y1
    public void a(com.tencent.mm.ui.widget.MMWebView mMWebView, java.lang.String str) {
        this.f267409a.runOnUiThread(new g01.b(this));
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.y1
    public boolean b(android.os.Bundle bundle) {
        this.f267409a.runOnUiThread(new g01.a(this));
        return true;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.y1
    public boolean c(java.lang.String str) {
        return false;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.x1
    public boolean callback(int i17, android.os.Bundle bundle) {
        if (i17 == 200) {
            boolean z17 = bundle.getBoolean("OnMPGdprPolicyAgreement_KIsAgree", false);
            java.lang.String str = com.tencent.mm.model.gdpr.ui.MPGdprPolicyUI.f70381i;
            com.tencent.mm.model.gdpr.ui.MPGdprPolicyUI mPGdprPolicyUI = this.f267409a;
            android.os.ResultReceiver resultReceiver = mPGdprPolicyUI.f70386h;
            if (resultReceiver != null) {
                resultReceiver.send(z17 ? 1 : -1, null);
            }
            mPGdprPolicyUI.f70386h = null;
            if (z17 && !com.tencent.mm.sdk.platformtools.t8.K0(mPGdprPolicyUI.f70385g) && mPGdprPolicyUI.f70384f.f70371e != 0) {
                com.tencent.mm.modelbase.i iVar = new com.tencent.mm.modelbase.i();
                r45.c26 c26Var = new r45.c26();
                c26Var.f371246d = mPGdprPolicyUI.f70385g;
                c26Var.f371247e = mPGdprPolicyUI.f70384f.f70371e;
                com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
                lVar.f70664a = c26Var;
                lVar.f70665b = new r45.d26();
                lVar.f70667d = 2734;
                lVar.f70666c = "/cgi-bin/mmbiz-bin/wxabusiness/setgdrpauth";
                iVar.p(lVar.a());
                iVar.l();
            }
        }
        return false;
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.y1
    public void d(com.tencent.mm.ui.widget.MMWebView mMWebView, java.lang.String str) {
        this.f267409a.runOnUiThread(new g01.c(this));
    }
}
