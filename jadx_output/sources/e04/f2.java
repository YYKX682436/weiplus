package e04;

/* loaded from: classes15.dex */
public final class f2 {

    /* renamed from: b, reason: collision with root package name */
    public static com.tencent.mm.sdk.platformtools.o4 f245926b;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f245933i;

    /* renamed from: a, reason: collision with root package name */
    public static final e04.f2 f245925a = new e04.f2();

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f245927c = jz5.h.b(e04.x1.f246153d);

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f245928d = jz5.h.b(e04.z1.f246169d);

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f245929e = jz5.h.b(e04.a2.f245864d);

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f245930f = jz5.h.b(e04.y1.f246161d);

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f245931g = jz5.h.b(e04.b2.f245871d);

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.ArrayList f245932h = new java.util.ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public static final jz5.g f245934j = jz5.h.b(e04.e2.f245895d);

    /* renamed from: k, reason: collision with root package name */
    public static final jz5.g f245935k = jz5.h.b(e04.w1.f246147d);

    /* renamed from: l, reason: collision with root package name */
    public static final jz5.g f245936l = jz5.h.b(e04.d2.f245887d);

    /* renamed from: m, reason: collision with root package name */
    public static final jz5.g f245937m = jz5.h.b(e04.c2.f245877d);

    public static final void a(com.tencent.qbar.QbarNative$QbarAiModelParam qbarNative$QbarAiModelParam) {
        if (qbarNative$QbarAiModelParam != null) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            b(context, qbarNative$QbarAiModelParam.detect_model_bin_path_, qbarNative$QbarAiModelParam.superresolution_model_bin_path_, qbarNative$QbarAiModelParam.qbar_segmentation_model_path_, qbarNative$QbarAiModelParam.qbar_reverse_cls_model_path_);
            return;
        }
        if (!f245933i) {
            g();
        }
        java.lang.String str = pt5.a.f358268c;
        java.lang.String str2 = pt5.a.f358270e;
        java.lang.String str3 = pt5.a.f358273h;
        java.lang.String str4 = pt5.a.f358276k;
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        b(context2, str, str2, str3, str4);
    }

    public static final void b(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanDebugUtil", "checkAndCopyAIModelFileIfNeed detectModelPath: " + str + ", srModelPath: " + str2 + ", segmentationModelPath: " + str3 + ", reverseClsModel: " + str4);
            e04.f2 f2Var = f245925a;
            f2Var.c(context, (ct5.a) ((jz5.n) f245927c).getValue(), str, false);
            f2Var.c(context, (ct5.d) ((jz5.n) f245928d).getValue(), str2, false);
            if (((java.lang.Boolean) ((jz5.n) f245936l).getValue()).booleanValue()) {
                f2Var.c(context, (ct5.c) ((jz5.n) f245929e).getValue(), str3, false);
            }
            if (((java.lang.Boolean) ((jz5.n) f245937m).getValue()).booleanValue()) {
                f2Var.c(context, (ct5.b) ((jz5.n) f245930f).getValue(), str4, false);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScanDebugUtil", e17, "initQBarModelFile", new java.lang.Object[0]);
        }
    }

    public static final int e() {
        return ((java.lang.Boolean) ((jz5.n) f245934j).getValue()).booleanValue() ? 1 : 0;
    }

    public static final void f() {
        g();
        java.util.ArrayList arrayList = f245932h;
        arrayList.add(pt5.a.f358268c);
        arrayList.add(pt5.a.f358270e);
        arrayList.add(pt5.a.f358273h);
        arrayList.add(pt5.a.f358276k);
        a(null);
        ((ku5.t0) ku5.t0.f312615d).g(e04.v1.f246137d);
    }

    public static final void g() {
        if (((java.lang.Boolean) ((jz5.n) f245934j).getValue()).booleanValue()) {
            pt5.a.f358277l = 1;
            com.tencent.stubs.logger.Log.i("ScanUtil", "setQbarBackend:1");
            pt5.a.f358279n = true;
            com.tencent.stubs.logger.Log.i("ScanUtil", "setQBarOptDet :true");
            pt5.a.f358278m = true;
            com.tencent.stubs.logger.Log.i("ScanUtil", "setQBarOptSr :true");
            pt5.a.f358280o = true;
            com.tencent.stubs.logger.Log.i("ScanUtil", "setQbarOptLibdmtx :true");
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            ((ct5.a) ((jz5.n) f245927c).getValue()).getClass();
            pt5.a.f358267b = "V1.8.0.26";
            pt5.a.f358268c = "";
            com.tencent.stubs.logger.Log.i("ScanUtil", "setDetectModelVersion %s", "V1.8.0.26");
            java.lang.String str = pt5.a.f358267b;
            if (str == null || str.isEmpty()) {
                com.tencent.stubs.logger.Log.e("ScanUtil", "setDetectModelVersion invalid version: %s", "V1.8.0.26");
            } else {
                java.lang.String b17 = pt5.a.b(context);
                if (b17 != null && !b17.isEmpty()) {
                    pt5.a.f358268c = b17 + pt5.a.f358267b.toUpperCase() + "/qbar_detect.xnet";
                }
            }
            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            ((ct5.d) ((jz5.n) f245928d).getValue()).getClass();
            pt5.a.f358269d = "V1.1.0.26";
            pt5.a.f358270e = "";
            com.tencent.stubs.logger.Log.i("ScanUtil", "setSRModelVersion %s", "V1.1.0.26");
            java.lang.String str2 = pt5.a.f358269d;
            if (str2 == null || str2.isEmpty()) {
                com.tencent.stubs.logger.Log.e("ScanUtil", "setSRModelVersion invalid version: %s", "V1.1.0.26");
            } else {
                java.lang.String b18 = pt5.a.b(context2);
                if (b18 != null && !b18.isEmpty()) {
                    pt5.a.f358270e = b18 + pt5.a.f358269d.toUpperCase() + "/qbar_sr.xnet";
                }
            }
            boolean booleanValue = ((java.lang.Boolean) ((jz5.n) f245936l).getValue()).booleanValue();
            pt5.a.f358271f = booleanValue;
            com.tencent.stubs.logger.Log.i("ScanUtil", "setEnableSeg:" + booleanValue);
            android.content.Context context3 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            ((ct5.c) ((jz5.n) f245929e).getValue()).getClass();
            pt5.a.f358272g = "V1.1.0.26";
            pt5.a.f358273h = "";
            com.tencent.stubs.logger.Log.i("ScanUtil", "setSegmentationModelVersion %s", "V1.1.0.26");
            java.lang.String str3 = pt5.a.f358272g;
            if (str3 == null || str3.isEmpty()) {
                com.tencent.stubs.logger.Log.e("ScanUtil", "setSegmentationModelVersion invalid version: %s", pt5.a.f358272g);
            } else {
                java.lang.String b19 = pt5.a.b(context3);
                if (b19 != null && !b19.isEmpty()) {
                    pt5.a.f358273h = b19 + pt5.a.f358272g.toUpperCase() + "/qbar_seg.xnet";
                }
            }
            boolean booleanValue2 = ((java.lang.Boolean) ((jz5.n) f245931g).getValue()).booleanValue();
            pt5.a.f358281p = booleanValue2;
            com.tencent.stubs.logger.Log.i("ScanUtil", "setDetectModelUseFp16:" + booleanValue2);
            boolean booleanValue3 = ((java.lang.Boolean) ((jz5.n) f245937m).getValue()).booleanValue();
            pt5.a.f358274i = booleanValue3;
            com.tencent.stubs.logger.Log.i("ScanUtil", "setEnableReverseCls:" + booleanValue3);
            android.content.Context context4 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            ((ct5.b) ((jz5.n) f245930f).getValue()).getClass();
            pt5.a.f358275j = "V1.0";
            pt5.a.f358276k = "";
            com.tencent.stubs.logger.Log.i("ScanUtil", "setReverseClsModelVersion %s", "V1.0");
            java.lang.String str4 = pt5.a.f358275j;
            if (str4 == null || str4.isEmpty()) {
                com.tencent.stubs.logger.Log.e("ScanUtil", "setReverseClsModelVersion invalid version: %s", pt5.a.f358275j);
            } else {
                java.lang.String b27 = pt5.a.b(context4);
                if (b27 != null && !b27.isEmpty()) {
                    pt5.a.f358276k = b27 + pt5.a.f358275j.toUpperCase() + "/qbar_reverse_cls.xnet";
                }
            }
            f245933i = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x002d A[Catch: Exception -> 0x0023, TryCatch #0 {Exception -> 0x0023, blocks: (B:46:0x001a, B:5:0x0029, B:32:0x002d, B:34:0x0034, B:36:0x005c, B:37:0x005f, B:38:0x0071, B:40:0x007b, B:41:0x007e, B:43:0x0092, B:44:0x0095), top: B:45:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0029 A[Catch: Exception -> 0x0023, TryCatch #0 {Exception -> 0x0023, blocks: (B:46:0x001a, B:5:0x0029, B:32:0x002d, B:34:0x0034, B:36:0x005c, B:37:0x005f, B:38:0x0071, B:40:0x007b, B:41:0x007e, B:43:0x0092, B:44:0x0095), top: B:45:0x001a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(android.content.Context r18, dt5.b r19, java.lang.String r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e04.f2.c(android.content.Context, dt5.b, java.lang.String, boolean):void");
    }

    public final void d(java.lang.String str) {
        try {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ScanDebugUtil", "ensureParentDirExists  destFilePath is empty");
                return;
            }
            com.tencent.mm.vfs.r6 s17 = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str)).s();
            if (s17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ScanDebugUtil", "ensureParentDirExists  parentFile == null, destFilePath: ".concat(str));
                return;
            }
            if (s17.m() && s17.y()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ScanDebugUtil", "ensureParentDirExists parentFile is exists: " + s17);
                return;
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.ScanDebugUtil", "ensureParentDirExists  do make dir , parentFile: %s, exists : %b, result: %b, isDirectory: %b", s17.o(), java.lang.Boolean.valueOf(s17.m()), java.lang.Boolean.valueOf(s17.y()), java.lang.Boolean.valueOf(s17.J()));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScanDebugUtil", e17, "ensureParentDirExists", new java.lang.Object[0]);
        }
    }
}
