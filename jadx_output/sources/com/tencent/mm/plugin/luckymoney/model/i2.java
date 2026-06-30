package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes8.dex */
public class i2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f145331d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f145332e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.j2 f145333f;

    public i2(com.tencent.mm.plugin.luckymoney.model.j2 j2Var, java.lang.String str, android.graphics.Bitmap bitmap) {
        this.f145333f = j2Var;
        this.f145331d = str;
        this.f145332e = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.luckymoney.model.j2 j2Var = this.f145333f;
        java.lang.String str = (java.lang.String) j2Var.f145349a.getTag(com.tencent.mm.R.id.j1c);
        java.lang.String str2 = this.f145331d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2) || !str2.equals(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LuckyMoneyEnvelopeLogic", "pss url: %s, %s", str, str2);
        } else {
            j2Var.f145349a.setImageBitmap(this.f145332e);
        }
    }
}
