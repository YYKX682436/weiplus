package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public final class sd implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.od f209809d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.LayoutInflater f209810e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f209811f;

    public sd(com.tencent.mm.ui.od odVar, android.view.LayoutInflater layoutInflater, int i17) {
        this.f209809d = odVar;
        this.f209810e = layoutInflater;
        this.f209811f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.nd status;
        com.tencent.mm.ui.nd ndVar;
        int i17 = this.f209811f;
        com.tencent.mm.ui.od odVar = this.f209809d;
        odVar.getClass();
        synchronized (odVar.f209469a) {
            status = odVar.f209470b;
            kotlin.jvm.internal.o.g(status, "status");
            odVar.f209470b = status == com.tencent.mm.ui.nd.f209412d ? com.tencent.mm.ui.nd.f209413e : status;
            odVar.f209469a.notifyAll();
        }
        if (status == com.tencent.mm.ui.nd.f209413e || status == (ndVar = com.tencent.mm.ui.nd.f209414f)) {
            return;
        }
        try {
            odVar.f209471c = this.f209810e.inflate(i17, (android.view.ViewGroup) null);
            com.tencent.mars.xlog.Log.i("MicroMsg.MMLayoutPrefetcher", "[+} preload layout 0x%x, result: %s", java.lang.Integer.valueOf(i17), odVar.f209471c);
            odVar.a(ndVar);
        } catch (java.lang.Throwable th6) {
            try {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMLayoutPrefetcher", th6, "[-] Fail to inflate resource: 0x%x", java.lang.Integer.valueOf(i17));
                odVar.f209471c = null;
            } finally {
                odVar.a(com.tencent.mm.ui.nd.f209414f);
            }
        }
    }
}
