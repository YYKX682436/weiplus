package com.tencent.mm.plugin.scanner;

/* loaded from: classes4.dex */
public abstract class c0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00dd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x002e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final jz5.l a(android.content.Context r18, android.view.View r19, java.util.ArrayList r20, int r21) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.scanner.c0.a(android.content.Context, android.view.View, java.util.ArrayList, int):jz5.l");
    }

    public static final void b(android.content.Context context, android.view.View view, java.util.ArrayList dataList, int i17, com.tencent.mm.plugin.scanner.b0 b0Var) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(dataList, "dataList");
        if (view == null || dataList.isEmpty()) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(dataList);
        jz5.l a17 = a(context, view, arrayList, i17);
        java.util.ArrayList arrayList2 = (java.util.ArrayList) a17.f302833d;
        java.util.ArrayList arrayList3 = (java.util.ArrayList) a17.f302834e;
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanCodeViewHelper", "handleCode  dataList:" + dataList.size() + "  dstPointListOnCurrentDisplay:" + arrayList3.size() + ' ');
        try {
            java.lang.Object systemService = context.getSystemService("vibrator");
            android.os.Vibrator vibrator = systemService instanceof android.os.Vibrator ? (android.os.Vibrator) systemService : null;
            if (vibrator != null) {
                vibrator.vibrate(10L);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ScanCodeViewHelper", e17, "", new java.lang.Object[0]);
        }
        if (arrayList2.size() != 0) {
            if (b0Var != null) {
                b0Var.a(arrayList3, arrayList2, arrayList);
            }
        } else if (dataList.size() > 0) {
            java.lang.Object obj = dataList.get(0);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            com.tencent.mm.plugin.scanner.ImageQBarDataBean imageQBarDataBean = (com.tencent.mm.plugin.scanner.ImageQBarDataBean) obj;
            if (b0Var != null) {
                b0Var.b(imageQBarDataBean, arrayList);
            }
        }
    }
}
