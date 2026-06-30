package uh1;

/* loaded from: classes13.dex */
public final class v1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uh1.y1 f427913d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uh1.p1 f427914e;

    public v1(uh1.y1 y1Var, uh1.p1 p1Var) {
        this.f427913d = y1Var;
        this.f427914e = p1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = this.f427913d.f427939a;
        uh1.p1 p1Var = this.f427914e;
        if (copyOnWriteArraySet.remove(p1Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetworkProvider", "provide, timeout");
            p1Var.a(null);
        }
    }
}
