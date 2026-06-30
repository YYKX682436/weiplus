package ks1;

/* loaded from: classes16.dex */
public final class b extends ks1.g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(js1.c tokenManager) {
        super(tokenManager);
        kotlin.jvm.internal.o.g(tokenManager, "tokenManager");
    }

    @Override // ks1.g
    public com.tencent.mm.modelbase.o c(com.tencent.mm.plugin.brandservice.api.TransferRequestInfo transferRequestInfo) {
        kotlin.jvm.internal.o.g(transferRequestInfo, "transferRequestInfo");
        r45.ru3 ru3Var = new r45.ru3();
        ru3Var.f385213g = transferRequestInfo.f93914e;
        ru3Var.f385211e = transferRequestInfo.f93916g;
        ru3Var.f385215i = transferRequestInfo.f93915f;
        ru3Var.f385212f = transferRequestInfo.f93919m;
        ru3Var.f385214h = 400;
        r45.y24 y24Var = transferRequestInfo.f93917h;
        if (y24Var == null) {
            y24Var = new r45.y24();
        }
        ru3Var.f385210d = y24Var;
        ru3Var.f385218o = 1;
        ru3Var.f385216m = transferRequestInfo.f93922p;
        ru3Var.f385217n = transferRequestInfo.f93921o;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = ru3Var;
        lVar.f70665b = new r45.su3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/mawebtransfer";
        lVar.f70667d = 7094;
        lVar.f70668e = 7094;
        lVar.f70669f = 0;
        return lVar.a();
    }

    @Override // ks1.g
    public java.lang.String d() {
        return "/cgi-bin/micromsg-bin/mawebtransfer";
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
        return "AppBrandH5WebTransfer";
    }
}
