package com.tencent.mm.ui.feature.api.screenshot;

/* loaded from: classes3.dex */
public final class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f208582d;

    public y0(android.content.Context context) {
        this.f208582d = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotShareService", "save, failed: no permission");
        android.content.Context context = this.f208582d;
        dp.a.makeText(context, context.getString(com.tencent.mm.R.string.i87), 1).show();
    }
}
