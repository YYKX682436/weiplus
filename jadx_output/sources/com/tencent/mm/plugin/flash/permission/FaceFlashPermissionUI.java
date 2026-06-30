package com.tencent.mm.plugin.flash.permission;

@db5.a(3)
/* loaded from: classes.dex */
public class FaceFlashPermissionUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f137243i = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.j0 f137244d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f137245e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f137246f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f137247g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f137248h = false;

    public static void U6(android.content.Context context, android.os.Bundle bundle, int i17) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.flash.permission.FaceFlashPermissionUI.class);
        intent.putExtras(bundle);
        android.app.Activity activity = (android.app.Activity) context;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/flash/permission/FaceFlashPermissionUI", "jumpToActivity", "(Landroid/content/Context;Landroid/os/Bundle;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    public final void T6() {
        boolean z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerPermission", "[%d]gotoFaceFlashUI() hasStarted:%b", java.lang.Integer.valueOf(hashCode()), java.lang.Boolean.valueOf(this.f137246f));
        if (this.f137246f) {
            return;
        }
        if (!com.tencent.mm.plugin.facedetect.model.s0.a(this)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerPermission", "no camera permission. check permission");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerPermission", "check permission all success");
        boolean booleanExtra = getIntent().getBooleanExtra("face_permission_location_check", false);
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerPermission", "needCheckLocation: [%s]，hasCheckLocation：[%s]", java.lang.Boolean.valueOf(booleanExtra), java.lang.Boolean.valueOf(this.f137247g));
        if (!booleanExtra || this.f137247g) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerPermission", "do not needCheckLocation");
            z17 = false;
        } else {
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
            boolean a17 = j35.u.a(this, "android.permission.ACCESS_FINE_LOCATION", 64, "", "");
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerPermission", "locationPermission: [%s] ", java.lang.Boolean.valueOf(a17));
            z17 = !a17;
        }
        if (z17) {
            return;
        }
        boolean z18 = getIntent().getExtras().getBoolean("face_permission_check", false);
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerPermission", "use new face action openPlatformFlashPage:%b", java.lang.Boolean.valueOf(z18));
        if (z18) {
            com.tencent.mm.plugin.flash.FaceFlashUI.X6(this, getIntent().getExtras(), 1);
        } else {
            android.os.Bundle extras = getIntent().getExtras();
            com.tencent.mm.plugin.flash.action.t0 t0Var = new com.tencent.mm.plugin.flash.action.t0(this);
            if (!iq.b.h(this, true, t0Var) && !iq.b.D(this, t0Var) && !iq.b.w(this, t0Var) && !iq.b.f(this, t0Var) && !iq.b.k(this, t0Var)) {
                android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.flash.action.FaceFlashActionUI.class);
                if (extras != null) {
                    intent.putExtras(extras);
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(1);
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.k(this, arrayList.toArray(), "com/tencent/mm/plugin/flash/action/FaceFlashActionUI", "jumpToFaceFlashUI", "(Landroid/app/Activity;Landroid/os/Bundle;I)Z", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            }
        }
        this.f137246f = true;
    }

    public final android.content.Intent V6(int i17, int i18, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("err_type", i17);
        bundle.putInt("err_code", i18);
        bundle.putString("err_msg", str);
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerPermission", "face result errorType:%s errorCode:%s errorMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        intent.putExtras(bundle);
        return intent;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerPermission", "[%d]onActivityResult()", java.lang.Integer.valueOf(hashCode()));
        super.onActivityResult(i17, i18, intent);
        setResult(i18, intent);
        finish();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerPermission", "[%d]onCreate()", java.lang.Integer.valueOf(hashCode()));
        super.onCreate(bundle);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerPermission", "[%d]onRequestPermissionsResult:%s", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(i17));
        if (iArr == null || iArr.length <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerPermission", "dont have any permission");
            setResult(1, V6(4, 90010, "fail"));
            finish();
            return;
        }
        if (i17 == 16) {
            if (iArr[0] == 0) {
                this.f137245e = true;
                T6();
                return;
            } else {
                this.f137245e = false;
                this.f137244d = db5.e1.C(this, getString(com.tencent.mm.R.string.c7j), getString(com.tencent.mm.R.string.hht), getString(com.tencent.mm.R.string.g6z), getString(com.tencent.mm.R.string.f490347sg), false, new uz2.a(this), new uz2.b(this));
                return;
            }
        }
        if (i17 != 18) {
            if (i17 == 64) {
                if (iArr[0] == 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerPermission", "get location granted");
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerPermission", "do not get location granted");
                }
                this.f137247g = true;
                T6();
                return;
            }
            if (i17 != 80) {
                return;
            }
        }
        if (iArr[0] == 0) {
            this.f137245e = true;
            T6();
        } else {
            this.f137245e = false;
            this.f137244d = db5.e1.C(this, getString(com.tencent.mm.R.string.c7k), getString(com.tencent.mm.R.string.hht), getString(com.tencent.mm.R.string.g6z), getString(com.tencent.mm.R.string.f490347sg), false, new uz2.c(this), new uz2.d(this));
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity
    public void onRestoreInstanceState(android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerPermission", "[%d]onRestoreInstanceState()", java.lang.Integer.valueOf(hashCode()));
        this.f137248h = true;
        super.onRestoreInstanceState(bundle);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerPermission", "[%d]onResume()  restore:%b checkPermissionSuccess:%b", java.lang.Integer.valueOf(hashCode()), java.lang.Boolean.valueOf(this.f137248h), java.lang.Boolean.valueOf(this.f137245e));
        if (this.f137245e || this.f137248h) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FaceFlashManagerPermission", "checkPermissionSuccess || restore, return");
            return;
        }
        com.tencent.mm.ui.widget.dialog.j0 j0Var = this.f137244d;
        if (j0Var == null || !j0Var.isShowing()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashManagerPermission", "onResume goFaceFlash");
            T6();
        }
    }
}
