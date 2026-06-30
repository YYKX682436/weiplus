package cv4;

/* loaded from: classes8.dex */
public final class m implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cv4.n f222591d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f222592e;

    public m(cv4.n nVar, java.lang.String str) {
        this.f222591d = nVar;
        this.f222592e = str;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        r45.f03 I0;
        cv4.n nVar = this.f222591d;
        nVar.getClass();
        u83.c cVar = new u83.c();
        java.lang.String str = this.f222592e;
        cVar.j(str);
        cVar.l(false);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0(str);
            u83.a A = (L0 == null || (I0 = L0.I0(str)) == null) ? null : nVar.A(str, L0, I0, L0.K.size());
            if (A != null) {
                cVar.l(true);
                cVar.k(A);
            }
        }
        org.json.JSONObject json = cVar.toJson();
        json.putOpt("retCode", "0");
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiObserveUniformReddot", "observeUniformReddot, result: " + json);
        long j17 = nVar.f143442e.f299024a;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppJsApiObserveUniformReddot", "notifyJSEvent, liteAppUuid: " + j17 + ", funcName: onUniformReddotDataChanged, paramsJson: " + json);
        try {
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Vj(j17, "onUniformReddotDataChanged", json);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LiteAppJsApiObserveUniformReddot", e17, "notifyJSEvent", new java.lang.Object[0]);
        }
    }
}
