package xb3;

/* loaded from: classes9.dex */
public class k extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fo3.m f452906d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.u43 f452907e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xb3.m f452908f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(xb3.m mVar, fo3.m mVar2, r45.u43 u43Var) {
        super(false);
        this.f452908f = mVar;
        this.f452906d = mVar2;
        this.f452907e = u43Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyHKReceiveUI", "open btn click!");
        fo3.m mVar = this.f452906d;
        mVar.onClick(view);
        if (mVar.f264915i) {
            w04.l.INSTANCE.ac(540999719, mVar.f264913g, true);
        }
        xb3.m mVar2 = this.f452908f;
        mVar2.f452910a.f145141o.setClickable(false);
        com.tencent.mm.plugin.luckymoney.hk.ui.LuckyMoneyHKReceiveUI luckyMoneyHKReceiveUI = mVar2.f452910a;
        luckyMoneyHKReceiveUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyHKReceiveUI", "do open hb");
        new wb3.b(luckyMoneyHKReceiveUI.f145150x, luckyMoneyHKReceiveUI.f145149w, luckyMoneyHKReceiveUI.getIntent().getStringExtra("key_username"), 1, luckyMoneyHKReceiveUI.f145151y, this.f452907e.f387018q).l().h(new xb3.h(luckyMoneyHKReceiveUI)).f(luckyMoneyHKReceiveUI);
        luckyMoneyHKReceiveUI.f145141o.setVisibility(8);
        com.tencent.mm.plugin.luckymoney.model.m5.G(luckyMoneyHKReceiveUI.f145142p, 0);
    }
}
