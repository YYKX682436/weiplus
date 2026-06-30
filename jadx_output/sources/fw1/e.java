package fw1;

/* loaded from: classes14.dex */
public final class e extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f267072d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f267073e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fw1.h f267074f;

    /* renamed from: g, reason: collision with root package name */
    public int f267075g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(fw1.h hVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f267074f = hVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f267073e = obj;
        this.f267075g |= Integer.MIN_VALUE;
        return this.f267074f.b(null, this);
    }
}
