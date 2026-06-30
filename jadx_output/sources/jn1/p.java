package jn1;

/* loaded from: classes12.dex */
public final class p extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f300498d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f300499e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f300500f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f300501g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f300502h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f300503i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Object f300504m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f300505n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ jn1.u f300506o;

    /* renamed from: p, reason: collision with root package name */
    public int f300507p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(jn1.u uVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f300506o = uVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f300505n = obj;
        this.f300507p |= Integer.MIN_VALUE;
        jn1.o oVar = jn1.u.f300534f;
        return this.f300506o.j(null, null, this);
    }
}
