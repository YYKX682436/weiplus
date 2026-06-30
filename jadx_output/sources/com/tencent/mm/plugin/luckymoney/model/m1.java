package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class m1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f145443d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.n1 f145444e;

    public m1(com.tencent.mm.plugin.luckymoney.model.n1 n1Var, android.graphics.Bitmap bitmap) {
        this.f145444e = n1Var;
        this.f145443d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.luckymoney.model.n1 n1Var = this.f145444e;
        int intValue = ((java.lang.Integer) n1Var.f145458g.f145491e.getTag(com.tencent.mm.R.id.j19)).intValue();
        android.graphics.Bitmap bitmap = this.f145443d;
        if (intValue <= 0 || intValue != n1Var.f145456e) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LuckyMoneyEnvelopeLogic", "subtype，local：%s、callback：%s", java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(n1Var.f145456e));
        } else {
            n1Var.f145458g.f145491e.setImageBitmap(bitmap);
            gb3.i iVar = n1Var.f145458g.f145487a;
            if (iVar != null) {
                iVar.onComplete(true);
            }
            com.tencent.mm.plugin.luckymoney.model.o1 o1Var = n1Var.f145458g;
            com.tencent.mm.plugin.luckymoney.model.w2.wi(o1Var.f145493g, o1Var.f145491e, n1Var.f145457f, 2, n1Var.f145456e, o1Var.f145492f);
        }
        java.lang.String str = (java.lang.String) n1Var.f145458g.f145491e.getTag(com.tencent.mm.R.id.j1c);
        if (com.tencent.mm.sdk.platformtools.t8.K0(n1Var.f145457f) || !n1Var.f145457f.equals(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LuckyMoneyEnvelopeLogic", "url, local：%s,  callback：%s", str, n1Var.f145457f);
            return;
        }
        n1Var.f145458g.f145491e.setImageBitmap(bitmap);
        gb3.i iVar2 = n1Var.f145458g.f145487a;
        if (iVar2 != null) {
            iVar2.onComplete(true);
        }
        com.tencent.mm.plugin.luckymoney.model.o1 o1Var2 = n1Var.f145458g;
        com.tencent.mm.plugin.luckymoney.model.w2.wi(o1Var2.f145493g, o1Var2.f145491e, n1Var.f145457f, 2, n1Var.f145456e, o1Var2.f145492f);
    }
}
