package wd4;

/* loaded from: classes4.dex */
public abstract class r0 {
    public static final void a(wd4.l1 l1Var, android.view.View view, java.util.ArrayList imageQBarDataList) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addImageScanQRCode", "com.tencent.mm.plugin.sns.ui.sheet.ImageQRScanKt");
        kotlin.jvm.internal.o.g(l1Var, "<this>");
        kotlin.jvm.internal.o.g(imageQBarDataList, "imageQBarDataList");
        if (com.tencent.mm.sdk.platformtools.t8.L0(imageQBarDataList)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addImageScanQRCode", "com.tencent.mm.plugin.sns.ui.sheet.ImageQRScanKt");
            return;
        }
        l1Var.d().f211879q = new wd4.o0(l1Var, imageQBarDataList, view);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addImageScanQRCode", "com.tencent.mm.plugin.sns.ui.sheet.ImageQRScanKt");
    }

    public static final com.tencent.mm.plugin.scanner.ImageQBarDataBean b(wd4.l1 l1Var, android.view.View view, java.util.ArrayList imageQBarDataList) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getQBarDataOnCurrentDisplay", "com.tencent.mm.plugin.sns.ui.sheet.ImageQRScanKt");
        kotlin.jvm.internal.o.g(l1Var, "<this>");
        kotlin.jvm.internal.o.g(imageQBarDataList, "imageQBarDataList");
        if (view == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getQBarDataOnCurrentDisplay", "com.tencent.mm.plugin.sns.ui.sheet.ImageQRScanKt");
            return null;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) com.tencent.mm.plugin.scanner.c0.a(l1Var.c(), view, imageQBarDataList, 0).f302833d;
        com.tencent.mm.plugin.scanner.ImageQBarDataBean imageQBarDataBean = arrayList.size() == 1 ? (com.tencent.mm.plugin.scanner.ImageQBarDataBean) arrayList.get(0) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getQBarDataOnCurrentDisplay", "com.tencent.mm.plugin.sns.ui.sheet.ImageQRScanKt");
        return imageQBarDataBean;
    }
}
