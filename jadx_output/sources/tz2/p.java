package tz2;

/* loaded from: classes14.dex */
public final class p extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f423312d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f423313e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f423314f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ tz2.q f423315g;

    /* renamed from: h, reason: collision with root package name */
    public int f423316h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(tz2.q qVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f423315g = qVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f423314f = obj;
        this.f423316h |= Integer.MIN_VALUE;
        return tz2.q.b(this.f423315g, null, this);
    }
}
