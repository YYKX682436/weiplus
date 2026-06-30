package zi2;

/* loaded from: classes3.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f473126d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f473127e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zi2.w f473128f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f473129g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(xg2.h hVar, kotlin.coroutines.Continuation continuation, kotlin.jvm.internal.c0 c0Var, zi2.w wVar, java.util.HashMap hashMap) {
        super(2, continuation);
        this.f473126d = hVar;
        this.f473127e = c0Var;
        this.f473128f = wVar;
        this.f473129g = hashMap;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new zi2.o(this.f473126d, continuation, this.f473127e, this.f473128f, this.f473129g);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        zi2.o oVar = (zi2.o) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        oVar.invokeSuspend(f0Var);
        return f0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00de, code lost:
    
        if (r2 == null) goto L32;
     */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zi2.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
