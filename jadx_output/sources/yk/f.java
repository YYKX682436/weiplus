package yk;

/* loaded from: classes12.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f462745d;

    public f(android.content.Context context) {
        this.f462745d = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yk.o oVar = com.tencent.mm.app.plugin.worker.DBDataCleanWorkManager.f53698m;
        android.content.Context context = this.f462745d;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        kotlin.jvm.internal.o.d(context);
        com.tencent.mm.app.plugin.worker.DBDataCleanWorkManager.f53700o = kz5.c0.i(yk.u.class, yk.b.class, yk.b0.class, yk.f0.class, yk.d0.class, yk.d.class);
        if (((java.lang.Number) ((jz5.n) com.tencent.mm.app.plugin.worker.DBDataCleanWorkManager.f53699n).getValue()).intValue() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.DBDataCleanWorkManger", "use period work.");
            oVar.b(context);
        }
    }
}
