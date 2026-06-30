package com.tencent.mm.sns_compose.page;

/* loaded from: classes5.dex */
public final class q0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sns_compose.page.p1 f193573d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n85.t f193574e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f193575f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(com.tencent.mm.sns_compose.page.p1 p1Var, n85.t tVar, android.content.Context context) {
        super(1);
        this.f193573d = p1Var;
        this.f193574e = tVar;
        this.f193575f = context;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        android.content.Context context = this.f193575f;
        if (booleanValue) {
            com.tencent.mm.sns_compose.page.t0 t0Var = new com.tencent.mm.sns_compose.page.t0(this.f193574e);
            com.tencent.mm.sns_compose.page.p1 p1Var = this.f193573d;
            p1Var.getClass();
            kotlinx.coroutines.flow.h3 h3Var = (kotlinx.coroutines.flow.h3) p1Var.f193569e;
            h3Var.k(kz5.n0.u0((java.util.Collection) h3Var.getValue(), t0Var));
            db5.t7.h(context, com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.jht));
        } else {
            db5.t7.g(context, com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.jhu));
        }
        return jz5.f0.f302826a;
    }
}
