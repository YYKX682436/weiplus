package fh5;

/* loaded from: classes13.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final fh5.a f262718d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f262719e;

    public b(fh5.a request) {
        kotlin.jvm.internal.o.g(request, "request");
        this.f262718d = request;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.sdk.platformtools.n3 n3Var;
        android.os.Message obtainMessage;
        fh5.a aVar = this.f262718d;
        this.f262719e = true;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        jz5.f0 f0Var = null;
        try {
            fh5.e eVar = aVar.f262712a;
            aVar.f262715d = com.tencent.mm.ui.id.b(eVar != null ? eVar.f262722a : null).inflate(aVar.f262714c, aVar.f262713b, false);
        } catch (java.lang.RuntimeException e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WxAsyncLayoutInflater", "Failed to inflate resource(" + aVar.f262714c + ") in the background! Retry on the UI thread. " + e17.getMessage());
        }
        fh5.c cVar = aVar.f262716e;
        if (cVar != null) {
            android.view.View view = aVar.f262715d;
            um2.d6 d6Var = (um2.d6) cVar;
            android.view.ViewGroup viewGroup = view instanceof android.view.ViewGroup ? (android.view.ViewGroup) view : null;
            android.view.ViewGroup viewGroup2 = d6Var.f428768b;
            um2.x5 x5Var = d6Var.f428767a;
            if (viewGroup != null) {
                um2.h6.a(x5Var, "asyncInflateShoppingPlugin-" + java.lang.Thread.currentThread().getName(), viewGroup2, viewGroup);
                f0Var = jz5.f0.f302826a;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.e(x5Var.f429032f, "asyncInflateShoppingPlugin fail,view:" + view + '!');
                pm0.v.X(new um2.c6(x5Var, d6Var.f428769c, viewGroup2));
            }
        }
        java.util.concurrent.CountDownLatch countDownLatch = aVar.f262717f;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
        fh5.e eVar2 = aVar.f262712a;
        if (eVar2 != null && (n3Var = eVar2.f262723b) != null && (obtainMessage = n3Var.obtainMessage(0, aVar)) != null) {
            obtainMessage.sendToTarget();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WxAsyncLayoutInflater", "InflateRunnable " + aVar.f262714c + ' ' + (java.lang.System.currentTimeMillis() - currentTimeMillis));
    }
}
