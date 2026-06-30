package yf4;

/* loaded from: classes4.dex */
public class g implements com.tencent.mm.modelbase.i1, com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.Queue f461839d = null;

    /* renamed from: e, reason: collision with root package name */
    public boolean f461840e = false;

    public final void b() {
        if (this.f461840e || this.f461839d.size() == 0) {
            return;
        }
        yf4.f fVar = (yf4.f) this.f461839d.peek();
        if (((java.util.LinkedList) fVar.f461838b).size() == 0) {
            this.f461839d.poll();
            c01.d9.b().p().w(8193, fVar.f461837a);
            c01.d9.b().p().w(8449, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()));
            return;
        }
        java.lang.String str = (java.lang.String) ((java.util.LinkedList) fVar.f461838b).peek();
        if (str == null || str.length() <= 0) {
            return;
        }
        this.f461840e = true;
        yf4.e eVar = new yf4.e(str);
        c01.d9.e().a(141, this);
        c01.d9.e().g(eVar);
    }

    @Override // com.tencent.mm.modelbase.t0
    public com.tencent.mm.modelbase.q0 b1(com.tencent.mm.modelbase.p0 p0Var) {
        java.lang.String g17 = x51.j1.g(p0Var.f70726a.f377561h);
        if (this.f461839d == null) {
            this.f461839d = new java.util.LinkedList();
        }
        yf4.f fVar = new yf4.f(g17);
        if (g17 == null) {
            return null;
        }
        ((java.util.LinkedList) this.f461839d).offer(fVar);
        b();
        return null;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var.getType() != 141) {
            this.f461840e = false;
            return;
        }
        c01.d9.e().q(141, this);
        yf4.e eVar = (yf4.e) m1Var;
        yf4.f fVar = (yf4.f) this.f461839d.peek();
        if (fVar != null) {
            java.util.Queue queue = fVar.f461838b;
            if (((java.util.LinkedList) queue).size() != 0) {
                if (((java.util.LinkedList) queue).size() == 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.PushMessageExtension", "get imgQueue failed ! ignore this message");
                    this.f461839d.poll();
                    this.f461840e = false;
                    return;
                }
                java.lang.String str2 = (java.lang.String) ((java.util.LinkedList) queue).peek();
                java.lang.String str3 = eVar.f461832e;
                if (!str2.equals(str3)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.PushMessageExtension", "check img url failed ! ignore this message");
                    this.f461839d.poll();
                    this.f461840e = false;
                    return;
                }
                if (i17 == 0 && i18 == 0) {
                    ((java.util.LinkedList) queue).poll();
                    this.f461840e = false;
                    b();
                    return;
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.PushMessageExtension", "down failed [" + i17 + "," + i18 + "] ignore this message : img:[" + str3 + "] ");
                this.f461839d.poll();
                this.f461840e = false;
                return;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.PushMessageExtension", "getDoSceneQueue failed ! reset queue!");
        this.f461839d = new java.util.LinkedList();
        this.f461840e = false;
    }

    @Override // com.tencent.mm.modelbase.t0
    public void x5(com.tencent.mm.modelbase.r0 r0Var) {
    }
}
