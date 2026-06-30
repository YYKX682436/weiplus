package com.tencent.mm.ui.tools;

@db5.a(7)
/* loaded from: classes.dex */
public class ShareImageRedirectUI extends com.tencent.mm.ui.MMBaseActivity {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f210150e;

    public final void O6() {
        vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
        java.lang.String m17 = lp0.b.m();
        java.lang.String str = "microMsg." + java.lang.System.currentTimeMillis() + com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG;
        ((ub0.r) oVar).getClass();
        com.tencent.mm.pluginsdk.ui.tools.l7.l(this, m17, str, 0);
        getWindow().getDecorView().setOnTouchListener(new com.tencent.mm.ui.tools.j9(this));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        getWindow().getDecorView().setOnTouchListener(null);
        if (i18 != -1) {
            finish();
            return;
        }
        if (i17 == 0) {
            vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
            android.content.Context applicationContext = getApplicationContext();
            java.lang.String a17 = g83.a.a();
            ((ub0.r) oVar).getClass();
            java.lang.String b17 = com.tencent.mm.pluginsdk.ui.tools.l7.b(applicationContext, intent, a17);
            this.f210150e = b17;
            if (b17 == null) {
                return;
            }
            android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.ui.transmit.ShareImageSelectorUI.class);
            intent2.putExtra("intent_extra_image_path", this.f210150e);
            startActivityForResult(intent2, 2);
            return;
        }
        if (i17 != 2) {
            return;
        }
        java.util.ArrayList<java.lang.String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("Select_Contact") : null;
        if (stringArrayListExtra == null || stringArrayListExtra.size() != 1) {
            if (stringArrayListExtra != null && stringArrayListExtra.size() > 1) {
                finish();
                return;
            }
            android.content.Intent intent3 = new android.content.Intent();
            intent3.putExtra("Ksnsupload_type", 0);
            intent3.putExtra("sns_kemdia_path", this.f210150e);
            j45.l.j(this, "sns", ".ui.SnsUploadUI", intent3, null);
            finish();
            return;
        }
        android.content.Intent intent4 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.ui.chatting.ChattingUI.class);
        intent4.putExtra("Chat_User", stringArrayListExtra.get(0));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/ui/tools/ShareImageRedirectUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/ui/tools/ShareImageRedirectUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        finish();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        boolean a17 = j35.u.a(this, "android.permission.CAMERA", 16, "", "");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareImageRedirectUI", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", valueOf, new com.tencent.mm.sdk.platformtools.z3(), this);
        if (a17) {
            O6();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ShareImageRedirectUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareImageRedirectUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 != 16) {
            return;
        }
        if (iArr[0] == 0) {
            O6();
        } else {
            db5.e1.C(this, getString(com.tencent.mm.R.string.hh8), getString(com.tencent.mm.R.string.hht), getString(com.tencent.mm.R.string.g6z), getString(com.tencent.mm.R.string.aq7), false, new com.tencent.mm.ui.tools.k9(this), new com.tencent.mm.ui.tools.l9(this));
        }
    }
}
