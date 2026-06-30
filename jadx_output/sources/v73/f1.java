package v73;

/* loaded from: classes9.dex */
public class f1 implements com.tencent.mm.wallet_core.ui.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.tg5 f433689a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.honey_pay.ui.HoneyPayReceiveCardUI f433690b;

    public f1(com.tencent.mm.plugin.honey_pay.ui.HoneyPayReceiveCardUI honeyPayReceiveCardUI, r45.tg5 tg5Var) {
        this.f433690b = honeyPayReceiveCardUI;
        this.f433689a = tg5Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z
    public void onClick(android.view.View view) {
        com.tencent.mm.wallet_core.ui.r1.V(this.f433690b, this.f433689a.f386413o.f390557f, true);
    }
}
