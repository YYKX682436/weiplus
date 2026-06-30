package d83;

/* loaded from: classes2.dex */
public final class a extends com.tencent.mm.modelbase.i {
    public a() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.b6();
        lVar.f70665b = new r45.c6();
        lVar.f70667d = 6939;
        lVar.f70666c = "/cgi-bin/micromsg-bin/get_ilink_auth_code";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        p(lVar.a());
    }

    @Override // com.tencent.mm.modelbase.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.c6 resp = (r45.c6) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("MicroMsg.GetIlinkAuthCode", "AffILinkAuthCodeCgi errType:" + i17 + " errCode:" + i18 + " errMsg:" + str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("AffILinkAuthCodeCgi ret:");
        com.tencent.mm.protobuf.g gVar = resp.f371300d;
        sb6.append(gVar != null ? gVar.i() : null);
        sb6.append(", ");
        com.tencent.mm.protobuf.g gVar2 = resp.f371301e;
        sb6.append(gVar2 != null ? gVar2.i() : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.GetIlinkAuthCode", sb6.toString());
    }
}
