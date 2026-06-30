package rt3;

/* loaded from: classes5.dex */
public final class f extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f399528d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rt3.j f399529e;

    /* renamed from: f, reason: collision with root package name */
    public int f399530f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(rt3.j jVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f399529e = jVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f399528d = obj;
        this.f399530f |= Integer.MIN_VALUE;
        return this.f399529e.a(null, 0, 0L, null, null, this);
    }
}
