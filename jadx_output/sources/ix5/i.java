package ix5;

/* loaded from: classes16.dex */
public final class i extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f295643d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f295644e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ix5.h f295645f;

    /* renamed from: g, reason: collision with root package name */
    public int f295646g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ix5.h hVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f295645f = hVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f295644e = obj;
        this.f295646g |= Integer.MIN_VALUE;
        return this.f295645f.b(null, null, null, this);
    }
}
