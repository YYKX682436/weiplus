package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class l1 implements com.tencent.mm.plugin.luckymoney.model.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gb3.i f145404a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f145405b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f145406c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f145407d;

    public l1(com.tencent.mm.plugin.luckymoney.model.w2 w2Var, gb3.i iVar, int i17, int i18, android.widget.ImageView imageView) {
        this.f145404a = iVar;
        this.f145405b = i17;
        this.f145406c = i18;
        this.f145407d = imageView;
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.v2
    public void a(android.graphics.Bitmap bitmap, int i17, java.lang.String str) {
        if (bitmap != null && !bitmap.isRecycled()) {
            ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.luckymoney.model.k1(this, bitmap, str));
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyEnvelopeLogic", "[loadThumbView] load error: %s, %s", java.lang.Integer.valueOf(i17), str);
            gb3.i iVar = this.f145404a;
            if (iVar != null) {
                iVar.onComplete(false);
            }
        }
    }
}
