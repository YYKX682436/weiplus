package st2;

/* loaded from: classes3.dex */
public final class c1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f412243d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ st2.h1 f412244e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f412245f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f412246g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f412247h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f412248i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(xg2.h hVar, kotlin.coroutines.Continuation continuation, st2.h1 h1Var, boolean z17, android.os.Bundle bundle, boolean z18, int i17) {
        super(2, continuation);
        this.f412243d = hVar;
        this.f412244e = h1Var;
        this.f412245f = z17;
        this.f412246g = bundle;
        this.f412247h = z18;
        this.f412248i = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new st2.c1(this.f412243d, continuation, this.f412244e, this.f412245f, this.f412246g, this.f412247h, this.f412248i);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        st2.c1 c1Var = (st2.c1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        c1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:212:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0942  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x096f  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r71) {
        /*
            Method dump skipped, instructions count: 2566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: st2.c1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
