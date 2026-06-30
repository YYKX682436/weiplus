package vk4;

/* loaded from: classes9.dex */
public final class a extends com.tencent.mm.modelbase.i {
    public a(java.lang.String appId, java.lang.String mid) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(mid, "mid");
        r45.wr4 wr4Var = new r45.wr4();
        r45.xr4 xr4Var = new r45.xr4();
        xr4Var.f390359d = appId;
        xr4Var.f390360e = mid;
        wr4Var.f389401d = xr4Var;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 6448;
        lVar.f70666c = "/cgi-bin/micromsg-bin/musiclivegetjoinmembershipinfo";
        lVar.f70664a = wr4Var;
        lVar.f70665b = new r45.yr4();
        p(lVar.a());
    }
}
