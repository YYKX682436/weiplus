package vh0;

/* loaded from: classes11.dex */
public final class x2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f436997d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vh0.f3 f436998e;

    /* renamed from: f, reason: collision with root package name */
    public int f436999f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(vh0.f3 f3Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f436998e = f3Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f436997d = obj;
        this.f436999f |= Integer.MIN_VALUE;
        return vh0.f3.Bi(this.f436998e, null, 0, null, this);
    }
}
