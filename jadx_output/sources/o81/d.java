package o81;

/* loaded from: classes7.dex */
public final class d extends o81.b {

    /* renamed from: f, reason: collision with root package name */
    public static final java.nio.ByteOrder f343637f = java.nio.ByteOrder.BIG_ENDIAN;

    /* renamed from: d, reason: collision with root package name */
    public volatile int f343638d = 0;

    /* renamed from: e, reason: collision with root package name */
    public volatile int f343639e = -1;

    @Override // o81.a
    public java.util.Map E(java.nio.channels.FileChannel fileChannel, com.tencent.mm.vfs.r6 r6Var) {
        com.tencent.mm.plugin.appbrand.appcache.pkg.WxaPkgBaseImpl$Info wxaPkgBaseImpl$Info = null;
        if (fileChannel == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaPkgNormalImpl", "fileChannel is null");
            return null;
        }
        if (r6Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaPkgNormalImpl", "file is null");
            return null;
        }
        fileChannel.position(14L);
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(this.f343638d);
        allocateDirect.order(f343637f);
        fileChannel.read(allocateDirect);
        byte[] a17 = ik1.f.a(allocateDirect);
        int i17 = 0;
        this.f343639e = o81.b.a(a17, 0, 4);
        x.b bVar = new x.b();
        int i18 = 4;
        while (i17 < this.f343639e) {
            int a18 = o81.b.a(a17, i18, 4);
            int i19 = i18 + 4;
            java.lang.String str = new java.lang.String(a17, i19, a18);
            int i27 = i19 + a18;
            int a19 = o81.b.a(a17, i27, 4);
            int i28 = i27 + 4;
            int a27 = o81.b.a(a17, i28, 4);
            i18 = i28 + 4;
            com.tencent.mm.plugin.appbrand.appcache.pkg.WxaPkgBaseImpl$Info wxaPkgBaseImpl$Info2 = new com.tencent.mm.plugin.appbrand.appcache.pkg.WxaPkgBaseImpl$Info(r6Var.o(), str, a19, a27);
            bVar.put(str, wxaPkgBaseImpl$Info2);
            i17++;
            wxaPkgBaseImpl$Info = wxaPkgBaseImpl$Info2;
        }
        if (wxaPkgBaseImpl$Info != null && wxaPkgBaseImpl$Info.f75390f + wxaPkgBaseImpl$Info.f75391g > r6Var.C()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxaPkgNormalImpl", "getInfo, lastFileOffset(%d) + lastFileLength(%d) > totalFileLength(%d), infoMap.size(%d), filesCount(%d)", java.lang.Integer.valueOf(wxaPkgBaseImpl$Info.f75390f), java.lang.Integer.valueOf(wxaPkgBaseImpl$Info.f75391g), java.lang.Long.valueOf(r6Var.C()), java.lang.Integer.valueOf(bVar.f450846f), java.lang.Integer.valueOf(this.f343639e));
        }
        return bVar;
    }

    @Override // o81.a
    public int J0() {
        return this.f343638d;
    }

    @Override // o81.a
    public boolean L(com.tencent.mm.plugin.appbrand.appcache.WxaPkg$Info wxaPkg$Info) {
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f343638d = 0;
        this.f343639e = -1;
    }

    @Override // o81.a
    public boolean g(java.nio.channels.FileChannel fileChannel) {
        if (fileChannel == null) {
            return false;
        }
        fileChannel.position(0L);
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(14);
        allocateDirect.order(f343637f);
        fileChannel.read(allocateDirect);
        if (-66 != allocateDirect.get(0) || -19 != allocateDirect.get(13)) {
            return false;
        }
        byte[] a17 = ik1.f.a(allocateDirect);
        o81.b.a(a17, 1, 4);
        this.f343638d = o81.b.a(a17, 5, 4);
        o81.b.a(a17, 9, 4);
        return true;
    }

    @Override // o81.a
    public java.io.InputStream j1(com.tencent.mm.plugin.appbrand.appcache.WxaPkg$Info wxaPkg$Info) {
        return null;
    }

    @Override // o81.a
    public int r() {
        return this.f343639e;
    }
}
