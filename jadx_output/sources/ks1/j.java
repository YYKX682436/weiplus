package ks1;

/* loaded from: classes16.dex */
public final class j extends ks1.g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(js1.c tokenManager) {
        super(tokenManager);
        kotlin.jvm.internal.o.g(tokenManager, "tokenManager");
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
        ou3Var.f382527o = 2;
        ou3Var.f382528p = transferRequestInfo.f93925s;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = ou3Var;
        lVar.f70665b = new r45.pu3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/h5exttransfer";
        lVar.f70667d = 6673;
        lVar.f70668e = 6673;
        lVar.f70669f = 0;
        return lVar.a();
    }

    @Override // ks1.g
    public java.lang.String d() {
        return "/cgi-bin/micromsg-bin/h5exttransfer";
    }

    @Override // ks1.g
    public r45.z24 e(com.tencent.mm.modelbase.o oVar) {
        com.tencent.mm.protobuf.f fVar = oVar != null ? oVar.f70711b.f70700a : null;
        r45.pu3 pu3Var = fVar instanceof r45.pu3 ? (r45.pu3) fVar : null;
        if (pu3Var != null) {
            return pu3Var.f383410d;
        }
        return null;
    }

    @Override // ks1.g
    public java.lang.String f() {
        return "liteappExtTransfer";
    }
}
