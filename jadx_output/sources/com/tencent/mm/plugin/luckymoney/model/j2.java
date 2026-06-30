package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class j2 implements com.tencent.mm.plugin.luckymoney.model.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f145349a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.w1 f145350b;

    public j2(com.tencent.mm.plugin.luckymoney.model.w2 w2Var, android.widget.ImageView imageView, com.tencent.mm.sdk.platformtools.w1 w1Var) {
        this.f145349a = imageView;
        this.f145350b = w1Var;
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.v2
    public void a(android.graphics.Bitmap bitmap, int i17, java.lang.String str) {
        if (bitmap == null || bitmap.isRecycled()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LuckyMoneyEnvelopeLogic", "load error: %s, %s", java.lang.Integer.valueOf(i17), str);
            return;
        }
        com.tencent.mm.plugin.luckymoney.model.i2 i2Var = new com.tencent.mm.plugin.luckymoney.model.i2(this, str, bitmap);
        com.tencent.mm.sdk.platformtools.w1 w1Var = this.f145350b;
        if (w1Var != null) {
            ((com.tencent.mm.sdk.platformtools.c4) w1Var).a(i2Var);
        } else {
            com.tencent.mm.plugin.luckymoney.model.w2.tj(i2Var);
        }
    }
}
