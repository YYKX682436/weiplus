package rt3;

/* loaded from: classes5.dex */
public final class g extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f399531d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rt3.j f399532e;

    /* renamed from: f, reason: collision with root package name */
    public int f399533f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(rt3.j jVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f399532e = jVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f399531d = obj;
        this.f399533f |= Integer.MIN_VALUE;
        return this.f399532e.b(0, 0, 0, null, false, null, null, this);
    }
}
