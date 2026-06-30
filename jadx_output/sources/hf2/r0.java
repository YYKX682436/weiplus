package hf2;

/* loaded from: classes5.dex */
public final class r0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f281153d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f281154e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f281155f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f281156g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ hf2.y0 f281157h;

    /* renamed from: i, reason: collision with root package name */
    public int f281158i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(hf2.y0 y0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f281157h = y0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f281156g = obj;
        this.f281158i |= Integer.MIN_VALUE;
        return this.f281157h.d(null, this);
    }
}
