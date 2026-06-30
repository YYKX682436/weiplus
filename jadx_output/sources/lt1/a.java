package lt1;

/* loaded from: classes11.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f321180d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lt1.d f321181e;

    /* renamed from: f, reason: collision with root package name */
    public int f321182f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(lt1.d dVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f321181e = dVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f321180d = obj;
        this.f321182f |= Integer.MIN_VALUE;
        return this.f321181e.f(null, false, null, this);
    }
}
