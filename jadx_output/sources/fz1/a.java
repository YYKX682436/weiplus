package fz1;

/* loaded from: classes13.dex */
public class a implements cz1.b, c01.la {

    /* renamed from: d, reason: collision with root package name */
    public lz1.a f267287d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f267288e = sz1.i.e(new com.tencent.mm.sdk.platformtools.k3() { // from class: fz1.a$$a
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(android.os.Message message) {
            fz1.a aVar = fz1.a.this;
            aVar.getClass();
            switch (message.what) {
                case 1010:
                    try {
                        nm5.b bVar = (nm5.b) message.obj;
                        long longValue = ((java.lang.Long) bVar.a(0)).longValue();
                        if (aVar.f267287d != null) {
                            cy1.a Ui = cy1.a.Ui();
                            ky1.b a17 = ky1.c.a();
                            a17.f313487a = longValue;
                            a17.f313489c = "video_play";
                            Ui.Jj(a17.a());
                            oz1.e.a().f(longValue, "video_play", null, null);
                        }
                    } catch (java.lang.Exception e17) {
                        if (sz1.a.j()) {
                            throw e17;
                        }
                        com.tencent.mars.xlog.Log.e("Amoeba.MultiEventMonitor", "[handleMessage] MSG_VIDEO_PLAY throw Exception : " + e17.getMessage() + ", stackTrace : " + sz1.a.f(e17.getStackTrace()));
                        pz1.a.b(e17.getMessage() + ":" + sz1.a.f(e17.getStackTrace()));
                    }
                    return false;
                case 1011:
                    try {
                        nm5.b bVar2 = (nm5.b) message.obj;
                        long longValue2 = ((java.lang.Long) bVar2.a(0)).longValue();
                        if (aVar.f267287d != null) {
                            cy1.a Ui2 = cy1.a.Ui();
                            ky1.b a18 = ky1.c.a();
                            a18.f313487a = longValue2;
                            a18.f313489c = "video_pause";
                            Ui2.Jj(a18.a());
                            oz1.e.a().f(longValue2, "video_pause", null, null);
                        }
                    } catch (java.lang.Exception e18) {
                        if (sz1.a.j()) {
                            throw e18;
                        }
                        com.tencent.mars.xlog.Log.e("Amoeba.MultiEventMonitor", "[handleMessage] MSG_VIDEO_PAUSE throw Exception : " + e18.getMessage() + ", stackTrace : " + sz1.a.f(e18.getStackTrace()));
                        pz1.a.b(e18.getMessage() + ":" + sz1.a.f(e18.getStackTrace()));
                    }
                    return false;
                case 1012:
                    try {
                        nm5.b bVar3 = (nm5.b) message.obj;
                        long longValue3 = ((java.lang.Long) bVar3.a(0)).longValue();
                        if (aVar.f267287d != null) {
                            cy1.a Ui3 = cy1.a.Ui();
                            ky1.b a19 = ky1.c.a();
                            a19.f313487a = longValue3;
                            a19.f313489c = "video_stop";
                            Ui3.Jj(a19.a());
                            oz1.e.a().f(longValue3, "video_stop", null, null);
                        }
                    } catch (java.lang.Exception e19) {
                        if (sz1.a.j()) {
                            throw e19;
                        }
                        com.tencent.mars.xlog.Log.e("Amoeba.MultiEventMonitor", "[handleMessage] MSG_VIDEO_STOP throw Exception : " + e19.getMessage() + ", stackTrace : " + sz1.a.f(e19.getStackTrace()));
                        pz1.a.b(e19.getMessage() + ":" + sz1.a.f(e19.getStackTrace()));
                    }
                    return false;
                case 1013:
                    try {
                        nm5.d dVar = (nm5.d) message.obj;
                        aVar.a((java.lang.String) dVar.a(0), (java.util.Map) dVar.a(1), (java.util.List) dVar.a(2), ((java.lang.Long) dVar.a(3)).longValue());
                    } catch (java.lang.Exception e27) {
                        if (sz1.a.j()) {
                            throw e27;
                        }
                        com.tencent.mars.xlog.Log.e("Amoeba.MultiEventMonitor", "[handleMessage] MSG_CGI_REQ throw Exception : " + e27.getMessage() + ", stackTrace : " + sz1.a.f(e27.getStackTrace()));
                        pz1.a.b(e27.getMessage() + ":" + sz1.a.f(e27.getStackTrace()));
                    }
                    return false;
                case 1014:
                    try {
                        nm5.f fVar = (nm5.f) message.obj;
                        aVar.b((java.lang.String) fVar.a(0), ((java.lang.Integer) fVar.a(1)).intValue(), (java.lang.String) fVar.a(2), (java.util.Map) fVar.a(3), (java.util.List) fVar.a(4), ((java.lang.Long) fVar.a(5)).longValue());
                    } catch (java.lang.Exception e28) {
                        if (sz1.a.j()) {
                            throw e28;
                        }
                        com.tencent.mars.xlog.Log.e("Amoeba.MultiEventMonitor", "[handleMessage] MSG_CGI_RESP throw Exception : " + e28.getMessage() + ", stackTrace : " + sz1.a.f(e28.getStackTrace()));
                        pz1.a.b(e28.getMessage() + ":" + sz1.a.f(e28.getStackTrace()));
                    }
                    return false;
                default:
                    return false;
            }
        }
    });

