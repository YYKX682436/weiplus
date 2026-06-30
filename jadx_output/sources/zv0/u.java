package zv0;

/* loaded from: classes5.dex */
public final class u extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f476228d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f476229e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f476230f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zv0.y f476231g;

    /* renamed from: h, reason: collision with root package name */
    public int f476232h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(zv0.y yVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f476231g = yVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f476230f = obj;
        this.f476232h |= Integer.MIN_VALUE;
        return this.f476231g.c(null, this);
    }
}
