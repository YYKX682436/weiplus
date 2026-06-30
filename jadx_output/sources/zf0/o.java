package zf0;

/* loaded from: classes12.dex */
public final class o extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f472491d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f472492e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zf0.v0 f472493f;

    /* renamed from: g, reason: collision with root package name */
    public int f472494g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(zf0.v0 v0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f472493f = v0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f472492e = obj;
        this.f472494g |= Integer.MIN_VALUE;
        return zf0.v0.E(this.f472493f, null, this);
    }
}
