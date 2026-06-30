package com.tencent.mm.pluginsdk.res.downloader.checkresupdate;

/* loaded from: classes12.dex */
public class o0 extends com.tencent.mm.pluginsdk.res.downloader.checkresupdate.m0 {
    @Override // com.tencent.mm.pluginsdk.res.downloader.checkresupdate.m0
    public com.tencent.mm.network.v0 H() {
        com.tencent.mm.pluginsdk.res.downloader.checkresupdate.n0 n0Var = new com.tencent.mm.pluginsdk.res.downloader.checkresupdate.n0();
        o45.lh lhVar = n0Var.f189628a;
        lhVar.setUin(0);
        lhVar.f342975a.f375310e.f374405d.f371238d.addAll(this.f189624e);
        return n0Var;
    }

    @Override // com.tencent.mm.pluginsdk.res.downloader.checkresupdate.m0
    public java.lang.String I() {
        return "MicroMsg.NetSceneEncryptCheckResUpdate";
    }

    @Override // com.tencent.mm.pluginsdk.res.downloader.checkresupdate.m0
    public r45.d20 J(com.tencent.mm.network.v0 v0Var) {
        return ((com.tencent.mm.pluginsdk.res.downloader.checkresupdate.n0) v0Var).f189629b.f342982a;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return o45.ag.f342892a ? 784 : 722;
    }
}
