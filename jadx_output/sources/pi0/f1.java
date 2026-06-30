package pi0;

/* loaded from: classes11.dex */
public final class f1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f354566d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f354567e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pi0.l1 f354568f;

    /* renamed from: g, reason: collision with root package name */
    public int f354569g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(pi0.l1 l1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f354568f = l1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f354567e = obj;
        this.f354569g |= Integer.MIN_VALUE;
        return this.f354568f.m(null, null, false, 0L, this);
    }
}
