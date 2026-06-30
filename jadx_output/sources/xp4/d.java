package xp4;

/* loaded from: classes10.dex */
public final class d extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f455951d;

    /* renamed from: e, reason: collision with root package name */
    public long f455952e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f455953f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xp4.e f455954g;

    /* renamed from: h, reason: collision with root package name */
    public int f455955h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(xp4.e eVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f455954g = eVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f455953f = obj;
        this.f455955h |= Integer.MIN_VALUE;
        return this.f455954g.b(this);
    }
}
