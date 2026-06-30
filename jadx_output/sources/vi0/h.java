package vi0;

/* loaded from: classes10.dex */
public final class h extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public long f437259d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f437260e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f437261f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ vi0.i f437262g;

    /* renamed from: h, reason: collision with root package name */
    public int f437263h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(vi0.i iVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f437262g = iVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f437261f = obj;
        this.f437263h |= Integer.MIN_VALUE;
        return this.f437262g.a(null, 0L, this);
    }
}
