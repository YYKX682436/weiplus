package uh1;

/* loaded from: classes7.dex */
public class k0 extends mf1.g {

    /* renamed from: v, reason: collision with root package name */
    public wk1.e f427814v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f427815w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f427816x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ mf1.h f427817y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ uh1.q0 f427818z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(uh1.q0 q0Var, java.net.URI uri, uk1.b bVar, java.util.Map map, int i17, java.lang.String str, java.lang.String str2, mf1.h hVar) {
        super(uri, bVar, map, i17);
        this.f427818z = q0Var;
        this.f427815w = str;
        this.f427816x = str2;
        this.f427817y = hVar;
        this.f427814v = null;
    }

    @Override // sk1.f, sk1.h
    public void g(sk1.e eVar, xk1.a aVar) {
        ((yc1.o) this.f427817y).g(aVar);
    }

    @Override // tk1.c
    public void k(int i17, java.lang.String str, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNetworkWebSocket", "url is %s ,state: closed ,reason: %s, errCode = %d, taskId=%s", this.f427815w, str, java.lang.Integer.valueOf(i17), this.f427816x);
        uh1.q0 q0Var = this.f427818z;
        q0Var.j(this);
        q0Var.i(this);
        mf1.h hVar = this.f427817y;
        if (i17 != -1 && i17 != -2 && i17 != -3) {
            ((yc1.o) hVar).a(i17, str);
            return;
        }
        if (com.tencent.mars.comm.NetStatusUtil.isConnected(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            ((yc1.o) hVar).c(com.tencent.mm.sdk.platformtools.t8.K0(str) ? "abnormal closure" : str);
        } else {
            ((yc1.o) hVar).c("network is down");
        }
        ((yc1.o) hVar).a(1006, str);
    }

    @Override // tk1.c
    public void l(java.lang.Exception exc) {
        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandNetworkWebSocket", exc, "onError Exception: url %s, taskId=%s", this.f427815w, this.f427816x);
        uh1.q0 q0Var = this.f427818z;
        q0Var.j(this);
        q0Var.i(this);
        ((yc1.o) this.f427817y).c("exception " + exc.getMessage());
    }

    @Override // tk1.c
    public void m(wk1.e eVar) {
        wk1.e eVar2;
        wk1.d dVar = ((wk1.f) eVar).f446931b;
        wk1.d dVar2 = wk1.d.CONTINUOUS;
        if (dVar != dVar2 && !((wk1.f) eVar).f446930a) {
            this.f427814v = eVar;
            return;
        }
        wk1.f fVar = (wk1.f) eVar;
        if (fVar.f446931b != dVar2 || (eVar2 = this.f427814v) == null) {
            return;
        }
        if (eVar2.a().position() > 10485760) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandNetworkWebSocket", "Pending Frame exploded");
            this.f427814v = null;
            return;
        }
        try {
            ((wk1.f) this.f427814v).c(eVar);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandNetworkWebSocket", e17, "Exception: Framedata append fail", new java.lang.Object[0]);
        }
        if (fVar.f446930a) {
            wk1.e eVar3 = this.f427814v;
            if (((wk1.f) eVar3).f446931b == wk1.d.BINARY) {
                o(eVar3.a());
            } else if (((wk1.f) eVar3).f446931b == wk1.d.TEXT) {
                try {
                    java.lang.String a17 = yk1.c.a(eVar3.a());
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    if (a17 == null) {
                        a17 = "";
                    }
                    n(a17);
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandNetworkWebSocket", e18, "Exception: stringUtf8 error", new java.lang.Object[0]);
                }
            }
            this.f427814v = null;
        }
    }

    @Override // tk1.c
    public void n(java.lang.String str) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = this.f427815w;
        objArr[1] = java.lang.Integer.valueOf(str != null ? str.length() : -1);
        objArr[2] = this.f427816x;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNetworkWebSocket", "url is %s ,socket onmessage length :%d, taskId=%s", objArr);
        ((yc1.o) this.f427817y).d(str);
    }

    @Override // tk1.c
    public void o(java.nio.ByteBuffer byteBuffer) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = this.f427815w;
        objArr[1] = java.lang.Integer.valueOf(byteBuffer != null ? byteBuffer.capacity() : -1);
        objArr[2] = this.f427816x;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNetworkWebSocket", "url is %s , socket onMessage buffer length : %d, taskId=%s", objArr);
        ((yc1.o) this.f427817y).e(byteBuffer);
    }

    @Override // tk1.c
    public void p(xk1.g gVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandNetworkWebSocket", "url is %s ,state: opened, taskId=%s", this.f427815w, this.f427816x);
        this.f427818z.j(this);
        ((yc1.o) this.f427817y).f(gVar, null);
    }
}
