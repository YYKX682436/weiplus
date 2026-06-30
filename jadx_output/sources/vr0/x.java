package vr0;

/* loaded from: classes14.dex */
public final class x extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f439524d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f439525e;

    /* renamed from: f, reason: collision with root package name */
    public long f439526f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f439527g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ vr0.z f439528h;

    /* renamed from: i, reason: collision with root package name */
    public int f439529i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(vr0.z zVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f439528h = zVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f439527g = obj;
        this.f439529i |= Integer.MIN_VALUE;
        return this.f439528h.l(0, 0, 0, false, this);
    }
}
