package kotlinx.coroutines.flow;

/* loaded from: classes10.dex */
public final class m extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f310317d;

    /* renamed from: e, reason: collision with root package name */
    public int f310318e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.n f310319f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f310320g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f310321h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(kotlinx.coroutines.flow.n nVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f310319f = nVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f310317d = obj;
        this.f310318e |= Integer.MIN_VALUE;
        return this.f310319f.a(null, this);
    }
}
