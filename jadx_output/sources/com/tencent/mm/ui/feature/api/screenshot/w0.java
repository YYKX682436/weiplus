package com.tencent.mm.ui.feature.api.screenshot;

/* loaded from: classes8.dex */
public final class w0 implements d85.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.feature.api.screenshot.j1 f208572a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qj5.q f208573b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f208574c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f208575d;

    public w0(com.tencent.mm.ui.feature.api.screenshot.j1 j1Var, qj5.q qVar, android.content.Context context, java.lang.String str) {
        this.f208572a = j1Var;
        this.f208573b = qVar;
        this.f208574c = context;
        this.f208575d = str;
    }

    @Override // d85.k0
    public final void onOp(java.lang.Boolean bool) {
        kotlin.jvm.internal.o.d(bool);
        if (bool.booleanValue()) {
            com.tencent.mm.ui.feature.api.screenshot.j1 j1Var = this.f208572a;
            j1Var.getClass();
            zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
            android.content.Context context = this.f208574c;
            ((yb0.g) b0Var).Ni(context, new com.tencent.mm.ui.feature.api.screenshot.x0(context, this.f208575d, j1Var, this.f208573b), new com.tencent.mm.ui.feature.api.screenshot.y0(context));
        }
    }
}
