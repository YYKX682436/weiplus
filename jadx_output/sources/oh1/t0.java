package oh1;

/* loaded from: classes5.dex */
public class t0 extends com.tencent.matrix.lifecycle.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ oh1.u0 f345294a;

    public t0(oh1.u0 u0Var) {
        this.f345294a = u0Var;
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onEnterForeground() {
        com.tencent.mars.xlog.Log.i("MicroMsg.PCWxaJsapiNotifyOpenUrlHandler", "onEnterForeground");
        this.f345294a.f345303e = true;
        ((com.tencent.mm.booter.notification.z) ((oo3.i) i95.n0.c(oo3.i.class))).getClass();
        if (gm0.j1.b().m()) {
            ((com.tencent.mm.booter.notification.x) c01.d9.f()).f(51);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMNotificationService", "cancel no login ");
        }
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onExitForeground() {
        com.tencent.mars.xlog.Log.i("MicroMsg.PCWxaJsapiNotifyOpenUrlHandler", "onExitForeground");
        oh1.u0 u0Var = this.f345294a;
        if (u0Var.f345303e) {
            u0Var.f345302d = false;
            com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner.INSTANCE.removeLifecycleCallback(this);
            u0Var.f345303e = false;
        }
    }
}
