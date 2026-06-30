package tc0;

/* loaded from: classes5.dex */
public final class r extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f417127d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f417128e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tc0.s f417129f;

    /* renamed from: g, reason: collision with root package name */
    public int f417130g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(tc0.s sVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f417129f = sVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f417128e = obj;
        this.f417130g |= Integer.MIN_VALUE;
        return this.f417129f.Ai(0, this);
    }
}
