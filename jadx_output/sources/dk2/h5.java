package dk2;

/* loaded from: classes14.dex */
public final class h5 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f233563d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.i5 f233564e;

    /* renamed from: f, reason: collision with root package name */
    public int f233565f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(dk2.i5 i5Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f233564e = i5Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f233563d = obj;
        this.f233565f |= Integer.MIN_VALUE;
        return this.f233564e.a(null, this);
    }
}
