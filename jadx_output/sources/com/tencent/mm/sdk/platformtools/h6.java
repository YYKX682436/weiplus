package com.tencent.mm.sdk.platformtools;

/* loaded from: classes12.dex */
public final class h6 extends java.lang.Thread {

    /* renamed from: d, reason: collision with root package name */
    public int f192727d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.i6 f192728e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6(com.tencent.mm.sdk.platformtools.i6 i6Var, com.tencent.mm.sdk.platformtools.f6 f6Var) {
        super(i6Var.f192743e);
        this.f192728e = i6Var;
        this.f192727d = 60;
        setPriority(i6Var.f192742d);
        i6Var.f192745g.add(this);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        com.tencent.mm.sdk.platformtools.g6 g6Var;
        while (this.f192727d > 0) {
            synchronized (this.f192728e.f192744f) {
                try {
                    com.tencent.mm.sdk.platformtools.i6 i6Var = this.f192728e;
                    if (i6Var.f192740b) {
                        i6Var.f192744f.wait();
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("QueueWorkerThread.QueueWorkerThread", e17, "", new java.lang.Object[0]);
                }
            }
            try {
                g6Var = (com.tencent.mm.sdk.platformtools.g6) this.f192728e.f192739a.poll(2000L, java.util.concurrent.TimeUnit.MILLISECONDS);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("QueueWorkerThread.QueueWorkerThread", e18, "", new java.lang.Object[0]);
                g6Var = null;
            }
            if (g6Var == null) {
                this.f192727d--;
            } else {
                this.f192727d = 60;
                if (g6Var.a()) {
                    com.tencent.mm.sdk.platformtools.n3 n3Var = this.f192728e.f192746h;
                    n3Var.sendMessage(n3Var.obtainMessage(0, g6Var));
                }
            }
        }
        this.f192728e.f192745g.remove(this);
        this.f192728e.f192739a.size();
        this.f192728e.f192745g.size();
    }
}
