package z43;

/* loaded from: classes8.dex */
public class o extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        com.tencent.mm.plugin.game.commlib.util.e eVar = com.tencent.mm.plugin.game.commlib.util.g.f139404b;
        eVar.a();
        eVar.getClass();
        hashMap.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, (java.lang.String) com.tencent.mm.plugin.game.commlib.util.g.f139405c.b(eVar, com.tencent.mm.plugin.game.commlib.util.e.f139402a[0]));
        long optLong = jSONObject.optLong(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_SSID);
        java.lang.String url = jSONObject.optString("url");
        jSONObject.optString("liteAppPath");
        java.lang.String extInfo = jSONObject.optString("liteAppReportExtInfoDict");
        if (!"".equals(extInfo)) {
            e53.e eVar2 = e53.e.f249632a;
            kotlin.jvm.internal.o.g(url, "url");
            kotlin.jvm.internal.o.g(extInfo, "extInfo");
            e53.e.f249635d.put(url, extInfo);
        }
        jd.c cVar = this.f143442e;
        long j17 = cVar.f299024a;
        e53.e.f249637f = j17;
        java.util.List list = e53.e.f249636e;
        java.util.Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            long j18 = cVar.f299026c;
            if (hasNext) {
                e53.d dVar = (e53.d) it.next();
                if (kotlin.jvm.internal.o.b(dVar.f249626a, str) && dVar.f249630e == j17 && dVar.f249631f == j18) {
                    dVar.f249627b = java.lang.System.currentTimeMillis();
                    break;
                }
            } else {
                e53.d dVar2 = new e53.d();
                dVar2.f249626a = str;
                dVar2.f249630e = j17;
                dVar2.f249631f = j18;
                dVar2.f249627b = java.lang.System.currentTimeMillis();
                dVar2.f249628c = optLong;
                dVar2.f249629d = url;
                ((java.util.LinkedList) list).add(dVar2);
                if (e53.e.f249633b == null) {
                    final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
                    e53.e.f249633b = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.LiteAppShowStatusChangeEvent>(a0Var) { // from class: com.tencent.mm.plugin.game.luggage.report.PageTimeReport27743$registerReportListener$1
                        {
                            this.__eventId = 353844568;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:49:0x00bf A[Catch: JSONException -> 0x00c4, TRY_LEAVE, TryCatch #0 {JSONException -> 0x00c4, blocks: (B:42:0x00aa, B:44:0x00b3, B:49:0x00bf), top: B:41:0x00aa }] */
                        /* JADX WARN: Removed duplicated region for block: B:52:0x00d7  */
                        @Override // com.tencent.mm.sdk.event.IListener
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public boolean callback(com.tencent.mm.autogen.events.LiteAppShowStatusChangeEvent r23) {
                            /*
                                Method dump skipped, instructions count: 290
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.game.luggage.report.PageTimeReport27743$registerReportListener$1.callback(com.tencent.mm.sdk.event.IEvent):boolean");
                        }
                    };
                }
                com.tencent.mm.sdk.event.IListener iListener = e53.e.f249633b;
                if (iListener != null) {
                    iListener.alive();
                }
                e53.e.f249634c.alive();
            }
        }
        this.f143443f.b(hashMap);
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public int z() {
        return 1;
    }
}
