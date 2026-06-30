package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes9.dex */
public class w1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f156738d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.mobile.ui.x1 f156739e;

    public w1(com.tencent.mm.plugin.remittance.mobile.ui.x1 x1Var, android.graphics.Bitmap bitmap) {
        this.f156739e = x1Var;
        this.f156738d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.remittance.mobile.ui.x1 x1Var = this.f156739e;
        android.graphics.Bitmap bitmap = this.f156738d;
        if (bitmap != null) {
            x1Var.f156741a.D.setImageBitmap(com.tencent.mm.sdk.platformtools.x.s0(bitmap, false, bitmap.getWidth() * 0.1f));
        } else {
            x1Var.f156741a.D.setImageResource(com.tencent.mm.R.drawable.bhm);
        }
    }
}
