package df2;

/* loaded from: classes3.dex */
public final class nq extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f230871d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f230872e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f230873f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f230874g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ df2.ar f230875h;

    /* renamed from: i, reason: collision with root package name */
    public int f230876i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nq(df2.ar arVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f230875h = arVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f230874g = obj;
        this.f230876i |= Integer.MIN_VALUE;
        return df2.ar.Z6(this.f230875h, null, this);
    }
}
