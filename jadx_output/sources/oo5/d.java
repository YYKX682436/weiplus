package oo5;

/* loaded from: classes8.dex */
public final class d implements io.flutter.plugin.common.MethodChannel.MethodCallHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oo5.e f347204d;

    public d(oo5.e eVar) {
        this.f347204d = eVar;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(io.flutter.plugin.common.MethodCall call, io.flutter.plugin.common.MethodChannel.Result result) {
        int i17;
        int i18;
        kotlin.jvm.internal.o.g(call, "call");
        kotlin.jvm.internal.o.g(result, "result");
        oo5.e eVar = this.f347204d;
        eVar.getClass();
        java.lang.String str = call.method;
        if (str != null) {
            int hashCode = str.hashCode();
            java.lang.String str2 = eVar.f347210i;
            if (hashCode != -1663273296) {
                if (hashCode != -14160099) {
                    if (hashCode == 936400503 && str.equals("flipToPage")) {
                        java.lang.Integer num = (java.lang.Integer) call.argument("pageIndex");
                        if (num == null) {
                            num = 0;
                        }
                        int intValue = num.intValue();
                        if (intValue < 0 || ((i18 = eVar.f347212n) > 0 && intValue >= i18)) {
                            java.lang.String str3 = "Invalid pageIndex: " + intValue + ", valid range: [0, " + eVar.f347212n + ')';
                            com.tencent.mars.xlog.Log.e("MicroMsg.VoIPMP.NativePreviewFileView", str3);
                            result.error("INVALID_PAGE_INDEX", str3, null);
                            return;
                        }
                        try {
                            java.lang.String str4 = eVar.f347210i;
                            oo5.f fVar = eVar.f347209h;
                            com.tencent.xweb.r1.f(str4, fVar != null ? fVar.f347213a : null, intValue, 1.0f, 0, 0);
                            result.success(java.lang.Boolean.TRUE);
                            return;
                        } catch (java.lang.Exception e17) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.VoIPMP.NativePreviewFileView", "flipToPage failed", e17);
                            result.error("FLIP_PAGE_FAILED", e17.getMessage(), null);
                            return;
                        }
                    }
                } else if (str.equals("requestThumbnail")) {
                    java.lang.Integer num2 = (java.lang.Integer) call.argument("pageIndex");
                    if (num2 == null) {
                        num2 = 0;
                    }
                    int intValue2 = num2.intValue();
                    if (intValue2 >= 0 && ((i17 = eVar.f347212n) <= 0 || intValue2 < i17)) {
                        try {
                            oo5.f fVar2 = eVar.f347209h;
                            com.tencent.xweb.r1.e(str2, fVar2 != null ? fVar2.f347213a : null, intValue2);
                            result.success(java.lang.Boolean.TRUE);
                            return;
                        } catch (java.lang.Exception e18) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.VoIPMP.NativePreviewFileView", "requestThumbnail failed", e18);
                            result.error("REQUEST_THUMBNAIL_FAILED", e18.getMessage(), null);
                            return;
                        }
                    }
                    java.lang.String str5 = "Invalid pageIndex: " + intValue2 + ", valid range: [0, " + eVar.f347212n + ')';
                    com.tencent.mars.xlog.Log.e("MicroMsg.VoIPMP.NativePreviewFileView", str5);
                    result.error("INVALID_PAGE_INDEX", str5, null);
                    return;
                }
            } else if (str.equals("closePreview")) {
                try {
                    oo5.f fVar3 = eVar.f347209h;
                    com.tencent.xweb.r1.a(str2, fVar3 != null ? fVar3.f347213a : null);
                    result.success(java.lang.Boolean.TRUE);
                    return;
                } catch (java.lang.Exception e19) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.VoIPMP.NativePreviewFileView", "closePreview failed", e19);
                    result.error("CLOSE_PREVIEW_FAILED", e19.getMessage(), null);
                    return;
                }
            }
        }
        result.notImplemented();
    }
}
