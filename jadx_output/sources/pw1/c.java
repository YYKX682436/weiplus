package pw1;

/* loaded from: classes14.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f358668d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f358669e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pw1.d f358670f;

    /* renamed from: g, reason: collision with root package name */
    public int f358671g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(pw1.d dVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f358670f = dVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f358669e = obj;
        this.f358671g |= Integer.MIN_VALUE;
        return this.f358670f.b(this);
    }
}
