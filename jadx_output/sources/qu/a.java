package qu;

/* loaded from: classes5.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f366710d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f366711e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qu.b f366712f;

    /* renamed from: g, reason: collision with root package name */
    public int f366713g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(qu.b bVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f366712f = bVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f366711e = obj;
        this.f366713g |= Integer.MIN_VALUE;
        return this.f366712f.D(null, this);
    }
}
