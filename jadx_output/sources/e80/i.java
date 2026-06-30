package e80;

/* loaded from: classes12.dex */
public final class i extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f250021d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e80.r f250022e;

    /* renamed from: f, reason: collision with root package name */
    public int f250023f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(e80.r rVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f250022e = rVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f250021d = obj;
        this.f250023f |= Integer.MIN_VALUE;
        return this.f250022e.W6(null, null, this);
    }
}
