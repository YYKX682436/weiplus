package ix5;

/* loaded from: classes16.dex */
public final class o extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f295661d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ix5.h f295662e;

    /* renamed from: f, reason: collision with root package name */
    public int f295663f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ix5.h hVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f295662e = hVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f295661d = obj;
        this.f295663f |= Integer.MIN_VALUE;
        return ix5.h.a(this.f295662e, null, this);
    }
}
