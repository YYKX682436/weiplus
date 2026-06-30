package com.tencent.mm.plugin.wallet_core.utils;

/* loaded from: classes9.dex */
public class l implements y60.e {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.Bankcard f180914d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.ref.WeakReference f180915e;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f180919i;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f180916f = null;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.ref.WeakReference f180917g = null;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.ref.WeakReference f180918h = null;

    /* renamed from: m, reason: collision with root package name */
    public boolean f180920m = false;

    @Override // y60.e
    public void K4(java.lang.String str, android.graphics.Bitmap bitmap) {
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard;
        if (android.text.TextUtils.isEmpty(this.f180919i)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BankcardLogoHelper", "mBankcardLogoUrl is empty");
            return;
        }
        java.lang.ref.WeakReference weakReference = this.f180915e;
        if (weakReference != null) {
            android.widget.ImageView imageView = (android.widget.ImageView) weakReference.get();
            if (imageView != null) {
                imageView.getTag();
            }
            if (imageView == null || str == null || !str.equals(this.f180919i)) {
                return;
            }
            if (!this.f180920m) {
                imageView.post(new com.tencent.mm.plugin.wallet_core.utils.k(this, imageView, bitmap));
                imageView.setTag(com.tencent.mm.R.id.pbo, null);
            } else {
                if (imageView.getTag(com.tencent.mm.R.id.pbo) == null || (bankcard = this.f180914d) == null || bankcard.field_bankcardType == null) {
                    return;
                }
                java.lang.String str2 = (java.lang.String) imageView.getTag(com.tencent.mm.R.id.pbo);
                if (com.tencent.mm.sdk.platformtools.t8.K0(str2) || !str2.equals(this.f180914d.field_bankcardType)) {
                    return;
                }
                imageView.post(new com.tencent.mm.plugin.wallet_core.utils.j(this, imageView, bitmap));
                imageView.setTag(com.tencent.mm.R.id.pbo, null);
            }
        }
    }
}
