package mh2;

/* loaded from: classes10.dex */
public final class g extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f326352d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mh2.k f326353e;

    /* renamed from: f, reason: collision with root package name */
    public int f326354f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(mh2.k kVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f326353e = kVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f326352d = obj;
        this.f326354f |= Integer.MIN_VALUE;
        return this.f326353e.f(null, this);
    }
}
