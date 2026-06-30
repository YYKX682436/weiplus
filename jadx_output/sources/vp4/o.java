package vp4;

/* loaded from: classes10.dex */
public final class o extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f439055d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f439056e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f439057f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f439058g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ vp4.p f439059h;

    /* renamed from: i, reason: collision with root package name */
    public int f439060i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(vp4.p pVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f439059h = pVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f439058g = obj;
        this.f439060i |= Integer.MIN_VALUE;
        return this.f439059h.d(null, null, this);
    }
}
