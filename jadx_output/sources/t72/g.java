package t72;

/* loaded from: classes4.dex */
public final class g extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f416057d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t72.l f416058e;

    /* renamed from: f, reason: collision with root package name */
    public int f416059f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(t72.l lVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f416058e = lVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f416057d = obj;
        this.f416059f |= Integer.MIN_VALUE;
        return this.f416058e.X6(null, this);
    }
}
