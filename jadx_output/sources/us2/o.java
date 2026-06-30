package us2;

/* loaded from: classes5.dex */
public final class o extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f430517d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f430518e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ us2.u f430519f;

    /* renamed from: g, reason: collision with root package name */
    public int f430520g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(us2.u uVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f430519f = uVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f430518e = obj;
        this.f430520g |= Integer.MIN_VALUE;
        return this.f430519f.j(0, null, false, this);
    }
}
