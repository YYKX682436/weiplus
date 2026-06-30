package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class r1 implements com.tencent.mm.plugin.luckymoney.model.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gb3.i f145569a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f145570b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f145571c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f145572d;

    public r1(com.tencent.mm.plugin.luckymoney.model.w2 w2Var, gb3.i iVar, int i17, int i18, android.widget.ImageView imageView) {
        this.f145569a = iVar;
        this.f145570b = i17;
        this.f145571c = i18;
        this.f145572d = imageView;
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.v2
    public void a(android.graphics.Bitmap bitmap, int i17, java.lang.String str) {
        if (bitmap != null && !bitmap.isRecycled()) {
            ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.luckymoney.model.q1(this, bitmap, i17, str));
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.LuckyMoneyEnvelopeLogic", "load error: %s, %s", java.lang.Integer.valueOf(i17), str);
            gb3.i iVar = this.f145569a;
            if (iVar != null) {
                iVar.onComplete(false);
            }
        }
    }
}
