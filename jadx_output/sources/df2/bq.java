package df2;

/* loaded from: classes3.dex */
public final class bq extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f229821d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f229822e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f229823f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f229824g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ df2.gq f229825h;

    /* renamed from: i, reason: collision with root package name */
    public int f229826i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bq(df2.gq gqVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f229825h = gqVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f229824g = obj;
        this.f229826i |= Integer.MIN_VALUE;
        return df2.gq.Z6(this.f229825h, this);
    }
}
