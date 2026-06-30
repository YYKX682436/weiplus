package du3;

/* loaded from: classes3.dex */
public final class k3 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ du3.t3 f243642d;

    public k3(du3.t3 t3Var) {
        this.f243642d = t3Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        hk0.z0 z0Var = ((hk0.y0) obj).f281846a;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoPreviewPlugin", "observeMosaicState >> type: " + z0Var);
        int ordinal = z0Var.ordinal();
        qk.g6 g6Var = qk.g6.MOSAIC;
        du3.t3 t3Var = this.f243642d;
        if (ordinal == 1) {
            l45.q qVar = t3Var.f243726p;
            if (qVar != null) {
                new l45.a((l45.n) qVar).a(g6Var);
            }
            l45.q qVar2 = t3Var.f243726p;
            if (qVar2 != null) {
                new l45.a((l45.n) qVar2).b(g6Var, 0, java.lang.Boolean.TRUE);
            }
            nu3.i iVar = nu3.i.f340218a;
            nu3.i.c(iVar, "KEY_CLICK_MOSAIC_COUNT_INT", 0, 2, null);
            iVar.b(8);
            return;
        }
        if (ordinal != 2) {
            if (ordinal != 3) {
                t3Var.G();
                com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoPreviewPlugin", "unSelect all mosaic");
                return;
            } else {
                l45.q qVar3 = t3Var.f243726p;
                if (qVar3 != null) {
                    new l45.a((l45.n) qVar3).b(g6Var, -3, null);
                    return;
                }
                return;
            }
        }
        l45.q qVar4 = t3Var.f243726p;
        if (qVar4 != null) {
            new l45.a((l45.n) qVar4).a(g6Var);
        }
        l45.q qVar5 = t3Var.f243726p;
        if (qVar5 != null) {
            new l45.a((l45.n) qVar5).b(g6Var, 1, java.lang.Boolean.TRUE);
        }
        nu3.i iVar2 = nu3.i.f340218a;
        nu3.i.c(iVar2, "KEY_CLICK_BRUSH_COUNT_INT", 0, 2, null);
        iVar2.b(9);
    }
}
