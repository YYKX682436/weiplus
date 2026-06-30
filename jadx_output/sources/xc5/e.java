package xc5;

/* loaded from: classes12.dex */
public final class e extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f453426d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f453427e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f453428f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f453429g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ xc5.l f453430h;

    /* renamed from: i, reason: collision with root package name */
    public int f453431i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(xc5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f453430h = lVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f453429g = obj;
        this.f453431i |= Integer.MIN_VALUE;
        return xc5.l.V6(this.f453430h, 0, this);
    }
}
