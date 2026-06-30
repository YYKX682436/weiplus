package com.tencent.mm.sns_compose.page;

/* loaded from: classes4.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f193563d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sns_compose.page.p1 f193564e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f193565f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n85.t f193566g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ androidx.paging.compose.e f193567h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(android.content.Context context, com.tencent.mm.sns_compose.page.p1 p1Var, kotlinx.coroutines.y0 y0Var, n85.t tVar, androidx.paging.compose.e eVar) {
        super(0);
        this.f193563d = context;
        this.f193564e = p1Var;
        this.f193565f = y0Var;
        this.f193566g = tVar;
        this.f193567h = eVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f193563d;
        n85.t item = this.f193566g;
        com.tencent.mm.sns_compose.page.o0 o0Var = new com.tencent.mm.sns_compose.page.o0(context, item, this.f193567h);
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.sns_compose.page.p1 withTaViewModel = this.f193564e;
        kotlin.jvm.internal.o.g(withTaViewModel, "withTaViewModel");
        kotlinx.coroutines.y0 rememberScope = this.f193565f;
        kotlin.jvm.internal.o.g(rememberScope, "rememberScope");
        kotlin.jvm.internal.o.g(item, "item");
        if ((item.f335731k & 64) > 0) {
            com.tencent.mm.sns_compose.page.s0.o(context, withTaViewModel, rememberScope, item);
        } else {
            o0Var.invoke();
        }
        return jz5.f0.f302826a;
    }
}
