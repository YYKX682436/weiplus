package qr4;

/* loaded from: classes9.dex */
public class f extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qr4.h f366130c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(qr4.h hVar, com.tencent.mm.ui.MMActivity mMActivity, np5.b0 b0Var) {
        super(mMActivity, b0Var);
        this.f366130c = hVar;
    }

    @Override // np5.g
    public java.lang.CharSequence a(int i17) {
        com.tencent.mm.plugin.wallet_core.model.Orders orders;
        com.tencent.mm.ui.MMActivity mMActivity = this.f338833a;
        if (i17 == 0) {
            return mMActivity.getString(com.tencent.mm.R.string.kfc);
        }
        qr4.h hVar = this.f366130c;
        if (i17 == 1) {
            com.tencent.mm.plugin.wallet_core.model.Orders orders2 = (com.tencent.mm.plugin.wallet_core.model.Orders) hVar.f213801c.getParcelable("key_orders");
            return (orders2 == null || com.tencent.mm.sdk.platformtools.t8.K0(orders2.F)) ? mMActivity.getString(com.tencent.mm.R.string.kfb) : orders2.F;
        }
        if (i17 == 2 && (orders = (com.tencent.mm.plugin.wallet_core.model.Orders) hVar.f213801c.getParcelable("key_orders")) != null && orders.E > 0) {
            return new java.text.SimpleDateFormat(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS).format(new java.util.Date(orders.E));
        }
        return null;
    }

    @Override // np5.g
    public boolean c(java.lang.Object... objArr) {
        qr4.h hVar = this.f366130c;
        com.tencent.mm.plugin.wallet_core.model.Orders orders = (com.tencent.mm.plugin.wallet_core.model.Orders) hVar.f213801c.getParcelable("key_orders");
        ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().f13999h.O2 -= orders.f179678h;
        hVar.f213801c.putInt("key_balance_result_logo", com.tencent.mm.R.raw.remittance_wait);
        return false;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        return false;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        return false;
    }
}
