package xz1;

/* loaded from: classes15.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xz1.k f458180d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.net.LocalSocket f458181e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz1.h f458182f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz1.i f458183g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f458184h;

    public h(xz1.k kVar, android.net.LocalSocket localSocket, yz1.h hVar, yz1.i iVar, java.lang.String str) {
        this.f458180d = kVar;
        this.f458181e = localSocket;
        this.f458182f = hVar;
        this.f458183g = iVar;
        this.f458184h = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xz1.k kVar = this.f458180d;
        android.net.LocalSocket localSocket = this.f458181e;
        yz1.h hVar = this.f458182f;
        yz1.i iVar = this.f458183g;
        java.lang.String str = this.f458184h;
        if (!("websocket".equalsIgnoreCase(yz1.n.a(hVar, "Upgrade")) && "Upgrade".equals(yz1.n.a(hVar, "Connection")) && "13".equals(yz1.n.a(hVar, "Sec-WebSocket-Version")))) {
            iVar.f468505c = 501;
            iVar.f468506d = "Not Implemented";
            iVar.f468507e = yz1.f.a("Not a supported WebSocket upgrade request\n", "text/plain");
            return;
        }
        iVar.f468505c = 101;
        iVar.f468506d = "Switching Protocols";
        iVar.a("Upgrade", "websocket");
        iVar.a("Connection", "Upgrade");
        iVar.f468507e = null;
        java.lang.String a17 = yz1.n.a(hVar, "Sec-WebSocket-Key");
        if (a17 != null) {
            try {
                java.lang.String concat = a17.concat("258EAFA5-E914-47DA-95CA-C5AB0DC85B11");
                java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA-1");
                int i17 = yz1.m.f468511a;
                try {
                    messageDigest.update(concat.getBytes(com.tencent.mapsdk.internal.rv.f51270c));
                    iVar.a("Sec-WebSocket-Accept", android.util.Base64.encodeToString(messageDigest.digest(), 2));
                } catch (java.io.UnsupportedEncodingException e17) {
                    throw new java.lang.RuntimeException(e17);
                }
            } catch (java.security.NoSuchAlgorithmException e18) {
                throw new java.lang.RuntimeException(e18);
            }
        }
        java.io.InputStream inputStream = localSocket.getInputStream();
        java.io.OutputStream outputStream = localSocket.getOutputStream();
        yz1.d dVar = new yz1.d(new java.io.BufferedOutputStream(outputStream));
        xz1.d dVar2 = xz1.k.f458187i;
        dVar2.e(iVar, dVar);
        yz1.q qVar = new yz1.q(inputStream, outputStream, kVar, str);
        if (!qVar.f468518e.getAndSet(true)) {
            xz1.k kVar2 = (xz1.k) qVar.f468516c;
            synchronized (kVar2) {
                com.tencent.mars.xlog.Log.i("MicroMsg.DevTools.DevToolsService", "onOpen " + qVar.f468517d);
                qk.u6 u6Var = (qk.u6) kVar2.f458193g.get(qVar.f468517d);
                if (u6Var == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.DevTools.DevToolsService", "onOpen without attachable");
                } else {
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap = kVar2.f458194h;
                    java.lang.String str2 = qVar.f468517d;
                    kotlin.jvm.internal.o.f(str2, "getKey(...)");
                    concurrentHashMap.put(str2, qVar);
                    u6Var.c();
                    com.tencent.mars.xlog.Log.i("MicroMsg.DevTools.DevToolsService", "onOpen after " + dVar2.d(u6Var));
                }
            }
        }
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.DevTools.WebSocketSession", "readloop");
            qVar.f468514a.a(qVar.f468520g);
        } catch (java.io.EOFException unused) {
            qVar.b(1011, "EOF while reading");
        } catch (java.io.IOException e19) {
            qVar.b(1006, null);
            throw e19;
        }
    }
}
