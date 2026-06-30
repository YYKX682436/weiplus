package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f180802d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f180803e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.z0 f180804f;

    public y0(com.tencent.mm.plugin.wallet_core.ui.z0 z0Var, java.lang.String str, android.graphics.Bitmap bitmap) {
        this.f180804f = z0Var;
        this.f180802d = str;
        this.f180803e = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBankcardBottomSheetHelper", "dancy test get picture finish, notifyKey:%s, finalIconUrl:%s", this.f180802d, this.f180804f.f180816d);
        if (this.f180804f.f180818f.f180165f.containsKey(this.f180802d)) {
            int intValue = ((java.lang.Integer) this.f180804f.f180818f.f180165f.get(this.f180802d)).intValue();
            if (this.f180804f.f180817e.getItem(intValue) != null) {
                this.f180804f.f180817e.getItem(intValue).setIcon(new android.graphics.drawable.BitmapDrawable(com.tencent.mm.sdk.platformtools.x.S(this.f180803e, com.tencent.mm.sdk.platformtools.x2.f193075e.getDimensionPixelOffset(com.tencent.mm.R.dimen.ae9), com.tencent.mm.sdk.platformtools.x2.f193075e.getDimensionPixelOffset(com.tencent.mm.R.dimen.ae9), true, false)));
                this.f180804f.f180818f.f180166g.j();
            }
        }
    }
}
