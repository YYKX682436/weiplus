package cq2;

/* loaded from: classes2.dex */
public final class l extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f221415d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f221416e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cq2.q f221417f;

    /* renamed from: g, reason: collision with root package name */
    public int f221418g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(cq2.q qVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f221417f = qVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f221416e = obj;
        this.f221418g |= Integer.MIN_VALUE;
        return this.f221417f.f(null, this);
    }
}
