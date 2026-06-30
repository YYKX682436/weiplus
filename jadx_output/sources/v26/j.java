package v26;

/* loaded from: classes5.dex */
public final class j extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f433010d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f433011e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f433012f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v26.k f433013g;

    /* renamed from: h, reason: collision with root package name */
    public int f433014h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(v26.k kVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f433013g = kVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f433012f = obj;
        this.f433014h |= Integer.MIN_VALUE;
        return this.f433013g.emit(null, this);
    }
}
