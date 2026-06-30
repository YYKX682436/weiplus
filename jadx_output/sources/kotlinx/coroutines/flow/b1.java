package kotlinx.coroutines.flow;

/* loaded from: classes14.dex */
public final class b1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f310204d;

    /* renamed from: e, reason: collision with root package name */
    public int f310205e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f310206f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.c1 f310207g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(kotlinx.coroutines.flow.c1 c1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f310207g = c1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f310204d = obj;
        this.f310205e |= Integer.MIN_VALUE;
        return this.f310207g.emit(null, this);
    }
}
