package com.tencent.mm.plugin.webview.model;

/* loaded from: classes7.dex */
public class f2 implements com.tencent.mm.model.gdpr.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f182873a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.g2 f182874b;

    public f2(com.tencent.mm.plugin.webview.model.g2 g2Var, android.os.Bundle bundle) {
        this.f182874b = g2Var;
        this.f182873a = bundle;
    }

    @Override // com.tencent.mm.model.gdpr.b
    public void a(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OauthAuthorizeLogic", " MPGdprPolicyUtil.checkPolicy onPermissionReturn:%d", java.lang.Integer.valueOf(i17));
        p95.a.b(true, new com.tencent.mm.plugin.webview.model.e2(this, i17));
    }
}
