package te5;

/* loaded from: classes9.dex */
public final class f1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f418637d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f418638e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ te5.l1 f418639f;

    /* renamed from: g, reason: collision with root package name */
    public int f418640g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(te5.l1 l1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f418639f = l1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f418638e = obj;
        this.f418640g |= Integer.MIN_VALUE;
        return this.f418639f.fj(null, null, 0, false, this);
    }
}
