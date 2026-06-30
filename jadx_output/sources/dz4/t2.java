package dz4;

/* loaded from: classes12.dex */
public final class t2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public long f245412d;

    /* renamed from: e, reason: collision with root package name */
    public int f245413e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f245414f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dz4.u2 f245415g;

    /* renamed from: h, reason: collision with root package name */
    public int f245416h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(dz4.u2 u2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f245415g = u2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f245414f = obj;
        this.f245416h |= Integer.MIN_VALUE;
        return dz4.u2.b(this.f245415g, 0L, false, this);
    }
}
