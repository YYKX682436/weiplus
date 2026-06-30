package hf2;

/* loaded from: classes10.dex */
public final class d1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f281037d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f281038e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f281039f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f281040g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f281041h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f281042i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Object f281043m;

    /* renamed from: n, reason: collision with root package name */
    public int f281044n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f281045o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ hf2.e1 f281046p;

    /* renamed from: q, reason: collision with root package name */
    public int f281047q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(hf2.e1 e1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f281046p = e1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f281045o = obj;
        this.f281047q |= Integer.MIN_VALUE;
        return hf2.e1.a(this.f281046p, null, this);
    }
}
