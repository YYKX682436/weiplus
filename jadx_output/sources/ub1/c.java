package ub1;

/* loaded from: classes13.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ byte[] f426020d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f426021e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f426022f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f426023g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f426024h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f426025i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Point f426026m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f426027n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f426028o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ ub1.b f426029p;

    public c(ub1.b bVar, byte[] bArr, int i17, int i18, int i19, int i27, int i28, android.graphics.Point point, android.graphics.Rect rect, int i29) {
        this.f426029p = bVar;
        this.f426020d = bArr;
        this.f426021e = i17;
        this.f426022f = i18;
        this.f426023g = i19;
        this.f426024h = i27;
        this.f426025i = i28;
        this.f426026m = point;
        this.f426027n = rect;
        this.f426028o = i29;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.Object obj;
        int i17;
        int i18;
        int abs;
        int i19;
        int i27;
        int i28;
        if (this.f426029p.f426015a.compareAndSet(false, true)) {
            byte[] bArr = this.f426020d;
            int i29 = this.f426021e;
            if (270 == i29 || 90 == i29) {
                java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(bArr.length);
                ry3.k kVar = (ry3.k) i95.n0.c(ry3.k.class);
                ry3.k kVar2 = (ry3.k) i95.n0.c(ry3.k.class);
                byte[] bArr2 = this.f426020d;
                ((jd0.o2) kVar2).getClass();
                java.nio.ByteBuffer c17 = et5.h.c(bArr2);
                int i37 = this.f426022f;
                int i38 = this.f426023g;
                ((jd0.o2) kVar).getClass();
                et5.h.a(allocateDirect, c17, i37, i38);
                java.nio.ByteBuffer allocateDirect2 = java.nio.ByteBuffer.allocateDirect(this.f426020d.length);
                ry3.k kVar3 = (ry3.k) i95.n0.c(ry3.k.class);
                int i39 = this.f426023g;
                int i47 = this.f426022f;
                ((jd0.o2) kVar3).getClass();
                et5.h.a(allocateDirect2, allocateDirect, i39, i47);
                bArr = allocateDirect2.array();
            }
            byte[] bArr3 = bArr;
            ub1.b bVar = this.f426029p;
            int i48 = this.f426022f;
            int i49 = this.f426023g;
            int i57 = this.f426024h;
            int i58 = this.f426025i;
            android.graphics.Point point = this.f426026m;
            android.graphics.Rect rect = this.f426027n;
            int i59 = this.f426021e;
            int i66 = this.f426028o;
            final ub1.a aVar = (ub1.a) bVar;
            java.lang.Object obj2 = aVar.f426011f;
            synchronized (obj2) {
                try {
                    if (aVar.f426012g) {
                        if (rect == null) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.appbrand.ScanQBarDecoder", "scanArea is null, use whole screen area, left: %d, top: %d, right: %d, bottom: %d", 0, 0, java.lang.Integer.valueOf(i48), java.lang.Integer.valueOf(i49));
                            i19 = 0;
                            i28 = 0;
                            i27 = i48;
                            obj = obj2;
                            i17 = i59;
                            i18 = i58;
                            abs = i49;
                        } else {
                            com.tencent.mars.xlog.Log.i("MicroMsg.appbrand.ScanQBarDecoder", "origin scan area decodeDegrees: %d, left: %d, top: %d, right: %d, bottom: %d", java.lang.Integer.valueOf(i59), java.lang.Integer.valueOf(rect.left), java.lang.Integer.valueOf(rect.top), java.lang.Integer.valueOf(rect.right), java.lang.Integer.valueOf(rect.bottom));
                            obj = obj2;
                            i17 = i59;
                            i18 = i58;
                            try {
                                android.graphics.Rect b17 = aVar.b(rect, point, i48, i49, i59, i66);
                                com.tencent.mars.xlog.Log.i("MicroMsg.appbrand.ScanQBarDecoder", "translated scan area decodeDegrees: %d, left: %d, top: %d, right: %d, bottom: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(b17.left), java.lang.Integer.valueOf(b17.top), java.lang.Integer.valueOf(b17.right), java.lang.Integer.valueOf(b17.bottom));
                                int i67 = b17.left;
                                if (i67 >= i48) {
                                    i67 = i48 - 1;
                                }
                                int i68 = b17.top;
                                if (i68 >= i49) {
                                    i68 = i49 - 1;
                                }
                                int abs2 = java.lang.Math.abs(b17.width()) + i67 > i48 ? i48 - i67 : java.lang.Math.abs(b17.width());
                                abs = java.lang.Math.abs(b17.height()) + i68 > i49 ? i49 - i68 : java.lang.Math.abs(b17.height());
                                int i69 = i68;
                                i19 = i67;
                                i27 = abs2;
                                i28 = i69;
                            } catch (java.lang.Throwable th6) {
                                th = th6;
                                while (true) {
                                    try {
                                        break;
                                    } catch (java.lang.Throwable th7) {
                                        th = th7;
                                    }
                                }
                                throw th;
                            }
                        }
                        byte[] bArr4 = aVar.f426013h;
                        if (bArr4 == null) {
                            int i76 = i27 * abs;
                            aVar.f426013h = new byte[(i76 * 3) / 2];
                            aVar.f426014i = new byte[i76];
                            int i77 = ((i48 * i49) * 3) / 2;
                        } else {
                            int i78 = i27 * abs;
                            int i79 = i78 * 3;
                            if (bArr4.length != i79 / 2) {
                                aVar.f426013h = null;
                                aVar.f426013h = new byte[i79 / 2];
                                aVar.f426014i = null;
                                aVar.f426014i = new byte[i78];
                                int i86 = ((i48 * i49) * 3) / 2;
                            }
                        }
                        int[] iArr = new int[2];
                        byte[] f17 = ((zs5.z) aVar.f426010e).f(bArr3, new android.graphics.Point(i48, i49), i17, new android.graphics.Rect(i19, i28, i19 + i27, i28 + abs), iArr, new int[2]);
                        aVar.f426013h = f17;
                        byte[] bArr5 = aVar.f426014i;
                        java.lang.System.arraycopy(f17, 0, bArr5, 0, bArr5.length);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        byte[] bArr6 = aVar.f426014i;
                        if (bArr6 != null) {
                            java.util.List h17 = ((zs5.z) aVar.f426010e).h(bArr6, iArr[0], iArr[1], false, arrayList2, arrayList);
                            java.lang.Object[] objArr = new java.lang.Object[1];
                            objArr[0] = java.lang.Boolean.valueOf((h17 == null || ((java.util.ArrayList) h17).isEmpty()) ? false : true);
                            com.tencent.mars.xlog.Log.i("MicroMsg.appbrand.ScanQBarDecoder", "after scanImage, result:%b", objArr);
                            if (h17 != null) {
                                java.util.ArrayList arrayList3 = (java.util.ArrayList) h17;
                                if (!arrayList3.isEmpty() && !arrayList2.isEmpty()) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.appbrand.ScanQBarDecoder", "GetResults size %d", java.lang.Integer.valueOf(arrayList3.size()));
                                    com.tencent.qbar.WxQBarResult wxQBarResult = (com.tencent.qbar.WxQBarResult) arrayList3.get(0);
                                    com.tencent.qbar.QbarNative$QBarPoint qbarNative$QBarPoint = (com.tencent.qbar.QbarNative$QBarPoint) arrayList2.get(0);
                                    aVar.c(qbarNative$QBarPoint, i27, abs, i57, i18, i17);
                                    com.tencent.mars.xlog.Log.i("MicroMsg.appbrand.ScanQBarDecoder", "decode type:%s, sCharset: %s, data:%s", wxQBarResult.f475331e, wxQBarResult.f475334h, wxQBarResult.f475332f);
                                    if (com.tencent.mm.sdk.platformtools.t8.K0(wxQBarResult.f475331e)) {
                                    } else {
                                        java.lang.String str = wxQBarResult.f475331e;
                                        int i87 = arrayList.isEmpty() ? 0 : ((com.tencent.qbar.WxQbarNative$QBarReportMsg) arrayList.get(0)).qrcodeVersion;
                                        if (!str.equals("QR_CODE") && !str.equals("WX_CODE")) {
                                            java.lang.String str2 = wxQBarResult.f475332f;
                                            com.tencent.mm.sdk.platformtools.u3.h(new ub1.d(aVar, 2, str2 == null ? "" : str2, 0, i87, null, qbarNative$QBarPoint));
                                        }
                                        java.lang.String str3 = wxQBarResult.f475332f;
                                        com.tencent.mm.sdk.platformtools.u3.h(new ub1.d(aVar, 1, str3 == null ? "" : str3, 0, i87, wxQBarResult.f475333g, qbarNative$QBarPoint));
                                    }
                                }
                            }
                            com.tencent.qbar.QbarNative$QBarZoomInfo j17 = ((zs5.z) aVar.f426010e).j();
                            if (j17 != null && j17.isZoom) {
                                final float f18 = j17.zoomFactor;
                                com.tencent.mars.xlog.Log.i("MicroMsg.appbrand.ScanDecoder", "notifyZoomFactor: %f", java.lang.Float.valueOf(f18));
                                if (f18 > 1.0d) {
                                    ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: ub1.b$$a
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            ub1.e eVar = ub1.b.this.f426016b;
                                            if (eVar != null) {
                                                tb1.u uVar = (tb1.u) ((ub1.h) eVar).f426036a;
                                                uVar.getClass();
                                                float f19 = f18;
                                                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCameraView", "ScanCodeMode, zoom: %f", java.lang.Float.valueOf(f19));
                                                uVar.f416947l.q(f19);
                                            }
                                        }
                                    });
                                }
                            }
                        }
                    } else {
                        com.tencent.mars.xlog.Log.e("MicroMsg.appbrand.ScanQBarDecoder", "not init");
                    }
                    this.f426029p.f426015a.set(false);
                } catch (java.lang.Throwable th8) {
                    th = th8;
                    obj = obj2;
                }
            }
            this.f426029p.f426015a.set(false);
        }
    }
}
