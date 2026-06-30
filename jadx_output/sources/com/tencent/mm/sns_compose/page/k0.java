package com.tencent.mm.sns_compose.page;

/* loaded from: classes4.dex */
public final class k0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n85.t f193511d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f193512e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sns_compose.page.p1 f193513f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f193514g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ androidx.paging.compose.e f193515h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(n85.t tVar, android.content.Context context, com.tencent.mm.sns_compose.page.p1 p1Var, kotlinx.coroutines.y0 y0Var, androidx.paging.compose.e eVar) {
        super(1);
        this.f193511d = tVar;
        this.f193512e = context;
        this.f193513f = p1Var;
        this.f193514g = y0Var;
        this.f193515h = eVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(it, "it");
        n85.t tVar = this.f193511d;
        int i17 = tVar.f335731k & 64;
        android.content.Context context = this.f193512e;
        if (i17 > 0) {
            com.tencent.mm.sns_compose.page.s0.o(context, this.f193513f, this.f193514g, tVar);
        } else {
            m85.b bVar = m85.b.f324828a;
            bVar.e(context, tVar.f335725e, bVar.l().equals(tVar.f335721a), com.tencent.mm.sns_compose.page.s0.m(it, this.f193515h));
        }
        return jz5.f0.f302826a;
    }
}
