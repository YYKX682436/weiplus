package com.tencent.mm.plugin.recharge.ui;

/* loaded from: classes9.dex */
public class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f155249d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recharge.ui.RechargeUI f155250e;

    public w0(com.tencent.mm.plugin.recharge.ui.RechargeUI rechargeUI, android.graphics.Bitmap bitmap) {
        this.f155250e = rechargeUI;
        this.f155249d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f155250e.f155128m.setImageBitmap(this.f155249d);
    }
}
