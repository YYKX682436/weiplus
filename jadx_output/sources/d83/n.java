package d83;

/* loaded from: classes2.dex */
public final class n extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f226998d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d83.o f226999e;

    /* renamed from: f, reason: collision with root package name */
    public int f227000f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(d83.o oVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f226999e = oVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f226998d = obj;
        this.f227000f |= Integer.MIN_VALUE;
        return this.f226999e.b(null, 0, false, null, false, this);
    }
}
