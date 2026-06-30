package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes9.dex */
public class t1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f178508d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.u1 f178509e;

    public t1(com.tencent.mm.plugin.wallet.balance.ui.u1 u1Var, android.graphics.Bitmap bitmap) {
        this.f178509e = u1Var;
        this.f178508d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.ImageView imageView;
        com.tencent.mm.plugin.wallet.balance.ui.u1 u1Var = this.f178509e;
        if (u1Var.f178516e.f177833f == null || (imageView = u1Var.f178515d) == null || imageView.getTag() == null || !u1Var.f178515d.getTag().equals(u1Var.f178516e.f177833f.field_bindSerial)) {
            return;
        }
        u1Var.f178515d.setImageBitmap(this.f178508d);
    }
}
