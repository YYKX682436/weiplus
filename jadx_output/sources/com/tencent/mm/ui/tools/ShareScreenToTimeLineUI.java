package com.tencent.mm.ui.tools;

@db5.a(3)
/* loaded from: classes11.dex */
public class ShareScreenToTimeLineUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f210176d = null;

    /* renamed from: e, reason: collision with root package name */
    public android.net.Uri f210177e = null;

    public final void T6() {
        dp.a.makeText(this, com.tencent.mm.R.string.j4d, 1).show();
    }

    public final void U6(java.lang.String str, java.lang.String str2) {
        android.content.Intent intent = new android.content.Intent();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            intent.putExtra("sns_kemdia_path", str);
            intent.putExtra("KFilterId", -1);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            intent.putExtra("Kdescription", str2);
        }
        if (c01.d9.h() && !gm0.m.r()) {
            intent.putExtra("K_go_to_SnsTimeLineUI", true);
            j45.l.j(this, "sns", ".ui.SnsUploadUI", intent, null);
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            T6();
        } else {
            android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.ui.tools.ShareToTimeLineUI.class);
            intent2.putExtra("android.intent.extra.STREAM", com.tencent.mm.sdk.platformtools.i1.b(getContext(), new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str))));
            intent2.addFlags(32768).addFlags(268435456);
            intent2.setType("image/*");
            intent2.setAction("android.intent.action.SEND");
            com.tencent.mm.ui.MMWizardActivity.Y6(this, new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.SimpleLoginUI.class).addFlags(32768).addFlags(268435456), intent2);
        }
        finish();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e9, code lost:
    
        if ((!r2.a() ? false : r2.f213266a.F(r2.f213267b)) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0188, code lost:
    
        if (r1 == false) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01cb  */
    @Override // com.tencent.mm.ui.MMActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void initView() {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.tools.ShareScreenToTimeLineUI.initView():void");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        int g17 = com.tencent.mm.sdk.platformtools.c2.g(getIntent(), "wizard_activity_result_code", 0);
        if (g17 == -1 || g17 == 0) {
            com.tencent.mm.booter.NotifyReceiver.d();
            c01.d9.e().g(new c01.ra(new com.tencent.mm.ui.tools.ca(this), null));
            initView();
        } else {
            if (g17 == 1) {
                finish();
                return;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.ShareScreenToTimeLineUI", "onCreate, should not reach here, resultCode = " + g17);
            finish();
        }
    }
}
