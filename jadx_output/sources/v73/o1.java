package v73;

/* loaded from: classes9.dex */
public class o1 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.av3 f433721d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v73.p1 f433722e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(v73.p1 p1Var, r45.av3 av3Var) {
        super(false);
        this.f433722e = p1Var;
        this.f433721d = av3Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mars.xlog.Log.i("MicroMsg.HoneyPaySelectCardTypeUI", "card type clicked");
        v73.p1 p1Var = this.f433722e;
        com.tencent.mm.plugin.honey_pay.ui.HoneyPaySelectCardTypeUI honeyPaySelectCardTypeUI = p1Var.f433731g;
        int i17 = com.tencent.mm.plugin.honey_pay.ui.HoneyPaySelectCardTypeUI.f142383i;
        honeyPaySelectCardTypeUI.getClass();
        com.tencent.mm.plugin.honey_pay.ui.HoneyPaySelectCardTypeUI honeyPaySelectCardTypeUI2 = p1Var.f433731g;
        honeyPaySelectCardTypeUI2.f142386h = this.f433721d.f370275h;
        honeyPaySelectCardTypeUI2.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.HoneyPaySelectCardTypeUI", "go to select contact");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("list_attr", com.tencent.mm.ui.contact.i5.g(16, 1, 2, 4, 16384));
        intent.putExtra("block_contact", c01.z1.r());
        intent.putExtra("titile", honeyPaySelectCardTypeUI2.getString(com.tencent.mm.R.string.fxp));
        j45.l.v(honeyPaySelectCardTypeUI2, ".ui.contact.SelectContactUI", intent, 1);
    }
}
