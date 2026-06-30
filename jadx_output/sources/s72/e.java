package s72;

/* loaded from: classes11.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f404018d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(kotlinx.coroutines.q qVar, java.lang.String str) {
        super(1);
        this.f404018d = qVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        s72.a it = (s72.a) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[doScene] errorType = ");
        int i17 = it.f403982a;
        sb6.append(i17);
        sb6.append(", errorCode = ");
        int i18 = it.f403983b;
        sb6.append(i18);
        sb6.append(", errorMsg = ");
        java.lang.String str = it.f403984c;
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.FavSyncRequestWrapper", sb6.toString());
        boolean z17 = i17 == 0 && i18 == 0;
        if (((a82.h2) ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).Aj()).f2013f) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavSyncRequestWrapper", "[doScene] sending item, return");
        } else {
            kotlinx.coroutines.q qVar = this.f404018d;
            if (z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FavSyncRequestWrapper", "[doScene] favSync cgi success");
                kotlinx.coroutines.r rVar = (kotlinx.coroutines.r) qVar;
                if (rVar.n()) {
                    com.tencent.mm.network.v0 v0Var = it.f403985d;
                    kotlin.jvm.internal.o.e(v0Var, "null cannot be cast to non-null type com.tencent.mm.modelbase.CommReqResp");
                    com.tencent.mm.protobuf.f fVar = ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
                    kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FavSyncResponse");
                    rVar.resumeWith(kotlin.Result.m521constructorimpl((r45.lq0) fVar));
                }
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.FavSyncRequestWrapper", "[doScene] favsync cgi fail, error type = " + i17 + ", errorCode = " + i18);
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new s72.b("/cgi-bin/micromsg-bin/favsync", i17, i18, str))));
            }
        }
        return jz5.f0.f302826a;
    }
}
