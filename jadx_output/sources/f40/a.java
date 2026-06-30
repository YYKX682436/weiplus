package f40;

/* loaded from: classes12.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f259414d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f259415e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f40.b f259416f;

    /* renamed from: g, reason: collision with root package name */
    public int f259417g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f40.b bVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f259416f = bVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f259415e = obj;
        this.f259417g |= Integer.MIN_VALUE;
        return this.f259416f.T6(null, this);
    }
}
