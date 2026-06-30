package com.tencent.mm.plugin.webview.stub;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/webview/stub/WebViewPublishTextStateUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class WebViewPublishTextStateUI extends com.tencent.mm.ui.MMActivity {
    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("KEY_REQUEST_DATA");
        bi4.d1 d1Var = new bi4.d1();
        d1Var.parseFrom(byteArrayExtra);
        final java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(this);
        android.os.ResultReceiver resultReceiver = new android.os.ResultReceiver() { // from class: com.tencent.mm.plugin.webview.stub.WebViewPublishTextStateUI$onCreate$setStatusCallback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(null);
            }

            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i17, android.os.Bundle bundle2) {
                super.onReceiveResult(i17, bundle2);
                com.tencent.mm.plugin.webview.stub.WebViewPublishTextStateUI webViewPublishTextStateUI = (com.tencent.mm.plugin.webview.stub.WebViewPublishTextStateUI) weakReference.get();
                if (webViewPublishTextStateUI != null) {
                    android.content.Intent intent = new android.content.Intent();
                    if (bundle2 != null) {
                        intent.putExtras(bundle2);
                    }
                    webViewPublishTextStateUI.setResult(i17, intent);
                    webViewPublishTextStateUI.finish();
                }
            }
        };
        ((com.tencent.mm.feature.textstatus.StatusThirdShareFeatureService) ((xe0.g0) i95.n0.c(xe0.g0.class))).Ri(getContext(), d1Var, resultReceiver);
    }
}
