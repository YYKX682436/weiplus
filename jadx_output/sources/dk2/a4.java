package dk2;

/* loaded from: classes3.dex */
public final class a4 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public long f233171d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f233172e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk2.q4 f233173f;

    /* renamed from: g, reason: collision with root package name */
    public int f233174g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(dk2.q4 q4Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f233173f = q4Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f233172e = obj;
        this.f233174g |= Integer.MIN_VALUE;
        return this.f233173f.a(0L, null, 0L, null, 0, 0, 0, null, null, null, this);
    }
}
