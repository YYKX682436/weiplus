package v26;

/* loaded from: classes14.dex */
public final class x extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f433070d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v26.y f433071e;

    /* renamed from: f, reason: collision with root package name */
    public int f433072f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(v26.y yVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f433071e = yVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f433070d = obj;
        this.f433072f |= Integer.MIN_VALUE;
        return this.f433071e.emit(null, this);
    }
}
