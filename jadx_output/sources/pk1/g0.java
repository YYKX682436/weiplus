package pk1;

/* loaded from: classes12.dex */
public final class g0 implements dn.n {

    /* renamed from: d, reason: collision with root package name */
    public static final pk1.g0 f355447d = new pk1.g0();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.locks.ReentrantLock f355448e = new java.util.concurrent.locks.ReentrantLock();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.HashMap f355449f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.concurrent.locks.ReentrantLock f355450g = new java.util.concurrent.locks.ReentrantLock();

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.HashMap f355451h = new java.util.HashMap();

    static {
        pk1.c0.f355435s = pk1.f0.f355444d;
    }

    public final void a(java.lang.String str, int i17) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = f355448e;
        reentrantLock.lock();
        try {
            pk1.e0 e0Var = (pk1.e0) f355449f.remove(str);
            if (e0Var != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ThumbCdnPreDownloadManager", "cancelPreDownload result:" + pk1.b.f355416d.a(str));
                java.util.concurrent.locks.ReentrantLock reentrantLock2 = f355450g;
                reentrantLock2.lock();
                try {
                    java.util.HashSet hashSet = (java.util.HashSet) f355451h.remove(str);
                    if (hashSet != null) {
                        java.util.Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            ((yz5.q) it.next()).invoke(java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(e0Var.f355441b), java.lang.Long.valueOf(e0Var.f355442c));
                        }
                    }
                } finally {
                    reentrantLock2.unlock();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(java.lang.String str, long j17, long j18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ThumbCdnPreDownloadManager", "updateTaskInfo downloadId" + str + ", finished:" + j17 + " total:" + j18);
        java.util.concurrent.locks.ReentrantLock reentrantLock = f355448e;
        reentrantLock.lock();
        try {
            pk1.e0 e0Var = (pk1.e0) f355449f.get(str);
            if (e0Var != null) {
                long max = java.lang.Math.max(j17, e0Var.f355441b);
                e0Var.f355441b = max;
                e0Var.f355442c = j18;
                if (max < j18 || e0Var.f355443d < 100) {
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ThumbCdnPreDownloadManager", "mark file download completed");
                pk1.z zVar = pk1.z.f355530a;
                zVar.d(zVar.b(e0Var.f355440a));
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // dn.n
    public void f(java.lang.String str, long j17, long j18) {
        if (str == null) {
            return;
        }
        b(str, j17, j18);
    }

    @Override // dn.n
    public void g(java.lang.String str, int i17, dn.h hVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ThumbCdnPreDownloadManager", "onFinish, mediaId: " + str + ", ret: " + i17);
        if (str == null || hVar == null) {
            return;
        }
        b(str, hVar.field_recvedBytes, hVar.field_fileLength);
        a(str, i17);
    }

    @Override // dn.n
    public void onDataAvailable(java.lang.String str, long j17, long j18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ThumbCdnPreDownloadManager", "onDataAvailable mediaId:" + str + " offset:" + j17 + " length:" + j18);
    }

    @Override // dn.n
    public void onM3U8Ready(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ThumbCdnPreDownloadManager", "onM3U8Ready mediaId:" + str + " m3u8:" + str2);
    }

    @Override // dn.n
    public void onMoovReady(java.lang.String str, long j17, long j18, com.tencent.mars.cdn.CdnManager.VideoInfo videoInfo) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.ThumbCdnPreDownloadManager", "onMoovReady mediaId:" + str + " offset:" + j17 + " length:" + j18);
    }
}
