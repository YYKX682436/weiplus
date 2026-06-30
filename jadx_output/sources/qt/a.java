package qt;

/* loaded from: classes9.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f366479d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f366480e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qt.d f366481f;

    /* renamed from: g, reason: collision with root package name */
    public int f366482g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(qt.d dVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f366481f = dVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f366480e = obj;
        this.f366482g |= Integer.MIN_VALUE;
        return this.f366481f.A(this);
    }
}
