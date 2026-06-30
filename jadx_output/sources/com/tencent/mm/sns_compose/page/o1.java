package com.tencent.mm.sns_compose.page;

/* loaded from: classes5.dex */
public final class o1 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f193556d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f193557e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sns_compose.page.p1 f193558f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(com.tencent.mm.sns_compose.page.p1 p1Var, kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
        this.f193558f = p1Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.tencent.mm.sns_compose.page.o1 o1Var = new com.tencent.mm.sns_compose.page.o1(this.f193558f, (kotlin.coroutines.Continuation) obj3);
        o1Var.f193556d = (g4.j3) obj;
        o1Var.f193557e = (java.util.List) obj2;
        return o1Var.invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        g4.j3 filter = (g4.j3) this.f193556d;
        for (com.tencent.mm.sns_compose.page.u0 u0Var : (java.util.List) this.f193557e) {
            this.f193558f.getClass();
            if (!(u0Var instanceof com.tencent.mm.sns_compose.page.t0)) {
                throw new jz5.j();
            }
            com.tencent.mm.sns_compose.page.m1 m1Var = new com.tencent.mm.sns_compose.page.m1(u0Var, null);
            kotlin.jvm.internal.o.g(filter, "$this$filter");
            filter = new g4.j3(new g4.t3(filter.f268389a, m1Var), filter.f268390b);
        }
        return filter;
    }
}
