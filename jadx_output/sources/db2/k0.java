package db2;

/* loaded from: classes.dex */
public final class k0 extends com.tencent.mm.modelbase.i {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f228037m;

    public k0(java.lang.String username, java.lang.String clientId, java.lang.String remoteUrl, java.lang.String appId, java.lang.String paramsJson) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(clientId, "clientId");
        kotlin.jvm.internal.o.g(remoteUrl, "remoteUrl");
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(paramsJson, "paramsJson");
        this.f228037m = "Finder.CgiFinderFileDump";
        r45.g31 g31Var = new r45.g31();
        g31Var.set(0, username);
        g31Var.set(1, clientId);
        g31Var.set(2, remoteUrl);
        g31Var.set(3, appId);
        g31Var.set(4, paramsJson);
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderFileDump", "CgiFinderFileDump clientId:".concat(clientId));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = g31Var;
        r45.h31 h31Var = new r45.h31();
        h31Var.set(3, new r45.ie());
        r45.ie ieVar = (r45.ie) h31Var.getCustom(3);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = h31Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderfiledump";
        lVar.f70667d = 4659;
        p(lVar.a());
    }

    @Override // com.tencent.mm.modelbase.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.h31 resp = (r45.h31) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f228037m, "onCgiBack errType:" + i17 + ", errCode:" + i18 + ", errMsg:" + str);
    }
}
