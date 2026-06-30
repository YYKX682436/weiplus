package e21;

/* loaded from: classes11.dex */
public class j extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f246536d;

    /* renamed from: e, reason: collision with root package name */
    public final e21.g f246537e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f246538f;

    public j(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f246538f = arrayList;
        arrayList.addAll(list);
        e21.g gVar = new e21.g();
        this.f246537e = gVar;
        ((e21.h) gVar.getReqObj()).f246523a.f375784d = H(list);
    }

    public static r45.c50 H(java.util.List list) {
        r45.c50 c50Var = new r45.c50();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            xg3.q0 q0Var = (xg3.q0) it.next();
            byte[] a17 = q0Var.a();
            r45.b50 b50Var = new r45.b50();
            b50Var.f370530d = q0Var.b();
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(a17);
            b50Var.f370531e = cu5Var;
            c50Var.f371295e.add(b50Var);
        }
        c50Var.f371294d = list.size();
        return c50Var;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneOplog", "doScene[%s] size=%d", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(((java.util.ArrayList) this.f246538f).size()));
        this.f246536d = u0Var;
        return dispatch(sVar, this.f246537e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.mm.plugin.appbrand.jsapi.pay.x.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        this.f246536d.onSceneEnd(i18, i19, str, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int securityLimitCount() {
        return 5;
    }

    @Override // com.tencent.mm.modelbase.m1
    public com.tencent.mm.modelbase.o1 securityVerificationChecked(com.tencent.mm.network.v0 v0Var) {
        return com.tencent.mm.modelbase.o1.EOk;
    }
}
