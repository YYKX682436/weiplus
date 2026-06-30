package mf1;

/* loaded from: classes7.dex */
public class c implements mf1.i {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f326030b;

    /* renamed from: c, reason: collision with root package name */
    public final int f326031c;

    /* renamed from: d, reason: collision with root package name */
    public final uh1.a f326032d;

    public c(uh1.a aVar) {
        this.f326030b = aVar.B;
        this.f326031c = aVar.f427746m;
        this.f326032d = aVar;
    }

    @Override // mf1.i
    public mf1.k a(java.lang.String str) {
        if (str == null) {
            return null;
        }
        java.util.ArrayList arrayList = mf1.i.f326054a;
        synchronized (arrayList) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                mf1.k kVar = (mf1.k) it.next();
                if (str.equals(kVar.getTaskId())) {
                    return kVar;
                }
            }
            return null;
        }
    }

    @Override // mf1.i
    public void b(mf1.k kVar, java.lang.String str) {
        if (kVar != null) {
            kVar.d(str);
        }
    }

    @Override // mf1.i
    public void c(java.lang.String str, java.lang.String str2, int i17, int i18, org.json.JSONObject jSONObject, java.util.Map map, mf1.h hVar) {
        mf1.h hVar2;
        java.lang.String str3;
        mf1.f fVar;
        java.util.ArrayList arrayList = mf1.i.f326054a;
        synchronized (arrayList) {
            try {
                if (arrayList.size() >= this.f326031c) {
                    ((yc1.o) hVar).b("max connected");
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNetworkWcWssSocket", "max connected mTaskList.size():%d,mMaxWebsocketConnect:%d", java.lang.Integer.valueOf(arrayList.size()), java.lang.Integer.valueOf(this.f326031c));
                    return;
                }
                java.lang.String optString = jSONObject.optString("url");
                try {
                    java.net.URI uri = new java.net.URI(optString);
                    boolean optBoolean = jSONObject.optBoolean("tcpNoDelay", false);
                    boolean optBoolean2 = jSONObject.optBoolean("perMessageDeflate", false);
                    map.put("User-Agent", this.f326030b);
                    java.lang.String C = uh1.j0.C(jSONObject);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(C)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNetworkWcWssSocket", "protocols %s", C);
                        map.put("Sec-WebSocket-Protocol", C);
                    }
                    java.lang.String j17 = uh1.j0.j(uri);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(j17)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNetworkWcWssSocket", "Origin %s", j17);
                        map.put("Origin", j17);
                    }
                    boolean d17 = nf.z.d(optString, "ws://");
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNetworkWcWssSocket", "connectSocket, taskId=%s, url= %s, appType = %d, timeout = %d, tcpNoDelay = %b, skipDimain = %b, perMessageDeflate = %b", str2, optString, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(optBoolean), java.lang.Boolean.valueOf(d17), java.lang.Boolean.valueOf(optBoolean2));
                    try {
                        fVar = new mf1.f(str, optString, uri, map, new com.tencent.websocket.WssConfig(i18, i18, optBoolean, d17, i17, optBoolean2), new java.util.ArrayList(), this.f326032d);
                        str3 = optString;
                        hVar2 = hVar;
                    } catch (java.lang.Exception e17) {
                        e = e17;
                        hVar2 = hVar;
                        str3 = optString;
                    }
                    try {
                        mf1.a aVar = new mf1.a(this, str2, fVar, hVar, str3);
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWcWssSocket", "setCallBack");
                        fVar.f326050r = aVar;
                        fVar.f326051s = new mf1.d(fVar);
                        fVar.f326046n = str2;
                        if (!nf.z.d(str3, "ws://") && !nf.z.d(str3, "wss://")) {
                            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandNetworkWcWssSocket", "url error: %s not ws:// or wss://", str3);
                            ((yc1.o) hVar2).b("url not ws or wss");
                            return;
                        }
                        java.util.Timer timer = new java.util.Timer("AppWcSocket");
                        mf1.b bVar = new mf1.b(this, fVar, hVar2, timer);
                        synchronized (arrayList) {
                            if ("0".equals(fVar.f326046n)) {
                                arrayList.clear();
                            }
                            arrayList.add(fVar);
                        }
                        fVar.f326048p = timer;
                        timer.schedule(bVar, i18);
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWcWssSocket", "connect");
                        if (fVar.f326042g == null) {
                            ((mf1.a) fVar.f326050r).a("header is null");
                            return;
                        }
                        int a17 = com.tencent.websocket.WcWss.a(fVar.f326051s, fVar.f326039d, fVar.f326040e, fVar.f326043h.toArray(), fVar.f326044i.toArray(), null, fVar.f326045m, fVar.f326049q.toArray());
                        fVar.f326047o = a17;
                        if (a17 < 0) {
                            ((mf1.a) fVar.f326050r).a("call connect fail code:" + fVar.f326047o);
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWcWssSocket", "connect mWcWssId:%s", java.lang.Integer.valueOf(fVar.f326047o));
                    } catch (java.lang.Exception e18) {
                        e = e18;
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandNetworkWcWssSocket", e, "Exception: url %s", str3);
                        ((yc1.o) hVar2).c(e.getMessage());
                    }
                } catch (java.lang.Exception e19) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandNetworkWcWssSocket", e19, "connect fail Exception", new java.lang.Object[0]);
                    ((yc1.o) hVar).b("url not well format");
                }
            } catch (java.lang.Throwable th6) {
                th = th6;
                while (true) {
                    try {
                        break;
                    } catch (java.lang.Throwable th7) {
                        th = th7;
                    }
                }
                throw th;
            }
        }
    }

    @Override // mf1.i
    public boolean d(mf1.k kVar) {
        if (kVar != null) {
            return kVar.isOpen();
        }
        return false;
    }

    @Override // mf1.i
    public void e(mf1.k kVar, java.nio.ByteBuffer byteBuffer) {
        if (kVar != null) {
            kVar.e(byteBuffer);
        }
    }

    @Override // mf1.i
    public void f(mf1.k kVar) {
        if (kVar != null) {
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNetworkWcWssSocket", "try to close socket");
                kVar.close();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandNetworkWcWssSocket", e17, "send error Exception", new java.lang.Object[0]);
                i(kVar);
            }
            h(kVar);
        }
    }

    @Override // mf1.i
    public void g(mf1.k kVar, int i17, java.lang.String str) {
        if (kVar != null) {
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNetworkWcWssSocket", "try to close socket code:%d,reason:%s", java.lang.Integer.valueOf(i17), str);
                kVar.a(str, i17);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandNetworkWcWssSocket", e17, "send error Exception", new java.lang.Object[0]);
            }
            h(kVar);
        }
    }

    public final synchronized void h(mf1.k kVar) {
        if (kVar == null) {
            return;
        }
        java.util.ArrayList arrayList = mf1.i.f326054a;
        synchronized (arrayList) {
            arrayList.remove(kVar);
        }
    }

    public final void i(mf1.k kVar) {
        if (kVar == null) {
            return;
        }
        java.util.Timer c17 = kVar.c();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNetworkWcWssSocket", "try to stop connectTimer");
        if (c17 != null) {
            c17.cancel();
            kVar.b(null);
        }
    }

    @Override // mf1.i
    public void release() {
        f(a("0"));
    }
}
