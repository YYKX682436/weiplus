package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class l2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f145408d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f145409e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f145410f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.m2 f145411g;

    public l2(com.tencent.mm.plugin.luckymoney.model.m2 m2Var, android.graphics.Bitmap bitmap, int i17, java.lang.String str) {
        this.f145411g = m2Var;
        this.f145408d = bitmap;
        this.f145409e = i17;
        this.f145410f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f145410f;
        com.tencent.mm.plugin.luckymoney.model.m2 m2Var = this.f145411g;
        android.graphics.Bitmap bitmap = this.f145408d;
        if (bitmap == null || bitmap.isRecycled()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LuckyMoneyEnvelopeLogic", "load error: %s, %s", java.lang.Integer.valueOf(this.f145409e), str);
            gb3.i iVar = m2Var.f145445a;
            if (iVar != null) {
                iVar.onComplete(false);
                return;
            }
            return;
        }
        java.lang.String str2 = (java.lang.String) m2Var.f145446b.getTag(com.tencent.mm.R.id.j1c);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || !str.equals(str2)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LuckyMoneyEnvelopeLogic", "pss url: %s, %s", str2, str);
        } else {
            m2Var.f145446b.setImageBitmap(bitmap);
        }
        gb3.i iVar2 = m2Var.f145445a;
        if (iVar2 != null) {
            iVar2.onComplete(true);
        }
        if (m2Var.f145446b.getId() == com.tencent.mm.R.id.nni) {
            com.tencent.mm.plugin.luckymoney.model.w2.wi(m2Var.f145448d, m2Var.f145446b, this.f145410f, 3, this.f145409e, m2Var.f145447c);
        }
    }
}
