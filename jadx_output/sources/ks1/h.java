package ks1;

/* loaded from: classes16.dex */
public final class h extends ks1.g {

    /* renamed from: b, reason: collision with root package name */
    public final int f311594b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f311595c;

    /* renamed from: d, reason: collision with root package name */
    public final int f311596d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(int i17, java.lang.String cgiUrl, int i18, js1.c tokenManager) {
        super(tokenManager);
        kotlin.jvm.internal.o.g(cgiUrl, "cgiUrl");
        kotlin.jvm.internal.o.g(tokenManager, "tokenManager");
        this.f311594b = i17;
        this.f311595c = cgiUrl;
        this.f311596d = i18;
    }

    @Override // ks1.g
    public com.tencent.mm.modelbase.o c(com.tencent.mm.plugin.brandservice.api.TransferRequestInfo transferRequestInfo) {
        kotlin.jvm.internal.o.g(transferRequestInfo, "transferRequestInfo");
        r45.ou3 ou3Var = new r45.ou3();
        ou3Var.f382522g = transferRequestInfo.f93914e;
        ou3Var.f382520e = transferRequestInfo.f93916g;
        ou3Var.f382524i = transferRequestInfo.f93915f;
        ou3Var.f382521f = transferRequestInfo.f93919m;
        ou3Var.f382523h = 400;
        r45.y24 y24Var = transferRequestInfo.f93917h;
        if (y24Var == null) {
            y24Var = new r45.y24();
        }
        ou3Var.f382519d = y24Var;
        ou3Var.f382525m = transferRequestInfo.f93922p;
        ou3Var.f382526n = transferRequestInfo.f93921o;
        ou3Var.f382527o = this.f311596d;
        java.lang.String str = transferRequestInfo.f93925s;
        if (!(str == null || str.length() == 0)) {
            ou3Var.f382528p = transferRequestInfo.f93925s;
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = ou3Var;
        lVar.f70665b = new r45.su3();
        lVar.f70666c = this.f311595c;
        int i17 = this.f311594b;
        lVar.f70667d = i17;
        lVar.f70668e = i17;
        lVar.f70669f = 0;
        return lVar.a();
    }

    @Override // ks1.g
    public java.lang.String d() {
        return this.f311595c;
    }

    @Override // ks1.g
    public r45.z24 e(com.tencent.mm.modelbase.o oVar) {
        com.tencent.mm.protobuf.f fVar = oVar != null ? oVar.f70711b.f70700a : null;
        r45.su3 su3Var = fVar instanceof r45.su3 ? (r45.su3) fVar : null;
        if (su3Var != null) {
            return su3Var.f385975d;
        }
        return null;
    }

    @Override // ks1.g
    public java.lang.String f() {
        return "DynamicRoutingTransferRequester";
    }
}
