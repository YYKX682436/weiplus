package iu;

/* loaded from: classes12.dex */
public final class i extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f294688d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f294689e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f294690f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f294691g;

    /* renamed from: h, reason: collision with root package name */
    public int f294692h;

    /* renamed from: i, reason: collision with root package name */
    public int f294693i;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f294694m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ iu.j f294695n;

    /* renamed from: o, reason: collision with root package name */
    public int f294696o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(iu.j jVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f294695n = jVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f294694m = obj;
        this.f294696o |= Integer.MIN_VALUE;
        return this.f294695n.b(null, this);
    }
}
