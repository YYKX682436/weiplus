package ee3;

/* loaded from: classes7.dex */
public class m implements jc3.v {

    /* renamed from: a, reason: collision with root package name */
    public final int f251636a;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f251638c = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f251640e = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f251639d = new java.util.Hashtable(10);

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f251637b = com.tencent.mm.vfs.w6.i(fe3.l.c(), true);

    public m(java.lang.String str) {
        this.f251636a = ((com.tencent.mm.plugin.magicbrush.d6) ((com.tencent.mm.plugin.magicbrush.e4) i95.n0.c(com.tencent.mm.plugin.magicbrush.e4.class))).wi(str).f298967c;
    }

    @Override // jc3.v
    public jc3.w a(java.lang.String str) {
        if (str == null) {
            return null;
        }
        synchronized (this.f251640e) {
            java.util.Iterator it = this.f251640e.iterator();
            while (it.hasNext()) {
                ee3.d dVar = (ee3.d) it.next();
                if (str.equals(dVar.f251600s)) {
                    return dVar;
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
        this.f251638c.add(wVar.getTaskId());
        e(wVar.getTaskId());
        wVar.a();
    }

    @Override // jc3.v
    public boolean c(java.lang.String str) {
        return this.f251638c.contains(str);
    }

    @Override // jc3.v
    public void d(lc3.h0 h0Var, java.lang.String str, lc3.a0 a0Var, int i17, java.lang.String str2, java.lang.String str3, jc3.x0 x0Var) {
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue;
        java.lang.String optString = a0Var.optString("url");
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushNetworkCDNDownload", "download taskId:%s url:%s", str2, optString);
        synchronized (this.f251640e) {
            if (this.f251640e.size() >= this.f251636a) {
                x0Var.c(300007, "fail:network exceed max task count", null, null);
                com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushNetworkCDNDownload", "exceed max task count mDownloadTaskList.size():%d,mMaxConnected:%d", java.lang.Integer.valueOf(this.f251640e.size()), java.lang.Integer.valueOf(this.f251636a));
                return;
            }
            java.lang.String str4 = this.f251637b;
            java.lang.String str5 = com.tencent.mm.sdk.platformtools.w2.a(optString) + "temp" + java.lang.System.currentTimeMillis();
            int optInt = a0Var.optInt("fileType", 0);
            com.tencent.mm.sdk.platformtools.w2.b(optString.getBytes());
            java.lang.System.currentTimeMillis();
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushNetworkCDNDownload", "download taskId %s,fileDir %s, fileName %s, fileType %d", str2, str4, str5, java.lang.Integer.valueOf(optInt));
            ee3.d dVar = new ee3.d(str, optString, str5, str4, optInt, new ee3.l(this, str2, x0Var));
            dVar.f251598q = i17;
            dVar.f251589e = true;
            dVar.f251600s = str2;
            dVar.f251602u = str3;
            synchronized (this.f251640e) {
                this.f251640e.add(dVar);
            }
            synchronized (this.f251639d) {
                if (((java.util.Hashtable) this.f251639d).containsKey(optString)) {
                    concurrentLinkedQueue = (java.util.concurrent.ConcurrentLinkedQueue) ((java.util.Hashtable) this.f251639d).get(optString);
                } else {
                    concurrentLinkedQueue = new java.util.concurrent.ConcurrentLinkedQueue();
                    ((java.util.Hashtable) this.f251639d).put(optString, concurrentLinkedQueue);
                }
                concurrentLinkedQueue.offer(dVar);
            }
            if (((java.util.Hashtable) this.f251639d).get(optString) == null || ((java.util.concurrent.ConcurrentLinkedQueue) ((java.util.Hashtable) this.f251639d).get(optString)).size() <= 1) {
                ((ku5.t0) ku5.t0.f312615d).h(new ee3.k(this, optString), "magicbrush_cdndownload_thread");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.MagicBrushNetworkCDNDownload", "hy: more than one same url in the queue, just add and wait");
            }
        }
    }

    public final void e(java.lang.String str) {
        if (str == null) {
            return;
        }
        synchronized (this.f251640e) {
            java.util.Iterator it = this.f251640e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ee3.d dVar = (ee3.d) it.next();
                if (str.equals(dVar.f251600s)) {
                    this.f251640e.remove(dVar);
                    break;
                }
            }
        }
    }
}
