package com.tencent.mm.plugin.webview.luggage.ipc;

@db5.a(7)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/webview/luggage/ipc/GaussianBlurProxyUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "sw4/b", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class GaussianBlurProxyUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f182229d = 0;

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        com.tencent.mm.ui.bk.k0(getWindow());
        if (getIntent() == null) {
            finish();
            return;
        }
        if (getIntent().getBooleanExtra("key_gaussian_ui_blurmask", true)) {
            android.os.Bundle extras = getIntent().getExtras();
            android.os.IBinder binder = extras != null ? extras.getBinder("key_gaussian_ui_scrrenshot") : null;
            com.tencent.mm.plugin.webview.ui.tools.jsapi.p0 p0Var = binder instanceof com.tencent.mm.plugin.webview.ui.tools.jsapi.p0 ? (com.tencent.mm.plugin.webview.ui.tools.jsapi.p0) binder : null;
            android.graphics.Bitmap bitmap = p0Var != null ? p0Var.f185321d : null;
            if (bitmap == null) {
                getWindow().getDecorView().setBackgroundColor(getContext().getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_4));
            } else {
                um5.d dVar = new um5.d();
                dVar.f429144e.f429193b.b().d(1.0f);
                dVar.b(bitmap);
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                dVar.f429141b = width;
                dVar.f429142c = height;
                dVar.a(new sw4.d(this, bitmap));
            }
        } else {
            getWindow().getDecorView().setBackgroundColor(getContext().getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_4));
        }
        getWindow().getDecorView().post(new sw4.c(this));
    }
}
