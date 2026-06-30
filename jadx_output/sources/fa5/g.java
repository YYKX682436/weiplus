package fa5;

/* loaded from: classes7.dex */
public final class g extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f260805d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f260806e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f260807f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f260808g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f260809h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ fa5.j f260810i;

    /* renamed from: m, reason: collision with root package name */
    public int f260811m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(fa5.j jVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f260810i = jVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f260809h = obj;
        this.f260811m |= Integer.MIN_VALUE;
        return this.f260810i.Bi(null, null, false, this);
    }
}
