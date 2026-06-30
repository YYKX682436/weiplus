package tx2;

/* loaded from: classes15.dex */
public final class j extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f422598d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tx2.k f422599e;

    /* renamed from: f, reason: collision with root package name */
    public int f422600f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(tx2.k kVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f422599e = kVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f422598d = obj;
        this.f422600f |= Integer.MIN_VALUE;
        return this.f422599e.e(null, this);
    }
}
