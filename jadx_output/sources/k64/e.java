package k64;

/* loaded from: classes.dex */
public final class e implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k64.g f304589d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f304590e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.o f304591f;

    public e(k64.g gVar, yz5.l lVar, com.tencent.mm.modelbase.o oVar) {
        this.f304589d = gVar;
        this.f304590e = lVar;
        this.f304591f = oVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public final void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$requestCgi$3");
        this.f304589d.setHasCallbackToQueue(true);
        if (str == null) {
            str = "";
        }
        com.tencent.mm.protobuf.f fVar = this.f304591f.f70711b.f70700a;
        this.f304590e.invoke(new k64.b(i17, i18, str, fVar instanceof r45.js5 ? (r45.js5) fVar : null));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSceneEnd", "com.tencent.mm.plugin.sns.ad.netscene.CgiRequestHelper$requestCgi$3");
    }
}
