package yd2;

/* loaded from: classes5.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f461041d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yd2.j f461042e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yd2.b f461043f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yd2.n f461044g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(kotlin.coroutines.Continuation continuation, yd2.j jVar, yd2.b bVar, yd2.n nVar) {
        super(3);
        this.f461041d = continuation;
        this.f461042e = jVar;
        this.f461043f = bVar;
        this.f461044g = nVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj3).intValue();
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f461041d.resumeWith(kotlin.Result.m521constructorimpl(this.f461042e.c(this.f461043f, this.f461044g.f461078a, ((java.lang.Boolean) obj).booleanValue(), (java.lang.String) obj2, intValue)));
        return jz5.f0.f302826a;
    }
}
