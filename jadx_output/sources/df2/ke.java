package df2;

/* loaded from: classes3.dex */
public final class ke extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f230573d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f230574e;

    /* renamed from: f, reason: collision with root package name */
    public float f230575f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f230576g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ df2.qe f230577h;

    /* renamed from: i, reason: collision with root package name */
    public int f230578i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ke(df2.qe qeVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f230577h = qeVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f230576g = obj;
        this.f230578i |= Integer.MIN_VALUE;
        return this.f230577h.c7(null, null, this);
    }
}
