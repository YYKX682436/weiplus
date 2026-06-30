package mf1;

/* loaded from: classes7.dex */
public class f implements mf1.k {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f326039d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f326040e;

    /* renamed from: f, reason: collision with root package name */
    public final java.net.URI f326041f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f326042g;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.websocket.WssConfig f326045m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f326046n;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.ArrayList f326049q;

    /* renamed from: r, reason: collision with root package name */
    public mf1.j f326050r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.websocket.a f326051s;

    /* renamed from: u, reason: collision with root package name */
    public final javax.net.ssl.X509TrustManager f326053u;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f326043h = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f326044i = new java.util.ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public int f326047o = -1;

    /* renamed from: p, reason: collision with root package name */
    public java.util.Timer f326048p = null;

    /* renamed from: t, reason: collision with root package name */
    public mf1.e f326052t = mf1.e.NOT_YET_CONNECTED;

    public f(java.lang.String str, java.lang.String str2, java.net.URI uri, java.util.Map map, com.tencent.websocket.WssConfig wssConfig, java.util.ArrayList arrayList, uh1.a aVar) {
        this.f326039d = str;
        this.f326040e = str2;
        this.f326041f = uri;
        this.f326042g = map;
        this.f326045m = wssConfig;
        this.f326049q = arrayList;
        this.f326053u = uh1.j0.r(aVar);
        if (map == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandWcWssSocket", "header is null");
            return;
        }
        for (java.util.Map.Entry entry : map.entrySet()) {
            this.f326043h.add(entry.getKey());
            this.f326044i.add(entry.getValue());
        }
    }

    public static xk1.e f(mf1.f fVar, int i17, java.lang.String[] strArr, java.lang.String[] strArr2) {
        int i18 = 0;
        if (i17 != 1) {
            fVar.getClass();
            if (i17 != 2) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandWcWssSocket", "buildHandshake unknow type:%s", java.lang.Integer.valueOf(i17));
                return null;
            }
            xk1.d dVar = new xk1.d();
            if (strArr == null || strArr2 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandWcWssSocket", "buildHandshake header args is null type:%s", java.lang.Integer.valueOf(i17));
                return dVar;
            }
            if (strArr.length != strArr2.length) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandWcWssSocket", "buildHandshake headerKey != headerValue type:%s", java.lang.Integer.valueOf(i17));
                return dVar;
            }
            while (i18 < strArr.length) {
                dVar.b(strArr[i18], strArr2[i18]);
                i18++;
            }
            return dVar;
        }
        java.net.URI uri = fVar.f326041f;
        java.lang.String path = uri.getPath();
        java.lang.String query = uri.getQuery();
        if (path == null || path.length() == 0) {
            path = "/";
        }
        if (query != null) {
            path = path + "?" + query;
        }
        int port = uri.getPort();
        if (port == -1) {
            java.lang.String scheme = uri.getScheme();
            if (scheme.equals("wss")) {
                port = com.tencent.mm.plugin.appbrand.jsapi.appdownload.h1.CTRL_INDEX;
            } else if (scheme.equals("ws")) {
                port = 80;
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandWcWssSocket", "getPort unkonow scheme:%s", scheme);
            }
        }
        java.lang.String host = (port == -1 || port == 80) ? uri.getHost() : uri.getHost() + ":" + port;
        xk1.c cVar = new xk1.c();
        if (path == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNetWork.HandshakeImpl1Client", "http resource descriptor must not be null");
        } else {
            cVar.f455004b = path;
        }
        cVar.b("Host", host);
        if (strArr != null && strArr2 != null) {
            if (strArr.length != strArr2.length) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandWcWssSocket", "buildHandshake headerKey != headerValue type:%s", java.lang.Integer.valueOf(i17));
                return cVar;
            }
            while (i18 < strArr.length) {
                cVar.b(strArr[i18], strArr2[i18]);
                i18++;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWcWssSocket", "buildHandshake headerKey.length:%s, type:%s", java.lang.Integer.valueOf(strArr.length), java.lang.Integer.valueOf(i17));
            return cVar;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWcWssSocket", "buildHandshake header args is null type:%s", java.lang.Integer.valueOf(i17));
        java.util.Map map = fVar.f326042g;
        if (map == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandWcWssSocket", "buildHandshake mHeaders is null type:%s", java.lang.Integer.valueOf(i17));
            return cVar;
        }
        for (java.util.Map.Entry entry : map.entrySet()) {
            cVar.b((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
        }
        return cVar;
    }

    @Override // mf1.k
    public void a(java.lang.String str, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWcWssSocket", "close reason:%s,code:%s", str, java.lang.Integer.valueOf(i17));
        int i18 = this.f326047o;
        if (i18 < 0) {
            ((mf1.a) this.f326050r).a("error socket id");
            return;
        }
        mf1.e eVar = this.f326052t;
        mf1.e eVar2 = mf1.e.CLOSING;
        if (eVar != eVar2 && eVar != mf1.e.CLOSED) {
            this.f326052t = eVar2;
        }
        com.tencent.websocket.WcWss.closeSocket(this.f326039d, i18, i17, str);
    }

    @Override // mf1.k
    public void b(java.util.Timer timer) {
        this.f326048p = timer;
    }

    @Override // mf1.k
    public java.util.Timer c() {
        return this.f326048p;
    }

    @Override // mf1.k
    public void close() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWcWssSocket", "close");
        a("default_close", 1000);
    }

    @Override // mf1.k
    public void d(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWcWssSocket", "send text");
        if (this.f326047o < 0) {
            ((mf1.a) this.f326050r).a("error socket id");
            return;
        }
        try {
            java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(str.getBytes("UTF8"));
            byte[] bArr = new byte[wrap.remaining()];
            wrap.get(bArr);
            com.tencent.websocket.WcWss.sendBuffer(this.f326039d, this.f326047o, bArr, true);
        } catch (java.io.UnsupportedEncodingException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandWcWssSocket", e17, "unsupport encoding UnsupportedEncodingException", new java.lang.Object[0]);
            ((mf1.a) this.f326050r).a("unsupport encoding");
        }
    }

    @Override // mf1.k
    public void e(java.nio.ByteBuffer byteBuffer) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWcWssSocket", "send bytes");
        if (this.f326047o < 0) {
            ((mf1.a) this.f326050r).a("error socket id");
            return;
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        com.tencent.websocket.WcWss.sendBuffer(this.f326039d, this.f326047o, bArr, false);
    }

    @Override // mf1.k
    public java.lang.String getTaskId() {
        return this.f326046n;
    }

    @Override // mf1.k
    public boolean isOpen() {
        return this.f326052t == mf1.e.OPEN;
    }
}
