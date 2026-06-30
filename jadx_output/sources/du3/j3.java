package du3;

/* loaded from: classes3.dex */
public final class j3 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ du3.t3 f243636d;

    public j3(du3.t3 t3Var) {
        this.f243636d = t3Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        hk0.e eVar = ((hk0.g) obj).f281734a;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoPreviewPlugin", "doddleState >> doodleType: " + eVar.f281724a + ", ");
        int ordinal = eVar.f281724a.ordinal();
        qk.g6 g6Var = qk.g6.DOODLE;
        du3.t3 t3Var = this.f243636d;
        if (ordinal == 1) {
            l45.q qVar = t3Var.f243726p;
            if (qVar != null) {
                new l45.a((l45.n) qVar).a(g6Var);
            }
            l45.q qVar2 = t3Var.f243726p;
            if (qVar2 != null) {
                new l45.a((l45.n) qVar2).b(g6Var, eVar.f281726c, java.lang.Boolean.TRUE);
                return;
            }
            return;
        }
        if (ordinal != 2) {
            t3Var.G();
            com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoPreviewPlugin", "unSelect all brush");
            return;
        }
        l45.q qVar3 = t3Var.f243726p;
        if (qVar3 != null) {
            new l45.a((l45.n) qVar3).a(g6Var);
        }
        l45.q qVar4 = t3Var.f243726p;
        if (qVar4 != null) {
            new l45.a((l45.n) qVar4).b(g6Var, -3, null);
        }
    }
}
