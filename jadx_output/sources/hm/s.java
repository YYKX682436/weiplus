package hm;

/* loaded from: classes12.dex */
public final class s extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f282169d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f282170e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f282171f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hm.u f282172g;

    /* renamed from: h, reason: collision with root package name */
    public int f282173h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(hm.u uVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f282172g = uVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f282171f = obj;
        this.f282173h |= Integer.MIN_VALUE;
        return this.f282172g.U6(null, this);
    }
}
