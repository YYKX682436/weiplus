package df2;

/* loaded from: classes3.dex */
public final class oq extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f230995d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.rq f230996e;

    /* renamed from: f, reason: collision with root package name */
    public int f230997f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oq(df2.rq rqVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f230996e = rqVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f230995d = obj;
        this.f230997f |= Integer.MIN_VALUE;
        return this.f230996e.q(this);
    }
}
