package su0;

/* loaded from: classes5.dex */
public final class q extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f412688d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f412689e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ su0.r f412690f;

    /* renamed from: g, reason: collision with root package name */
    public int f412691g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(su0.r rVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f412690f = rVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f412689e = obj;
        this.f412691g |= Integer.MIN_VALUE;
        return this.f412690f.a(null, this);
    }
}
