package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class s1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f145598d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.t1 f145599e;

    public s1(com.tencent.mm.plugin.luckymoney.model.t1 t1Var, android.graphics.Bitmap bitmap) {
        this.f145599e = t1Var;
        this.f145598d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.luckymoney.model.t1 t1Var = this.f145599e;
        int intValue = ((java.lang.Integer) t1Var.f145636g.f145647d.getTag(com.tencent.mm.R.id.j19)).intValue();
        android.graphics.Bitmap bitmap = this.f145598d;
        if (intValue <= 0 || intValue != t1Var.f145634e) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LuckyMoneyEnvelopeLogic", "subtype，local：%s、callback：%s", java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(t1Var.f145634e));
        } else {
            t1Var.f145636g.f145647d.setImageBitmap(bitmap);
            com.tencent.mm.plugin.luckymoney.model.u1 u1Var = t1Var.f145636g;
            com.tencent.mm.plugin.luckymoney.model.w2.wi(u1Var.f145650g, u1Var.f145647d, t1Var.f145635f, 1, t1Var.f145634e, u1Var.f145648e);
        }
        java.lang.String str = (java.lang.String) t1Var.f145636g.f145647d.getTag(com.tencent.mm.R.id.j1c);
        if (com.tencent.mm.sdk.platformtools.t8.K0(t1Var.f145635f) || !t1Var.f145635f.equals(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LuckyMoneyEnvelopeLogic", "url, local：%s,  callback：%s", str, t1Var.f145635f);
            return;
        }
        t1Var.f145636g.f145647d.setImageBitmap(bitmap);
        com.tencent.mm.plugin.luckymoney.model.u1 u1Var2 = t1Var.f145636g;
        com.tencent.mm.plugin.luckymoney.model.w2.wi(u1Var2.f145650g, u1Var2.f145647d, t1Var.f145635f, 1, t1Var.f145634e, u1Var2.f145648e);
    }
}
