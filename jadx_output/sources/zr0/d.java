package zr0;

/* loaded from: classes14.dex */
public final class d extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f475116d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f475117e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zr0.p f475118f;

    /* renamed from: g, reason: collision with root package name */
    public int f475119g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(zr0.p pVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f475118f = pVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f475117e = obj;
        this.f475119g |= Integer.MIN_VALUE;
        return this.f475118f.i(null, this);
    }
}
