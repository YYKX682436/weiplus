package d04;

/* loaded from: classes13.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView f225387d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.qbar.ScanDecodeFrameData f225388e;

    public c0(com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView scanCodeMaskView, com.tencent.qbar.ScanDecodeFrameData scanDecodeFrameData) {
        this.f225387d = scanCodeMaskView;
        this.f225388e = scanDecodeFrameData;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Bitmap bitmap;
        int previewFormat;
        android.graphics.Point point;
        com.tencent.qbar.ScanDecodeFrameData scanDecodeFrameData;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        int i17 = com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView.H1;
        com.tencent.mm.plugin.scanner.ui.widget.ScanCodeMaskView scanCodeMaskView = this.f225387d;
        scanCodeMaskView.getClass();
        try {
            xy3.a scanCamera = scanCodeMaskView.getScanCamera();
            kotlin.jvm.internal.o.d(scanCamera);
            previewFormat = scanCamera.f366656a.getParameters().getPreviewFormat();
            xy3.a scanCamera2 = scanCodeMaskView.getScanCamera();
            kotlin.jvm.internal.o.d(scanCamera2);
            point = scanCamera2.f366662g;
            scanDecodeFrameData = this.f225388e;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScanCodeMaskView", e17, "getFrameBitmap exception", new java.lang.Object[0]);
        }
        if (scanDecodeFrameData != null) {
            int i18 = scanDecodeFrameData.f215239e;
            byte[] bArr = scanDecodeFrameData.f215238d;
            if (bArr != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ScanCodeMaskView", "getFrameBitmap data length: %d, size: %d, %d, rotation: %d, previewFormat: %d", java.lang.Integer.valueOf(bArr.length), java.lang.Integer.valueOf(scanDecodeFrameData.f215240f), java.lang.Integer.valueOf(scanDecodeFrameData.f215241g), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(previewFormat));
                android.graphics.YuvImage yuvImage = new android.graphics.YuvImage(scanDecodeFrameData.f215238d, previewFormat, point.x, point.y, null);
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                yuvImage.compressToJpeg(new android.graphics.Rect(0, 0, point.x, point.y), 100, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                int size = byteArrayOutputStream.size();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(size));
                arrayList.add(0);
                arrayList.add(byteArray);
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeMaskView", "getFrameBitmap", "(Lcom/tencent/qbar/ScanDecodeFrameData;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
                bitmap = android.graphics.BitmapFactory.decodeByteArray((byte[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue());
                yj0.a.e(obj, bitmap, "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeMaskView", "getFrameBitmap", "(Lcom/tencent/qbar/ScanDecodeFrameData;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
                if (bitmap != null && !bitmap.isRecycled()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ScanCodeMaskView", "getFrameBitmap bitmap width: %d, height: %d", java.lang.Integer.valueOf(bitmap.getWidth()), java.lang.Integer.valueOf(bitmap.getHeight()));
                    if (i18 != 0) {
                        bitmap = scanCodeMaskView.E(bitmap, i18, scanCodeMaskView.getMeasuredWidth(), scanCodeMaskView.getMeasuredHeight());
                    }
                    scanCodeMaskView.f159686J = bitmap;
                    com.tencent.mars.xlog.Log.i("MicroMsg.ScanCodeMaskView", "getFrameBitmap cost: %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
                    com.tencent.mm.sdk.platformtools.u3.h(new d04.b0(scanCodeMaskView));
                }
            }
        }
        bitmap = null;
        scanCodeMaskView.f159686J = bitmap;
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanCodeMaskView", "getFrameBitmap cost: %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        com.tencent.mm.sdk.platformtools.u3.h(new d04.b0(scanCodeMaskView));
    }
}
