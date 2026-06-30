package pt5;

/* loaded from: classes15.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static java.lang.String f358266a = "";

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f358267b = null;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f358268c = null;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f358269d = null;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f358270e = null;

    /* renamed from: f, reason: collision with root package name */
    public static volatile boolean f358271f = false;

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String f358272g = null;

    /* renamed from: h, reason: collision with root package name */
    public static java.lang.String f358273h = null;

    /* renamed from: i, reason: collision with root package name */
    public static volatile boolean f358274i = false;

    /* renamed from: j, reason: collision with root package name */
    public static java.lang.String f358275j = null;

    /* renamed from: k, reason: collision with root package name */
    public static java.lang.String f358276k = null;

    /* renamed from: l, reason: collision with root package name */
    public static volatile int f358277l = 1;

    /* renamed from: m, reason: collision with root package name */
    public static volatile boolean f358278m = true;

    /* renamed from: n, reason: collision with root package name */
    public static volatile boolean f358279n = true;

    /* renamed from: o, reason: collision with root package name */
    public static volatile boolean f358280o = true;

    /* renamed from: p, reason: collision with root package name */
    public static volatile boolean f358281p;

    public static com.tencent.qbar.QbarNative$QbarAiModelParam a(android.content.Context context) {
        try {
            com.tencent.qbar.QbarNative$QbarAiModelParam qbarNative$QbarAiModelParam = new com.tencent.qbar.QbarNative$QbarAiModelParam();
            if (f358277l == 1) {
                qbarNative$QbarAiModelParam.detect_model_param_path_ = "";
                qbarNative$QbarAiModelParam.superresolution_model_param_path_ = "";
                qbarNative$QbarAiModelParam.detect_model_bin_path_ = f358268c;
                qbarNative$QbarAiModelParam.detectModelVersion = f358267b;
                qbarNative$QbarAiModelParam.superresolution_model_bin_path_ = f358270e;
                qbarNative$QbarAiModelParam.superResolutionModelVersion = f358269d;
                qbarNative$QbarAiModelParam.enable_seg = f358271f;
                if (f358271f) {
                    qbarNative$QbarAiModelParam.qbar_segmentation_model_path_ = f358273h;
                } else {
                    qbarNative$QbarAiModelParam.qbar_segmentation_model_path_ = "";
                }
                qbarNative$QbarAiModelParam.det_model_use_fp16 = f358281p;
                qbarNative$QbarAiModelParam.enable_reverse_cls = f358274i;
                if (f358274i) {
                    qbarNative$QbarAiModelParam.qbar_reverse_cls_model_path_ = f358276k;
                } else {
                    qbarNative$QbarAiModelParam.qbar_reverse_cls_model_path_ = "";
                }
            } else {
                qbarNative$QbarAiModelParam.detect_model_bin_path_ = "";
                qbarNative$QbarAiModelParam.detect_model_param_path_ = "";
                qbarNative$QbarAiModelParam.superresolution_model_bin_path_ = "";
                qbarNative$QbarAiModelParam.superresolution_model_param_path_ = "";
                qbarNative$QbarAiModelParam.detectModelVersion = "";
                qbarNative$QbarAiModelParam.superResolutionModelVersion = "";
            }
            com.tencent.stubs.logger.Log.i("ScanUtil", "getAiModelParam detectModelBinPath: %s, detectModelParamPath: %s, srModelBinPath: %S, srModelParamPath: %s, currentDetectModelVersion: %s, currentSRModelVersion: %s,enableSeg: %s, segmentationModelPath: %s, segmentationModelVersion: %s, detectModeUseFp16: %s, enableReverseCls: %s, reverseClsModelPath: %s, reverseClsModelVersion: %s", qbarNative$QbarAiModelParam.detect_model_bin_path_, qbarNative$QbarAiModelParam.detect_model_param_path_, qbarNative$QbarAiModelParam.superresolution_model_bin_path_, qbarNative$QbarAiModelParam.superresolution_model_param_path_, qbarNative$QbarAiModelParam.detectModelVersion, qbarNative$QbarAiModelParam.superResolutionModelVersion, java.lang.Boolean.valueOf(qbarNative$QbarAiModelParam.enable_seg), qbarNative$QbarAiModelParam.qbar_segmentation_model_path_, f358272g, java.lang.Boolean.valueOf(f358281p), java.lang.Boolean.valueOf(qbarNative$QbarAiModelParam.enable_reverse_cls), qbarNative$QbarAiModelParam.qbar_reverse_cls_model_path_, f358275j);
            return qbarNative$QbarAiModelParam;
        } catch (java.lang.Exception e17) {
            com.tencent.stubs.logger.Log.e("ScanUtil", "copy qbar ai model file error! " + e17.getMessage());
            return null;
        }
    }

    public static java.lang.String b(android.content.Context context) {
        try {
            java.lang.String str = f358266a;
            if (str == null || str.isEmpty()) {
                f358266a = context.getFilesDir().getAbsolutePath() + "/qbar/";
            }
            com.tencent.stubs.logger.Log.i("ScanUtil", "getQBarAIDataDir :" + f358266a);
            return f358266a;
        } catch (java.lang.Exception e17) {
            com.tencent.stubs.logger.Log.e("ScanUtil", "getQBarAIDataDir " + e17);
            return "";
        }
    }
}
