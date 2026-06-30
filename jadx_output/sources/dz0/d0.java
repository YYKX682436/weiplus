package dz0;

/* loaded from: classes5.dex */
public final class d0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f244802d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f244803e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dz0.e0 f244804f;

    /* renamed from: g, reason: collision with root package name */
    public int f244805g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(dz0.e0 e0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f244804f = e0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f244803e = obj;
        this.f244805g |= Integer.MIN_VALUE;
        return this.f244804f.d(this);
    }
}
