package dk2;

/* loaded from: classes3.dex */
public final class h3 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f233556d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f233557e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f233558f;

    /* renamed from: g, reason: collision with root package name */
    public int f233559g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(dk2.r4 r4Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f233558f = r4Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f233557e = obj;
        this.f233559g |= Integer.MIN_VALUE;
        return this.f233558f.n0(null, null, this);
    }
}
