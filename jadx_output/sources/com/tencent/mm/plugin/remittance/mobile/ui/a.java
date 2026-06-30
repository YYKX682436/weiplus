package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes8.dex */
public class a implements k70.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f156637a;

    public a(com.tencent.mm.plugin.remittance.mobile.ui.BankMobileRemitChooseMMHeaderPreference bankMobileRemitChooseMMHeaderPreference, android.widget.ImageView imageView) {
        this.f156637a = imageView;
    }

    @Override // k70.f0
    public void a(java.lang.String str, android.graphics.Bitmap bitmap, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.BankMobileRemitChooseMMHeaderPreference", "icon url: %s", str);
        this.f156637a.setImageBitmap(bitmap);
    }
}
