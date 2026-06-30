package yy3;

/* loaded from: classes13.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final long f468461d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f468462e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Point f468463f;

    /* renamed from: g, reason: collision with root package name */
    public int f468464g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f468465h = new boolean[4];

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yy3.f f468466i;

    public d(yy3.f fVar, long j17) {
        this.f468466i = fVar;
        this.f468461d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        synchronized (this.f468466i.f468469b) {
            yy3.f fVar = this.f468466i;
            fVar.f468475h = true;
            if (this.f468461d != fVar.f468472e) {
                fVar.f468475h = false;
                return;
            }
            if (!((java.util.HashMap) fVar.f468468a).isEmpty()) {
                byte[] bArr = (byte[]) ((java.util.HashMap) this.f468466i.f468468a).get("param_preview_data");
                this.f468462e = java.util.Arrays.copyOf(bArr, bArr.length);
                this.f468463f = new android.graphics.Point((android.graphics.Point) ((java.util.HashMap) this.f468466i.f468468a).get("param_camera_resolution"));
                this.f468464g = ((java.lang.Integer) ((java.util.HashMap) this.f468466i.f468468a).get("param_camera_rotation")).intValue();
                ((java.util.HashMap) this.f468466i.f468468a).clear();
            }
            yy3.f fVar2 = this.f468466i;
            yy3.e eVar = fVar2.f468473f;
            long j17 = fVar2.f468472e;
            com.tencent.mm.plugin.scanner.view.ScanCardRectView scanCardRectView = ((com.tencent.mm.plugin.scanner.view.n) eVar).f159963e;
            if (j17 == scanCardRectView.f159889q) {
                scanCardRectView.k(10L);
            }
            com.tencent.mm.plugin.licence.model.CardInfo cardInfo = new com.tencent.mm.plugin.licence.model.CardInfo(this.f468466i.f468479l.width(), this.f468466i.f468479l.height());
            synchronized (this.f468466i.f468470c) {
                byte[] bArr2 = this.f468462e;
                if (bArr2 == null || bArr2.length <= 0) {
                    i17 = 0;
                } else {
                    java.lang.System.currentTimeMillis();
                    if (this.f468464g % 180 != 0) {
                        android.graphics.Point point = this.f468463f;
                        int i18 = ((point.x * point.y) * 3) / 2;
                        boolean z17 = et5.h.f256676a;
                        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(i18);
                        java.nio.ByteBuffer c17 = et5.h.c(this.f468462e);
                        android.graphics.Point point2 = this.f468463f;
                        et5.h.a(allocateDirect, c17, point2.x, point2.y);
                        byte[] f17 = et5.h.f(allocateDirect);
                        android.graphics.Point point3 = this.f468463f;
                        int i19 = point3.x;
                        int i27 = point3.y;
                        android.graphics.Rect rect = this.f468466i.f468479l;
                        i17 = com.tencent.mm.plugin.licence.model.LibCardRecog.recognizeCardProcess(f17, i19, i27, rect.left, rect.top, rect.height(), this.f468466i.f468479l.width(), cardInfo, this.f468465h);
                    } else {
                        byte[] bArr3 = this.f468462e;
                        android.graphics.Point point4 = this.f468463f;
                        int i28 = point4.y;
                        int i29 = point4.x;
                        android.graphics.Rect rect2 = this.f468466i.f468479l;
                        i17 = com.tencent.mm.plugin.licence.model.LibCardRecog.recognizeCardProcess(bArr3, i28, i29, rect2.left, rect2.top, rect2.height(), this.f468466i.f468479l.width(), cardInfo, this.f468465h);
                    }
                    java.lang.System.currentTimeMillis();
                    java.util.Arrays.toString(this.f468465h);
                    yy3.f fVar3 = this.f468466i;
                    fVar3.f468477j++;
                    if (fVar3.c() && this.f468466i.f468477j < 60) {
                        i17 = 2;
                    }
                }
            }
            if (this.f468464g % 180 != 0) {
                boolean[] zArr = this.f468465h;
                boolean z18 = zArr[0];
                zArr[0] = zArr[2];
                zArr[2] = z18;
                boolean z19 = zArr[1];
                zArr[1] = zArr[3];
                zArr[3] = z19;
            }
            synchronized (this.f468466i.f468469b) {
                long j18 = this.f468461d;
                yy3.f fVar4 = this.f468466i;
                if (j18 == fVar4.f468472e) {
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putBooleanArray("param_card_edge", this.f468465h);
                    yy3.e eVar2 = this.f468466i.f468473f;
                    if (eVar2 != null) {
                        ((com.tencent.mm.plugin.scanner.view.n) eVar2).a(this.f468461d, bundle);
                    }
                    if (i17 != 1) {
                        yy3.f fVar5 = this.f468466i;
                        fVar5.f468475h = false;
                        yy3.f.a(fVar5);
                        return;
                    }
                    android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                    options.inSampleSize = 1;
                    byte[] bArr4 = cardInfo.bitmapData;
                    int i37 = cardInfo.bitmapLen;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(options);
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Integer.valueOf(i37));
                    arrayList.add(0);
                    arrayList.add(bArr4);
                    java.lang.Object obj = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/scanner/card/decoder/LicenseCardDecodeQueue$DecodeLicenseCardTask", "run", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
                    android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray((byte[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue(), (android.graphics.BitmapFactory.Options) arrayList.get(3));
                    yj0.a.e(obj, decodeByteArray, "com/tencent/mm/plugin/scanner/card/decoder/LicenseCardDecodeQueue$DecodeLicenseCardTask", "run", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BIILandroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
                    android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(java.lang.Boolean.TRUE);
                    arrayList2.add(config);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(decodeByteArray, arrayList2.toArray(), "com/tencent/mm/plugin/scanner/card/decoder/LicenseCardDecodeQueue$DecodeLicenseCardTask", "run", "()V", "android/graphics/Bitmap_EXEC_", "copy", "(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;");
                    android.graphics.Bitmap copy = decodeByteArray.copy((android.graphics.Bitmap.Config) arrayList2.get(0), ((java.lang.Boolean) arrayList2.get(1)).booleanValue());
                    yj0.a.e(decodeByteArray, copy, "com/tencent/mm/plugin/scanner/card/decoder/LicenseCardDecodeQueue$DecodeLicenseCardTask", "run", "()V", "android/graphics/Bitmap_EXEC_", "copy", "(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;");
                    if (this.f468466i.c() && 1 == this.f468466i.f468476i) {
                        byte[] bArr5 = this.f468462e;
                        if (this.f468464g % 180 != 0) {
                            android.graphics.Point point5 = this.f468463f;
                            int i38 = ((point5.x * point5.y) * 3) / 2;
                            boolean z27 = et5.h.f256676a;
                            java.nio.ByteBuffer allocateDirect2 = java.nio.ByteBuffer.allocateDirect(i38);
                            java.nio.ByteBuffer c18 = et5.h.c(this.f468462e);
                            android.graphics.Point point6 = this.f468463f;
                            et5.h.a(allocateDirect2, c18, point6.x, point6.y);
                            bArr5 = et5.h.f(allocateDirect2);
                        }
                        byte[] bArr6 = bArr5;
                        try {
                            android.graphics.Point point7 = this.f468463f;
                            android.graphics.YuvImage yuvImage = new android.graphics.YuvImage(bArr6, 17, point7.y, point7.x, null);
                            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                            yuvImage.compressToJpeg(this.f468466i.f468479l, 40, byteArrayOutputStream);
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            int length = byteArray.length;
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            arrayList3.add(java.lang.Integer.valueOf(length));
                            arrayList3.add(0);
                            arrayList3.add(byteArray);
                            java.lang.Object obj2 = new java.lang.Object();
                            java.util.Collections.reverse(arrayList3);
                            yj0.a.d(obj2, arrayList3.toArray(), "com/tencent/mm/plugin/scanner/card/decoder/LicenseCardDecodeQueue$DecodeLicenseCardTask", "run", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
                            android.graphics.Bitmap decodeByteArray2 = android.graphics.BitmapFactory.decodeByteArray((byte[]) arrayList3.get(0), ((java.lang.Integer) arrayList3.get(1)).intValue(), ((java.lang.Integer) arrayList3.get(2)).intValue());
                            yj0.a.e(obj2, decodeByteArray2, "com/tencent/mm/plugin/scanner/card/decoder/LicenseCardDecodeQueue$DecodeLicenseCardTask", "run", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
                            copy = decodeByteArray2;
                        } catch (java.lang.RuntimeException unused) {
                        }
                    }
                    if (copy == null) {
                        yy3.f fVar6 = this.f468466i;
                        fVar6.f468475h = false;
                        yy3.f.a(fVar6);
                        return;
                    }
                    copy.getWidth();
                    copy.getHeight();
                    android.os.Bundle bundle2 = new android.os.Bundle();
                    bundle2.putByteArray("param_card_bitmap", com.tencent.mm.sdk.platformtools.x.b(copy, 80));
                    yy3.e eVar3 = this.f468466i.f468473f;
                    long j19 = this.f468461d;
                    com.tencent.mm.plugin.scanner.view.ScanCardRectView scanCardRectView2 = ((com.tencent.mm.plugin.scanner.view.n) eVar3).f159963e;
                    long j27 = scanCardRectView2.f159889q;
                    if (j19 == j27) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.ScanCardRectView", "license decode success %s", java.lang.Long.valueOf(j27));
                        scanCardRectView2.p();
                        com.tencent.mm.plugin.scanner.view.q qVar = scanCardRectView2.f159892t;
                        if (qVar != null) {
                            qVar.a(j19, bundle2);
                        }
                    }
                    this.f468466i.f468475h = false;
                } else {
                    fVar4.f468475h = false;
                    yy3.f.a(fVar4);
                }
            }
        }
    }
}
