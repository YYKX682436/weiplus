package rn2;

/* loaded from: classes.dex */
public final class c0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f397659d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f397660e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f397661f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rn2.l0 f397662g;

    /* renamed from: h, reason: collision with root package name */
    public int f397663h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(rn2.l0 l0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f397662g = l0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f397661f = obj;
        this.f397663h |= Integer.MIN_VALUE;
        return rn2.l0.b(this.f397662g, null, this);
    }
}
