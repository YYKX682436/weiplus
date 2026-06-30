package ee3;

/* loaded from: classes7.dex */
public class p implements jc3.v {

    /* renamed from: a, reason: collision with root package name */
    public final int f251646a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Long f251647b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f251648c;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f251650e = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f251652g = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f251649d = ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).j9();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f251651f = new java.util.Hashtable(10);

    public p(java.lang.String str) {
        this.f251646a = ((com.tencent.mm.plugin.magicbrush.d6) ((com.tencent.mm.plugin.magicbrush.e4) i95.n0.c(com.tencent.mm.plugin.magicbrush.e4.class))).wi(str).f298967c;
        this.f251647b = java.lang.Long.valueOf(((com.tencent.mm.plugin.magicbrush.d6) ((com.tencent.mm.plugin.magicbrush.e4) i95.n0.c(com.tencent.mm.plugin.magicbrush.e4.class))).wi(str).f298966b);
        java.lang.String i17 = com.tencent.mm.vfs.w6.i(fe3.l.c(), true);
        this.f251648c = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushNetworkDownload", "lm: FILE_PATH_BASE %s", i17);
    }

    @Override // jc3.v
    public jc3.w a(java.lang.String str) {
        if (str == null) {
            return null;
        }
        synchronized (this.f251652g) {
            java.util.Iterator it = this.f251652g.iterator();
            while (it.hasNext()) {
                ee3.j jVar = (ee3.j) it.next();
                if (str.equals(jVar.f251624t)) {
                    return jVar;
                }
            }
            return null;
        }
    }

    @Override // jc3.v
    public void b(jc3.w wVar) {
        if (wVar == null) {
            return;
        }
        this.f251650e.add(wVar.getTaskId());
        e(wVar.getTaskId());
        wVar.a();
    }

    @Override // jc3.v
    public boolean c(java.lang.String str) {
        return this.f251650e.contains(str);
    }

    @Override // jc3.v
    public void d(lc3.h0 h0Var, java.lang.String str, lc3.a0 a0Var, int i17, java.lang.String str2, java.lang.String str3, jc3.x0 x0Var) {
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue;
        java.lang.String optString = a0Var.optString("url");
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushNetworkDownload", "download taskId:%s url:%s", str2, optString);
        synchronized (this.f251652g) {
            if (this.f251652g.size() >= this.f251646a) {
                x0Var.c(300007, "fail:network exceed max task count", null, null);
                com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushNetworkDownload", "exceed max task count mDownloadTaskList.size():%d,mMaxConnected:%d", java.lang.Integer.valueOf(this.f251652g.size()), java.lang.Integer.valueOf(this.f251646a));
                return;
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            try {
                org.json.JSONObject optJSONObject = a0Var.optJSONObject("header");
                if (optJSONObject != null) {
                    java.util.Iterator<java.lang.String> keys = optJSONObject.keys();
                    while (keys.hasNext()) {
                        java.lang.String next = keys.next();
                        if (next != null) {
                            hashMap.put(next.toLowerCase(), optJSONObject.getString(next));
                        }
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MagicBrushNetworkUtil", e17, "Exception: get header error", new java.lang.Object[0]);
            }
            java.lang.String optString2 = a0Var.optString(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, "");
            java.lang.String str4 = this.f251648c + com.tencent.mm.sdk.platformtools.w2.a(optString) + "temp" + java.lang.System.currentTimeMillis();
            boolean optBoolean = a0Var.optBoolean("enableHttp2", false);
            boolean optBoolean2 = a0Var.optBoolean("enableQuic", false);
            boolean optBoolean3 = a0Var.optBoolean("enableCache", false);
            boolean optBoolean4 = a0Var.optBoolean("enableProfile", true);
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushNetworkDownload", "download taskId %s,useHttp2 %b, useQuic %b, useMemoryCache %b, useProfile %b", str2, java.lang.Boolean.valueOf(optBoolean), java.lang.Boolean.valueOf(optBoolean2), java.lang.Boolean.valueOf(optBoolean3), java.lang.Boolean.valueOf(optBoolean4));
            ee3.j jVar = new ee3.j(h0Var, str, optString, str4, optString2, this.f251649d, optBoolean, optBoolean2, optBoolean3, optBoolean4, new ee3.o(this, str2, x0Var));
            jVar.f251620p = hashMap;
            jVar.f251621q = i17;
            jVar.f251614g = true;
            jVar.f251622r = this.f251647b.longValue();
            jVar.f251624t = str2;
            jVar.f251627w = str3;
            synchronized (this.f251652g) {
                this.f251652g.add(jVar);
            }
            synchronized (this.f251651f) {
                if (((java.util.Hashtable) this.f251651f).containsKey(optString)) {
                    concurrentLinkedQueue = (java.util.concurrent.ConcurrentLinkedQueue) ((java.util.Hashtable) this.f251651f).get(optString);
                } else {
                    concurrentLinkedQueue = new java.util.concurrent.ConcurrentLinkedQueue();
                    ((java.util.Hashtable) this.f251651f).put(optString, concurrentLinkedQueue);
                }
                concurrentLinkedQueue.offer(jVar);
            }
            if (((java.util.Hashtable) this.f251651f).get(optString) == null || ((java.util.concurrent.ConcurrentLinkedQueue) ((java.util.Hashtable) this.f251651f).get(optString)).size() <= 1) {
                ((ku5.t0) ku5.t0.f312615d).h(new ee3.n(this, optString), "magicbrush_download_thread");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushNetworkDownload", "hy: more than one same url in the queue, just add and wait");
            }
        }
    }

    public final void e(java.lang.String str) {
        if (str == null) {
            return;
        }
        synchronized (this.f251652g) {
            java.util.Iterator it = this.f251652g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ee3.j jVar = (ee3.j) it.next();
                if (str.equals(jVar.f251624t)) {
                    this.f251652g.remove(jVar);
                    break;
                }
            }
        }
    }
}
