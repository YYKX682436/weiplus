package mh2;

/* loaded from: classes10.dex */
public final class f extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f326323d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mh2.k f326324e;

    /* renamed from: f, reason: collision with root package name */
    public int f326325f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(mh2.k kVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f326324e = kVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f326323d = obj;
        this.f326325f |= Integer.MIN_VALUE;
        return this.f326324e.e(null, this);
    }
}
