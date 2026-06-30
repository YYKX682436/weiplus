package kw1;

/* loaded from: classes14.dex */
public final class h extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f312840d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f312841e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kw1.k f312842f;

    /* renamed from: g, reason: collision with root package name */
    public int f312843g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(kw1.k kVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f312842f = kVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f312841e = obj;
        this.f312843g |= Integer.MIN_VALUE;
        return this.f312842f.a(this);
    }
}
