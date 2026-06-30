package eu;

/* loaded from: classes12.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f256677d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f256678e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f256679f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ eu.b f256680g;

    /* renamed from: h, reason: collision with root package name */
    public int f256681h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(eu.b bVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f256680g = bVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f256679f = obj;
        this.f256681h |= Integer.MIN_VALUE;
        return this.f256680g.T6(null, this);
    }
}
