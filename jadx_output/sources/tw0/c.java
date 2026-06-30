package tw0;

/* loaded from: classes5.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f422419d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f422420e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f422421f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ tw0.i f422422g;

    /* renamed from: h, reason: collision with root package name */
    public int f422423h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(tw0.i iVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f422422g = iVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f422421f = obj;
        this.f422423h |= Integer.MIN_VALUE;
        return this.f422422g.c(null, null, null, this);
    }
}
