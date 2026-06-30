package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class v1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f145661d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.w1 f145662e;

    public v1(com.tencent.mm.plugin.luckymoney.model.w1 w1Var, android.graphics.Bitmap bitmap) {
        this.f145662e = w1Var;
        this.f145661d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.luckymoney.model.w1 w1Var = this.f145662e;
        int intValue = ((java.lang.Integer) w1Var.f145675g.f145687d.getTag(com.tencent.mm.R.id.j19)).intValue();
        android.graphics.Bitmap bitmap = this.f145661d;
        if (intValue <= 0 || intValue != w1Var.f145673e) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LuckyMoneyEnvelopeLogic", "subtype，local：%s、callback：%s", java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(w1Var.f145673e));
        } else {
            w1Var.f145675g.f145687d.setImageBitmap(bitmap);
        }
        java.lang.String str = (java.lang.String) w1Var.f145675g.f145687d.getTag(com.tencent.mm.R.id.j1c);
        if (com.tencent.mm.sdk.platformtools.t8.K0(w1Var.f145674f) || !w1Var.f145674f.equals(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LuckyMoneyEnvelopeLogic", "url, local：%s,  callback：%s", str, w1Var.f145674f);
        } else {
            w1Var.f145675g.f145687d.setImageBitmap(bitmap);
        }
    }
}
