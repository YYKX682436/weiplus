package hk4;

/* loaded from: classes10.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hk4.x f281979d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(hk4.x xVar) {
        super(1);
        this.f281979d = xVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        kk4.b it = (kk4.b) obj;
        kotlin.jvm.internal.o.g(it, "it");
        hk4.x xVar = this.f281979d;
        com.tencent.mars.xlog.Log.i(xVar.f281985k, "onPlayStarted");
        hk4.x.q(xVar);
        xVar.f281995u = true;
        long j17 = xVar.f281997w;
        kk4.v vVar = xVar.f281986l;
        java.lang.String str = xVar.f281985k;
        if (j17 >= 0) {
            com.tencent.mars.xlog.Log.i(str, "onPlayStarted seek to target:" + xVar.f281997w);
            vVar.z((int) xVar.f281997w, true, new hk4.r(xVar));
            xVar.f281997w = -1L;
        } else {
            long j18 = xVar.f281987m;
            if (j18 < 0 || xVar.f281988n <= 0 || j18 >= xVar.f281992r) {
                hk4.x.p(xVar);
            } else {
                com.tencent.mars.xlog.Log.i(str, "onPlayStarted seek to playRange:[" + xVar.f281987m + ',' + xVar.f281988n + ']');
                vVar.z((int) xVar.f281987m, true, new hk4.s(xVar));
            }
        }
        return jz5.f0.f302826a;
    }
}
