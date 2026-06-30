package jd3;

/* loaded from: classes7.dex */
public final class b extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f299165d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f299166e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f299167f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f299168g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f299169h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ jd3.g f299170i;

    /* renamed from: m, reason: collision with root package name */
    public int f299171m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(jd3.g gVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f299170i = gVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f299169h = obj;
        this.f299171m |= Integer.MIN_VALUE;
        return jd3.g.u(this.f299170i, null, null, null, this);
    }
}
