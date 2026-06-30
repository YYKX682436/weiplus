package uh1;

/* loaded from: classes7.dex */
public final class q implements uh1.w {

    /* renamed from: m, reason: collision with root package name */
    public static java.lang.String f427853m = "";

    /* renamed from: n, reason: collision with root package name */
    public static int f427854n;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f427855b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Set f427856c = new java.util.concurrent.ConcurrentSkipListSet();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f427857d = new java.util.concurrent.ConcurrentSkipListSet();

    /* renamed from: e, reason: collision with root package name */
    public final int f427858e;

    /* renamed from: f, reason: collision with root package name */
    public final javax.net.ssl.SSLContext f427859f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f427860g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.ref.WeakReference f427861h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f427862i;

    /* renamed from: j, reason: collision with root package name */
    public final int f427863j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f427864k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f427865l;

    public q(uh1.u uVar, int i17, boolean z17, boolean z18) {
        this.f427863j = 0;
        this.f427864k = false;
        this.f427865l = false;
        this.f427861h = new java.lang.ref.WeakReference(uVar);
        java.lang.String appId = uVar.getAppId();
        boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f427862i = appId == null ? "" : appId;
        uh1.a aVar = (uh1.a) uVar.b(uh1.a.class);
        if (aVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandNetworkRequest", "<init> hy: config not found, appId(%s)", uVar.getAppId());
            this.f427860g = "";
            return;
        }
        this.f427858e = aVar.f427745i;
        this.f427860g = aVar.B;
        this.f427859f = uh1.j0.p(aVar);
        this.f427863j = i17;
        this.f427864k = z17;
        this.f427865l = z18;
    }

    public static void a(uh1.q qVar, uh1.r rVar) {
        java.lang.Runnable runnable;
        qVar.getClass();
        if (rVar == null || rVar.f427893v || (runnable = rVar.f427886o) == null) {
            return;
        }
        if (runnable instanceof wu5.b) {
            ((wu5.b) runnable).b();
        }
        rVar.f427893v = true;
        rVar.f427886o = null;
    }

