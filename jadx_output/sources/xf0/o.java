package xf0;

/* loaded from: classes12.dex */
public final class o extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f454201d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f454202e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f454203f;

    /* renamed from: g, reason: collision with root package name */
    public long f454204g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f454205h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ xf0.s f454206i;

    /* renamed from: m, reason: collision with root package name */
    public int f454207m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(xf0.s sVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f454206i = sVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f454205h = obj;
        this.f454207m |= Integer.MIN_VALUE;
        return this.f454206i.T6(null, this);
    }
}
