package dk2;

/* loaded from: classes3.dex */
public final class x3 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f234301d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f234302e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f234303f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f234304g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f234305h;

    /* renamed from: i, reason: collision with root package name */
    public int f234306i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(dk2.r4 r4Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f234305h = r4Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f234304g = obj;
        this.f234306i |= Integer.MIN_VALUE;
        return this.f234305h.t0(null, null, null, null, this);
    }
}
