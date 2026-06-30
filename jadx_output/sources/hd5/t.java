package hd5;

/* loaded from: classes9.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final hd5.n f280642d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f280643e;

    /* renamed from: f, reason: collision with root package name */
    public final hd5.p f280644f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f280645g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ hd5.v f280646h;

    public t(hd5.v vVar, hd5.n nVar, boolean z17, hd5.p pVar, java.util.concurrent.atomic.AtomicBoolean atomicBoolean) {
        this.f280646h = vVar;
        this.f280642d = nVar;
        this.f280643e = z17;
        this.f280644f = pVar;
        this.f280645g = atomicBoolean;
    }

    public int a() {
        hd5.n nVar = this.f280642d;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.f280645g;
        hd5.v vVar = this.f280646h;
        hd5.q qVar = new hd5.q(nVar, atomicBoolean, vVar);
        ke5.b bVar = (ke5.b) this.f280644f;
        android.os.Bundle bundle = bVar.f307058a;
        qVar.f280629a = bundle;
        he5.t e17 = bVar.f307060c.e(bVar.f307059b, bundle, qVar);
        hd5.m mVar = vVar.f280654e;
        hd5.n nVar2 = this.f280642d;
        hd5.u uVar = new hd5.u(this, qVar);
        hd5.j jVar = (hd5.j) mVar;
        jVar.getClass();
        yd5.j jVar2 = yd5.j.f461103b;
        int ordinal = nVar.ordinal();
        int[] iArr = jVar2.f461104a;
        if (ordinal == 0) {
            iArr[1] = iArr[1] + 1;
        } else if (ordinal == 1) {
            iArr[0] = iArr[0] + 1;
        } else if (ordinal == 2) {
            iArr[2] = iArr[2] + 1;
        } else if (ordinal == 4) {
            android.os.Bundle bundle2 = qVar.f280629a;
            if (bundle2 == null || bundle2.getInt("SCENE") != 1) {
                iArr[4] = iArr[4] + 1;
            } else {
                iArr[3] = iArr[3] + 1;
            }
        }
        if (e17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingLoader.ChattingDataCallbackV2", "[load] null == source!");
            uVar.next();
        } else {
            e17.c(new hd5.g(e17, qVar, jVar, nVar2, uVar));
        }
        return qVar.f280632d;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((tb5.d0) ((tb5.n0) this.f280646h.f280655f.f460708c.a(tb5.n0.class))).m0("loadTaskStart", this.f280642d);
        ((java.util.LinkedHashMap) sd5.p.f406725a).clear();
        java.lang.System.currentTimeMillis();
        try {
            a();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChattingLoader.ListDataLoader", th6, "", new java.lang.Object[0]);
            ((ku5.t0) ku5.t0.f312615d).g(new java.lang.Runnable() { // from class: hd5.t$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.autogen.mmdata.rpt.ErrorMsgInfoStruct errorMsgInfoStruct = new com.tencent.mm.autogen.mmdata.rpt.ErrorMsgInfoStruct();
                    errorMsgInfoStruct.r(android.util.Log.getStackTraceString(th6).replace(",", ";"));
                    errorMsgInfoStruct.s(com.tencent.mm.sdk.platformtools.z.f193109e);
                    errorMsgInfoStruct.f56113e = 1042L;
                    errorMsgInfoStruct.k();
                }
            });
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        }
        java.lang.System.currentTimeMillis();
    }
}
