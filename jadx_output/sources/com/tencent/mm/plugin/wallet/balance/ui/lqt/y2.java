package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class y2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f178448d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f178449e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.z2 f178450f;

    public y2(com.tencent.mm.plugin.wallet.balance.ui.lqt.z2 z2Var, java.lang.String str, android.graphics.Bitmap bitmap) {
        this.f178450f = z2Var;
        this.f178448d = str;
        this.f178449e = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wallet.balance.ui.lqt.z2 z2Var = this.f178450f;
        java.lang.String str = z2Var.f178465d;
        java.lang.String str2 = this.f178448d;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletLqtPlanAddUI", "dancy test get picture finish, notifyKey:%s, finalIconUrl:%s", str2, str);
        if (z2Var.f178467f.f178104e.f177991p0.containsKey(str2)) {
            int intValue = ((java.lang.Integer) z2Var.f178467f.f178104e.f177991p0.get(str2)).intValue();
            if (z2Var.f178466e.getItem(intValue) != null) {
                z2Var.f178466e.getItem(intValue).setIcon(new android.graphics.drawable.BitmapDrawable(com.tencent.mm.sdk.platformtools.x.S(this.f178449e, z2Var.f178467f.f178104e.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.ae9), z2Var.f178467f.f178104e.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.ae9), true, false)));
                z2Var.f178467f.f178104e.Z.b();
            }
        }
    }
}
