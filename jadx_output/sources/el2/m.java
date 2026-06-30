package el2;

/* loaded from: classes3.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f253854d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ el2.i0 f253855e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f253856f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.i23 f253857g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f253858h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(xg2.h hVar, kotlin.coroutines.Continuation continuation, el2.i0 i0Var, java.lang.String str, r45.i23 i23Var, boolean z17) {
        super(2, continuation);
        this.f253854d = hVar;
        this.f253855e = i0Var;
        this.f253856f = str;
        this.f253857g = i23Var;
        this.f253858h = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new el2.m(this.f253854d, continuation, this.f253855e, this.f253856f, this.f253857g, this.f253858h);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        el2.m mVar = (el2.m) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        mVar.invokeSuspend(f0Var);
        return f0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0121  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: el2.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
