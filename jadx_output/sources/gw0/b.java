package gw0;

/* loaded from: classes5.dex */
public final class b extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f276132d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f276133e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f276134f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gw0.e f276135g;

    /* renamed from: h, reason: collision with root package name */
    public int f276136h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(gw0.e eVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f276135g = eVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f276134f = obj;
        this.f276136h |= Integer.MIN_VALUE;
        return this.f276135g.c(null, null, null, this);
    }
}
