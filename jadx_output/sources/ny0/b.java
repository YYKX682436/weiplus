package ny0;

/* loaded from: classes5.dex */
public final class b extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f341384d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f341385e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ny0.d f341386f;

    /* renamed from: g, reason: collision with root package name */
    public int f341387g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ny0.d dVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f341386f = dVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f341385e = obj;
        this.f341387g |= Integer.MIN_VALUE;
        java.lang.Object e17 = this.f341386f.e(null, null, this);
        return e17 == pz5.a.f359186d ? e17 : kotlin.Result.m520boximpl(e17);
    }
}
