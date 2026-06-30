package com.tencent.mm.ui.tools;

@db5.a(3)
/* loaded from: classes11.dex */
public class ShareScreenImgUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f210169h = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.app.ProgressDialog f210170d = null;

    /* renamed from: e, reason: collision with root package name */
    public android.content.Intent f210171e = null;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f210172f = null;

    /* renamed from: g, reason: collision with root package name */
    public android.net.Uri f210173g = null;

    public ShareScreenImgUI() {
        new com.tencent.mm.ui.tools.aa(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T6() {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.tools.ShareScreenImgUI.T6():void");
    }

    public final void U6() {
        dp.a.makeText(this, com.tencent.mm.R.string.j4b, 1).show();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d2, code lost:
    
        if (r2 == false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V6(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.tools.ShareScreenImgUI.V6(java.lang.String):void");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        android.content.Intent intent = getIntent();
        this.f210171e = intent;
        if (intent == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShareScreenImgUI", "launch : fail, intent is null");
            U6();
            finish();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareScreenImgUI", "intent = " + this.f210171e);
        java.lang.String action = this.f210171e.getAction();
        this.f210173g = this.f210171e.getData();
        if (com.tencent.mm.sdk.platformtools.t8.K0(action)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShareScreenImgUI", "launch : fail, action is null");
            U6();
            finish();
            return;
        }
        android.net.Uri uri = this.f210173g;
        java.lang.String str = q35.e.f359976a;
        if (!com.tencent.mm.sdk.platformtools.t8.e1(this, uri)) {
            V6(action);
            return;
        }
        boolean Di = ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Di(this, new java.lang.String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 145, getString(com.tencent.mm.R.string.hht), android.os.Build.VERSION.SDK_INT < 33 ? getString(com.tencent.mm.R.string.fip) : getString(com.tencent.mm.R.string.msk));
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareScreenImgUI", "checkPermission checkMediaStorage[%b]", java.lang.Boolean.valueOf(Di));
        if (Di) {
            V6(action);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        int g17 = com.tencent.mm.sdk.platformtools.c2.g(getIntent(), "wizard_activity_result_code", 0);
        if (g17 == -1 || g17 == 0) {
            com.tencent.mm.booter.NotifyReceiver.d();
            initView();
        } else {
            if (g17 == 1) {
                finish();
                return;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.ShareScreenImgUI", "onCreate, should not reach here, resultCode = " + g17);
            finish();
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr.length <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ShareScreenImgUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareScreenImgUI", "onRequestPermissionsResult requestCode[%d], grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 != 145) {
            return;
        }
        if (iArr[0] != 0) {
            db5.e1.C(this, getString(com.tencent.mm.R.string.hhi), getString(com.tencent.mm.R.string.hht), getString(com.tencent.mm.R.string.g6z), getString(com.tencent.mm.R.string.fic), false, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.ui.tools.ShareScreenImgUI$$a
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(android.content.DialogInterface dialogInterface, int i18) {
                    int i19 = com.tencent.mm.ui.tools.ShareScreenImgUI.f210169h;
                    com.tencent.mm.ui.tools.ShareScreenImgUI shareScreenImgUI = com.tencent.mm.ui.tools.ShareScreenImgUI.this;
                    shareScreenImgUI.getClass();
                    tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
                    androidx.appcompat.app.AppCompatActivity context = shareScreenImgUI.getContext();
                    ((sb0.f) jVar).getClass();
                    j35.u.g(context);
                    shareScreenImgUI.finish();
                }
            }, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.ui.tools.ShareScreenImgUI$$b
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(android.content.DialogInterface dialogInterface, int i18) {
                    int i19 = com.tencent.mm.ui.tools.ShareScreenImgUI.f210169h;
                    com.tencent.mm.ui.tools.ShareScreenImgUI.this.finish();
                }
            });
            return;
        }
        if (this.f210171e == null) {
            this.f210171e = getIntent();
        }
        android.content.Intent intent = this.f210171e;
        if (intent == null || intent.getAction() == null) {
            return;
        }
        V6(this.f210171e.getAction());
    }
}
