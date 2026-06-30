package vh4;

/* loaded from: classes.dex */
public final class d extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f437061d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vh4.e f437062e;

    /* renamed from: f, reason: collision with root package name */
    public int f437063f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(vh4.e eVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f437062e = eVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f437061d = obj;
        this.f437063f |= Integer.MIN_VALUE;
        return this.f437062e.a(this);
    }
}
