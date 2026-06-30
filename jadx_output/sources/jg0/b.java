package jg0;

/* loaded from: classes12.dex */
public final class b extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f299538d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f299539e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f299540f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ jg0.x f299541g;

    /* renamed from: h, reason: collision with root package name */
    public int f299542h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(jg0.x xVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f299541g = xVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f299540f = obj;
        this.f299542h |= Integer.MIN_VALUE;
        return jg0.x.u(this.f299541g, null, null, this);
    }
}
