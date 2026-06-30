package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class t2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f152721d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f152722e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.offline.ui.u2 f152723f;

    public t2(com.tencent.mm.plugin.offline.ui.u2 u2Var, java.lang.String str, android.graphics.Bitmap bitmap) {
        this.f152723f = u2Var;
        this.f152721d = str;
        this.f152722e = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.offline.ui.u2 u2Var = this.f152723f;
        java.lang.String str = u2Var.f152729d;
        java.lang.String str2 = this.f152721d;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "dancy test get picture finish, notifyKey:%s, finalIconUrl:%s", str2, str);
        if (u2Var.f152731f.f152761e.f152539v2.containsKey(str2)) {
            int intValue = ((java.lang.Integer) u2Var.f152731f.f152761e.f152539v2.get(str2)).intValue();
            if (u2Var.f152730e.getItem(intValue) != null) {
                u2Var.f152730e.getItem(intValue).setIcon(new android.graphics.drawable.BitmapDrawable(com.tencent.mm.sdk.platformtools.x.S(this.f152722e, u2Var.f152731f.f152761e.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.ae9), u2Var.f152731f.f152761e.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.ae9), true, false)));
                if (u2Var.f152731f.f152761e.isFinishing() || u2Var.f152731f.f152761e.isDestroyed()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletOfflineCoinPurseUI", "WalletOfflineCoinPurseUI.this.isFinishing() || WalletOfflineCoinPurseUI.this.isDestroyed()：%s，%s", java.lang.Boolean.valueOf(u2Var.f152731f.f152761e.isFinishing()), java.lang.Boolean.valueOf(u2Var.f152731f.f152761e.isDestroyed()));
                } else {
                    u2Var.f152731f.f152761e.H1.b();
                }
            }
        }
    }
}
