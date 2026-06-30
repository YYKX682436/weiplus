package uf;

/* loaded from: classes7.dex */
public final class n1 extends com.tencent.mm.plugin.appbrand.oc {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ uf.o1 f427056c;

    public n1(uf.o1 o1Var) {
        this.f427056c = o1Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.oc
    public boolean a(android.view.KeyEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCastHandler", "volume up");
        uf.o1 o1Var = this.f427056c;
        uf.o0 q17 = o1Var.q();
        uf.m1 m1Var = new uf.m1(o1Var);
        q17.getClass();
        x91.h c17 = q17.f427062e.c();
        uf.s sVar = new uf.s(m1Var);
        x91.l lVar = c17.f452650d;
        if (lVar == null) {
            return true;
        }
        c17.f452648b.g(new w91.c(c17.a(lVar), c17.f452650d.f452664a), sVar);
        return true;
    }
}
