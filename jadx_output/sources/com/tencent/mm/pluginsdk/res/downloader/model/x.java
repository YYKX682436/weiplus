package com.tencent.mm.pluginsdk.res.downloader.model;

/* loaded from: classes7.dex */
public abstract class x extends com.tencent.mm.pluginsdk.res.downloader.model.m implements com.tencent.mm.pluginsdk.res.downloader.model.i {

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.ThreadLocal f189733h = new com.tencent.mm.pluginsdk.res.downloader.model.w();

    /* renamed from: e, reason: collision with root package name */
    public final int f189734e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f189735f;

    /* renamed from: g, reason: collision with root package name */
    public volatile com.tencent.mm.pluginsdk.res.downloader.model.g f189736g;

    public x(com.tencent.mm.pluginsdk.res.downloader.model.u uVar) {
        super(uVar);
        int i17 = uVar.f189722k;
        this.f189734e = i17;
        this.f189735f = new java.util.concurrent.atomic.AtomicInteger(i17);
    }

    public java.lang.String a() {
        return ((com.tencent.mm.pluginsdk.res.downloader.model.u) c()).f189717f;
    }

    public boolean b(long j17) {
        this.f189736g.c(f(), j17);
        com.tencent.mm.vfs.r6 s17 = new com.tencent.mm.vfs.r6(e()).s();
        if (s17 == null) {
            return true;
        }
        android.os.StatFs statFs = new android.os.StatFs(com.tencent.mm.vfs.w6.i(s17.o(), false));
        long availableBlocksLong = statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
        com.tencent.mars.xlog.Log.i("MicroMsg.ResDownloader.NetworkWorker", "ensureDiskSpace(%s): available.size:%d, expected.size:%d", f(), java.lang.Long.valueOf(availableBlocksLong), java.lang.Long.valueOf(j17));
        return availableBlocksLong < 0 || availableBlocksLong > j17;
    }

    public boolean d() {
        return this instanceof com.tencent.mm.plugin.appbrand.appcache.a9;
    }

    public java.lang.String e() {
        return ((com.tencent.mm.pluginsdk.res.downloader.model.u) c()).b();
    }

    public java.lang.String f() {
        return ((com.tencent.mm.pluginsdk.res.downloader.model.u) c()).f189712a;
    }

    public com.tencent.mm.pluginsdk.res.downloader.model.v g(com.tencent.mm.pluginsdk.res.downloader.model.t tVar) {
        if (!(!(this instanceof com.tencent.mm.plugin.appbrand.appcache.a9))) {
            return tVar.i(this);
        }
        zy.s sVar = (zy.s) i95.n0.c(zy.s.class);
        java.lang.String f17 = f();
        ((yy.o) sVar).getClass();
        com.tencent.mm.pluginsdk.res.downloader.model.l0 l0Var = com.tencent.mm.pluginsdk.res.downloader.model.j0.f189679a;
        com.tencent.mm.pluginsdk.res.downloader.model.n0 e17 = l0Var.e(f17);
        if (e17 != null) {
            e17.field_status = 1;
            l0Var.g(e17, true);
        }
        return tVar.i(this);
    }

    public boolean retry() {
        boolean z17 = this.f189735f.decrementAndGet() > 0;
        this.f189736g.a(f(), this.f189734e, this.f189735f.get());
        return z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.pluginsdk.res.downloader.model.v g17 = g((com.tencent.mm.pluginsdk.res.downloader.model.t) f189733h.get());
        if (g17 != null) {
            this.f189736g.b(this, g17);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.ResDownloader.NetworkWorker", "groupId = %s, performer get null response", getGroupId());
        }
    }
}
