package com.tencent.mm.xwebutil;

/* loaded from: classes8.dex */
public class t0 implements android.os.MessageQueue.IdleHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f214888d;

    public t0(java.lang.ref.WeakReference weakReference) {
        this.f214888d = weakReference;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public boolean queueIdle() {
        com.tencent.mars.xlog.Log.i("MicroMsg.XWeb.MM.XWebUpdateHelper", "checkUpdate, queueIdle");
        android.os.Looper.myQueue().removeIdleHandler(this);
        android.content.Context context = (android.content.Context) this.f214888d.get();
        if (context != null) {
            boolean z17 = gm0.m.i() != 0;
            boolean z18 = context instanceof android.app.Activity;
            com.tencent.mars.xlog.Log.i("MicroMsg.XWeb.MM.XWebUpdateHelper", "checkUserLogin: %b, context is Activity: %b", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
            if (z17 || z18) {
                if (com.tencent.xweb.a3.o(true)) {
                    com.tencent.mm.xwebutil.u0.a(context, 4);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.XWeb.MM.XWebUpdateHelper", "checkUpdateIfNeed, no need check update");
                }
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.XWeb.MM.XWebUpdateHelper", "checkUpdate, context has been destructured.");
        }
        return false;
    }
}
