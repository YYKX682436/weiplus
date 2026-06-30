package com.tencent.mm.sns_compose.page;

/* loaded from: classes5.dex */
public final class g1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.paging.compose.e f193471d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f193472e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f193473f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f193474g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sns_compose.page.p1 f193475h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e0.f1 f193476i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(androidx.paging.compose.e eVar, n0.v2 v2Var, java.lang.String str, kotlinx.coroutines.y0 y0Var, com.tencent.mm.sns_compose.page.p1 p1Var, e0.f1 f1Var) {
        super(1);
        this.f193471d = eVar;
        this.f193472e = v2Var;
        this.f193473f = str;
        this.f193474g = y0Var;
        this.f193475h = p1Var;
        this.f193476i = f1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        e0.u0 LazyColumn = (e0.u0) obj;
        kotlin.jvm.internal.o.g(LazyColumn, "$this$LazyColumn");
        java.lang.String str = this.f193473f;
        n0.v2 v2Var = this.f193472e;
        e0.r0.a(LazyColumn, null, null, u0.j.c(-822235289, true, new com.tencent.mm.sns_compose.page.c1(str, v2Var)), 3, null);
        androidx.paging.compose.e eVar = this.f193471d;
        if (eVar.d().f268193a instanceof g4.w0) {
            e0.r0.a(LazyColumn, null, null, com.tencent.mm.sns_compose.page.g.f193466a, 3, null);
        } else {
            v2Var.setValue("");
            androidx.paging.compose.j.b(LazyColumn, eVar, com.tencent.mm.sns_compose.page.d1.f193453d, u0.j.c(422118722, true, new com.tencent.mm.sns_compose.page.f1(this.f193474g, this.f193475h, this.f193476i, eVar)));
            if (eVar.d().f268195c instanceof g4.w0) {
                e0.r0.a(LazyColumn, null, null, com.tencent.mm.sns_compose.page.g.f193467b, 3, null);
            }
            e0.r0.a(LazyColumn, null, null, com.tencent.mm.sns_compose.page.g.f193468c, 3, null);
        }
        return jz5.f0.f302826a;
    }
}
