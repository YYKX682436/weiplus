package mx0;

/* loaded from: classes5.dex */
public final class p extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f332201d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f332202e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mx0.s f332203f;

    /* renamed from: g, reason: collision with root package name */
    public int f332204g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(mx0.s sVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f332203f = sVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f332202e = obj;
        this.f332204g |= Integer.MIN_VALUE;
        return this.f332203f.a(null, null, this);
    }
}
