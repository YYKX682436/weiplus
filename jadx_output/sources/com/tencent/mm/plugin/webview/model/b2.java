package com.tencent.mm.plugin.webview.model;

/* loaded from: classes7.dex */
public class b2 implements com.tencent.mm.model.gdpr.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.l2 f182787a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182788b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f182789c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182790d;

    public b2(com.tencent.mm.plugin.webview.model.l2 l2Var, java.lang.String str, int i17, java.lang.String str2) {
        this.f182787a = l2Var;
        this.f182788b = str;
        this.f182789c = i17;
        this.f182790d = str2;
    }

    @Override // com.tencent.mm.model.gdpr.b
    public void a(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OauthAuthorizeLogic", " MPGdprPolicyUtil.checkPolicy onPermissionReturn:%d", java.lang.Integer.valueOf(i17));
        p95.a.b(true, new com.tencent.mm.plugin.webview.model.a2(this, i17));
    }
}
