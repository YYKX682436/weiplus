package zx0;

/* loaded from: classes5.dex */
public final class g extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f477008d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f477009e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zx0.j f477010f;

    /* renamed from: g, reason: collision with root package name */
    public int f477011g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(zx0.j jVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f477010f = jVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f477009e = obj;
        this.f477011g |= Integer.MIN_VALUE;
        return this.f477010f.e(this);
    }
}
