package ex0;

/* loaded from: classes5.dex */
public final class n extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f257149d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f257150e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f257151f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ex0.o f257152g;

    /* renamed from: h, reason: collision with root package name */
    public int f257153h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ex0.o oVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f257152g = oVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f257151f = obj;
        this.f257153h |= Integer.MIN_VALUE;
        return this.f257152g.G(this);
    }
}
