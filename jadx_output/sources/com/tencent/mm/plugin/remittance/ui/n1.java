package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class n1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI f157827d;

    public n1(com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI remittanceBaseUI) {
        this.f157827d = remittanceBaseUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        kv.c0 c0Var = (kv.c0) i95.n0.c(kv.c0.class);
        com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI remittanceBaseUI = this.f157827d;
        java.lang.String str = remittanceBaseUI.f157135f;
        ((com.tencent.mm.feature.avatar.w) c0Var).getClass();
        android.graphics.Bitmap a17 = com.tencent.mm.modelavatar.g.a(str);
        if (a17 == null) {
            remittanceBaseUI.f157148s.setImageResource(com.tencent.mm.R.drawable.bhm);
        } else {
            remittanceBaseUI.f157148s.setImageBitmap(a17);
        }
    }
}
