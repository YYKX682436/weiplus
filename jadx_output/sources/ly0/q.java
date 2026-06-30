package ly0;

/* loaded from: classes5.dex */
public final class q extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public long f322231d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f322232e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ly0.v f322233f;

    /* renamed from: g, reason: collision with root package name */
    public int f322234g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(ly0.v vVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f322233f = vVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f322232e = obj;
        this.f322234g |= Integer.MIN_VALUE;
        return this.f322233f.b(null, null, this);
    }
}
