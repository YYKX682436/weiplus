package wt3;

/* loaded from: classes5.dex */
public final class p extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f449464d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wt3.q f449465e;

    /* renamed from: f, reason: collision with root package name */
    public int f449466f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(wt3.q qVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f449465e = qVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f449464d = obj;
        this.f449466f |= Integer.MIN_VALUE;
        return this.f449465e.f(this);
    }
}
