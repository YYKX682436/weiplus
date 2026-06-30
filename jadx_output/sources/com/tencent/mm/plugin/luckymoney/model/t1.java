package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class t1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f145633d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f145634e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f145635f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.u1 f145636g;

    public t1(com.tencent.mm.plugin.luckymoney.model.u1 u1Var, android.graphics.Bitmap bitmap, int i17, java.lang.String str) {
        this.f145636g = u1Var;
        this.f145633d = bitmap;
        this.f145634e = i17;
        this.f145635f = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Bitmap bitmap;
        com.tencent.mm.plugin.luckymoney.model.u1 u1Var = this.f145636g;
        com.tencent.mm.plugin.luckymoney.model.w2 w2Var = u1Var.f145650g;
        android.graphics.Bitmap bitmap2 = this.f145633d;
        int i17 = u1Var.f145644a;
        int i18 = u1Var.f145645b;
        boolean z17 = u1Var.f145646c;
        pq5.i iVar = com.tencent.mm.plugin.luckymoney.model.w2.f145676d;
        w2Var.getClass();
        int b17 = i18 - i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, z17 ? 8 : 2);
        int ceil = (int) java.lang.Math.ceil(bitmap2.getWidth() * (i17 / bitmap2.getHeight()));
        bitmap2.getWidth();
        bitmap2.getHeight();
        if (ceil <= 0 || i17 <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopeLogic", "createChattingBubble error，wantedBitmapWidth：%s，targetHeight：%s", java.lang.Integer.valueOf(ceil), java.lang.Integer.valueOf(i17));
            bitmap = null;
        } else {
            android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(bitmap2, ceil, i17, true);
            int i19 = ceil - b17;
            if (i19 < 0) {
                i19 = 0;
            }
            bitmap = com.tencent.mm.sdk.platformtools.x.p(com.tencent.mm.sdk.platformtools.x.a0(createScaledBitmap, new android.graphics.Rect(i19, 0, ceil, i17), false), z17 ? com.tencent.mm.R.drawable.bzs : com.tencent.mm.R.drawable.bzy);
        }
        com.tencent.mm.plugin.luckymoney.model.s1 s1Var = new com.tencent.mm.plugin.luckymoney.model.s1(this, bitmap);
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f145636g.f145649f;
        if (n3Var != null) {
            n3Var.post(s1Var);
        } else {
            ((ku5.t0) ku5.t0.f312615d).B(s1Var);
        }
    }
}
