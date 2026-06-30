package et5;

/* loaded from: classes15.dex */
public abstract class f {
    public static final com.tencent.wechat.aff.iam_scan.b1 a(ry3.s wxqBarAiModelParam) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        kotlin.jvm.internal.o.g(wxqBarAiModelParam, "wxqBarAiModelParam");
        com.tencent.qbar.QbarNative$QbarAiModelParam qbarNative$QbarAiModelParam = wxqBarAiModelParam.f401556b;
        com.tencent.wechat.aff.iam_scan.b1 b1Var = new com.tencent.wechat.aff.iam_scan.b1();
        java.lang.String str6 = "";
        if (qbarNative$QbarAiModelParam == null || (str = qbarNative$QbarAiModelParam.detect_model_bin_path_) == null) {
            str = "";
        }
        b1Var.f216954d = str;
        b1Var.f216962o = qbarNative$QbarAiModelParam != null ? qbarNative$QbarAiModelParam.detectModelVersion : null;
        if (qbarNative$QbarAiModelParam == null || (str2 = qbarNative$QbarAiModelParam.superresolution_model_bin_path_) == null) {
            str2 = "";
        }
        b1Var.f216955e = str2;
        if (qbarNative$QbarAiModelParam == null || (str3 = qbarNative$QbarAiModelParam.superResolutionModelVersion) == null) {
            str3 = "";
        }
        b1Var.f216964q = str3;
        b1Var.f216956f = qbarNative$QbarAiModelParam != null ? qbarNative$QbarAiModelParam.enable_seg : false;
        if (qbarNative$QbarAiModelParam == null || (str4 = qbarNative$QbarAiModelParam.qbar_segmentation_model_path_) == null) {
            str4 = "";
        }
        b1Var.f216957g = str4;
        b1Var.f216960m = qbarNative$QbarAiModelParam != null ? qbarNative$QbarAiModelParam.det_model_use_fp16 : false;
        b1Var.f216958h = qbarNative$QbarAiModelParam != null ? qbarNative$QbarAiModelParam.enable_reverse_cls : false;
        if (qbarNative$QbarAiModelParam != null && (str5 = qbarNative$QbarAiModelParam.qbar_reverse_cls_model_path_) != null) {
            str6 = str5;
        }
        b1Var.f216959i = str6;
        int[] readers = wxqBarAiModelParam.f401559e;
        kotlin.jvm.internal.o.f(readers, "readers");
        boolean z17 = !(readers.length == 0);
        java.util.LinkedList linkedList = b1Var.f216966s;
        if (z17) {
            int[] readers2 = wxqBarAiModelParam.f401559e;
            kotlin.jvm.internal.o.f(readers2, "readers");
            linkedList.addAll(kz5.z.x0(readers2));
        }
        b1Var.f216967t = wxqBarAiModelParam.f401558d;
        java.util.LinkedList linkedList2 = b1Var.f216968u;
        linkedList2.clear();
        java.util.List list = wxqBarAiModelParam.f401560f;
        if (list != null) {
            linkedList2.addAll(list);
        }
        java.util.LinkedList linkedList3 = b1Var.f216969v;
        linkedList3.clear();
        java.util.List list2 = wxqBarAiModelParam.f401561g;
        if (list2 != null) {
            linkedList3.addAll(list2);
        }
        b1Var.f216970w = com.tencent.wechat.aff.iam_scan.z.Android_CrossPlatform;
        b1Var.f216971x = wxqBarAiModelParam.f401555a == 0 ? com.tencent.wechat.aff.iam_scan.w.SCAN_VIDEO : com.tencent.wechat.aff.iam_scan.w.SCAN_FILE;
        b1Var.f216972y = wxqBarAiModelParam.f401562h;
        b1Var.f216973z = wxqBarAiModelParam.f401563i;
        b1Var.A = wxqBarAiModelParam.f401564j;
        b1Var.B = wxqBarAiModelParam.f401565k;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("transformToScanQBarModelParams ScanQBarModelParams: {\ndetectModelPath: ");
        sb6.append(b1Var.f216954d);
        sb6.append(",\nsuperResolutionModelPath: ");
        sb6.append(b1Var.f216955e);
        sb6.append(",\nsegmentationModelPath: ");
        sb6.append(b1Var.f216957g);
        sb6.append(", enableSeg: ");
        sb6.append(b1Var.f216956f);
        sb6.append(",\nreverseClsModelPath: ");
        sb6.append(b1Var.f216959i);
        sb6.append(", enableReverseCls: ");
        sb6.append(b1Var.f216958h);
        sb6.append(",\nenableDetectFp16: ");
        sb6.append(b1Var.f216960m);
        sb6.append(",\nsupportReaderType: ");
        kotlin.jvm.internal.o.f(linkedList, "getSupportReaderType(...)");
        sb6.append(kz5.n0.g0(linkedList, ",", null, null, 0, null, null, 62, null));
        sb6.append(",\nblackInterval: ");
        sb6.append(b1Var.f216967t);
        sb6.append(",\nwhiteList: ");
        kotlin.jvm.internal.o.f(linkedList2, "getWhiteList(...)");
        sb6.append(kz5.n0.g0(linkedList2, ",", null, null, 0, null, null, 62, null));
        sb6.append(",\nblackList: ");
        kotlin.jvm.internal.o.f(linkedList3, "getBlackList(...)");
        sb6.append(kz5.n0.g0(linkedList3, ",", null, null, 0, null, null, 62, null));
        sb6.append(",\nscanMode: ");
        sb6.append(b1Var.f216971x);
        sb6.append(",\nenableOperateReporter: ");
        sb6.append(b1Var.f216972y);
        sb6.append("\nenableScanGoodsCrossPlatform: ");
        sb6.append(b1Var.B);
        sb6.append("\n}");
        com.tencent.mars.xlog.Log.i("MicroMsg.WXQBarAiModelParamUtils", sb6.toString());
        return b1Var;
    }
}
