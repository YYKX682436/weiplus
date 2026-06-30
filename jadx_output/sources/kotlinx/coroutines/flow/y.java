package kotlinx.coroutines.flow;

/* loaded from: classes14.dex */
public final class y extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f310453d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.z f310454e;

    /* renamed from: f, reason: collision with root package name */
    public int f310455f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(kotlinx.coroutines.flow.z zVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f310454e = zVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f310453d = obj;
        this.f310455f |= Integer.MIN_VALUE;
        return this.f310454e.emit(null, this);
    }
}
