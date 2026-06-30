package ny4;

/* loaded from: classes14.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public long f341457a;

    /* renamed from: b, reason: collision with root package name */
    public long f341458b;

    /* renamed from: c, reason: collision with root package name */
    public long f341459c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.wevision2.modules.ocr.TextRecognizer f341460d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.wevision2.modules.ocr.Reporter f341461e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f341462f = new java.lang.Object();

    public e() {
        ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
        p05.e5.a();
    }

    public final java.lang.String a(java.nio.Buffer dataBuffer, int i17, int i18) {
        kotlin.jvm.internal.o.g(dataBuffer, "dataBuffer");
        synchronized (this.f341462f) {
            com.tencent.wevision2.modules.ocr.TextRecognizer textRecognizer = this.f341460d;
            if (textRecognizer == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.WeChatClsManager", "aplyOcrReq >> no init: return");
                return null;
            }
            java.lang.String recognizeText = textRecognizer.recognizeText(new com.tencent.wevision2.base.PixelBuffer(i17, i18, 3, (java.nio.ByteBuffer) dataBuffer));
            g();
            com.tencent.mars.xlog.Log.i("MicroMsg.WeChatClsManager", "WeVision2.TextRecognizer recognize >> result: return");
            return recognizeText;
        }
    }

    public final java.lang.String b(android.graphics.PointF[][] pointFArr) {
        if (pointFArr == null) {
            return "";
        }
        if (pointFArr.length == 0) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("{\"data\": [");
        int length = pointFArr.length;
        for (int i17 = 0; i17 < length; i17++) {
            sb6.append("[");
            android.graphics.PointF[] pointFArr2 = pointFArr[i17];
            int length2 = pointFArr2.length;
            for (int i18 = 0; i18 < length2; i18++) {
                android.graphics.PointF pointF = pointFArr2[i18];
                sb6.append("[");
                sb6.append(pointF.x);
                sb6.append(", ");
                sb6.append(pointF.y);
                sb6.append("]");
                if (i18 < pointFArr2.length - 1) {
                    sb6.append(", ");
                }
            }
            sb6.append("]");
            if (i17 < pointFArr.length - 1) {
                sb6.append(", ");
            }
        }
        sb6.append("]}");
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }

    public final void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WeChatClsManager", "destroyOcrEnv");
        synchronized (this.f341462f) {
            com.tencent.wevision2.modules.ocr.TextRecognizer textRecognizer = this.f341460d;
            if (textRecognizer != null) {
                textRecognizer.destroy();
            }
            this.f341460d = null;
            com.tencent.wevision2.modules.ocr.Reporter reporter = this.f341461e;
            if (reporter != null) {
                reporter.destroy();
            }
            this.f341461e = null;
        }
    }

    public final java.lang.String d(int i17, java.lang.String langCode) {
        kotlin.jvm.internal.o.g(langCode, "langCode");
        long j17 = this.f341457a;
        if (j17 == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WeChatClsManager", "getLabelNameByLabelId >> weChatClsHandle no init");
            return "";
        }
        java.lang.String nGetLabelnameByLabelid = com.tencent.mm.xeffect.WeChatCls.nGetLabelnameByLabelid(j17, i17, langCode);
        com.tencent.mars.xlog.Log.i("MicroMsg.WeChatClsManager", "labelId: " + i17 + " labelName: " + nGetLabelnameByLabelid + ", lan: " + langCode);
        return nGetLabelnameByLabelid == null ? "" : nGetLabelnameByLabelid;
    }

    public final boolean e(boolean z17) {
        ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
        p05.s3 s3Var = p05.s3.f350688a;
        java.lang.String b17 = s3Var.b("MODEL_OCR_DET");
        java.lang.String b18 = s3Var.b("MODEL_OCR_REC_MODEL");
        java.lang.String b19 = s3Var.b("MODEL_OCR_REC_MAP");
        if (!(b17 == null || b17.length() == 0)) {
            if (!(b18 == null || b18.length() == 0)) {
                if (!(b19 == null || b19.length() == 0)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WeChatClsManager", "ocr in initOcrEnv allowNPU val false");
                    ((com.tencent.mm.wexnet.a) ((ft.g4) i95.n0.c(ft.g4.class))).getClass();
                    java.lang.String c17 = com.tencent.mm.wexnet.v.f214379a.c();
                    synchronized (this.f341462f) {
                        com.tencent.wevision2.dnn.DnnInferenceOptions dnnInferenceOptions = new com.tencent.wevision2.dnn.DnnInferenceOptions();
                        dnnInferenceOptions.autoClearMemory = true;
                        dnnInferenceOptions.enablesNPU = false;
                        dnnInferenceOptions.cachePath = c17;
                        this.f341460d = new com.tencent.wevision2.modules.ocr.TextRecognizer(b17, b18, b19, dnnInferenceOptions);
                        this.f341461e = new com.tencent.wevision2.modules.ocr.Reporter(10000);
                        com.tencent.mars.xlog.Log.i("MicroMsg.WeChatClsManager", "init WeVision2.TextRecoginzer success");
                    }
                    return true;
                }
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.WeChatClsManager", "ocr model is null");
        h();
        return false;
    }

    public final void f() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WeChatClsManager", "release");
        synchronized (this.f341462f) {
            com.tencent.wevision2.modules.ocr.TextRecognizer textRecognizer = this.f341460d;
            if (textRecognizer != null) {
                textRecognizer.destroy();
            }
            this.f341460d = null;
            com.tencent.wevision2.modules.ocr.Reporter reporter = this.f341461e;
            if (reporter != null) {
                reporter.destroy();
            }
            this.f341461e = null;
        }
        long j17 = this.f341457a;
        if (j17 != 0) {
            com.tencent.mm.xeffect.WeChatCls.nRelease(j17);
        }
        if (this.f341459c != 0) {
            com.tencent.mm.xeffect.WeFaceCluster.nFlushReport(this.f341458b);
            com.tencent.mm.xeffect.WeFaceCluster.nRelease(this.f341459c, this.f341458b);
        }
        this.f341459c = 0L;
        this.f341457a = 0L;
        this.f341458b = 0L;
    }

    public final boolean g() {
        java.lang.String str;
        com.tencent.wevision2.modules.ocr.Reporter reporter = this.f341461e;
        if (reporter != null) {
            str = reporter.purgeData();
            if (!(str == null || str.length() == 0)) {
                str = "Cpu,INT8," + str + ",2";
            }
        } else {
            str = null;
        }
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WeChatClsManager.MobileOCRReport", "Nothing to report");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.WeChatClsManager.MobileOCRReport", "report MobileOCR data using protocal 28950, data: " + str);
            jx3.f.INSTANCE.kvStat((int) 28950, str);
        }
        return true;
    }

    public final void h() {
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.c0.i("MODEL_OCR_DET", "MODEL_OCR_REC_MODEL", "MODEL_OCR_REC_MAP"));
        ((qh0.r) ((rh0.f0) i95.n0.c(rh0.f0.class))).getClass();
        p05.s3 s3Var = p05.s3.f350688a;
        if (s3Var.a(arrayList)) {
            return;
        }
        s3Var.c(arrayList);
    }
}
