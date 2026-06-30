package com.tencent.mm.zoomimage.subsampling.internal;

/* loaded from: classes11.dex */
public final class t0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zq5.e f215097d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f215098e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(zq5.e eVar, int i17) {
        super(1);
        this.f215097d = eVar;
        this.f215098e = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        yq5.h decoder = (yq5.h) obj;
        kotlin.jvm.internal.o.g(decoder, "decoder");
        com.tencent.mm.zoomimage.subsampling.internal.d dVar = (com.tencent.mm.zoomimage.subsampling.internal.d) decoder;
        zq5.e region = this.f215097d;
        kotlin.jvm.internal.o.g(region, "region");
        dVar.a();
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inSampleSize = this.f215098e;
        jz5.g gVar = dVar.f214930f;
        com.tencent.mm.zoomimage.subsampling.internal.e eVar = (com.tencent.mm.zoomimage.subsampling.internal.e) ((jz5.n) gVar).getValue();
        long j17 = ((yq5.c) ((jz5.n) dVar.f214933i).getValue()).f464591a;
        eVar.getClass();
        int i17 = eVar.f214939c;
        boolean z17 = java.lang.Math.abs(i17 % com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1) != 0;
        int i18 = -i17;
        long d17 = zq5.h.d(j17, i18);
        if (z17) {
            region = zq5.f.a(region, j17, i18);
        }
        if (eVar.f214938b) {
            int i19 = zq5.g.f475066c;
            int i27 = (int) (d17 >> 32);
            region = new zq5.e(i27 - region.f475063c, region.f475062b, i27 - region.f475061a, region.f475064d);
        }
        android.graphics.BitmapRegionDecoder bitmapRegionDecoder = dVar.f214932h;
        kotlin.jvm.internal.o.d(bitmapRegionDecoder);
        android.graphics.Rect rect = new android.graphics.Rect(region.f475061a, region.f475062b, region.f475063c, region.f475064d);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(options);
        arrayList.add(rect);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(bitmapRegionDecoder, arrayList.toArray(), "com/tencent/mm/zoomimage/subsampling/internal/AndroidRegionDecoder", "decodeRegion", "(Lcom/tencent/mm/zoomimage/util/IntRectCompat;I)Landroid/graphics/Bitmap;", "android/graphics/BitmapRegionDecoder_EXEC_", "decodeRegion", "(Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeRegion = bitmapRegionDecoder.decodeRegion((android.graphics.Rect) arrayList.get(0), (android.graphics.BitmapFactory.Options) arrayList.get(1));
        yj0.a.e(bitmapRegionDecoder, decodeRegion, "com/tencent/mm/zoomimage/subsampling/internal/AndroidRegionDecoder", "decodeRegion", "(Lcom/tencent/mm/zoomimage/util/IntRectCompat;I)Landroid/graphics/Bitmap;", "android/graphics/BitmapRegionDecoder_EXEC_", "decodeRegion", "(Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        if (decodeRegion == null) {
            throw new java.lang.Exception("Invalid image. region decode return null");
        }
        com.tencent.mm.zoomimage.subsampling.internal.e eVar2 = (com.tencent.mm.zoomimage.subsampling.internal.e) ((jz5.n) gVar).getValue();
        eVar2.getClass();
        int i28 = eVar2.f214939c;
        boolean z18 = java.lang.Math.abs(i28 % com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1) != 0;
        boolean z19 = eVar2.f214938b;
        if (!z19 && !z18) {
            return decodeRegion;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        if (z19) {
            matrix.postScale(-1.0f, 1.0f);
        }
        if (z18) {
            matrix.postRotate(i28);
        }
        android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, decodeRegion.getWidth(), decodeRegion.getHeight());
        matrix.mapRect(rectF);
        matrix.postTranslate(-rectF.left, -rectF.top);
        android.graphics.Bitmap.Config config = decodeRegion.getConfig();
        if (config == null) {
            config = android.graphics.Bitmap.Config.ARGB_8888;
        }
        int width = (int) rectF.width();
        int height = (int) rectF.height();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(java.lang.Integer.valueOf(height));
        arrayList2.add(java.lang.Integer.valueOf(width));
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/zoomimage/subsampling/internal/ExifOrientationHelper", "applyToBitmap", "(Landroid/graphics/Bitmap;Z)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList2.get(2));
        yj0.a.e(obj2, createBitmap, "com/tencent/mm/zoomimage/subsampling/internal/ExifOrientationHelper", "applyToBitmap", "(Landroid/graphics/Bitmap;Z)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
        new android.graphics.Canvas(createBitmap).drawBitmap(decodeRegion, matrix, new android.graphics.Paint(6));
        return createBitmap;
    }
}
