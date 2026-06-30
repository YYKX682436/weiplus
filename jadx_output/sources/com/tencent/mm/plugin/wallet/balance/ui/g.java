package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes9.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f177891d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.h f177892e;

    public g(com.tencent.mm.plugin.wallet.balance.ui.h hVar, android.graphics.Bitmap bitmap) {
        this.f177892e = hVar;
        this.f177891d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.ImageView imageView;
        com.tencent.mm.plugin.wallet.balance.ui.h hVar = this.f177892e;
        if (hVar.f177896e.f177783e == null || (imageView = hVar.f177895d) == null || imageView.getTag() == null || !hVar.f177895d.getTag().equals(hVar.f177896e.f177783e.field_bindSerial)) {
            return;
        }
        hVar.f177895d.setImageBitmap(this.f177891d);
    }
}
