package com.tencent.mm.ui.feature.api.screenshot;

/* loaded from: classes8.dex */
public final class o implements com.tencent.mm.sdk.platformtools.f7 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.feature.api.screenshot.p f208535d;

    public o(com.tencent.mm.ui.feature.api.screenshot.p pVar) {
        this.f208535d = pVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.f7
    public void z0(java.lang.String str, long j17, boolean z17) {
        com.tencent.mm.ui.feature.api.screenshot.p pVar = this.f208535d;
        for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) pVar.f208541a).entrySet()) {
            java.lang.String callbackProcess = (java.lang.String) entry.getKey();
            if (((java.lang.Number) entry.getValue()).intValue() > 0) {
                pVar.getClass();
                kotlin.jvm.internal.o.g(callbackProcess, "callbackProcess");
                com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotService", "IPCControllerImpl invokeCallback, callbackProcess: ".concat(callbackProcess));
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, str);
                bundle.putLong("dateAdded", j17);
                bundle.putBoolean("isPending", z17);
                com.tencent.mm.ipcinvoker.d0.d(callbackProcess, bundle, com.tencent.mm.ui.feature.api.screenshot.r.class, null);
            }
        }
    }
}
