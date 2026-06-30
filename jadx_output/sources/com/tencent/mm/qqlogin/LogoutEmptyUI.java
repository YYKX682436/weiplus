package com.tencent.mm.qqlogin;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/qqlogin/LogoutEmptyUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "<init>", "()V", "plugin-account_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class LogoutEmptyUI extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity {
    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i18 == -1) {
            new w45.p().c();
            w45.b bVar = w45.b.f442899a;
            com.tencent.mm.autogen.events.WebViewExWindowCloseEvent webViewExWindowCloseEvent = w45.b.f442900b;
            if (webViewExWindowCloseEvent != null) {
                bVar.a(webViewExWindowCloseEvent);
            }
            w45.b.f442900b = null;
        }
        finish();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.content.Intent intent = new android.content.Intent(com.tencent.mm.sdk.platformtools.x2.f193071a, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.RegByMobileSetPwdUI.class);
        intent.putExtra("kintent_hint", com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.hx9));
        startActivityForResult(intent, 5);
    }
}
