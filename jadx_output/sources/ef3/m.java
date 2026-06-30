package ef3;

/* loaded from: classes9.dex */
public class m implements com.tencent.mm.wallet_core.ui.p1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f252422a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.wh5 f252423b;

    public m(int i17, r45.wh5 wh5Var) {
        this.f252422a = i17;
        this.f252423b = wh5Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.p1
    public void a(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.QueryWeChatWalletManager", "get from push done: %s", obj);
        long longValue = obj instanceof java.lang.Long ? ((java.lang.Long) obj).longValue() : 0L;
        new ef3.c(longValue, this.f252423b).l().q(new ef3.o()).h(new ef3.n(this.f252422a, longValue));
    }
}