    public final void a(java.lang.String str, java.util.Map map, java.util.List list, long j17) {
        lz1.a aVar = this.f267287d;
        if (aVar == null) {
            return;
        }
        lz1.b bVar = (lz1.b) aVar;
        bVar.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("cgi_name", str);
        hashMap.put("app_in_time", java.lang.Long.valueOf(bVar.a()));
        hashMap.putAll(map);
        cy1.a Ui = cy1.a.Ui();
        ky1.b a17 = ky1.c.a();
        a17.f313487a = j17;
        a17.f313489c = "cgi_req";
        a17.b(hashMap);
        a17.c(list);
        Ui.Jj(a17.a());
        oz1.e.a().f(j17, "cgi_req", null, hashMap);
    }

    public final void b(java.lang.String str, int i17, java.lang.String str2, java.util.Map map, java.util.List list, long j17) {
        lz1.a aVar = this.f267287d;
        if (aVar == null) {
            return;
        }
        lz1.b bVar = (lz1.b) aVar;
        bVar.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("cgi_err_code", java.lang.Integer.valueOf(i17));
        hashMap.put("cgi_err_msg", str2);
        hashMap.put("cgi_name", str);
        hashMap.put("app_in_time", java.lang.Long.valueOf(bVar.a()));
        hashMap.putAll(map);
        cy1.a Ui = cy1.a.Ui();
        ky1.b a17 = ky1.c.a();
        a17.f313487a = j17;
        a17.f313489c = "cgi_resp";
        a17.b(hashMap);
        a17.c(list);
        Ui.Jj(a17.a());
        oz1.e.a().f(j17, "cgi_resp", null, hashMap);
    }

    public int c(com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.network.v0 reqResp;
        java.util.Map map;
        if (m1Var != null && (reqResp = m1Var.getReqResp()) != null && cy1.a.Ui().oj() && !sz1.g.i("cgi_req", cy1.a.Ui().hj(reqResp))) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (currentTimeMillis - cy1.a.Ui().Vi(reqResp, "cgi_req") >= cy1.a.Ui().fj(reqResp, "cgi_req")) {
                cy1.a.Ui().Yj(reqResp, "cgi_req", currentTimeMillis);
                vy1.a h17 = uy1.a.h(reqResp, false);
                if (h17 != null) {
                    java.lang.String[] split = reqResp.getUri().split("/");
                    java.lang.String str = (split == null || split.length <= 0) ? null : split[split.length - 1];
                    if (!u46.l.e(str)) {
                        java.util.HashMap hashMap = new java.util.HashMap();
                        java.util.Map map2 = h17.f441416a;
                        if (map2 != null) {
                            hashMap.putAll(map2);
                        }
                        java.util.Map map3 = h17.f441417b;
                        if (map3 != null && (map = (java.util.Map) ((java.util.concurrent.ConcurrentHashMap) map3).get("cgi_req")) != null && map.size() > 0) {
                            hashMap.putAll(map);
                        }
                        java.util.Map i17 = uy1.a.i(reqResp, "cgi_req");
                        if (i17 != null && ((java.util.HashMap) i17).size() > 0) {
                            hashMap.putAll(i17);
                        }
                        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f267288e;
                        android.os.Message obtainMessage = n3Var.obtainMessage(1013);
                        obtainMessage.obj = nm5.j.e(str, hashMap, cy1.a.Ui().ij(reqResp, "cgi_req"), java.lang.Long.valueOf(currentTimeMillis));
                        n3Var.sendMessage(obtainMessage);
                    }
                }
            }
        }
        return 0;
    }
}
