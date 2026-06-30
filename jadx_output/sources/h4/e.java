package h4;

/* loaded from: classes14.dex */
public final class e extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f278640d;

    /* renamed from: e, reason: collision with root package name */
    public int f278641e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h4.i f278642f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f278643g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f278644h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h4.i iVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f278642f = iVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f278640d = obj;
        this.f278641e |= Integer.MIN_VALUE;
        return this.f278642f.f(null, this);
    }
}
