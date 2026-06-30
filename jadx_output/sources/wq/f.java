package wq;

/* loaded from: classes13.dex */
public final class f implements wq.d {

    /* renamed from: a, reason: collision with root package name */
    public int f448477a;

    /* renamed from: b, reason: collision with root package name */
    public long f448478b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f448479c;

    /* renamed from: d, reason: collision with root package name */
    public int f448480d;

    /* renamed from: e, reason: collision with root package name */
    public int f448481e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Bitmap f448482f;

    /* renamed from: g, reason: collision with root package name */
    public final wq.c f448483g;

    public f(byte[] bytes) {
        kotlin.jvm.internal.o.g(bytes, "bytes");
        int[] iArr = new int[6];
        this.f448479c = iArr;
        this.f448480d = -1;
        this.f448477a = com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().startPerformance(com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifEnable(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifDelay(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifCPU(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifIO(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifThr() ? android.os.Process.myTid() : 0, com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifTimeout(), 602, com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifAction(), "MicroMsg.GIF.MMGIFDecoder");
        this.f448478b = com.tencent.mm.plugin.gif.MMGIFJNI.openByByteArray(bytes, iArr);
        int i17 = iArr[0];
        if (i17 > 1024 || iArr[1] > 1024) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GIF.MMGIFDecoder", "emoji width or height over size. Width:%d Height:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[1]));
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(401L, 2L, 1L, false);
        }
        int i18 = iArr[0];
        int i19 = iArr[1];
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i19));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/emoji/decode/MMGIFDecoder", "<init>", "([B)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/emoji/decode/MMGIFDecoder", "<init>", "([B)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
        this.f448482f = createBitmap;
        this.f448483g = new wq.c(iArr[2]);
    }

    @Override // wq.d
    public int a() {
        int[] iArr = this.f448479c;
        if (iArr[2] == 1) {
            return Integer.MAX_VALUE;
        }
        return iArr[4];
    }

    @Override // wq.d
    public int b() {
        return this.f448479c[1];
    }

    @Override // wq.d
    public void c() {
        long j17 = this.f448478b;
        android.graphics.Bitmap bitmap = this.f448482f;
        int[] iArr = this.f448479c;
        com.tencent.mm.plugin.gif.MMGIFJNI.drawFrameBitmap(j17, bitmap, iArr);
        this.f448480d = iArr[5];
        this.f448481e = iArr[4];
    }

    @Override // wq.d
    public int d() {
        return this.f448479c[2];
    }

    @Override // wq.d
    public void destroy() {
        if (this.f448477a != 0) {
            com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().stopPerformance(com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifEnable() || com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifFrameEnable(), this.f448477a);
            this.f448477a = 0;
        }
        long j17 = this.f448478b;
        this.f448478b = 0L;
        com.tencent.mm.plugin.gif.MMGIFJNI.recycle(j17);
    }

    @Override // wq.d
    public int e() {
        return this.f448479c[0];
    }

    @Override // wq.d
    public android.graphics.Bitmap getFrame() {
        return this.f448482f;
    }

    @Override // wq.d
    public void seekTo(long j17) {
        if (this.f448481e <= 0) {
            c();
        }
        int i17 = (int) j17;
        wq.c cVar = this.f448483g;
        int a17 = cVar.a(i17);
        int[] iArr = this.f448479c;
        int i18 = iArr[2];
        for (int i19 = 0; i19 < i18 && a17 < 0; i19++) {
            c();
            cVar.b(this.f448480d, this.f448481e);
            a17 = cVar.a(i17);
        }
        int i27 = a17 - this.f448480d;
        int i28 = iArr[2];
        int i29 = (i27 + i28) % i28;
        a();
        int i37 = iArr[2];
        boolean z17 = cVar.f448474c;
        for (int i38 = 0; i38 < i29; i38++) {
            c();
        }
    }

    public f(java.io.InputStream stream) {
        kotlin.jvm.internal.o.g(stream, "stream");
        int[] iArr = new int[6];
        this.f448479c = iArr;
        this.f448480d = -1;
        this.f448477a = com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().startPerformance(com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifEnable(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifDelay(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifCPU(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifIO(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifThr() ? android.os.Process.myTid() : 0, com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifTimeout(), 602, com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifAction(), "MicroMsg.GIF.MMGIFDecoder");
        this.f448478b = com.tencent.mm.plugin.gif.MMGIFJNI.openByInputStrem(stream, iArr);
        int i17 = iArr[0];
        if (i17 > 1024 || iArr[1] > 1024) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GIF.MMGIFDecoder", "emoji width or height over size. Width:%d Height:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[1]));
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(401L, 2L, 1L, false);
        }
        int i18 = iArr[0];
        int i19 = iArr[1];
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i19));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/emoji/decode/MMGIFDecoder", "<init>", "(Ljava/io/InputStream;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/emoji/decode/MMGIFDecoder", "<init>", "(Ljava/io/InputStream;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
        this.f448482f = createBitmap;
        this.f448483g = new wq.c(iArr[2]);
    }
}
