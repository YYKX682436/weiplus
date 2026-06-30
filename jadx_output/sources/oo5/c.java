package oo5;

/* loaded from: classes8.dex */
public final class c implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ oo5.e f347203a;

    public c(oo5.e eVar) {
        this.f347203a = eVar;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.Integer num = (java.lang.Integer) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMP.NativePreviewFileView", "openFile result: " + num);
        if (num != null && num.intValue() == 0) {
            return;
        }
        oo5.e eVar = this.f347203a;
        if (num == null || num.intValue() != 0) {
            if (num != null && -17 == num.intValue()) {
                android.content.Context context = eVar.f347205d;
                if (context == null || (str = context.getString(com.tencent.mm.R.string.cf7)) == null) {
                    str = "打开失败";
                }
                db5.t7.g(context, str);
            } else {
                android.content.Context context2 = eVar.f347205d;
                db5.t7.g(context2, context2 != null ? context2.getString(com.tencent.mm.R.string.ibr) : null);
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("openFile failed, error code: ");
        sb6.append(num);
        sb6.append(", filePath: ");
        oo5.f fVar = eVar.f347209h;
        sb6.append(fVar != null ? fVar.f347213a : null);
        com.tencent.mars.xlog.Log.e("MicroMsg.VoIPMP.NativePreviewFileView", sb6.toString());
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_CODE, java.lang.Integer.valueOf(num != null ? num.intValue() : -1));
        oo5.f fVar2 = eVar.f347209h;
        if (fVar2 == null || (str2 = fVar2.f347213a) == null) {
            str2 = "";
        }
        hashMap.put(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, str2);
        io.flutter.plugin.common.MethodChannel methodChannel = eVar.f347211m;
        if (methodChannel != null) {
            methodChannel.invokeMethod("onOpenError", hashMap);
        }
    }
}
