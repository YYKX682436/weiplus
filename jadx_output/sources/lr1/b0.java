package lr1;

/* loaded from: classes8.dex */
public final class b0 implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.fj f320641a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f320642b;

    public b0(r45.fj fjVar, int i17) {
        this.f320641a = fjVar;
        this.f320642b = i17;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public final void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        lr1.c0 c0Var = lr1.c0.f320643a;
        com.tencent.mars.xlog.Log.i("MicroMsg.MPDataLogic", "getAppMsgRelatedInfo errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
        java.util.LinkedList UrlInfo = this.f320641a.f374391d;
        kotlin.jvm.internal.o.f(UrlInfo, "UrlInfo");
        java.util.Iterator it = UrlInfo.iterator();
        while (it.hasNext()) {
            lr1.c0.f320644b.remove(((r45.u9) it.next()).f387146d);
        }
        if (i17 == 0 && i18 == 0) {
            com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.BizAppMsgRelatedInfoResp");
            r45.gj gjVar = (r45.gj) fVar;
            lr1.c0 c0Var2 = lr1.c0.f320643a;
            com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("MicroMsg.MPDataLogic");
            M.A("BizAppMsgRelatedInfoRefreshIntervalSec", gjVar.f375291e);
            int i19 = qs1.n.f366255b;
            M.A("BizAppMsgRelatedInfoMaxUrlCount", gjVar.f375292f);
            if (com.tencent.mm.sdk.platformtools.t8.L0(gjVar.f375290d)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MPDataLogic", "getAppMsgRelatedInfo RelatedInfo is empty");
                return;
            }
            ((ku5.t0) ku5.t0.f312615d).h(new lr1.a0(gjVar, this.f320641a, this.f320642b), "getAppMsgRelatedInfo");
        }
    }
}
