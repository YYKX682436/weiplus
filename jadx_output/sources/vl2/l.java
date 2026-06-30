package vl2;

/* loaded from: classes10.dex */
public final class l extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f437850d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f437851e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f437852f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ vl2.s f437853g;

    /* renamed from: h, reason: collision with root package name */
    public int f437854h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(vl2.s sVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f437853g = sVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f437852f = obj;
        this.f437854h |= Integer.MIN_VALUE;
        return this.f437853g.b(null, this);
    }
}
