package qr4;

/* loaded from: classes9.dex */
public class c extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qr4.h f366127c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(qr4.h hVar, com.tencent.mm.ui.MMActivity mMActivity, np5.b0 b0Var) {
        super(mMActivity, b0Var);
        this.f366127c = hVar;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        qr4.h hVar = this.f366127c;
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = (com.tencent.mm.plugin.wallet_core.model.Bankcard) hVar.f213801c.getParcelable("key_bankcard");
        hVar.f213801c.putString("key_pwd1", (java.lang.String) objArr[0]);
        hVar.f213801c.putString("key_mobile", bankcard.field_mobile);
        com.tencent.mm.plugin.wallet_core.model.Authen authen = new com.tencent.mm.plugin.wallet_core.model.Authen();
        authen.f179542d = 3;
        authen.f179544f = (java.lang.String) objArr[0];
        authen.f179546h = bankcard.field_bindSerial;
        authen.f179545g = bankcard.field_bankcardType;
        authen.f179557v = (com.tencent.mm.pluginsdk.wallet.PayInfo) hVar.f213801c.getParcelable("key_pay_info");
        authen.f179556u = bankcard.field_arrive_type;
        this.f338834b.d(new as4.b(authen, (com.tencent.mm.plugin.wallet_core.model.Orders) hVar.f213801c.getParcelable("key_orders"), false), true);
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 != 0 || i18 != 0 || !(m1Var instanceof as4.b)) {
            return false;
        }
        as4.b bVar = (as4.b) m1Var;
        qr4.h hVar = this.f366127c;
        hVar.f213801c.putString("kreq_token", bVar.C);
        hVar.f213801c.putParcelable("key_authen", bVar.B);
        hVar.f213801c.putBoolean("key_need_verify_sms", !bVar.f13550z);
        com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper realnameGuideHelper = bVar.f214061s;
        if (realnameGuideHelper != null) {
            hVar.f213801c.putParcelable("key_realname_guide_helper", realnameGuideHelper);
        }
        org.json.JSONArray jSONArray = bVar.I;
        if (jSONArray != null) {
            hVar.f213801c.putString("key_fetch_result_show_info", jSONArray.toString());
        }
        android.os.Bundle bundle = hVar.f213801c;
        com.tencent.mm.ui.MMActivity mMActivity = this.f338833a;
        com.tencent.mm.wallet_core.a.d(mMActivity, bundle);
        mMActivity.finish();
        return true;
    }
}
