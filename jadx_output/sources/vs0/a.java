package vs0;

/* loaded from: classes14.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final vs0.l f439824d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Point f439825e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f439826f;

    /* renamed from: g, reason: collision with root package name */
    public final android.media.Image f439827g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.l f439828h;

    public a(vs0.l lVar, android.graphics.Point screenSize, boolean z17, android.media.Image image, yz5.l imageReadyCallback) {
        kotlin.jvm.internal.o.g(screenSize, "screenSize");
        kotlin.jvm.internal.o.g(image, "image");
        kotlin.jvm.internal.o.g(imageReadyCallback, "imageReadyCallback");
        this.f439824d = lVar;
        this.f439825e = screenSize;
        this.f439826f = z17;
        this.f439827g = image;
        this.f439828h = imageReadyCallback;
    }

    public final android.graphics.Bitmap a(android.media.Image image, int i17, int i18) {
        if (this.f439824d == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Camera2ImageSaver", "a error happened when use rs and does not init rs helper");
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            android.graphics.Bitmap b17 = b(image, i17, i18, byteArrayOutputStream);
            byteArrayOutputStream.close();
            return b17;
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        int width = image.getWidth();
        int height = image.getHeight();
        android.graphics.Point point = this.f439825e;
        float ceil = (float) java.lang.Math.ceil((height - (width * (point.x / point.y))) / 2);
        android.media.Image.Plane[] planes = image.getPlanes();
        byte[][] bArr = new byte[3];
        for (int i19 = 0; i19 < 3; i19++) {
            java.nio.ByteBuffer buffer = planes[i19].getBuffer();
            byte[] bArr2 = new byte[buffer.capacity()];
            buffer.get(bArr2);
            bArr[i19] = bArr2;
        }
        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
        vs0.l lVar = this.f439824d;
        android.media.Image.Plane[] planes2 = image.getPlanes();
        kotlin.jvm.internal.o.f(planes2, "getPlanes(...)");
        int i27 = (int) ceil;
        lVar.getClass();
        lVar.a();
        int rowStride = planes2[0].getRowStride();
        int rowStride2 = planes2[1].getRowStride();
        int pixelStride = planes2[1].getPixelStride();
        android.renderscript.RenderScript renderScript = lVar.f439860b;
        android.renderscript.Type.Builder builder = new android.renderscript.Type.Builder(renderScript, android.renderscript.Element.U8(renderScript));
        builder.setX(rowStride).setY(bArr[0].length / rowStride);
        android.renderscript.Allocation createTyped = android.renderscript.Allocation.createTyped(lVar.f439860b, builder.create());
        createTyped.copyFrom(bArr[0]);
        rj.u uVar = lVar.f439859a;
        if (uVar != null) {
            synchronized (uVar) {
                uVar.setVar(8, createTyped);
            }
        }
        android.renderscript.RenderScript renderScript2 = lVar.f439860b;
        android.renderscript.Type.Builder builder2 = new android.renderscript.Type.Builder(renderScript2, android.renderscript.Element.U8(renderScript2));
        builder2.setX(bArr[1].length);
        android.renderscript.Allocation createTyped2 = android.renderscript.Allocation.createTyped(lVar.f439860b, builder2.create());
        createTyped2.copyFrom(bArr[1]);
        rj.u uVar2 = lVar.f439859a;
        if (uVar2 != null) {
            synchronized (uVar2) {
                uVar2.setVar(9, createTyped2);
            }
        }
        android.renderscript.Allocation createTyped3 = android.renderscript.Allocation.createTyped(lVar.f439860b, builder2.create());
        createTyped3.copyFrom(bArr[2]);
        rj.u uVar3 = lVar.f439859a;
        if (uVar3 != null) {
            synchronized (uVar3) {
                uVar3.setVar(10, createTyped3);
            }
        }
        rj.u uVar4 = lVar.f439859a;
        if (uVar4 != null) {
            long j17 = 0;
            synchronized (uVar4) {
                try {
                    android.renderscript.FieldPacker fieldPacker = uVar4.f396160b;
                    if (fieldPacker != null) {
                        fieldPacker.reset();
                    } else {
                        try {
                            uVar4.f396160b = new android.renderscript.FieldPacker(4);
                        } catch (java.lang.Throwable th6) {
                            th = th6;
                            throw th;
                        }
                    }
                    uVar4.f396160b.addU32(j17);
                    uVar4.setVar(3, uVar4.f396160b);
                } catch (java.lang.Throwable th7) {
                    th = th7;
                }
            }
        }
        rj.u uVar5 = lVar.f439859a;
        if (uVar5 != null) {
            uVar5.h(i27);
        }
        rj.u uVar6 = lVar.f439859a;
        if (uVar6 != null) {
            uVar6.g(rowStride2);
        }
        rj.u uVar7 = lVar.f439859a;
        if (uVar7 != null) {
            uVar7.f(pixelStride);
        }
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i18 - (i27 * 2)));
        arrayList.add(java.lang.Integer.valueOf(i17 - 0));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/media/widget/camera2/RenderScriptImageHelper", "yuv2RgbWithCrop", "([Landroid/media/Image$Plane;[[BIIII)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/media/widget/camera2/RenderScriptImageHelper", "yuv2RgbWithCrop", "([Landroid/media/Image$Plane;[[BIIII)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
        android.renderscript.Allocation createFromBitmap = android.renderscript.Allocation.createFromBitmap(lVar.f439860b, createBitmap, android.renderscript.Allocation.MipmapControl.MIPMAP_NONE, 1);
        rj.u uVar8 = lVar.f439859a;
        if (uVar8 != null) {
            uVar8.a(createFromBitmap);
        }
        createFromBitmap.copyTo(createBitmap);
        createTyped.destroy();
        createTyped2.destroy();
        createTyped3.destroy();
        createFromBitmap.destroy();
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera2ImageSaver", "op1 cost " + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime2));
        if (!this.f439826f) {
            long elapsedRealtime3 = android.os.SystemClock.elapsedRealtime();
            android.graphics.Bitmap c17 = this.f439824d.c(createBitmap, 270);
            com.tencent.mars.xlog.Log.i("MicroMsg.Camera2ImageSaver", "op4 cost " + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime3));
            com.tencent.mars.xlog.Log.i("MicroMsg.Camera2ImageSaver", "newFunc cost " + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
            return c17;
        }
        long elapsedRealtime4 = android.os.SystemClock.elapsedRealtime();
        android.graphics.Bitmap c18 = this.f439824d.c(createBitmap, 90);
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera2ImageSaver", "op2 cost " + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime4));
        long elapsedRealtime5 = android.os.SystemClock.elapsedRealtime();
        vs0.l lVar2 = this.f439824d;
        lVar2.getClass();
        lVar2.a();
        rj.u uVar9 = lVar2.f439859a;
        if (uVar9 != null) {
            int width2 = c18.getWidth();
            synchronized (uVar9) {
                uVar9.setVar(1, width2);
            }
        }
        if (uVar9 != null) {
            int height2 = c18.getHeight();
            synchronized (uVar9) {
                uVar9.setVar(2, height2);
            }
        }
        android.renderscript.Allocation createFromBitmap2 = android.renderscript.Allocation.createFromBitmap(lVar2.f439860b, c18, android.renderscript.Allocation.MipmapControl.MIPMAP_NONE, 1);
        c18.recycle();
        if (uVar9 != null) {
            synchronized (uVar9) {
                uVar9.setVar(0, createFromBitmap2);
            }
        }
        int height3 = c18.getHeight();
        int width3 = c18.getWidth();
        android.graphics.Bitmap.Config config2 = c18.getConfig();
        kotlin.jvm.internal.o.d(config2);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(config2);
        arrayList2.add(java.lang.Integer.valueOf(height3));
        arrayList2.add(java.lang.Integer.valueOf(width3));
        java.lang.Object obj2 = new java.lang.Object();
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/media/widget/camera2/RenderScriptImageHelper", "flipBitmap", "(Landroid/graphics/Bitmap;Z)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap2 = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList2.get(2));
        yj0.a.e(obj2, createBitmap2, "com/tencent/mm/media/widget/camera2/RenderScriptImageHelper", "flipBitmap", "(Landroid/graphics/Bitmap;Z)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        kotlin.jvm.internal.o.f(createBitmap2, "createBitmap(...)");
        android.renderscript.Allocation createFromBitmap3 = android.renderscript.Allocation.createFromBitmap(lVar2.f439860b, createBitmap2, android.renderscript.Allocation.MipmapControl.MIPMAP_NONE, 1);
        if (uVar9 != null) {
            uVar9.b(createFromBitmap3, createFromBitmap3);
        }
        createFromBitmap3.copyTo(createBitmap2);
        createFromBitmap3.destroy();
        createFromBitmap2.destroy();
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera2ImageSaver", "op3 cost " + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime5));
        com.tencent.mars.xlog.Log.i("MicroMsg.Camera2ImageSaver", "newFunc cost " + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        return createBitmap2;
    }

    public final android.graphics.Bitmap b(android.media.Image image, int i17, int i18, java.io.ByteArrayOutputStream byteArrayOutputStream) {
        android.graphics.Rect rect;
        int i19;
        android.graphics.Rect cropRect = image.getCropRect();
        int format = image.getFormat();
        int width = cropRect.width();
        int height = cropRect.height();
        android.media.Image.Plane[] planes = image.getPlanes();
        int i27 = width * height;
        byte[] bArr = new byte[(android.graphics.ImageFormat.getBitsPerPixel(format) * i27) / 8];
        byte[] bArr2 = new byte[planes[0].getRowStride()];
        int length = planes.length;
        int i28 = 1;
        int i29 = 0;
        int i37 = 0;
        int i38 = 1;
        while (i29 < length) {
            if (i29 != 0) {
                if (i29 == i28) {
                    i37 = i27 + 1;
                } else if (i29 == 2) {
                    i37 = i27;
                }
                i38 = 2;
            } else {
                i38 = i28;
                i37 = 0;
            }
            java.nio.ByteBuffer buffer = planes[i29].getBuffer();
            int rowStride = planes[i29].getRowStride();
            int pixelStride = planes[i29].getPixelStride();
            android.media.Image.Plane[] planeArr = planes;
            int i39 = i29 == 0 ? 0 : 1;
            int i47 = width >> i39;
            int i48 = width;
            int i49 = height >> i39;
            int i57 = height;
            int i58 = i27;
            buffer.position(((cropRect.top >> i39) * rowStride) + ((cropRect.left >> i39) * pixelStride));
            int i59 = 0;
            while (i59 < i49) {
                if (pixelStride == 1 && i38 == 1) {
                    buffer.get(bArr, i37, i47);
                    i37 += i47;
                    rect = cropRect;
                    i19 = i47;
                } else {
                    rect = cropRect;
                    i19 = ((i47 - 1) * pixelStride) + 1;
                    buffer.get(bArr2, 0, i19);
                    for (int i66 = 0; i66 < i47; i66++) {
                        bArr[i37] = bArr2[i66 * pixelStride];
                        i37 += i38;
                    }
                }
                if (i59 < i49 - 1) {
                    buffer.position((buffer.position() + rowStride) - i19);
                }
                i59++;
                cropRect = rect;
            }
            i29++;
            planes = planeArr;
            width = i48;
            height = i57;
            i27 = i58;
            i28 = 1;
        }
        byte[] w17 = ai3.d.w(bArr, i17, i18, 90);
        kotlin.jvm.internal.o.f(w17, "rotateNv21(...)");
        if (this.f439826f) {
            com.tencent.mm.plugin.sight.base.SightVideoJNI.mirrorCameraData(w17, i18, i17, true);
        }
        android.graphics.Point point = this.f439825e;
        float f17 = i17 * (point.x / point.y);
        float f18 = (i18 - f17) / 2;
        new android.graphics.YuvImage(w17, 17, i18, i17, null).compressToJpeg(new android.graphics.Rect((int) f18, 0, (int) (f17 + f18), i17), 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int size = byteArrayOutputStream.size();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(size));
        arrayList.add(0);
        arrayList.add(byteArray);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/media/widget/camera2/Camera2ImageSaver", "convertBitmapUseYuvImage", "(Landroid/media/Image;IILjava/io/ByteArrayOutputStream;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray((byte[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue());
        yj0.a.e(obj, decodeByteArray, "com/tencent/mm/media/widget/camera2/Camera2ImageSaver", "convertBitmapUseYuvImage", "(Landroid/media/Image;IILjava/io/ByteArrayOutputStream;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
        kotlin.jvm.internal.o.f(decodeByteArray, "decodeByteArray(...)");
        return decodeByteArray;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Bitmap bitmap;
        int i17;
        android.media.Image image = this.f439827g;
        int[] iArr = it0.c.f294486a;
        wo.g1 g1Var = wo.v1.f447829i;
        boolean z17 = (g1Var == null || (i17 = g1Var.f447709w) == -1 || i17 != 1) ? false : true;
        try {
            try {
                int width = image.getWidth();
                int height = image.getHeight();
                if (z17) {
                    bitmap = a(image, width, height);
                } else {
                    java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                    android.graphics.Bitmap b17 = b(image, width, height, byteArrayOutputStream);
                    byteArrayOutputStream.close();
                    bitmap = b17;
                }
                this.f439828h.invoke(bitmap);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Camera2ImageSaver", "take photo use image stream error", e17.getLocalizedMessage());
            }
        } finally {
            image.close();
        }
    }
}
