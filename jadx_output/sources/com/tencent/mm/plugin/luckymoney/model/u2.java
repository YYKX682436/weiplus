package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class u2 implements com.tencent.mm.plugin.luckymoney.model.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f145651a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.w2 f145652b;

    public u2(com.tencent.mm.plugin.luckymoney.model.w2 w2Var, long j17) {
        this.f145652b = w2Var;
        this.f145651a = j17;
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.v2
    public void a(android.graphics.Bitmap bitmap, int i17, java.lang.String str) {
        com.tencent.mm.plugin.luckymoney.model.w2.wi(this.f145652b, null, str, 2, i17, this.f145651a);
    }
}
