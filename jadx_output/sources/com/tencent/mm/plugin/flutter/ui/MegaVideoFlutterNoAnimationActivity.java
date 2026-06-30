package com.tencent.mm.plugin.flutter.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/flutter/ui/MegaVideoFlutterNoAnimationActivity;", "Lcom/tencent/mm/plugin/flutter/ui/MegaVideoFlutterActivity;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class MegaVideoFlutterNoAnimationActivity extends com.tencent.mm.plugin.flutter.ui.MegaVideoFlutterActivity {
    public final void b7() {
        if (android.os.Build.VERSION.SDK_INT < 30) {
            getWindow().getDecorView().setSystemUiVisibility(5894);
            return;
        }
        android.view.WindowInsetsController insetsController = getWindow().getInsetsController();
        if (insetsController != null) {
            insetsController.hide(android.view.WindowInsets.Type.systemBars());
        }
        android.view.WindowInsetsController insetsController2 = getWindow().getInsetsController();
        if (insetsController2 == null) {
            return;
        }
        insetsController2.setSystemBarsBehavior(2);
    }

    @Override // com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity, com.tencent.mm.ui.MMFragmentActivity
    public boolean convertActivityFromTranslucent() {
        return true;
    }

    @Override // com.tencent.mm.plugin.flutter.ui.MegaVideoFlutterActivity, com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.flutter.ui.MegaVideoFlutterActivity, com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        b7();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        if (z17) {
            b7();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void setMMOrientation() {
        setRequestedOrientation(0);
    }
}
