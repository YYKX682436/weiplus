package hr3;

/* loaded from: classes12.dex */
public final class rf extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f283953d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hr3.ag f283954e;

    /* renamed from: f, reason: collision with root package name */
    public int f283955f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rf(hr3.ag agVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f283954e = agVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f283953d = obj;
        this.f283955f |= Integer.MIN_VALUE;
        return this.f283954e.b(null, null, null, this);
    }
}
