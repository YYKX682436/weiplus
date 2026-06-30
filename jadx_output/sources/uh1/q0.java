package uh1;

/* loaded from: classes7.dex */
public final class q0 implements mf1.i, uh1.w {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f427866a = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final javax.net.ssl.SSLSocketFactory f427867c;

    /* renamed from: d, reason: collision with root package name */
    public final int f427868d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f427869e;

    public q0(uh1.a aVar) {
        javax.net.ssl.SSLContext p17 = uh1.j0.p(aVar);
        if (p17 != null) {
            this.f427867c = p17.getSocketFactory();
        }
        this.f427869e = aVar.B;
        this.f427868d = aVar.f427746m;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNetworkWebSocket", "mTLSSkipHostnameCheck is %b", java.lang.Boolean.valueOf(aVar.G));
    }

    @Override // mf1.i
    public mf1.k a(java.lang.String str) {
        if (str == null) {
            return null;
        }
        synchronized (this.f427866a) {
            java.util.Iterator it = this.f427866a.iterator();
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
        javax.net.ssl.SSLSocket sSLSocket;
        java.lang.String[] supportedCipherSuites;
        synchronized (this.f427866a) {
            if (this.f427866a.size() >= this.f427868d) {
                ((yc1.o) hVar).b("max connected");
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNetworkWebSocket", "max connected mTaskList.size():%d,mMaxWebsocketConnect:%d", java.lang.Integer.valueOf(this.f427866a.size()), java.lang.Integer.valueOf(this.f427868d));
                return;
            }
            java.lang.String optString = jSONObject.optString("url");
            try {
                java.net.URI uri = new java.net.URI(optString);
                boolean optBoolean = jSONObject.optBoolean("tcpNoDelay", false);
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNetworkWebSocket", "connectSocket, url= %s, timeout = %d, tcpNoDelay = %b, taskId=%s", optString, java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(optBoolean), str2);
                map.put("User-Agent", this.f427869e);
                java.lang.String C = uh1.j0.C(jSONObject);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(C)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNetworkWebSocket", "protocols %s", C);
                    map.put("Sec-WebSocket-Protocol", C);
                }
                java.lang.String j17 = uh1.j0.j(uri);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(j17)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNetworkWebSocket", "Origin %s", j17);
                    map.put("Origin", j17);
                }
                try {
                    uh1.k0 k0Var = new uh1.k0(this, uri, new uk1.f(), map, i18, optString, str2, hVar);
                    k0Var.f419906s = str2;
                    k0Var.f408937d = optBoolean;
                    if (nf.z.d(optString, "ws://")) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNetworkWebSocket", "url is %s ,user ws connect", optString);
                        k0Var.s(new java.net.Socket(java.net.Proxy.NO_PROXY));
                        k0Var.i();
                        h(k0Var);
                        java.util.Timer timer = new java.util.Timer("AppNetSocket");
                        uh1.l0 l0Var = new uh1.l0(this, k0Var, hVar, timer);
                        k0Var.f419907t = timer;
                        timer.schedule(l0Var, i18);
                        return;
                    }
                    if (!nf.z.d(optString, "wss://")) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNetworkWebSocket", "url error: %s not ws:// or wss://", optString);
                        ((yc1.o) hVar).b("url not ws or wss");
                        return;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNetworkWebSocket", "url is %s ,user wss connect", optString);
                    javax.net.ssl.SSLSocketFactory sSLSocketFactory = this.f427867c;
                    if (sSLSocketFactory == null) {
                        sSLSocketFactory = (javax.net.ssl.SSLSocketFactory) javax.net.ssl.SSLSocketFactory.getDefault();
                    }
                    k0Var.s(sSLSocketFactory.createSocket());
                    if ((str.equals("wx577c74fb940daaea") || str.equals("wx850d691fd02de8a1")) && (supportedCipherSuites = (sSLSocket = (javax.net.ssl.SSLSocket) k0Var.f419897g).getSupportedCipherSuites()) != null) {
                        sSLSocket.setEnabledCipherSuites(supportedCipherSuites);
                    }
                    k0Var.i();
                    h(k0Var);
                    java.util.Timer timer2 = new java.util.Timer("AppTestSocket");
                    uh1.m0 m0Var = new uh1.m0(this, k0Var, hVar, timer2);
                    k0Var.f419907t = timer2;
                    timer2.schedule(m0Var, i18);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandNetworkWebSocket", e17, "Exception: url %s", optString);
                    ((yc1.o) hVar).c(e17.getMessage());
                }
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandNetworkWebSocket", e18, "Exception: connect fail", new java.lang.Object[0]);
                ((yc1.o) hVar).b("url not well format");
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
        kVar.e(byteBuffer);
    }

    @Override // mf1.i
    public void f(mf1.k kVar) {
        if (kVar != null) {
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNetworkWebSocket", "try to close socket");
                kVar.close();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandNetworkWebSocket", e17, "Exception: send error", new java.lang.Object[0]);
                j(kVar);
            }
            i(kVar);
        }
    }

    @Override // mf1.i
    public void g(mf1.k kVar, int i17, java.lang.String str) {
        if (kVar != null) {
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNetworkWebSocket", "try to close socket");
                kVar.a(str, i17);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandNetworkWebSocket", e17, "Exception: send error", new java.lang.Object[0]);
            }
            i(kVar);
        }
    }

    public final void h(mf1.k kVar) {
        if (kVar == null) {
            return;
        }
        synchronized (this.f427866a) {
            if ("0".equals(kVar.getTaskId())) {
                this.f427866a.clear();
            }
            this.f427866a.add(kVar);
        }
    }

    public final synchronized void i(mf1.k kVar) {
        if (kVar == null) {
            return;
        }
        synchronized (this.f427866a) {
            this.f427866a.remove(kVar);
        }
    }

    public final void j(mf1.k kVar) {
        if (kVar == null) {
            return;
        }
        java.util.Timer c17 = kVar.c();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNetworkWebSocket", "try to stop connectTimer");
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
