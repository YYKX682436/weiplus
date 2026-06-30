package ia2;

/* loaded from: classes2.dex */
public final class i0 implements com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader.IFetchDoneListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f289929a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f289930b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader f289931c;

    public i0(yz5.l lVar, java.lang.String str, com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader finderPoiFeedLoader) {
        this.f289929a = lVar;
        this.f289930b = str;
        this.f289931c = finderPoiFeedLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader.IFetchDoneListener
    public void onFetchDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response) {
        kotlin.jvm.internal.o.g(response, "response");
        int errCode = response.getErrCode();
        yz5.l lVar = this.f289929a;
        if (errCode != 0) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new com.tencent.pigeon.finder.FlutterError("POIRequest" + this.f289930b + "Error", "errorCode:" + response.getErrCode(), null, 4, null)))));
        } else {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE)));
        }
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.a(kotlinx.coroutines.internal.b0.f310484a), null, null, new ia2.h0(this.f289931c, this, null), 3, null);
    }
}
