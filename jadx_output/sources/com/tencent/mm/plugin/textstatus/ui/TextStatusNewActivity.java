package com.tencent.mm.plugin.textstatus.ui;

@db5.a(32)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/textstatus/ui/TextStatusNewActivity;", "Lcom/tencent/mm/plugin/textstatus/ui/FlutterTextStatusTransparentActivity;", "<init>", "()V", "plugin-textstatus_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class TextStatusNewActivity extends com.tencent.mm.plugin.textstatus.ui.FlutterTextStatusTransparentActivity {

    /* renamed from: v, reason: collision with root package name */
    public android.animation.ObjectAnimator f173654v;

    @Override // com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatusNewActivity", "finish: ");
        super.finish();
    }

    @Override // com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatusNewActivity", "onBackPressed: ");
    }

    @Override // com.tencent.mm.plugin.textstatus.ui.FlutterTextStatusTransparentActivity, com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.animation.ObjectAnimator ofInt = android.animation.ObjectAnimator.ofInt(getWindow().getDecorView(), "backgroundColor", 0, i65.a.d(this, com.tencent.mm.R.color.f479388y4));
        ofInt.setDuration(100L);
        ofInt.setEvaluator(new android.animation.ArgbEvaluator());
        ofInt.setInterpolator(new android.view.animation.LinearInterpolator());
        this.f173654v = ofInt;
    }
}
