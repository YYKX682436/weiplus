package te2;

/* loaded from: classes3.dex */
public final class z4 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f418560d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f418561e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ te2.p8 f418562f;

    /* renamed from: g, reason: collision with root package name */
    public int f418563g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(te2.p8 p8Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f418562f = p8Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f418561e = obj;
        this.f418563g |= Integer.MIN_VALUE;
        return te2.p8.O6(this.f418562f, false, this);
    }
}
