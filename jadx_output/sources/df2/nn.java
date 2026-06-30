package df2;

/* loaded from: classes10.dex */
public final class nn extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f230865d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.un f230866e;

    /* renamed from: f, reason: collision with root package name */
    public int f230867f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nn(df2.un unVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f230866e = unVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f230865d = obj;
        this.f230867f |= Integer.MIN_VALUE;
        return this.f230866e.a7(null, false, this);
    }
}
