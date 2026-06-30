package xw0;

/* loaded from: classes5.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f457584d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f457585e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f457586f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f457587g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f457588h;

    /* renamed from: i, reason: collision with root package name */
    public int f457589i;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f457590m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ xw0.r f457591n;

    /* renamed from: o, reason: collision with root package name */
    public int f457592o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(xw0.r rVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f457591n = rVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f457590m = obj;
        this.f457592o |= Integer.MIN_VALUE;
        return this.f457591n.j(null, null, null, this);
    }
}
