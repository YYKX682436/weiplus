package mn0;

/* loaded from: classes10.dex */
public final class d extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f329706d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mn0.y f329707e;

    /* renamed from: f, reason: collision with root package name */
    public int f329708f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(mn0.y yVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f329707e = yVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f329706d = obj;
        this.f329708f |= Integer.MIN_VALUE;
        mn0.y.c(this.f329707e, null, this);
        return pz5.a.f359186d;
    }
}
