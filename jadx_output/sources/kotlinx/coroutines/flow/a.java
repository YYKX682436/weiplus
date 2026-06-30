package kotlinx.coroutines.flow;

/* loaded from: classes14.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f310185d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f310186e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.b f310187f;

    /* renamed from: g, reason: collision with root package name */
    public int f310188g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(kotlinx.coroutines.flow.b bVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f310187f = bVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f310186e = obj;
        this.f310188g |= Integer.MIN_VALUE;
        return this.f310187f.a(null, this);
    }
}
