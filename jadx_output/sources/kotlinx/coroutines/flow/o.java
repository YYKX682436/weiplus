package kotlinx.coroutines.flow;

/* loaded from: classes16.dex */
public final class o extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f310340d;

    /* renamed from: e, reason: collision with root package name */
    public int f310341e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.p f310342f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f310343g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f310344h;

    /* renamed from: i, reason: collision with root package name */
    public int f310345i;

    /* renamed from: m, reason: collision with root package name */
    public int f310346m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(kotlinx.coroutines.flow.p pVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f310342f = pVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f310340d = obj;
        this.f310341e |= Integer.MIN_VALUE;
        return this.f310342f.a(null, this);
    }
}
