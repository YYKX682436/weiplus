package com.tencent.mm.plugin.finder.webview;

/* loaded from: classes8.dex */
public class j1 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f136877d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f136878e;

    public j1(java.lang.ref.WeakReference weakReference, java.lang.String str) {
        this.f136877d = weakReference;
        this.f136878e = str;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.webview.WebViewLongClickHelper$ImageQBarData webViewLongClickHelper$ImageQBarData = (com.tencent.mm.plugin.finder.webview.WebViewLongClickHelper$ImageQBarData) obj;
        com.tencent.mm.plugin.finder.webview.n1 n1Var = (com.tencent.mm.plugin.finder.webview.n1) this.f136877d.get();
        if (n1Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewLongClickHelper", "RecogQBarIPCCallBack helper == null");
            return;
        }
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(webViewLongClickHelper$ImageQBarData.f136811e);
        java.lang.String str = this.f136878e;
        java.lang.String str2 = webViewLongClickHelper$ImageQBarData.f136811e;
        if (K0 || !str2.equals(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewLongClickHelper", "RecogQBarIPCCallBack   path error, data.mImagePath:" + str2 + "   path: " + str);
            return;
        }
        java.util.HashMap hashMap = n1Var.f136906j;
        if (hashMap.containsKey(str2)) {
            hashMap.remove(str2);
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewLongClickHelper", "RecogQBarIPCCallBack  remove filePath:".concat(str2));
        }
        if (!webViewLongClickHelper$ImageQBarData.f136812f) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewLongClickHelper", "RecogQBarIPCCallBack  recog is fail:" + str);
            return;
        }
        n1Var.f136907k = java.lang.Long.valueOf(java.lang.System.currentTimeMillis());
        n1Var.f136908l = java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - n1Var.f136909m.longValue());
        java.util.ArrayList arrayList = n1Var.f136897a;
        arrayList.clear();
        java.util.ArrayList arrayList2 = webViewLongClickHelper$ImageQBarData.f136810d;
        if (arrayList2 != null && arrayList2.size() > 0) {
            arrayList.add((com.tencent.mm.plugin.scanner.ImageQBarDataBean) arrayList2.get(0));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewLongClickHelper", "RecogQBarIPCCallBack  :" + arrayList.size());
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.finder.webview.z0(n1Var));
        if (com.tencent.mm.sdk.platformtools.t8.L0(arrayList)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewLongClickHelper", "processGetWXACodeNickName mImageQBarDataList nil");
            return;
        }
        if (arrayList.size() != 1) {
            return;
        }
        com.tencent.mm.plugin.scanner.ImageQBarDataBean imageQBarDataBean = (com.tencent.mm.plugin.scanner.ImageQBarDataBean) arrayList.get(0);
        kd0.l2 l2Var = (kd0.l2) i95.n0.c(kd0.l2.class);
        int i17 = imageQBarDataBean.f158620e;
        java.lang.String str3 = imageQBarDataBean.f158619d;
        ((jd0.z1) l2Var).getClass();
        if (com.tencent.mm.plugin.scanner.z0.e(i17, str3)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewLongClickHelper", "processGetWXACodeNickName");
            kd0.p2 p2Var = n1Var.f136903g;
            int i18 = imageQBarDataBean.f158620e;
            java.lang.String str4 = imageQBarDataBean.f158619d;
            java.lang.String str5 = n1Var.f136905i;
            kd0.f2 f2Var = new kd0.f2(str4);
            f2Var.f306635b = 4;
            f2Var.f306636c = str5;
            ((com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic) p2Var).i(i18, f2Var);
        }
    }
}
