package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/od;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiShowOpenIMContactProfile$JumpProfileData;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes.dex */
public final class od implements com.tencent.mm.ipcinvoker.j {
    public final android.os.Bundle a(java.lang.String backInfo, java.lang.String str) {
        kotlin.jvm.internal.o.g(backInfo, "backInfo");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("KEY_BACK_INFO", backInfo);
        if (!(str == null || r26.n0.N(str))) {
            bundle.putString("KEY_ERR_TIPS", str);
        }
        return bundle;
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        pm0.v.X(new com.tencent.mm.plugin.webview.ui.tools.newjsapi.ld(this, (com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiShowOpenIMContactProfile$JumpProfileData) obj, rVar));
    }
}
