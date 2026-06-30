package t23;

/* loaded from: classes10.dex */
public final class o0 {

    /* renamed from: b, reason: collision with root package name */
    public t23.t0 f415211b;

    /* renamed from: c, reason: collision with root package name */
    public final l75.v0 f415212c = new t23.i0(this);

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f415213d = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f415214e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f415215f = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public kk.j f415210a = new jt0.i(200, new t23.j0(this), t23.o0.class);

    public o0() {
        t23.t0 t0Var = new t23.t0();
        t0Var.f415271e = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0).getInt("com.tencent.mm.gallery.cache.suffix", 0);
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(t0Var.f415268b, "cache.idx");
        r45.lz3 lz3Var = new r45.lz3();
        java.lang.String o17 = r6Var.o();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(o17)) {
            try {
                byte[] x17 = com.tencent.mm.sdk.platformtools.t8.x1(o17);
                if (x17 != null) {
                    lz3Var.parseFrom(x17);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.DiskCache", "load index file error");
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.DiskCache", e17, "", new java.lang.Object[0]);
                t0Var.c(-1);
                lz3Var = new r45.lz3();
            } catch (java.lang.OutOfMemoryError e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.DiskCache", "load index file error, OOM, index length %s", java.lang.Long.valueOf(r6Var.C()));
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.DiskCache", e18, "", new java.lang.Object[0]);
                t0Var.c(-1);
                lz3Var = new r45.lz3();
            }
        }
        t0Var.f415270d.clear();
        java.util.Iterator it = lz3Var.f379997d.iterator();
        while (it.hasNext()) {
            r45.mz3 mz3Var = (r45.mz3) it.next();
            t0Var.f415270d.put(mz3Var.f380939d, mz3Var);
        }
        t0Var.g(-1);
        this.f415211b = t0Var;
        this.f415212c.a(new t23.k0(this), null);
    }

    public android.graphics.Bitmap a(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GalleryCache", "null filepath");
            return null;
        }
        kk.j jVar = this.f415210a;
        if (jVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GalleryCache", "want to get bitmap, but gallery cache is null");
            return null;
        }
        if (jVar.k(str)) {
            t23.m0 m0Var = (t23.m0) this.f415210a.i(str);
            if (m0Var == null) {
                this.f415210a.remove(str);
                return null;
            }
            android.graphics.Bitmap bitmap = m0Var.f415205a;
            if (bitmap != null) {
                if (bitmap.isRecycled()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.GalleryCache", "cache bitmap has recycled: %s", str);
                    this.f415210a.remove(str);
                    return null;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.GalleryCache", "get cached bitmap:" + str);
                return bitmap;
            }
            this.f415210a.remove(str);
            com.tencent.mars.xlog.Log.i("MicroMsg.GalleryCache", "get bitmap is null! %s", str);
        }
        return null;
    }

    public android.graphics.Bitmap b(java.lang.String str, java.lang.String str2, long j17, t23.j2 j2Var, long j18) {
        if (!(j62.e.g().d(new com.tencent.mm.repairer.config.albumpicker.RepairerConfigAlbumDiskCache(), false, false) == 0)) {
            return null;
        }
        synchronized (this.f415215f) {
            if (this.f415211b == null) {
                return null;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                str = str2;
            }
            return this.f415211b.d(j33.d0.c(str, j2Var, j18).hashCode());
        }
    }

    public void c(java.lang.String str, java.lang.String str2, long j17, android.graphics.Bitmap bitmap, t23.j2 j2Var, long j18) {
        if (j62.e.g().d(new com.tencent.mm.repairer.config.albumpicker.RepairerConfigAlbumDiskCache(), false, false) == 0) {
            synchronized (this.f415215f) {
                if (bitmap != null) {
                    if (!bitmap.isRecycled()) {
                        if (this.f415211b == null) {
                            return;
                        }
                        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                            str = str2;
                        }
                        this.f415211b.h(j33.d0.c(str, j2Var, j18).hashCode(), com.tencent.mm.sdk.platformtools.x.g(bitmap));
                        return;
                    }
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.GalleryCache", "saveBitmapToDiskCache bmp is null. tell pennqin!!!");
            }
        }
    }

    public void d(java.lang.String str, android.graphics.Bitmap bitmap, int i17, t23.j2 j2Var, boolean z17, int i18, long j17) {
        kk.j jVar = this.f415210a;
        if (jVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GalleryCache", "cache is null");
            return;
        }
        ((jt0.i) jVar).j(j33.d0.c(str, j2Var, j17), new t23.m0(this, com.tencent.mm.sdk.platformtools.x.g(bitmap), i17));
        if (z17) {
            return;
        }
        l75.v0 v0Var = this.f415212c;
        v0Var.d(j33.d0.d(str, j2Var, i18));
        v0Var.c();
    }
}
