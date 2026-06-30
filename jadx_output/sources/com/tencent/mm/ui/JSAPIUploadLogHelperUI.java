package com.tencent.mm.ui;

/* loaded from: classes5.dex */
public class JSAPIUploadLogHelperUI extends com.tencent.mm.ui.MMBaseActivity {

    /* renamed from: e, reason: collision with root package name */
    public static volatile boolean f196819e;

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f196820f = new byte[0];

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JSAPIUploadLogHelperUI", "onCreate called, isRunning:%b", java.lang.Boolean.valueOf(f196819e));
        super.onCreate(bundle);
        setContentView(com.tencent.mm.R.layout.f488168j3);
        synchronized (f196820f) {
            if (f196819e) {
                com.tencent.mars.xlog.Log.w("MicroMsg.JSAPIUploadLogHelperUI", "reentered while last one is running, finish myself.");
                finish();
            }
        }
        java.lang.String stringExtra = getIntent().getStringExtra("key_user");
        int intExtra = getIntent().getIntExtra("key_time", 0);
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Boolean.valueOf(stringExtra != null && stringExtra.equals(c01.z1.r()));
        objArr[1] = java.lang.Integer.valueOf(intExtra);
        com.tencent.mars.xlog.Log.i("MicroMsg.JSAPIUploadLogHelperUI", "upload log from jsapi, in upload activity, username-recv-well:%b, time:%d", objArr);
        if (stringExtra == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JSAPIUploadLogHelperUI", "doUpload: userName is null.");
            finish();
        } else if (intExtra >= 0) {
            c01.d9.e().g(new c01.ra(new com.tencent.mm.ui.c8(this, intExtra, db5.e1.Q(this, getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.lbc), true, false, null)), null));
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.JSAPIUploadLogHelperUI", "doUpload: illegal time value: %d", java.lang.Integer.valueOf(intExtra));
            finish();
        }
    }

    @Override // com.tencent.mm.ui.MMBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.JSAPIUploadLogHelperUI", "onDestroy called, isRunning:%b", java.lang.Boolean.valueOf(f196819e));
        super.onDestroy();
    }
}
