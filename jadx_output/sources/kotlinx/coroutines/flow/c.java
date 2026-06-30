package kotlinx.coroutines.flow;

/* loaded from: classes14.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f310212d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f310213e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.d f310214f;

    /* renamed from: g, reason: collision with root package name */
    public int f310215g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(kotlinx.coroutines.flow.d dVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f310214f = dVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f310213e = obj;
        this.f310215g |= Integer.MIN_VALUE;
        return this.f310214f.f(null, this);
    }
}
