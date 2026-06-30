package us2;

/* loaded from: classes5.dex */
public final class p extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public int f430521d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f430522e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f430523f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ us2.u f430524g;

    /* renamed from: h, reason: collision with root package name */
    public int f430525h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(us2.u uVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f430524g = uVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f430523f = obj;
        this.f430525h |= Integer.MIN_VALUE;
        return this.f430524g.k(0, null, this);
    }
}
