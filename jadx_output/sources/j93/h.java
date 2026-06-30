package j93;

/* loaded from: classes11.dex */
public final class h extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f298395d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f298396e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j93.n f298397f;

    /* renamed from: g, reason: collision with root package name */
    public int f298398g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j93.n nVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f298397f = nVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f298396e = obj;
        this.f298398g |= Integer.MIN_VALUE;
        return this.f298397f.P6(this);
    }
}
