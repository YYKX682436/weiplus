package hc2;

/* loaded from: classes10.dex */
public final class z extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f280349d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f280350e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f280351f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(android.content.Context context, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f280351f = context;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        hc2.z zVar = new hc2.z(this.f280351f, continuation);
        zVar.f280350e = obj;
        return zVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((hc2.z) create((u26.r0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f280349d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            u26.r0 r0Var = (u26.r0) this.f280350e;
            android.content.Context context = this.f280351f;
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            fc2.c n17 = nyVar != null ? zy2.ra.n1(nyVar, 0, 1, null) : null;
            if (n17 == null) {
                u26.x0.a(r0Var, null, 1, null);
                return f0Var;
            }
            hc2.y yVar = new hc2.y(r0Var);
            n17.a(yVar);
            hc2.x xVar = new hc2.x(n17, yVar);
            this.f280349d = 1;
            if (u26.p0.a(r0Var, xVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return f0Var;
    }
}
