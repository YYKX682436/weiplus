package cv0;

/* loaded from: classes5.dex */
public final class b extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f222524d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f222525e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cv0.c f222526f;

    /* renamed from: g, reason: collision with root package name */
    public int f222527g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(cv0.c cVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f222526f = cVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f222525e = obj;
        this.f222527g |= Integer.MIN_VALUE;
        return this.f222526f.q(false, this);
    }
}
