package dr4;

/* loaded from: classes14.dex */
public final class w1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr4.x1 f242757d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f242758e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(dr4.x1 x1Var, yz5.a aVar) {
        super(0);
        this.f242757d = x1Var;
        this.f242758e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        dr4.c0 c0Var;
        dr4.c0 c0Var2;
        dr4.c0 c0Var3;
        dr4.x1 x1Var = this.f242757d;
        dr4.n0 n0Var = x1Var.f242764d;
        if (n0Var != null) {
            dr4.q[] qVarArr = {n0Var.f242681g, n0Var.f242682h, n0Var.f242683i};
            for (int i17 = 0; i17 < 3; i17++) {
                dr4.q qVar = qVarArr[i17];
                if (qVar != null && (c0Var3 = x1Var.f242762b) != null) {
                    dr4.c0.c(c0Var3, qVar, null, 2, null);
                }
            }
        }
        dr4.d2 d2Var = x1Var.f242763c;
        if (d2Var != null) {
            dr4.q[] qVarArr2 = {d2Var.f242681g, d2Var.f242682h, d2Var.f242683i};
            for (int i18 = 0; i18 < 3; i18++) {
                dr4.q qVar2 = qVarArr2[i18];
                if (qVar2 != null && (c0Var2 = x1Var.f242762b) != null) {
                    dr4.c0.c(c0Var2, qVar2, null, 2, null);
                }
            }
        }
        dr4.h hVar = x1Var.f242765e;
        if (hVar != null) {
            dr4.q[] qVarArr3 = {hVar.f242684j, hVar.f242683i, hVar.A};
            for (int i19 = 0; i19 < 3; i19++) {
                dr4.q qVar3 = qVarArr3[i19];
                if (qVar3 != null && (c0Var = x1Var.f242762b) != null) {
                    dr4.c0.c(c0Var, qVar3, null, 2, null);
                }
            }
        }
        dr4.h hVar2 = x1Var.f242765e;
        if (hVar2 != null) {
            hVar2.e();
        }
        dr4.d2 d2Var2 = x1Var.f242763c;
        if (d2Var2 != null) {
            dr4.o.k(d2Var2, null, 1, null);
        }
        dr4.d2 d2Var3 = x1Var.f242763c;
        if (d2Var3 != null) {
            d2Var3.e();
        }
        dr4.n0 n0Var2 = x1Var.f242764d;
        if (n0Var2 != null) {
            dr4.o.k(n0Var2, null, 1, null);
        }
        dr4.n0 n0Var3 = x1Var.f242764d;
        if (n0Var3 != null) {
            n0Var3.e();
        }
        dr4.c0 c0Var4 = x1Var.f242762b;
        if (c0Var4 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PboSurfaceRender", "stop");
            c0Var4.b(new dr4.z(c0Var4));
        }
        dr4.c0 c0Var5 = x1Var.f242762b;
        if (c0Var5 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PboSurfaceRender", "stop");
            c0Var5.f242610m.clear();
            c0Var5.f242611n.clear();
            dr4.q1 q1Var = c0Var5.f242602e;
            if (q1Var != null) {
                q1Var.n();
            }
            c0Var5.f242605h = false;
            com.tencent.mars.xlog.Log.i("MicroMsg.PboSurfaceRender", "stop set pauseRender");
            c0Var5.f242608k = true;
            android.view.Surface surface = c0Var5.f242604g;
            if (surface != null) {
                surface.release();
            }
            android.graphics.SurfaceTexture surfaceTexture = c0Var5.f242603f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
            is0.c cVar = c0Var5.f242606i;
            if (cVar != null) {
                cVar.close();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.PboSurfaceRender", "destroy finish");
        }
        yz5.a aVar = this.f242758e;
        if (aVar != null) {
            aVar.invoke();
        }
        return jz5.f0.f302826a;
    }
}
