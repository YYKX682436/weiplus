package q61;

/* loaded from: classes4.dex */
public final class b extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f360235d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f360236e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f360237f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q61.c f360238g;

    /* renamed from: h, reason: collision with root package name */
    public int f360239h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(q61.c cVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f360238g = cVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f360237f = obj;
        this.f360239h |= Integer.MIN_VALUE;
        return q61.c.a(this.f360238g, null, null, this);
    }
}
