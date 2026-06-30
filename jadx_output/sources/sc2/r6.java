package sc2;

/* loaded from: classes2.dex */
public final class r6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ad2.h f406198d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sc2.v6 f406199e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f406200f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f406201g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ sc2.r7 f406202h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(ad2.h hVar, sc2.v6 v6Var, android.view.View view, xc2.p0 p0Var, sc2.r7 r7Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f406198d = hVar;
        this.f406199e = v6Var;
        this.f406200f = view;
        this.f406201g = p0Var;
        this.f406202h = r7Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sc2.r6(this.f406198d, this.f406199e, this.f406200f, this.f406201g, this.f406202h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        sc2.r6 r6Var = (sc2.r6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        r6Var.invokeSuspend(f0Var);
        return f0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x012d  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sc2.r6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
