package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class h6 implements tk.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f186233a;

    public h6(com.tencent.mm.ipcinvoker.r rVar) {
        this.f186233a = rVar;
    }

    @Override // tk.p
    public void a(boolean z17, java.lang.String err_msg, org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.o.g(err_msg, "err_msg");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenBizPublishImage", "publishCallback, success: " + z17 + ", err_msg: " + err_msg + ", extraInfo: " + jSONObject);
        if (z17 && jSONObject == null) {
            return;
        }
        this.f186233a.a(new com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiOpenBizPublishImage$IPCBizPublishImageRet(z17, err_msg, new com.tencent.mm.ipcinvoker.type.IPCString(jSONObject != null ? jSONObject.toString() : null)));
    }
}
