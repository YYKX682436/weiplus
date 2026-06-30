package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes9.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f178504d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f178505e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.u f178506f;

    public t(com.tencent.mm.plugin.wallet.balance.ui.u uVar, java.lang.String str, android.graphics.Bitmap bitmap) {
        this.f178506f = uVar;
        this.f178504d = str;
        this.f178505e = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        int intValue;
        com.tencent.mm.plugin.wallet.balance.ui.u uVar = this.f178506f;
        java.lang.String str = uVar.f178510d;
        java.lang.String str2 = this.f178504d;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBalanceFetchUI", "dancy test get picture finish, notifyKey:%s, finalIconUrl:%s", str2, str);
        if (!uVar.f178512f.f178523f.P.a() || !uVar.f178512f.f178523f.U.containsKey(str2) || (intValue = ((java.lang.Integer) uVar.f178512f.f178523f.U.get(str2)).intValue()) >= uVar.f178511e.size() || uVar.f178511e.getItem(intValue) == null) {
            return;
        }
        uVar.f178511e.getItem(intValue).setIcon(new android.graphics.drawable.BitmapDrawable(com.tencent.mm.sdk.platformtools.x.S(this.f178505e, uVar.f178512f.f178523f.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.ae9), uVar.f178512f.f178523f.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.ae9), true, false)));
        uVar.f178512f.f178523f.P.b();
    }
}
