package xz3;

/* loaded from: classes15.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xz3.j f458225d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.cv5 f458226e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f458227f;

    public i(xz3.j jVar, r45.cv5 cv5Var, int i17) {
        this.f458225d = jVar;
        this.f458226e = cv5Var;
        this.f458227f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xz3.j jVar = this.f458225d;
        sz3.x0 x0Var = jVar.f458229f.f414075h;
        x0Var.getClass();
        r45.cv5 response = this.f458226e;
        kotlin.jvm.internal.o.g(response, "response");
        java.util.LinkedList results = response.f371854d;
        kotlin.jvm.internal.o.f(results, "results");
        java.util.Iterator it = results.iterator();
        int i17 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            int i18 = 1;
            java.util.ArrayList arrayList = x0Var.f414151e;
            int i19 = 4;
            if (!hasNext) {
                java.util.Iterator it6 = arrayList.iterator();
                while (it6.hasNext()) {
                    sz3.w0 productItem = (sz3.w0) it6.next();
                    sz3.n request = jVar.f458229f;
                    kotlin.jvm.internal.o.g(request, "request");
                    kotlin.jvm.internal.o.g(productItem, "productItem");
                    productItem.f414131b = request.f413947d;
                    productItem.f414132c = request.f413946c;
                    productItem.f414133d = request.f413944a;
                    productItem.f414134e = request.f413945b;
                    productItem.f414137h = 4;
                    com.tencent.mm.plugin.scanner.model.c cVar = x0Var.f414152f;
                    if (cVar != null) {
                        java.lang.String str = productItem.f414145p;
                        cVar.f158831h = (str == null || !str.equals("retrieval_by_req_key_circle_search")) ? 1 : 2;
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.AiScanImageRetrievalTask", "onRetrievalSuccess source: %d, isCancelled: %b, requestTrackIdList: %s", java.lang.Integer.valueOf(this.f458227f), java.lang.Boolean.valueOf(jVar.f458232i), kz5.n0.g0(jVar.f458233m, ",", null, null, 0, null, null, 62, null));
                if (jVar.f458232i) {
                    return;
                }
                jVar.f458230g.h(x0Var);
                return;
            }
            java.lang.Object next = it.next();
            int i27 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            r45.ls5 ls5Var = (r45.ls5) next;
            sz3.w0 w0Var = (sz3.w0) kz5.n0.a0(arrayList, i17);
            if (w0Var != null) {
                java.lang.String str2 = ls5Var.f379803d;
                if (str2 == null) {
                    str2 = "";
                }
                w0Var.f414141l = str2;
                java.lang.String str3 = ls5Var.f379804e;
                w0Var.f414142m = str3 != null ? str3 : "";
                int i28 = ls5Var.f379805f;
                if (i28 != 0) {
                    if (i28 != 1) {
                        i18 = 3;
                        if (i28 != 2) {
                            if (i28 != 3) {
                                i19 = 0;
                            }
                        }
                    } else {
                        i19 = 2;
                    }
                    w0Var.f414143n = i19;
                    w0Var.f414144o = ls5Var.f379806g;
                    w0Var.f414145p = response.f371856f;
                    w0Var.f414146q = ls5Var.f379807h;
                    com.tencent.mars.xlog.Log.i("MicroMsg.ScanProductRecognizeResult", "updateFromRetrievalResponse scanImageType: " + w0Var.f414133d + ", " + w0Var);
                }
                i19 = i18;
                w0Var.f414143n = i19;
                w0Var.f414144o = ls5Var.f379806g;
                w0Var.f414145p = response.f371856f;
                w0Var.f414146q = ls5Var.f379807h;
                com.tencent.mars.xlog.Log.i("MicroMsg.ScanProductRecognizeResult", "updateFromRetrievalResponse scanImageType: " + w0Var.f414133d + ", " + w0Var);
            }
            i17 = i27;
        }
    }
}
