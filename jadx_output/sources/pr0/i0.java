package pr0;

/* loaded from: classes14.dex */
public final class i0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f357850d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pr0.n0 f357851e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.Surface f357852f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f357853g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f357854h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(pr0.n0 n0Var, android.view.Surface surface, java.lang.Integer num, java.lang.Integer num2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f357851e = n0Var;
        this.f357852f = surface;
        this.f357853g = num;
        this.f357854h = num2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pr0.i0(this.f357851e, this.f357852f, this.f357853g, this.f357854h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pr0.i0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f357850d;
        pr0.n0 n0Var = this.f357851e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            nr0.x k17 = n0Var.k();
            this.f357850d = 1;
            android.view.Surface surface = this.f357852f;
            java.lang.Integer num = this.f357853g;
            java.lang.Integer num2 = this.f357854h;
            k17.getClass();
            if (k17.m("bindSurface", new nr0.f(surface, k17, num, num2, null), this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.autogen.mmdata.rpt.CameraReportStruct a17 = as0.a.f13425a.a(n0Var.f357833d);
        if (a17 != null) {
            a17.f55575x = a17.b("ScreenViewType", "surface", true);
        }
        return jz5.f0.f302826a;
    }
}
