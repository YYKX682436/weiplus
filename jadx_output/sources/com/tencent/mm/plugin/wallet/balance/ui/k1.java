package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes9.dex */
public class k1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f177912d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f177913e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.l1 f177914f;

    public k1(com.tencent.mm.plugin.wallet.balance.ui.l1 l1Var, java.lang.String str, android.graphics.Bitmap bitmap) {
        this.f177914f = l1Var;
        this.f177912d = str;
        this.f177913e = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wallet.balance.ui.l1 l1Var = this.f177914f;
        java.lang.String str = l1Var.f177917d;
        java.lang.String str2 = this.f177912d;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalanceSaveUI", "dancy test get picture finish, notifyKey:%s, finalIconUrl:%s", str2, str);
        if (l1Var.f177919f.f178483e.f177850z.containsKey(str2)) {
            int intValue = ((java.lang.Integer) l1Var.f177919f.f178483e.f177850z.get(str2)).intValue();
            if (l1Var.f177918e.getItem(intValue) != null) {
                l1Var.f177918e.getItem(intValue).setIcon(new android.graphics.drawable.BitmapDrawable(com.tencent.mm.sdk.platformtools.x.S(this.f177913e, l1Var.f177919f.f178483e.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.ae9), l1Var.f177919f.f178483e.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.ae9), true, false)));
                l1Var.f177919f.f178483e.f177844t.b();
            }
        }
    }
}
