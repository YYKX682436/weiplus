package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class w1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f145672d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f145673e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f145674f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.x1 f145675g;

    public w1(com.tencent.mm.plugin.luckymoney.model.x1 x1Var, android.graphics.Bitmap bitmap, int i17, java.lang.String str) {
        this.f145675g = x1Var;
        this.f145672d = bitmap;
        this.f145673e = i17;
        this.f145674f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Bitmap bitmap;
        com.tencent.mm.plugin.luckymoney.model.x1 x1Var = this.f145675g;
        com.tencent.mm.plugin.luckymoney.model.w2 w2Var = x1Var.f145689f;
        android.graphics.Bitmap bitmap2 = this.f145672d;
        int i17 = x1Var.f145684a;
        int i18 = x1Var.f145685b;
        boolean z17 = x1Var.f145686c;
        pq5.i iVar = com.tencent.mm.plugin.luckymoney.model.w2.f145676d;
        w2Var.getClass();
        if (z17) {
            i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 6);
        }
        int ceil = (int) java.lang.Math.ceil(bitmap2.getWidth() * (i17 / bitmap2.getHeight()));
        if (ceil <= 0 || i17 <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "createChattingWidgtBubble error，wantedBitmapWidth：%s，targetHeight：%s", java.lang.Integer.valueOf(ceil), java.lang.Integer.valueOf(i17));
            bitmap = null;
        } else {
            bitmap = android.graphics.Bitmap.createScaledBitmap(bitmap2, ceil, i17, true);
        }
        com.tencent.mm.plugin.luckymoney.model.v1 v1Var = new com.tencent.mm.plugin.luckymoney.model.v1(this, bitmap);
        com.tencent.mm.sdk.platformtools.w1 w1Var = this.f145675g.f145688e;
        if (w1Var != null) {
            ((com.tencent.mm.sdk.platformtools.c4) w1Var).a(v1Var);
        } else {
            ((ku5.t0) ku5.t0.f312615d).B(v1Var);
        }
    }
}
