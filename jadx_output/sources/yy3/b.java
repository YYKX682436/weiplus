package yy3;

/* loaded from: classes13.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final long f468443d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f468444e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Point f468445f;

    /* renamed from: g, reason: collision with root package name */
    public int f468446g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yy3.c f468447h;

    public b(yy3.c cVar, long j17) {
        this.f468447h = cVar;
        this.f468443d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f468447h.f468451b) {
            yy3.c cVar = this.f468447h;
            boolean z17 = true;
            cVar.f468457h = true;
            if (this.f468443d != cVar.f468454e) {
                cVar.f468457h = false;
                return;
            }
            if (((java.util.HashMap) cVar.f468450a).isEmpty()) {
                yy3.c cVar2 = this.f468447h;
                yy3.a aVar = cVar2.f468455f;
                if (aVar != null) {
                    long j17 = cVar2.f468454e;
                    com.tencent.mm.plugin.scanner.view.ScanCardRectView scanCardRectView = ((com.tencent.mm.plugin.scanner.view.i) aVar).f159941a;
                    if (j17 == scanCardRectView.f159889q) {
                        scanCardRectView.k(0L);
                    }
                }
                this.f468447h.f468457h = false;
                return;
            }
            byte[] bArr = (byte[]) ((java.util.HashMap) this.f468447h.f468450a).get("param_preview_data");
            this.f468444e = java.util.Arrays.copyOf(bArr, bArr.length);
            this.f468445f = new android.graphics.Point((android.graphics.Point) ((java.util.HashMap) this.f468447h.f468450a).get("param_camera_resolution"));
            this.f468446g = ((java.lang.Integer) ((java.util.HashMap) this.f468447h.f468450a).get("param_camera_rotation")).intValue();
            ((java.util.HashMap) this.f468447h.f468450a).clear();
            yy3.c cVar3 = this.f468447h;
            yy3.a aVar2 = cVar3.f468455f;
            if (aVar2 != null) {
                long j18 = cVar3.f468454e;
                com.tencent.mm.plugin.scanner.view.ScanCardRectView scanCardRectView2 = ((com.tencent.mm.plugin.scanner.view.i) aVar2).f159941a;
                if (j18 == scanCardRectView2.f159889q) {
                    scanCardRectView2.k(10L);
                }
            }
            synchronized (this.f468447h.f468452c) {
                int width = ((this.f468447h.f468459j.width() * this.f468447h.f468459j.height()) * 3) / 2;
                boolean z18 = et5.h.f256676a;
                java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(width);
                byte[] bArr2 = this.f468444e;
                android.graphics.Point point = this.f468445f;
                int i17 = point.x;
                int i18 = point.y;
                android.graphics.Rect rect = this.f468447h.f468459j;
                int i19 = rect.left;
                int i27 = rect.top;
                int width2 = rect.width();
                int height = this.f468447h.f468459j.height();
                com.tencent.wechat.aff.iam_scan.c cVar4 = com.tencent.wechat.aff.iam_scan.c.f216974b;
                int g17 = cVar4.g(et5.h.c(bArr2), allocateDirect, i17, i18, i19, i27, width2, height);
                this.f468447h.f468460k++;
                com.tencent.mars.xlog.Log.i("MicroMsg.BankCardDetectQueue", "yuv crop ret %d", java.lang.Integer.valueOf(g17));
                if (g17 == 0) {
                    if ((allocateDirect == null ? -1 : cVar4.d(allocateDirect)) != 1) {
                        z17 = false;
                    }
                    if (z17) {
                        byte[] bArr3 = this.f468444e;
                        android.graphics.Point point2 = this.f468445f;
                        android.graphics.YuvImage yuvImage = new android.graphics.YuvImage(bArr3, 17, point2.x, point2.y, null);
                        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                        yuvImage.compressToJpeg(this.f468447h.f468459j, 80, byteArrayOutputStream);
                        float height2 = 448.0f / (this.f468446g % 180 != 0 ? this.f468447h.f468459j.height() : this.f468447h.f468459j.width());
                        android.graphics.Bitmap z07 = com.tencent.mm.sdk.platformtools.x.z0(com.tencent.mm.sdk.platformtools.x.G(byteArrayOutputStream.toByteArray()), this.f468446g, height2, height2);
                        if (z07 != null) {
                            android.os.Bundle bundle = new android.os.Bundle();
                            bundle.putParcelable("param_card_bitmap", z07);
                            yy3.a aVar3 = this.f468447h.f468455f;
                            if (aVar3 != null) {
                                long j19 = this.f468443d;
                                com.tencent.mm.plugin.scanner.view.ScanCardRectView scanCardRectView3 = ((com.tencent.mm.plugin.scanner.view.i) aVar3).f159941a;
                                long j27 = scanCardRectView3.f159889q;
                                if (j19 == j27) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.ScanCardRectView", "bankcard decode success %s", java.lang.Long.valueOf(j27));
                                    scanCardRectView3.p();
                                    com.tencent.mm.plugin.scanner.view.q qVar = scanCardRectView3.f159892t;
                                    if (qVar != null) {
                                        qVar.a(j19, bundle);
                                    }
                                }
                            }
                            this.f468447h.f468457h = false;
                            return;
                        }
                    }
                }
                yy3.c cVar5 = this.f468447h;
                cVar5.f468457h = false;
                yy3.c.a(cVar5);
            }
        }
    }
}
