package gc0;

/* loaded from: classes5.dex */
public final class o1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f270231d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gc0.p2 f270232e;

    /* renamed from: f, reason: collision with root package name */
    public int f270233f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(gc0.p2 p2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f270232e = p2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f270231d = obj;
        this.f270233f |= Integer.MIN_VALUE;
        return gc0.p2.P6(this.f270232e, null, this);
    }
}
