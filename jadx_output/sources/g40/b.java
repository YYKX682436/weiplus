package g40;

/* loaded from: classes12.dex */
public final class b extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f268661d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f268662e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f268663f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f268664g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f268665h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f268666i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g40.g f268667m;

    /* renamed from: n, reason: collision with root package name */
    public int f268668n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(g40.g gVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f268667m = gVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f268666i = obj;
        this.f268668n |= Integer.MIN_VALUE;
        return this.f268667m.e(null, null, null, false, false, this);
    }
}
