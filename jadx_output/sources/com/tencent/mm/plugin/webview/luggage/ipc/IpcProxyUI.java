package com.tencent.mm.plugin.webview.luggage.ipc;

@db5.a(7)
/* loaded from: classes7.dex */
public class IpcProxyUI extends com.tencent.mm.ui.MMActivity {
    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.IpcProxyUI", "onCreate");
        if (fp.h.c(21)) {
            getWindow().setStatusBarColor(0);
        }
        sw4.h hVar = (sw4.h) com.tencent.mm.ipcinvoker.v0.b(getIntent().getStringExtra("task_class_name"), sw4.h.class);
        if (hVar != null) {
            hVar.a(this, getIntent().getBundleExtra("input_data"), new sw4.i(this));
        } else {
            setResult(-1, new android.content.Intent());
            finish();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mars.xlog.Log.i("MicroMsg.IpcProxyUI", "onDestroy");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void setMMOrientation() {
        int intExtra = getIntent().getIntExtra("orientation", -1);
        if (intExtra != -1) {
            setRequestedOrientation(intExtra);
        }
    }
}
