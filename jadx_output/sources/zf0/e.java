package zf0;

/* loaded from: classes12.dex */
public final class e extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f472399d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f472400e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zf0.v0 f472401f;

    /* renamed from: g, reason: collision with root package name */
    public int f472402g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(zf0.v0 v0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f472401f = v0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f472400e = obj;
        this.f472402g |= Integer.MIN_VALUE;
        return zf0.v0.u(this.f472401f, null, null, null, null, this);
    }
}
