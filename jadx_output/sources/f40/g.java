package f40;

/* loaded from: classes12.dex */
public final class g extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f259423d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f259424e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f259425f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f259426g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f40.i f259427h;

    /* renamed from: i, reason: collision with root package name */
    public int f259428i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f40.i iVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f259427h = iVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f259426g = obj;
        this.f259428i |= Integer.MIN_VALUE;
        return this.f259427h.T6(null, null, null, null, false, false, this);
    }
}
