package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes.dex */
public class f0 implements com.tencent.mm.pluginsdk.ui.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.BioHelperUI f190832a;

    public f0(com.tencent.mm.pluginsdk.ui.BioHelperUI bioHelperUI, com.tencent.mm.pluginsdk.ui.c0 c0Var) {
        this.f190832a = bioHelperUI;
    }

    @Override // com.tencent.mm.pluginsdk.ui.g0
    public int a() {
        return com.tencent.mm.R.drawable.c1t;
    }

    @Override // com.tencent.mm.pluginsdk.ui.g0
    public java.lang.String b() {
        return this.f190832a.getString(com.tencent.mm.R.string.aio);
    }

    @Override // com.tencent.mm.pluginsdk.ui.g0
    public java.lang.String c() {
        return this.f190832a.getString(com.tencent.mm.R.string.aip);
    }

    @Override // com.tencent.mm.pluginsdk.ui.g0
    public java.lang.String d() {
        return this.f190832a.getString(com.tencent.mm.R.string.aim);
    }

    @Override // com.tencent.mm.pluginsdk.ui.g0
    public void e(int i17, int i18, android.content.Intent intent) {
        if (i18 != 2 || intent == null) {
            return;
        }
        this.f190832a.finish();
        java.lang.String stringExtra = intent.getStringExtra("KFaceLoginAuthPwd");
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.K0(stringExtra));
        objArr[1] = java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.K0(stringExtra) ? 0 : stringExtra.length());
        com.tencent.mars.xlog.Log.i("MicroMsg.BioHelperUI", "hy: secondary check onActivityResult, do faceprint auth, authPwd is null:%b, authPwd.len:%d", objArr);
    }

    @Override // com.tencent.mm.pluginsdk.ui.g0
    public void f(android.content.Intent intent) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.g0
    public void g(android.content.Context context) {
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.pluginsdk.ui.BioHelperUI bioHelperUI = this.f190832a;
        intent.putExtra("k_user_name", bioHelperUI.f189759e);
        intent.putExtra("k_purpose", 2);
        intent.putExtra("k_need_signature", true);
        intent.putExtra("k_ticket", bioHelperUI.f189760f);
        j45.l.n(bioHelperUI.getContext(), "facedetect", ".ui.FaceDetectUI", intent, 1025);
    }
}
