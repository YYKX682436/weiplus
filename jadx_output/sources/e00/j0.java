package e00;

/* loaded from: classes9.dex */
public final class j0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f245784d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f245785e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e00.k0 f245786f;

    /* renamed from: g, reason: collision with root package name */
    public int f245787g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(e00.k0 k0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f245786f = k0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f245785e = obj;
        this.f245787g |= Integer.MIN_VALUE;
        return this.f245786f.d(null, null, null, this);
    }
}
