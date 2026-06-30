package ns4;

/* loaded from: classes8.dex */
public final class y0 implements ms4.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinEncashView f339680a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.qb7 f339681b;

    public y0(com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinEncashView weCoinEncashView, r45.qb7 qb7Var) {
        this.f339680a = weCoinEncashView;
        this.f339681b = qb7Var;
    }

    @Override // ms4.b
    public void a(r45.ma5 ma5Var) {
        if (ma5Var == null || ma5Var.f380307e != 3) {
            return;
        }
        this.f339680a.W6(this.f339681b);
    }
}
