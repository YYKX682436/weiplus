package gx0;

/* loaded from: classes5.dex */
public final class fa extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f276419d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f276420e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f276421f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f276422g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ gx0.ac f276423h;

    /* renamed from: i, reason: collision with root package name */
    public int f276424i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fa(gx0.ac acVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f276423h = acVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f276422g = obj;
        this.f276424i |= Integer.MIN_VALUE;
        return gx0.ac.Z7(this.f276423h, null, this);
    }
}
