package ko0;

/* loaded from: classes3.dex */
public final class e extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f309842d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f309843e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f309844f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f309845g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ko0.l f309846h;

    /* renamed from: i, reason: collision with root package name */
    public int f309847i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ko0.l lVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f309846h = lVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f309845g = obj;
        this.f309847i |= Integer.MIN_VALUE;
        return this.f309846h.a(null, this);
    }
}
