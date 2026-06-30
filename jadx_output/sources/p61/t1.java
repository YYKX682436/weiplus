package p61;

/* loaded from: classes5.dex */
public class t1 implements s61.k1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f352378a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.bind.ui.BindMContactUI f352379b;

    public t1(com.tencent.mm.plugin.account.bind.ui.BindMContactUI bindMContactUI, java.lang.String str) {
        this.f352379b = bindMContactUI;
        this.f352378a = str;
    }

    @Override // s61.k1
    public void a(int i17, android.os.Bundle bundle) {
        if (i17 == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BindMContactUI", "next to BindMContactVerifyUI for bind mobile");
            com.tencent.mm.plugin.account.bind.ui.BindMContactUI bindMContactUI = this.f352379b;
            android.content.Intent intent = new android.content.Intent(bindMContactUI, (java.lang.Class<?>) com.tencent.mm.plugin.account.bind.ui.BindMContactVerifyUI.class);
            intent.putExtra("policy_ticket", bundle.getString("policyTicket", ""));
            intent.putExtra("bindmcontact_mobile", this.f352378a);
            intent.putExtra("KEnterFromBanner", bindMContactUI.f72995r);
            intent.putExtra("bind_scene", bindMContactUI.f72999v);
            intent.addFlags(com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCHighTierLevel62);
            intent.putExtra("back_to_status", bindMContactUI.f72996s);
            com.tencent.mm.ui.MMWizardActivity.X6(bindMContactUI, intent);
            new com.tencent.mm.sdk.platformtools.n3().postDelayed(new java.lang.Runnable() { // from class: p61.t1$$a
                @Override // java.lang.Runnable
                public final void run() {
                    p61.t1.this.f352379b.finish();
                }
            }, 500L);
        }
    }
}
