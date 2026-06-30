package ld2;

/* loaded from: classes15.dex */
public final class h extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f318097d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f318098e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f318099f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f318100g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ld2.i f318101h;

    /* renamed from: i, reason: collision with root package name */
    public int f318102i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ld2.i iVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f318101h = iVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f318100g = obj;
        this.f318102i |= Integer.MIN_VALUE;
        return this.f318101h.c(null, null, this);
    }
}
