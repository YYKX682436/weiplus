package rt3;

/* loaded from: classes5.dex */
public final class h extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f399534d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rt3.j f399535e;

    /* renamed from: f, reason: collision with root package name */
    public int f399536f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(rt3.j jVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f399535e = jVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f399534d = obj;
        this.f399536f |= Integer.MIN_VALUE;
        return this.f399535e.c(false, null, null, this);
    }
}
