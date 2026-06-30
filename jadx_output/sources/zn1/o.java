package zn1;

/* loaded from: classes11.dex */
public final class o extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f474458d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f474459e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f474460f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f474461g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ zn1.p f474462h;

    /* renamed from: i, reason: collision with root package name */
    public int f474463i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(zn1.p pVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f474462h = pVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f474461g = obj;
        this.f474463i |= Integer.MIN_VALUE;
        return this.f474462h.b(null, this);
    }
}
