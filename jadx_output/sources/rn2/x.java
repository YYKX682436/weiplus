package rn2;

/* loaded from: classes.dex */
public final class x extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f397909d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f397910e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rn2.l0 f397911f;

    /* renamed from: g, reason: collision with root package name */
    public int f397912g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(rn2.l0 l0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f397911f = l0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f397910e = obj;
        this.f397912g |= Integer.MIN_VALUE;
        return this.f397911f.d(null, this);
    }
}
