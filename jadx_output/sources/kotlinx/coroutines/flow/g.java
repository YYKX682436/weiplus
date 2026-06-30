package kotlinx.coroutines.flow;

/* loaded from: classes14.dex */
public final class g extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f310257d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.h f310258e;

    /* renamed from: f, reason: collision with root package name */
    public int f310259f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(kotlinx.coroutines.flow.h hVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f310258e = hVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f310257d = obj;
        this.f310259f |= Integer.MIN_VALUE;
        return this.f310258e.emit(null, this);
    }
}
