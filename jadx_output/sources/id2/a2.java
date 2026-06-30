package id2;

/* loaded from: classes2.dex */
public final class a2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f290476d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f290477e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ id2.b2 f290478f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(id2.b2 b2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f290478f = b2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        id2.a2 a2Var = new id2.a2(this.f290478f, continuation);
        a2Var.f290477e = obj;
        return a2Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((id2.a2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f290476d;
        id2.b2 b2Var = this.f290478f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f290477e;
            android.content.Intent intent = b2Var.getActivity().getIntent();
            int intExtra = intent != null ? intent.getIntExtra("KEY_ENTER_LIVE_SCENE_STAMP", 0) : 0;
            id2.z1 z1Var = new id2.z1(16);
            oz5.l f11582e = y0Var.getF11582e();
            int i18 = kotlinx.coroutines.r2.O0;
            zk2.c cVar = new zk2.c(z1Var, (kotlinx.coroutines.r2) f11582e.get(kotlinx.coroutines.q2.f310571d), b2Var.getActivity(), 16, intExtra);
            this.f290476d = 1;
            obj = ay1.l.j(cVar, false, this, 1, null);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        oz5.l f11582e2 = b2Var.getMainScope().getF11582e();
        id2.y1 y1Var = new id2.y1((com.tencent.mm.modelbase.f) obj, b2Var, null);
        this.f290476d = 2;
        if (kotlinx.coroutines.l.g(f11582e2, y1Var, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
