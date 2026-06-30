package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class x1 implements com.tencent.mm.plugin.luckymoney.model.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f145684a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f145685b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f145686c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f145687d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.w1 f145688e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.w2 f145689f;

    public x1(com.tencent.mm.plugin.luckymoney.model.w2 w2Var, int i17, int i18, boolean z17, android.widget.ImageView imageView, com.tencent.mm.sdk.platformtools.w1 w1Var) {
        this.f145689f = w2Var;
        this.f145684a = i17;
        this.f145685b = i18;
        this.f145686c = z17;
        this.f145687d = imageView;
        this.f145688e = w1Var;
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.v2
    public void a(android.graphics.Bitmap bitmap, int i17, java.lang.String str) {
        if (bitmap == null || bitmap.isRecycled()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LuckyMoneyEnvelopeLogic", "load error: %s, %s", java.lang.Integer.valueOf(i17), str);
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.luckymoney.model.w1(this, bitmap, i17, str));
    }
}
