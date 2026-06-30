package sf2;

/* loaded from: classes10.dex */
public final class m0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f407199d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sf2.e1 f407200e;

    /* renamed from: f, reason: collision with root package name */
    public int f407201f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(sf2.e1 e1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f407200e = e1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f407199d = obj;
        this.f407201f |= Integer.MIN_VALUE;
        return this.f407200e.d7(null, this);
    }
}
