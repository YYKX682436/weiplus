package ud2;

/* loaded from: classes10.dex */
public final class h extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f426619d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f426620e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f426621f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f426622g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ud2.o f426623h;

    /* renamed from: i, reason: collision with root package name */
    public int f426624i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ud2.o oVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f426623h = oVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f426622g = obj;
        this.f426624i |= Integer.MIN_VALUE;
        return ud2.o.a(this.f426623h, this);
    }
}
