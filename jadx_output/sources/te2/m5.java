package te2;

/* loaded from: classes3.dex */
public final class m5 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f418226d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f418227e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ te2.p8 f418228f;

    /* renamed from: g, reason: collision with root package name */
    public int f418229g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5(te2.p8 p8Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f418228f = p8Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f418227e = obj;
        this.f418229g |= Integer.MIN_VALUE;
        return te2.p8.P6(this.f418228f, this);
    }
}
