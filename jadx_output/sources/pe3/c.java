package pe3;

/* loaded from: classes7.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f353639d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pe3.f f353640e;

    /* renamed from: f, reason: collision with root package name */
    public int f353641f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(pe3.f fVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f353640e = fVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f353639d = obj;
        this.f353641f |= Integer.MIN_VALUE;
        this.f353640e.P6(this);
        return pz5.a.f359186d;
    }
}
