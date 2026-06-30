package my0;

/* loaded from: classes5.dex */
public final class b extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f332647d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ my0.e f332648e;

    /* renamed from: f, reason: collision with root package name */
    public int f332649f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(my0.e eVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f332648e = eVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f332647d = obj;
        this.f332649f |= Integer.MIN_VALUE;
        return this.f332648e.h(null, null, 0, this);
    }
}
