package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class q2 implements com.tencent.mm.plugin.luckymoney.model.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f145560a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.w2 f145561b;

    public q2(com.tencent.mm.plugin.luckymoney.model.w2 w2Var, long j17) {
        this.f145561b = w2Var;
        this.f145560a = j17;
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.v2
    public void a(android.graphics.Bitmap bitmap, int i17, java.lang.String str) {
        com.tencent.mm.plugin.luckymoney.model.w2.wi(this.f145561b, null, str, 4, i17, this.f145560a);
    }
}
