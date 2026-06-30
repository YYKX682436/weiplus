package k55;

/* loaded from: classes8.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    public k55.h f304471b;

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f304473d;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f304470a = new java.util.LinkedList();

    /* renamed from: c, reason: collision with root package name */
    public final android.content.ServiceConnection f304472c = new k55.j(this);

    public k(android.content.Context context) {
        this.f304473d = context instanceof android.app.Activity ? com.tencent.mm.sdk.platformtools.x2.f193071a : context;
    }

    public void a(java.lang.Runnable runnable) {
        java.lang.Thread.currentThread().getId();
        if (c()) {
            runnable.run();
            return;
        }
        if (this.f304473d == null) {
            return;
        }
        ((java.util.LinkedList) this.f304470a).add(runnable);
        android.content.Intent intent = new android.content.Intent(this.f304473d, (java.lang.Class<?>) com.tencent.mm.remoteservice.RemoteService.class);
        android.content.Context context = this.f304473d;
        l85.r0 r0Var = l85.s0.f317208d;
        android.content.ServiceConnection serviceConnection = this.f304472c;
        r0Var.a(intent, serviceConnection);
        context.bindService(intent, serviceConnection, 1);
    }

    public void b(k55.e eVar, java.lang.String str, android.os.Bundle bundle) {
        if (c()) {
            try {
                this.f304471b.Na(eVar.getClass().getName(), str, bundle, eVar);
            } catch (android.os.RemoteException e17) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.e("MicroMsg.RemoteServiceProxy", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            }
        }
    }

    public boolean c() {
        k55.h hVar = this.f304471b;
        return hVar != null && hVar.asBinder().isBinderAlive();
    }

    public void d() {
        android.content.ServiceConnection serviceConnection;
        if (this.f304471b != null && (serviceConnection = this.f304472c) != null) {
            this.f304473d.unbindService(serviceConnection);
            this.f304471b = null;
        }
        this.f304473d = null;
    }
}
