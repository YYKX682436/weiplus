package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class p2 implements com.tencent.mm.plugin.luckymoney.model.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f145539a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.w2 f145540b;

    public p2(com.tencent.mm.plugin.luckymoney.model.w2 w2Var, long j17) {
        this.f145540b = w2Var;
        this.f145539a = j17;
    }

    @Override // com.tencent.mm.plugin.luckymoney.model.v2
    public void a(android.graphics.Bitmap bitmap, int i17, java.lang.String str) {
        com.tencent.mm.plugin.luckymoney.model.w2.wi(this.f145540b, null, str, 4, i17, this.f145539a);
    }
}
