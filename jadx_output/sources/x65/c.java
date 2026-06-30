package x65;

/* loaded from: classes12.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f452341d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f452342e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f452343f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f452344g;

    /* renamed from: h, reason: collision with root package name */
    public int f452345h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f452346i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ x65.l f452347m;

    /* renamed from: n, reason: collision with root package name */
    public int f452348n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(x65.l lVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f452347m = lVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f452346i = obj;
        this.f452348n |= Integer.MIN_VALUE;
        return x65.l.c(this.f452347m, 0, this);
    }
}
