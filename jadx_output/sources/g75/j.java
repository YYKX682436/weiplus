package g75;

/* loaded from: classes10.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f269376d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f269377e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f269378f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f269379g;

    /* renamed from: h, reason: collision with root package name */
    public int f269380h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f269381i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.util.List f269382m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ g75.z f269383n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f269384o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(kotlin.jvm.internal.h0 h0Var, java.util.List list, g75.z zVar, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f269381i = h0Var;
        this.f269382m = list;
        this.f269383n = zVar;
        this.f269384o = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new g75.j(this.f269381i, this.f269382m, this.f269383n, this.f269384o, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((g75.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f269380h;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            g75.z zVar = this.f269383n;
            java.lang.String str = this.f269384o;
            kotlin.jvm.internal.h0 h0Var = this.f269381i;
            this.f269376d = h0Var;
            java.util.List list = this.f269382m;
            this.f269377e = list;
            this.f269378f = zVar;
            this.f269379g = str;
            this.f269380h = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            g75.r rVar2 = new g75.r(kz5.n0.X0(list), zVar, str, new g75.h(h0Var, new v65.n(rVar)), false, 16, null);
            rVar2.d();
            h0Var.f310123d = rVar2;
            rVar.m(new g75.i(h0Var));
            obj = rVar.j();
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
