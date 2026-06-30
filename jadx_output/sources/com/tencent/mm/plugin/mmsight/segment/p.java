package com.tencent.mm.plugin.mmsight.segment;

/* loaded from: classes10.dex */
public class p implements com.tencent.mm.plugin.mmsight.segment.j {

    /* renamed from: a, reason: collision with root package name */
    public android.media.MediaMetadataRetriever f149065a;

    /* renamed from: b, reason: collision with root package name */
    public int f149066b;

    /* renamed from: c, reason: collision with root package name */
    public int f149067c;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Matrix f149069e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Paint f149070f = new android.graphics.Paint(1);

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Canvas f149068d = new android.graphics.Canvas();

    @Override // com.tencent.mm.plugin.mmsight.segment.j
    public int getDurationMs() {
        java.lang.String extractMetadata = this.f149065a.extractMetadata(9);
        if (extractMetadata == null) {
            return 0;
        }
        try {
            return java.lang.Integer.valueOf(extractMetadata).intValue();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MediaCodecThumbFetcher", "getDuration error %s", e17.getMessage());
            return 0;
        }
    }

    @Override // com.tencent.mm.plugin.mmsight.segment.j
    public android.graphics.Bitmap getFrameAtTime(long j17) {
        android.graphics.Bitmap bitmap;
        java.lang.System.currentTimeMillis();
        android.media.MediaMetadataRetriever mediaMetadataRetriever = this.f149065a;
        long j18 = j17 * 1000;
        zj0.a aVar = new zj0.a();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        aVar.c(java.lang.Long.valueOf(j18));
        yj0.a.d(mediaMetadataRetriever, aVar.b(), "com/tencent/mm/plugin/mmsight/segment/MediaMetadataRetrieverThumbFetcher", "getFrameAtTime", "(J)Landroid/graphics/Bitmap;", "Undefined", "getFrameAtTime", "(J)Landroid/graphics/Bitmap;");
        zj0.c.f473285a.set(aVar);
        long longValue = ((java.lang.Long) aVar.a(0)).longValue();
        zj0.c.a();
        android.graphics.Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(longValue);
        yj0.a.e(mediaMetadataRetriever, frameAtTime, "com/tencent/mm/plugin/mmsight/segment/MediaMetadataRetrieverThumbFetcher", "getFrameAtTime", "(J)Landroid/graphics/Bitmap;", "Undefined", "getFrameAtTime", "(J)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap bitmap2 = null;
        if (frameAtTime == null) {
            com.tencent.mars.xlog.Log.w("MediaCodecThumbFetcher", "get frame fail at time:%s, rawBitmap is null", java.lang.Long.valueOf(j18));
            return null;
        }
        int i17 = this.f149066b;
        int i18 = this.f149067c;
        if (!frameAtTime.isRecycled() && i17 > 0 && i18 > 0) {
            frameAtTime.getWidth();
            frameAtTime.getHeight();
            try {
                android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(config);
                arrayList.add(java.lang.Integer.valueOf(i18));
                arrayList.add(java.lang.Integer.valueOf(i17));
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/mmsight/segment/MediaMetadataRetrieverThumbFetcher", "tryGetBitmap", "(II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                bitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
                yj0.a.e(obj, bitmap, "com/tencent/mm/plugin/mmsight/segment/MediaMetadataRetrieverThumbFetcher", "tryGetBitmap", "(II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            } catch (java.lang.OutOfMemoryError e17) {
                com.tencent.mars.xlog.Log.e("MediaCodecThumbFetcher", "%s OutOfMemory %s", fp.k.c(), e17.getMessage());
                java.lang.System.gc();
                try {
                    android.graphics.Bitmap.Config config2 = android.graphics.Bitmap.Config.ARGB_8888;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(config2);
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(java.lang.Integer.valueOf(i18));
                    arrayList2.add(java.lang.Integer.valueOf(i17));
                    java.lang.Object obj2 = new java.lang.Object();
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/plugin/mmsight/segment/MediaMetadataRetrieverThumbFetcher", "tryGetBitmap", "(II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                    bitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList2.get(2));
                    yj0.a.e(obj2, bitmap, "com/tencent/mm/plugin/mmsight/segment/MediaMetadataRetrieverThumbFetcher", "tryGetBitmap", "(II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.e("MediaCodecThumbFetcher", "%s try again Exception %s", fp.k.c(), e18.getMessage());
                    bitmap = null;
                }
            }
            if (bitmap != null) {
                if (this.f149069e == null) {
                    int width = frameAtTime.getWidth();
                    int height = frameAtTime.getHeight();
                    android.graphics.Matrix matrix = new android.graphics.Matrix();
                    matrix.reset();
                    matrix.setTranslate((i17 - width) / 2.0f, (i18 - height) / 2.0f);
                    float f17 = height;
                    float f18 = width;
                    float f19 = i18;
                    float f27 = i17;
                    float f28 = f17 / f18 > f19 / f27 ? f27 / f18 : f19 / f17;
                    matrix.postScale(f28, f28, f27 / 2.0f, f19 / 2.0f);
                    this.f149069e = matrix;
                }
                this.f149068d.setBitmap(bitmap);
                this.f149068d.drawBitmap(frameAtTime, this.f149069e, this.f149070f);
                bitmap2 = bitmap;
            }
        }
        frameAtTime.recycle();
        java.lang.System.currentTimeMillis();
        return bitmap2;
    }

    @Override // com.tencent.mm.plugin.mmsight.segment.j
    public int getScaledHeight() {
        return this.f149067c;
    }

    @Override // com.tencent.mm.plugin.mmsight.segment.j
    public int getScaledWidth() {
        return this.f149066b;
    }

    @Override // com.tencent.mm.plugin.mmsight.segment.j
    public void init(java.lang.String str, int i17, int i18, int i19) {
        if (i18 <= 0 || i19 <= 0) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.CHINA, "destination width and height error, width %d, height %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19)));
        }
        try {
            gp.d dVar = new gp.d();
            this.f149065a = dVar;
            dVar.setDataSource(str);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MediaCodecThumbFetcher", e17, "init error:%s", e17.getMessage());
        }
        this.f149066b = i18;
        this.f149067c = i19;
    }

    @Override // com.tencent.mm.plugin.mmsight.segment.j
    public void release() {
        android.media.MediaMetadataRetriever mediaMetadataRetriever = this.f149065a;
        if (mediaMetadataRetriever != null) {
            try {
                mediaMetadataRetriever.release();
            } catch (java.io.IOException unused) {
            }
        }
        this.f149069e = null;
        this.f149070f = null;
        this.f149068d = null;
    }

    @Override // com.tencent.mm.plugin.mmsight.segment.j
    public void reuseBitmap(android.graphics.Bitmap bitmap) {
    }
}
