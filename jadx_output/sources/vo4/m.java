package vo4;

/* loaded from: classes10.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vo4.p f438662d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(vo4.p pVar) {
        super(0);
        this.f438662d = pVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17;
        int i18;
        int i19;
        int i27;
        vo4.p pVar = this.f438662d;
        android.view.Surface surface = pVar.f438690d;
        rs0.g gVar = rs0.i.f399296a;
        int i28 = pVar.f438688b;
        int i29 = pVar.f438687a;
        if (surface == null) {
            i18 = 18;
            i19 = i28;
            i17 = i29;
        } else {
            i17 = 0;
            i18 = 30;
            i19 = 0;
        }
        pVar.f438665e = rs0.g.n(gVar, surface, null, i17, i19, null, i18, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.VLog.VLogRemuxSurface", "initGL succ");
        is0.c b17 = is0.b.b(true, 9L);
        int i37 = pVar.f438668h;
        if (i37 <= 0 || (i27 = pVar.f438669i) <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VLog.VLogRemuxSurface", "[OpenGL] init productionTexObj, width:" + i29 + ", height:" + i28);
            is0.c.b(b17, pVar.f438687a, pVar.f438688b, 0, null, 0, 0, 60, null);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.VLog.VLogRemuxSurface", "[OpenGL] init productionTexObj, width:" + i37 + ", height:" + i27);
            is0.c.b(b17, pVar.f438668h, pVar.f438669i, 0, null, 0, 0, 60, null);
        }
        pVar.f438689c = b17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[OpenGL] init egl environment after, surface: ");
        sb6.append(pVar.f438690d);
        sb6.append(", eglEnv: ");
        rs0.h hVar = pVar.f438665e;
        sb6.append(hVar != null ? hVar.f399294c : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.VLog.VLogRemuxSurface", sb6.toString());
        return jz5.f0.f302826a;
    }
}
