package vz0;

/* loaded from: classes14.dex */
public final class i extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f441606d;

    /* renamed from: e, reason: collision with root package name */
    public int f441607e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vz0.j f441608f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(vz0.j jVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f441608f = jVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f441606d = obj;
        this.f441607e |= Integer.MIN_VALUE;
        return this.f441608f.emit(null, this);
    }
}
