package kl;

/* loaded from: classes13.dex */
public class f extends kl.e {

    /* renamed from: p, reason: collision with root package name */
    public final hl.d f308724p;

    /* renamed from: q, reason: collision with root package name */
    public java.io.OutputStream f308725q;

    /* renamed from: r, reason: collision with root package name */
    public java.io.InputStream f308726r;

    public f(hl.d dVar, int i17, int i18, int i19, java.lang.String str) {
        super(1);
        java.lang.Object[] objArr = {str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19)};
        int i27 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioFixedConvertProcess", "AudioFixedConvertProcess src:%s, sample:%d, channels:%d, encodeBit:%d", objArr);
        kl.d.a();
        this.f308724p = dVar;
        java.lang.String a17 = rl.a.a(str);
        this.f308721l = a17;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioFixedConvertProcess", "outFile:%s", a17);
        com.tencent.mm.vfs.w6.h(this.f308721l);
        il.e.c().a(dVar.f282020c);
        try {
            this.f308725q = com.tencent.mm.vfs.w6.H(rl.a.b(this.f308721l));
        } catch (java.io.FileNotFoundException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Mix.AudioFixedConvertProcess", e17, "VFSFileOp.openWrite", new java.lang.Object[0]);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Mix.AudioFixedConvertProcess", e18, "VFSFileOp.openWrite", new java.lang.Object[0]);
        }
        try {
            this.f308726r = com.tencent.mm.vfs.w6.C(rl.a.b(this.f308721l));
        } catch (java.io.FileNotFoundException e19) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Mix.AudioFixedConvertProcess", e19, "VFSFileOp.openRead", new java.lang.Object[0]);
        } catch (java.lang.Exception e27) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Mix.AudioFixedConvertProcess", e27, "VFSFileOp.openRead", new java.lang.Object[0]);
        }
        this.f308715f = 44100;
        this.f308716g = 2;
        this.f308717h = 2;
        g(i17, i18, i19);
    }

    @Override // kl.e, kl.k
    public byte[] a(byte[] bArr) {
        if (bArr == null) {
            return bArr;
        }
        byte[] a17 = super.a(bArr);
        java.io.OutputStream outputStream = this.f308725q;
        if (outputStream == null) {
            return a17;
        }
        if (a17 == null) {
            int i17 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.e("MicroMsg.Mix.AudioFixedConvertProcess", "desdata is null", null);
            return null;
        }
        try {
            outputStream.write(a17, 0, a17.length);
        } catch (java.lang.Exception e17) {
            int i18 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Mix.AudioFixedConvertProcess", e17, "write", new java.lang.Object[0]);
        }
        return a17;
    }

    @Override // kl.e, kl.k
    public void b() {
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioFixedConvertProcess", "flushCache", null);
        if (this.f308726r == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Mix.AudioFixedConvertProcess", "flushCache, inputStream is null", null);
            return;
        }
        hl.d dVar = this.f308724p;
        if (dVar.f282019b) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Mix.AudioFixedConvertProcess", "flushCache, cache is complete", null);
            return;
        }
        int i18 = 0;
        while (i18 != -1) {
            byte[] bArr = new byte[3536];
            try {
                i18 = this.f308726r.read(bArr, 0, 3536);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Mix.AudioFixedConvertProcess", e17, "readPcmDataTrack", new java.lang.Object[0]);
            }
            if (i18 > 0) {
                hl.e b17 = il.i.a().b();
                b17.f282038f = bArr;
                dVar.m(b17);
            }
        }
        dVar.a();
    }

    @Override // kl.e, kl.k
    public hl.e c(int i17) {
        java.io.InputStream inputStream = this.f308726r;
        if (inputStream == null) {
            int i18 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.e("MicroMsg.Mix.AudioFixedConvertProcess", "readPcmDataTrack, inputStream is null", null);
            return null;
        }
        if (i17 > 0) {
            byte[] bArr = new byte[i17];
            try {
                if (inputStream.read(bArr, 0, i17) > 0) {
                    hl.e b17 = il.i.a().b();
                    b17.f282038f = bArr;
                    return b17;
                }
                int i19 = rl.b.f397143a;
                com.tencent.mars.xlog.Log.e("MicroMsg.Mix.AudioFixedConvertProcess", "readPcmDataTrack readSize is 0", null);
            } catch (java.lang.Exception e17) {
                int i27 = rl.b.f397143a;
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Mix.AudioFixedConvertProcess", e17, "readPcmDataTrack", new java.lang.Object[0]);
            }
        }
        return null;
    }

    @Override // kl.e, kl.k
    public void d() {
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioFixedConvertProcess", "finishProcess", null);
        try {
            java.io.OutputStream outputStream = this.f308725q;
            if (outputStream != null) {
                outputStream.flush();
                this.f308725q.close();
                this.f308725q = null;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Mix.AudioFixedConvertProcess", e17, "finishProcess", new java.lang.Object[0]);
        }
        java.lang.Runtime.getRuntime().gc();
    }

    @Override // kl.e
    public kl.l e() {
        return kl.c.a(1);
    }

    @Override // kl.e, kl.k
    public void release() {
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioFixedConvertProcess", "release", null);
        super.release();
        try {
            java.io.OutputStream outputStream = this.f308725q;
            if (outputStream != null) {
                outputStream.flush();
                this.f308725q.close();
                this.f308725q = null;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Mix.AudioFixedConvertProcess", e17, "outputStream close", new java.lang.Object[0]);
        }
        try {
            java.io.InputStream inputStream = this.f308726r;
            if (inputStream != null) {
                inputStream.close();
                this.f308726r = null;
            }
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Mix.AudioFixedConvertProcess", e18, "inputStream close", new java.lang.Object[0]);
        }
    }
}
