package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class o1 implements com.tencent.mm.plugin.luckymoney.model.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gb3.i f145487a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f145488b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f145489c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f145490d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f145491e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f145492f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.w2 f145493g;

    public o1(com.tencent.mm.plugin.luckymoney.model.w2 w2Var, gb3.i iVar, int i17, int i18, int i19, android.widget.ImageView imageView, long j17) {
        this.f145493g = w2Var;
        this.f145487a = iVar;
        this.f145488b = i17;
        this.f145489c = i18;
        this.f145490d = i19;
        this.f145491e = imageView;
        this.f145492f = j17;
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.v2
    public void a(android.graphics.Bitmap bitmap, int i17, java.lang.String str) {
        if (bitmap != null && !bitmap.isRecycled()) {
            ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.luckymoney.model.n1(this, bitmap, i17, str));
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.LuckyMoneyEnvelopeLogic", "load error: %s, %s", java.lang.Integer.valueOf(i17), str);
            gb3.i iVar = this.f145487a;
            if (iVar != null) {
                iVar.onComplete(false);
            }
        }
    }
}
