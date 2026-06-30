package v14;

/* loaded from: classes5.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f432536d;

    /* renamed from: e, reason: collision with root package name */
    public int f432537e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v14.d f432538f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(v14.d dVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f432538f = dVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f432536d = obj;
        this.f432537e |= Integer.MIN_VALUE;
        return this.f432538f.emit(null, this);
    }
}
