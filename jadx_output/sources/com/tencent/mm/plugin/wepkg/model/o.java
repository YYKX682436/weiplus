package com.tencent.mm.plugin.wepkg.model;

/* loaded from: classes8.dex */
public class o {

    /* renamed from: g, reason: collision with root package name */
    public static final java.nio.ByteOrder f188445g = java.nio.ByteOrder.BIG_ENDIAN;

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.vfs.r6 f188446a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f188447b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f188448c;

    /* renamed from: d, reason: collision with root package name */
    public volatile int f188449d = 0;

    /* renamed from: e, reason: collision with root package name */
    public volatile r45.l87 f188450e = null;

    /* renamed from: f, reason: collision with root package name */
    public volatile java.util.LinkedList f188451f = null;

    public o(com.tencent.mm.vfs.r6 r6Var) {
        boolean z17 = false;
        this.f188447b = false;
        java.nio.channels.FileChannel fileChannel = null;
        this.f188446a = r6Var;
        try {
            fileChannel = com.tencent.mm.vfs.w6.B(r6Var.u(), false).getChannel();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Wepkg.WePkgReader", "openfile failed, " + e17.getMessage());
        }
        if (fileChannel != null) {
            try {
                try {
                    fileChannel.position(0L);
                    java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(4);
                    allocateDirect.order(f188445g);
                    fileChannel.read(allocateDirect);
                    this.f188448c = allocateDirect.getInt(0);
                    z17 = b(fileChannel);
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Wepkg.WePkgReader", "parseHeader error, " + e18.getMessage());
                }
            } finally {
                a(fileChannel);
            }
        }
        this.f188447b = z17;
    }

    public final void a(java.nio.channels.FileChannel fileChannel) {
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    public final boolean b(java.nio.channels.FileChannel fileChannel) {
        if (this.f188448c <= 0) {
            return false;
        }
        try {
            fileChannel.position(4);
            java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(this.f188448c);
            allocateDirect.order(f188445g);
            fileChannel.read(allocateDirect);
            byte[] a17 = ik1.f.a(allocateDirect);
            if (a17 != null && a17.length != 0) {
                this.f188450e = new r45.l87();
                this.f188450e.parseFrom(a17);
                this.f188451f = this.f188450e.f379238d;
                java.lang.String str = this.f188450e.f379239e;
                java.lang.String str2 = this.f188450e.f379240f;
                this.f188449d = 4 + this.f188448c;
                return true;
            }
            return false;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Wepkg.WePkgReader", "dealProtoData error, " + e17.getMessage());
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0157 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x001e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x020a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.LinkedList c() {
        /*
            Method dump skipped, instructions count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.wepkg.model.o.c():java.util.LinkedList");
    }

    public java.lang.String d(java.lang.String str, java.lang.String str2) {
        if (com.tencent.mm.sdk.platformtools.t8.L0(this.f188451f) || this.f188449d < 4) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Wepkg.WePkgReader", "getTargetFile, mFileIndexList is null");
            return null;
        }
        java.util.Iterator it = this.f188451f.iterator();
        while (true) {
            if (!it.hasNext()) {
                return "";
            }
            r45.ps0 ps0Var = (r45.ps0) it.next();
            if ((str != null ? str : "").equals(ps0Var.f383367d) && !e(ps0Var.f383370g)) {
                try {
                    byte[] b17 = ik1.f.b(new a05.b(this.f188446a, this.f188449d + ps0Var.f383368e, ps0Var.f383369f));
                    return "utf8".equals(str2) ? new java.lang.String(b17, com.tencent.mapsdk.internal.rv.f51270c) : android.util.Base64.encodeToString(b17, 2);
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Wepkg.WePkgReader", "getTargetFile: " + e17.getMessage());
                } catch (java.lang.OutOfMemoryError e18) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Wepkg.WePkgReader", "getTargetFile: " + e18.getMessage());
                }
            }
        }
    }

    public final boolean e(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        return str.startsWith("video/") || str.startsWith("audio/");
    }
}
