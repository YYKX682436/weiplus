package com.tencent.mm.plugin.recordvideo.activity;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/activity/TestActivity;", "Lcom/tencent/mm/ui/vas/VASActivity;", "<init>", "()V", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class TestActivity extends com.tencent.mm.ui.vas.VASActivity {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f155639e = 0;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f155640d = jz5.h.b(new it3.b0(this));

    public final com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitRecordViewLayout U6() {
        java.lang.Object value = ((jz5.n) this.f155640d).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitRecordViewLayout) value;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dmz;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        U6().c();
        U6().b(new it3.c0(), new it3.g0(this), dw3.c0.f244182a.m(), 480, td1.q.CTRL_INDEX, 1, 1600000, 2);
        U6().i(1280);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mars.xlog.Log.i("MicroMsg.CameraTestActivity", "onDestroy");
        U6().e();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mars.xlog.Log.i("MicroMsg.CameraTestActivity", "onPause");
        U6().f();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mars.xlog.Log.i("MicroMsg.CameraTestActivity", "onResume");
        U6().h();
    }
}
