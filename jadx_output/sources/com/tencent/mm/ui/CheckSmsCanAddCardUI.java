package com.tencent.mm.ui;

/* loaded from: classes5.dex */
public class CheckSmsCanAddCardUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f196629d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.o f196630e;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bmq;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a0  */
    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            super.onCreate(r6)
            r5.hideTitleView()
            boolean r6 = c01.d9.h()
            if (r6 == 0) goto Lb5
            boolean r6 = gm0.m.r()
            if (r6 == 0) goto L14
            goto Lb5
        L14:
            android.content.Intent r6 = r5.getIntent()
            android.net.Uri r6 = r6.getData()
            r0 = 1
            java.lang.String r1 = "MicroMsg.CheckSmsCanAddCardUI"
            r2 = 0
            if (r6 == 0) goto L59
            java.lang.String r3 = r6.getHost()
            boolean r4 = com.tencent.mm.sdk.platformtools.t8.K0(r3)
            if (r4 != 0) goto L50
            java.lang.String r4 = "cardpackage"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L35
            goto L50
        L35:
            java.lang.String r3 = "encrystr"
            java.lang.String r6 = r6.getQueryParameter(r3)
            r5.f196629d = r6
            java.lang.String r3 = "encryptCardInfo = %s"
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            com.tencent.mars.xlog.Log.i(r1, r3, r6)
            java.lang.String r6 = r5.f196629d
            boolean r6 = com.tencent.mm.sdk.platformtools.t8.K0(r6)
            if (r6 != 0) goto L59
            r6 = r0
            goto L5a
        L50:
            java.lang.String r6 = "err host, host = %s"
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            com.tencent.mars.xlog.Log.e(r1, r6, r3)
        L59:
            r6 = r2
        L5a:
            if (r6 == 0) goto La0
            com.tencent.mm.modelbase.r1 r6 = c01.d9.e()
            r0 = 1038(0x40e, float:1.455E-42)
            r6.a(r0, r5)
            com.tencent.mm.modelbase.l r6 = new com.tencent.mm.modelbase.l
            r6.<init>()
            r45.j20 r3 = new r45.j20
            r3.<init>()
            r6.f70664a = r3
            r45.k20 r3 = new r45.k20
            r3.<init>()
            r6.f70665b = r3
            r6.f70667d = r0
            java.lang.String r0 = "/cgi-bin/mmbiz-bin/api/checksmscanaddcard"
            r6.f70666c = r0
            com.tencent.mm.modelbase.o r6 = r6.a()
            r5.f196630e = r6
            com.tencent.mm.modelbase.m r6 = r6.f70710a
            com.tencent.mm.protobuf.f r6 = r6.f70684a
            r45.j20 r6 = (r45.j20) r6
            java.lang.String r0 = r5.f196629d
            r6.f377508d = r0
            java.lang.String r6 = "encry value is %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            com.tencent.mars.xlog.Log.i(r1, r6, r0)
            com.tencent.mm.modelbase.o r6 = r5.f196630e
            r0 = 0
            com.tencent.mm.modelbase.z2.d(r6, r0, r2)
            r5.f196630e = r6
            goto Lb4
        La0:
            r6 = 2131778564(0x7f105c04, float:1.918866E38)
            java.lang.String r6 = r5.getString(r6)
            android.widget.Toast r6 = dp.a.makeText(r5, r6, r0)
            r6.show()
            com.tencent.mm.ui.LauncherUI.n7(r5)
            r5.finish()
        Lb4:
            return
        Lb5:
            android.content.Intent r6 = new android.content.Intent
            java.lang.Class<com.tencent.mm.plugin.account.ui.SimpleLoginUI> r0 = com.tencent.mm.plugin.account.ui.SimpleLoginUI.class
            r6.<init>(r5, r0)
            android.content.Intent r0 = r5.getIntent()
            com.tencent.mm.ui.MMWizardActivity.Y6(r5, r6, r0)
            r5.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.CheckSmsCanAddCardUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        c01.d9.e().q(1038, this);
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CheckSmsCanAddCardUI", "onSceneEnd errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (i17 != 0 || i18 != 0) {
            dp.a.makeText(this, getString(com.tencent.mm.R.string.f493436k62), 1).show();
            com.tencent.mm.ui.LauncherUI.n7(this);
            finish();
            return;
        }
        r45.k20 k20Var = (r45.k20) this.f196630e.f70711b.f70700a;
        java.lang.String str2 = k20Var.f378323d;
        java.lang.String str3 = k20Var.f378324e;
        com.tencent.mars.xlog.Log.i("MicroMsg.CheckSmsCanAddCardUI", "onSceneEnd cardid:%s extMsg:%s", str2, str3);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_card_id", str2);
        intent.putExtra("key_card_ext", str3);
        intent.putExtra("key_from_scene", 8);
        intent.putExtra("key_is_sms_add_card", true);
        j45.l.k(this, "card", ".ui.CardDetailUI", intent, false);
        finish();
    }
}
