package hk4;

/* loaded from: classes10.dex */
public final class p implements pk4.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hk4.x f281975a;

    public p(hk4.x xVar) {
        this.f281975a = xVar;
    }

    @Override // pk4.v
    public void a(dk4.a aVar, long j17) {
        hk4.x xVar = this.f281975a;
        long j18 = xVar.f281992r;
        long j19 = xVar.f281988n;
        if ((!(1 <= j19 && j19 <= j18) || j17 < j19) && j17 < j18) {
            yz5.p pVar = xVar.f281928g;
            if (pVar != null) {
                pVar.invoke(java.lang.Long.valueOf(j17), this.f281975a);
            }
            if (this.f281975a.f281994t) {
                return;
            }
            hk4.x.q(this.f281975a);
            com.tencent.mars.xlog.Log.i(this.f281975a.f281985k, "onProgress try invoke play start, video size:[" + this.f281975a.f281989o + ", " + this.f281975a.f281990p + "], rotate:" + this.f281975a.f281991q);
            hk4.x.p(this.f281975a);
            return;
        }
        com.tencent.mars.xlog.Log.i(xVar.f281985k, "reach playRange end timeMs:" + j17 + ", playRange:[" + this.f281975a.f281987m + ',' + this.f281975a.f281988n + "], isLoop:" + this.f281975a.f281996v);
        hk4.x xVar2 = this.f281975a;
        if (xVar2.f281996v) {
            long j27 = xVar2.f281987m;
            if (j27 >= 0) {
                kk4.b.f(xVar2.f281986l, (int) j27, true, null, 4, null);
                return;
            }
        }
        xVar2.f281986l.stop();
        hk4.x xVar3 = this.f281975a;
        synchronized (xVar3) {
            if (!xVar3.f281993s) {
                com.tencent.mars.xlog.Log.i(xVar3.f281985k, "invokeOnPlayFinished");
                pm0.v.X(new hk4.u(xVar3));
                xVar3.f281993s = true;
            }
        }
    }
}
