package com.tencent.mm.ui.tools;

/* loaded from: classes3.dex */
public final class x0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f210891d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f210892e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.s0 f210893f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f210894g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f210895h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f210896i;

    public x0(android.app.Activity activity, java.lang.Runnable runnable, com.tencent.mm.ui.tools.s0 s0Var, com.tencent.mm.storage.f9 f9Var, int i17, int i18) {
        this.f210891d = activity;
        this.f210892e = runnable;
        this.f210893f = s0Var;
        this.f210894g = f9Var;
        this.f210895h = i17;
        this.f210896i = i18;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        android.app.Activity activity = this.f210891d;
        if (activity.isDestroyed() || activity.isFinishing() || menuItem.getItemId() != 1) {
            return;
        }
        java.lang.Runnable runnable = this.f210892e;
        if (runnable != null) {
            runnable.run();
        }
        this.f210893f.a();
        ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).mj(this.f210891d, this.f210894g, this.f210895h, this.f210896i, false);
    }
}
