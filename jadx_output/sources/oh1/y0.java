package oh1;

/* loaded from: classes5.dex */
public class y0 extends com.tencent.matrix.lifecycle.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ oh1.z0 f345319a;

    public y0(oh1.z0 z0Var) {
        this.f345319a = z0Var;
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onEnterForeground() {
        com.tencent.mars.xlog.Log.i("MicroMsg.PCWxaLaunchAppNotifyHandler", "onEnterForeground");
        this.f345319a.f345327e = true;
        ((com.tencent.mm.booter.notification.z) ((oo3.i) i95.n0.c(oo3.i.class))).getClass();
        if (gm0.j1.b().m()) {
            ((com.tencent.mm.booter.notification.x) c01.d9.f()).f(53);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMNotificationService", "cancel no login ");
        }
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onExitForeground() {
        com.tencent.mars.xlog.Log.i("MicroMsg.PCWxaLaunchAppNotifyHandler", "onExitForeground");
        oh1.z0 z0Var = this.f345319a;
        if (z0Var.f345327e) {
            z0Var.f345326d = false;
            com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner.INSTANCE.removeLifecycleCallback(this);
            z0Var.f345327e = false;
        }
    }
}
