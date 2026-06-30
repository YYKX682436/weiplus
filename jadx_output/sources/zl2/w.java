package zl2;

/* loaded from: classes3.dex */
public final class w extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f474006d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f474007e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f474008f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zl2.b0 f474009g;

    /* renamed from: h, reason: collision with root package name */
    public int f474010h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(zl2.b0 b0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f474009g = b0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f474008f = obj;
        this.f474010h |= Integer.MIN_VALUE;
        return this.f474009g.h(null, null, 0L, null, 0, false, this);
    }
}
