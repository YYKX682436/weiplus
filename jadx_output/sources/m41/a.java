package m41;

/* loaded from: classes8.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f323430d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f323431e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m41.b f323432f;

    /* renamed from: g, reason: collision with root package name */
    public int f323433g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(m41.b bVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f323432f = bVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f323431e = obj;
        this.f323433g |= Integer.MIN_VALUE;
        return this.f323432f.d(this);
    }
}
