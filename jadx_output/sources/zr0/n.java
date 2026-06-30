package zr0;

/* loaded from: classes14.dex */
public final class n extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f475156d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f475157e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zr0.p f475158f;

    /* renamed from: g, reason: collision with root package name */
    public int f475159g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(zr0.p pVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f475158f = pVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f475157e = obj;
        this.f475159g |= Integer.MIN_VALUE;
        return this.f475158f.p(null, 0, 0, this);
    }
}
