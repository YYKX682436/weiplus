package qt;

/* loaded from: classes9.dex */
public final class b extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f366483d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f366484e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qt.d f366485f;

    /* renamed from: g, reason: collision with root package name */
    public int f366486g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(qt.d dVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f366485f = dVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f366484e = obj;
        this.f366486g |= Integer.MIN_VALUE;
        return this.f366485f.B(this);
    }
}
