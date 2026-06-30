package sf2;

/* loaded from: classes10.dex */
public final class d1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f407096d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f407097e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f407098f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f407099g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ sf2.e1 f407100h;

    /* renamed from: i, reason: collision with root package name */
    public int f407101i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(sf2.e1 e1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f407100h = e1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f407099g = obj;
        this.f407101i |= Integer.MIN_VALUE;
        return sf2.e1.a7(this.f407100h, null, false, false, this);
    }
}
