package f65;

/* loaded from: classes12.dex */
public final class r0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f259962d;

    public r0(java.lang.String str) {
        this.f259962d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f65.y0 y0Var = f65.y0.f260019a;
        f65.q0 q0Var = f65.q0.f259960d;
        java.lang.String str = this.f259962d;
        r45.qz6 c17 = f65.y0.c(y0Var, str, q0Var);
        com.tencent.mm.autogen.mmdata.rpt.VideoSendReporterStruct a17 = f65.y0.a(y0Var, c17);
        f65.w[] wVarArr = f65.w.f259997d;
        a17.f61623k = 4L;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(a17.f61619g)) {
            a17.k();
            return;
        }
        t21.v2 h17 = t21.d3.h(str);
        if (h17 == null) {
            return;
        }
        pt0.e0 e0Var = pt0.f0.f358209b1;
        com.tencent.mm.storage.f9 k17 = e0Var.k(h17.f415020r, h17.f415016n);
        if (k17 == null) {
            k17 = e0Var.n(h17.h(), h17.f415016n);
        }
        c17.f384385h = h17.h();
        c17.f384386i = h17.f415015m * 1000;
        i95.m c18 = i95.n0.c(tg3.u0.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        c17.f384388n = com.tencent.mm.vfs.w6.k(tg3.u0.e8((tg3.u0) c18, k17, bm5.f0.f22571s, this.f259962d, false, 8, null));
        c17.f384387m = com.tencent.mm.vfs.w6.k(h17.f());
        c17.f384384g = h17.S != null ? 1L : 2L;
        a17.f61619g = a17.b("ToUsername", c17.f384385h, true);
        a17.f61620h = c17.f384386i;
        a17.f61622j = c17.f384388n;
        a17.f61621i = c17.f384387m;
        a17.f61618f = c17.f384384g;
        a17.k();
        com.tencent.mm.autogen.mmdata.rpt.ErrorMsgInfoStruct errorMsgInfoStruct = new com.tencent.mm.autogen.mmdata.rpt.ErrorMsgInfoStruct();
        errorMsgInfoStruct.f56113e = 7033L;
        errorMsgInfoStruct.r(str);
        errorMsgInfoStruct.k();
    }
}
