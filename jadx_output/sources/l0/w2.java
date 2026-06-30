package l0;

/* loaded from: classes14.dex */
public final class w2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f314581d;

    /* renamed from: e, reason: collision with root package name */
    public int f314582e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l0.x2 f314583f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(l0.x2 x2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f314583f = x2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f314581d = obj;
        this.f314582e |= Integer.MIN_VALUE;
        return this.f314583f.emit(null, this);
    }
}
