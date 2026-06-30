package us2;

/* loaded from: classes5.dex */
public final class g extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f430482d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f430483e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ us2.u f430484f;

    /* renamed from: g, reason: collision with root package name */
    public int f430485g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(us2.u uVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f430484f = uVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f430483e = obj;
        this.f430485g |= Integer.MIN_VALUE;
        return this.f430484f.a(null, this);
    }
}
