package gu0;

/* loaded from: classes5.dex */
public final class i1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f275698d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f275699e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f275700f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gu0.k2 f275701g;

    /* renamed from: h, reason: collision with root package name */
    public int f275702h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(gu0.k2 k2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f275701g = k2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f275700f = obj;
        this.f275702h |= Integer.MIN_VALUE;
        return gu0.k2.h(this.f275701g, this);
    }
}
