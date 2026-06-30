package uj5;

/* loaded from: classes5.dex */
public final class l extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f428467d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f428468e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f428469f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f428470g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f428471h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ uj5.n f428472i;

    /* renamed from: m, reason: collision with root package name */
    public int f428473m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(uj5.n nVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f428472i = nVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f428471h = obj;
        this.f428473m |= Integer.MIN_VALUE;
        return this.f428472i.a(null, null, this);
    }
}
