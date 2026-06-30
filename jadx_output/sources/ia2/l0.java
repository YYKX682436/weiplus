package ia2;

/* loaded from: classes2.dex */
public final class l0 implements com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader.IFetchDoneListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ia2.n0 f289942a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.f96 f289943b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f289944c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f289945d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f289946e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f289947f;

    public l0(ia2.n0 n0Var, r45.f96 f96Var, kotlin.jvm.internal.h0 h0Var, int i17, yz5.p pVar, yz5.a aVar) {
        this.f289942a = n0Var;
        this.f289943b = f96Var;
        this.f289944c = h0Var;
        this.f289945d = i17;
        this.f289946e = pVar;
        this.f289947f = aVar;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader.IFetchDoneListener
    public void onFetchDone(com.tencent.mm.plugin.finder.feed.model.internal.IResponse response) {
        r45.v96 v96Var;
        r45.l95 l95Var;
        r45.e95 e95Var;
        int i17;
        r45.bp2 bp2Var;
        java.util.LinkedList list;
        kotlin.jvm.internal.o.g(response, "response");
        kotlin.jvm.internal.h0 h0Var = this.f289944c;
        com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader finderPoiFeedLoader = (com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader) h0Var.f310123d;
        ia2.n0 n0Var = this.f289942a;
        n0Var.getClass();
        if (response.getErrCode() == 0 && response.getErrType() == 0) {
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - n0Var.f289961o;
            n0Var.f289961o = elapsedRealtime;
            com.tencent.pigeon.finder.POIFlutterDataReport pOIFlutterDataReport = n0Var.f289956g;
            if (pOIFlutterDataReport != null) {
                pOIFlutterDataReport.setFeedLoadingTime(elapsedRealtime, ia2.q0.a("setFeedLoadingTime"));
            }
            if (finderPoiFeedLoader.f107546s != null) {
                int i18 = finderPoiFeedLoader.f107547t;
                com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader finderPoiFeedLoader2 = n0Var.f289960n;
                if (finderPoiFeedLoader2 != null && (bp2Var = finderPoiFeedLoader2.f107546s) != null && (list = bp2Var.getList(0)) != null) {
                    java.util.Iterator it = list.iterator();
                    i17 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i17 = -1;
                            break;
                        } else {
                            if (((r45.ap2) it.next()).getInteger(0) == i18) {
                                break;
                            } else {
                                i17++;
                            }
                        }
                    }
                } else {
                    i17 = 0;
                }
                r45.bp2 bp2Var2 = finderPoiFeedLoader.f107546s;
                byte[] initialProtobufBytes = bp2Var2 != null ? bp2Var2.initialProtobufBytes() : null;
                if (initialProtobufBytes == null) {
                    initialProtobufBytes = new byte[0];
                }
                byte[] bArr = initialProtobufBytes;
                int i19 = this.f289945d;
                com.tencent.pigeon.finder.POIStreamUpdateData b17 = n0Var.b(i17, i19, response, true);
                com.tencent.pigeon.finder.POIFlutterAPI pOIFlutterAPI = n0Var.f289955f;
                if (pOIFlutterAPI != null) {
                    pOIFlutterAPI.updateInitPage(bArr, i17, i19, b17, ia2.q0.a("updateInitPage"));
                }
            } else {
                com.tencent.mars.xlog.Log.e("FinderPOIPlugin", "finderpoistream response tabList should not be null!");
            }
            java.lang.Object response2 = response.getResponse();
            r45.zo2 zo2Var = response2 instanceof r45.zo2 ? (r45.zo2) response2 : null;
            r45.n95 n95Var = (zo2Var == null || (v96Var = (r45.v96) zo2Var.getCustom(4)) == null || (l95Var = v96Var.f388009d) == null || (e95Var = l95Var.f379241d) == null) ? null : e95Var.f373166f;
            r45.f96 f96Var = this.f289943b;
            this.f289946e.invoke(java.lang.Float.valueOf(n95Var != null ? n95Var.f381184e : f96Var.getFloat(1)), java.lang.Float.valueOf(n95Var != null ? n95Var.f381183d : f96Var.getFloat(0)));
        } else {
            com.tencent.mars.xlog.Log.e("FinderPOIPlugin", "requestPoiStream failed. error code: " + java.lang.Integer.valueOf(response.getErrCode()) + ", error message: " + response.getErrMsg());
            this.f289947f.invoke();
        }
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.a(kotlinx.coroutines.internal.b0.f310484a), null, null, new ia2.k0(h0Var, this, n0Var, null), 3, null);
        com.tencent.mars.xlog.Log.i("FinderPOIPlugin", "requestPoiStream end");
    }
}
