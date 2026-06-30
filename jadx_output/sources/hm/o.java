package hm;

/* loaded from: classes12.dex */
public final class o extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f282159d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f282160e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f282161f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hm.u f282162g;

    /* renamed from: h, reason: collision with root package name */
    public int f282163h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(hm.u uVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f282162g = uVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f282161f = obj;
        this.f282163h |= Integer.MIN_VALUE;
        return this.f282162g.T6(null, null, this);
    }
}
