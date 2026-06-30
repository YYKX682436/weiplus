package gu0;

/* loaded from: classes5.dex */
public final class o0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f275774d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f275775e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gu0.k2 f275776f;

    /* renamed from: g, reason: collision with root package name */
    public int f275777g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(gu0.k2 k2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f275776f = k2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f275775e = obj;
        this.f275777g |= Integer.MIN_VALUE;
        return this.f275776f.o(this);
    }
}
