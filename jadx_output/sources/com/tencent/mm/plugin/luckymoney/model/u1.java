package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class u1 implements com.tencent.mm.plugin.luckymoney.model.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f145644a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f145645b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f145646c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f145647d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f145648e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.n3 f145649f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.w2 f145650g;

    public u1(com.tencent.mm.plugin.luckymoney.model.w2 w2Var, int i17, int i18, boolean z17, android.widget.ImageView imageView, long j17, com.tencent.mm.sdk.platformtools.n3 n3Var) {
        this.f145650g = w2Var;
        this.f145644a = i17;
        this.f145645b = i18;
        this.f145646c = z17;
        this.f145647d = imageView;
        this.f145648e = j17;
        this.f145649f = n3Var;
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.v2
    public void a(android.graphics.Bitmap bitmap, int i17, java.lang.String str) {
        if (bitmap == null || bitmap.isRecycled()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LuckyMoneyEnvelopeLogic", "load error: %s, %s", java.lang.Integer.valueOf(i17), str);
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.luckymoney.model.t1(this, bitmap, i17, str));
    }
}
