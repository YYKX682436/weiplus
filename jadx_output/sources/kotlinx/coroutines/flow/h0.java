package kotlinx.coroutines.flow;

/* loaded from: classes14.dex */
public final class h0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f310278d;

    /* renamed from: e, reason: collision with root package name */
    public int f310279e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.i0 f310280f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f310281g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f310282h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f310283i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(kotlinx.coroutines.flow.i0 i0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f310280f = i0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f310278d = obj;
        this.f310279e |= Integer.MIN_VALUE;
        return this.f310280f.a(null, this);
    }
}
