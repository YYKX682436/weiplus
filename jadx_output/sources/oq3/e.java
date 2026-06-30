package oq3;

/* loaded from: classes12.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.kc5 f347381d;

    public e(r45.kc5 kc5Var) {
        this.f347381d = kc5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r45.kc5 kc5Var = this.f347381d;
        long max = java.lang.Math.max(kc5Var.f378588e, c01.id.c() + 240000) + (e06.p.j(new e06.k(0, 30), c06.e.f37716d) * 1000);
        sq3.f cj6 = ((fq3.n) i95.n0.c(fq3.n.class)).cj();
        java.util.LinkedList<r45.cm> biz_resps = kc5Var.f378587d;
        kotlin.jvm.internal.o.f(biz_resps, "biz_resps");
        long min = java.lang.Math.min(max, c01.id.c() + 3600000);
        com.tencent.mm.sdk.platformtools.o4 o4Var = cj6.f411361f;
        if (o4Var != null) {
            o4Var.B(cj6.f411362g, min);
            for (r45.cm cmVar : biz_resps) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                java.lang.String str = cj6.f411363h;
                sb6.append(str);
                sb6.append(cmVar.f371660d);
                o4Var.W(sb6.toString());
                java.lang.String str2 = str + cmVar.f371660d;
                com.tencent.mm.protobuf.g gVar = cmVar.f371661e;
                o4Var.H(str2, gVar != null ? gVar.g() : null);
                o4Var.B(cj6.f411364i + cmVar.f371660d, cmVar.f371662f);
                o4Var.B(cj6.f411365m + cmVar.f371660d, 0L);
            }
        }
        com.tencent.mars.cdn.CdnManager cdnManager = (com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getContext().getManager(com.tencent.mars.cdn.CdnManager.class);
        if (cdnManager != null) {
            cdnManager.setDownloadQuota(((fq3.n) i95.n0.c(fq3.n.class)).cj().T6(1), java.lang.Math.min(max - c01.id.c(), 3600000L));
        }
        kotlin.jvm.internal.o.f(biz_resps, "biz_resps");
        java.util.Iterator it = biz_resps.iterator();
        while (it.hasNext()) {
            if (((r45.cm) it.next()).f371660d == 1) {
                fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
                nVar.requireAccountInitialized();
                nVar.B.h(true);
            }
        }
        fq3.n nVar2 = (fq3.n) i95.n0.c(fq3.n.class);
        nVar2.requireAccountInitialized();
        kq3.l lVar = nVar2.f265536u;
        long min2 = java.lang.Math.min(max - c01.id.c(), 3600000L);
        kq3.k kVar = lVar.f311279b;
        if (kVar != null) {
            kVar.sendEmptyMessageDelayed(2, min2);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.PreDownloadCheckPLC", "pre download check end, get c2c quota:" + ((fq3.n) i95.n0.c(fq3.n.class)).cj().T6(1));
    }
}
