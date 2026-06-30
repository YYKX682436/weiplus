package gu0;

/* loaded from: classes5.dex */
public final class g1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f275678d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f275679e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f275680f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gu0.k2 f275681g;

    /* renamed from: h, reason: collision with root package name */
    public int f275682h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(gu0.k2 k2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f275681g = k2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f275680f = obj;
        this.f275682h |= Integer.MIN_VALUE;
        return gu0.k2.g(this.f275681g, null, this);
    }
}
