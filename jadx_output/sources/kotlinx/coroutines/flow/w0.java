package kotlinx.coroutines.flow;

/* loaded from: classes14.dex */
public final class w0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f310434d;

    /* renamed from: e, reason: collision with root package name */
    public int f310435e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.x0 f310436f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f310437g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(kotlinx.coroutines.flow.x0 x0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f310436f = x0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f310434d = obj;
        this.f310435e |= Integer.MIN_VALUE;
        return this.f310436f.a(null, this);
    }
}
