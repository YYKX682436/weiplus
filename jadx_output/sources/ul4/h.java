package ul4;

/* loaded from: classes11.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ul4.i f428613d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jm4.h0 f428614e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ byte[] f428615f;

    public h(ul4.i iVar, jm4.h0 h0Var, byte[] bArr) {
        this.f428613d = iVar;
        this.f428614e = h0Var;
        this.f428615f = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f25.l0 l0Var;
        f25.l0 l0Var2;
        ul4.i iVar = this.f428613d;
        jm4.h0 h0Var = this.f428614e;
        byte[] bArr = this.f428615f;
        iVar.getClass();
        if (h0Var != jm4.h0.f300388e) {
            if (h0Var == jm4.h0.f300389f) {
                if (iVar.f428622m) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.TingAudioFocusController", "abandonFocus failed for requestFocusManual " + iVar.f428619g.f259104a);
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.TingAudioFocusController", "abandonFocus  taskId " + iVar.f428618f + ", " + iVar.f428619g.f259104a);
                f25.m0 m0Var = iVar.f428620h;
                if (m0Var != null) {
                    ((f25.n0) i95.n0.c(f25.n0.class)).yg(m0Var);
                    iVar.f428620h = null;
                    return;
                }
                return;
            }
            return;
        }
        f25.e Vd = ((f25.n0) i95.n0.c(f25.n0.class)).Vd();
        if (Vd.f259092a) {
            f25.m0 m0Var2 = Vd.f259093b;
            if (kotlin.jvm.internal.o.b((m0Var2 == null || (l0Var2 = ((g25.e) m0Var2).f267979b) == null) ? null : l0Var2.getClass(), iVar.f428619g.getClass())) {
                f25.m0 m0Var3 = Vd.f259093b;
                if (kotlin.jvm.internal.o.b((m0Var3 == null || (l0Var = ((g25.e) m0Var3).f267979b) == null) ? null : l0Var.f259104a, iVar.f428619g.f259104a)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.TingAudioFocusController", "current focus scene is same as request scene, skip");
                    pm0.v.X(new ul4.a(iVar, 0, bArr));
                    return;
                }
            }
        }
        if (((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).zk()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TingAudioFocusController", "requestFocus fail, isAnchorLiving");
            iVar.d(null, true);
            pm0.v.X(new ul4.a(iVar, -1, bArr));
            return;
        }
        f25.m0 m96 = ((f25.n0) i95.n0.c(f25.n0.class)).m9(iVar.f428619g, iVar);
        g25.e eVar = (g25.e) m96;
        if (eVar.f267980c) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TingAudioFocusController", "requestFocus success taskId " + iVar.f428618f + ", " + iVar.f428619g.f259104a + ", currentLockFocusScene: " + eVar.f267981d);
            pm0.v.X(new ul4.a(iVar, 0, bArr));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.TingAudioFocusController", "requestFocus fail taskId " + iVar.f428618f);
            iVar.d(m96, false);
            pm0.v.X(new ul4.a(iVar, -1, bArr));
        }
        iVar.f428620h = m96;
    }
}
