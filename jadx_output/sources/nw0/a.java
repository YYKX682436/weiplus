package nw0;

/* loaded from: classes5.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f340745d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f340746e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f340747f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nw0.h f340748g;

    /* renamed from: h, reason: collision with root package name */
    public int f340749h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(nw0.h hVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f340748g = hVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f340747f = obj;
        this.f340749h |= Integer.MIN_VALUE;
        return nw0.h.a(this.f340748g, null, null, this);
    }
}
