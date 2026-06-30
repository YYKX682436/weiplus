package com.tencent.mm.ui.feature.api.screenshot;

/* loaded from: classes8.dex */
public final class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.type.IPCBoolean f208586d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f208587e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.feature.api.screenshot.j1 f208588f;

    public z0(com.tencent.mm.ipcinvoker.type.IPCBoolean iPCBoolean, android.content.Context context, com.tencent.mm.ui.feature.api.screenshot.j1 j1Var) {
        this.f208586d = iPCBoolean;
        this.f208587e = context;
        this.f208588f = j1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17 = this.f208586d.f68400d;
        android.content.Context context = this.f208587e;
        if (!z17) {
            dp.a.makeText(context, context.getResources().getString(com.tencent.mm.R.string.f491185ng2), 1).show();
            return;
        }
        dp.a.makeText(context, context.getResources().getString(com.tencent.mm.R.string.c9o), 1).show();
        com.tencent.mm.ui.feature.api.screenshot.j1 j1Var = this.f208588f;
        qj5.n nVar = j1Var.f208500f;
        if (nVar != null) {
            nVar.u();
        }
        j1Var.f208500f = null;
    }
}
