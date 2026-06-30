package com.tencent.mm.ui.feature.api.screenshot;

/* loaded from: classes8.dex */
public final class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.feature.api.screenshot.j1 f208552d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f208553e;

    public t0(com.tencent.mm.ui.feature.api.screenshot.j1 j1Var, android.app.Activity activity) {
        this.f208552d = j1Var;
        this.f208553e = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f208552d.Ai();
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(this.f208553e);
        e4Var.d(com.tencent.mm.R.string.p0k);
        e4Var.b(com.tencent.mm.R.raw.icons_filled_info);
        e4Var.c();
    }
}
