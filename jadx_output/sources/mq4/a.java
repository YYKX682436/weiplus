package mq4;

/* loaded from: classes14.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.e37 f330781d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mq4.b f330782e;

    public a(mq4.b bVar, r45.e37 e37Var) {
        this.f330782e = bVar;
        this.f330781d = e37Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        r45.e37 e37Var = this.f330781d;
        r45.do5 do5Var = e37Var.M;
        mq4.b bVar = this.f330782e;
        if (do5Var == null || do5Var.f372624d == 0) {
            r45.co5 co5Var = new r45.co5();
            co5Var.f371724d = 0;
            co5Var.f371725e = "";
            co5Var.f371726f = "";
            co5Var.f371727g = bVar.f330783d.f330796g.f176532x.f176847g;
            co5Var.f371728h = 4;
            co5Var.f371729i = 2;
            co5Var.f371730m = e37Var.f372976g;
            co5Var.f371731n = e37Var.f372984r;
            r45.do5 do5Var2 = new r45.do5();
            e37Var.M = do5Var2;
            do5Var2.f372624d = 1;
            do5Var2.f372625e = new java.util.LinkedList();
            e37Var.M.f372625e.add(co5Var);
        }
        r45.ve0 ve0Var = e37Var.N;
        if (ve0Var == null || ve0Var.f388148d == 0) {
            r45.ue0 ue0Var = new r45.ue0();
            ue0Var.f387280d = 1;
            ue0Var.f387281e = "";
            ue0Var.f387282f = "";
            ue0Var.f387283g = bVar.f330783d.f330796g.f176532x.f176847g;
            ue0Var.f387284h = 4;
            ue0Var.f387285i = 2;
            ue0Var.f387286m = e37Var.f372977h;
            ue0Var.f387287n = e37Var.K;
            ue0Var.f387288o = e37Var.L;
            r45.ve0 ve0Var2 = new r45.ve0();
            e37Var.N = ve0Var2;
            ve0Var2.f388148d = 1;
            ve0Var2.f388149e = new java.util.LinkedList();
            e37Var.N.f388149e.add(ue0Var);
        }
        mq4.c cVar = bVar.f330783d;
        mq4.c cVar2 = bVar.f330783d;
        vq4.d0.c(cVar.f330785h, "relay conn cnt: " + e37Var.M.f372624d);
        try {
            cVar2.f330796g.f176532x.f176894v1 = e37Var.M.toByteArray();
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e(cVar2.f330785h, "relay conn info to byte array fail..");
        }
        try {
            cVar2.f330796g.f176532x.f176897w1 = e37Var.N.toByteArray();
        } catch (java.lang.Exception unused2) {
            com.tencent.mars.xlog.Log.e(cVar2.f330785h, "direct conn info to byte array fail..");
        }
        try {
            r45.kj3 kj3Var = e37Var.P;
            if (kj3Var.f378738d > 0) {
                cVar2.f330796g.f176532x.f176900x1 = kj3Var.toByteArray();
            }
        } catch (java.lang.Exception unused3) {
            com.tencent.mars.xlog.Log.e(cVar2.f330785h, "nic query info to byte array fail..");
        }
        com.tencent.mm.plugin.voip.model.g1 g1Var = cVar2.f330796g;
        int i17 = e37Var.B;
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar = g1Var.f176532x;
        v2protocalVar.f176834b1 = i17;
        v2protocalVar.f176852h1 = e37Var.E;
        int i18 = e37Var.f372979m;
        int i19 = e37Var.f372980n;
        v2protocalVar.A = i18;
        v2protocalVar.B = i19;
        r45.cu5 cu5Var = e37Var.f372992z;
        if (cu5Var != null && e37Var.A != null) {
            int i27 = e37Var.f372991y;
            byte[] g17 = cu5Var.f371841f.g();
            byte[] g18 = e37Var.A.f371841f.g();
            com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar2 = g1Var.f176532x;
            v2protocalVar2.f176867m1 = i27;
            v2protocalVar2.f176870n1 = g17;
            v2protocalVar2.f176873o1 = g18;
        }
        vq4.d0.c(cVar2.f330785h, "ack success, try connect channel");
        cVar2.f330796g.J();
    }
}
