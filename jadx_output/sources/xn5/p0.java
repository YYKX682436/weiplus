package xn5;

/* loaded from: classes13.dex */
public final class p0 {
    public p0(kotlin.jvm.internal.i iVar) {
    }

    public static final void a(xn5.p0 p0Var) {
        p0Var.getClass();
        int h17 = bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.x2c.RepairerConfigX2COpenFlag());
        com.tencent.mars.xlog.Log.i("MicroMsg.X2C", "updateX2COpenFlag exptFlag:true repairerFlag:" + h17);
        if (h17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.X2C", "openX2C");
            xn5.q0.f455707f = true;
            yz5.a aVar = xn5.q0.f455709h;
            if (aVar != null) {
                aVar.invoke();
                return;
            }
            return;
        }
        if (h17 != 1) {
            if (h17 != 2) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.X2C", "closeX2C");
            xn5.q0.f455707f = false;
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.X2C", "openX2C");
        xn5.q0.f455707f = true;
        yz5.a aVar2 = xn5.q0.f455709h;
        if (aVar2 != null) {
            aVar2.invoke();
        }
    }

    public final xn5.f0 b() {
        xn5.f0 f0Var = xn5.q0.f455704c;
        return f0Var == null ? xn5.q0.f455706e : f0Var;
    }
}
