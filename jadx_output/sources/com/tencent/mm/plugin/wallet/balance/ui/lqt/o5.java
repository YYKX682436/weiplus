package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class o5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f178305d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f178306e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.p5 f178307f;

    public o5(com.tencent.mm.plugin.wallet.balance.ui.lqt.p5 p5Var, java.lang.String str, android.graphics.Bitmap bitmap) {
        this.f178307f = p5Var;
        this.f178305d = str;
        this.f178306e = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        int intValue;
        com.tencent.mm.plugin.wallet.balance.ui.lqt.p5 p5Var = this.f178307f;
        java.lang.String str = p5Var.f178324d;
        java.lang.String str2 = this.f178305d;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtSaveFetchUI", "dancy test get picture finish, notifyKey:%s, finalIconUrl:%s", str2, str);
        if (!p5Var.f178326f.f178367d.a() || !p5Var.f178326f.f178368e.K1.containsKey(str2) || (intValue = ((java.lang.Integer) p5Var.f178326f.f178368e.K1.get(str2)).intValue()) >= p5Var.f178325e.size() || p5Var.f178325e.getItem(intValue) == null) {
            return;
        }
        p5Var.f178325e.getItem(intValue).setIcon(new android.graphics.drawable.BitmapDrawable(com.tencent.mm.sdk.platformtools.x.S(this.f178306e, p5Var.f178326f.f178368e.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.ae9), p5Var.f178326f.f178368e.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.ae9), true, false)));
        p5Var.f178326f.f178367d.b();
    }
}
