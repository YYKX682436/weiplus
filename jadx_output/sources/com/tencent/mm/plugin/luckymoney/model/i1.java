package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class i1 implements com.tencent.mm.plugin.luckymoney.model.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f145330a;

    public i1(com.tencent.mm.plugin.luckymoney.model.w2 w2Var, android.widget.ImageView imageView) {
        this.f145330a = imageView;
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.v2
    public void a(android.graphics.Bitmap bitmap, int i17, java.lang.String str) {
        if (bitmap == null || bitmap.isRecycled()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LuckyMoneyEnvelopeLogic", "load error: %s, %s", java.lang.Integer.valueOf(i17), str);
        } else {
            com.tencent.mm.plugin.luckymoney.model.w2.tj(new com.tencent.mm.plugin.luckymoney.model.h1(this, bitmap));
        }
    }
}
