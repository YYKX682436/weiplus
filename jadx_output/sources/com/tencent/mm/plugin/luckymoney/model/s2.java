package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class s2 implements com.tencent.mm.plugin.luckymoney.model.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f145600a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.w2 f145601b;

    public s2(com.tencent.mm.plugin.luckymoney.model.w2 w2Var, long j17) {
        this.f145601b = w2Var;
        this.f145600a = j17;
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.v2
    public void a(android.graphics.Bitmap bitmap, int i17, java.lang.String str) {
        com.tencent.mm.plugin.luckymoney.model.w2.wi(this.f145601b, null, str, 1, i17, this.f145600a);
    }
}
