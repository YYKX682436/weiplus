package xz3;

/* loaded from: classes15.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f458240d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xz3.p f458241e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.fv5 f458242f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f458243g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f458244h;

    public o(int i17, xz3.p pVar, r45.fv5 fv5Var, java.util.List list, java.lang.String str) {
        this.f458240d = i17;
        this.f458241e = pVar;
        this.f458242f = fv5Var;
        this.f458243g = list;
        this.f458244h = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.LinkedList<r45.qi> linkedList;
        java.util.Iterator it;
        int i17 = this.f458240d;
        xz3.p pVar = this.f458241e;
        long j17 = pVar.f458245e;
        sz3.p pVar2 = pVar.f458246f;
        sz3.x0 x0Var = new sz3.x0(i17, j17, pVar2.f413944a, pVar2.f413948e);
        r45.fv5 response = this.f458242f;
        kotlin.jvm.internal.o.g(response, "response");
        java.util.ArrayList arrayList = x0Var.f414151e;
        arrayList.clear();
        x0Var.f414153g = response.BaseResponse.f376959d;
        java.util.LinkedList linkedList2 = response.f374625d;
        if (linkedList2 != null) {
            java.util.Iterator it6 = linkedList2.iterator();
            while (it6.hasNext()) {
                r45.ri riVar = (r45.ri) it6.next();
                if (riVar != null && (linkedList = riVar.f384885h) != null) {
                    for (r45.qi qiVar : linkedList) {
                        if (qiVar != null) {
                            sz3.w0 w0Var = new sz3.w0();
                            w0Var.f414133d = x0Var.f414149c;
                            java.lang.String str = qiVar.f384009g;
                            if (str == null) {
                                str = "";
                            }
                            w0Var.f414139j = str;
                            w0Var.f414138i = qiVar.f384006d;
                            com.tencent.mm.protocal.protobuf.GoodsObject goodsObject = qiVar.f384007e;
                            if (goodsObject == null || goodsObject.obj_w <= 0.0f || goodsObject.obj_h <= 0.0f) {
                                it = it6;
                            } else {
                                it = it6;
                                w0Var.f414140k = new android.graphics.RectF(goodsObject.relative_minx, goodsObject.relative_miny, goodsObject.relative_maxx, goodsObject.relative_maxy);
                            }
                            w0Var.f414145p = response.f374628g;
                            w0Var.f414146q = qiVar.f384010h;
                            java.lang.String str2 = riVar.f384883f;
                            w0Var.f414141l = str2 != null ? str2 : "";
                            w0Var.f414144o = riVar.f384882e;
                            com.tencent.mars.xlog.Log.i("MicroMsg.ScanProductRecognizeResult", "convertFromUploadResponse reqKey: %s, trackId: %s, scanImageType: %s, goodsRect: %s, needPoi: %s, action: %s", w0Var.f414139j, java.lang.Integer.valueOf(w0Var.f414138i), java.lang.Integer.valueOf(w0Var.f414133d), w0Var.f414140k, java.lang.Boolean.valueOf(response.f374627f), w0Var.f414145p);
                            arrayList.add(w0Var);
                            it6 = it;
                        }
                    }
                }
            }
        }
        x0Var.f414152f = pVar2.f413945b.f413964f;
        x0Var.f414154h = pVar2.f413950g;
        com.tencent.mm.plugin.scanner.model.d1.f158850h = false;
        boolean z17 = !arrayList.isEmpty();
        int i18 = this.f458240d;
        if (!z17) {
            java.util.Iterator it7 = this.f458243g.iterator();
            while (it7.hasNext()) {
                int intValue = ((java.lang.Number) it7.next()).intValue();
                sz3.w0 w0Var2 = new sz3.w0();
                pVar.a(pVar2, w0Var2);
                w0Var2.f414138i = intValue;
                w0Var2.f414137h = 3;
                arrayList.add(w0Var2);
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.AiScanImageUploadTask", "onUploadSuccessWrapper failed because of no req key, source: %d, scanImageType: %s, requestTrackIdList: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(pVar2.f413944a), kz5.n0.g0(this.f458243g, ",", null, null, 0, null, null, 62, null));
            if (pVar.f458248h) {
                return;
            }
            pVar.f458247g.d(x0Var, this.f458240d, pVar.f458245e, 4, -1, this.f458244h);
            return;
        }
        java.util.Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            sz3.w0 w0Var3 = (sz3.w0) it8.next();
            pVar.a(pVar2, w0Var3);
            w0Var3.f414137h = 2;
            com.tencent.mm.plugin.scanner.model.c cVar = x0Var.f414152f;
            if (cVar != null) {
                java.lang.String str3 = w0Var3.f414145p;
                cVar.f158831h = (str3 == null || !str3.equals("retrieval_by_req_key_circle_search")) ? 1 : 2;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AiScanImageUploadTask", "onUploadSuccess source: %d, scanImageType: %s, requestTrackIdList: %s, isCancelled: %b", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(pVar2.f413944a), kz5.n0.g0(this.f458243g, ",", null, null, 0, null, null, 62, null), java.lang.Boolean.valueOf(pVar.f458248h));
        if (pVar.f458248h) {
            return;
        }
        pVar.f458247g.c(x0Var);
    }
}
