package iu;

/* loaded from: classes12.dex */
public final class o extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f294727d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f294728e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f294729f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ iu.r f294730g;

    /* renamed from: h, reason: collision with root package name */
    public int f294731h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(iu.r rVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f294730g = rVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f294729f = obj;
        this.f294731h |= Integer.MIN_VALUE;
        return this.f294730g.b(null, this);
    }
}
