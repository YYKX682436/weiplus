package i21;

/* loaded from: classes11.dex */
public final class j extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f287897d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f287898e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i21.n f287899f;

    /* renamed from: g, reason: collision with root package name */
    public int f287900g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i21.n nVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f287899f = nVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f287898e = obj;
        this.f287900g |= Integer.MIN_VALUE;
        return i21.n.a(this.f287899f, null, 0, this);
    }
}
