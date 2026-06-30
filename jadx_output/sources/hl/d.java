package hl;

/* loaded from: classes13.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    public boolean f282019b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f282020c;

    /* renamed from: d, reason: collision with root package name */
    public long f282021d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f282022e;

    /* renamed from: j, reason: collision with root package name */
    public hl.a f282027j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f282028k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f282029l;

    /* renamed from: f, reason: collision with root package name */
    public int f282023f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f282024g = 0;

    /* renamed from: h, reason: collision with root package name */
    public long f282025h = 0;

    /* renamed from: i, reason: collision with root package name */
    public boolean f282026i = false;

    /* renamed from: m, reason: collision with root package name */
    public int f282030m = 44100;

    /* renamed from: n, reason: collision with root package name */
    public int f282031n = 2;

    /* renamed from: o, reason: collision with root package name */
    public int f282032o = 2;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f282018a = new java.util.ArrayList();

    public d(java.lang.String str) {
        this.f282020c = str;
    }

    public void a() {
        this.f282019b = true;
        this.f282024g = k();
        java.lang.Object[] objArr = {this.f282020c};
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.PcmBufferProvider", "src:%s is complete cache", objArr);
    }

    public void b() {
        hl.a aVar = this.f282027j;
        if (aVar != null) {
            aVar.a();
            hl.a aVar2 = this.f282027j;
            aVar2.getClass();
            int i17 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioPcmCacheFile", "deleteFile", null);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("deleteFile, fileName:");
            java.lang.String str = aVar2.f282013b;
            sb6.append(str);
            com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioPcmCacheFile", sb6.toString(), null);
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
            if (r6Var.m()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioPcmCacheFile", "delete the piece File", null);
                r6Var.l();
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.Mix.AudioPcmCacheFile", "file not exist, delete piece File fail", null);
            }
            this.f282027j = null;
        }
    }

    public long c() {
        long j17 = this.f282025h;
        if (j17 > 0) {
            return j17;
        }
        long k17 = k() * 3536;
        this.f282025h = k17;
        return k17;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d() {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hl.d.d():void");
    }

    public hl.e e(int i17) {
        boolean z17 = this.f282026i;
        if (z17 && this.f282027j != null) {
            return f(i17);
        }
        if (z17 && this.f282027j == null) {
            synchronized (this) {
                d();
            }
            return f(i17);
        }
        java.util.ArrayList arrayList = this.f282018a;
        if (arrayList == null || arrayList.size() == 0 || i17 >= this.f282018a.size()) {
            return null;
        }
        return (hl.e) this.f282018a.get(i17);
    }

    public hl.e f(int i17) {
        hl.a aVar;
        int i18;
        hl.e b17;
        int read;
        if (i17 >= this.f282024g || (aVar = this.f282027j) == null || (i18 = i17 * 3536) > aVar.b() || (b17 = il.h.a().b()) == null) {
            return null;
        }
        byte[] bArr = b17.f282038f;
        int i19 = 0;
        if (bArr == null) {
            b17.f282038f = new byte[3536];
        } else {
            java.util.Arrays.fill(bArr, 0, bArr.length, (byte) 0);
        }
        java.lang.System.nanoTime();
        byte[] bArr2 = b17.f282038f;
        long j17 = i18;
        int length = bArr2.length;
        hl.a aVar2 = this.f282027j;
        if (aVar2 != null) {
            synchronized (aVar2) {
                if (length == 0) {
                    int i27 = rl.b.f397143a;
                    com.tencent.mars.xlog.Log.e("MicroMsg.Mix.AudioPcmCacheFile", "read error, length == 0", null);
                } else {
                    java.io.RandomAccessFile randomAccessFile = aVar2.f282012a;
                    if (randomAccessFile == null) {
                        int i28 = rl.b.f397143a;
                        com.tencent.mars.xlog.Log.e("MicroMsg.Mix.AudioPcmCacheFile", "read error, randomAccessFile is null", null);
                    } else {
                        try {
                            randomAccessFile.seek(j17);
                            read = aVar2.f282012a.read(bArr2, 0, length);
                        } catch (java.io.IOException unused) {
                            java.lang.String format = java.lang.String.format("Error reading %d bytes with offset %d from file[%d bytes] to buffer[%d bytes]", java.lang.Integer.valueOf(length), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(aVar2.b()), java.lang.Integer.valueOf(bArr2.length));
                            int i29 = rl.b.f397143a;
                            com.tencent.mars.xlog.Log.e("MicroMsg.Mix.AudioPcmCacheFile", format, null);
                        }
                    }
                }
                read = -1;
            }
            i19 = read;
        }
        if (i19 <= 0) {
            il.h.a().c(b17);
            return null;
        }
        b17.f282033a = this.f282029l;
        b17.f282034b = this.f282030m;
        b17.f282035c = this.f282031n;
        b17.f282036d = this.f282032o;
        b17.f282037e = i17 * 20;
        return b17;
    }

    public synchronized void g() {
        int size = this.f282018a.size();
        for (int i17 = size - 1; i17 >= 0; i17--) {
            hl.e eVar = (hl.e) this.f282018a.remove(i17);
            if (eVar != null) {
                il.i a17 = il.i.a();
                a17.getClass();
                if (eVar.f282038f != null) {
                    eVar.a();
                    synchronized (a17.f292001b) {
                        a17.f292000a.add(0, eVar);
                    }
                }
            }
        }
        i(size);
    }

    public synchronized void h() {
        int size = this.f282018a.size();
        for (int i17 = size - 1; i17 >= 0; i17--) {
            hl.e eVar = (hl.e) this.f282018a.remove(i17);
            if (eVar != null) {
                eVar.f282033a = null;
                eVar.f282038f = null;
            }
        }
        i(size);
    }

    public final void i(int i17) {
        java.lang.Object[] objArr = {this.f282020c, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(this.f282019b), java.lang.Long.valueOf(this.f282021d), java.lang.Boolean.valueOf(this.f282022e), java.lang.Long.valueOf(this.f282025h)};
        int i18 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.PcmBufferProvider", "resetProvider src:%s, size:%d, complete:%b, duration:%d, supportMixPlay:%b, bufferSize:%d", objArr);
        this.f282018a.clear();
        this.f282019b = false;
        this.f282021d = 0L;
        this.f282022e = false;
        this.f282023f = 0;
        this.f282025h = 0L;
        this.f282026i = false;
        b();
    }

    public synchronized boolean j(java.lang.String str) {
        if (this.f282026i) {
            java.lang.Object[] objArr = {this.f282020c};
            int i17 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.i("MicroMsg.Mix.PcmBufferProvider", "cache to file has finish, file:%s", objArr);
            return true;
        }
        this.f282028k = str;
        int size = this.f282018a.size();
        if (size > 0) {
            d();
        }
        if (this.f282027j == null) {
            int i18 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.e("MicroMsg.Mix.PcmBufferProvider", "cacheFile is null", null);
            this.f282026i = false;
            return false;
        }
        for (int i19 = 0; i19 < size; i19++) {
            hl.e eVar = (hl.e) this.f282018a.get(i19);
            if (i19 == 0) {
                this.f282029l = eVar.f282033a;
                this.f282030m = eVar.f282034b;
                this.f282032o = eVar.f282036d;
                this.f282031n = eVar.f282035c;
            }
            if (eVar != null) {
                byte[] bArr = eVar.f282038f;
                if (!l(bArr, i19 * 3536, bArr.length)) {
                    b();
                    int i27 = rl.b.f397143a;
                    com.tencent.mars.xlog.Log.e("MicroMsg.Mix.PcmBufferProvider", "setCacheToFile fail", null);
                    this.f282026i = false;
                    return false;
                }
            }
        }
        this.f282026i = true;
        for (int i28 = size - 1; i28 >= 0; i28--) {
            hl.e eVar2 = (hl.e) this.f282018a.remove(i28);
            if (eVar2 != null) {
                il.i a17 = il.i.a();
                a17.getClass();
                if (eVar2.f282038f != null) {
                    eVar2.a();
                    synchronized (a17.f292001b) {
                        a17.f292000a.add(0, eVar2);
                    }
                }
            }
        }
        java.lang.Object[] objArr2 = {this.f282020c};
        int i29 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.PcmBufferProvider", "setCacheToFile finish, src:%s", objArr2);
        return true;
    }

    public int k() {
        int i17 = this.f282024g;
        return (i17 <= 0 || !this.f282019b) ? this.f282018a.size() : i17;
    }

    public boolean l(byte[] bArr, long j17, int i17) {
        hl.a aVar = this.f282027j;
        boolean z17 = false;
        if (aVar == null) {
            return false;
        }
        synchronized (aVar) {
            if (i17 == 0) {
                int i18 = rl.b.f397143a;
                com.tencent.mars.xlog.Log.e("MicroMsg.Mix.AudioPcmCacheFile", "write error, length == 0", null);
            } else {
                java.io.RandomAccessFile randomAccessFile = aVar.f282012a;
                if (randomAccessFile == null) {
                    int i19 = rl.b.f397143a;
                    com.tencent.mars.xlog.Log.e("MicroMsg.Mix.AudioPcmCacheFile", "write error, randomAccessFile is null", null);
                } else {
                    try {
                        randomAccessFile.seek(j17);
                        aVar.f282012a.write(bArr, 0, i17);
                        z17 = true;
                    } catch (java.io.IOException unused) {
                        java.lang.String format = java.lang.String.format("Error writing %d bytes to from buffer with size %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(bArr.length));
                        int i27 = rl.b.f397143a;
                        com.tencent.mars.xlog.Log.e("MicroMsg.Mix.AudioPcmCacheFile", format, null);
                    }
                }
            }
        }
        return z17;
    }

    public void m(hl.e eVar) {
        this.f282023f = this.f282023f + 1;
        eVar.f282037e = r0 * 20;
        java.util.ArrayList arrayList = this.f282018a;
        if (arrayList != null) {
            arrayList.add(eVar);
        }
    }
}