    public static void b(uh1.q qVar, uh1.r rVar) {
        java.lang.String str;
        qVar.getClass();
        uh1.n nVar = rVar.f427876e;
        java.util.ArrayList arrayList = rVar.f427878g;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (arrayList != null && !uh1.j0.A(arrayList, rVar.f427874c, false)) {
            try {
                str = new java.net.URL(rVar.f427874c).getHost();
            } catch (java.net.MalformedURLException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandNetworkRequest", e17, "get redirect url host fail Exception", new java.lang.Object[0]);
                str = null;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                qVar.c(nVar, "fail", "redirect url not in domain list", rVar.f427881j, null, 600002, null);
            } else {
                qVar.c(nVar, "fail", "redirect url not in domain list:" + str, rVar.f427881j, null, 600002, null);
            }
            ((ch1.e) ((uh1.h1) nd.f.d(uh1.h1.class, true))).b(qVar.f427862i, rVar.f427885n, rVar.f427875d, rVar.f427874c, 0L, 0L, 0, 2, rVar.c(), java.lang.System.currentTimeMillis(), "", "");
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNetworkRequest", "sendCronetRequest not in domain url:%s,host:%s", rVar.f427874c, str);
            return;
        }
        java.lang.System.currentTimeMillis();
        uh1.p pVar = new uh1.p();
        uh1.j0.E(1095L, 0L, 1L);
        uh1.j jVar = new uh1.j(qVar, rVar, nVar, currentTimeMillis, pVar);
        com.tencent.mars.cdn.CronetLogic.CronetRequestParams cronetRequestParams = new com.tencent.mars.cdn.CronetLogic.CronetRequestParams();
        cronetRequestParams.url = rVar.f427874c;
        cronetRequestParams.taskId = rVar.f427881j;
        cronetRequestParams.followRedirect = false;
        cronetRequestParams.bodyData = rVar.f427873b;
        cronetRequestParams.method = rVar.f427875d;
        cronetRequestParams.useHttp2 = rVar.f427888q;
        cronetRequestParams.useQuic = rVar.f427889r;
        cronetRequestParams.useMemoryCache = rVar.f427890s;
        cronetRequestParams.miniPrograms = true;
        cronetRequestParams.maxRetryCount = 0;
        cronetRequestParams.forceBindMobileNetwork = rVar.A;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(rVar.f427894w) && !com.tencent.mm.sdk.platformtools.t8.K0(rVar.f427896y)) {
            com.tencent.mars.cdn.CronetLogic.HostIPHint hostIPHint = new com.tencent.mars.cdn.CronetLogic.HostIPHint();
            cronetRequestParams.hostIPHint = hostIPHint;
            hostIPHint.hostMap = new com.tencent.mars.cdn.CronetLogic.HostIpMap[1];
            com.tencent.mars.cdn.CronetLogic.HostIpMap hostIpMap = new com.tencent.mars.cdn.CronetLogic.HostIpMap();
            hostIpMap.host = rVar.f427896y;
            hostIpMap.f52523ip = rVar.f427894w;
            hostIpMap.port = rVar.f427895x;
            cronetRequestParams.forbidSocketReuse = rVar.f427897z;
            cronetRequestParams.hostIPHint.hostMap[0] = hostIpMap;
        }
        java.util.Map<java.lang.String, java.lang.String> map = rVar.f427877f;
        if (map.containsKey("Accept-Encoding")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNetworkRequest", "startCronetHttpsRequest Accept-Encoding:%s", map.get("Accept-Encoding"));
        } else {
            map.put("Accept-Encoding", "gzip,compress,br,deflate");
        }
        map.put("charset", com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
        map.put("User-Agent", qVar.f427860g);
        if (qVar.e(rVar.f427875d)) {
            map.put("Content-Length", java.lang.Integer.toString(rVar.f427873b.length));
        }
        cronetRequestParams.makeRequestHeader(map);
        ad1.b bVar = (ad1.b) nVar;
        bVar.a(uh1.j0.e(uh1.j0.H(map), 1), 0);
        uh1.k kVar = new uh1.k(qVar, rVar, bVar);
        rVar.f427886o = kVar;
        ((ku5.t0) ku5.t0.f312615d).k(kVar, rVar.f427872a);
        if (rVar.f427892u) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNetworkRequest", "startCronetHttpsRequest with chunked");
            cronetRequestParams.taskType = 10;
        } else {
            cronetRequestParams.taskType = 1;
        }
        com.tencent.mars.cdn.CronetLogic.CronetHttpsCreateResult startCronetHttpTask = com.tencent.mars.cdn.CronetLogic.startCronetHttpTask(cronetRequestParams, jVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNetworkRequest", "sendCronetRequest prepare to send https request taskid:%s,requestid:%s,timeout:%d,url:%s", rVar.f427881j, startCronetHttpTask.taskId, java.lang.Integer.valueOf(rVar.f427872a), rVar.f427874c);
        if (startCronetHttpTask.createRet == 0) {
            rVar.f427883l = startCronetHttpTask.taskId;
            uh1.j0.E(1095L, 7L, 1L);
            return;
        }
        if (!rVar.f427887p) {
            rVar.f427887p = true;
            qVar.c(bVar, "fail", "call request error:" + startCronetHttpTask.createRet, rVar.f427881j, null, 600004, null);
        }
        uh1.j0.E(1095L, 2L, 1L);
    }

    public final void c(uh1.n nVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.net.HttpURLConnection httpURLConnection, int i17, java.util.Map map) {
        f(str3, httpURLConnection);
        ((ad1.b) nVar).b(str, str2, i17, map);
    }

