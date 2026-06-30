package com.tencent.mm.plugin.wallet_ecard.ui;

/* loaded from: classes9.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.TextView f181039a;

    public c(com.tencent.mm.plugin.wallet_ecard.ui.WalletECardBindCardListUI walletECardBindCardListUI, android.view.View view) {
        this.f181039a = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.d5q);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.d5p);
        android.graphics.drawable.Drawable drawable = imageView.getDrawable();
        f3.b.h(drawable, android.content.res.ColorStateList.valueOf(com.tencent.mm.sdk.platformtools.x2.f193075e.getColor(com.tencent.mm.R.color.f479308vo)));
        imageView.setImageDrawable(drawable);
    }
}
