package com.tencent.mm.sns_compose.page;

/* loaded from: classes5.dex */
public final class x0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f193612d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f193613e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f193614f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(java.lang.String str, n0.v2 v2Var, int i17) {
        super(2);
        this.f193612d = str;
        this.f193613e = v2Var;
        this.f193614f = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f193614f | 1;
        com.tencent.mm.sns_compose.page.j1.b(this.f193612d, this.f193613e, (n0.o) obj, i17);
        return jz5.f0.f302826a;
    }
}
