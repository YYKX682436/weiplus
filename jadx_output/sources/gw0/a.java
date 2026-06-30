package gw0;

/* loaded from: classes5.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f276129d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gw0.e f276130e;

    /* renamed from: f, reason: collision with root package name */
    public int f276131f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(gw0.e eVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f276130e = eVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f276129d = obj;
        this.f276131f |= Integer.MIN_VALUE;
        return this.f276130e.b(0, this);
    }
}
