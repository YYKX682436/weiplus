package mm2;

/* loaded from: classes3.dex */
public final class h2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f329106d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mm2.j2 f329107e;

    /* renamed from: f, reason: collision with root package name */
    public int f329108f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(mm2.j2 j2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f329107e = j2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f329106d = obj;
        this.f329108f |= Integer.MIN_VALUE;
        return this.f329107e.V6(null, false, this);
    }
}
