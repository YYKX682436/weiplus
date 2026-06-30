package ez;

/* loaded from: classes9.dex */
public final class d extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f257718d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ez.e f257719e;

    /* renamed from: f, reason: collision with root package name */
    public int f257720f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ez.e eVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f257719e = eVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f257718d = obj;
        this.f257720f |= Integer.MIN_VALUE;
        return this.f257719e.oj(null, this);
    }
}
