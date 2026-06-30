package gl4;

/* loaded from: classes4.dex */
public final class w extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public int f272885d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gl4.z f272886e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.u80 f272887f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gl4.a f272888g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(gl4.z zVar, bw5.u80 u80Var, gl4.a aVar, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f272886e = zVar;
        this.f272887f = u80Var;
        this.f272888g = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new gl4.w(this.f272886e, this.f272887f, this.f272888g, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return ((gl4.w) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f272885d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            bw5.u80 packageInfo = this.f272887f;
            kotlin.jvm.internal.o.f(packageInfo, "$packageInfo");
            gl4.a aVar2 = this.f272888g;
            this.f272885d = 1;
            gl4.z zVar = this.f272886e;
            zVar.getClass();
            oz5.n nVar = new oz5.n(pz5.f.b(this));
            if (aVar2 != null) {
                aVar2.f272842a = packageInfo;
            }
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new gl4.j(zVar, packageInfo, aVar2, nVar, null), 3, null);
            obj = nVar.a();
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
