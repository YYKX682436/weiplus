package us2;

/* loaded from: classes5.dex */
public final class q extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public int f430526d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f430527e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f430528f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ us2.u f430529g;

    /* renamed from: h, reason: collision with root package name */
    public int f430530h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(us2.u uVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f430529g = uVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f430528f = obj;
        this.f430530h |= Integer.MIN_VALUE;
        return this.f430529g.m(0, null, 0, this);
    }
}
