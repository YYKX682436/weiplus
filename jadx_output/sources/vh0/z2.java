package vh0;

/* loaded from: classes11.dex */
public final class z2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f437007d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vh0.f3 f437008e;

    /* renamed from: f, reason: collision with root package name */
    public int f437009f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(vh0.f3 f3Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f437008e = f3Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f437007d = obj;
        this.f437009f |= Integer.MIN_VALUE;
        return vh0.f3.Di(this.f437008e, null, 0, this);
    }
}
