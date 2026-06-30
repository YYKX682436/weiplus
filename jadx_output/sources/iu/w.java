package iu;

/* loaded from: classes12.dex */
public final class w extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f294774d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f294775e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f294776f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f294777g;

    /* renamed from: h, reason: collision with root package name */
    public int f294778h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f294779i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ iu.z f294780m;

    /* renamed from: n, reason: collision with root package name */
    public int f294781n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(iu.z zVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f294780m = zVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f294779i = obj;
        this.f294781n |= Integer.MIN_VALUE;
        return this.f294780m.b(null, this);
    }
}
