package hk4;

/* loaded from: classes10.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hk4.x f281976d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(hk4.x xVar) {
        super(1);
        this.f281976d = xVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        kk4.b it = (kk4.b) obj;
        kotlin.jvm.internal.o.g(it, "it");
        hk4.x xVar = this.f281976d;
        synchronized (xVar) {
            if (!xVar.f281993s) {
                com.tencent.mars.xlog.Log.i(xVar.f281985k, "invokeOnPlayFinished");
                pm0.v.X(new hk4.u(xVar));
                xVar.f281993s = true;
            }
        }
        return jz5.f0.f302826a;
    }
}
