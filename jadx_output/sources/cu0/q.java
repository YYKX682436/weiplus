package cu0;

/* loaded from: classes5.dex */
public final class q extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f222331d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cu0.x f222332e;

    /* renamed from: f, reason: collision with root package name */
    public int f222333f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(cu0.x xVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f222332e = xVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f222331d = obj;
        this.f222333f |= Integer.MIN_VALUE;
        return cu0.x.a(this.f222332e, null, this);
    }
}
