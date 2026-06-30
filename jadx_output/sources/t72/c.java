package t72;

/* loaded from: classes4.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f416042d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t72.l f416043e;

    /* renamed from: f, reason: collision with root package name */
    public int f416044f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(t72.l lVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f416043e = lVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f416042d = obj;
        this.f416044f |= Integer.MIN_VALUE;
        return this.f416043e.T6(null, this);
    }
}
