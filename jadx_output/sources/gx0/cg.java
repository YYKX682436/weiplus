package gx0;

/* loaded from: classes5.dex */
public final class cg extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f276299d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f276300e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f276301f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f276302g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ gx0.gg f276303h;

    /* renamed from: i, reason: collision with root package name */
    public int f276304i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cg(gx0.gg ggVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f276303h = ggVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f276302g = obj;
        this.f276304i |= Integer.MIN_VALUE;
        return this.f276303h.f7(null, null, this);
    }
}
