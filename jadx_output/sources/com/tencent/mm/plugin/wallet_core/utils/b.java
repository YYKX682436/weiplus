package com.tencent.mm.plugin.wallet_core.utils;

/* loaded from: classes9.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.utils.l f180850d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f180851e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f180852f;

    public b(com.tencent.mm.plugin.wallet_core.utils.m mVar, com.tencent.mm.plugin.wallet_core.utils.l lVar, android.widget.ImageView imageView, android.graphics.Bitmap bitmap) {
        this.f180850d = lVar;
        this.f180851e = imageView;
        this.f180852f = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard = this.f180850d.f180914d;
        android.widget.ImageView imageView = this.f180851e;
        java.lang.String str = (java.lang.String) imageView.getTag(com.tencent.mm.R.id.pbo);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || ((c01.z1.I() || !str.equals(bankcard.field_bankcardType)) && !(c01.z1.I() && str.equals(bankcard.field_bankName)))) {
            java.lang.String str2 = bankcard.field_bankcardType;
        } else {
            imageView.setImageBitmap(this.f180852f);
        }
    }
}
