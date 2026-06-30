package v14;

/* loaded from: classes5.dex */
public final class r extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f432580d;

    /* renamed from: e, reason: collision with root package name */
    public int f432581e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v14.s f432582f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(v14.s sVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f432582f = sVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f432580d = obj;
        this.f432581e |= Integer.MIN_VALUE;
        return this.f432582f.emit(null, this);
    }
}
