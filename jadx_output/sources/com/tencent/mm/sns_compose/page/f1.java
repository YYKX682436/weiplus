package com.tencent.mm.sns_compose.page;

/* loaded from: classes5.dex */
public final class f1 extends kotlin.jvm.internal.q implements yz5.s {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f193462d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sns_compose.page.p1 f193463e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e0.f1 f193464f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.paging.compose.e f193465g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(kotlinx.coroutines.y0 y0Var, com.tencent.mm.sns_compose.page.p1 p1Var, e0.f1 f1Var, androidx.paging.compose.e eVar) {
        super(5);
        this.f193462d = y0Var;
        this.f193463e = p1Var;
        this.f193464f = f1Var;
        this.f193465g = eVar;
    }

    @Override // yz5.s
    public java.lang.Object v(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        e0.g itemsIndexed = (e0.g) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        n85.t tVar = (n85.t) obj3;
        n0.o oVar = (n0.o) obj4;
        int intValue2 = ((java.lang.Number) obj5).intValue();
        kotlin.jvm.internal.o.g(itemsIndexed, "$this$itemsIndexed");
        java.lang.Object obj6 = n0.e1.f333492a;
        if (tVar != null) {
            kotlinx.coroutines.y0 y0Var = this.f193462d;
            e0.f1 f1Var = this.f193464f;
            androidx.paging.compose.e eVar = this.f193465g;
            kotlinx.coroutines.l.b(y0Var, null, null, new com.tencent.mm.sns_compose.page.e1(tVar, tVar, null), 3, null);
            com.tencent.mm.sns_compose.page.p1 p1Var = this.f193463e;
            com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = p1Var.f193568d;
            kotlin.jvm.internal.o.d(lifecycleScope);
            com.tencent.mm.sns_compose.page.j1.a(p1Var, f1Var, intValue, tVar, eVar, lifecycleScope, oVar, ((intValue2 << 3) & ce1.h.CTRL_INDEX) | 266248 | 32768);
        }
        return jz5.f0.f302826a;
    }
}
