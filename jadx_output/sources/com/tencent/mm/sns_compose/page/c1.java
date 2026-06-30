package com.tencent.mm.sns_compose.page;

/* loaded from: classes5.dex */
public final class c1 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f193443d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f193444e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(java.lang.String str, n0.v2 v2Var) {
        super(3);
        this.f193443d = str;
        this.f193444e = v2Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        e0.g item = (e0.g) obj;
        n0.o oVar = (n0.o) obj2;
        int intValue = ((java.lang.Number) obj3).intValue();
        kotlin.jvm.internal.o.g(item, "$this$item");
        if ((intValue & 81) == 16) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f302826a;
            }
        }
        java.lang.Object obj4 = n0.e1.f333492a;
        java.lang.String title = this.f193443d;
        kotlin.jvm.internal.o.f(title, "$title");
        com.tencent.mm.sns_compose.page.j1.b(title, this.f193444e, oVar, 48);
        return jz5.f0.f302826a;
    }
}
