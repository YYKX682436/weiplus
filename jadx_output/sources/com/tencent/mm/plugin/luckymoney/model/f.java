package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes2.dex */
public final class f extends com.tencent.mm.modelbase.i {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f145265m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f145266n;

    public f(java.lang.String str, java.lang.String str2) {
        this.f145265m = "";
        this.f145266n = "";
        r45.dg3 dg3Var = new r45.dg3();
        r45.eg3 eg3Var = new r45.eg3();
        this.f145266n = str;
        dg3Var.f372415d = str;
        this.f145265m = str2;
        com.tencent.mars.xlog.Log.i("MicroMsg.cgiGetLuckymoneyFullCoverInfo", "[param] packet_id： " + str + " , mSendId: " + str2);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = dg3Var;
        lVar.f70665b = eg3Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/getfullcoverinfo";
        lVar.f70667d = 13952;
        p(lVar.a());
    }
}
