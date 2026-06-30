package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/ma;", "Lcom/tencent/mm/ipcinvoker/j;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class ma implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, final com.tencent.mm.ipcinvoker.r rVar) {
        android.os.Bundle data = (android.os.Bundle) obj;
        kotlin.jvm.internal.o.g(data, "data");
        byte[] byteArray = data.getByteArray("KEY_REQUEST_DATA");
        bi4.d1 d1Var = new bi4.d1();
        d1Var.parseFrom(byteArray);
        android.os.ResultReceiver resultReceiver = new android.os.ResultReceiver() { // from class: com.tencent.mm.plugin.webview.ui.tools.newjsapi.JsApiPublishTextState$JsSetStatusTask$invoke$setStatusCallback$1
            {
                super(null);
            }

            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i17, android.os.Bundle bundle) {
                super.onReceiveResult(i17, bundle);
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putInt("KEY_RESULT_CODE", i17);
                bundle2.putParcelable("KEY_RESULT_DATA", bundle);
                com.tencent.mm.ipcinvoker.r rVar2 = com.tencent.mm.ipcinvoker.r.this;
                if (rVar2 != null) {
                    rVar2.a(bundle2);
                }
            }
        };
        ((com.tencent.mm.feature.textstatus.StatusThirdShareFeatureService) ((xe0.g0) i95.n0.c(xe0.g0.class))).Ri(com.tencent.mm.sdk.platformtools.x2.f193071a, d1Var, resultReceiver);
    }
}
