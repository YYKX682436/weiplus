package kp;

/* loaded from: classes13.dex */
public final class s0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f310832d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f310833e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kp.i1 f310834f;

    /* renamed from: g, reason: collision with root package name */
    public int f310835g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(kp.i1 i1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f310834f = i1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f310833e = obj;
        this.f310835g |= Integer.MIN_VALUE;
        return this.f310834f.Zi(this);
    }
}
