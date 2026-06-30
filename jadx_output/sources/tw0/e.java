package tw0;

/* loaded from: classes5.dex */
public final class e extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f422425d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f422426e;

    /* renamed from: f, reason: collision with root package name */
    public int f422427f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f422428g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ tw0.i f422429h;

    /* renamed from: i, reason: collision with root package name */
    public int f422430i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(tw0.i iVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f422429h = iVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f422428g = obj;
        this.f422430i |= Integer.MIN_VALUE;
        return tw0.i.a(this.f422429h, null, 0, this);
    }
}
