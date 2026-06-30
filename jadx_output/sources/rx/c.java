package rx;

/* loaded from: classes11.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f400655d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rx.f f400656e;

    /* renamed from: f, reason: collision with root package name */
    public int f400657f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(rx.f fVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f400656e = fVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f400655d = obj;
        this.f400657f |= Integer.MIN_VALUE;
        return this.f400656e.Ni(null, this);
    }
}
