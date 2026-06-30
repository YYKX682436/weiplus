package g40;

/* loaded from: classes12.dex */
public final class d extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f268670d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g40.g f268671e;

    /* renamed from: f, reason: collision with root package name */
    public int f268672f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g40.g gVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f268671e = gVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f268670d = obj;
        this.f268672f |= Integer.MIN_VALUE;
        return this.f268671e.i(null, this);
    }
}
