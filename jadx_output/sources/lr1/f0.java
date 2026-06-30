package lr1;

/* loaded from: classes8.dex */
public class f0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: f, reason: collision with root package name */
    public static long f320659f;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f320660d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.o f320661e;

    public static java.util.LinkedList H() {
        try {
            byte[] N = com.tencent.mm.vfs.w6.N(gm0.j1.u().d() + "search_biz_recommend", 0, Integer.MAX_VALUE);
            if (N != null) {
                r45.dl5 dl5Var = new r45.dl5();
                dl5Var.parseFrom(N);
                return dl5Var.f372555e;
            }
        } catch (java.lang.Exception e17) {
            e17.getMessage();
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BrandService.NetSceneGroupRecommendBiz", e17, "", new java.lang.Object[0]);
        }
        return new java.util.LinkedList();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        f320659f = java.lang.System.currentTimeMillis();
        this.f320660d = u0Var;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.du3();
        lVar.f70665b = new r45.eu3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/grouprecommendbiz";
        lVar.f70667d = 456;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f320661e = a17;
        return dispatch(sVar, a17, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 456;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        if (i18 == 0 && i19 == 0) {
            r45.eu3 eu3Var = (r45.eu3) this.f320661e.f70711b.f70700a;
            if (eu3Var.f373729d.f372554d > 0) {
                try {
                    com.tencent.mm.vfs.w6.R(gm0.j1.u().d() + "search_biz_recommend", eu3Var.f373729d.toByteArray());
                    java.util.Iterator it = eu3Var.f373729d.f372555e.iterator();
                    while (it.hasNext()) {
                        java.util.Iterator it6 = ((r45.cl5) it.next()).f371658f.iterator();
                        while (it6.hasNext()) {
                            r45.fx5 fx5Var = (r45.fx5) it6.next();
                            com.tencent.mm.modelavatar.r0 r0Var = new com.tencent.mm.modelavatar.r0();
                            r0Var.f70529a = x51.j1.g(fx5Var.f374701d);
                            r0Var.f70533e = fx5Var.f374716v;
                            r0Var.f70532d = fx5Var.f374717w;
                            r0Var.f70537i = -1;
                            r0Var.f70530b = 3;
                            r0Var.f70534f = 1;
                            ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                            com.tencent.mm.modelavatar.d1.Ni().y0(r0Var);
                        }
                    }
                } catch (java.io.IOException e17) {
                    e17.getMessage();
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BrandService.NetSceneGroupRecommendBiz", e17, "", new java.lang.Object[0]);
                }
            } else {
                com.tencent.mm.vfs.w6.h(gm0.j1.u().d() + "search_biz_recommend");
            }
        }
        this.f320660d.onSceneEnd(i18, i19, str, this);
    }
}
