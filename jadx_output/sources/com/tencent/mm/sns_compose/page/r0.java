package com.tencent.mm.sns_compose.page;

/* loaded from: classes5.dex */
public final class r0 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f193578a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f193579b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n85.t f193580c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sns_compose.page.p1 f193581d;

    public r0(android.content.Context context, kotlinx.coroutines.y0 y0Var, n85.t tVar, com.tencent.mm.sns_compose.page.p1 p1Var) {
        this.f193578a = context;
        this.f193579b = y0Var;
        this.f193580c = tVar;
        this.f193581d = p1Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        n85.t tVar = this.f193580c;
        java.lang.String seq = tVar.f335726f;
        com.tencent.mm.sns_compose.page.p1 p1Var = this.f193581d;
        android.content.Context context = this.f193578a;
        new com.tencent.mm.sns_compose.page.q0(p1Var, tVar, context);
        kotlin.jvm.internal.o.g(context, "context");
        kotlinx.coroutines.y0 scope = this.f193579b;
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(seq, "seq");
    }
}
