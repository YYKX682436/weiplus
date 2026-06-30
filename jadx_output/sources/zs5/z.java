package zs5;

/* loaded from: classes15.dex */
public class z implements kd0.d3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f475526a = new java.lang.Object();

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.wechat.aff.iam_scan.b f475527b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f475528c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f475529d;

    @Override // kd0.d3
    public int a(int[] iArr) {
        return 0;
    }

    @Override // kd0.d3
    public void b(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AffWxQBarAIDecoder", "setEnableMultiCode enable: %s", java.lang.Boolean.valueOf(z17));
        this.f475529d = z17;
    }

    @Override // kd0.d3
    public void c(android.content.Context context, int i17, ry3.s sVar) {
        boolean z17;
        if (sVar != null) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            synchronized (this.f475526a) {
                if (this.f475527b == null) {
                    et5.a.a(null);
                    java.lang.Boolean bool = et5.a.f256670a;
                    com.tencent.mars.xlog.Log.i("MicroMsg.AffWxQBarAIDecoder", "createAffQBar QBarSoLoaded: %s", bool);
                    if (bool == null || !bool.booleanValue()) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AffWxQBarAIDecoder", "createAffQBar load so failed");
                        z17 = false;
                    } else {
                        this.f475527b = com.tencent.wechat.aff.iam_scan.d.f216983b.a();
                        z17 = true;
                    }
                    if (!z17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AffWxQBarAIDecoder", "initAffQBar create failed");
                        return;
                    }
                }
                int c17 = this.f475527b.c(et5.f.a(sVar));
                com.tencent.mars.xlog.Log.i("MicroMsg.AffWxQBarAIDecoder", "initAffQBar ret: %d, cost: %d", java.lang.Integer.valueOf(c17), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
                if (c17 == 0) {
                    this.f475528c = true;
                } else {
                    this.f475528c = false;
                }
            }
        }
    }

    @Override // kd0.d3
    public boolean d() {
        return this.f475528c;
    }

    @Override // kd0.d3
    public zs5.b0 e(int[] iArr, android.graphics.Point point, android.graphics.PointF pointF, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        if (this.f475527b == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AffWxQBarAIDecoder", "decodeFile qbar null");
            return null;
        }
        e04.f2 f2Var = e04.f2.f245925a;
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if ((com.tencent.mm.sdk.platformtools.s9.f192975c || z65.c.a()) && bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.scan.RepairerConfigScanCrashFake()) == 1 && java.lang.Math.floor(java.lang.Math.random() * 3.0d) % 3.0d == 1.0d) {
            throw new java.lang.RuntimeException("decodeFile test exception");
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.AffWxQBarAIDecoder", "[scanDecode-file] decodeFile imageSize: %s", point);
        if (iArr == null || iArr.length <= 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AffWxQBarAIDecoder", "[scanDecode-file] prepareGrayData , data is null");
            return null;
        }
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(point.x * point.y);
        int f17 = this.f475527b.f(iArr, point.x, point.y, allocateDirect);
        if (f17 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AffWxQBarAIDecoder", "[scanDecode-file] transBytes result: %d", java.lang.Integer.valueOf(f17));
            return null;
        }
        byte[] f18 = et5.h.f(allocateDirect);
        if (f18 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AffWxQBarAIDecoder", "[scanDecode-file] data null");
            return null;
        }
        com.tencent.wechat.aff.iam_scan.s e17 = this.f475527b.e(f18, point.x, point.y, pointF != null ? pointF.x : -1.0f, pointF != null ? pointF.y : -1.0f);
        zs5.b0 b0Var = new zs5.b0();
        java.lang.String str2 = e17.f217130f;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str2 == null) {
            str2 = "";
        }
        b0Var.f475325b = str2;
        if (!e17.f217128d) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AffWxQBarAIDecoder", "[scanDecode-file] scanImage result failed");
            return b0Var;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        if (e17.f217129e == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AffWxQBarAIDecoder", "[scanDecode-result] decode_result null");
            return b0Var;
        }
        i(e17, arrayList3, arrayList, arrayList2, this.f475529d);
        b0Var.f475324a = arrayList3;
        com.tencent.mars.xlog.Log.i("MicroMsg.AffWxQBarAIDecoder", "[scanDecode-file-result] decodeGrayData get %d results, cost %s ms", java.lang.Integer.valueOf(arrayList3.size()), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        return b0Var;
    }

    public byte[] f(byte[] bArr, android.graphics.Point point, int i17, android.graphics.Rect rect, int[] iArr, int[] iArr2) {
        if (bArr == null || bArr.length <= 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AffWxQBarAIDecoder", "prepareGrayData , data is null");
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AffWxQBarAIDecoder", "cropGrayData, size %s, rect %s, rotation %d", point, rect, java.lang.Integer.valueOf(i17));
        int width = rect != null ? rect.width() : point.x;
        int height = rect != null ? rect.height() : point.y;
        int i18 = rect != null ? rect.left : 0;
        int i19 = rect != null ? rect.top : 0;
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(((width * height) * 3) / 2);
        synchronized (this.f475526a) {
            try {
                try {
                    com.tencent.wechat.aff.iam_scan.b bVar = this.f475527b;
                    if (bVar == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.AffWxQBarAIDecoder", "cropGrayData qbar null");
                        return null;
                    }
                    bVar.a(bArr, point.x, point.y, i18, i19, width, height, i17, 0, allocateDirect);
                    int[] iArr3 = iArr == null ? new int[2] : iArr;
                    iArr3[0] = width;
                    iArr3[1] = height;
                    if (i17 % com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1 == 90 || i17 % com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1 == 270) {
                        iArr3[0] = height;
                        iArr3[1] = width;
                    }
                    byte[] f17 = et5.h.f(allocateDirect);
                    java.lang.Object[] objArr = new java.lang.Object[3];
                    objArr[0] = java.lang.Integer.valueOf(iArr3[0]);
                    objArr[1] = java.lang.Integer.valueOf(iArr3[1]);
                    objArr[2] = java.lang.Boolean.valueOf(f17 == null);
                    com.tencent.mars.xlog.Log.i("MicroMsg.AffWxQBarAIDecoder", "cropGrayData.result outSize: %s, %s, grayData == null: %s", objArr);
                    return f17;
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    throw th;
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
                throw th;
            }
        }
    }

    public java.util.List g(int[] iArr, android.graphics.Point point) {
        zs5.b0 e17 = e(iArr, point, null, null, null);
        java.util.List list = e17 != null ? e17.f475324a : null;
        if (list != null) {
            return new java.util.ArrayList(list);
        }
        return null;
    }

    public java.util.List h(byte[] bArr, int i17, int i18, boolean z17, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        synchronized (this.f475526a) {
            if (this.f475527b == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AffWxQBarAIDecoder", "decodeGrayData qbar null");
                return null;
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.wechat.aff.iam_scan.s e17 = this.f475527b.e(bArr, i17, i18, -1.0f, -1.0f);
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            if (!e17.f217128d) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AffWxQBarAIDecoder", "[scanDecode-result] scanImage result failed");
                return null;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            if (e17.f217129e == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AffWxQBarAIDecoder", "[scanDecode-result] decode_result null");
                return null;
            }
            i(e17, arrayList3, arrayList, arrayList2, this.f475529d);
            com.tencent.mars.xlog.Log.i("MicroMsg.AffWxQBarAIDecoder", "[scanDecode-result] decodeGrayData get %d results, cost %s ms, scanImage.cost: %d", java.lang.Integer.valueOf(e17.f217129e.f217015e.size()), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Long.valueOf(currentTimeMillis2 - currentTimeMillis));
            return arrayList3;
        }
    }

    public final void i(com.tencent.wechat.aff.iam_scan.s sVar, java.util.List list, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, boolean z17) {
        com.tencent.qbar.QbarNative$QBarPoint a17;
        java.util.Iterator it = sVar.f217129e.f217015e.iterator();
        while (it.hasNext()) {
            com.tencent.wechat.aff.iam_scan.i0 item = (com.tencent.wechat.aff.iam_scan.i0) it.next();
            kotlin.jvm.internal.o.g(item, "item");
            byte[] c17 = et5.g.c(item);
            java.lang.String a18 = et5.g.a(item);
            com.tencent.mars.xlog.Log.i("MicroMsg.WXQBarResultUtils", "transformWXQBarResult charset: " + item.f217057g + ", content: " + a18);
            com.tencent.qbar.WxQBarResult wxQBarResult = new com.tencent.qbar.WxQBarResult(item.f217055e, item.f217056f, a18, c17, item.f217057g, item.f217058h);
            wxQBarResult.f215250m = item.f217060m;
            wxQBarResult.f215251n = item.f217062o;
            wxQBarResult.f215253p = true;
            zs5.a aVar = zs5.y.A;
            com.tencent.qbar.QbarNative$QBarPoint a19 = aVar.a(item);
            if (a19 != null) {
                wxQBarResult.f215252o = new com.tencent.qbar.WxQBarPoint(a19);
            }
            list.add(wxQBarResult);
            if (arrayList != null && (a17 = aVar.a(item)) != null) {
                arrayList.add(a17);
            }
            if (!z17) {
                break;
            }
        }
        if (arrayList2 != null) {
            java.util.Iterator it6 = sVar.f217129e.f217017g.iterator();
            while (it6.hasNext()) {
                com.tencent.wechat.aff.iam_scan.g1 wxQBarReportMsg = (com.tencent.wechat.aff.iam_scan.g1) it6.next();
                kotlin.jvm.internal.o.g(wxQBarReportMsg, "wxQBarReportMsg");
                com.tencent.qbar.WxQbarNative$QBarReportMsg wxQbarNative$QBarReportMsg = new com.tencent.qbar.WxQbarNative$QBarReportMsg();
                wxQbarNative$QBarReportMsg.qrcodeVersion = wxQBarReportMsg.f217018d;
                wxQbarNative$QBarReportMsg.charsetMode = wxQBarReportMsg.f217019e;
                wxQbarNative$QBarReportMsg.detectTime = wxQBarReportMsg.f217020f;
                wxQbarNative$QBarReportMsg.reverseClsTime = wxQBarReportMsg.f217021g;
                wxQbarNative$QBarReportMsg.reverseClsCount = wxQBarReportMsg.f217022h;
                wxQbarNative$QBarReportMsg.srTime = wxQBarReportMsg.f217023i;
                wxQbarNative$QBarReportMsg.hasSr = wxQBarReportMsg.f217024m;
                wxQbarNative$QBarReportMsg.decodeTime = wxQBarReportMsg.f217025n;
                wxQbarNative$QBarReportMsg.inWhiteList = wxQBarReportMsg.f217026o;
                wxQbarNative$QBarReportMsg.inBlackList = wxQBarReportMsg.f217027p;
                wxQbarNative$QBarReportMsg.hasDecode = wxQBarReportMsg.f217028q;
                wxQbarNative$QBarReportMsg.initReverseClsSuccess = wxQBarReportMsg.f217029r;
                wxQbarNative$QBarReportMsg.closeReverseCls = wxQBarReportMsg.f217030s;
                wxQbarNative$QBarReportMsg.preDetect = wxQBarReportMsg.f217031t;
                wxQbarNative$QBarReportMsg.afterDetect = wxQBarReportMsg.f217032u;
                wxQbarNative$QBarReportMsg.segCost = wxQBarReportMsg.f217033v;
                wxQbarNative$QBarReportMsg.hasSeg = wxQBarReportMsg.f217034w;
                wxQbarNative$QBarReportMsg.afterSeg = wxQBarReportMsg.f217035x;
                wxQbarNative$QBarReportMsg.decodeAll = wxQBarReportMsg.f217036y;
                wxQbarNative$QBarReportMsg.decodeSuccessResultType = wxQBarReportMsg.f217037z;
                wxQbarNative$QBarReportMsg.detectInferPreTime = wxQBarReportMsg.A;
                wxQbarNative$QBarReportMsg.detectInferTime = wxQBarReportMsg.B;
                wxQbarNative$QBarReportMsg.detectInferAfterTime = wxQBarReportMsg.C;
                arrayList2.add(wxQbarNative$QBarReportMsg);
                if (!z17) {
                    return;
                }
            }
        }
    }

    public com.tencent.qbar.QbarNative$QBarZoomInfo j() {
        com.tencent.wechat.aff.iam_scan.e1 b17;
        com.tencent.wechat.aff.iam_scan.b bVar;
        synchronized (this.f475526a) {
            b17 = (!this.f475528c || (bVar = this.f475527b) == null) ? null : bVar.b();
        }
        if (b17 == null) {
            return null;
        }
        com.tencent.qbar.QbarNative$QBarZoomInfo qbarNative$QBarZoomInfo = new com.tencent.qbar.QbarNative$QBarZoomInfo();
        qbarNative$QBarZoomInfo.isZoom = b17.f217003e;
        qbarNative$QBarZoomInfo.zoomFactor = b17.f217002d;
        return qbarNative$QBarZoomInfo;
    }

    @Override // kd0.d3
    public void release() {
        synchronized (this.f475526a) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AffWxQBarAIDecoder", "releaseAffQBar, inited: %s, hashCode: %s", java.lang.Boolean.valueOf(this.f475528c), java.lang.Integer.valueOf(hashCode()));
            if (this.f475528c) {
                this.f475528c = false;
                com.tencent.wechat.aff.iam_scan.b bVar = this.f475527b;
                if (bVar != null) {
                    bVar.d();
                }
            }
        }
    }
}
