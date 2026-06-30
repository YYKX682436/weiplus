package p61;

/* loaded from: classes5.dex */
public class q2 implements s61.k1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f352356a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.bind.ui.BindMobileUI f352357b;

    public q2(com.tencent.mm.plugin.account.bind.ui.BindMobileUI bindMobileUI, java.lang.String str) {
        this.f352357b = bindMobileUI;
        this.f352356a = str;
    }

    @Override // s61.k1
    public void a(int i17, android.os.Bundle bundle) {
        com.tencent.mm.plugin.account.bind.ui.BindMobileUI bindMobileUI = this.f352357b;
        if (i17 == 2) {
            if (bindMobileUI.A) {
                com.tencent.mm.plugin.account.bind.ui.BindMobileStatusUI.Z6(bindMobileUI, !bindMobileUI.f73044u.isChecked(), !bindMobileUI.f73045v.isChecked());
                bindMobileUI.U6(-1);
                return;
            }
            android.content.Intent intent = new android.content.Intent(bindMobileUI, (java.lang.Class<?>) com.tencent.mm.plugin.account.bind.ui.BindMobileStatusUI.class);
            intent.putExtra("kstyle_bind_wording", bindMobileUI.f73048y);
            intent.putExtra("kstyle_bind_recommend_show", bindMobileUI.f73049z);
            intent.putExtra("Kfind_friend_by_mobile_flag", bindMobileUI.f73044u.isChecked());
            intent.putExtra("Krecom_friends_by_mobile_flag", bindMobileUI.f73045v.isChecked());
            com.tencent.mm.ui.MMWizardActivity.X6(bindMobileUI, intent);
            return;
        }
        if (i17 == 1) {
            int i18 = com.tencent.mm.plugin.account.bind.ui.BindMobileUI.B;
            bindMobileUI.getClass();
            android.content.Intent intent2 = new android.content.Intent(bindMobileUI, (java.lang.Class<?>) com.tencent.mm.plugin.account.bind.ui.BindMobileVerifyUI.class);
            intent2.putExtra("bindmcontact_mobile", this.f352356a);
            intent2.putExtra("kstyle_bind_wording", bindMobileUI.f73048y);
            intent2.putExtra("kstyle_bind_recommend_show", bindMobileUI.f73049z);
            intent2.putExtra("Kfind_friend_by_mobile_flag", bindMobileUI.f73044u.isChecked());
            intent2.putExtra("Krecom_friends_by_mobile_flag", bindMobileUI.f73045v.isChecked());
            if (bindMobileUI.A) {
                intent2.putExtra("bind_scene", 6);
            }
            com.tencent.mm.ui.MMWizardActivity.X6(bindMobileUI, intent2);
        }
    }
}
