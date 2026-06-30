package e00;

/* loaded from: classes9.dex */
public final class h0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f245775d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f245776e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e00.k0 f245777f;

    /* renamed from: g, reason: collision with root package name */
    public int f245778g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(e00.k0 k0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f245777f = k0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f245776e = obj;
        this.f245778g |= Integer.MIN_VALUE;
        return this.f245777f.c(null, null, null, null, this);
    }
}
