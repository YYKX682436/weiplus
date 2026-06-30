package com.tencent.mm.plugin.webview.luggage;

@db5.a(7)
/* loaded from: classes8.dex */
public class LuggageStubUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f182132d = 0;

    public final void T6(int i17) {
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("com.tencent.mm.ACTION_LOCATION_FROM_JSAPI");
        intent.putExtra("key_permission_request_code", getIntent().getIntExtra("key_permission_request_code", 0));
        intent.putExtra("key_result_code", i17);
        intent.setPackage(com.tencent.mm.sdk.platformtools.x2.f193072b);
        com.tencent.mm.sdk.platformtools.x2.f193071a.sendBroadcast(intent, com.tencent.mm.sdk.platformtools.v9.a());
        finish();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        T6(0);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().getIntExtra("key_action_code", -1) != 1) {
            finish();
            return;
        }
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Di(this, getIntent().getStringArrayExtra("key_permission_types"), getIntent().getIntExtra("key_permission_request_code", 0), null, null);
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (i17 != 75) {
            T6(0);
        } else if (iArr[0] == 0) {
            T6(-1);
        } else {
            T6(0);
        }
    }
}
