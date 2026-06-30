package rt;

/* loaded from: classes9.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f399365d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f399366e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rt.b f399367f;

    /* renamed from: g, reason: collision with root package name */
    public int f399368g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(rt.b bVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f399367f = bVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f399366e = obj;
        this.f399368g |= Integer.MIN_VALUE;
        return this.f399367f.D(null, this);
    }
}
