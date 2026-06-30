package kh5;

/* loaded from: classes7.dex */
public final /* synthetic */ class b extends kotlin.jvm.internal.m implements yz5.a {
    public b(java.lang.Object obj) {
        super(0, obj, kh5.h.class, "onBoundingBoxClick", "onBoundingBoxClick()V", 0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        jz5.f0 f0Var;
        kh5.h hVar = (kh5.h) this.receiver;
        jh5.b bVar = hVar.f308077q;
        java.lang.String a17 = new zp0.c(bVar.f299867a, bVar.f299868b, bVar.f299869c).a();
        jc3.j0 j0Var = hVar.f448375f;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (j0Var != null) {
            ((rc3.w0) j0Var).k("OnClientEvent", a17);
            hVar.g1();
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MEChattingMgr", "onBoundingBoxClick without biz");
        }
        return f0Var2;
    }
}
