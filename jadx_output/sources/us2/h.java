package us2;

/* loaded from: classes5.dex */
public final class h extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f430486d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f430487e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f430488f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f430489g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ us2.u f430490h;

    /* renamed from: i, reason: collision with root package name */
    public int f430491i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(us2.u uVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f430490h = uVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f430489g = obj;
        this.f430491i |= Integer.MIN_VALUE;
        return this.f430490h.e(null, false, this);
    }
}
