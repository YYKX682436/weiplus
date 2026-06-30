package us2;

/* loaded from: classes5.dex */
public final class k extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public int f430497d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f430498e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f430499f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ us2.u f430500g;

    /* renamed from: h, reason: collision with root package name */
    public int f430501h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(us2.u uVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f430500g = uVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f430499f = obj;
        this.f430501h |= Integer.MIN_VALUE;
        return this.f430500g.g(0, 0, null, this);
    }
}
