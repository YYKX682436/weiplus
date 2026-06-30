package ep4;

/* loaded from: classes10.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f255737d;

    /* renamed from: e, reason: collision with root package name */
    public int f255738e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ep4.j f255739f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f255740g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f255741h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f255742i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ep4.j jVar, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f255739f = jVar;
        this.f255740g = str;
        this.f255741h = m1Var;
        this.f255742i = str2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ep4.e(this.f255739f, this.f255740g, this.f255741h, this.f255742i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ep4.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.internal.c0 c0Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f255738e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.jvm.internal.c0 c0Var2 = new kotlin.jvm.internal.c0();
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
            ep4.d dVar = new ep4.d(c0Var2, this.f255739f, this.f255742i, this.f255740g, null);
            this.f255737d = c0Var2;
            this.f255738e = 1;
            if (kotlinx.coroutines.l.g(p0Var, dVar, this) == aVar) {
                return aVar;
            }
            c0Var = c0Var2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0Var = (kotlin.jvm.internal.c0) this.f255737d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        boolean z17 = c0Var.f310112d;
        ep4.j jVar = this.f255739f;
        com.tencent.mm.modelbase.m1 m1Var = this.f255741h;
        if (z17) {
            long j17 = ((ep4.k) m1Var).f255763i;
            jVar.getClass();
            java.lang.String path = this.f255740g;
            kotlin.jvm.internal.o.g(path, "path");
            zu3.p pVar = jVar.f255752m;
            if (pVar != null) {
                pVar.c(path, j17);
            }
            java.lang.Object obj2 = jVar.f255752m;
            zu3.a aVar2 = obj2 instanceof zu3.a ? (zu3.a) obj2 : null;
            long min = aVar2 != null ? java.lang.Math.min(aVar2.f475760c.c(), jVar.f255749g) : 0L;
            jVar.f255748f.setVisibility(8);
            ju3.c0 c0Var3 = ju3.c0.f301914x2;
            ju3.d0 d0Var = jVar.f465332d;
            ju3.d0.k(d0Var, c0Var3, null, 2, null);
            ju3.c0 c0Var4 = ju3.c0.E2;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putLong("PARAM_1_LONG", min);
            d0Var.w(c0Var4, bundle);
            uo4.a.f429674a.b(111L);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.EditorReadPlugin", "tts remux error, input text:" + ((ep4.k) m1Var).f255758d);
            jVar.A();
        }
        return jz5.f0.f302826a;
    }
}
