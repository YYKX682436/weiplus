package com.tencent.mm.plugin.webview.model;

/* loaded from: classes7.dex */
public class v1 implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.stub.v0 f183134a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.u1 f183135b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f183136c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f183137d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.l2 f183138e;

    public v1(com.tencent.mm.plugin.webview.stub.v0 v0Var, com.tencent.mm.plugin.webview.model.u1 u1Var, boolean z17, android.content.Context context, com.tencent.mm.plugin.webview.model.l2 l2Var) {
        this.f183134a = v0Var;
        this.f183135b = u1Var;
        this.f183136c = z17;
        this.f183137d = context;
        this.f183138e = l2Var;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        com.tencent.mm.protobuf.f fVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.OauthAuthorizeLogic", "onSceneEnd doOauthAuthorizeConfirm errType = %d, errCode = %d ,errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (this.f183134a == null || this.f183135b == null || !this.f183136c) {
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        if (i17 != 0 || i18 != 0 || oVar == null || (fVar = oVar.f70711b.f70700a) == null || !(fVar instanceof r45.jx4)) {
            com.tencent.mm.plugin.webview.model.k2.b(false, str, bundle, this.f183137d, this.f183138e, this.f183135b);
        } else {
            bundle.putString("redirect_url", ((r45.jx4) fVar).f378199d);
            com.tencent.mm.plugin.webview.model.k2.b(true, str, bundle, this.f183137d, this.f183138e, this.f183135b);
        }
    }
}
