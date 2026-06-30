package mi1;

/* loaded from: classes7.dex */
public final class y2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f326735d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mi1.b3 f326736e;

    /* renamed from: f, reason: collision with root package name */
    public int f326737f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(mi1.b3 b3Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f326736e = b3Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f326735d = obj;
        this.f326737f |= Integer.MIN_VALUE;
        return this.f326736e.a(this);
    }
}
