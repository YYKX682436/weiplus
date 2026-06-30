package zt;

/* loaded from: classes12.dex */
public final class i extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f475535d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f475536e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f475537f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f475538g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f475539h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f475540i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ zt.j f475541m;

    /* renamed from: n, reason: collision with root package name */
    public int f475542n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(zt.j jVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f475541m = jVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f475540i = obj;
        this.f475542n |= Integer.MIN_VALUE;
        return this.f475541m.i(null, null, this);
    }
}
