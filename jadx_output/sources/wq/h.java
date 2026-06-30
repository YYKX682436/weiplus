package wq;

/* loaded from: classes10.dex */
public final class h implements wq.d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f448486a;

    /* renamed from: b, reason: collision with root package name */
    public long f448487b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f448488c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f448489d;

    /* renamed from: e, reason: collision with root package name */
    public int f448490e;

    /* renamed from: f, reason: collision with root package name */
    public int f448491f;

    /* renamed from: g, reason: collision with root package name */
    public final wq.c f448492g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Bitmap f448493h;

    public h(byte[] bytes) {
        kotlin.jvm.internal.o.g(bytes, "bytes");
        this.f448486a = "MicroMsg.GIF.MMWXGFDecoder";
        int[] iArr = new int[4];
        this.f448488c = iArr;
        this.f448489d = new int[4];
        this.f448490e = -1;
        long nativeInitWxAMDecoder = com.tencent.mm.plugin.gif.MMWXGFJNI.nativeInitWxAMDecoder();
        this.f448487b = nativeInitWxAMDecoder;
        if (nativeInitWxAMDecoder == 0 || nativeInitWxAMDecoder == -901) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GIF.MMWXGFDecoder", "Cpan init wxam decoder failed. gifHandle:%d", java.lang.Long.valueOf(nativeInitWxAMDecoder));
            if (this.f448487b == -901) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(711L, 5L, 1L, false);
            }
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(711L, 4L, 1L, false);
            throw new com.tencent.mm.plugin.gif.MMGIFException(201);
        }
        int nativeDecodeBufferHeader = com.tencent.mm.plugin.gif.MMWXGFJNI.nativeDecodeBufferHeader(nativeInitWxAMDecoder, bytes, bytes.length);
        if (nativeDecodeBufferHeader != 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GIF.MMWXGFDecoder", "Cpan WXGF decode buffer header failed. result:%d", java.lang.Integer.valueOf(nativeDecodeBufferHeader));
            if (nativeDecodeBufferHeader == -904) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(711L, 8L, 1L, false);
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(711L, 3L, 1L, false);
            }
            throw new com.tencent.mm.plugin.gif.MMGIFException(nativeDecodeBufferHeader);
        }
        int nativeGetOption = com.tencent.mm.plugin.gif.MMWXGFJNI.nativeGetOption(this.f448487b, bytes, bytes.length, iArr);
        if (nativeGetOption != 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GIF.MMWXGFDecoder", "Cpan WXGF get option failed. result:%d", java.lang.Integer.valueOf(nativeGetOption));
            if (nativeGetOption == -903) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(711L, 7L, 1L, false);
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(711L, 3L, 1L, false);
            }
            throw new com.tencent.mm.plugin.gif.MMGIFException(nativeGetOption);
        }
        int i17 = iArr[1];
        int i18 = iArr[2];
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/emoji/decode/MMWXGFDecoder", "<init>", "([B)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/emoji/decode/MMWXGFDecoder", "<init>", "([B)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
        this.f448493h = createBitmap;
        this.f448492g = new wq.c(iArr[0]);
    }

    @Override // wq.d
    public int a() {
        if (this.f448488c[0] == 1) {
            return Integer.MAX_VALUE;
        }
        return this.f448491f;
    }

    @Override // wq.d
    public int b() {
        return this.f448488c[2];
    }

    @Override // wq.d
    public void c() {
        int nativeDecodeBufferFrame = com.tencent.mm.plugin.gif.MMWXGFJNI.nativeDecodeBufferFrame(this.f448487b, null, 0, this.f448493h, this.f448489d);
        java.lang.String str = this.f448486a;
        if (nativeDecodeBufferFrame == -909) {
            com.tencent.mars.xlog.Log.i(str, "nativeDecodeBufferFrame failed. frame is null.");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(401L, 11L, 1L, false);
        } else if (nativeDecodeBufferFrame == -904) {
            com.tencent.mars.xlog.Log.i(str, "nativeDecodeBufferFrame failed. func is null.");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(401L, 8L, 1L, false);
        } else if (nativeDecodeBufferFrame == -1) {
            com.tencent.mars.xlog.Log.i(str, "nativeDecodeBufferFrame failed.");
        }
        int i17 = this.f448490e + 1;
        this.f448490e = i17;
        int[] iArr = this.f448488c;
        if ((i17 >= iArr[0] - 1 || nativeDecodeBufferFrame == 1) && com.tencent.mm.plugin.gif.MMWXGFJNI.nativeRewindBuffer(this.f448487b) == -905) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(711L, 9L, 1L, false);
            com.tencent.mars.xlog.Log.w(str, "Cpan Rewind buffer failed.");
        }
        this.f448490e %= iArr[0];
        int i18 = this.f448489d[0];
        if (i18 <= 0) {
            i18 = 100;
        }
        this.f448491f = i18;
    }

    @Override // wq.d
    public int d() {
        return this.f448488c[0];
    }

    @Override // wq.d
    public void destroy() {
        long j17 = this.f448487b;
        this.f448487b = 0L;
        if (com.tencent.mm.plugin.gif.MMWXGFJNI.nativeUninit(j17) == -906) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(401L, 10L, 1L, false);
        }
    }

    @Override // wq.d
    public int e() {
        return this.f448488c[1];
    }

    @Override // wq.d
    public android.graphics.Bitmap getFrame() {
        return this.f448493h;
    }

    @Override // wq.d
    public void seekTo(long j17) {
        if (this.f448491f <= 0) {
            c();
        }
        int i17 = (int) j17;
        wq.c cVar = this.f448492g;
        int a17 = cVar.a(i17);
        int[] iArr = this.f448488c;
        int i18 = iArr[0];
        for (int i19 = 0; i19 < i18 && a17 < 0; i19++) {
            c();
            cVar.b(this.f448490e, this.f448491f);
            a17 = cVar.a(i17);
        }
        int i27 = a17 - this.f448490e;
        int i28 = iArr[0];
        int i29 = (i27 + i28) % i28;
        a();
        int i37 = iArr[0];
        boolean z17 = cVar.f448474c;
        for (int i38 = 0; i38 < i29; i38++) {
            c();
        }
    }
}
