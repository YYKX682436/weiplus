package ny1;

/* loaded from: classes13.dex */
public class j extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f341408d;

    /* renamed from: e, reason: collision with root package name */
    public final ny1.a f341409e;

    /* renamed from: f, reason: collision with root package name */
    public final ny1.k f341410f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f341411g;

    /* renamed from: h, reason: collision with root package name */
    public long f341412h = 0;

    public j(ny1.a aVar, ny1.k kVar) {
        this.f341409e = aVar;
        this.f341410f = kVar;
        kVar.getClass();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = kVar.f341416c;
        if (concurrentLinkedQueue != null) {
            java.util.Iterator it = concurrentLinkedQueue.iterator();
            while (it.hasNext()) {
                linkedList.add((r45.pq5) it.next());
            }
        }
        this.f341411g = linkedList;
    }

    public final java.lang.String H() {
        java.lang.String str;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer();
        java.util.Iterator it = this.f341411g.iterator();
        while (it.hasNext()) {
            r45.pq5 pq5Var = (r45.pq5) it.next();
            int i17 = ny1.k.f341413k;
            try {
                java.lang.String optString = new org.json.JSONObject(pq5Var.f383316g).optString("feedid", "null");
                r45.nq5 nq5Var = pq5Var.f383313d;
                str = java.lang.String.format("%s_[%s]_[%s]_[%s]_[%s]", nq5Var.f381603e, pq5Var.f383314e, optString, nq5Var.f381607i, pq5Var.f383317h);
            } catch (java.lang.NullPointerException | org.json.JSONException | java.lang.Exception unused) {
                str = "";
            }
            stringBuffer.append(str);
            stringBuffer.append("||");
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            java.lang.String str2 = pq5Var.f383317h;
            try {
                n51.f.b(jSONObject, "item_type", java.lang.Integer.valueOf(pq5Var.f383313d.f381602d));
                n51.f.b(jSONObject, ya.b.ITEM_ID, pq5Var.f383313d.f381603e);
                n51.f.b(jSONObject, "sdk_session_id", pq5Var.f383313d.f381607i);
                jSONObject.put("curPageJson", new org.json.JSONObject(pq5Var.f383313d.f381604f));
                jSONObject.put("refPageJson", new org.json.JSONObject(pq5Var.f383313d.f381606h));
                jSONObject.put("sourcePageJson", new org.json.JSONObject(pq5Var.f383313d.f381605g));
                n51.f.b(jSONObject, "event_id", pq5Var.f383314e);
                n51.f.f335114a.d(jSONObject, "event_time", pq5Var.f383315f, false);
                jSONObject.toString();
            } catch (org.json.JSONException | java.lang.Exception unused2) {
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SDKCGIReport.NetSceneCliReportData", "simpleInfo %s", stringBuffer.toString());
        return stringBuffer2.toString();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        ny1.k kVar = this.f341410f;
        ny1.a aVar = this.f341409e;
        this.f341408d = u0Var;
        try {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            this.f341412h = android.os.SystemClock.elapsedRealtime();
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            lVar.f70664a = new r45.qq5();
            lVar.f70665b = new r45.rq5();
            lVar.f70666c = aVar.f341397c;
            lVar.f70667d = aVar.f341396b;
            lVar.f70668e = 0;
            lVar.f70669f = 0;
            com.tencent.mm.modelbase.o a17 = lVar.a();
            r45.qq5 qq5Var = (r45.qq5) a17.f70710a.f70684a;
            qq5Var.f384206e = "3.1.1";
            qq5Var.f384205d = aVar.f341395a;
            java.util.LinkedList linkedList = this.f341411g;
            qq5Var.f384210i = linkedList;
            r45.uq5 uq5Var = new r45.uq5();
            qq5Var.f384207f = uq5Var;
            uq5Var.f387577d = java.lang.System.currentTimeMillis();
            qq5Var.f384207f.f387578e = c01.id.c();
            qq5Var.f384211m = kVar.f341423j;
            long j17 = qq5Var.f384207f.f387577d;
            android.os.SystemClock.elapsedRealtime();
            qq5Var.f384209h = sz1.a.d();
            qy1.g.m(qq5Var.computeSize(), kVar.f341415b);
            H();
            jx3.f.INSTANCE.t(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_PLAY_LOADING, 0);
            java.lang.Object[] objArr = new java.lang.Object[5];
            objArr[0] = java.lang.Integer.valueOf(hashCode());
            objArr[1] = aVar;
            objArr[2] = java.lang.Integer.valueOf(linkedList != null ? linkedList.size() : 0);
            objArr[3] = java.lang.Integer.valueOf(qq5Var.computeSize());
            objArr[4] = java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - this.f341412h);
            com.tencent.mars.xlog.Log.i("MicroMsg.SDKCGIReport.NetSceneCliReportData", "NetSceneCliReportData doscene [%d] info[%s] dataList[%d] req[%d] cost[%d]", objArr);
            return dispatch(sVar, a17, this);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SDKCGIReport.NetSceneCliReportData", "do scene error[%s]", e17.toString());
            return -1;
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return this.f341409e.f341396b;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        long j17 = this.f341412h;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
        int q17 = com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) jx3.f.y((int) (elapsedRealtime / 1000), new int[]{1, 2, 3, 4}, 6, 10));
        com.tencent.mars.xlog.Log.i("MicroMsg.SDKCGIReport.NetSceneCliReportData", "on gy end [%d]. errType[%d] erroCode[%d] errMsg[%s] cost[%d] res[%d]", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, java.lang.Long.valueOf(elapsedRealtime), java.lang.Integer.valueOf(q17));
        if (i18 == 0 && i19 == 0) {
            jx3.f fVar = jx3.f.INSTANCE;
            fVar.t(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_PLAY_LOADING, 1);
            fVar.t(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_PLAY_LOADING, q17);
            r45.rq5 rq5Var = (r45.rq5) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
            if (rq5Var != null) {
                long j18 = rq5Var.f385124d;
                ny1.k kVar = this.f341410f;
                kVar.f341419f = j18;
                kVar.f341420g = rq5Var.f385125e;
                long j19 = kVar.f341423j;
                long j27 = rq5Var.f385127g;
                if (j19 != j27) {
                    kVar.f341423j = j27;
                    kVar.f341422i.addAll(rq5Var.f385126f);
                }
            }
        } else {
            jx3.f.INSTANCE.t(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_PLAY_LOADING, 2);
        }
        this.f341408d.onSceneEnd(i18, i19, str, this);
    }
}
