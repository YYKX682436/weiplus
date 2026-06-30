package rn2;

/* loaded from: classes15.dex */
public final class x0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f397913d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f397914e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f397915f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rn2.c1 f397916g;

    /* renamed from: h, reason: collision with root package name */
    public int f397917h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(rn2.c1 c1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f397916g = c1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f397915f = obj;
        this.f397917h |= Integer.MIN_VALUE;
        return this.f397916g.s(this);
    }
}
