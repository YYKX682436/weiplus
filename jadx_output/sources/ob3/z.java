package ob3;

/* loaded from: classes9.dex */
public class z implements mb3.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ob3.a0 f344093a;

    public z(ob3.a0 a0Var) {
        this.f344093a = a0Var;
    }

    @Override // mb3.d
    public void a(int i17, android.content.Intent intent) {
        android.content.Intent intent2 = new android.content.Intent();
        ob3.a0 a0Var = this.f344093a;
        android.content.Intent putExtra = intent2.putExtra("sendId", a0Var.f344045f.f384226e);
        if (i17 == -1) {
            putExtra.putExtra("result_share_msg", true);
        } else {
            putExtra.putExtra("result_share_msg", false);
        }
        a0Var.f344046g = false;
        java.lang.Object obj = a0Var.f344043d;
        if (obj == null) {
            return;
        }
        com.tencent.mm.plugin.luckymoney.appbrand.ui.WxaLuckyMoneyBaseUI wxaLuckyMoneyBaseUI = (com.tencent.mm.plugin.luckymoney.appbrand.ui.WxaLuckyMoneyBaseUI) obj;
        wxaLuckyMoneyBaseUI.setResult(-1, putExtra);
        wxaLuckyMoneyBaseUI.finish();
    }
}
