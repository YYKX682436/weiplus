package su0;

/* loaded from: classes5.dex */
public final class o extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f412677d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ su0.r f412678e;

    /* renamed from: f, reason: collision with root package name */
    public int f412679f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(su0.r rVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f412678e = rVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f412677d = obj;
        this.f412679f |= Integer.MIN_VALUE;
        return this.f412678e.d(null, this);
    }
}
