package uh1;

/* loaded from: classes7.dex */
public class x0 {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f427921b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f427922c;

    /* renamed from: d, reason: collision with root package name */
    public javax.net.ssl.SSLContext f427923d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f427924e;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.l f427926g;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f427925f = new java.util.ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final java.util.ArrayList f427929j = new java.util.ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f427930k = new java.util.concurrent.ConcurrentLinkedQueue();

    /* renamed from: a, reason: collision with root package name */
    public int f427920a = Integer.MAX_VALUE;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f427927h = new java.util.Hashtable(10);

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f427928i = new java.util.HashMap();

    public x0(com.tencent.mm.plugin.appbrand.jsapi.l lVar, boolean z17) {
        this.f427922c = false;
        this.f427926g = lVar;
        this.f427922c = z17;
        java.lang.String D = lp0.b.D();
        this.f427921b = (D.endsWith("/") ? D : D.concat("/")) + "networkfiles/";
    }

    public static void a(uh1.x0 x0Var, java.lang.String str) {
        if (str == null) {
            x0Var.getClass();
            return;
        }
        synchronized (x0Var.f427929j) {
            java.util.Iterator it = x0Var.f427929j.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                vh1.f fVar = (vh1.f) it.next();
                if (str.equals(fVar.f437033v)) {
                    x0Var.f427929j.remove(fVar);
                    break;
                }
            }
            if (x0Var.f427929j.size() < x0Var.f427920a && x0Var.f427930k.peek() != null) {
                vh1.f fVar2 = (vh1.f) x0Var.f427930k.poll();
                x0Var.f427929j.add(fVar2);
                s75.d.b(fVar2, "appbrand_preload_download_thread");
            }
        }
    }

    public void b(org.json.JSONObject jSONObject, int i17, java.util.Map map, java.util.ArrayList arrayList, int i18, uh1.d dVar, java.lang.String str, java.lang.String str2) {
        java.lang.String optString = jSONObject.optString("url");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPreloadNetworkDownload", "predownload taskId:%s url:%s", str, optString);
        synchronized (this.f427928i) {
            uh1.w0 w0Var = (uh1.w0) ((java.util.HashMap) this.f427928i).get(optString);
            if (w0Var != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPreloadNetworkDownload", "already downloaded return cached file:%s url:%s", w0Var.f427915a, optString);
                dVar.c(0, w0Var.f427916b, w0Var.f427915a, w0Var.f427917c, w0Var.f427918d, null);
                ((java.util.HashMap) this.f427928i).remove(optString);
                return;
            }
            java.lang.String str3 = this.f427921b + com.tencent.mm.sdk.platformtools.w2.a(optString) + "temp";
            synchronized (this.f427927h) {
                if (((java.util.Hashtable) this.f427927h).get(optString) != null) {
                    java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = (java.util.concurrent.ConcurrentLinkedQueue) ((java.util.Hashtable) this.f427927h).get(optString);
                    concurrentLinkedQueue.offer(dVar);
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPreloadNetworkDownload", "predownload the same task is working url:%s,size:%d", optString, java.lang.Integer.valueOf(concurrentLinkedQueue.size()));
                    return;
                }
                java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue2 = new java.util.concurrent.ConcurrentLinkedQueue();
                concurrentLinkedQueue2.offer(dVar);
                ((java.util.Hashtable) this.f427927h).put(optString, concurrentLinkedQueue2);
                vh1.f fVar = new vh1.f(this.f427926g, optString, str3, jSONObject.optString(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH), this.f427924e, this.f427922c, jSONObject.optBoolean("enableHttp2", false), jSONObject.optBoolean("enableQuic", false), jSONObject.optBoolean("enableCache", false), jSONObject.optBoolean("enableProfile", true), new uh1.v0(this, str, dVar));
                fVar.f437027p = map;
                fVar.f437028q = i17;
                fVar.f437021g = true;
                fVar.f437030s = arrayList;
                fVar.f437031t = 1048576 * i18;
                fVar.f437029r = this.f427923d;
                fVar.f437033v = str;
                fVar.f437036y = str2;
                synchronized (this.f427929j) {
                    if (this.f427929j.size() < this.f427920a) {
                        this.f427929j.add(fVar);
                        s75.d.b(fVar, "appbrand_predownload_thread");
                    } else {
                        synchronized (this.f427930k) {
                            this.f427930k.add(fVar);
                        }
                    }
                }
            }
        }
    }
}
