package ud2;

/* loaded from: classes10.dex */
public final class w extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f426657d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f426658e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f426659f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f426660g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ud2.c0 f426661h;

    /* renamed from: i, reason: collision with root package name */
    public int f426662i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(ud2.c0 c0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f426661h = c0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f426660g = obj;
        this.f426662i |= Integer.MIN_VALUE;
        return ud2.c0.b(this.f426661h, this);
    }
}
