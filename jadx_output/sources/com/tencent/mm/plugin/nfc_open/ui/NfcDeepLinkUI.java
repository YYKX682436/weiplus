package com.tencent.mm.plugin.nfc_open.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/nfc_open/ui/NfcDeepLinkUI;", "Lcom/tencent/mm/plugin/nfc_open/ui/TransparentUI;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class NfcDeepLinkUI extends com.tencent.mm.plugin.nfc_open.ui.TransparentUI {
    @Override // com.tencent.mm.plugin.nfc_open.ui.TransparentUI, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.content.Intent intent = getIntent();
        if (intent == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Nfc.NfcDeepLinkUI", "onCreate, intent is null");
            finish();
        } else {
            java.util.Queue queue = bo3.e.f23024a;
            bo3.e.f23025b.a(this, intent);
            finish();
        }
    }
}
