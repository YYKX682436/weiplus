package vr0;

/* loaded from: classes14.dex */
public final class h extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f439471d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f439472e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f439473f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f439474g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ vr0.z f439475h;

    /* renamed from: i, reason: collision with root package name */
    public int f439476i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(vr0.z zVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f439475h = zVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f439474g = obj;
        this.f439476i |= Integer.MIN_VALUE;
        return vr0.z.I(this.f439475h, null, this);
    }
}
