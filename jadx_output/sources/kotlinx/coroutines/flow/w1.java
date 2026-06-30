package kotlinx.coroutines.flow;

/* loaded from: classes11.dex */
public final class w1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f310438d;

    /* renamed from: e, reason: collision with root package name */
    public int f310439e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.x1 f310440f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f310441g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f310442h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(kotlinx.coroutines.flow.x1 x1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f310440f = x1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f310438d = obj;
        this.f310439e |= Integer.MIN_VALUE;
        return this.f310440f.emit(null, this);
    }
}
