package com.tencent.mm.plugin.webview.modeltools;

/* loaded from: classes.dex */
public class v0 implements com.tencent.xweb.GetImageBitmapToFileFinishedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.modeltools.w0 f183356a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f183357b;

    public v0(com.tencent.mm.plugin.webview.modeltools.w0 w0Var, java.lang.String str) {
        this.f183356a = w0Var;
        this.f183357b = str;
    }

    @Override // com.tencent.xweb.GetImageBitmapToFileFinishedCallback
    public void onFinishImageBitmapToFile(int i17, java.lang.String str, java.lang.String str2, int i18, int i19, java.lang.String str3) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewPreviewImgHelper", "onFinishImageBitmapToFile result %d", java.lang.Integer.valueOf(i17));
        if (com.tencent.mm.plugin.webview.modeltools.x0.f183362c) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1059L, i17 == 0 ? 0L : 1L, 1L, false);
        }
        com.tencent.mm.plugin.webview.modeltools.w0 w0Var = this.f183356a;
        if (i17 != 0) {
            if (w0Var != null) {
                ((com.tencent.mm.plugin.webview.luggage.jsapi.o1) w0Var).a();
            }
        } else {
            ((java.util.HashMap) com.tencent.mm.plugin.webview.modeltools.x0.f183363d).put(this.f183357b, str2);
            if (w0Var != null) {
                ((com.tencent.mm.plugin.webview.luggage.jsapi.o1) w0Var).b();
            }
        }
    }
}
