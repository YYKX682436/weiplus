package oy1;

/* loaded from: classes13.dex */
public abstract class l implements ez1.a {

    /* renamed from: d, reason: collision with root package name */
    public android.net.ConnectivityManager.NetworkCallback f349883d;

    public l() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ExptChangeEvent>(a0Var) { // from class: com.tencent.mm.plugin.datareport.cgi.newreport.BaseCgiReporter$exptIListener$1
            {
                this.__eventId = -31521245;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ExptChangeEvent exptChangeEvent) {
                com.tencent.mm.autogen.events.ExptChangeEvent event = exptChangeEvent;
                kotlin.jvm.internal.o.g(event, "event");
                oy1.l.this.d("expt_change");
                return false;
            }
        }.alive();
    }

    public final void a(android.content.Context context) {
        if (this.f349883d == null) {
            if (context == null) {
                context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            }
            java.lang.Object systemService = context != null ? context.getSystemService("connectivity") : null;
            android.net.ConnectivityManager connectivityManager = systemService instanceof android.net.ConnectivityManager ? (android.net.ConnectivityManager) systemService : null;
            if (connectivityManager != null) {
                try {
                    oy1.j jVar = new oy1.j(this, connectivityManager);
                    this.f349883d = jVar;
                    connectivityManager.requestNetwork(new android.net.NetworkRequest.Builder().build(), jVar);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.BaseCgiReport", "check on line err " + e17);
                    try {
                        android.net.ConnectivityManager.NetworkCallback networkCallback = this.f349883d;
                        if (networkCallback != null) {
                            connectivityManager.unregisterNetworkCallback(networkCallback);
                        }
                    } catch (java.lang.Exception unused) {
                    }
                    this.f349883d = null;
                }
            }
        }
    }

    public final void b() {
        ((ku5.t0) ku5.t0.f312615d).l(new oy1.k(this), 1000L, "MicroMsg.BaseCgiReport");
    }

    @Override // ez1.a
    public void b7(long j17, boolean z17, android.app.Activity activity) {
    }

    public abstract void c(int i17, java.util.List list, boolean z17);

    public abstract void d(java.lang.String str);

    public abstract void e(boolean z17);

    public void f(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            ez1.g.f257840i.Y(this);
            java.lang.Object systemService = context.getSystemService("connectivity");
            android.net.ConnectivityManager connectivityManager = systemService instanceof android.net.ConnectivityManager ? (android.net.ConnectivityManager) systemService : null;
            if (connectivityManager != null) {
                try {
                    android.net.ConnectivityManager.NetworkCallback networkCallback = this.f349883d;
                    if (networkCallback != null) {
                        connectivityManager.unregisterNetworkCallback(networkCallback);
                    }
                } catch (java.lang.Exception unused) {
                }
            }
        }
    }
}
