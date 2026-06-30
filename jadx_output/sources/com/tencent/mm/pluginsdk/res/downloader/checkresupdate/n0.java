package com.tencent.mm.pluginsdk.res.downloader.checkresupdate;

/* loaded from: classes12.dex */
public class n0 extends com.tencent.mm.modelbase.k1 {

    /* renamed from: a, reason: collision with root package name */
    public final o45.lh f189628a = new o45.lh();

    /* renamed from: b, reason: collision with root package name */
    public final o45.mh f189629b = new o45.mh();

    @Override // com.tencent.mm.modelbase.k1, com.tencent.mm.network.v0
    public int getOptions() {
        return 1;
    }

    @Override // com.tencent.mm.modelbase.k1
    public o45.zg getReqObjImp() {
        return this.f189628a;
    }

    @Override // com.tencent.mm.network.v0
    public o45.ah getRespObj() {
        return this.f189629b;
    }

    @Override // com.tencent.mm.network.v0
    public int getType() {
        return o45.ag.f342892a ? 784 : 722;
    }

    @Override // com.tencent.mm.network.v0
    public java.lang.String getUri() {
        return o45.ag.f342892a ? "/cgi-bin/micromsg-bin/secencryptcheckresupdate" : "/cgi-bin/micromsg-bin/encryptcheckresupdate";
    }
}
