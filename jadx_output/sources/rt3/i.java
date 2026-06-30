package rt3;

/* loaded from: classes5.dex */
public final class i extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f399537d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rt3.j f399538e;

    /* renamed from: f, reason: collision with root package name */
    public int f399539f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(rt3.j jVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f399538e = jVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f399537d = obj;
        this.f399539f |= Integer.MIN_VALUE;
        return this.f399538e.d(0, this);
    }
}
