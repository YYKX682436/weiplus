package com.tencent.mm.plugin.wallet.balance.ui.lqt;

/* loaded from: classes9.dex */
public class k3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f178236d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet.balance.ui.lqt.l3 f178237e;

    public k3(com.tencent.mm.plugin.wallet.balance.ui.lqt.l3 l3Var, android.graphics.Bitmap bitmap) {
        this.f178237e = l3Var;
        this.f178236d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.wallet.balance.ui.lqt.l3 l3Var = this.f178237e;
        if (l3Var.f178257d == null || l3Var.f178258e.f177989o.getTag() == null || !l3Var.f178258e.f177989o.getTag().equals(l3Var.f178257d.field_bindSerial)) {
            return;
        }
        l3Var.f178258e.f177989o.setImageBitmap(this.f178236d);
    }
}
