package pz0;

/* loaded from: classes5.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f359114d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f359115e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pz0.m f359116f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f359117g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f359118h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f359119i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(pz0.m mVar, java.lang.String str, java.lang.String str2, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f359116f = mVar;
        this.f359117g = str;
        this.f359118h = str2;
        this.f359119i = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        pz0.d dVar = new pz0.d(this.f359116f, this.f359117g, this.f359118h, this.f359119i, continuation);
        dVar.f359115e = obj;
        return dVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pz0.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.j b17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f359114d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
            az0.n7 n7Var = this.f359116f.f359150g;
            yz5.l lVar = this.f359119i;
            if (n7Var == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Maas.MaasSdkApiFlutterPlugin", "recreateCreation: movieSessionManager is null");
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE)));
                return f0Var;
            }
            java.lang.String str = this.f359117g;
            boolean z17 = str.length() == 0;
            java.lang.String str2 = this.f359118h;
            if (z17) {
                if (str2.length() == 0) {
                    str2 = null;
                }
                b17 = az0.rc.b("222", new az0.i6(n7Var, str2), new az0.l6(n7Var), false);
            } else {
                if (str2.length() == 0) {
                    str2 = null;
                }
                b17 = az0.rc.b("221", new az0.q6(str, n7Var, str2), new az0.t6(n7Var), false);
            }
            kotlinx.coroutines.flow.g0 g0Var = new kotlinx.coroutines.flow.g0(new kotlinx.coroutines.flow.l0(b17, new pz0.a(lVar, c0Var, null)), new pz0.b(c0Var, lVar, null));
            pz0.c cVar = pz0.c.f359113d;
            this.f359114d = 1;
            if (g0Var.a(cVar, this) == aVar) {
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
