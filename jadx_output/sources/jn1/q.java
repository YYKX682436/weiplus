package jn1;

/* loaded from: classes12.dex */
public final class q extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f300508d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f300509e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f300510f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f300511g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f300512h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ jn1.u f300513i;

    /* renamed from: m, reason: collision with root package name */
    public int f300514m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(jn1.u uVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f300513i = uVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f300512h = obj;
        this.f300514m |= Integer.MIN_VALUE;
        jn1.o oVar = jn1.u.f300534f;
        return this.f300513i.k(null, 0, null, this);
    }
}
