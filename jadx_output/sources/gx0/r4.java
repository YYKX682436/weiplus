package gx0;

/* loaded from: classes5.dex */
public final class r4 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f276912d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f276913e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gx0.x4 f276914f;

    /* renamed from: g, reason: collision with root package name */
    public int f276915g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4(gx0.x4 x4Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f276914f = x4Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f276913e = obj;
        this.f276915g |= Integer.MIN_VALUE;
        return this.f276914f.d5(false, this);
    }
}
