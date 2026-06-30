package kotlinx.coroutines.flow;

/* loaded from: classes14.dex */
public final class n0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f310331d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f310332e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.o0 f310333f;

    /* renamed from: g, reason: collision with root package name */
    public int f310334g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(kotlinx.coroutines.flow.o0 o0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f310333f = o0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f310332e = obj;
        this.f310334g |= Integer.MIN_VALUE;
        return this.f310333f.emit(null, this);
    }
}
