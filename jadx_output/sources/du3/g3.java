package du3;

/* loaded from: classes3.dex */
public final class g3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f243601d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ du3.t3 f243602e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(java.util.ArrayList arrayList, du3.t3 t3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f243601d = arrayList;
        this.f243602e = t3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new du3.g3(this.f243601d, this.f243602e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        du3.g3 g3Var = (du3.g3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        g3Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        for (hk0.j jVar : this.f243601d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoPreviewPlugin", "collectEventStateJob " + jVar.f281752a);
            qk.g6 g6Var = qk.g6.CROP_PHOTO;
            du3.t3 t3Var = this.f243602e;
            int i17 = jVar.f281752a;
            if (i17 == 5) {
                l45.q qVar = t3Var.f243726p;
                if (qVar != null) {
                    new l45.a((l45.n) qVar).b(g6Var, 0, null);
                }
            } else if (i17 != 6) {
                qk.g6 g6Var2 = qk.g6.DEFAULT;
                if (i17 == 8) {
                    l45.q qVar2 = t3Var.f243726p;
                    if (qVar2 != null) {
                        new l45.a((l45.n) qVar2).a(g6Var2);
                    }
                    l45.q qVar3 = t3Var.f243726p;
                    if (qVar3 != null) {
                        new l45.a((l45.n) qVar3).b(g6Var, 5, null);
                    }
                    hk0.u0.e7(t3Var.E(), 4, null, 2, null);
                } else if (i17 == 9) {
                    l45.q qVar4 = t3Var.f243726p;
                    if (qVar4 != null) {
                        new l45.a((l45.n) qVar4).a(g6Var2);
                    }
                    l45.q qVar5 = t3Var.f243726p;
                    if (qVar5 != null) {
                        new l45.a((l45.n) qVar5).b(g6Var, 4, null);
                    }
                    hk0.u0.e7(t3Var.E(), 4, null, 2, null);
                }
            } else {
                l45.q qVar6 = t3Var.f243726p;
                if (qVar6 != null) {
                    new l45.a((l45.n) qVar6).b(g6Var, 3, null);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
