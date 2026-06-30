package zr0;

/* loaded from: classes14.dex */
public final class l extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f475150d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f475151e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zr0.p f475152f;

    /* renamed from: g, reason: collision with root package name */
    public int f475153g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(zr0.p pVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f475152f = pVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f475151e = obj;
        this.f475153g |= Integer.MIN_VALUE;
        return this.f475152f.o(null, this);
    }
}
