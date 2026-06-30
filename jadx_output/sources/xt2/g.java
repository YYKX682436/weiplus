package xt2;

/* loaded from: classes3.dex */
public final class g extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f456756d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xt2.m f456757e;

    /* renamed from: f, reason: collision with root package name */
    public int f456758f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(xt2.m mVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f456757e = mVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f456756d = obj;
        this.f456758f |= Integer.MIN_VALUE;
        return this.f456757e.o(null, null, this);
    }
}
