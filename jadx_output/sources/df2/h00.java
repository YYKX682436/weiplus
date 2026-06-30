package df2;

/* loaded from: classes3.dex */
public final class h00 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f230270d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f230271e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f230272f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ df2.m00 f230273g;

    /* renamed from: h, reason: collision with root package name */
    public int f230274h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h00(df2.m00 m00Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f230273g = m00Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f230272f = obj;
        this.f230274h |= Integer.MIN_VALUE;
        return df2.m00.Z6(this.f230273g, 0, this);
    }
}
