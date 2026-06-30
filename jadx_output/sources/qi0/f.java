package qi0;

/* loaded from: classes11.dex */
public final class f extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f363474d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qi0.g f363475e;

    /* renamed from: f, reason: collision with root package name */
    public int f363476f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(qi0.g gVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f363475e = gVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f363474d = obj;
        this.f363476f |= Integer.MIN_VALUE;
        return this.f363475e.a(null, null, null, null, this);
    }
}
