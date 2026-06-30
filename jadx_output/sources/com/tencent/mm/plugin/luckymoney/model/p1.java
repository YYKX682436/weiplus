package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class p1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f145537d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.q1 f145538e;

    public p1(com.tencent.mm.plugin.luckymoney.model.q1 q1Var, android.graphics.Bitmap bitmap) {
        this.f145538e = q1Var;
        this.f145537d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.luckymoney.model.q1 q1Var = this.f145538e;
        int intValue = ((java.lang.Integer) q1Var.f145559g.f145572d.getTag(com.tencent.mm.R.id.j19)).intValue();
        android.graphics.Bitmap bitmap = this.f145537d;
        if (intValue <= 0 || intValue != q1Var.f145557e) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LuckyMoneyEnvelopeLogic", "pss subtype: %s, %s", java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(q1Var.f145557e));
        } else {
            q1Var.f145559g.f145572d.setImageBitmap(bitmap);
            gb3.i iVar = q1Var.f145559g.f145569a;
            if (iVar != null) {
                iVar.onComplete(true);
            }
        }
        java.lang.String str = (java.lang.String) q1Var.f145559g.f145572d.getTag(com.tencent.mm.R.id.j1c);
        if (com.tencent.mm.sdk.platformtools.t8.K0(q1Var.f145558f) || !q1Var.f145558f.equals(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LuckyMoneyEnvelopeLogic", "pss url: %s, %s", str, q1Var.f145558f);
            return;
        }
        q1Var.f145559g.f145572d.setImageBitmap(bitmap);
        gb3.i iVar2 = q1Var.f145559g.f145569a;
        if (iVar2 != null) {
            iVar2.onComplete(true);
        }
    }
}
