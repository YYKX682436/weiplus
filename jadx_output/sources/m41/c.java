package m41;

/* loaded from: classes8.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f323438d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f323439e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m41.d f323440f;

    /* renamed from: g, reason: collision with root package name */
    public int f323441g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(m41.d dVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f323440f = dVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f323439e = obj;
        this.f323441g |= Integer.MIN_VALUE;
        return this.f323440f.d(this);
    }
}