    public final void d(uh1.n nVar, java.lang.String str, java.lang.Object obj, int i17, org.json.JSONObject jSONObject, java.lang.String str2, java.net.HttpURLConnection httpURLConnection, java.util.Map map, java.util.Map map2) {
        f(str2, httpURLConnection);
        ad1.b bVar = (ad1.b) nVar;
        bVar.getClass();
        int length = (obj == null || !(obj instanceof java.nio.ByteBuffer)) ? (obj == null || !(obj instanceof java.lang.String)) ? 0 : ((java.lang.String) obj).length() : ((java.nio.ByteBuffer) obj).array().length;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = (com.tencent.mm.plugin.appbrand.jsapi.l) bVar.f3105a.get();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = bVar.f3106b;
        java.lang.Long valueOf = java.lang.Long.valueOf(currentTimeMillis - j17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(length);
        java.lang.String str3 = bVar.f3107c;
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseCreateRequestTask", "onRequestResultWithCode, time: %d, data size: %d,requestTaskId %s", valueOf, valueOf2, str3);
        if (lVar == null) {
            return;
        }
        uh1.q a17 = uh1.s.f427900a.a(lVar);
        if (a17 == null || !((java.util.concurrent.ConcurrentSkipListSet) a17.f427856c).contains(str3)) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("requestTaskId", str3);
            if (str.equalsIgnoreCase("ok")) {
                hashMap.put("state", ya.b.SUCCESS);
                hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, obj);
                if (map != null && map.size() > 0) {
                    hashMap.put(com.google.android.gms.common.Scopes.PROFILE, map);
                }
            } else {
                hashMap.put("state", "fail");
            }
            hashMap.put("statusCode", java.lang.Integer.valueOf(i17));
            if (jSONObject != null) {
                hashMap.put("header", jSONObject);
            }
            if (map2 != null && map2.size() > 0) {
                map2.put("invokeTime", java.lang.Long.valueOf(j17));
                map2.put("wxlibCallbackTimestamp", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                hashMap.put("clientInfo", map2);
            }
            ad1.c cVar = new ad1.c();
            com.tencent.mm.plugin.appbrand.utils.u3 d17 = com.tencent.mm.plugin.appbrand.utils.v3.d(lVar.getJsRuntime(), hashMap, (com.tencent.mm.plugin.appbrand.utils.t3) lVar.b(com.tencent.mm.plugin.appbrand.utils.t3.class));
            ad1.a aVar = bVar.f3109e;
            if ((obj != null && (obj instanceof java.lang.String)) || d17 == com.tencent.mm.plugin.appbrand.utils.u3.OK) {
                java.lang.String jSONObject2 = new org.json.JSONObject(hashMap).toString();
                cVar.p(lVar);
                cVar.f82374f = jSONObject2;
                cVar.n(aVar.f3102h.a(str3));
            } else if (d17 == com.tencent.mm.plugin.appbrand.utils.u3.FAIL_SIZE_EXCEED_LIMIT) {
                com.tencent.mm.plugin.appbrand.utils.v3.b(lVar, ad1.c.NAME);
            }
            aVar.f3102h.b(str3);
        }
    }

    public final boolean e(java.lang.String str) {
        int i17 = this.f427863j;
        return ((i17 == 0 && this.f427864k) || (i17 == 1 && this.f427865l)) ? str.equalsIgnoreCase("POST") || str.equalsIgnoreCase("PUT") || str.equalsIgnoreCase("DELETE") || str.equalsIgnoreCase("PATCH") : str.equalsIgnoreCase("POST") || str.equalsIgnoreCase("PUT") || str.equalsIgnoreCase("DELETE");
    }

    public final void f(java.lang.String str, java.net.HttpURLConnection httpURLConnection) {
        synchronized (this) {
            if (str != null) {
                synchronized (this.f427855b) {
                    java.util.Iterator it = this.f427855b.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        uh1.r rVar = (uh1.r) it.next();
                        if (str.equals(rVar.f427881j)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNetworkRequest", "lm:real removeTask %s", rVar.f427881j);
                            this.f427855b.remove(rVar);
                            break;
                        }
                    }
                }
            }
        }
        if (httpURLConnection != null) {
            try {
                httpURLConnection.getInputStream().close();
                httpURLConnection.disconnect();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandNetworkRequest", e17, "removeTask Exception: id %s", str);
            }
        }
    }

    public void finalize() {
        release();
        super.finalize();
    }

    public void g(com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, org.json.JSONObject jSONObject, java.util.Map map, java.util.ArrayList arrayList, uh1.n nVar, java.lang.String str, java.lang.String str2) {
        ((java.util.concurrent.ConcurrentSkipListSet) this.f427857d).add(str);
        uh1.l lVar2 = new uh1.l(this, str, lVar, jSONObject, nVar, i17, arrayList, str2, map);
        ((ku5.t0) ku5.t0.f312615d).g(new uh1.m(this, lVar2, str));
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 5 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 6 */
    public final void h(uh1.r r66) {
        /*
            Method dump skipped, instructions count: 11549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uh1.q.h(uh1.r):void");
    }

    @Override // uh1.w
    public void release() {
        synchronized (this.f427855b) {
            this.f427855b.clear();
        }
        ((java.util.concurrent.ConcurrentSkipListSet) this.f427857d).clear();
        ((java.util.concurrent.ConcurrentSkipListSet) this.f427856c).clear();
    }
}
