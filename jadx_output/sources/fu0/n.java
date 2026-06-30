package fu0;

/* loaded from: classes5.dex */
public final class n extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f266802d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fu0.p f266803e;

    /* renamed from: f, reason: collision with root package name */
    public int f266804f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(fu0.p pVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f266803e = pVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f266802d = obj;
        this.f266804f |= Integer.MIN_VALUE;
        return fu0.p.a(this.f266803e, null, this);
    }
}
