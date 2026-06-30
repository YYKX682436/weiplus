package vr0;

/* loaded from: classes14.dex */
public final class u extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f439517d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vr0.z f439518e;

    /* renamed from: f, reason: collision with root package name */
    public int f439519f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(vr0.z zVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f439518e = zVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f439517d = obj;
        this.f439519f |= Integer.MIN_VALUE;
        return this.f439518e.p(this);
    }
}
