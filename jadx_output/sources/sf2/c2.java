package sf2;

/* loaded from: classes10.dex */
public final class c2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f407074d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f407075e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f407076f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f407077g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f407078h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f407079i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ sf2.d3 f407080m;

    /* renamed from: n, reason: collision with root package name */
    public int f407081n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(sf2.d3 d3Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f407080m = d3Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f407079i = obj;
        this.f407081n |= Integer.MIN_VALUE;
        return this.f407080m.d7(null, null, null, this);
    }
}
