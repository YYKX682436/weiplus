package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class oa implements com.tencent.mm.ui.xc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f186413d;

    public oa(com.tencent.mm.ipcinvoker.r rVar) {
        this.f186413d = rVar;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiPublishTextState", "LuggageActivityHelper callback:" + i18);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("KEY_RESULT_CODE", i18);
        bundle.putParcelable("KEY_RESULT_DATA", intent.getExtras());
        this.f186413d.a(bundle);
    }
}
