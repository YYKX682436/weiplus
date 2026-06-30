package nu0;

/* loaded from: classes5.dex */
public final class a1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f339860d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f339861e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nu0.b1 f339862f;

    /* renamed from: g, reason: collision with root package name */
    public int f339863g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(nu0.b1 b1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f339862f = b1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f339861e = obj;
        this.f339863g |= Integer.MIN_VALUE;
        return this.f339862f.r7(false, this);
    }
}
