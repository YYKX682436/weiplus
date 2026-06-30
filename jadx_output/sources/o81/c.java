package o81;

/* loaded from: classes7.dex */
public final class c extends o81.b {

    /* renamed from: g, reason: collision with root package name */
    public static final java.nio.ByteOrder f343633g = java.nio.ByteOrder.BIG_ENDIAN;

    /* renamed from: d, reason: collision with root package name */
    public volatile int f343634d = 0;

    /* renamed from: e, reason: collision with root package name */
    public volatile int f343635e = 0;

    /* renamed from: f, reason: collision with root package name */
    public volatile int f343636f = -1;

    @Override // o81.a
    public java.util.Map E(java.nio.channels.FileChannel fileChannel, com.tencent.mm.vfs.r6 r6Var) {
        int i17;
        int i18;
        com.tencent.mm.plugin.appbrand.appcache.pkg.WxaPkgMixedImpl$Info wxaPkgMixedImpl$Info = null;
        if (fileChannel == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaPkgMixedImpl", "fileChannel is null");
            return null;
        }
        if (r6Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaPkgMixedImpl", "file is null");
            return null;
        }
        fileChannel.position(18L);
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(this.f343634d);
        allocateDirect.order(f343633g);
        fileChannel.read(allocateDirect);
        byte[] a17 = ik1.f.a(allocateDirect);
        this.f343636f = o81.b.a(a17, 0, 4);
        x.b bVar = new x.b();
        int i19 = 4;
        for (int i27 = 0; i27 < this.f343636f; i27++) {
            int a18 = o81.b.a(a17, i19, 4);
            int i28 = i19 + 4;
            java.lang.String str = new java.lang.String(a17, i28, a18);
            int i29 = i28 + a18;
            int a19 = o81.b.a(a17, i29, 1);
            int i37 = i29 + 1;
            int a27 = o81.b.a(a17, i37, 4);
            int i38 = i37 + 4;
            int a28 = o81.b.a(a17, i38, 4);
            i19 = i38 + 4;
            if (a19 == 0) {
                i18 = this.f343634d + 18 + this.f343635e;
            } else if (a19 == 1) {
                i18 = this.f343634d + 18;
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.WxaPkgMixedImpl", "encType error: %d", java.lang.Integer.valueOf(a19));
                i17 = 0;
                wxaPkgMixedImpl$Info = new com.tencent.mm.plugin.appbrand.appcache.pkg.WxaPkgMixedImpl$Info(r6Var.o(), str, i17, a28, a19);
                bVar.put(str, wxaPkgMixedImpl$Info);
            }
            i17 = i18 + a27;
            wxaPkgMixedImpl$Info = new com.tencent.mm.plugin.appbrand.appcache.pkg.WxaPkgMixedImpl$Info(r6Var.o(), str, i17, a28, a19);
            bVar.put(str, wxaPkgMixedImpl$Info);
        }
        if (wxaPkgMixedImpl$Info != null && wxaPkgMixedImpl$Info.f75390f + wxaPkgMixedImpl$Info.f75391g > r6Var.C()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaPkgMixedImpl", "getInfo, lastFileOffset(%d) + lastFileLength(%d) > totalFileLength(%d), infoMap.size(%d), filesCount(%d)", java.lang.Integer.valueOf(wxaPkgMixedImpl$Info.f75390f), java.lang.Integer.valueOf(wxaPkgMixedImpl$Info.f75391g), java.lang.Long.valueOf(r6Var.C()), java.lang.Integer.valueOf(bVar.f450846f), java.lang.Integer.valueOf(this.f343636f));
        }
        return bVar;
    }

    @Override // o81.a
    public int J0() {
        return this.f343634d;
    }

    @Override // o81.a
    public boolean L(com.tencent.mm.plugin.appbrand.appcache.WxaPkg$Info wxaPkg$Info) {
        return (wxaPkg$Info instanceof com.tencent.mm.plugin.appbrand.appcache.pkg.WxaPkgMixedImpl$Info) && wxaPkg$Info.f75389e != null && ((com.tencent.mm.plugin.appbrand.appcache.pkg.WxaPkgMixedImpl$Info) wxaPkg$Info).f75726h == 1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // o81.a
    public boolean g(java.nio.channels.FileChannel fileChannel) {
        if (fileChannel == null) {
            return false;
        }
        fileChannel.position(0L);
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(18);
        allocateDirect.order(f343633g);
        fileChannel.read(allocateDirect);
        if (-66 != allocateDirect.get(0) || -19 != allocateDirect.get(17)) {
            return false;
        }
        byte[] a17 = ik1.f.a(allocateDirect);
        o81.b.a(a17, 1, 4);
        this.f343634d = o81.b.a(a17, 5, 4);
        this.f343635e = o81.b.a(a17, 9, 4);
        o81.b.a(a17, 13, 4);
        return true;
    }

    @Override // o81.a
    public java.io.InputStream j1(com.tencent.mm.plugin.appbrand.appcache.WxaPkg$Info wxaPkg$Info) {
        return null;
    }

    @Override // o81.a
    public int r() {
        return this.f343636f;
    }
}
