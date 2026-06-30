package kj1;

/* loaded from: classes7.dex */
public final class l0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f308360d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f308361e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f308362f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kj1.o0 f308363g;

    /* renamed from: h, reason: collision with root package name */
    public int f308364h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(kj1.o0 o0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f308363g = o0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f308362f = obj;
        this.f308364h |= Integer.MIN_VALUE;
        return kj1.o0.a(this.f308363g, null, null, this);
    }
}
