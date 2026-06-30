package oq3;

/* loaded from: classes12.dex */
public final class g extends jm0.g implements com.tencent.mm.modelbase.u0 {

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f347383f;

    /* renamed from: g, reason: collision with root package name */
    public final long f347384g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(jm0.o plugin) {
        super(plugin);
        kotlin.jvm.internal.o.g(plugin, "plugin");
        this.f347383f = new java.util.ArrayList();
        this.f347384g = 60000L;
    }

    public final void T6() {
        fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
        nVar.requireAccountInitialized();
        pq3.j jVar = nVar.B;
        kotlin.jvm.internal.o.f(jVar, "getC2CMsgPreDownloader(...)");
        jVar.h(false);
        fq3.n nVar2 = (fq3.n) i95.n0.c(fq3.n.class);
        nVar2.requireAccountInitialized();
        nVar2.B.g();
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PreDownloadCheckPLC", "pre download cgi scene end, errType:" + i17 + ", errCode:" + i18 + ", errMsg:" + str);
        if (i17 == 0 && i18 == 0) {
            kotlin.jvm.internal.o.e(m1Var, "null cannot be cast to non-null type com.tencent.mm.plugin.priority.model.precheck.NetScenePredownloadCheck");
            com.tencent.mm.protobuf.f fVar = ((oq3.d) m1Var).f347380e.f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.PrevDownloadCheckResponse");
            ((ku5.t0) ku5.t0.f312615d).g(new oq3.e((r45.kc5) fVar));
            return;
        }
        fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
        nVar.requireAccountInitialized();
        kq3.k kVar = nVar.f265536u.f311279b;
        if (kVar != null) {
            kVar.sendEmptyMessageDelayed(2, 300000L);
        }
    }
}
