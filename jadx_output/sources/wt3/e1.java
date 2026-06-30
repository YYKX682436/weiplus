package wt3;

/* loaded from: classes5.dex */
public final class e1 extends wt3.n0 {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f449408i;

    /* renamed from: j, reason: collision with root package name */
    public final long f449409j;

    /* renamed from: k, reason: collision with root package name */
    public final long f449410k;

    /* renamed from: l, reason: collision with root package name */
    public final int f449411l;

    /* renamed from: m, reason: collision with root package name */
    public final int f449412m;

    /* renamed from: n, reason: collision with root package name */
    public final yz5.l f449413n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.mmsight.segment.i f449414o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.mmsight.segment.j f449415p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(java.lang.String videoPath, long j17, long j18, int i17, int i18, yz5.l lVar, wt3.q classifier) {
        super(classifier);
        kotlin.jvm.internal.o.g(videoPath, "videoPath");
        kotlin.jvm.internal.o.g(classifier, "classifier");
        this.f449408i = videoPath;
        this.f449409j = j17;
        this.f449410k = j18;
        this.f449411l = i17;
        this.f449412m = i18;
        this.f449413n = lVar;
    }

    @Override // wt3.n0
    public android.graphics.Bitmap d(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoFrameFeatureExtractor", "nextBitmap:" + this.f449454d[i17]);
        com.tencent.mm.plugin.mmsight.segment.j jVar = this.f449415p;
        android.graphics.Bitmap frameAtTime = jVar != null ? jVar.getFrameAtTime(this.f449454d[i17]) : null;
        if (frameAtTime != null) {
            return frameAtTime;
        }
        int i18 = this.f449452b;
        int i19 = this.f449453c;
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i19));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/model/audio/VideoFrameFeatureExtractor", "nextBitmap", "(I)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/recordvideo/model/audio/VideoFrameFeatureExtractor", "nextBitmap", "(I)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
        return createBitmap;
    }

    @Override // wt3.n0
    public void e() {
        com.tencent.mm.plugin.mmsight.segment.i iVar = this.f449414o;
        if (iVar != null) {
            iVar.c(this.f449415p);
        }
        com.tencent.mm.plugin.mmsight.segment.i iVar2 = this.f449414o;
        if (iVar2 != null) {
            iVar2.b();
        }
    }

    @Override // wt3.n0
    public void f() {
        java.lang.String str;
        java.lang.String str2 = this.f449408i;
        com.tencent.mm.plugin.sight.base.b d17 = com.tencent.mm.plugin.sight.base.e.d(str2, true);
        int i17 = d17 != null ? d17.f162382a : 0;
        if (i17 <= 0) {
            try {
                gp.d dVar = new gp.d();
                dVar.setDataSource(str2);
                i17 = com.tencent.mm.sdk.platformtools.t8.P(dVar.extractMetadata(9), 0);
            } catch (java.lang.Exception unused) {
            }
        }
        if (i17 <= 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.VideoFrameFeatureExtractor", "get video duration error! file exit: " + com.tencent.mm.vfs.w6.j(str2));
        }
        this.f449414o = new com.tencent.mm.plugin.mmsight.segment.i(3, new wt3.d1(this));
        long j17 = this.f449409j;
        if (j17 < 0) {
            j17 = 0;
        }
        long j18 = this.f449410k;
        if (j18 < 0) {
            j18 = i17;
        }
        long j19 = j18 - j17;
        if (j19 > 0) {
            long j27 = 100;
            str = "MicroMsg.VideoFrameFeatureExtractor";
            this.f449454d = new int[]{(int) (j17 + j27), (int) (j19 / 2), (int) (j18 - j27)};
        } else {
            str = "MicroMsg.VideoFrameFeatureExtractor";
            if (i17 > 300) {
                this.f449454d = new int[]{100, i17 / 2, i17 - 100};
            }
        }
        st3.v vVar = st3.v.f412605d;
        long j28 = this.f449411l == 10 ? j18 : i17;
        yz5.l lVar = this.f449413n;
        if (lVar != null) {
            lVar.invoke(java.lang.Long.valueOf(j28));
        }
        java.lang.String str3 = str;
        com.tencent.mars.xlog.Log.i(str3, "videoDuration:" + i17 + ", start:" + j17 + ", end:" + j18);
        try {
            int i18 = this.f449452b;
            int i19 = this.f449453c;
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i19));
            arrayList.add(java.lang.Integer.valueOf(i18));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/model/audio/VideoFrameFeatureExtractor", "onPrepareImageData", "()V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/recordvideo/model/audio/VideoFrameFeatureExtractor", "onPrepareImageData", "()V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
            com.tencent.mm.plugin.mmsight.segment.i iVar = this.f449414o;
            com.tencent.mm.plugin.mmsight.segment.j a17 = iVar != null ? iVar.a() : null;
            this.f449415p = a17;
            if (a17 != null) {
                a17.reuseBitmap(createBitmap);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(str3, e17, "processImageData error", new java.lang.Object[0]);
        }
    }
}
