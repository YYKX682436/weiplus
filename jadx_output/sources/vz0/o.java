package vz0;

/* loaded from: classes14.dex */
public final class o extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f441615d;

    /* renamed from: e, reason: collision with root package name */
    public int f441616e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vz0.p f441617f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(vz0.p pVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f441617f = pVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f441615d = obj;
        this.f441616e |= Integer.MIN_VALUE;
        return this.f441617f.emit(null, this);
    }
}
