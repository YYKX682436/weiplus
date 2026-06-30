package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes12.dex */
public class o6 implements com.tencent.mm.modelbase.x0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.q6 f185318d;

    public o6(com.tencent.mm.plugin.webview.ui.tools.jsapi.q6 q6Var) {
        this.f185318d = q6Var;
    }

    @Override // com.tencent.mm.modelbase.x0
    public void onCompletion() {
        com.tencent.mm.plugin.webview.ui.tools.jsapi.q6 q6Var = this.f185318d;
        try {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("playResult", "onVoicePlayEnd:ok");
            bundle.putString(dm.i4.COL_LOCALID, q6Var.f185364e);
            q6Var.f185365f.f184998y.callback(2002, bundle);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgHandler", "notify voice play end failed : %s", e17.getMessage());
        }
    }
}
