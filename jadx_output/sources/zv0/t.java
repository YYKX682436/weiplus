package zv0;

/* loaded from: classes5.dex */
public final class t extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f476225d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zv0.y f476226e;

    /* renamed from: f, reason: collision with root package name */
    public int f476227f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(zv0.y yVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f476226e = yVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f476225d = obj;
        this.f476227f |= Integer.MIN_VALUE;
        return this.f476226e.b(0, this);
    }
}
